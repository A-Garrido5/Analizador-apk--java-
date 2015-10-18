// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View$MeasureSpec;
import com.twitter.util.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.client.bk;
import com.twitter.library.view.ScrollingMarqueeTextView;
import android.view.View;
import com.twitter.library.client.bl;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.ToolBar;

public class StatusToolBar extends ToolBar implements View$OnClickListener, bl
{
    private View a;
    private boolean b;
    private int c;
    private ScrollingMarqueeTextView d;
    private bk e;
    private boolean f;
    
    public StatusToolBar(final Context context) {
        this(context, null);
    }
    
    public StatusToolBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = true;
        this.a(context);
    }
    
    public StatusToolBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = true;
        this.a(context);
    }
    
    private void a(final Context context) {
        this.i();
        this.c = context.getResources().getDimensionPixelSize(ky.status_toolbar_message_height);
    }
    
    private void b(final boolean b) {
        if (this.b && this.h()) {
            if (b && this.f) {
                this.i();
            }
            else if (this.a != null) {
                this.a.setVisibility(8);
            }
            this.requestLayout();
        }
    }
    
    private boolean h() {
        final Drawable background = this.getBackground();
        return background == null || background instanceof ColorDrawable;
    }
    
    private void i() {
        this.e = bk.a();
        if (this.e.b()) {
            if (this.a == null) {
                this.addView(this.a = LayoutInflater.from(this.getContext()).inflate(lc.status_bar, (ViewGroup)this, false), 0);
                (this.d = (ScrollingMarqueeTextView)this.a.findViewById(la.campaign_text_view)).setOnClickListener((View$OnClickListener)this);
            }
            this.d.a(this.e.e(), this.e.c(), this.e.d());
            this.a.setVisibility(0);
            final ao f = this.e.f();
            if (f != null) {
                f.a(this);
            }
        }
    }
    
    public void a(final boolean b) {
        if (com.twitter.util.c.a()) {
            this.b(b);
            return;
        }
        this.post((Runnable)new an(this, b));
    }
    
    public int getStatusBarMessageHeight() {
        if (this.e.b()) {
            return this.c;
        }
        return 0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
    }
    
    public void onClick(final View view) {
        final ao f = this.e.f();
        if (f != null) {
            f.b(this);
        }
    }
    
    @Override
    protected void onDetachedFromWindow() {
        this.b = false;
        super.onDetachedFromWindow();
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int measuredHeight;
        if (this.a != null && this.a.getVisibility() != 8) {
            measuredHeight = this.a.getMeasuredHeight();
            this.a.layout(0, 0, n3, measuredHeight);
        }
        else {
            measuredHeight = 0;
        }
        this.setOffsetLayoutTopPx(measuredHeight);
        super.onLayout(b, n, n2, n3, n4);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.a != null && this.a.getVisibility() != 8) {
            final int height = this.a.getLayoutParams().height;
            this.a.measure(n, View$MeasureSpec.makeMeasureSpec(height, 1073741824));
            this.setMeasuredDimension(View$MeasureSpec.getSize(n), height + View$MeasureSpec.getSize(n2));
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.e.a(this);
            this.a(this.e.b());
        }
    }
    
    public void setDisplayShowStatusBarEnabled(final boolean f) {
        this.f = f;
    }
}
