package org.avantari.imagefilterview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    val TAG = MainActivity::class.java.simpleName
    override fun onProgressChanged(seekBar: SeekBar, progressOnBar: Int, fromUser: Boolean) {
        val progress = (progressOnBar / 100f) * 2
        Log.d(TAG, "Progress is: $progress")
        when (seekBar.id) {
            R.id.saturationSeekBar -> {
                imageFilterView.saturation = progress
                setSaturationFromProgress(progress)
            }
            R.id.contrastSeekBar -> {
                imageFilterView.contrast = progress
                setContrastFromProgress(progress)
            }
            R.id.warmthSeekBar -> {
                imageFilterView.warmth = progress
                setWarmthFromProgress(progress)
            }
        }
    }


    private fun setWarmthFromProgress(progress: Float) {
        warmthTV.text = "Warmth " +
                "${when (progress) {
                    1f -> {
                        "neutral"
                    }
                    2f -> {
                        "warm (red tint)"
                    }
                    0.5f -> {
                        "cold (blue tint)"
                    }
                    else -> {
                        ""
                    }
                }
                }"
    }

    private fun setContrastFromProgress(progress: Float) {
        contrastTV.text = "Contrast " +
                "${when (progress) {
                    1f -> {
                        "unchanged"
                    }
                    0f -> {
                        "gray"
                    }
                    2f -> {
                        "high contrast"
                    }
                    else -> {
                        ""
                    }
                }
                }"
    }

    private fun setSaturationFromProgress(progress: Float) {
        saturationTV.text = "Saturation " +
                "${when (progress) {
                    0f -> {
                        "grayscale"
                    }
                    1f -> {
                        "original"
                    }
                    2f -> {
                        "hyper saturated"
                    }
                    else -> {
                        ""
                    }
                }
                }"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        saturationSeekBar.setOnSeekBarChangeListener(this)
        contrastSeekBar.setOnSeekBarChangeListener(this)
        warmthSeekBar.setOnSeekBarChangeListener(this)
    }

}

