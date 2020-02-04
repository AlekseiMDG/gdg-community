package com.alekseioshurkovdeveloper.about.presentation

import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.alekseioshurkovdeveloper.about.R
import com.alekseioshurkovdeveloper.about.di.AboutComponent
import com.alekseioshurkovdeveloper.about.presentation.model.AboutPresentationModel
import com.alekseioshurkovdeveloper.about.presentation.model.LeaderPresentationModel
import com.alekseioshurkovdeveloper.core.ImageLoaderTarget
import com.alekseioshurkovdeveloper.core.showImage
import com.alekseioshurkovdeveloper.network.di.NetworkComponent
import com.google.android.material.chip.Chip
import kotlinx.android.synthetic.main.about_group_fragment.*

/**
 * Is page with community description, common information and leaders this community
 */
class AboutGroupFragment : Fragment() {

    companion object {
        fun newInstance() = AboutGroupFragment()
    }

    private val component = AboutComponent.initAndGet(NetworkComponent.get())

    private lateinit var viewModel: AboutGroupViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_group_fragment, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        component.releaseComponent()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViewModel()
    }

    private fun initViewModel() {
        val factory = component.aboutGroupFactory
        viewModel = ViewModelProviders.of(this, factory).get(AboutGroupViewModel::class.java)

        viewModel.aboutUiModel.observe(this, Observer { updateUI(it) })
    }

    private fun updateUI(model: AboutPresentationModel) {
        name.text = model.title
        location.text = model.location
        logo_community.showImage(model.photo, this)

        description.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(model.description, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            Html.fromHtml(model.description).toString()
        }

        val pattern = resources.getString(R.string.status)
        status.text = String.format(pattern, model.status)

        label_member.text =
            resources.getQuantityString(R.plurals.members_count, model.count, model.count)

        buildLeaderChips(model.leaders)
    }

    private fun buildLeaderChips(leaders: List<LeaderPresentationModel>) {
        chip_group.removeAllViews()
        val lp = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        leaders.forEach { leader ->
            run {
                val chip = Chip(context).apply {
                    this.layoutParams = lp
                    this.isClickable = false
                    this.text = leader.name
                }

                val loadCallback = { drawable: Drawable -> chip.chipIcon = drawable }
                ImageLoaderTarget.loadRoundedImageIntoTarget(
                    this,
                    url = leader.photo,
                    load = loadCallback
                )
                chip_group.addView(chip)
            }
        }
    }

}
