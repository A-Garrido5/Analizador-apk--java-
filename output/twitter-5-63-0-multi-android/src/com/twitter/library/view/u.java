// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.view.ViewConfiguration;
import android.text.Layout;
import android.view.View;
import android.os.Handler;

public class u
{
    private final Handler a;
    private final int b;
    private final View c;
    private Layout d;
    private float e;
    private float f;
    private boolean g;
    private d h;
    private d i;
    private int j;
    private int k;
    
    public u(final View c, final Layout d) {
        this.a = new w(this);
        this.c = c;
        this.d = d;
        this.b = ViewConfiguration.get(c.getContext()).getScaledTouchSlop();
    }
    
    private void a() {
        final d i = this.i;
        if (i != null && i.a()) {
            i.a(false);
            this.i = null;
            this.j = 0;
            this.k = 0;
            this.b();
        }
    }
    
    public static void a(final TextView textView) {
        textView.setOnTouchListener((View$OnTouchListener)new v(new u((View)textView, null)));
    }
    
    private void a(final d i) {
        i.a(true);
        this.i = i;
        this.b();
    }
    
    private void a(final boolean b) {
        if (this.h != null) {
            if (b) {
                this.h.onClick(this.c);
                this.a.sendEmptyMessageDelayed(3, 300L);
            }
            this.h = null;
        }
    }
    
    private void b() {
        this.c.invalidate((int)this.e, (int)this.f, (int)this.e + this.d.getWidth(), (int)this.f + this.d.getHeight());
    }
    
    public void a(final float e, final float f) {
        this.e = e;
        this.f = f;
    }
    
    public boolean a(final MotionEvent motionEvent) {
        final Layout d = this.d;
        final CharSequence text = d.getText();
        Spanned spanned;
        if (text instanceof Spanned) {
            spanned = (Spanned)text;
        }
        else {
            spanned = null;
        }
        if (spanned == null) {
            return false;
        }
        final int n = 0xFF & motionEvent.getAction();
        final int j = (int)(motionEvent.getX() - this.e);
        final int k = (int)(motionEvent.getY() - this.f);
        if (j < 0 || j >= d.getWidth() || k < 0 || k >= d.getHeight()) {
            this.a();
            return false;
        }
        if (this.i != null && (Math.abs(j - this.j) > this.b || Math.abs(k - this.k) > this.b)) {
            this.a();
            return false;
        }
        final int lineForVertical = d.getLineForVertical(k);
        if (j < d.getLineLeft(lineForVertical) || j > d.getLineRight(lineForVertical)) {
            this.a();
            return false;
        }
        if (this.h != null) {
            switch (n) {
                case 0: {
                    this.a();
                    this.a.removeMessages(1);
                    this.a.sendEmptyMessageDelayed(2, (long)ViewConfiguration.getTapTimeout());
                    return true;
                }
                case 1: {
                    this.a.removeMessages(2);
                    this.h.a(this.c);
                    this.h = null;
                    return true;
                }
                case 3: {
                    this.a.removeMessages(1);
                    this.a.removeMessages(2);
                    this.h = null;
                    break;
                }
            }
        }
        if (n == 0) {
            this.j = j;
            this.k = k;
        }
        if (n == 0) {
            final int offsetForHorizontal = d.getOffsetForHorizontal(lineForVertical, (float)j);
            final d[] array = (d[])spanned.getSpans(offsetForHorizontal, offsetForHorizontal, (Class)d.class);
            if (array.length > 0) {
                this.a(array[0]);
                return true;
            }
        }
        else if (n == 1) {
            final d i = this.i;
            if (i != null) {
                if (this.g) {
                    this.h = i;
                    this.a.sendEmptyMessageDelayed(1, (long)ViewConfiguration.getDoubleTapTimeout());
                }
                else {
                    i.onClick(this.c);
                    this.a();
                }
                return true;
            }
        }
        return false;
    }
}
