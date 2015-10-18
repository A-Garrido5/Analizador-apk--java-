// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View$OnClickListener;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.widget.AbsListView;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.widget.ExploreByTouchHelper;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;

public class PageableListView extends ListView implements AbsListView$OnScrollListener
{
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;
    private View e;
    private TextView f;
    private ae g;
    private FrameLayout h;
    private View i;
    private View j;
    private ExploreByTouchHelper k;
    
    public PageableListView(final Context context) {
        this(context, null);
    }
    
    public PageableListView(final Context context, final AttributeSet set) {
        this(context, set, kv.pageableListViewStyle);
    }
    
    public PageableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.PageableListView, n, 0);
        this.a = obtainStyledAttributes.getResourceId(li.PageableListView_loadingFooterLayout, 0);
        this.b = obtainStyledAttributes.getResourceId(li.PageableListView_loadingHeaderLayout, 0);
        this.c = obtainStyledAttributes.getInt(li.PageableListView_defaultPosition, 0);
        this.d = obtainStyledAttributes.getBoolean(li.PageableListView_loadingHeaderDivider, true);
        obtainStyledAttributes.recycle();
    }
    
    private void c() {
        if (this.getAdapter() != null) {
            throw new IllegalStateException("This method must be called before setAdapter.");
        }
    }
    
    private void d() {
        if (this.h == null) {
            this.c();
            this.addFooterView((View)(this.h = new FrameLayout(this.getContext())), (Object)null, false);
            this.setFooterDividersEnabled(false);
        }
    }
    
    public void a() {
        this.c();
        if (this.j == null) {
            final View inflate = LayoutInflater.from(this.getContext()).inflate(this.b, (ViewGroup)this, false);
            this.addHeaderView(inflate, (Object)null, false);
            this.j = inflate;
            this.e = inflate.findViewById(la.header_content);
            if (this.e == null) {
                throw new IllegalArgumentException("loadingHeaderLayout must define a View with @id/header_content.");
            }
            if (!this.d) {
                final View viewById = inflate.findViewById(la.divider);
                if (viewById != null) {
                    viewById.setVisibility(8);
                }
            }
        }
    }
    
    public void a(final View view) {
        this.d();
        this.h.addView(view);
    }
    
    public void a(final boolean b) {
        if (this.j == null) {
            return;
        }
        if (b) {
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
    }
    
    public void b() {
        if (this.i == null) {
            final View inflate = LayoutInflater.from(this.getContext()).inflate(this.a, (ViewGroup)this, false);
            this.a(inflate);
            this.i = inflate;
            inflate.findViewById(la.footer_progress_bar).setVisibility(0);
            this.f = (TextView)inflate.findViewById(la.footer_label);
        }
    }
    
    public void b(final boolean b) {
        if (this.i != null) {
            if (b) {
                this.i.setVisibility(0);
                if (this.f != null) {
                    this.f.setVisibility(8);
                }
            }
            else {
                this.i.setVisibility(8);
                if (this.f != null) {
                    this.f.setVisibility(0);
                }
            }
        }
    }
    
    public boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        return (this.k != null && this.k.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }
    
    public int getLoadingHeaderHeight() {
        if (this.j != null) {
            return this.j.getHeight();
        }
        return 0;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.g == null || n2 == 0 || this.getCount() == 0) {
            return;
        }
        final int n4 = n + n2;
        if (this.j != null && this.j.getParent() != null && n4 >= this.getPositionForView(this.j)) {
            this.g.a((AbsListView)this);
        }
        if (this.h != null && this.h.getParent() != null && n4 >= this.getPositionForView((View)this.h)) {
            this.g.b((AbsListView)this);
        }
        this.g.onScroll((AbsListView)this, n, n2, n3);
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (this.g != null) {
            this.g.onScrollStateChanged((AbsListView)this, n);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (1 == this.c) {
            this.setSelection(-1 + this.getCount());
        }
    }
    
    public void setExploreByTouchHelper(final ExploreByTouchHelper k) {
        ViewCompat.setAccessibilityDelegate((View)this, this.k = k);
    }
    
    public void setFooterContainerOnClickListener(final View$OnClickListener onClickListener) {
        this.d();
        this.h.setOnClickListener(onClickListener);
    }
    
    public void setOnPageScrollListener(final ae g) {
        this.g = g;
        if (g != null) {
            super.setOnScrollListener((AbsListView$OnScrollListener)this);
            return;
        }
        super.setOnScrollListener((AbsListView$OnScrollListener)null);
    }
    
    public void setOnScrollListener(final AbsListView$OnScrollListener absListView$OnScrollListener) {
    }
}
