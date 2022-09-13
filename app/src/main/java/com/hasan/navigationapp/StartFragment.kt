package com.hasan.navigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hasan.navigationapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(inflater,container,false)


        binding.joinNowButton.setOnClickListener {
            //When the join now button is clicked, navigation with nested graph goes from startFragment
            findNavController().navigate(R.id.action_startFragment_to_navigation)
        }
        return binding.root
    }
}