// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import android.text.TextUtils;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import com.twitter.android.SearchActivity;
import android.support.v4.app.NotificationCompat$Builder;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;

public class EventAlarmBroadcastReceiver extends BroadcastReceiver
{
    private void a(final Intent intent, final Context context) {
        final NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(context);
        final Intent intent2 = new Intent(intent);
        intent2.setClass(context, (Class)SearchActivity.class);
        final PendingIntent activity = PendingIntent.getActivity(context, 320, intent2, 134217728);
        final String[] split = intent2.getStringExtra("query").replace("#", "").split("v");
        String s;
        if (split.length == 2) {
            s = context.getResources().getString(2131297544, new Object[] { split[0], split[1] });
        }
        else {
            s = context.getResources().getString(2131297545);
        }
        ((NotificationManager)context.getSystemService("notification")).notify(2000, notificationCompat$Builder.setAutoCancel(true).setSmallIcon(2130839309).setTicker(s).setContentTitle(s).setContentText(context.getResources().getString(2131297542)).setStyle(new NotificationCompat$BigTextStyle().bigText(context.getResources().getString(2131297541))).addAction(0, context.getResources().getString(2131297540), activity).setCategory("recommendation").setDefaults(-1).setPriority(1).setContentIntent(activity).setColor(context.getResources().getColor(2131689634)).build());
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent != null && !TextUtils.isEmpty((CharSequence)intent.getStringExtra("key_event_alarm_type"))) {
            final String stringExtra = intent.getStringExtra("key_event_alarm_type");
            switch (stringExtra) {
                default: {}
                case "event_alarm_cricket": {
                    if (!TextUtils.isEmpty((CharSequence)intent.getStringExtra("query"))) {
                        this.a(intent, context);
                        return;
                    }
                    break;
                }
            }
        }
    }
}
