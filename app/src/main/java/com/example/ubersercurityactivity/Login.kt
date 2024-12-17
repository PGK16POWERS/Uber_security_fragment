package com.example.ubersercurityactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false);

        val loginButton = view.findViewById<Button>(R.id.login_button);

        loginButton.setOnClickListener{ view ->
            findNavController().navigate(R.id.createAccount)
        }

        return view;
    }

}