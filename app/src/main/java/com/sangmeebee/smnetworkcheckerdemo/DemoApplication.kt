package com.sangmeebee.smnetworkcheckerdemo

import android.app.Application
import com.sangmeebee.smnetworkchecker.NetworkCheckApi

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //network module build
        NetworkCheckApi.init(this)
    }
}
