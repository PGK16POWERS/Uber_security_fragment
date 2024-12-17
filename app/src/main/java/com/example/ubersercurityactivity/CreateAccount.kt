package com.example.ubersercurityactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class CreateAccount : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_create_account, container, false);

        val createAccountButton = view.findViewById<Button>(R.id.create_account_button);

        createAccountButton.setOnClickListener{ view ->
            findNavController().navigate(R.id.login)
        }

        return view;
    }

}