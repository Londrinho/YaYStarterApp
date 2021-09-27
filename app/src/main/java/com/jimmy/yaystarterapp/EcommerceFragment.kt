package com.jimmy.yaystarterapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jimmy.yaystarterapp.databinding.FragmentEcommerceBinding


class EcommerceFragment : Fragment() {

    private var _binding: FragmentEcommerceBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentEcommerceBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


}