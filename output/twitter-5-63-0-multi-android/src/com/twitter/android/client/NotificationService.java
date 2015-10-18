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
import android.os.Bundle;
import android.content.Context;
import android.app.PendingIntent$CanceledException;
import com.twitter.errorreporter.ErrorReporter;
import android.content.Intent;
import android.app.PendingIntent;
import com.twitter.library.client.App;
import java.util.HashMap;
import android.app.Service;

public class NotificationService extends Service
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    private static final HashMap k;
    private al l;
    
    static {
        a = App.a(".notif.dismiss");
        b = App.a(".notif.undo");
        c = App.a(".notif.reply");
        d = App.a(".notif.retweet");
        e = App.a(".notif.favorite");
        f = App.a(".notif.follow");
        g = App.a(".notif.follow.accept");
        h = App.a(".notif.follow.decline");
        i = App.a(".notif.tweetTo");
        j = App.a(".notif.open");
        (k = new HashMap()).put(NotificationService.a, 0);
        NotificationService.k.put(NotificationService.b, 1);
        NotificationService.k.put(NotificationService.c, 2);
        NotificationService.k.put(NotificationService.d, 2);
        NotificationService.k.put(NotificationService.e, 2);
        NotificationService.k.put(NotificationService.f, 2);
        NotificationService.k.put(NotificationService.g, 2);
        NotificationService.k.put(NotificationService.h, 2);
        NotificationService.k.put(NotificationService.i, 2);
        NotificationService.k.put(NotificationService.j, 3);
    }
    
    private void a(final PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
            this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        catch (PendingIntent$CanceledException ex) {
            ErrorReporter.a((Throwable)ex);
        }
    }
    
    public static void a(final Context context, final Bundle bundle) {
        final c a = com.twitter.android.client.c.a(context);
        final String string = bundle.getString("sb_account_name");
        final StatusBarNotif statusBarNotif = (StatusBarNotif)bundle.getParcelable("sb_notification");
        com.twitter.library.featureswitch.d.a("android_push_notification_disaggregation_2520", "one", "one_five", "two", "two_five", "three");
        String s;
        if (ad.a().c()) {
            s = "notif_scribe_log";
        }
        else {
            s = "notif_scribe_log_from_background";
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)bundle.getParcelable(s);
        if (twitterScribeLog != null) {
            a.a(twitterScribeLog);
        }
        if (fh.a()) {
            final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)bundle.getParcelable("notif_scribe_log_for_preview_experiment");
            if (twitterScribeLog2 != null) {
                a.a(twitterScribeLog2);
            }
        }
        x.a(context).a(statusBarNotif.O(), string);
    }
    
    private void a(final Context context, final Bundle bundle, final String s) {
        final Session b = az.a(context).b(bundle.getString("sb_account_name"));
        com.twitter.library.service.c c = null;
        Label_0049: {
            if (NotificationService.e.equals(s)) {
                c = new f(context, b, bundle.getLong("status_id"), bundle.getLong("rt_status_id"));
            }
            else if (NotificationService.f.equals(s)) {
                c = new pb(context, b, bundle.getLong("user_id"), null);
            }
            else if (NotificationService.d.equals(s)) {
                c = new oq(context, b, bundle.getLong("status_id"), bundle.getLong("ref_status_id"), null);
            }
            else {
                if (!NotificationService.g.equals(s)) {
                    final boolean equals = NotificationService.h.equals(s);
                    c = null;
                    if (!equals) {
                        break Label_0049;
                    }
                }
                final long long1 = bundle.getLong("user_id");
                int n;
                if (NotificationService.g.equals(s)) {
                    n = 1;
                }
                else {
                    n = 2;
                }
                c = new pn(context, b, long1, n);
            }
        }
        if (c != null) {
            c.k("Notification actions are triggered by user actions. The app may or may not be visible.");
            as.a(context).a((a)c);
        }
    }
    
    private static void a(final Context context, final StatusBarNotif statusBarNotif, final String s, final int smallIcon, final TwitterScribeLog twitterScribeLog) {
        final int w = statusBarNotif.w();
        final PendingIntent service = PendingIntent.getService(context, 0, new Intent(context, (Class)NotificationService.class).setAction(NotificationService.b).setData(Uri.withAppendedPath(com.twitter.library.provider.as.a, String.valueOf(w))).putExtra("sb_notification", (Parcelable)statusBarNotif).putExtra("notif_scribe_log", (Parcelable)twitterScribeLog), 268435456);
        final RemoteViews content = new RemoteViews(App.i(), 2130968950);
        content.setOnClickPendingIntent(2131887073, service);
        content.setTextViewText(2131886199, (CharSequence)s);
        content.setImageViewResource(2131886198, smallIcon);
        ((NotificationManager)context.getSystemService("notification")).notify(w, new NotificationCompat$Builder(context).setPriority(statusBarNotif.D()).setWhen(statusBarNotif.x()).setSmallIcon(smallIcon).setContent(content).build());
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        this.l = new al(this.getMainLooper());
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        int n3 = 1;
        if (intent == null) {
            ErrorReporter.a(new NullPointerException("Intent is null"));
            this.stopSelf(n2);
            return 2;
        }
        final Integer n4 = NotificationService.k.get(intent.getAction());
        if (n4 == null) {
            ErrorReporter.a(new IllegalStateException("IMAGE-818: " + intent.toUri(0)));
            this.stopSelf(n2);
            return 2;
        }
        Context applicationContext;
        Bundle extras;
        StatusBarNotif statusBarNotif = null;
        TwitterScribeLog twitterScribeLog2;
        String action;
        while (true) {
            applicationContext = this.getApplicationContext();
            extras = intent.getExtras();
            final c a = com.twitter.android.client.c.a(applicationContext);
            final x a2 = x.a(applicationContext);
            while (true) {
                Label_0567: {
                    Label_0305: {
                        Label_0195: {
                            try {
                                statusBarNotif = (StatusBarNotif)extras.getParcelable("sb_notification");
                                switch (n4) {
                                    default: {
                                        this.stopSelf(n2);
                                        return 2;
                                    }
                                    case 0: {
                                        break;
                                    }
                                    case 1: {
                                        break Label_0195;
                                    }
                                    case 2: {
                                        break Label_0305;
                                    }
                                    case 3: {
                                        break Label_0567;
                                    }
                                }
                            }
                            catch (Exception ex) {
                                this.stopSelf(n2);
                                return 2;
                            }
                            if (statusBarNotif != null) {
                                a(applicationContext, extras);
                                continue;
                            }
                            continue;
                        }
                        if (statusBarNotif == null) {
                            continue;
                        }
                        final int w = statusBarNotif.w();
                        if (this.l.hasMessages(w)) {
                            this.l.removeMessages(w);
                            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)extras.getParcelable("notif_scribe_log");
                            if (twitterScribeLog != null) {
                                final String[] array = new String[n3];
                                array[0] = twitterScribeLog.a() + "_undo";
                                twitterScribeLog.b(array);
                                a.a(twitterScribeLog);
                            }
                            a2.a(statusBarNotif);
                            continue;
                        }
                        continue;
                    }
                    if (statusBarNotif == null) {
                        continue;
                    }
                    twitterScribeLog2 = (TwitterScribeLog)extras.getParcelable("notif_scribe_log");
                    final boolean boolean1 = extras.getBoolean("notif_scribe_action_tap");
                    if (twitterScribeLog2 != null && boolean1) {
                        final String a3 = twitterScribeLog2.a();
                        final String[] array2 = new String[n3];
                        array2[0] = a3 + "_tap";
                        twitterScribeLog2.b(array2);
                        a.a(twitterScribeLog2);
                        final String[] array3 = new String[n3];
                        array3[0] = a3;
                        twitterScribeLog2.b(array3);
                    }
                    final PendingIntent pendingIntent = (PendingIntent)extras.getParcelable("action_intent");
                    action = intent.getAction();
                    if (pendingIntent == null) {
                        n3 = 0;
                    }
                    final boolean boolean2 = extras.getBoolean("undo_allowed", false);
                    if (n3 != 0) {
                        this.a(pendingIntent);
                        continue;
                    }
                    if (boolean2) {
                        break;
                    }
                    a(applicationContext, extras);
                    this.a(applicationContext, extras, action);
                    continue;
                }
                if (statusBarNotif == null) {
                    continue;
                }
                a(applicationContext, extras);
                final PendingIntent pendingIntent2 = (PendingIntent)extras.getParcelable("action_intent");
                if (pendingIntent2 != null) {
                    this.a(pendingIntent2);
                    continue;
                }
                continue;
            }
        }
        a(applicationContext, statusBarNotif, extras.getString("undo_text"), extras.getInt("undo_icon", 0), twitterScribeLog2);
        this.l.sendMessageDelayed(this.l.obtainMessage(statusBarNotif.w(), (Object)new ak(this, n2, applicationContext, extras, action)), 5000L);
        return 3;
    }
}
