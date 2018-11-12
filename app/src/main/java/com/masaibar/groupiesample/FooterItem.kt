package com.masaibar.groupiesample

import com.masaibar.groupiesample.databinding.ViewItemFooterBinding
import com.xwray.groupie.databinding.BindableItem

class FooterItem constructor(
    private val text: String
) : BindableItem<ViewItemFooterBinding>() {

    override fun bind(viewBinding: ViewItemFooterBinding, position: Int) {
        viewBinding.footerText = text
    }

    override fun getLayout(): Int =
        R.layout.view_item_footer
}
