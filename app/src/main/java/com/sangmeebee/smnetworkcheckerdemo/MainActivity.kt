package com.sangmeebee.smnetworkcheckerdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sangmeebee.smnetworkchecker.NetworkCheckApi
import com.sangmeebee.smnetworkcheckerdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    @SuppressLint("SetTextI18n")
    private fun initListener() {
        /** check network */
        binding.btnNetworkCheck.setOnClickListener {
            binding.tvNetwork.text = "network state: ${NetworkCheckApi.getNetWorkConnectState()}"
        }
        /** check wifi */
        binding.btnWifiCheck.setOnClickListener {
            binding.tvWifi.text = "wifi state: ${NetworkCheckApi.getWifiConnectState()}"
        }
    }
}
