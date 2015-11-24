// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import android.text.TextUtils;
import java.util.Collections;
import android.database.Cursor;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.k;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.as;
import java.util.ArrayList;
import java.util.List;
import android.app.NotificationManager;
import android.content.Context;
import com.twitter.internal.android.service.a;

public class w extends a
{
    public final long a;
    public final String e;
    private final Context f;
    private final NotificationManager g;
    private int[] h;
    private int i;
    private String j;
    
    public w(final Context context, final long a, final String e) {
        super(w.class.getName());
        this.f = context.getApplicationContext();
        this.g = (NotificationManager)context.getSystemService("notification");
        this.a = a;
        this.e = e;
    }
    
    private List a(final long n, final String s, final String s2) {
        return this.a(n, s, s2, null);
    }
    
    private List a(final long n, final String s, final String s2, final String[] array) {
        return a(this.f, n, s, s2, array);
    }
    
    public static List a(final Context context, final long n, final String s, final String s2, final String[] array) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        final Cursor query = context.getContentResolver().query(ae.a(as.a, n), new String[] { "notif_id" }, s2, array, (String)null);
        if (query != null) {
            while (query.moveToNext()) {
                if (!query.isNull(0)) {
                    final int int1 = query.getInt(0);
                    if (int1 <= 0) {
                        continue;
                    }
                    notificationManager.cancel(int1);
                    list.add(int1);
                }
            }
            query.close();
        }
        notificationManager.cancel(0);
        list.add(0);
        final int a = k.a(context).a(s);
        if (a != -1) {
            notificationManager.cancel(a);
            list.add(a);
        }
        bg.a(context, n).c(s2, (String[])null);
        return list;
    }
    
    public w a(final String j) {
        this.j = j;
        return this;
    }
    
    public w a(final int[] h) {
        this.h = h;
        return this;
    }
    
    protected final List a() {
        return Collections.emptyList();
    }
    
    protected List b() {
        int i = 0;
        final long a = this.a;
        final String e = this.e;
        List<Integer> emptyList = null;
        switch (this.i) {
            default: {
                emptyList = Collections.emptyList();
                break;
            }
            case 0: {
                final int[] h = this.h;
                bg.a(this.f, a).a(h);
                emptyList = new ArrayList<Integer>(h.length);
                while (i < h.length) {
                    final int n = h[i];
                    this.g.cancel(n);
                    emptyList.add(n);
                    ++i;
                }
                break;
            }
            case 1: {
                return this.a(a, e, "type IN(4,3,5,2,12,6)");
            }
            case 2: {
                return this.a(a, e, "type=7 ");
            }
            case 3: {
                if (TextUtils.isEmpty((CharSequence)this.j)) {
                    return this.a(a, e, "type=13 ");
                }
                return this.a(a, e, "type=13 AND aggregation_data=?", new String[] { this.j });
            }
        }
        return emptyList;
    }
    
    public w c(final int i) {
        this.i = i;
        return this;
    }
}
