// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.scribe.TwitterScribeLog;
import android.os.Bundle;
import android.app.PendingIntent;
import android.text.TextUtils;
import android.os.Parcelable;
import android.net.Uri;
import com.twitter.library.provider.as;
import com.twitter.android.client.NotificationService;
import android.content.Intent;
import android.content.Context;

public class w
{
    private final Context a;
    private final Intent b;
    
    public w(final Context a, final StatusBarNotif statusBarNotif, final String action) {
        this.a = a;
        this.b = new Intent(a, (Class)NotificationService.class).setAction(action).setData(Uri.withAppendedPath(as.a, String.valueOf(statusBarNotif.a.p))).putExtra("sb_account_name", statusBarNotif.c).putExtra("sb_notification", (Parcelable)statusBarNotif);
    }
    
    public Intent a() {
        return new Intent(this.b);
    }
    
    public w a(final int n, final String s) {
        if (n != 0 && !TextUtils.isEmpty((CharSequence)s)) {
            this.b.putExtra("undo_allowed", true);
            this.b.putExtra("undo_icon", n);
            this.b.putExtra("undo_text", s);
        }
        return this;
    }
    
    public w a(final PendingIntent pendingIntent) {
        this.b.putExtra("action_intent", (Parcelable)pendingIntent);
        return this;
    }
    
    public w a(final Bundle bundle) {
        this.b.putExtras(bundle);
        return this;
    }
    
    public w a(final TwitterScribeLog twitterScribeLog, final TwitterScribeLog twitterScribeLog2) {
        this.b.putExtra("notif_scribe_log", (Parcelable)twitterScribeLog);
        this.b.putExtra("notif_scribe_log_from_background", (Parcelable)twitterScribeLog2);
        return this;
    }
    
    public w a(final boolean b) {
        this.b.putExtra("notif_scribe_action_tap", b);
        return this;
    }
    
    public PendingIntent b() {
        return PendingIntent.getService(this.a, 0, this.a(), 268435456);
    }
}
