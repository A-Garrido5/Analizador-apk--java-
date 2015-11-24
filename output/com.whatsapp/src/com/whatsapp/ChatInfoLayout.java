// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.app.Activity;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.Adapter;
import android.widget.AbsListView$OnScrollListener;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ListView;
import android.view.View;
import android.view.ViewGroup;

public class ChatInfoLayout extends ViewGroup
{
    private View a;
    private float b;
    private boolean c;
    private float d;
    private int e;
    private int f;
    private ListView g;
    private View h;
    private ScalingTextView i;
    private int j;
    private TextView k;
    private int l;
    private View m;
    private View n;
    private int o;
    private int p;
    
    public ChatInfoLayout(final Context context) {
        super(context);
        this.a(context);
    }
    
    public ChatInfoLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public ChatInfoLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private void a() {
        final View child = this.g.getChildAt(0);
        if (child != null) {
            int top = 0;
            Label_0040: {
                if (this.g.getFirstVisiblePosition() == 0) {
                    top = child.getTop();
                    if (!App.I) {
                        break Label_0040;
                    }
                }
                top = -this.getHeight();
            }
            this.setScrollPos(top);
        }
    }
    
    private void a(final Context context) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130772099, typedValue, true)) {
            this.p = TypedValue.complexToDimensionPixelSize(typedValue.data, this.getResources().getDisplayMetrics());
        }
        this.d = context.getResources().getDimensionPixelSize(2131361880);
        this.l = context.getResources().getDimensionPixelSize(2131361873);
    }
    
    static boolean a(final ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.c;
    }
    
    static void b(final ChatInfoLayout chatInfoLayout) {
        chatInfoLayout.c();
    }
    
    static ListView c(final ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.g;
    }
    
    private void c() {
        if (this.getWidth() > this.getHeight()) {
            ((AppCompatActivity)this.getContext()).supportStartPostponedEnterTransition();
            this.g.setOnScrollListener((AbsListView$OnScrollListener)new aow(this));
            if (!App.I) {
                return;
            }
        }
        final int scrollPos = (int)(0.5625f * this.getMeasuredWidth()) - this.getMeasuredWidth();
        this.g.setSelectionFromTop(0, scrollPos);
        this.setScrollPos(scrollPos);
        this.g.post((Runnable)new sy(this, scrollPos));
    }
    
    static void d(final ChatInfoLayout chatInfoLayout) {
        chatInfoLayout.a();
    }
    
    static View e(final ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.h;
    }
    
    public void a(final View view, final View view2, final View view3, final Adapter adapter) {
        this.g.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new awp(this, view, adapter, view2, view3));
    }
    
    public void b() {
        this.m = this.findViewById(2131755370);
        this.a = this.findViewById(2131755372);
        this.i = (ScalingTextView)this.findViewById(2131755361);
        this.k = (TextView)this.findViewById(2131755362);
        this.h = this.findViewById(2131755280);
        this.g = (ListView)this.findViewById(16908298);
        this.n = this.findViewById(2131755363);
        this.b = this.i.getTextSize();
        this.i.setMaxTextSize(this.b);
        this.n.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, Math.min(((Activity)this.getContext()).getWindowManager().getDefaultDisplay().getWidth(), ((Activity)this.getContext()).getWindowManager().getDefaultDisplay().getHeight())));
        this.g.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new yg(this));
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (n4 - n2 > n3 - n) {
            this.h.layout(n, n2, n3, n2 + this.h.getMeasuredHeight());
            this.g.layout(n + this.l, n2, n3 - this.l, n4);
            if (!App.I) {
                return;
            }
        }
        this.h.layout(n, n2, n + this.h.getMeasuredWidth(), n4);
        this.g.layout(n + this.h.getMeasuredWidth() + this.l, n2, n3 - this.l, n4);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measuredWidth = this.getMeasuredWidth();
        if (this.getMeasuredHeight() >= measuredWidth) {
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
                this.g.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ar7(this));
            }
            final int n3 = this.h.getPaddingBottom() + this.h.getPaddingTop();
            this.h.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(Math.max(this.p, this.o), 1073741824));
            this.g.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824) - 2 * this.l, n2);
            if (!App.I) {
                return;
            }
        }
        if (this.n.getVisibility() != 8) {
            this.n.setVisibility(8);
            this.g.post((Runnable)new arq(this));
        }
        this.h.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth - (int)(0.618f * measuredWidth), 1073741824), n2);
        this.g.measure(View$MeasureSpec.makeMeasureSpec((int)(0.618f * measuredWidth) - 2 * this.l, 1073741824), n2);
    }
    
    public void setCollapsedPadding(final int j, final int f) {
        this.j = j;
        this.f = f;
    }
    
    public void setColor(final int n) {
        this.e = ((0xFF000000 & this.e) | (0xFFFFFF & n));
        this.m.setBackgroundColor(this.e);
    }
    
    public void setScrollPos(final int n) {
        final boolean i = App.I;
        if (this.getWidth() >= this.getHeight()) {
            if (!this.c) {
                this.c = true;
                this.n.setVisibility(8);
                this.m.setBackgroundColor(0);
                this.i.setTextScale(1.0f);
                this.i.setTextSize(0, this.b);
                alm.a(this.a, 0, 0);
            }
        }
        else {
            if (this.c) {
                this.o = 0;
            }
            this.c = false;
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
            }
            final int max = Math.max(this.p, n + this.getWidth());
            final int n2 = (int)(0.5625f * this.getWidth());
            final float max2 = Math.max(0.0f, (n2 - max) / (n2 - this.p));
            Label_0200: {
                if (max < 2 * this.p) {
                    this.i.setSingleLine(true);
                    this.k.setSingleLine(true);
                    if (!i) {
                        break Label_0200;
                    }
                }
                this.i.setSingleLine(false);
                this.k.setSingleLine(false);
            }
            if (this.o != max) {
                this.o = max;
                final int n3 = this.e >> 24;
                Label_0297: {
                    if (this.o == this.p) {
                        if (n3 == -1) {
                            break Label_0297;
                        }
                        this.i.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        this.k.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        if (!i) {
                            break Label_0297;
                        }
                    }
                    if (n3 == -1) {
                        this.i.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                        this.k.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    }
                }
                final int n4 = (int)(255.0f * max2);
                final int n5 = (int)(max2 * (max2 * this.j));
                final int n6 = (int)(max2 * (max2 * this.f));
                final float n7 = this.b - max2 * (this.b - this.d);
                this.i.setTextSize(0, n7);
                this.i.setTextScale(n7 / this.b);
                this.e = (n4 << 24 | (0xFFFFFF & this.e));
                this.m.setBackgroundColor(this.e);
                alm.a(this.a, n5, n6);
                this.requestLayout();
            }
        }
    }
}
