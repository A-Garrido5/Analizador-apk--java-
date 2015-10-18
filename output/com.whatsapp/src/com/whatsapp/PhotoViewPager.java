// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.support.v4.view.ViewPager$PageTransformer;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager;

public class PhotoViewPager extends ViewPager
{
    private float b;
    private bv c;
    private int d;
    private float e;
    private float f;
    
    public PhotoViewPager(final Context context) {
        super(context);
        this.a();
    }
    
    public PhotoViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    private void a() {
        if (Build$VERSION.SDK_INT >= 11) {
            this.setPageTransformer(true, new a94(this));
            if (!App.I) {
                return;
            }
        }
        this.setPageMargin((int)(12.0f * this.getContext().getResources().getDisplayMetrics().density));
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        int n = 1;
        final boolean i = App.I;
        gl gl;
        if (this.c != null) {
            gl = this.c.a(this.f, this.e);
        }
        else {
            gl = com.whatsapp.gl.NONE;
        }
        final int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        int n2;
        if (gl == com.whatsapp.gl.BOTH || gl == com.whatsapp.gl.LEFT || pointerCount > n) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        int n3;
        if (gl == com.whatsapp.gl.BOTH || gl == com.whatsapp.gl.RIGHT || pointerCount > n) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 0xFF & motionEvent.getAction();
        if (n4 == 3 || n4 == n) {
            this.d = -1;
        }
        Label_0321: {
            switch (n4) {
                case 2: {
                    if (n2 == 0 && n3 == 0) {
                        break;
                    }
                    final int d = this.d;
                    if (d == -1 && !i) {
                        break;
                    }
                    final float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, d));
                    if (n2 != 0 && n3 != 0) {
                        this.b = x;
                        return false;
                    }
                    if (n2 != 0 && x > this.b) {
                        this.b = x;
                        return false;
                    }
                    if (n3 != 0 && x < this.b) {
                        this.b = x;
                        return false;
                    }
                    if (i) {
                        break Label_0321;
                    }
                    break;
                }
                case 0: {
                    this.b = motionEvent.getX();
                    this.f = motionEvent.getRawX();
                    this.e = motionEvent.getRawY();
                    this.d = MotionEventCompat.getPointerId(motionEvent, 0);
                    if (i) {
                        break Label_0321;
                    }
                    break;
                }
                case 6: {
                    final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.d) {
                        if (actionIndex != 0) {
                            n = 0;
                        }
                        this.b = MotionEventCompat.getX(motionEvent, n);
                        this.d = MotionEventCompat.getPointerId(motionEvent, n);
                        break;
                    }
                    break;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public void setOnInterceptTouchListener(final bv c) {
        this.c = c;
    }
}
