package com.example.loginreg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, LoginFragment())
            .commit()
    }

    fun showSignupFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, SignupFragment())
            .addToBackStack(null)
            .commit()
    }

    fun showHomeFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, HomeFragment())
            .addToBackStack(null)
            .commit()
    }

    fun showLoginFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, LoginFragment())
            .addToBackStack(null)
            .commit()
    }
}

