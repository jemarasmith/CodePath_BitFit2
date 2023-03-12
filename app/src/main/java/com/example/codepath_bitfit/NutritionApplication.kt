package com.example.codepath_bitfit

import android.app.Application

class NutritionApplication : Application()  {
    val db by lazy {AppDatabase.getInstance(this)}
}