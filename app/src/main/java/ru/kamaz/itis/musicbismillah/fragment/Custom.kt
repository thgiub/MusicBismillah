package ru.kamaz.itis.musicbismillah.fragment

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class Custom(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs) {
    override fun onDrawForeground(canvas: Canvas?) {
        super.onDrawForeground(canvas)
    }


}