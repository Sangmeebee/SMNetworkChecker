package com.sangmeebee.smnetworkchecker

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import androidx.core.content.ContextCompat

object NetworkCheckApi {

    private var networkState = false

    private var wifiState = false

    private val networkRequest: NetworkRequest = NetworkRequest.Builder()
        .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
        .build()

    private val wifiRequest: NetworkRequest = NetworkRequest.Builder()
        .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
        .build()

    private val networkCallback = object : ConnectivityManager.NetworkCallback() {
        // network is available for use
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            networkState = true
        }

        // lost network connection
        override fun onLost(network: Network) {
            super.onLost(network)
            networkState = false
        }
    }

    private val wifiCallback = object : ConnectivityManager.NetworkCallback() {
        // network is available for use
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            wifiState = true

        }

        // lost network connection
        override fun onLost(network: Network) {
            super.onLost(network)
            wifiState = false
        }
    }

    // receive context and do request network
    fun init(context: Context) {
        val connectivityManager by lazy { ContextCompat.getSystemService(context, ConnectivityManager::class.java) as ConnectivityManager }

        connectivityManager.requestNetwork(networkRequest, networkCallback)
        connectivityManager.requestNetwork(wifiRequest, wifiCallback)

    }

    fun getNetWorkConnectState(): Boolean = networkState
    fun getWifiConnectState(): Boolean = wifiState
}
