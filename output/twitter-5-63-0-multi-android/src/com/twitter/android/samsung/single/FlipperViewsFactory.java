// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.model.WidgetViewModel$ModelType;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.Iterator;
import com.twitter.library.media.manager.o;
import com.twitter.library.media.manager.al;
import com.twitter.android.samsung.model.WidgetViewModel;
import com.twitter.internal.android.util.Size;
import java.util.ArrayList;
import com.twitter.android.samsung.data.j;
import android.content.Intent;
import com.twitter.library.media.manager.m;
import com.twitter.library.media.manager.q;
import android.content.Context;
import java.util.List;
import android.util.SparseBooleanArray;
import android.widget.RemoteViewsService$RemoteViewsFactory;

@Deprecated
public class FlipperViewsFactory implements RemoteViewsService$RemoteViewsFactory
{
    private static final SparseBooleanArray c;
    List a;
    List b;
    private List d;
    private final Context e;
    private int f;
    private final q g;
    private Object h;
    private boolean i;
    private m j;
    private m k;
    
    static {
        c = new SparseBooleanArray();
    }
    
    public FlipperViewsFactory(final Context e, final Intent intent) {
        this.d = com.twitter.android.samsung.data.j.a();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.h = new Object();
        this.j = new d(this);
        this.k = new e(this);
        this.e = e;
        this.f = intent.getIntExtra("appWidgetId", -1);
        (this.g = q.a(this.e)).a("ss_widget_photo", Size.a(768), 5242880, 31457280);
    }
    
    private com.twitter.library.media.manager.j a(final WidgetViewModel widgetViewModel) {
        final String c = widgetViewModel.c();
        if (c != null) {
            return com.twitter.library.media.manager.j.a(c).a("ss_widget_photo").a();
        }
        return null;
    }
    
    private List a(List subList) {
        int size = 5;
        if (subList.size() < size) {
            size = subList.size();
        }
        if (size != 0) {
            subList = subList.subList(0, size);
        }
        return subList;
    }
    
    private void a(final List list, final m m) {
        for (final com.twitter.library.media.manager.j j : list) {
            j.a(m);
            final o o = new o(this.e);
            o.a(j);
            o.a(true);
        }
    }
    
    private Intent b() {
        final Intent intent = new Intent(this.e, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.a);
        intent.putExtra("appWidgetId", this.f);
        return intent;
    }
    
    private com.twitter.library.media.manager.j b(final WidgetViewModel widgetViewModel) {
        final String b = widgetViewModel.b();
        if (b != null) {
            return com.twitter.library.media.manager.j.a(b.replace("small", "large")).a("ss_widget_photo").a();
        }
        return null;
    }
    
    private void b(final List list) {
        synchronized (this.h) {
            this.a = this.d(list);
            this.b = this.c(list);
        }
    }
    
    private List c(final List list) {
        final ArrayList<com.twitter.library.media.manager.j> list2 = new ArrayList<com.twitter.library.media.manager.j>();
        for (final WidgetViewModel widgetViewModel : list) {
            if (widgetViewModel.c() != null) {
                final com.twitter.library.media.manager.j a = this.a(widgetViewModel);
                if (a == null || list2.contains(a) || this.g.b(a) != null) {
                    continue;
                }
                list2.add(a);
            }
        }
        return list2;
    }
    
    private boolean c() {
        while (true) {
            synchronized (this.h) {
                if (this.a.isEmpty() && this.b.isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }
    
    private List d(final List list) {
        final ArrayList<com.twitter.library.media.manager.j> list2 = new ArrayList<com.twitter.library.media.manager.j>();
        for (final WidgetViewModel widgetViewModel : list) {
            if (widgetViewModel.b() != null) {
                final com.twitter.library.media.manager.j b = this.b(widgetViewModel);
                if (b == null || list2.contains(b) || this.g.b(b) != null) {
                    continue;
                }
                list2.add(b);
            }
        }
        return list2;
    }
    
    private void d() {
        if (n.c(this.e)) {
            synchronized (this.h) {
                if (!FlipperViewsFactory.c.get(this.f)) {
                    FlipperViewsFactory.c.put(this.f, true);
                    this.a(this.a, this.j);
                    this.a(this.b, this.k);
                }
            }
        }
    }
    
    private void e() {
        this.d = com.twitter.android.samsung.data.j.a();
    }
    
    void a() {
        synchronized (this.h) {
            if (!n.c(this.e) || (this.a.isEmpty() && this.b.isEmpty())) {
                FlipperViewsFactory.c.delete(this.f);
            }
            // monitorexit(this.h)
            this.e.sendBroadcast(this.b());
        }
    }
    
    public int getCount() {
        if (this.d == null) {
            this.e();
        }
        return this.d.size();
    }
    
    public long getItemId(final int n) {
        if (this.d == null) {
            this.e();
        }
        if (n >= this.d.size()) {
            return n;
        }
        return this.d.get(n).e();
    }
    
    public RemoteViews getLoadingView() {
        return new RemoteViews(this.e.getPackageName(), 2130969218);
    }
    
    public RemoteViews getViewAt(final int n) {
        if (this.d == null || n >= this.d.size()) {
            this.e();
            if (n >= this.d.size()) {
                return null;
            }
        }
        final WidgetViewModel widgetViewModel = this.d.get(n);
        final RemoteViews remoteViews = new RemoteViews(this.e.getPackageName(), widgetViewModel.a());
        final com.twitter.library.media.manager.j b = this.b(widgetViewModel);
        Bitmap b2;
        if (b != null) {
            b2 = this.g.b(b);
        }
        else {
            b2 = null;
        }
        final com.twitter.library.media.manager.j a = this.a(widgetViewModel);
        Bitmap b3 = null;
        if (a != null) {
            b3 = this.g.b(a);
        }
        widgetViewModel.a(this.e, remoteViews, b2, b3);
        if (this.i) {
            remoteViews.setViewVisibility(2131887380, 8);
            remoteViews.setViewVisibility(2131887382, 8);
            remoteViews.setViewVisibility(2131887381, 8);
        }
        else {
            widgetViewModel.a(this.e, remoteViews, this.f);
        }
        switch (com.twitter.android.samsung.single.f.a[widgetViewModel.d().ordinal()]) {
            default: {
                return remoteViews;
            }
        }
    }
    
    public int getViewTypeCount() {
        return WidgetViewModel$ModelType.values().length;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public void onCreate() {
        this.i = n.d(this.e, this.f);
    }
    
    public void onDataSetChanged() {
        List d = com.twitter.android.samsung.data.j.a(this.e, this.f);
        if (d != null) {
            if (!n.c(this.e)) {
                FlipperViewsFactory.c.delete(this.f);
            }
            if (this.d != d) {
                if (this.d == null || this.d == com.twitter.android.samsung.data.j.a()) {
                    d = this.a(d);
                }
                this.b(d);
                this.d = d;
                if (!this.c() && n.c(this.e)) {
                    this.d();
                }
            }
            else {
                this.b(d);
                if (!this.c()) {
                    this.d();
                }
            }
        }
    }
    
    public void onDestroy() {
    }
}
