package com.nosort.samples

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_samples_list.*
import android.support.v7.widget.DividerItemDecoration


class SamplesListFragment : Fragment(), OnListItemClickedListener {

    override fun onItemClicked(position: Int) {
        val bundle = Bundle().apply {
            putInt("layoutId", sampleDataList[position].layout)
            putBoolean("showPaths", showPathSwitch.isChecked)
        }
        Navigation.findNavController(view!!).navigate(R.id.action_samplesListFragment_to_previewFragment, bundle)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_samples_list, container, false)
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    private fun initList() {
        sampleList.apply {
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = SampleListAdapter(this@SamplesListFragment, sampleDataList);
        }
    }

    private val sampleDataList = listOf(
            SampleData("Basic 1", "MotionLayout example using two Constraint Layouts", R.layout.sample_01_two_constraintlayouts),
            SampleData("Basic 2", "MotionLayout example using two ConstraintSets in MotionScene", R.layout.sample_02_two_constraintsets),
            SampleData("CustomAttribute", "Changing style attribute textSize using CustomAttribute", R.layout.sample_03_custom_attribute),
            SampleData("KeyPosition", "Using Position KeyFrame in MotionScene", R.layout.sample_04_keyposition),
            SampleData("Arc motion", "Arc motion using Position KeyFrame in MotionScene", R.layout.sample_05_arcmotion),
            SampleData("KeyAttribute", "Using Attribute KeyFrame in MotionScene", R.layout.sample_06_keyattribute),
            SampleData("Custom ConstraintHelper", "Usage of extending ConstraintHelper class", R.layout.sample_07_customconstrainthelper),
            SampleData("ImageFilterView", "Show image cross-fade", R.layout.sample_08_imagecrossfade)
    )

}

