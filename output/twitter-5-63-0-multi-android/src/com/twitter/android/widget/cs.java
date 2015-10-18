// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewTreeObserver;
import android.graphics.Point;
import android.view.View;
import android.graphics.Rect;
import com.twitter.util.t;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.WindowManager;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class cs implements ViewTreeObserver$OnGlobalLayoutListener, bc
{
    private final int b;
    private final WindowManager c;
    private final bg d;
    private WeakReference e;
    
    public cs(final bg d, final Context context) {
        this.e = new WeakReference(null);
        this.d = d;
        this.b = t.b(context);
        this.c = (WindowManager)context.getSystemService("window");
    }
    
    private Rect c() {
        final Rect rect = new Rect();
        final View view = (View)this.e.get();
        if (view == null) {
            final Point a = t.a(this.c);
            rect.set(0, 0, a.x, a.y);
            return rect;
        }
        view.getGlobalVisibleRect(rect);
        return rect;
    }
    
    public Rect a() {
        final Rect c = this.c();
        c.offset(0, -this.b);
        return c;
    }
    
    public void a(final View view) {
        final View view2 = (View)this.e.get();
        if (view2 != view && view2 != null) {
            final ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            }
        }
        this.e = new WeakReference((T)view);
        if (view != null) {
            final ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            }
        }
    }
    
    public void b() {
        final View view = (View)this.e.get();
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.d.g();
    }
    
    public void onGlobalLayout() {
        this.d.a(this.a());
    }
}
