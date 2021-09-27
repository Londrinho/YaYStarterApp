package com.jimmy.yaystarterapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jimmy.yaystarterapp.databinding.FragmentElearningBinding

class ElearningFragment : Fragment() {

    private var _binding: FragmentElearningBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentElearningBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}