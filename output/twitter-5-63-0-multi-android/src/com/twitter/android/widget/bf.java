// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.internal.android.widget.f;
import com.twitter.internal.android.widget.DockLayout;
import android.view.View;
import com.twitter.util.t;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.graphics.Rect;
import com.twitter.internal.android.widget.h;

public class bf extends h implements bc
{
    private final bg b;
    private final int c;
    private int d;
    private final Rect e;
    private WeakReference f;
    private WeakReference g;
    
    public bf(final bg b, final Context context) {
        this.d = Integer.MIN_VALUE;
        this.e = new Rect();
        this.f = new WeakReference(null);
        this.g = new WeakReference(null);
        this.b = b;
        this.c = t.b(context);
    }
    
    private void b(final View view) {
        view.getGlobalVisibleRect(this.e);
        this.e.offset(0, -this.c);
        final Rect e = this.e;
        final int bottom = e.bottom;
        final int d = this.d;
        int n = 0;
        if (d != Integer.MIN_VALUE) {
            n = this.e.height() - this.d;
        }
        e.bottom = bottom - n;
    }
    
    @Override
    public Rect a() {
        final View view = (View)this.f.get();
        if (view != null) {
            this.b(view);
        }
        return this.e;
    }
    
    public void a(final View view) {
        this.f = new WeakReference((T)view);
    }
    
    public void a(final DockLayout dockLayout) {
        this.g = new WeakReference((T)dockLayout);
        if (dockLayout != null) {
            dockLayout.a(this);
        }
    }
    
    @Override
    public void b() {
        this.b.g();
        final DockLayout dockLayout = (DockLayout)this.g.get();
        if (dockLayout != null) {
            dockLayout.b(this);
        }
    }
    
    @Override
    public void b(final int n, final int d, final int n2, final int n3) {
        final View view = (View)this.f.get();
        this.d = d;
        if (view != null) {
            this.b(view);
            this.b.a(this.e);
        }
    }
}
