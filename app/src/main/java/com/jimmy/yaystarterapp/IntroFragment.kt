package com.jimmy.yaystarterapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jimmy.yaystarterapp.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private var _binding: FragmentIntroBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ecommerceBtn.setOnClickListener { findNavController().navigate(R.id.action_introFragment_to_ecommerceFragment) }

        binding.elearningBtn.setOnClickListener { findNavController().navigate(R.id.action_introFragment_to_elearningFragment)  }

        binding.fintechBtn.setOnClickListener { findNavController().navigate(R.id.action_introFragment_to_fintechFragment) }


    }
}