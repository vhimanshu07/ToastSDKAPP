package com.example.toastshowing

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
            Toast.makeText(context,"This is second version",Toast.LENGTH_SHORT).show()
        }
    }
}