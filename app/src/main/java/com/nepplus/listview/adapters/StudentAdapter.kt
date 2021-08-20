package com.nepplus.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.listview.R
import com.nepplus.listview.datas.StudentData
import java.util.zip.Inflater

class StudentAdapter(
    val mContext: Context,
    val resId : Int,
    val mList : ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) {


    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.name)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

        nameTxt.text = data.name
        addressTxt.text = data.address

        ageTxt.text = "(${2021 - data.birthYear + 1} 세)"


        return row

    }


}