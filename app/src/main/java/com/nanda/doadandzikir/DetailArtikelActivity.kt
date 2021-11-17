package com.nanda.doadandzikir

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.sql.DatabaseMetaData

class DetailArtikelActivity : AppCompatActivity() {

    companion object{
        const val DATA_TITLE = "title"
        const val DATA_DESC = "data"
        const val DATA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_artikel)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islami"

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle : TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle

        val tvDesc : TextView = findViewById(R.id.tv_detail_desc)
        tvDesc.text = dataDesc

        val imageArtikel : ImageView = findViewById(R.id.img_detail)
            imageArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}