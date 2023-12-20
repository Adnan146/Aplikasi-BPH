package com.adnan.bph.database

import com.adnan.bph.R
import com.adnan.bph.model.ListModel

object Data {
    private val database = arrayOf(
        arrayOf(
            "Rizky Samjaya Putra",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Ketua Umum",
            R.drawable.kiki,
            "https://www.instagram.com/justkyy24/"
        ),
        arrayOf(
            "Dito Anwar",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Sekertaris Umum",
            R.drawable.dito,
            "https://www.instagram.com/_dtoanwar/"
        ),
        arrayOf(
            "Zahra Putri. A",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Bendahara Umum",
            R.drawable.zahra,
            "https://www.instagram.com/ssyfaz._/"
        ),
        arrayOf(
            "Monika Prastiwi",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Divisi Infokom",
            R.drawable.monika,
            "https://www.instagram.com/monikprz_/"
        ),
        arrayOf(
            "Syifa Rahma Nisa",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Divisi PSDM",
            R.drawable.syifa,
            "https://www.instagram.com/syifarahmaans/"
        ),
        arrayOf(
            "Gusnanda Oskar",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Bidang IPTEK",
            R.drawable.nanda,
            "https://www.instagram.com/nanda_oskar/"
        ),
        arrayOf(
            "Haeycell G. Wobisono",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Bidang Humas",
            R.drawable.hecel,
            "https://www.instagram.com/hgravillaa/"
        ),
        arrayOf(
            "Nadia Permatasari",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Bidang Danus",
            R.drawable.nadia,
            "https://www.instagram.com/nadia_prmtsr19/"
        ),
        arrayOf(
            "Daniel Gunawan",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Kepala Bidang Kaderisasi",
            R.drawable.daniel,
            "https://www.instagram.com/dnlgnwn_/"
        ),
        arrayOf(
            "Alhimi Rusdy",
            "Tahun Kepengurusan: 2023/2024",
            "Jabatan : Sekertaris Bidang IPTEK",
            R.drawable.rusdy,
            "https://www.instagram.com/alhimnii_rusdy/"
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
                listModel.pic = data[3] as Int
                listModel.instagram = data[4] as String

                list.add(listModel)
            }
            return list
        }
}