package ru.mokita.wsrfoood.ui.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.mokita.wsrfoood.R
import ru.mokita.wsrfoood.databinding.FragmentSignInBinding
import ru.mokita.wsrfoood.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         binding.btnCancel.setOnClickListener {
             findNavController().popBackStack()
         }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}