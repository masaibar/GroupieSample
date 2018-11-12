package com.masaibar.groupiesample

import com.masaibar.groupiesample.databinding.ViewItemLabelBinding
import com.xwray.groupie.databinding.BindableItem

class LabelItem constructor(
    private val text: String
) : BindableItem<ViewItemLabelBinding>() {

    override fun bind(viewBinding: ViewItemLabelBinding, position: Int) {
        viewBinding.labelText = text
    }

    override fun getLayout(): Int =
        R.layout.view_item_label
}
