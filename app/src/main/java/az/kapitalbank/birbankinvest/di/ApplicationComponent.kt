package az.kapitalbank.birbankinvest.di

import androidx.core.view.KeyEventDispatcher
import az.kapitalbank.birbankinvest.Application
import com.example.birbankinvest.di.DaggerApplicationComponent
import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(application: Application)

    @KeyEventDispatcher.Component.Factory
    interface Factory {
        fun create(): ApplicationComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): ApplicationComponent = DaggerApplicationComponent
                .factory()
                .create()
        }
    }
}