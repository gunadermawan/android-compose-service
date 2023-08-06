package com.gunder.service.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.lang.UnsupportedOperationException

class BackgroundService : Service() {

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: BackgroundService starting")
        return START_STICKY
    }

    companion object {
        private val TAG = BackgroundService::class.java.simpleName
    }
}