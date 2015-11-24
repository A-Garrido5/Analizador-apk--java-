// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

public abstract class ao implements View$OnTouchListener
{
    private final boolean a;
    private float b;
    private float c;
    private boolean d;
    private View e;
    
    public ao() {
        this(true);
    }
    
    public ao(final boolean a) {
        this.a = a;
    }
    
    public void a(final View e) {
        this.e = e;
    }
    
    public abstract void a(final View p0, final MotionEvent p1);
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0: {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = true;
                break;
            }
            case 1: {
                if (this.d) {
                    this.a(view, motionEvent);
                    this.d = false;
                    break;
                }
                break;
            }
            case 2: {
                final float n = motionEvent.getX() - this.b;
                final float n2 = motionEvent.getY() - this.c;
                if (n * n + n2 * n2 > bj.d) {
                    this.d = false;
                    break;
                }
                break;
            }
            case 3: {
                this.d = false;
                break;
            }
        }
        view.setPressed(this.d);
        if (this.e != null) {
            this.e.setPressed(this.d);
        }
        return this.a;
    }
}
