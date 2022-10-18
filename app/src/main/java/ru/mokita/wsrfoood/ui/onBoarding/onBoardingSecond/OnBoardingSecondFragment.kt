package ru.mokita.wsrfoood.ui.onBoarding.onBoardingSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.mokita.wsrfoood.R
import ru.mokita.wsrfoood.databinding.FragmentOnBoardingBinding
import ru.mokita.wsrfoood.databinding.FragmentOnBoardingSecondBinding


class OnBoardingSecondFragment : Fragment() {

    private var _binding: FragmentOnBoardingSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnBoardingSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_onBoarding1Fragment_to_signInFragment)
        }

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_onBoarding1Fragment_to_signUpFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}