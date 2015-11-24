// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.library.client.Session;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import java.io.IOException;
import com.twitter.library.api.bh;
import com.twitter.library.util.a;
import android.accounts.AccountManager;
import com.twitter.util.d;
import java.util.HashMap;
import android.content.Context;

public class cj
{
    private static cj a;
    private final Context b;
    private final HashMap c;
    private boolean d;
    
    private cj(final Context b) {
        this.b = b;
        this.c = new HashMap();
    }
    
    public static cj a(final Context context) {
        synchronized (cj.class) {
            if (cj.a == null) {
                cj.a = new cj(context.getApplicationContext());
            }
            return cj.a;
        }
    }
    
    WidgetControl a(final long n) {
        synchronized (this.c) {
            return this.c.get(n);
        }
    }
    
    void a() {
        com.twitter.util.d.a();
        if (!this.d) {
            final AccountManager value = AccountManager.get(this.b);
            final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
            for (int length = accountsByType.length, i = 0; i < length; ++i) {
                final String userData = value.getUserData(accountsByType[i], "account_user_info");
                if (userData != null) {
                    try {
                        final TwitterUser b = bh.b(userData);
                        if (b == null) {
                            continue;
                        }
                        synchronized (this.c) {
                            WidgetControl widgetControl = this.c.get(b.userId);
                            if (widgetControl == null) {
                                widgetControl = new WidgetControl(this.b, b.username, b.userId);
                                this.c.put(b.userId, widgetControl);
                            }
                            widgetControl.b();
                        }
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    break;
                }
            }
            this.d = true;
        }
    }
    
    void a(final Intent intent) {
        final long longExtra = intent.getLongExtra("owner_id", 0L);
        final WidgetControl a = this.a(longExtra);
        if (a != null) {
            a.a(intent.getIntExtra("status_type", 0));
            com.twitter.android.client.c.a(this.b).a(longExtra, "widget::::click");
        }
    }
    
    public void a(final Session session, final boolean b) {
        com.twitter.util.d.a();
        final long g = session.g();
        if (g > 0L) {
            synchronized (this.c) {
                final WidgetControl widgetControl = this.c.get(g);
                if (widgetControl == null) {
                    final WidgetControl widgetControl2 = new WidgetControl(this.b, session.e(), g);
                    this.c.put(g, widgetControl2);
                    widgetControl2.b();
                    return;
                }
                // monitorexit(this.c)
                widgetControl.b(b);
            }
        }
    }
    
    Collection b() {
        synchronized (this.c) {
            final ArrayList<Object> list = new ArrayList<Object>(this.c.size());
            list.addAll(this.c.values());
            return Collections.unmodifiableCollection((Collection<?>)list);
        }
    }
    
    void b(final Intent intent) {
        final long longExtra = intent.getLongExtra("owner_id", 0L);
        final WidgetControl a = this.a(longExtra);
        if (a != null) {
            a.b(intent.getIntExtra("status_type", 0));
            com.twitter.android.client.c.a(this.b).a(longExtra, "widget::::click");
        }
    }
}
