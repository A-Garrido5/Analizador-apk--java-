// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.View$MeasureSpec;
import android.content.res.Configuration;
import com.twitter.util.e;
import com.twitter.android.util.l;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class CameraSpeedBumpBar extends LinearLayout implements View$OnClickListener
{
    private final View a;
    private final View b;
    private final View c;
    private final int d;
    private final int e;
    private d f;
    
    public CameraSpeedBumpBar(final Context context) {
        this(context, null);
    }
    
    public CameraSpeedBumpBar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraSpeedBumpBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.CameraSpeedBumpBar, n, 0);
        try {
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            inflate(context, 2130968624, (ViewGroup)this);
            this.a = this.findViewById(2131886353);
            this.b = this.findViewById(2131886354);
            this.c = this.findViewById(2131886355);
            this.a.setOnClickListener((View$OnClickListener)this);
            this.b.setOnClickListener((View$OnClickListener)this);
            this.c.setOnClickListener((View$OnClickListener)this);
            this.onConfigurationChanged(this.getResources().getConfiguration());
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public void a(final int n) {
        com.twitter.util.e.b(!l.d());
        final int visibility = this.getVisibility();
        int n2 = 0;
        if (visibility == 0) {
            n2 = 300;
        }
        l.a(this.a, n, n2, 2131034147);
        l.a(this.b, n, n2, 2131034147);
        l.a(this.c, n, n2, 2131034147);
    }
    
    public void onClick(final View view) {
        if (this.f == null) {
            return;
        }
        int n;
        if (view == this.a) {
            n = 1;
        }
        else if (view == this.b) {
            n = 2;
        }
        else {
            n = 3;
        }
        this.f.a(n);
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        if (configuration.orientation == 1) {
            this.setOrientation(0);
            return;
        }
        this.setOrientation(1);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.getOrientation() == 1) {
            final int left = this.a.getLeft();
            final int top = this.a.getTop();
            final int right = this.a.getRight();
            final int bottom = this.a.getBottom();
            this.a.layout(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
            this.c.layout(left, top, right, bottom);
        }
    }
    
    protected void onMeasure(int measureSpec, int measureSpec2) {
        if (this.getResources().getConfiguration().orientation == 1) {
            measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.e, 1073741824);
        }
        else {
            measureSpec = View$MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        }
        super.onMeasure(measureSpec, measureSpec2);
    }
    
    public void setListener(final d f) {
        this.f = f;
    }
}
