package com.example.loginreg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class LoginFragment : Fragment() {

    private val userName = "roku"
    private val passWord = "123"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val btnSignUp = view.findViewById<Button>(R.id.btnSignUp)

        val un = view.findViewById<EditText>(R.id.etUsername)
        val pw = view.findViewById<EditText>(R.id.etPassword)

        btnLogin.setOnClickListener {
            checkCredentials(un.text.toString(), pw.text.toString())
        }

        btnSignUp.setOnClickListener {
            (activity as MainActivity).showSignupFragment()
        }

        return view
    }

    private fun checkCredentials(un: String, pw: String) {
        if (un == userName && pw == passWord) {
            (activity as MainActivity).showHomeFragment()
        }
    }
}


