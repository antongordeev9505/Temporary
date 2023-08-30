package az.kapitalbank.birbankinvest.component_manager

interface HasComponent<out T> {
    /**
     * Returns the component that will be saved in the store.
     */
    fun getComponent(): T

    /**
     * Return the key, this key identifies the component in the store.
     * The key must be unique for every component.
     */
    fun getComponentKey(): String = javaClass.toString()
}