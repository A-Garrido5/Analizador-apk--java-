// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import android.view.View;
import android.widget.ListView;

public class ar extends ag
{
    public final ListView h;
    
    public ar(final int n, final View view) {
        super(n, view);
        this.h = (ListView)view.findViewById(2131886871);
    }
    
    public void a(final ao adapter) {
        final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)this.h.getAdapter();
        if (headerViewListAdapter == null || headerViewListAdapter.getWrappedAdapter() != adapter) {
            final View child = this.h.getChildAt(0);
            int firstVisiblePosition;
            int top;
            if (child != null) {
                firstVisiblePosition = this.h.getFirstVisiblePosition();
                top = child.getTop();
            }
            else {
                top = 0;
                firstVisiblePosition = 0;
            }
            this.h.setAdapter((ListAdapter)adapter);
            this.h.setSelectionFromTop(firstVisiblePosition, top);
        }
    }
}
