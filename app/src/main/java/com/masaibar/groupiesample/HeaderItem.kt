package com.masaibar.groupiesample

import com.masaibar.groupiesample.databinding.ViewItemHeaderBinding
import com.xwray.groupie.databinding.BindableItem

class HeaderItem constructor(
    private val text: String
) : BindableItem<ViewItemHeaderBinding>() {

    override fun bind(viewBinding: ViewItemHeaderBinding, position: Int) {
        viewBinding.headerText = text
    }

    override fun getLayout(): Int =
        R.layout.view_item_header
}
