package com.kwancorp.movieapp2.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.annotation.RequiresApi

object NetworkCompat {

    /**
     * 네트워크 연결 상태를 확인한다
     *
     * @return true - 네트워크가 연결되어 있는 경우, false - 네트워크가 연결되어 있지 않은 경우
     */
    fun isConnected(): Boolean {
        val cm = MovieApplication.instance.getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkNetworkGreaterThanOrEqualToM(cm)
        } else {
            checkNetworkLessThanM(cm)
        }
    }

    /**
     * 현재 디바이스의 SDK 버전이 마시멜로우보다 크거나 같은 경우 네트워크 상태를 확인한다
     *
     * @param cm - 네트워크 상태 확인 클래스
     * @return true - 네트워크가 연결되어 있는 경우, false - 네트워크가 연결되어 있지 않은 경우
     */
    @RequiresApi(Build.VERSION_CODES.M)
    private fun checkNetworkGreaterThanOrEqualToM(
        cm: ConnectivityManager
    ): Boolean {
        val activeNetwork = cm.activeNetwork
        val connection = cm.getNetworkCapabilities(activeNetwork)

        return if(connection != null) {
            val isWifi = connection.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
            val isCellular = connection.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
            isWifi || isCellular
        } else {
            false
        }
    }

    /**
     * 현재 디바이스의 SDK 버전이 마시멜로우 작은 경우 네트워크 상태를 확인한다
     *
     * @param cm - 네트워크 상태 확인 클래스
     * @return true - 네트워크가 연결되어 있는 경우, false - 네트워크가 연결되어 있지 않은 경우
     */
    private fun checkNetworkLessThanM(
        cm: ConnectivityManager
    ): Boolean {
        val activeNetwork = cm.activeNetworkInfo

        return if(activeNetwork != null) {
            val isWifi = activeNetwork.type == ConnectivityManager.TYPE_WIFI
            val isMobile = activeNetwork.type == ConnectivityManager.TYPE_MOBILE
            isWifi || isMobile
        } else {
            false
        }
    }

}