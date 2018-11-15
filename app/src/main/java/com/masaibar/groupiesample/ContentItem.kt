package com.masaibar.groupiesample

import com.masaibar.groupiesample.databinding.ViewItemContentBinding
import com.xwray.groupie.databinding.BindableItem

class ContentItem constructor(
    private val text: String
) : BindableItem<ViewItemContentBinding>() {

    interface OnClickContentListener {
        fun onClick(text: String)
    }

    var onClickContentListener: OnClickContentListener? = null

    override fun bind(viewBinding: ViewItemContentBinding, position: Int) {
        viewBinding.contentText = text
        viewBinding.root.setOnClickListener {
            onClickContentListener?.onClick(text)
        }
    }

    override fun getLayout(): Int =
        R.layout.view_item_content
}
