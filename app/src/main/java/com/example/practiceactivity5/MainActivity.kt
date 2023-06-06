package com.example.practiceactivity5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceactivity5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContactDetails.setOnClickListener {
            val myIntent = Intent(this, ContactDetailsActivity::class.java)
            myIntent.putExtra("detailName",binding.edtTextName.text.toString())
            myIntent.putExtra("detailPhone",binding.editTextPhoneNumber.text.toString())
            myIntent.putExtra("detailEmail",binding.editTextEmail.text.toString())
            myIntent.putExtra("detailAddress",binding.editTextAddress.text.toString())
            myIntent.putExtra("detailCity",binding.editTextCity.text.toString())
            myIntent.putExtra("detailZipCode",binding.editTextZipCode.text.toString())
            myIntent.putExtra("detailCountry",binding.editTextCountry.text.toString())
            myIntent.putExtra("detailOrganization",binding.editTextOrganization.text.toString())
            myIntent.putExtra("detailProfession",binding.editTextProfession.text.toString())
            startActivity(myIntent)
            finish()
        }
    }
}