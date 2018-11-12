package com.masaibar.groupiesample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.masaibar.groupiesample.databinding.ActivityMainBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        val groupAdapter = GroupAdapter<ViewHolder>()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = groupAdapter
        }

        groupAdapter.add(HeaderItem("header"))
        for (i in 0..Random().nextInt(10)) {
            val section = Section()
            section.setHeader(LabelItem("label $i"))
            for (j in 0..Random().nextInt(5)) {
                section.add(ContentItem("content $i $j"))
            }
            groupAdapter.add(section)
        }
        groupAdapter.add(FooterItem("footer"))
    }
}
