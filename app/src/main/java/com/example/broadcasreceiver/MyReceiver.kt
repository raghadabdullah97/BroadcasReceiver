package com.example.broadcasreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
     val myIntent = intent.getStringExtra(TelephonyManager.EXTRA_STATE)

        Toast.makeText(context, myIntent, Toast.LENGTH_SHORT).show()

        }

    }
