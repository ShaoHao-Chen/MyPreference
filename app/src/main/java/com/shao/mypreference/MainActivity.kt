package com.shao.mypreference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var mPreference:SharedPreferences
    lateinit var mEditor:SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPreference = getSharedPreferences("MyPreference", MODE_PRIVATE)
        mEditor = mPreference.edit()
    }

    fun getPreference(view: View) {
        val name: String? = mPreference.getString("NAME", "NO_NAME")
        val age:Int = mPreference.getInt("AGE", -1)
        val rich:Boolean = mPreference.getBoolean("RICH", false);

        Log.d("Shao", "Name:"+name)
        Log.d("Shao", "AGE:"+age)
        Log.d("Shao", "RICH:"+rich)
        
    }
    fun setPreference(view: View) {
        mEditor.putString("NAME", "ShaoHao");
        mEditor.putInt("AGE", 25);
        mEditor.putBoolean("RICH", true);
        mEditor.commit();
    }
}