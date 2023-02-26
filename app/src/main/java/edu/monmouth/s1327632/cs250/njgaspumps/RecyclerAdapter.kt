package edu.monmouth.s1327632.cs250.njgaspumps
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val gasStationList: List<GasStation>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val gasStationData = gasStationList[position]
        Log.i("Custom Adapter", position.toString())

        //holder.stationImage.setImageResource(R.drawable.generic)
        holder.imageView.setImageResource(gasStationData.stationImage)
        holder.textView.text = gasStationData.SITE_NAME
        holder.textView.text = gasStationData.ADDRESS_LINE_1.toString()
        holder.textView.text = gasStationData.PRICE.toString()

        holder.layout.setOnClickListener{
            val intent = Intent (context, gasStationDetail::class.java)
            intent.putExtra("id",gasStationData.objectID)
            context.startActivity(intent)
        }
        override fun getItemCount (): Int{
        return gasStationList.size
        }
    }
