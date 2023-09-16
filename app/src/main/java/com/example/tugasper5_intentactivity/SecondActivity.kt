package com.example.tugasper5_intentactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.tugasper5_intentactivity.MainActivity.Companion.EXTRA_EMAIL
import com.example.tugasper5_intentactivity.MainActivity.Companion.EXTRA_NAME
import com.example.tugasper5_intentactivity.MainActivity.Companion.EXTRA_NO
import com.example.tugasper5_intentactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val no_hp = intent.getStringExtra(EXTRA_NO)
        with(binding) {
            txtName.text = "Welcome $name"
            txtEmail.text = "Your $email has been activated"
            txtPhone.text = "Your $no_hp has been registered"

            btnKeluar.setOnClickListener {
                val intent = Intent(this@SecondActivity,MainActivity::class.java )

                setResult(Activity.RESULT_OK,intent)
                finish()
            }


        }




    }
}