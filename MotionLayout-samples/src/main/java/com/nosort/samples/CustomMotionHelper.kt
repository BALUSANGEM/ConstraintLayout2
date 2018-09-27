package com.nosort.samples

import android.content.Context
import android.support.constraint.motion.MotionHelper
import android.util.AttributeSet
import android.util.Log
import android.view.View

class CustomMotionHelper : MotionHelper {
    val TAG = CustomMotionHelper::class.java.simpleName

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setProgress(view: View?, progress: Float) {
        Log.d(TAG, "setProgress progress:$progress and view:$view")
        view?.alpha = progress
    }
}