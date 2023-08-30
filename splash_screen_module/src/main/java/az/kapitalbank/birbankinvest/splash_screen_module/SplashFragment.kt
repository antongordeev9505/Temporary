package az.kapitalbank.birbankinvest.splash_screen_module

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import az.kapitalbank.birbankinvest.R
import az.kapitalbank.birbankinvest.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : Fragment() {

    private val LOADING_DELAY = 5000L // loading simulation

    private val SHOW_PROGRESS_DELAY = 3000L // Delay to display the progress bar

    private lateinit var progressBar: ProgressBar
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBar = binding.splashLoader


        val connectivityManager =
            requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (isNetworkAvailable(connectivityManager)) {
            coroutineScope.launch {
                val loadingJob = launch { startLoadingProcess() }
                delay(SHOW_PROGRESS_DELAY)
                if (loadingJob.isActive) {
                    progressBar.visibility = View.VISIBLE
                }
            }
        }else {
            showToast("Check your network connection")
        }
    }

    private suspend fun startLoadingProcess() {
        //load different data, initialise app
        delay(LOADING_DELAY)
        navigateToNextScreen()
    }

    private fun navigateToNextScreen() {
        findNavController().navigate(R.id.action_splashFragment_to_onboardingFragmentContainer2)
    }

    private fun isNetworkAvailable(connectivityManager: ConnectivityManager): Boolean {
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).apply {
            setGravity(Gravity.TOP, 0, 0)
            show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        coroutineScope.cancel()
    }
}