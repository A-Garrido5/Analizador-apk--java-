// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class SlidingPanel extends SlidingUpPanelLayout
{
    private int a;
    private int b;
    private View c;
    
    public SlidingPanel(final Context context) {
        this(context, null);
    }
    
    public SlidingPanel(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SlidingPanel(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.SlidingPanel, n, 0);
        this.a = obtainStyledAttributes.getResourceId(li.SlidingPanel_panelHeaderLayoutId, 0);
        this.b = obtainStyledAttributes.getResourceId(li.SlidingPanel_panelContentLayoutId, 0);
        obtainStyledAttributes.recycle();
    }
    
    public View getHeader() {
        return this.c;
    }
    
    protected void onFinishInflate() {
        if (this.getChildCount() != 1) {
            throw new IllegalStateException("SlidingPanel must contain only one child");
        }
        this.addView(LayoutInflater.from(this.getContext()).inflate(lc.sliding_panel, (ViewGroup)null), 1);
        if (this.a != 0) {
            this.setHeader(this.a);
        }
        if (this.b != 0) {
            this.setContent(this.b);
        }
        super.onFinishInflate();
    }
    
    public void setContent(final int n) {
        this.setContent(LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)null));
    }
    
    public void setContent(final View view) {
        ((ViewGroup)this.findViewById(la.sliding_panel_content)).addView(view);
    }
    
    public void setHeader(final int n) {
        this.c = LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)this.findViewById(la.header_container));
    }
}
