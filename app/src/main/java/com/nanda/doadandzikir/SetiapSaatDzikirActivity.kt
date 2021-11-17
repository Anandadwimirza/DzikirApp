package com.nanda.doadandzikir

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nanda.doadandzikir.databinding.ActivitySetiapSaatDzikirBinding

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvSetiapSaatDzikirActivity = findViewById<RecyclerView>(R.id.rv_dzikir_setiap_saat)
        rvSetiapSaatDzikirActivity.layoutManager = LinearLayoutManager(this)
        rvSetiapSaatDzikirActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}