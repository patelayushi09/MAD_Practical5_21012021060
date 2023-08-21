package com.example.mad_practical5_21012021060

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
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
        val callButton:Button=findViewById(R.id.btnCall)
        val calltxt:EditText=findViewById(R.id.editTextphoneno)
        callButton.setOnClickListener {
            openCall(calltxt.text.toString())
        }


        val callLogButton:Button=findViewById(R.id.btnCallLog)
        callLogButton.setOnClickListener {
            openCallLog()
        }

        val galleryButton:Button=findViewById(R.id.btnGallery)
        galleryButton.setOnClickListener {
            openGallery()
        }

        val cameraButton:Button=findViewById(R.id.btnCamera)
        cameraButton.setOnClickListener {
            openCamera()
        }

        val alarmButton:Button=findViewById(R.id.btnAlarm)
        alarmButton.setOnClickListener {
            openAlarm()
        }
    }


    fun openBrowser(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }

    }

    fun  openCall(num:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$num")).also {
            startActivity(it)
        }

    }

    fun  openCallLog(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {
            startActivity(it)
        }

    }

    fun  openGallery(){
        Intent(Intent.ACTION_VIEW).setType("image/*").also {
            startActivity(it)
        }

    }

    fun  openCamera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
            startActivity(it)
        }

    }

    fun  openAlarm(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
            startActivity(it)
        }

    }
}