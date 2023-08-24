package az.kapitalbank.birbankinvest.component_manager.callbacks

interface RemoveComponentCallback {
    /**
     * This method notifies the store to destroy the component with the given [key].
     */
    fun onRemove(key: String)
}