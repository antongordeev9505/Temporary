package az.kapitalbank.birbankinvest.component_manager.callbacks

import android.app.Application

interface LifecycleListener {
    fun addLifecycleListener(app: Application, removeCallback: RemoveComponentCallback)
}