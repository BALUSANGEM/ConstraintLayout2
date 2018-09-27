package com.nosort.samples

import android.animation.ObjectAnimator
import android.content.Context
import android.support.constraint.ConstraintHelper
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.util.Log
import android.view.animation.BounceInterpolator

class CustomConstraintHelper : ConstraintHelper {
    val TAG = CustomConstraintHelper::class.java.simpleName

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private var mContainer: ConstraintLayout? = null

    override fun updatePreLayout(container: ConstraintLayout?) {
        Log.d(TAG, "updatePreLayout")
        if (mContainer !== container) {
            val views = getViews(container)
            for (i in 0 until mCount) {
                val view = views[i]
                val animator = ObjectAnimator.ofFloat(view, "translationX", -2000f, 0f).setDuration(1000)
                animator.interpolator = BounceInterpolator()
                animator.start()
            }
        }
        mContainer = container
    }

}