package com.adnan.bph.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.adnan.bph.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_JABATAN = "extra_jabatan"
        const val EXTRA_PROFILE = "extra_profile"
        const val EXTRA_BIO = "extra_bio"
//        const val EXTRA_LINK = "extra_link"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNamaLengkap: TextView = findViewById(R.id.nam_leng)
        val tvTahunKepengurusan: TextView = findViewById(R.id.th_kep)
        val tvJabatan: TextView = findViewById(R.id.jabatan)
        val imgProfile: ImageView = findViewById(R.id.profile)
        val tvBio: TextView = findViewById(R.id.bio_des)
//        val igButton: Button = findViewById(R.id.ig_button)

        val namaLengkap = intent.getStringExtra(EXTRA_NAMA)
        val tahunKepengurusan = intent.getStringExtra(EXTRA_TAHUN)
        val jabatan = intent.getStringExtra(EXTRA_JABATAN)
        val profile = intent.getIntExtra(EXTRA_PROFILE, 0)
        val bio = intent.getStringExtra(EXTRA_BIO)

        tvNamaLengkap.text = namaLengkap
        tvTahunKepengurusan.text = tahunKepengurusan
        tvJabatan.text = jabatan
        tvBio.text = bio
        Glide.with(this)
            .load(profile)
            .apply(RequestOptions())
            .into(imgProfile)




//        igButton.setOnClickListener {
//            val goShare = Intent()
//            goShare.action = Intent.ACTION_SEND
//            goShare.putExtra(Intent.EXTRA_TEXT, "Kunjungi Instagram $instagram")
//            goShare.type = "text/plain"
//            startActivity(Intent.createChooser(goShare, "Share To:"))
//        }
    }
}