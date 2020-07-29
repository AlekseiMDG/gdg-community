package com.alekseioshurkovdeveloper.event.eventlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.alekseioshurkovdeveloper.event.R

/**
 * Base class for fragment which represent information event,
 * past and future event.
 */
const val PARAM_KEY: String = "param_key"

class ListEventFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(key: String): ListEventFragment {
            val bundle = bundleOf(PARAM_KEY to key)
            return ListEventFragment().apply {
                arguments = bundle
            }
        }
    }

    var mKey: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        mKey = arguments?.getString(PARAM_KEY)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        eventRecyclerView.adapter = EventAdapter(listEvent)
    }
}