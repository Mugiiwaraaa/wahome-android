package io.homeassistant.companion.android.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wahome.R

class HeaderViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val headerTextView = v.findViewById<TextView>(R.id.headerTextView)
}
