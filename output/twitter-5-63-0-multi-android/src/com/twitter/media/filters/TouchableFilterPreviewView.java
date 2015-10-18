// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;

public class TouchableFilterPreviewView extends FilterPreviewView
{
    private int b;
    private int[] c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    public TouchableFilterPreviewView(final Context context) {
        this(context, null);
    }
    
    public TouchableFilterPreviewView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private float a(final MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            return motionEvent.getX();
        }
        return (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
    }
    
    private float b(final MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            return motionEvent.getY();
        }
        return (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }
    
    @Override
    public void a(final Filters filters, final a a) {
        super.a(filters, a);
        this.c = filters.a();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        int n = -1;
        float n2 = 1.0f;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            this.d = this.a(motionEvent);
            this.e = this.b(motionEvent);
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = false;
            this.i = false;
            this.j = false;
            return true;
        }
        if (this.j) {
            return false;
        }
        final float a = this.a(motionEvent);
        final float b = this.b(motionEvent);
        this.f += this.d - a;
        this.g += this.e - b;
        Label_0169: {
            if (!this.h && !this.i) {
                if (Math.abs(this.f) > Math.abs(this.g) && Math.abs(this.f) > 7.0f) {
                    this.i = true;
                }
                else if (Math.abs(this.g) > Math.abs(this.f) && Math.abs(this.g) > 7.0f) {
                    this.h = true;
                }
            }
            else if (this.h) {
                if (motionEvent.getPointerCount() == 1) {
                    final float n3 = this.a.d() - 0.003f * (b - this.e);
                    if (n3 < 0.3f) {
                        n2 = 0.3f;
                    }
                    else if (n3 <= n2) {
                        n2 = n3;
                    }
                    this.a.c(n2);
                }
                else if (motionEvent.getPointerCount() == 2) {
                    final float n4 = this.a.c() - 0.003f * (b - this.e);
                    if (n4 < 0.0f) {
                        n2 = 0.0f;
                    }
                    else if (n4 <= n2) {
                        n2 = n4;
                    }
                    this.a.b(n2);
                }
            }
            else if (this.i) {
                int n5 = this.b;
                while (true) {
                    Label_0726: {
                        int b3;
                        if (this.f >= 0.0f) {
                            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                                if (this.f / this.a.b() <= 0.5) {
                                    break Label_0726;
                                }
                                this.b = (1 + this.b) % this.c.length;
                                final int b2 = this.b;
                                this.a(this.b);
                                n5 = b2;
                                b3 = n;
                            }
                            else {
                                n5 = (1 + this.b) % this.c.length;
                                b3 = this.b;
                                n2 -= this.f / this.a.b();
                            }
                        }
                        else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (Math.abs(this.f / this.a.b()) <= 0.5) {
                                break Label_0726;
                            }
                            --this.b;
                            if (this.b < 0) {
                                this.b += this.c.length;
                            }
                            final int b4 = this.b;
                            this.a(this.b);
                            n5 = b4;
                            b3 = n;
                        }
                        else {
                            n5 = this.b;
                            int n6 = (-1 + this.b) % this.c.length;
                            if (n6 < 0) {
                                n6 += this.c.length;
                            }
                            final float abs = Math.abs(this.f / this.a.b());
                            b3 = n6;
                            n2 = abs;
                        }
                        final b a2 = this.a;
                        int n7;
                        if (n5 == n) {
                            n7 = n;
                        }
                        else {
                            n7 = this.c[n5];
                        }
                        a2.a(n7);
                        final b a3 = this.a;
                        if (b3 != n) {
                            n = this.c[b3];
                        }
                        a3.b(n);
                        this.a.a(n2);
                        this.b();
                        break Label_0169;
                    }
                    int b3 = n;
                    continue;
                }
            }
        }
        this.d = a;
        this.e = b;
        return true;
    }
}
