package jiyoung.example.kotlin.com.gallerykt.views

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

/**
 * Created by user on 2018-04-13.
 */
class SquareRelativeLayout(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int): RelativeLayout(context, attrs, defStyleAttr, defStyleRes) {

    constructor(context: Context) : this(context, null, 0, 0)

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0, 0)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : this(context, attrs, defStyleAttr, 0)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}