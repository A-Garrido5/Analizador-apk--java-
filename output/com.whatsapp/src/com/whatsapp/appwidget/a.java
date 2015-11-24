// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import com.whatsapp.a_9;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import com.whatsapp.App;
import com.whatsapp.z8;
import java.util.ArrayList;
import android.appwidget.AppWidgetManager;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

class a implements Runnable
{
    private final Context a;
    private final AtomicBoolean b;
    private final int[] c;
    private final AppWidgetManager d;
    
    a(final Context a, final AppWidgetManager d, final int[] c) {
        this.b = new AtomicBoolean();
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    static Context a(final a a) {
        return a.a;
    }
    
    private boolean a() {
        return this.b.get();
    }
    
    static int[] b(final a a) {
        return a.c;
    }
    
    static AppWidgetManager c(final a a) {
        return a.d;
    }
    
    private ArrayList c() {
        final int d = WidgetProvider.d;
        if (this.a()) {
            return null;
        }
        final ArrayList j = z8.j();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final String s : j) {
            if (this.a()) {
                return null;
            }
            final a_9 e = App.S.e(s);
            if (e.l > 0) {
                final ArrayList c = App.ak.c(s, Math.min(e.l, 100));
                if (c != null) {
                    list.addAll(c);
                }
            }
            if (d != 0) {
                break;
            }
        }
        Collections.sort(list, new b(this));
        return list;
    }
    
    public void b() {
        this.b.set(true);
    }
    
    @Override
    public void run() {
        final ArrayList c = this.c();
        if (c != null) {
            App.aq.a5().post((Runnable)new h(this, c));
        }
    }
}
