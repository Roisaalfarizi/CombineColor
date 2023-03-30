package com.example.combinecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.example.combinecolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { CombineColor() }
    }
    private fun CombineColor() {
        val warna1 = binding.Warna1.text.toString()
        if(TextUtils.isEmpty(warna1)){
            Toast.makeText(this, R.string.Warna1_invalid,Toast.LENGTH_LONG).show()
            return
        }else if(TextUtils.isDigitsOnly(warna1)){
            Toast.makeText(this, R.string.inputNumber,Toast.LENGTH_LONG).show()
            return
        }



        val warna2 = binding.Warna2.text.toString()
        if(TextUtils.isEmpty(warna1)){
            Toast.makeText(this, R.string.Warna2_invalid,Toast.LENGTH_LONG).show()
            return
        }else if(TextUtils.isDigitsOnly(warna1)){
            Toast.makeText(this, R.string.inputNumber,Toast.LENGTH_LONG).show()
            return
        }
        else if(TextUtils.isDigitsOnly(warna1)){
            Toast.makeText(this, R.string.inputNumber,Toast.LENGTH_LONG).show()
            return
        } else if (warna1 != "Merah" || warna1 != "Kuning" || warna1 != "Hijau" || warna1 != "Ungu" || warna1 != "Biru" ){
            binding.Hasil.text = getString(R.string.warnaEmpty1)


        }else if (warna2 != "Merah" || warna2 != "Kuning" || warna2 != "Hijau" || warna2 != "Ungu" || warna2 != "Biru" ){
            binding.Hasil.text = getString(R.string.warnaEmpty2)

        }else if(warna1 == "Merah" && warna2 == "Hijau"|| warna1 == "Hijau" && warna2 == "Merah"){
          binding.Hasil.text = getString(R.string.Coklat)
      }else if(warna1 == "Merah" && warna2 == "Biru"|| warna1 == "Biru" && warna2 == "Merah"){
          binding.Hasil.text = getString(R.string.Ungu)
      }else if(warna1 == "Merah" && warna2 == "Ungu"|| warna1 == "Ungu" && warna2 == "Merah"){
          binding.Hasil.text = getString(R.string.Pink)
      }else if(warna1 == "Kuning" && warna2 == "Hijau"|| warna1 == "Hijau" && warna2 == "Kuning"){
          binding.Hasil.text = getString(R.string.Hijau_muda)
      }else if(warna1 == "Kuning" && warna2 == "Biru"|| warna1 == "Biru" && warna2 == "Kuning"){
          binding.Hasil.text = getString(R.string.Hijau)
      }else if(warna1 == "Kuning" && warna2 == "Ungu"|| warna1 == "Ungu" && warna2 == "Kuning"){
          binding.Hasil.text = getString(R.string.Krem)
      }else if(warna1 == "Hijau" && warna2 == "Biru"|| warna1 == "Biru" && warna2 == "Hijau"){
          binding.Hasil.text = getString(R.string.Hijau_muda)
      }else if(warna1 == "Hijau" && warna2 == "Ungu"|| warna1 == "Ungu" && warna2 == "Hijau"){
          binding.Hasil.text = getString(R.string.Abu)
      }else if(warna1 == "Biru" && warna2 == "Ungu"|| warna1 == "Ungu" && warna2 == "Biru"){
          binding.Hasil.text = getString(R.string.Biru_tua)
      }
    }
}