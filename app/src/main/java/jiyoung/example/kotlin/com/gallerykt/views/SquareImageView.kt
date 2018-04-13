package jiyoung.example.kotlin.com.gallerykt.views

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView

/**
 * Created by user on 2018-04-13.
 */
class SquareImageView(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : ImageView(context, attrs, defStyleAttr) {

    constructor(context: Context) : this(context, null, 0)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}