package az.kapitalbank.birbankinvest.component_manager

import android.app.Application
import az.kapitalbank.birbankinvest.component_manager.callbacks.LifecycleListener
import az.kapitalbank.birbankinvest.component_manager.callbacks.RemoveComponentCallback


internal class ComponentsController(
    private val componentsStore: ComponentsStore,
    private val platformLifecycleCallbacks: LifecycleListener
) : RemoveComponentCallback {

    override fun onRemove(key: String) {
        componentsStore.remove(key)
    }

    fun addLifecycleCallbackListeners(app: Application) {
        platformLifecycleCallbacks.addLifecycleListener(app, this)
    }

    fun <T> bindComponent(owner: HasComponent<T>) = buildOrCreateComponent(owner)

    @Suppress("UNCHECKED_CAST")
    private fun <T> buildOrCreateComponent(owner: HasComponent<T>): T {
        with(owner.getComponentKey()) {
            if (componentsStore.isExist(this)) {
                return componentsStore.get(this) as T
            }
            return owner.getComponent().also { componentsStore.add(this, it as Any) }
        }
    }
}