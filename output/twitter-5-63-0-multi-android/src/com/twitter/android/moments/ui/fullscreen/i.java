// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.view.View;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import com.twitter.util.m;
import android.view.GestureDetector;
import android.view.View$OnTouchListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.view.GestureDetector$SimpleOnGestureListener;

public class i extends GestureDetector$SimpleOnGestureListener implements ViewPager$OnPageChangeListener, View$OnTouchListener
{
    private final GestureDetector a;
    private final m b;
    private boolean c;
    private boolean d;
    private boolean e;
    
    public i(final Context context, final m b) {
        this.a = new GestureDetector(context, (GestureDetector$OnGestureListener)this);
        this.b = b;
    }
    
    public boolean onDoubleTapEvent(final MotionEvent motionEvent) {
        this.b.a(Event.b);
        return false;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        this.b.a(Event.c);
        if (this.c) {
            this.b.a(Event.e);
            this.c = false;
            this.e = true;
            return false;
        }
        return this.e = false;
    }
    
    public void onPageScrollStateChanged(final int n) {
        if (n == 0) {
            this.d = false;
        }
    }
    
    public void onPageScrolled(final int n, final float n2, final int n3) {
        if (n3 > 0) {
            this.d = true;
        }
    }
    
    public void onPageSelected(final int n) {
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.b.a(Event.a);
        if (!this.c && !this.e && !this.d) {
            this.b.a(Event.d);
            this.c = true;
        }
        return false;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
