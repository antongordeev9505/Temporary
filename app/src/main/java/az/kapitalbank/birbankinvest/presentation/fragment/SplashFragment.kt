package az.kapitalbank.birbankinvest.presentation.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager
import az.kapitalbank.birbankinvest.core.BaseFragment
import az.kapitalbank.birbankinvest.databinding.FragmentSplashBinding
import az.kapitalbank.birbankinvest.di.splash.SplashComponent
import az.kapitalbank.birbankinvest.presentation.viewmodel.SplashViewModel
import javax.inject.Inject

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SplashViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        XInjectionManager
            .findComponent<SplashComponent>()
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: Put this piece of code to the appropriate place (checking some parametres and navigation)
        viewModel.navigateFromSplashScreen(requireActivity())
    }
}