// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import android.view.View;
import android.widget.AbsListView;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.android.xb;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;
import android.os.Looper;
import android.graphics.Rect;
import java.util.Set;
import android.os.Handler;
import java.util.Map;
import com.twitter.android.client.bv;

public class d implements bv
{
    private static final Map a;
    private final wl b;
    private final Handler c;
    private final Map d;
    private final Set e;
    private final Rect f;
    private final long g;
    private final float h;
    
    static {
        a = new ViewDwellTimeMonitor$1();
    }
    
    public d(final wl wl, final float n, final long n2) {
        this(wl, new Handler(Looper.getMainLooper()), n, n2);
    }
    
    public d(final wl b, final Handler c, float h, final long n) {
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new Rect();
        this.b = b;
        this.c = c;
        long g;
        if (n > 0L) {
            g = 1000L * n;
        }
        else {
            g = 3000L;
        }
        this.g = g;
        if (!a(h)) {
            h = 0.5f;
        }
        this.h = h;
    }
    
    public static d a(final Context context, final float n, final int n2) {
        return new d(new wp(context, as.a(context), az.a(context)), n, n2);
    }
    
    private Tweet a(final xb xb) {
        if (xb.f != null) {
            return xb.f.getTweet();
        }
        return null;
    }
    
    private static boolean a(final float n) {
        return n >= 0.0f && n <= 1.0f;
    }
    
    private void c() {
        if (this.e.size() != this.d.size()) {
            final HashSet<Long> set = new HashSet<Long>();
            for (final Long n : this.d.keySet()) {
                if (!this.e.contains(n)) {
                    set.add(n);
                }
            }
            final Iterator<Object> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                this.a(iterator2.next());
            }
        }
    }
    
    public void a() {
        final Iterator<Long> iterator = this.d.keySet().iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next());
        }
        this.d.clear();
    }
    
    void a(final long n) {
        final Runnable runnable = this.d.remove(n);
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }
    
    void a(final long n, final Runnable runnable) {
        this.d.put(n, runnable);
        this.e.add(n);
        this.c.postDelayed(runnable, this.g);
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        this.e.clear();
        for (int min = Math.min(n2, absListView.getChildCount()), i = 0; i < min; ++i) {
            final View child = absListView.getChildAt(i);
            if (child.getTag() instanceof xb) {
                final Tweet a = this.a((xb)child.getTag());
                if (a != null && a.m() && a.j != null && !a.p() && !com.twitter.android.revenue.d.a.containsKey(a.j.impressionId)) {
                    final Rect f = this.f;
                    if (child.getGlobalVisibleRect(f)) {
                        boolean b2;
                        if (f.height() / child.getHeight() >= this.h) {
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        if (b2 && !this.d.containsKey(a.Q)) {
                            this.a(a.Q, new e(this, a));
                        }
                        else if (!b2) {
                            this.a(a.Q);
                        }
                    }
                }
            }
        }
        this.c();
        return false;
    }
}
