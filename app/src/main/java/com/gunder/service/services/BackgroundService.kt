package com.gunder.service.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.UnsupportedOperationException

class BackgroundService : Service() {

    private val serviceJob = Job()
    private val serviceScope = CoroutineScope(Dispatchers.Main + serviceJob)

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: BackgroundService starting")
        serviceScope.launch {
            for (i in 1..50) {
                delay(1000)
                Log.d(TAG, "onStartCommand: Background service on $i")
            }
            stopSelf()
            Log.d(TAG, "onStartCommand: BackgroundService stopped")
        }
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        serviceScope.cancel()
        Log.d(TAG, "onDestroy: BackgroundService stopped/Destroyed")
    }

    companion object {
        private val TAG = BackgroundService::class.java.simpleName
    }
}