package ru.mokita.wsrfoood.ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mokita.wsrfoood.R
import ru.mokita.wsrfoood.databinding.FragmentOnBoardingBinding
import ru.mokita.wsrfoood.ui.onBoarding.adapter.OnBoardingAdapter
import ru.mokita.wsrfoood.ui.onBoarding.onBoardingFirst.OnBoardingFirstFragment

class OnBoardingFragment : Fragment() {

    private var _binding: FragmentOnBoardingBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpOnBoarding.adapter = OnBoardingAdapter(requireActivity())
        binding.dotsIndicator.attachTo(binding.vpOnBoarding)
    }
}