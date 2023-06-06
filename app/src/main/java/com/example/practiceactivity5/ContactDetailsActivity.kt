package com.example.practiceactivity5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity5.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtName.text = intent.getStringExtra("detailName")
        binding.txtPhoneNumber.text = intent.getStringExtra("detailPhone")
        binding.txtEmail.text = intent.getStringExtra("detailEmail")
        binding.txtAddress.text = intent.getStringExtra("detailAddress")
        binding.txtCity.text = intent.getStringExtra("detailCity")
        binding.txtZipCode.text = intent.getStringExtra("detailZipCode")
        binding.txtCountry.text = intent.getStringExtra("detailCountry")
        binding.txtOrganization.text = intent.getStringExtra("detailOrganization")
        binding.txtProfessional.text = intent.getStringExtra("detailProfession")

        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnBack.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}