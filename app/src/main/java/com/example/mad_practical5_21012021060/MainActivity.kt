package com.example.mad_practical5_21012021060

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val browseButton:Button=findViewById(R.id.btnBrowse)
        val browsetxt:EditText=findViewById(R.id.editTextbrowse)
         browseButton.setOnClickListener {
            openBrowser(browsetxt.text.toString())
        }
    }

    fun openBrowser(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }

    }

    fun  openCall(num:String){

    }

    fun  openCallLog(){

    }

    fun  openGallery(){

    }

    fun  openCamera(){

    }

    fun  openAlarm(){

    }
}