package com.example.tugasper5_intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasper5_intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG ="MainActivityLifecycle"

    private lateinit var binding : ActivityMainBinding

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NO = "extra_phone"
        const val EXTRA_EMAIL = "extra_email"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnDaftar.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)

                val name = txtName.text.toString()
                val email = txtEmail.text.toString()
                val phone = txtPhone.text.toString()

                intentToSecondActivity.putExtra(EXTRA_NAME, name)
                intentToSecondActivity.putExtra(EXTRA_EMAIL, email)
                intentToSecondActivity.putExtra(EXTRA_NO, phone)

                startActivity(intentToSecondActivity)

            }
        }
    }
}