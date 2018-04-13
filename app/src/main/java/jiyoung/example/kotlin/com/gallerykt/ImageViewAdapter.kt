package jiyoung.example.kotlin.com.gallerykt

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by user on 2018-04-12.
 */
class ImageViewAdapter: RecyclerView.Adapter<ImageViewAdapter.ViewHolder>() {

    private lateinit var mDataset: String[]

    fun ImageViewAdapter(dataset: String[]) {
        mDataset = dataset;
    }
    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_album_cardview, parent, false)

        return
    }

    companion object {
        
    }

}