// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.widget.SeekBar;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.View;

public class VoiceNoteSeekBar extends View
{
    private final Paint a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private final Rect i;
    private int j;
    private SeekBar$OnSeekBarChangeListener k;
    private int l;
    
    public VoiceNoteSeekBar(final Context context) {
        super(context);
        this.l = 20;
        this.g = 10;
        this.d = -21217;
        this.c = 536870912;
        this.a = new Paint(1);
        this.i = new Rect();
        this.a(context, null);
    }
    
    public VoiceNoteSeekBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.l = 20;
        this.g = 10;
        this.d = -21217;
        this.c = 536870912;
        this.a = new Paint(1);
        this.i = new Rect();
        this.a(context, set);
    }
    
    public VoiceNoteSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.l = 20;
        this.g = 10;
        this.d = -21217;
        this.c = 536870912;
        this.a = new Paint(1);
        this.i = new Rect();
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aqy.VoiceNoteSeekBar);
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, this.l);
            this.g = obtainStyledAttributes.getDimensionPixelSize(1, this.g);
            this.d = obtainStyledAttributes.getInteger(2, this.d);
            this.c = obtainStyledAttributes.getInteger(3, this.c);
            obtainStyledAttributes.recycle();
        }
    }
    
    private void a(final MotionEvent motionEvent) {
        float n = 1.0f;
        final boolean i = App.I;
        final int width = this.getWidth();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int n2 = width - paddingLeft - paddingRight;
        final int n3 = (int)motionEvent.getX();
        while (true) {
            Label_0142: {
                if (App.W) {
                    if (n3 > width - paddingRight && !i) {
                        break Label_0142;
                    }
                    if (n3 < paddingLeft && !i) {
                        break Label_0127;
                    }
                    final float n4 = (paddingLeft + (n2 - n3)) / n2;
                    if (!i) {
                        n = n4;
                        break Label_0127;
                    }
                }
                if (n3 < paddingLeft && !i) {
                    break Label_0142;
                }
                if (n3 <= width - paddingRight || i) {
                    n = (n3 - paddingLeft) / n2;
                }
                this.setProgress((int)(0.0f + n * this.a()));
                return;
            }
            n = 0.0f;
            continue;
        }
    }
    
    private boolean d() {
        final boolean i = App.I;
        if (Build$VERSION.SDK_INT < 14) {
            return true;
        }
        ViewParent viewParent = this.getParent();
        while (viewParent != null && viewParent instanceof ViewGroup) {
            if (((ViewGroup)viewParent).shouldDelayChildPressedState()) {
                return true;
            }
            viewParent = viewParent.getParent();
            if (i) {
                break;
            }
        }
        return false;
    }
    
    private void e() {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    public int a() {
        return this.e;
    }
    
    void b() {
        this.b = true;
        if (this.k != null) {
            this.k.onStartTrackingTouch((SeekBar)null);
        }
    }
    
    void c() {
        this.b = false;
        if (this.k != null) {
            this.k.onStopTrackingTouch((SeekBar)null);
        }
    }
    
    public int f() {
        return this.f;
    }
    
    protected void onDraw(final Canvas canvas) {
        while (true) {
            while (true) {
                final int width;
                final int paddingRight;
                int n4;
                synchronized (this) {
                    final boolean i = App.I;
                    width = this.getWidth();
                    final int paddingLeft = this.getPaddingLeft();
                    paddingRight = this.getPaddingRight();
                    final int n = width - paddingLeft - paddingRight;
                    int n2;
                    if (this.isPressed()) {
                        n2 = 3 * this.l / 4;
                    }
                    else {
                        n2 = this.l / 2;
                    }
                    final int a = this.a();
                    float n3;
                    if (a > 0) {
                        n3 = this.f() / a;
                    }
                    else {
                        n3 = 0.0f;
                    }
                    n4 = n2 + (int)(n3 * (n - n2 * 2));
                    if (App.ak()) {
                        n4 += paddingLeft;
                        if (!i) {
                            final int n5 = this.getPaddingTop() + (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) / 2;
                            this.a.setColor(this.c);
                            this.a.setStyle(Paint$Style.FILL);
                            this.i.set(0, n5 - this.g / 2, this.getWidth(), n5 + this.g / 2);
                            canvas.drawRect(this.i, this.a);
                            this.a.setColor(this.d);
                            Label_0278: {
                                if (App.ak()) {
                                    this.i.set(paddingLeft, n5 - this.g / 2, n4, n5 + this.g / 2);
                                    if (!i) {
                                        break Label_0278;
                                    }
                                }
                                this.i.set(n4, n5 - this.g / 2, width - paddingRight, n5 + this.g / 2);
                            }
                            canvas.drawRect(this.i, this.a);
                            canvas.drawCircle((float)n4, (float)n5, (float)n2, this.a);
                            return;
                        }
                    }
                }
                n4 = width - n4 - paddingRight;
                continue;
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        if (!this.isEnabled()) {
            return false;
        }
        Label_0204: {
            switch (motionEvent.getAction()) {
                case 0: {
                    if (this.d()) {
                        this.h = motionEvent.getX();
                        if (!i) {
                            break;
                        }
                    }
                    this.setPressed(true);
                    this.invalidate();
                    this.b();
                    this.a(motionEvent);
                    this.e();
                    if (i) {
                        break Label_0204;
                    }
                    break;
                }
                case 2: {
                    if (this.b) {
                        this.a(motionEvent);
                        if (!i) {
                            break;
                        }
                    }
                    if (Math.abs(motionEvent.getX() - this.h) > this.j) {
                        this.setPressed(true);
                        this.invalidate();
                        this.b();
                        this.a(motionEvent);
                        this.e();
                    }
                    if (i) {
                        break Label_0204;
                    }
                    break;
                }
                case 1: {
                    Label_0196: {
                        if (this.b) {
                            this.a(motionEvent);
                            this.c();
                            this.setPressed(false);
                            if (!i) {
                                break Label_0196;
                            }
                        }
                        this.b();
                        this.a(motionEvent);
                        this.c();
                    }
                    this.invalidate();
                    if (i) {
                        break Label_0204;
                    }
                    break;
                }
                case 3: {
                    if (this.b) {
                        this.c();
                        this.setPressed(false);
                    }
                    this.invalidate();
                    break;
                }
            }
        }
        return true;
    }
    
    public void setMax(final int e) {
        this.e = e;
    }
    
    public void setOnSeekBarChangeListener(final SeekBar$OnSeekBarChangeListener k) {
        this.k = k;
    }
    
    public void setProgress(final int f) {
        if (this.f != f) {
            this.f = f;
            this.invalidate();
        }
    }
    
    public void setProgressColor(final int d) {
        this.d = d;
        this.invalidate();
    }
}
