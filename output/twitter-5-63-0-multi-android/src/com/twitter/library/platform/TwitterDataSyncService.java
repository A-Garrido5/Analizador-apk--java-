// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.accounts.AccountManager;
import android.content.SyncResult;
import android.os.IBinder;
import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import com.twitter.library.client.m;
import android.os.Parcelable;
import com.twitter.library.provider.ae;
import android.content.ContentResolver;
import android.accounts.Account;
import com.twitter.library.client.Session;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.client.k;
import android.content.Context;
import com.twitter.library.client.App;
import java.util.HashMap;
import android.app.IntentService;

public class TwitterDataSyncService extends IntentService
{
    public static final String a;
    private static final HashMap b;
    private static final Object c;
    private static a d;
    private static boolean e;
    
    static {
        a = App.a(".poll.data");
        b = new HashMap(3);
        c = new Object();
        TwitterDataSyncService.d = null;
        TwitterDataSyncService.b.put("sync_account", 1);
        TwitterDataSyncService.b.put("on_poll_alarm_ev", 2);
        TwitterDataSyncService.b.put("update_alarm", 3);
    }
    
    public TwitterDataSyncService() {
        super("SyncService");
    }
    
    private static long a(final Context context, final String s, final String s2) {
        return new k(context, s, "activity_times").getLong(s2, 0L);
    }
    
    public static void a(final Context context) {
        context.startService(new Intent(context, (Class)TwitterDataSyncService.class).setAction("update_alarm"));
    }
    
    public static void a(final Context context, final Bundle bundle, final Session session) {
        if (b(context)) {
            a(context, bundle, false, com.twitter.library.util.a.a(context, session.e()));
        }
    }
    
    public static boolean a(final Context context, final Bundle bundle, final boolean b, final Account account) {
        if (ContentResolver.getMasterSyncAutomatically() && ContentResolver.getSyncAutomatically(account, ae.c) && ContentResolver.getIsSyncable(account, ae.c) > 0) {
            c(context);
            ContentResolver.requestSync(account, ae.c, bundle);
            return true;
        }
        if (b) {
            c(context);
            context.startService(new Intent(context, (Class)TwitterDataSyncService.class).setAction("sync_account").putExtra("account", (Parcelable)account).putExtra("_data", bundle));
            return true;
        }
        return false;
    }
    
    public static boolean a(final Context context, final String s) {
        return c(context, s) < h(context, s);
    }
    
    static void b(final Context context, final String s) {
        b(context, s, "last_activity_sync");
    }
    
    private static void b(final Context context, final String s, final String s2) {
        final m a = new k(context, s, "activity_times").a();
        a.a(s2, System.currentTimeMillis());
        a.apply();
    }
    
    public static boolean b(final Context context) {
        return !TwitterDataSyncService.e && 60000L + d(context) < System.currentTimeMillis();
    }
    
    public static long c(final Context context, final String s) {
        return a(context, s, "last_activity_sync");
    }
    
    private static void c(final Context context) {
        j(context, "last_sync");
    }
    
    private static long d(final Context context) {
        return i(context, "last_sync");
    }
    
    static void d(final Context context, final String s) {
        b(context, s, "last_activity_push");
    }
    
    public static void e(final Context context, final String s) {
        if (s == null) {
            return;
        }
        new k(context, s, "instant_timeline_prefs").a().a("instant_timeline_prevent_home_sync", true).apply();
    }
    
    public static void f(final Context context, final String s) {
        if (s == null) {
            return;
        }
        new k(context, s, "instant_timeline_prefs").a().a("instant_timeline_prevent_home_sync", false).apply();
    }
    
    public static boolean g(final Context context, final String s) {
        boolean b = false;
        if (s != null) {
            final boolean boolean1 = new k(context, s, "instant_timeline_prefs").getBoolean("instant_timeline_prevent_home_sync", false);
            b = false;
            if (boolean1) {
                b = true;
            }
        }
        return b;
    }
    
    private static long h(final Context context, final String s) {
        return a(context, s, "last_activity_push");
    }
    
    private static long i(final Context context, final String s) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(s, 0L);
    }
    
    private static void j(final Context context, final String s) {
        final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong(s, System.currentTimeMillis());
        edit.apply();
    }
    
    public IBinder onBind(final Intent intent) {
        return TwitterDataSyncService.d.getSyncAdapterBinder();
    }
    
    public void onCreate() {
        super.onCreate();
        synchronized (TwitterDataSyncService.c) {
            if (TwitterDataSyncService.d == null) {
                TwitterDataSyncService.d = new a(this.getApplicationContext());
            }
        }
    }
    
    protected void onHandleIntent(final Intent intent) {
        if (intent != null) {
            final Integer n = TwitterDataSyncService.b.get(intent.getAction());
            if (n != null) {
                switch (n) {
                    default: {}
                    case 1: {
                        new a((Context)this).a((Account)intent.getParcelableExtra("account"), intent.getBundleExtra("_data"), new SyncResult());
                    }
                    case 2: {
                        if (ContentResolver.getMasterSyncAutomatically()) {
                            final a a = new a((Context)this);
                            final Bundle bundle = new Bundle();
                            bundle.putBoolean("show_notif", true);
                            bundle.putBoolean("fs_config", true);
                            if (PushService.c((Context)this)) {
                                bundle.putBoolean("messages", false);
                            }
                            for (final Account account : AccountManager.get((Context)this).getAccountsByType(com.twitter.library.util.a.a)) {
                                if (a.a(account)) {
                                    c((Context)this);
                                    ContentResolver.requestSync(account, ae.c, bundle);
                                }
                            }
                        }
                        com.twitter.library.platform.a.a((Context)this);
                    }
                    case 3: {
                        com.twitter.library.platform.a.a((Context)this);
                    }
                }
            }
        }
    }
}
