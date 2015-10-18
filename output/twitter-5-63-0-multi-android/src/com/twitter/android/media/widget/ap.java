// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.twitter.library.view.x;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.view.TickMarksView;
import android.view.View;
import com.twitter.library.widget.am;
import android.widget.ProgressBar;
import android.view.animation.Animation;
import android.widget.FrameLayout;

abstract class ap
{
    private boolean a;
    private int b;
    private int c;
    private int d;
    final /* synthetic */ VideoClipRangeSeekBar e;
    private boolean f;
    
    private ap(final VideoClipRangeSeekBar e) {
        this.e = e;
    }
    
    abstract void a();
    
    abstract boolean a(final float p0);
    
    abstract boolean a(final int p0, final int p1);
    
    void b() {
    }
    
    void b(final int n, final int c) {
        this.d = n;
        this.b = n;
        this.c = c;
        this.f = false;
        this.e.e();
    }
    
    void c() {
        this.a();
        if (!this.f) {
            this.b();
        }
    }
    
    boolean c(final int b, final int n) {
        if (this.a) {
            if (this.a(b, n)) {
                this.d = b;
                this.b = b;
                this.a = false;
            }
            return false;
        }
        if (!this.f) {
            this.f = (Math.abs(b - this.d) > this.e.a || Math.abs(n - this.c) > this.e.a);
        }
        final int width = this.e.getWidth();
        final int paddingLeft = this.e.getPaddingLeft();
        final int paddingRight = this.e.getPaddingRight();
        final float n2 = (b - this.b) / (width - paddingLeft - paddingRight) * (this.e.y - this.e.x);
        this.b = b;
        boolean a = false;
        Label_0200: {
            if (!this.a(n2) && b >= paddingLeft && b < width - paddingRight && n >= 0) {
                final int height = this.e.getHeight();
                a = false;
                if (n < height) {
                    break Label_0200;
                }
            }
            a = true;
        }
        this.a = a;
        this.e.c();
        this.e.a(this.e.getLeft(), this.e.getRight());
        return true;
    }
    
    boolean d() {
        return this.f;
    }
}
