package net.zabador.money.service;

import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/**
 * Created by Skye Schneider. The mad king of Domino's
 * in the year of our Lord 8/25/17.
 */

public class NotificationServiceAgain extends NotificationListenerService {

    private static final String TAG = NotificationServiceAgain.class.getSimpleName();

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        Log.d(TAG , "New Notification Posted");

        Bundle extras = sbn.getNotification().extras;

        if(extras != null) {
        }
    }

}
