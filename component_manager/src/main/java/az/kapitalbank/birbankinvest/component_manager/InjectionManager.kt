package az.kapitalbank.birbankinvest.component_manager

import android.app.Application
import az.kapitalbank.birbankinvest.component_manager.callbacks.LifecycleListener

class InjectionManager(lifecycleListener: LifecycleListener) {

    private val componentsStore = ComponentsStore()

    private val componentsController: ComponentsController

    init {
        componentsController =
            ComponentsController(componentsStore, lifecycleListener)
    }

    /**
     * Adds the lifecycle callbacks listeners
     */
    fun init(app: Application) {
        componentsController.addLifecycleCallbackListeners(app)
    }

    /**
     * Returns the created or saved component and binds it the [owner]'s lifecycle, so
     * when the [owner] is destroyed, the component will be destroyed too.
     */
    fun <T> bindComponent(owner: HasComponent<T>): T = componentsController.bindComponent(owner)

    /**
     * Finds the component by the given class
     */
    inline fun <reified T> findComponent(): T {
        val predicate = object : (Any) -> Boolean {
            override fun invoke(component: Any): Boolean = component is T

            override fun toString(): String = T::class.java.simpleName
        }
        return findComponent(predicate) as T
    }

    /**
     * Finds the component by the given class.
     * Returns null if component was not found.
     */
    inline fun <reified T> findComponentOrNull(): T? {
        val predicate = object : (Any) -> Boolean {
            override fun invoke(component: Any): Boolean = component is T

            override fun toString(): String = T::class.java.simpleName
        }
        return findComponentOrNull(predicate) as? T
    }

    /**
     * Finds the component by [predicate]
     */
    fun findComponent(predicate: (Any) -> Boolean): Any =
        componentsStore.findComponent(predicate)
            ?: throw ComponentNotFoundException(predicate.toString())

    /**
     * Finds the component by [predicate].
     * Returns null if component was not found.
     */
    fun findComponentOrNull(predicate: (Any) -> Boolean): Any? =
        componentsStore.findComponent(predicate)
}