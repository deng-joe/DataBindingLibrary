package com.joe.databindinglibrary.listener

import android.content.Context
import android.view.View
import android.widget.Toast

class ClickListener(var context: Context) {

    fun simpleButtonClick(view: View) {
        Toast.makeText(context, "Simple Button Click.", Toast.LENGTH_SHORT).show()
    }

    fun simpleButtonLongClick(view: View): Boolean {
        Toast.makeText(context, "Simple Button Long Click.", Toast.LENGTH_SHORT).show()
        return false
    }
}
