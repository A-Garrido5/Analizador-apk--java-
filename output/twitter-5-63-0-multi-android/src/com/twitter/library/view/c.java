// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.TextPaint;
import android.view.View;
import android.text.style.ClickableSpan;

public abstract class c extends ClickableSpan implements d
{
    private final int a;
    private final boolean b;
    private final boolean c;
    private int d;
    private boolean e;
    private boolean f;
    
    public c(final int n) {
        this(n, true, false);
    }
    
    public c(final int n, final int d, final boolean b) {
        this(n, true, b);
        this.d = d;
        this.f = true;
    }
    
    public c(final int a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(final View view) {
    }
    
    public void a(final boolean e) {
        this.e = e;
    }
    
    public boolean a() {
        return this.e;
    }
    
    public void updateDrawState(final TextPaint textPaint) {
        if (this.b) {
            int color;
            if (this.f) {
                color = this.d;
            }
            else {
                color = textPaint.linkColor;
            }
            textPaint.setColor(color);
        }
        if (this.e && this.a != 0) {
            textPaint.bgColor = this.a;
        }
        else {
            textPaint.bgColor = 0;
        }
        if (this.c) {
            textPaint.setUnderlineText(true);
        }
    }
}
