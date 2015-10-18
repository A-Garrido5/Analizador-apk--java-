// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.DialogActivity;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.android.DraftsActivity;
import android.content.ComponentName;
import com.twitter.android.UrlInterpreterActivity;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import com.twitter.android.platform.TwitterAccessCwcNotificationReceiver;
import com.twitter.android.highlights.e;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import android.content.res.Resources;
import com.twitter.android.LoginActivity;
import android.app.Notification;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.MainActivity;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.android.client.notifications.GenericNotif;
import com.twitter.android.client.notifications.MagicRecNotif;
import com.twitter.android.client.notifications.MagicRecFollowNotif;
import com.twitter.android.client.notifications.MagicRecTweetNotif;
import com.twitter.android.client.notifications.StoriesNotif;
import com.twitter.library.service.w;
import com.twitter.android.client.notifications.LifelineTweetNotif;
import com.twitter.android.client.notifications.DeviceTweetNotif;
import com.twitter.android.client.notifications.MediaTagNotif;
import com.twitter.android.client.notifications.FollowRequestNotif;
import com.twitter.android.client.notifications.FollowNotif;
import com.twitter.android.client.notifications.RetweetNotif;
import com.twitter.android.client.notifications.FavoriteNotif;
import com.twitter.android.client.notifications.MentionNotif;
import com.twitter.android.AgeGateActivity;
import com.twitter.android.client.notifications.LoginVerificationNotif;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import com.twitter.library.provider.n;
import java.io.Serializable;
import com.twitter.library.provider.bf;
import com.twitter.android.EditProfileActivity;
import com.twitter.android.EditProfileWithAvatarDrawerActivity;
import com.twitter.android.avatars.b;
import android.os.Bundle;
import android.accounts.Account;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.library.platform.PushService;
import com.twitter.library.provider.k;
import com.twitter.library.util.a;
import com.twitter.library.platform.d;
import com.twitter.android.client.notifications.DMNotif;
import com.twitter.library.platform.DataSyncResult;
import com.twitter.android.client.notifications.StatusBarNotif;
import android.text.TextUtils;
import android.graphics.Bitmap;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.UserImageRequest;
import android.content.Intent;
import com.twitter.library.client.Session;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.ArrayList;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import java.util.Map;
import java.util.List;
import com.twitter.library.client.as;
import android.util.SparseArray;
import com.twitter.library.client.ay;
import java.util.HashMap;
import com.twitter.library.client.az;
import android.app.NotificationManager;
import android.content.Context;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.manager.m;

public class x implements m
{
    private static final boolean a;
    private static x b;
    @Deprecated
    private final c c;
    private q d;
    private final Context e;
    private NotificationManager f;
    private az g;
    private final HashMap h;
    private final ac i;
    private final ay j;
    private final SparseArray k;
    private final SparseArray l;
    private as m;
    private final List n;
    private final Map o;
    private final Handler p;
    
    static {
        a = (App.l() && Log.isLoggable("NotificationController", 3));
    }
    
    protected x(final Context context) {
        this(context, com.twitter.android.client.c.a(context), az.a(context), q.a(context), as.a(context));
    }
    
    private x(final Context e, final c c, final az g, final q d, final as m) {
        this.h = new HashMap();
        this.k = new SparseArray();
        this.l = new SparseArray();
        this.n = new ArrayList();
        this.p = new Handler(Looper.getMainLooper());
        this.b(this.e = e);
        this.c = c;
        this.g = g;
        this.d = d;
        this.m = m;
        this.i = new ac(this, null);
        this.j = new ad(this, null);
        this.o = new HashMap();
    }
    
    private NotificationCompat$Builder a(final int n, final PendingIntent pendingIntent) {
        return this.a(this.e.getString(n), pendingIntent);
    }
    
    private NotificationCompat$Builder a(final String s, final PendingIntent contentIntent) {
        return new NotificationCompat$Builder(this.e).setSmallIcon(2130839309).setColor(this.e.getResources().getColor(2131689615)).setTicker(s).setContentTitle(s).setContentIntent(contentIntent);
    }
    
