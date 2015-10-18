// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.FrameLayout;

public final class n extends FrameLayout
{
    private final ProgressBar a;
    private final TextView b;
    
    public n(final Context context) {
        super(context, (AttributeSet)null, bg.c(context));
        final ao ao = new ao(context);
        this.setBackgroundColor(-16777216);
        (this.a = new ProgressBar(context)).setVisibility(8);
        this.addView((View)this.a, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
        final int n = (int)(0.5f + 10.0f * context.getResources().getDisplayMetrics().density);
        (this.b = new TextView(context)).setTextAppearance(context, 16973894);
        this.b.setTextColor(-1);
        this.b.setVisibility(8);
        this.b.setPadding(n, n, n, n);
        this.b.setGravity(17);
        this.b.setText((CharSequence)ao.a);
        this.addView((View)this.b, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
    }
    
    public final void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }
    
    public final void b() {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }
    
    public final void c() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n);
        int size2 = View$MeasureSpec.getSize(n2);
        int n3;
        if (mode == 1073741824 && mode2 == 1073741824) {
            n3 = size;
        }
        else if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
            size2 = (int)(size / 1.777f);
            n3 = size;
        }
        else if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
            n3 = (int)(1.777f * size2);
        }
        else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (size2 < size / 1.777f) {
                n3 = (int)(1.777f * size2);
            }
            else {
                size2 = (int)(size / 1.777f);
                n3 = size;
            }
        }
        else {
            size2 = 0;
            n3 = 0;
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(resolveSize(n3, n), 1073741824), View$MeasureSpec.makeMeasureSpec(resolveSize(size2, n2), 1073741824));
    }
}
