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
import com.nanda.doadandzikir.databinding.ActivityHarianDzikirDoaBinding

class HarianDzikirDoaActivity : AppCompatActivity() {


    private val listDzikir: ArrayList<DzikirDoa> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzikir_doa)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvDzikirDoaHarian = findViewById<RecyclerView>(R.id.rv_dzikir_doa_harian)
        rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
        rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDzikir)

        initData()

    }
    private fun initData(){
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahan = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices){
            val dzikir = DzikirDoa(
                desc[data],
                lafaz[data],
                terjemahan[data]
            )
            listDzikir.add(dzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}