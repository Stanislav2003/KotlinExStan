package com.stanss.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stanss.recyclerview.R
import com.stanss.recyclerview.data.FitxaPersones


class ItemAdapter(val dataset: List<FitxaPersones>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val textView: TextView = itemView.findViewById(R.id.item_title)
        val nomCardView : TextView = itemView.findViewById(R.id.Nom)
        val carrecCardView : TextView = itemView.findViewById(R.id.Carrec)
        val edatCardView : TextView = itemView.findViewById(R.id.Edat)
        val imageView: ImageView = itemView.findViewById(R.id.Imatge)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.items_cardview,parent,false)
        return ViewHolder((adapterLayout))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = dataset[position]
        holder.nomCardView.text = item.Nom
        holder.carrecCardView.text = item.Carrec
        holder.edatCardView.text = item.Edat
        holder.imageView.setBackgroundResource(item.valorImg)
        /*if (item.valorImg == 1) {
            holder.imageView.setImageResource(R.drawable.dice_1)
        } else if (item.valorImg == 2) {
            holder.imageView.setImageResource(R.drawable.dice_2)
        } else {
            holder.imageView.setImageResource(R.drawable.dice_3)
        }*/
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    /*public fun updateItems(newItems: List<FitxaPersones>){
      this.dataset.clear()
      dataset.addAll(newItems)
    }*/
}


