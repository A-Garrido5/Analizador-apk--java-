// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.IBinder;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import android.widget.RemoteViews;
import android.os.Parcelable;
import android.net.Uri;
import com.twitter.library.client.Session;
import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.timeline.f;
import com.twitter.library.client.az;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.ad;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.notifications.StatusBarNotif;
import android.app.PendingIntent$CanceledException;
import com.twitter.errorreporter.ErrorReporter;
import android.content.Intent;
import android.app.PendingIntent;
import com.twitter.library.client.App;
import java.util.HashMap;
import android.app.Service;
import android.os.Bundle;
import android.content.Context;

class ak implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ Context b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ String d;
    final /* synthetic */ NotificationService e;
    
    ak(final NotificationService e, final int a, final Context b, final Bundle c, final String d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        this.e.stopSelf(this.a);
        NotificationService.a(this.b, this.c);
        this.e.a(this.b, this.c, this.d);
    }
}
