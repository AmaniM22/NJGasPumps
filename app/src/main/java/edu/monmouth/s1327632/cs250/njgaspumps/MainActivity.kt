package edu.monmouth.s1327632.cs250.njgaspumps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   // private lateinit var binding: ActivityMainBinding
    vas
    private var layoutManger: RecyclerView.LayoutManager?= null
    private var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManger= LinearLayoutManager(this)

        gasStationList.LayoutManager = layoutManger

        adapter= RecyclerAdapter()
        gasStationList.adapter=adapter
    }
}