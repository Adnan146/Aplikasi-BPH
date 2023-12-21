package com.adnan.bph.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adnan.bph.R
import com.adnan.bph.main.DetailActivity
import com.adnan.bph.model.ListModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(private val listBph: ArrayList<ListModel>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val listModel = listBph[position]
        Glide.with(holder.itemView.context)
            .load(listModel.pic)
            .apply(RequestOptions())
            .into(holder.picture)
        holder.nama.text = listModel.nama
        holder.tahun.text = listModel.tahun
        holder.jabatan.text = listModel.jabatan
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAMA, listModel.nama)
            passItem.putExtra(DetailActivity.EXTRA_TAHUN, listModel.tahun)
            passItem.putExtra(DetailActivity.EXTRA_JABATAN, listModel.jabatan)
            passItem.putExtra(DetailActivity.EXTRA_PROFILE, listModel.pic)
            passItem.putExtra(DetailActivity.EXTRA_BIO, listModel.bio)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listBph.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nama: TextView = itemView.findViewById(R.id.nam_leng)
        var tahun: TextView = itemView.findViewById(R.id.th_kep)
        var jabatan: TextView = itemView.findViewById(R.id.jabatan)
        var picture: ImageView = itemView.findViewById(R.id.profile)
    }
}