package com.example.rankeuca2

import android.app.Application

class RankeUca2Application : Application() {
    val appProvider by lazy { AppProvider(this) }
}