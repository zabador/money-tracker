package net.zabador.money.service

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

/**
 * Created by Skye Schneider. The mad king of Domino's
 * in the year of our Lord 8/25/17.
 */

class NotificationServiceAgain : NotificationListenerService() {
    
    val MONEY_REGEX = "\\d+\\.\\d{2}"

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        Log.d(TAG, "New Notification Posted")

        val extras = sbn.notification.extras

        if (extras != null) {
        }
    }

    companion object {
        private val TAG = NotificationServiceAgain::class.java.simpleName
    }

}
