package com.adnan.bph.database

import com.adnan.bph.R
import com.adnan.bph.model.ListModel

object Data {
    private val database = arrayOf(
        arrayOf(
            "Rizky Samjaya Putra",
            "2023/2024",
            "Ketua Umum",
            "Ketua Umum memiliki tanggung jawab untuk Memimpin organisasi dengan baik dan bijaksana. Mengkoordinasi semua rapat pengurus. Menetapkan kebijaksanaan yang telah dipersiapkan dan direncanakan dalam keputusan bersama mengambil keputusan dan mengawasi keseluruhan progja himpunan menjadi muka terdepan di himpunan",
         R.drawable.kiki
        ),
        arrayOf(
            "Dito Anwar",
            "2023/2024",
            "Sekertaris Umum",
            "Sekertaris Umum memeliki tanggung jawab untuk pengarsipan seluruh document himpunan mahasiswa Teknik informatika IIB darmajaya secara umum , Melakukan proses administrasi himpunan mahasiswa Teknik informatika , Mengkolektif laporan pertanggung jawaban bidang dan kegiatan Himpunan mahasiswa Teknik informatika IIB Darmajaya",
          R.drawable.dito
        ),
        arrayOf(
            "Zahra Putri. A",
            "2023/2024",
            "Bendahara Umum",
            "Bendahara Umum memiliki tanggung jawab untuk Bertanggung jawab atas pengelolaan keuangan organisasi, membuat kebijakan keuangan. Mengontrol pengelolaan dana dan distribusinya pada setiap kegiatan.Menyimpan tanda bukti transaksi dan membuat rincian uang keluar masuk setiap event Menyimpan dan mengelola uang kas seluruh anggota Memberikan pertanggung jawaban berupa laporan keuangan pada akhir periode kepengurusan kepada seluruh anggota",
          R.drawable.zahra
        ),
        arrayOf(
            "Monika Prastiwi",
            "2023/2024",
            "Kepala Divisi Infokom",
            "Kepala Divisi Infokom memiliki tanggung jawab sebagai penghubung antara ketua umum dengan kepala Bidang Ilmu Pengetahuan dan Komunikasi, dan Bidang Hubungan Masyarakat. Dan mengecek hasil kinerja dari 2 kepala bidang tersebut",
          R.drawable.monika
        ),
        arrayOf(
            "Syifa Rahma Nisa",
            "2023/2024",
            "Kepala Divisi PSDM",
            "Kepala Divisi PSDM memiliki tanggung jawab untuk : Meningkatkan sumber daya mahasiswa menjadi lebih kreatif dan professional Melakukan koordinas, pengawasan serta evaluasi terhadap kepala bidang yang dinaungu Mengontrol kinerja kepala bidang yang dinaungi",
           R.drawable.syifa

        ),
        arrayOf(
            "Gusnanda Oskar",
            "2023/2024",
            "Kepala Bidang IPTEK",
            "Kepala Bidang IPTEK Bertanggung jawab atas ilmu pengetahuan dan teknologi dengan melakukan study club, juga bertanggung jawab atas event yang berkaitan ilmu pengetahuan teknologi dan juga event Esport yaitu it Esport.",
           R.drawable.nanda
        ),
        arrayOf(
            "Haeycell G. Wobisono",
            "2023/2024",
            "Kepala Bidang Humas",
            "Kepala Bidang Danus memiliki tanggung jawab untuk Perencanaan Dan Pengelolaan Dana Mengelolan keuangan organisasi dengan mengembangkan kompetensi technopreneur Pengambilan keputusan strategis terkait keuangan Mengelolah keuangan organisasi,termasuk pendapatan dan pengeluaran dana",
          R.drawable.hecel
        ),
        arrayOf(
            "Nadia Permatasari",
            "2023/2024",
            "Kepala Bidang Danus",
            "Kepala Bidang Danus memiliki tanggung jawab untuk Perencanaan Dan Pengelolaan Dana Mengelolan keuangan organisasi dengan mengembangkan kompetensi technopreneur Pengambilan keputusan strategis terkait keuangan Mengelolah keuangan organisasi,termasuk pendapatan dan pengeluaran dana",
         R.drawable.nadia
        ),
        arrayOf(
            "Daniel Gunawan",
            "2023/2024",
            "Kepala Bidang Kaderisasi",
            "Kepala Bidang Kaderisasi di dalam Himpunan Kampus merujuk pada proses pengembangan dan pelatihan anggota baru agar dapat aktif dan berperan dalam organisasi tersebut. Ini melibatkan transfer pengetahuan, keterampilan, dan nilai-nilai organisasi kepada anggota baru untuk memperkuat identitas dan tujuan bersama.",
          R.drawable.daniel
        ),
        arrayOf(
            "Alhimi Rusdy",
            "2023/2024",
            "Sekertaris Bidang IPTEK",
            "Sekertaris Bidang IPTEK memiliki tanggung jawab untuk membantu pekerjaan dan juga tanggung jawab kepala bidang IPTEK untuk menjalankan program kerja seperti study Club, IT Esport dan juga membantu administrasi pembuatan proposal acara juga laporan pertanggung jawaban dari satu periode",
            R.drawable.rusdy
        )

    )

    val listData: ArrayList<ListModel>
        get(){
            val list = ArrayList<ListModel>()
            for (data in database) {
                val listModel = ListModel()
                listModel.nama = data[0] as String
                listModel.tahun = data[1] as String
                listModel.jabatan = data[2] as String
                listModel.bio = data[3] as String
                listModel.pic = data[4] as Int


                list.add(listModel)
            }
            return list
        }
}