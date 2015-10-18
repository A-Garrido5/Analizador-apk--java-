// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import android.os.IBinder;
import java.util.Iterator;
import com.twitter.library.util.bq;
import android.accounts.Account;
import android.widget.Toast;
import android.accounts.AccountManager;
import com.twitter.library.network.OAuthToken;
import android.content.Intent;
import com.twitter.android.samsung.single.TwitterWidgetProvider;
import android.content.Context;
import com.twitter.android.samsung.single.i;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;
import android.app.Service;

@Deprecated
public class WidgetDataUpdateService extends Service
{
    private static String[] a;
    private static String c;
    private static long d;
    private final Map b;
    
    static {
        WidgetDataUpdateService.a = new String[] { "id", "th", "jp", "fi", "my", "kr", "se", "mx", "sg", "sa", "kw", "qa", "us", "br", "it", "de", "fr", "pl", "eg", "ph", "pe", "tr", "pt", "nl", "ru", "cn", "es", "ae", "in", "gb", "au", "ar", "za", "ca", "cl", "ve", "co", "ch" };
        WidgetDataUpdateService.c = "list:%s/%s filter:images";
    }
    
    public WidgetDataUpdateService() {
        this.b = new HashMap();
    }
    
    private String a(String s) {
        final String country = Locale.US.getCountry();
        for (int i = 0; i < WidgetDataUpdateService.a.length; ++i) {
            if (WidgetDataUpdateService.a[i].toLowerCase(Locale.getDefault()).equals(s.toLowerCase(Locale.getDefault()))) {
                return String.format(WidgetDataUpdateService.c, "SUL_List1", s);
            }
        }
        s = country;
        return String.format(WidgetDataUpdateService.c, "SUL_List1", s);
    }
    
    private void a(final int n) {
        if (i.d((Context)this) == null) {
            this.b(n);
            return;
        }
        this.d(n);
    }
    
