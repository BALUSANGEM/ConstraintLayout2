package com.nosort.samples

import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PreviewFragment : Fragment() {
    private val safeArgs by lazy {
        PreviewFragmentArgs.fromBundle(arguments)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(safeArgs.layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainMotionLayout = view.findViewById<MotionLayout>(R.id.mainMotionLayout)
        mainMotionLayout.setShowPaths(safeArgs.showPaths)
    }

}
