package az.kapitalbank.splash_screen_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import az.kapitalbank.splash_screen_module.databinding.FragmentOnboardingContainerBinding

class OnboardingFragmentContainer : Fragment(){

    private lateinit var binding: FragmentOnboardingContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingContainerBinding.inflate(inflater, container, false)
        return binding.root
    }
}