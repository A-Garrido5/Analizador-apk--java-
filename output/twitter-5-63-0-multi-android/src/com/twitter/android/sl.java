// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.refresh.widget.RefreshableListView;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.widget.ListView;
import android.view.View;
import android.content.Context;

public class sl
{
    private final Context a;
    private final int b;
    private View c;
    private int d;
    
    public sl(final Context a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final ListView listView) {
        final View c = new View(this.a);
        c.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, this.b));
        final View emptyView = listView.getEmptyView();
        if (emptyView != null) {
            this.d = emptyView.getPaddingTop();
            emptyView.setPadding(emptyView.getPaddingLeft(), this.d + this.b, emptyView.getPaddingRight(), emptyView.getPaddingBottom());
        }
        if (listView instanceof RefreshableListView) {
            final RefreshableListView refreshableListView = (RefreshableListView)listView;
            refreshableListView.a(0, c, null, false);
            refreshableListView.setRefreshHeaderPosition(1);
        }
        this.c = c;
    }
    
    public void a(final ListView listView, final int height) {
        this.c.getLayoutParams().height = height;
        this.c.requestLayout();
        final View emptyView = listView.getEmptyView();
        if (emptyView != null) {
            emptyView.setPadding(emptyView.getPaddingLeft(), height + this.d, emptyView.getPaddingRight(), emptyView.getPaddingBottom());
        }
    }
    
    public void b(final ListView listView) {
        this.a(listView, this.b);
    }
}
