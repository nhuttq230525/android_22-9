package com.example.myapplication.utils

import android.content.Context
import android.view.View
import android.widget.EditText
import android.widget.Toast

// Hiển thị View
fun View.show() {
    visibility = View.VISIBLE
}

// Ẩn View và không chiếm chỗ
fun View.gone() {
    visibility = View.GONE
}

// Ẩn View nhưng vẫn chiếm chỗ
fun View.invisible() {
    visibility = View.INVISIBLE
}

// Hiển thị Toast
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

// Lấy nội dung EditText
fun EditText.textValue(): String {
    return text.toString().trim()
}