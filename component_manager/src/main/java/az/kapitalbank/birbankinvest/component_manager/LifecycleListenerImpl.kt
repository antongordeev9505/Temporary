package az.kapitalbank.birbankinvest.component_manager

import android.app.Application
import az.kapitalbank.birbankinvest.component_manager.callbacks.LifecycleListener
import az.kapitalbank.birbankinvest.component_manager.callbacks.RemoveComponentCallback

internal class LifecycleListenerImpl : LifecycleListener {
    override fun addLifecycleListener(app: Application, removeCallback: RemoveComponentCallback) {
        app.registerActivityLifecycleCallbacks(ActivityLifecycleHelper(removeCallback))
    }
}