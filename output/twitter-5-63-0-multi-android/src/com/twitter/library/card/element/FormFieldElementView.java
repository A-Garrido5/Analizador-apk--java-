// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.twitter.library.card.property.LocalizedTokenizedText;
import com.twitter.library.card.Card;
import com.twitter.ui.widget.ag;
import android.graphics.Typeface;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public abstract class FormFieldElementView extends FrameLayout
{
    protected int a;
    protected int b;
    private View c;
    
    public FormFieldElementView(final Context context, final FormFieldElement formFieldElement) {
        super(context);
        this.c = this.a(context, formFieldElement);
        this.setWillNotDraw(false);
    }
    
    protected Typeface a(final String s, final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            n = 1;
        }
        if (b2) {
            n |= 0x2;
        }
        return ag.a(this.getContext()).a(n);
    }
    
    protected abstract View a(final Context p0, final FormFieldElement p1);
    
    protected String a(final int n, final Card card) {
        if (n == -1) {
            return "";
        }
        final LocalizedTokenizedText ae_ = card.aE_();
        if (ae_ == null) {
            return "";
        }
        return ae_.a(card, n);
    }
    
    public void a(final Card card) {
        this.b();
        this.c();
    }
    
    protected void b() {
        this.addView(this.c, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
    }
    
    protected void c() {
        this.measure(0, 0);
        this.a = this.getMeasuredWidth();
        this.b = this.getMeasuredHeight();
    }
    
    public int getViewHeight() {
        return this.b;
    }
    
    public int getViewWidth() {
        return this.a;
    }
}
