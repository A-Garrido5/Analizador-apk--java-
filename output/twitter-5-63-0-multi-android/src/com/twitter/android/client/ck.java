// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.ComponentName;
import android.appwidget.AppWidgetManager;
import android.database.Cursor;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import com.twitter.library.provider.k;
import android.content.Context;

public class ck
{
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    private int[] e;
    private int[] f;
    private int[] g;
    
    public ck(final int a, final int b, final int c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void a(final Context context, final int[] e) {
        // monitorenter(this)
        Label_0011: {
            if (e == null) {
                break Label_0011;
            }
            while (true) {
                while (true) {
                    int n = 0;
                    Label_0285: {
                        Cursor query = null;
                        ArrayList<Integer> list = null;
                        ArrayList<Integer> list2 = null;
                        ArrayList<Integer> list3 = null;
                        Label_0225: {
                            Integer value = null;
                            Label_0214: {
                                try {
                                    if (e.length == 0) {
                                        this.e = null;
                                        this.f = null;
                                        this.g = null;
                                    }
                                    else {
                                        String s;
                                        if (this.a == 2131165189) {
                                            s = String.valueOf(1);
                                        }
                                        else {
                                            s = String.valueOf(0);
                                        }
                                        query = k.a(context).getReadableDatabase().query("widget_settings", k.c, "widget_type=?", new String[] { s }, (String)null, (String)null, (String)null);
                                        if (query != null) {
                                            list = new ArrayList<Integer>();
                                            list2 = new ArrayList<Integer>();
                                            list3 = new ArrayList<Integer>();
                                            n = 0;
                                            if (!query.moveToNext()) {
                                                break Label_0225;
                                            }
                                            value = query.getInt(0);
                                            final String string = query.getString(1);
                                            final int int1 = query.getInt(2);
                                            if (TextUtils.isEmpty((CharSequence)string)) {
                                                break Label_0214;
                                            }
                                            if (!string.equals(this.d)) {
                                                break Label_0285;
                                            }
                                            if (int1 == 0) {
                                                list2.add(value);
                                                break Label_0285;
                                            }
                                            list3.add(value);
                                            break Label_0285;
                                        }
                                    }
                                    return;
                                }
                                finally {
                                }
                                // monitorexit(this)
                            }
                            list.add(value);
                            break Label_0285;
                        }
                        query.close();
                        if (n == 0) {
                            this.e = e;
                            this.f = null;
                            this.g = null;
                            return;
                        }
                        this.e = CollectionUtils.b((Collection)list);
                        this.f = CollectionUtils.b((Collection)list2);
                        this.g = CollectionUtils.b((Collection)list3);
                        return;
                    }
                    ++n;
                    continue;
                }
            }
        }
    }
    
    public int[] a() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public int[] a(final Context context) {
        if (this.a == 2131165189) {
            return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class)WidgetLargeProvider.class));
        }
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class)WidgetSmallProvider.class));
    }
    
    public int[] b() {
        synchronized (this) {
            return this.f;
        }
    }
    
    public int[] c() {
        synchronized (this) {
            return this.g;
        }
    }
}
