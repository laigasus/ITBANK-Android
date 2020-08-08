package com.sjb.chat.firebase;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.sjb.chat.MainActivity;
import com.sjb.chat.R;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "메시지";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());

            sendNotification(
                    remoteMessage.getNotification().getTitle(),
            remoteMessage.getNotification().getBody());
        }
    }

    private void sendNotification(String title, String message) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name","test");
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.
                getActivity(this, 0 , intent,
                        PendingIntent.FLAG_CANCEL_CURRENT);

        Uri defaultSoundUri =
                RingtoneManager.getDefaultUri
                        (RingtoneManager.TYPE_NOTIFICATION);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService
                        (Context.NOTIFICATION_SERVICE);

        String name = "chname";
        String channel_id = "chid";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel =
                    new NotificationChannel
                            (channel_id,
                                    name,
                                    NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this, channel_id)
                        .setLargeIcon(
                                BitmapFactory.decodeResource(getResources(),
                                        android.R.drawable.ic_dialog_info)
                        )
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle(title)
                        .setContentText(message)
                        .setAutoCancel(true)
                        .setSound(defaultSoundUri)
                        .setContentIntent(pendingIntent);

        notificationManager.notify(0 , notificationBuilder.build());
    }

}