    private ah a(final Session session, final ah ah, final ai ai) {
        final String string = this.e.getString(ai.h);
        final NotificationCompat$Builder setAutoCancel = new NotificationCompat$Builder(this.e).setSmallIcon(2130839309).setColor(this.e.getResources().getColor(2131689615)).setTicker(string).setContentTitle(string).setContentText(ai.g).setAutoCancel(ai.a);
        // monitorenter(this)
        while (true) {
            while (true) {
                Intent c = null;
                Label_0083: {
                    if (ai.c != null) {
                        c = ai.c;
                        break Label_0083;
                    }
                    Label_0356: {
                        break Label_0356;
                    Label_0338_Outer:
                        while (true) {
                            while (true) {
                                Label_0403: {
                                    try {
                                        String a = ah.a;
                                        while (true) {
                                            this.p.removeCallbacks((Runnable)this.o.remove(a));
                                            if (ai.d) {
                                                final y y = new y(this, a, setAutoCancel);
                                                this.o.put(a, y);
                                                this.p.postDelayed((Runnable)y, 1000L);
                                            }
                                            else {
                                                this.f.notify(a, 1001, setAutoCancel.build());
                                            }
                                            if (ai.f) {
                                                final NotificationCompat$Builder notificationCompat$Builder = setAutoCancel;
                                                return new ah(a, notificationCompat$Builder);
                                            }
                                            break Label_0403;
                                            c = new Intent();
                                            break;
                                            a = "tweet-default";
                                            continue Label_0338_Outer;
                                        }
                                    }
                                    finally {
                                    }
                                    // monitorexit(this)
                                }
                                final NotificationCompat$Builder notificationCompat$Builder = null;
                                continue;
                            }
                        }
                    }
                }
                setAutoCancel.setContentIntent(PendingIntent.getActivity(this.e, 0, c, 0));
                final TwitterUser f = session.f();
                if (f != null) {
                    final Bitmap b = this.d.b(UserImageRequest.a(f.profileImageUrl, -3));
                    if (b != null) {
                        setAutoCancel.setLargeIcon(b);
                    }
                }
                if (ai.f) {
                    setAutoCancel.setProgress(0, 100, true).setOngoing(false);
                }
                if (ai.b != null) {
                    setAutoCancel.addAction(2130838641, this.e.getString(2131296445), PendingIntent.getService(this.e, 0, ai.b, 1073741824));
                }
                if (ai.e != null) {
                    setAutoCancel.addAction(2130838658, this.e.getString(2131297312), PendingIntent.getService(this.e, 0, ai.e, 1073741824));
                }
                if (ah != null) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public static x a(final Context context) {
        synchronized (x.class) {
            if (x.b == null) {
                x.b = new x(context.getApplicationContext());
            }
            return x.b;
        }
    }
    
    private void a(final PendingIntent pendingIntent, final String s, final String contentText) {
        final NotificationCompat$Builder setPriority = this.a(s, pendingIntent).setContentText(contentText).setAutoCancel(true).setPriority(1);
        final String c = com.twitter.util.c.c(this.e);
        if (!TextUtils.isEmpty((CharSequence)c)) {
            setPriority.setSubText(c);
        }
        this.f.notify("NonReleaseNotifications", 0, setPriority.build());
    }
    
    private void a(final ae ae, final StatusBarNotif statusBarNotif) {
        this.a(ae, statusBarNotif, null);
    }
    
    private void a(final StatusBarNotif statusBarNotif, final Bitmap bitmap) {
        this.a(ae.a, statusBarNotif, bitmap);
    }
    
    private void a(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d h = dataSyncResult.h;
        final int d = dataSyncResult.d;
        if (h != null && h.b > 0 && (n & 0x4) != 0x0 && (d & 0x4) != 0x0) {
            final Session b = this.g.b();
            if (dataSyncResult.a.equals(b.e())) {
                this.m.a(new com.twitter.library.api.conversations.ai(this.e, b));
            }
            if (!this.a(h, d, dataSyncResult.b, dataSyncResult.a) && h.g != 0L) {
                final DMNotif s = new DMNotif(h, dataSyncResult.b, dataSyncResult.a);
                this.a(ae, s);
                h.s = s;
            }
        }
    }
    
    private void a(final String s, final boolean b, final boolean b2) {
        final Account a = com.twitter.library.util.a.a(this.e, s);
        if (a != null) {
            final k a2 = com.twitter.library.provider.k.a(this.e);
            int n;
            if (b2) {
                n = 1;
            }
            else {
                n = 0;
            }
            a2.a(s, "notif_tweet", n);
            if (PushService.c(this.e)) {
                if (b2 && b) {
                    PushService.e(this.e);
                }
                final int b3 = PushService.b(this.e, a);
                final int a3 = NotificationSetting.g.a(1);
                int n2;
                if (b2) {
                    n2 = (b3 | a3);
                }
                else {
                    n2 = (b3 & ~a3);
                }
                this.c.a(a, n2);
            }
        }
    }
    
    private boolean a(final d d, final int n, final long n2, final String s) {
        for (int i = -1 + this.n.size(); i >= 0; --i) {
            final aj aj = this.n.get(i);
            if ((n & aj.y()) != 0x0 && aj.a(d, n2)) {
                this.a(new int[] { d.p }, s);
                return true;
            }
        }
        return false;
    }
    
    private Intent b(final Bundle bundle, final Session session) {
        final String value = String.valueOf(session.g());
        final Context e = this.e;
        Serializable s;
        if (com.twitter.android.avatars.b.b()) {
            s = EditProfileWithAvatarDrawerActivity.class;
        }
        else {
            s = EditProfileActivity.class;
        }
        final Intent setData = new Intent(e, (Class)s).putExtra("failure", true).putExtra("AbsFragmentActivity_account_name", session.e()).putExtra("avatar_media", bundle.getParcelable("avatar_media")).putExtra("header_media", bundle.getParcelable("header_media")).setData(bf.b.buildUpon().appendEncodedPath(value).appendQueryParameter("ownerId", value).build());
        if (bundle.containsKey("name") || bundle.containsKey("desc") || bundle.containsKey("url") || bundle.containsKey("place")) {
            setData.putExtra("update_profile", true).putExtra("name", bundle.getString("name")).putExtra("description", bundle.getString("desc")).putExtra("url", bundle.getString("url")).putExtra("location", bundle.getString("place"));
        }
        setData.setFlags(268435456);
        return setData;
    }
    
    private ae b(final String s, final String s2) {
        int n = 1;
        final ContentResolver contentResolver = this.e.getContentResolver();
        final Uri withAppendedPath = Uri.withAppendedPath(com.twitter.library.provider.n.a, s);
        final String[] array = { "vibrate", null, null };
        array[n] = "ringtone";
        array[2] = "light";
        final Cursor query = contentResolver.query(withAppendedPath, array, (String)null, (String[])null, (String)null);
        String s3 = com.twitter.library.provider.n.b;
        int n2;
        if (query != null) {
            if (query.moveToFirst()) {
                if (!query.isNull(0)) {
                    if (query.getInt(0) == n) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                }
                else {
                    n2 = n;
                }
                if (!query.isNull(n)) {
                    s3 = query.getString(n);
                }
                if (!query.isNull(2) && query.getInt(2) != n) {
                    n = 0;
                }
            }
            else {
                n2 = n;
            }
            query.close();
        }
        else {
            n2 = n;
        }
        final boolean equals = "none".equals(s2);
        String s4 = null;
        if (!equals) {
            s4 = s3;
        }
        return new ae(n != 0, s4, n2 != 0);
    }
    
    private void b(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d k = dataSyncResult.k;
        final int d = dataSyncResult.d;
        if (k == null || k.b <= 0 || (n & 0x8) == 0x0 || (d & 0x40) == 0x0 || this.a(k, d, dataSyncResult.b, dataSyncResult.a)) {
            return;
        }
        final LoginVerificationNotif s = new LoginVerificationNotif(k, dataSyncResult.b, dataSyncResult.a);
        this.a(ae, s);
        k.s = s;
    }
    
    private Intent c(final Bundle bundle, final Session session) {
        final String value = String.valueOf(session.g());
        final Intent setData = new Intent(this.e, (Class)AgeGateActivity.class).putExtra("user_id", bundle.getLong("user_id")).putExtra("user_name", bundle.getString("username")).putExtra("impression_id", bundle.getString("impression_id")).putExtra("is_earned", bundle.getBoolean("earned")).putExtra("age_gate_timestamp", bundle.getLong("age_before_timestamp")).setData(bf.b.buildUpon().appendEncodedPath(value).appendQueryParameter("ownerId", value).build());
        setData.setFlags(268435456);
        return setData;
    }
    
    private void c(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        int n2 = 1;
        final d j = dataSyncResult.j;
        final int d = dataSyncResult.d;
        int n3;
        if ((d & 0x2) != 0x0) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        int n4;
        if ((d & 0x8) != 0x0) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        int n5;
        if ((d & 0x10) != 0x0) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        int n6;
        if ((d & 0x20) != 0x0) {
            n6 = n2;
        }
        else {
            n6 = 0;
        }
        int n7;
        if ((d & 0x200) != 0x0) {
            n7 = n2;
        }
        else {
            n7 = 0;
        }
        if ((n & 0x2) == 0x0 || (n3 == 0 && n4 == 0 && n5 == 0 && n6 == 0 && n7 == 0)) {
            n2 = 0;
        }
        if (j != null && j.b > 0 && (n & 0x2) != 0x0 && n2 != 0 && !this.a(j, d, dataSyncResult.b, dataSyncResult.a)) {
            StatusBarNotif s;
            if (n3 != 0 && (0x1 & dataSyncResult.e) != 0x0) {
                s = new MentionNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else if (n5 != 0 && (0x2 & dataSyncResult.e) != 0x0) {
                s = new FavoriteNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else if (n4 != 0 && (0x8 & dataSyncResult.e) != 0x0) {
                s = new RetweetNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else if (n6 != 0 && (0x4 & dataSyncResult.e) != 0x0) {
                s = new FollowNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else if (n6 != 0 && (0x20 & dataSyncResult.e) != 0x0) {
                s = new FollowRequestNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else if (n7 != 0 && (0x200 & dataSyncResult.e) != 0x0) {
                s = new MediaTagNotif(j, dataSyncResult.b, dataSyncResult.a);
            }
            else {
                s = null;
            }
            if (s != null) {
                this.a(ae, s);
                j.s = s;
            }
        }
    }
    
    private void d(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d g = dataSyncResult.g;
        final int d = dataSyncResult.d;
        if (g == null || g.b <= 0 || (n & 0x1) == 0x0 || (d & 0x1) == 0x0 || this.a(g, d, dataSyncResult.b, dataSyncResult.a)) {
            return;
        }
        final DeviceTweetNotif s = new DeviceTweetNotif(g, dataSyncResult.b, dataSyncResult.a);
        this.a(ae, s);
        g.s = s;
    }
    
    private int e(final String s) {
        final Integer n = this.h.get(s);
        if (n == null) {
            return 127;
        }
        return n;
    }
    
    private void e(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d l = dataSyncResult.l;
        final int d = dataSyncResult.d;
        if (l == null || l.b <= 0 || (n & 0x10) == 0x0 || (d & 0x80) == 0x0 || this.a(l, d, dataSyncResult.b, dataSyncResult.a)) {
            return;
        }
        final LifelineTweetNotif s = new LifelineTweetNotif(l, dataSyncResult.b, dataSyncResult.a);
        this.a(ae, s);
        l.s = s;
    }
    
    private w f(final String s) {
        return (w)new w(this.e, this.g.b(s).g(), s).a(this.i);
    }
    
    private void f(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d m = dataSyncResult.m;
        if (m == null || (n & 0x20) == 0x0 || this.a(m, dataSyncResult.d, dataSyncResult.b, dataSyncResult.a)) {
            return;
        }
        m.p = 1011;
        final StoriesNotif s = new StoriesNotif(m, dataSyncResult.b, dataSyncResult.a);
        this.a(ae, s);
        m.s = s;
    }
    
    private void g(final DataSyncResult dataSyncResult, final ae ae, final int n) {
        final d n2 = dataSyncResult.n;
        final int d = dataSyncResult.d;
        if (n2 == null || n2.b <= 0 || (n & 0x40) == 0x0 || (d & 0x100) == 0x0 || this.a(n2, d, dataSyncResult.b, dataSyncResult.a)) {
            return;
        }
        final boolean a = MagicRecTweetNotif.a(n2);
        final boolean a2 = MagicRecFollowNotif.a(n2);
        int n3;
        if (a || a2) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        while (true) {
            Label_0235: {
                if (n3 == 0) {
                    break Label_0235;
                }
                StatusBarNotif s;
                if (a) {
                    s = new MagicRecTweetNotif(n2, dataSyncResult.b, dataSyncResult.a);
                }
                else {
                    s = new MagicRecFollowNotif(n2, dataSyncResult.b, dataSyncResult.a);
                }
                MagicRecNotif.a(s, this.e, "magic_rec_data_received", null);
                if (!com.twitter.library.experiments.c.a() || !com.twitter.library.experiments.c.b()) {
                    break Label_0235;
                }
                if (!com.twitter.library.experiments.c.c()) {
                    MagicRecNotif.a(s, this.e, "unsupported", "low_api");
                    break Label_0235;
                }
                if (s == null) {
                    s = new GenericNotif(n2, dataSyncResult.b, dataSyncResult.a);
                    ae.d = false;
                }
                this.a(ae, s);
                n2.s = s;
                return;
            }
            StatusBarNotif s = null;
            continue;
        }
    }
    
    public Bitmap a(final j j, final ab ab) {
        final Bitmap b = this.d.b(j);
        if (b == null) {
            j.a(ab);
            j.a(this);
            this.d.a(j);
        }
        return b;
    }
    
    public ah a(final Session session, final long n, final long n2, final String g, final int h) {
        final ah ah = new ah(n, n2);
        final ai ai = new ai(null);
        ai.a = true;
        ai.d = true;
        ai.f = true;
        ai.g = g;
        ai.h = h;
        return this.a(session, ah, ai);
    }
    
    public ah a(final Session session, final long n, final long n2, final String s, final int n3, final boolean b) {
        return this.b(session, new ah(n, n2), n2, s, n3, b);
    }
    
    public ah a(final Session session, final ah ah, final long n, final String g, final int h, final boolean b) {
        final ai ai = new ai(null);
        ai.g = g;
        ai.h = h;
        final long g2 = session.g();
        if (b) {
            ai.b = AppService.a(this.e, n, g2, g);
        }
        else {
            ai.c = new Intent(this.e, (Class)MainActivity.class).putExtra("scroll_to_top", true);
        }
        final ah ah2 = new ah(g2, n);
        if (ah != null && !ah2.a.equals(ah.a)) {
            this.a(ah);
        }
        return this.a(session, ah2, ai);
    }
    
    public ah a(final Session session, final ah ah, final String g, final int h) {
        final ai ai = new ai(null);
        ai.a = true;
        ai.g = g;
        ai.h = h;
        final ah a = this.a(session, ah, ai);
        this.p.postDelayed((Runnable)new z(this, a), 1000L);
        return a;
    }
    
    public void a() {
        if (!com.twitter.android.az.f()) {
            return;
        }
        final Context e = this.e;
        int priority;
        if (App.a()) {
            priority = -2;
        }
        else {
            priority = 1;
        }
        this.f.notify("NonReleaseNotifications", 1, new NotificationCompat$Builder(e).setSmallIcon(2130839294).setColor(this.e.getResources().getColor(2131689615)).setContentTitle("Twitter bug reporter").setContentText("Tap to file a bug report").setContentIntent(PendingIntent.getBroadcast(e, 0, com.twitter.android.az.a, 134217728)).setOngoing(true).setPriority(priority).setWhen(0L).build());
    }
    
    void a(final int n, final Session session) {
        this.f.notify(new af().a(session.g()).toString(), 1004, this.a(n, PendingIntent.getActivity(this.e, 0, new Intent(), 0)).setOngoing(true).build());
    }
    
    public void a(final Bundle bundle, final Session session) {
        final Context e = this.e;
        this.f.notify(new af().a(session.g()).toString(), 1007, this.a(e.getString(2131296310), PendingIntent.getActivity(e, 0, this.c(bundle, session), 268435456)).setAutoCancel(true).build());
    }
    
    void a(final ae ae, final StatusBarNotif statusBarNotif, final Bitmap bitmap) {
        final int w = statusBarNotif.w();
        for (final int n : statusBarNotif.O()) {
            if (n != w) {
                if (x.a) {
                    Log.d("NotificationController", "Notification already displaying, removing old one");
                }
                this.k.remove(n);
                this.f.cancel(n);
            }
        }
        final Notification a = statusBarNotif.a(this.e, this, ae, bitmap);
        if (statusBarNotif.s() && !statusBarNotif.t()) {
            statusBarNotif.a(ae);
            if (this.l.get(statusBarNotif.w()) == null) {
                if (x.a) {
                    Log.d("NotificationController", "Preloading began for notification " + statusBarNotif.w());
                }
                this.l.put(statusBarNotif.w(), (Object)statusBarNotif);
            }
        }
        if (a != null) {
            this.k.put(w, (Object)statusBarNotif);
            this.g.a(this.j);
            this.f.notify(w, a);
            statusBarNotif.u();
            if (x.a) {
                Log.d("NotificationController", "NotificationManager has been told to notify id " + w);
            }
            int n2;
            if (ae == ae.a) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                if (MagicRecTweetNotif.a(statusBarNotif) || MagicRecFollowNotif.a(statusBarNotif)) {
                    String s;
                    if (statusBarNotif instanceof MagicRecNotif) {
                        s = "rich";
                    }
                    else {
                        s = "simple";
                    }
                    MagicRecNotif.a(statusBarNotif, this.e, "impression", s);
                }
                else {
                    final TwitterScribeLog a2 = statusBarNotif.a("impression");
                    if (a2 != null) {
                        ScribeService.a(this.e, a2);
                    }
                }
                if (statusBarNotif instanceof DeviceTweetNotif) {
                    final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.g.b().g());
                    twitterScribeLog.b(new String[] { "notification:status_bar::device_follow:impression" });
                    this.c.a(twitterScribeLog);
                }
            }
            if (statusBarNotif.P()) {
                if (fh.a()) {
                    final TwitterScribeLog a3 = statusBarNotif.a("preview_impression_image_loaded");
                    if (a3 != null) {
                        ScribeService.a(this.e, a3);
                    }
                }
            }
            else if (statusBarNotif.g() && fh.a()) {
                final TwitterScribeLog a4 = statusBarNotif.a("preview_impression");
                if (a4 != null) {
                    ScribeService.a(this.e, a4);
                }
            }
        }
    }
    
    public void a(final ag ag, final ae ae) {
        ag.e.a(ae);
        this.m.a(ag);
    }
    
    public void a(final ah ah) {
        synchronized (this) {
            this.p.removeCallbacks((Runnable)this.o.remove(ah.a));
            this.f.cancel(ah.a, 1001);
        }
    }
    
    public void a(final ah ah, final int n) {
        final NotificationCompat$Builder b = ah.b;
        if (b != null) {
            b.setProgress(10000, n, false);
            this.f.notify(ah.a, 1001, b.build());
        }
    }
    
    public void a(final aj aj) {
        this.n.add(aj);
    }
    
    void a(final StatusBarNotif statusBarNotif) {
        this.a(statusBarNotif, null);
    }
    
    public void a(final Session session) {
        final Context e = this.e;
        final PendingIntent activity = PendingIntent.getActivity(e, 0, new Intent(e, (Class)LoginActivity.class).putExtra("screen_name", session.e()), 0);
        final Resources resources = e.getResources();
        this.f.notify(new af().a(session.g()).toString(), 1008, this.a(resources.getString(2131297511, new Object[] { session.e() }), activity).setContentText(resources.getString(2131297510)).setAutoCancel(true).setPriority(1).build());
    }
    
    public void a(final p p) {
        final j j = (j)p.b();
        if (x.a) {
            Log.d("NotificationController", "Handling loaded image request: " + j);
        }
        final ab ab = (ab)j.u();
        final Bitmap bitmap = (Bitmap)p.c();
        if (!this.a(ab.a, j, bitmap) && bitmap != null) {
            final StatusBarNotif statusBarNotif = (StatusBarNotif)this.k.get(ab.a);
            if (statusBarNotif != null && !statusBarNotif.s()) {
                if (ab.b) {
                    statusBarNotif.a(true);
                }
                this.a(statusBarNotif, bitmap);
            }
        }
        if (x.a) {
            Log.d("NotificationController", "Image(s) loaded.");
        }
        j.a((al)null);
    }
    
    public void a(final DataSyncResult dataSyncResult) {
        final String a = dataSyncResult.a;
        final int d = dataSyncResult.d;
        if (TextUtils.isEmpty((CharSequence)a) || d == 0) {
            return;
        }
        com.twitter.android.highlights.e.a(dataSyncResult.b, new com.twitter.library.client.k(this.e, a), this.e, this.c, ScribeLog.a("notification", "status_bar", null, "highlights", "auto_opt_in"));
        final int e = this.e(a);
        final ae b = this.b(a, dataSyncResult.f);
        this.a(dataSyncResult, b, e);
        this.b(dataSyncResult, b, e);
        this.c(dataSyncResult, b, e);
        this.d(dataSyncResult, b, e);
        this.e(dataSyncResult, b, e);
        if (com.twitter.android.highlights.e.a(dataSyncResult.b)) {
            this.f(dataSyncResult, b, e);
        }
        else if (x.a) {
            Log.w("NotificationController", "Received Highlights push payload, but feature switch is disabled. Ignoring push payload.");
        }
        this.g(dataSyncResult, b, e);
    }
    
    public void a(final String s, final int n) {
        this.h.put(s, n | this.e(s));
    }
    
    public void a(final String s, final String s2) {
        this.m.a(this.f(s).c(3).a(s2));
    }
    
    public void a(final String s, final String s2, final String s3) {
        final String format = String.format(s3, s);
        this.f.notify(1010, this.a(s2, TwitterAccessCwcNotificationReceiver.a(this.e, "type_event_start_cricket_activity", 2)).setContentText(format).setStyle(new NotificationCompat$BigTextStyle().bigText(format)).setWhen(0L).setAutoCancel(true).addAction(2130838847, this.e.getString(2131297929), TwitterAccessCwcNotificationReceiver.a(this.e, "type_event_disable", 0)).build());
    }
    
    public void a(final String s, final boolean b) {
        this.a(s, b, true);
    }
    
    void a(final boolean b, final int n, final Bundle bundle, final Session session) {
        final NotificationManager f = this.f;
        final String string = new af().a(session.g()).toString();
        if (b) {
            f.notify(string, 1004, this.a(n, PendingIntent.getActivity(this.e, 0, new Intent(), 0)).setAutoCancel(true).build());
            this.p.postDelayed((Runnable)new aa(this, f, string), 1000L);
            return;
        }
        if (session.d() && !TextUtils.isEmpty((CharSequence)session.e())) {
            f.notify(string, 1004, this.a(n, PendingIntent.getActivity(this.e, 0, this.b(bundle, session), 268435456)).setAutoCancel(true).build());
            return;
        }
        f.cancel(string, 1004);
    }
    
    public void a(final int[] array, final String s) {
        this.m.a(this.f(s).a(array).c(0));
    }
    
    boolean a(final int n, final j j, final Bitmap bitmap) {
        final StatusBarNotif statusBarNotif = (StatusBarNotif)this.l.get(n);
        if (statusBarNotif == null) {
            return false;
        }
        if (statusBarNotif.a(j, bitmap)) {
            if (x.a) {
                Log.d("NotificationController", "Image successfully preloaded: " + j.a());
            }
            if (statusBarNotif.t()) {
                final ae q = statusBarNotif.Q();
                if (q != null) {
                    if (x.a) {
                        Log.d("NotificationController", "Content is all preloaded, proceeding to notify.");
                    }
                    final Object value = this.k.get(n);
                    boolean b = false;
                    if (value != null) {
                        b = true;
                    }
                    if (b) {
                        this.a(statusBarNotif);
                    }
                    else {
                        this.a(q, statusBarNotif);
                    }
                }
                this.l.remove(n);
            }
        }
        else {
            if (x.a) {
                Log.w("NotificationController", "Image failed to preload: " + j.a());
            }
            this.l.remove(n);
        }
        return true;
    }
    
    boolean a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final ComponentName resolveActivity = new Intent("android.intent.action.VIEW", Uri.parse(s)).resolveActivity(this.e.getPackageManager());
            if (resolveActivity != null && UrlInterpreterActivity.class.getName().equals(resolveActivity.getClassName())) {
                return true;
            }
        }
        return false;
    }
    
    public ah b(final Session session, final ah ah, final long n, final String g, final int h, final boolean b) {
        final ai ai = new ai(null);
        ai.a = true;
        ai.g = g;
        ai.h = h;
        ai.c = DraftsActivity.a(this.e, true, session.e(), 0L);
        if (b) {
            ai.e = AppService.b(this.e, n, session.g(), g);
        }
        return this.a(session, ah, ai);
    }
    
    public void b() {
        if (!com.twitter.android.az.f()) {
            return;
        }
        this.f.cancel("NonReleaseNotifications", 1);
    }
    
    public void b(final Context context) {
        this.f = (NotificationManager)context.getSystemService("notification");
    }
    
    public void b(final aj aj) {
        this.n.remove(aj);
    }
    
    public void b(final DataSyncResult dataSyncResult) {
        final d n = dataSyncResult.n;
        if (!this.a(n.k)) {
            ErrorReporter.a(new InvalidDataException("Invalid logged out notification uri: " + n.k));
            return;
        }
        this.f.notify(1012, this.a(n.d, PendingIntent.getActivity(this.e, 0, new Intent(this.e, (Class)UrlInterpreterActivity.class).setAction("android.intent.action.VIEW").setData(Uri.parse(n.k)).setFlags(268435456), 268435456)).setContentText(n.e).setStyle(new NotificationCompat$BigTextStyle().bigText(n.e)).setAutoCancel(true).setDefaults(2).setPriority(1).build());
    }
    
    void b(final String s) {
        this.a(PendingIntent.getActivity(this.e, 0, this.e.getPackageManager().getLaunchIntentForPackage(s), 0), "New dogfood update available", "Tap to install");
    }
    
    public void b(final String s, final int n) {
        this.h.put(s, this.e(s) & ~n);
    }
    
    public void c() {
        this.f.cancel(1011);
    }
    
    public void c(final String s) {
        this.a(s, false, false);
    }
    
    public void d() {
        final Context e = this.e;
        final Intent setFlags = new Intent(e, (Class)DialogActivity.class).putExtra("scribe_page", "notification").setAction("ff").setFlags(335544320);
        final String string = e.getString(2131297611);
        this.f.notify(new af().a(this.g.b().g()).toString(), 1000, new NotificationCompat$Builder(e).setSmallIcon(2130839297).setColor(this.e.getResources().getColor(2131689615)).setTicker(string).setContentTitle(string).setContentText(e.getString(2131297610)).setContentIntent(PendingIntent.getActivity(e, 0, setFlags, 0)).setAutoCancel(true).build());
        this.c.b(System.currentTimeMillis());
    }
    
    public void d(final String s) {
        this.m.a(this.f(s).c(1));
    }
    
    public void e() {
        this.f.cancel(1010);
    }
    
    void f() {
        this.a(PendingIntent.getActivity(this.e, 0, new Intent("android.intent.action.VIEW").setData(Uri.parse("https://betas.to/NpMBxyyL")), 0), "Switch to Beta by Crashlytics to update Dogfood", "Tap to visit webpage to download Beta");
    }
}
