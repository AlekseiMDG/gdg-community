package com.alekseioshurkovdeveloper.event.eventlist

import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alekseioshurkovdeveloper.event.R
import com.alekseioshurkovdeveloper.event.databinding.EventItemBinding

/**
 * Created by aleksei on 08.03.18.
 */
class EventAdapter(private val mEventList: List<EventModel>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun getItemCount() = mEventList.size

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) =
        holder.bind(mEventList[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {

        val binding = EventItemBinding.inflate(
            LayoutInflater
                .from(parent.context), parent, false
        )

        return EventViewHolder(binding)
    }

    class EventViewHolder(private val binding: EventItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(event: EventModel) {
            binding.event = event
            binding.executePendingBindings()
//            txtName.text = event.name
//            txtTime.text = event.time
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                txtDescription.text = Html.fromHtml(
//                    event.description.substring(0, 100) + " ...",
//                    Html.FROM_HTML_MODE_COMPACT
//                )
//            } else {
//                txtDescription.text = Html.fromHtml(event.description.substring(0, 100) + " ...")
//            }
//
//            imgFavorite.setOnClickListener {
//                isLike = !isLike
//                changeColor(imgFavorite as ImageView, isLike)
//            }
        }

        private fun changeColor(view: ImageView, like: Boolean) {
//            view.setColorFilter(if (like) view.context.getColor(R.color.colorRed)
//                                else view.context.getColor(R.color.colorSimple))
        }
    }
}