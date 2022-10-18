package ru.mokita.wsrfoood.ui.onBoarding.onBoardingFirst

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mokita.wsrfoood.R
import ru.mokita.wsrfoood.databinding.FragmentOnBoardingFirstBinding
import ru.mokita.wsrfoood.databinding.FragmentOnBoardingSecondBinding


class OnBoardingFirstFragment : Fragment() {
    private var _binding: FragmentOnBoardingFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnBoardingFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}