package az.kapitalbank.birbankinvest.component_manager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import az.kapitalbank.birbankinvest.component_manager.callbacks.RemoveComponentCallback

internal class FragmentLifecycleHelper(
    private val removeComponentCallback: RemoveComponentCallback
) : FragmentManager.FragmentLifecycleCallbacks() {

    override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
        super.onFragmentDestroyed(fm, f)
        if (f !is HasComponent<*>) return

        if (f.requireActivity().isFinishing) {
            removeComponentCallback.onRemove(f.getComponentKey())
            return
        }

        if (f.isStateSaved) {
            return
        }

        var anyParentIsRemoving = false
        var parent = f.parentFragment
        while (!anyParentIsRemoving && parent != null) {
            anyParentIsRemoving = parent.isRemoving && !parent.isStateSaved
            parent = parent.parentFragment
        }
        if (f.isRemoving || anyParentIsRemoving) {
            removeComponentCallback.onRemove(f.getComponentKey())
        }
    }
}