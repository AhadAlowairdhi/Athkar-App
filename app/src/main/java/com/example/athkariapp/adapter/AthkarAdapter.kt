package com.example.athkariapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.athkariapp.R
import com.example.athkariapp.model.Athkar

// TODO(1) Build class RecyclerView, Adapter, ViewHolder.
// - Bind data with views
// - send list of data to RecyclerView
class AthkarAdapter(private val dataset : List<Athkar>, private val context : Context) : RecyclerView.Adapter<AthkarAdapter.AthkarViewHolder>() {
    // TODO[4] Create ViewHolder Class
    // Adapter helper class to arrange data in layout file
    class AthkarViewHolder(private val view : View) : RecyclerView.ViewHolder(view){

        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    } // End AthkarViewHolder() class

    // 3 functions
    // تعرف ملف layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthkarViewHolder {
        // Create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_athkar, parent, false)

        return AthkarViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بمساعدة ViewHolder
    override fun onBindViewHolder(holder: AthkarViewHolder, position: Int) {
        // save the positin of item(which item I'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.athkarStringId)
        holder.imageView.setImageResource(item.athkarImageId)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size
} // End AthkarAdapter class