package az.kapitalbank.birbankinvest.component_manager

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import az.kapitalbank.birbankinvest.component_manager.callbacks.RemoveComponentCallback

internal class ActivityLifecycleHelper(
    private val removeComponentCallback: RemoveComponentCallback
) : Application.ActivityLifecycleCallbacks {

    override fun onActivityPaused(activity: Activity) {}

    override fun onActivityResumed(activity: Activity) {}

    override fun onActivityStarted(activity: Activity) {}

    override fun onActivityDestroyed(activity: Activity) {
        if (activity is HasComponent<*> && activity.isFinishing) {
            removeComponentCallback.onRemove(activity.getComponentKey())
        }
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}

    override fun onActivityStopped(activity: Activity) {}

    override fun onActivityCreated(activity: Activity, outState: Bundle?) {
        if (activity is FragmentActivity) {
            activity.supportFragmentManager.registerFragmentLifecycleCallbacks(
                FragmentLifecycleHelper(removeComponentCallback),
                true
            )
        }
    }
}