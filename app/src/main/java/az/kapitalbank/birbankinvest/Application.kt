package az.kapitalbank.birbankinvest

import android.app.Application
import az.kapitalbank.birbankinvest.component_manager.HasComponent
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager
import az.kapitalbank.birbankinvest.di.ApplicationComponent

class Application : Application(), HasComponent<ApplicationComponent> {

    override fun onCreate() {
        super.onCreate()
        XInjectionManager.init(this)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
    }

    override fun getComponent() = ApplicationComponent.Initializer.init()
}