    private void a(final long n) {
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.d);
        intent.putExtra("com.twitter.android.widget.extra_logged_out_search_id", n);
        this.sendBroadcast(intent);
    }
    
    public static void a(final Context context) {
        final Intent intent = new Intent("com.twitter.android.widget.single.update_logged_out");
        intent.setClass(context, (Class)WidgetDataUpdateService.class);
        context.startService(intent);
    }
    
    public static void a(final Context context, final int n) {
        if (i.c(context, n) <= 0L && System.currentTimeMillis() >= WidgetDataUpdateService.d) {
            WidgetDataUpdateService.d = 900000L + System.currentTimeMillis();
            final String a = i.a(context, n);
            if (a == null) {
                a(context);
                return;
            }
            a(context, a, n, WidgetDataUpdateService$FetchType.c);
        }
    }
    
    public static void a(final Context context, final int n, final WidgetDataUpdateService$FetchType widgetDataUpdateService$FetchType) {
        a(context, i.a(context, n), n, widgetDataUpdateService$FetchType);
    }
    
    private static void a(final Context context, final String s, final int n, final WidgetDataUpdateService$FetchType widgetDataUpdateService$FetchType) {
        final Intent intent = new Intent("com.twitter.android.widget.single.update_discover");
        intent.setClass(context, (Class)WidgetDataUpdateService.class);
        intent.putExtra("user", s);
        intent.putExtra("fetch_type", widgetDataUpdateService$FetchType.ordinal());
        intent.putExtra("appWidgetId", n);
        context.startService(intent);
    }
    
    private void a(final Intent intent, final int n) {
        final String string = intent.getExtras().getString("user");
        final int intExtra = intent.getIntExtra("appWidgetId", 0);
        final int intExtra2 = intent.getIntExtra("fetch_type", -1);
        WidgetDataUpdateService$FetchType b;
        if (intExtra2 >= 0) {
            b = WidgetDataUpdateService$FetchType.values()[intExtra2];
        }
        else {
            b = WidgetDataUpdateService$FetchType.b;
        }
        this.a(string, intExtra, b, n);
    }
    
    private void a(final f f, final WidgetDataUpdateService$FetchType widgetDataUpdateService$FetchType, final OAuthToken oAuthToken, final int n) {
        new b((Context)this, f, oAuthToken, widgetDataUpdateService$FetchType, new q(this, f, n)).execute((Object[])new Void[0]);
    }
    
    private void a(final String s, final int n, final WidgetDataUpdateService$FetchType widgetDataUpdateService$FetchType, final int n2) {
        while (true) {
            final f f;
            final p p4;
            Label_0084: {
                synchronized (this) {
                    if (i.a((Context)this, WidgetDataUpdateService$RequestType.b) < System.currentTimeMillis()) {
                        f = new f(s, WidgetDataUpdateService$RequestType.b, n);
                        p4 = new p(this, n, n2);
                        final e a = this.a(f);
                        if (a == null) {
                            break Label_0084;
                        }
                        a.a(p4);
                    }
                    return;
                }
            }
            final e e = new e();
            e.a(p4);
            this.b.put(f, e);
            final Account a2 = com.twitter.android.samsung.model.g.a((Context)this, s);
            if (a2 == null) {
                return;
            }
            final OAuthToken b = com.twitter.android.samsung.model.g.b(AccountManager.get((Context)this), a2);
            if (b == null) {
                com.twitter.android.samsung.model.g.b((Context)this, s);
                Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296357), 1).show();
                this.b.remove(f);
                return;
            }
            this.a(f, widgetDataUpdateService$FetchType, b, n2);
        }
    }
    
    private void b(final int n) {
        if (i.e((Context)this) == null) {
            this.c(n);
        }
        else if (i.a((Context)this, WidgetDataUpdateService$RequestType.d) < System.currentTimeMillis()) {
            final f f = new f(null, WidgetDataUpdateService$RequestType.d, 0);
            if (this.a(f) == null) {
                final e e = new e();
                e.a(new l(this, n));
                this.b.put(f, e);
                new d((Context)this, new m(this, f, n)).execute((Object[])new Void[0]);
            }
        }
    }
    
    private void c(final int n) {
        if (i.a((Context)this, WidgetDataUpdateService$RequestType.c) < System.currentTimeMillis()) {
            final f f = new f(null, WidgetDataUpdateService$RequestType.c, 0);
            if (this.a(f) == null) {
                final e e = new e();
                e.a(new n(this, n));
                this.b.put(f, e);
                new a((Context)this, new o(this, f, n)).execute((Object[])new Void[0]);
            }
        }
    }
    
    private static void c(final Context context, final int n) {
        final Intent intent = new Intent("com.twitter.android.widget.single.stop_widget");
        intent.setClass(context, (Class)WidgetDataUpdateService.class);
        intent.putExtra("com.twitter.android.widget.single.stop_id", n);
        context.startService(intent);
    }
    
    private void d(final int n) {
        synchronized (this) {
            if (!i.b((Context)this, WidgetDataUpdateService$RequestType.a)) {
                final f f = new f(null, WidgetDataUpdateService$RequestType.a, 0);
                if (this.a(f) == null) {
                    final e e = new e();
                    e.a(new r(this, n));
                    this.b.put(f, e);
                    new h((Context)this, f, bq.a.nextLong(), this.a(Locale.getDefault().getCountry()), new s(this, f, n)).execute((Object[])new Void[0]);
                }
            }
        }
    }
    
    private void e(final int n) {
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.b);
        intent.putExtra("appWidgetId", n);
        this.sendBroadcast(intent);
    }
    
    public e a(final f f) {
        for (final f f2 : this.b.keySet()) {
            if (f2.equals(f)) {
                return (e)this.b.get(f2);
            }
        }
        return null;
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        if (intent != null) {
            final String action = intent.getAction();
            if (action.equals("com.twitter.android.widget.single.update_logged_out")) {
                this.a(n2);
            }
            else if (action.equals("com.twitter.android.widget.single.stop_widget")) {
                this.stopSelf(intent.getIntExtra("com.twitter.android.widget.single.stop_id", -1));
            }
            else if (action.equals("com.twitter.android.widget.single.update_discover")) {
                this.a(intent, n2);
            }
        }
        return super.onStartCommand(intent, n, n2);
    }
}
