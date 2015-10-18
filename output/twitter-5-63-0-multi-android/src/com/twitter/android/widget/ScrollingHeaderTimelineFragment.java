// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.support.v4.app.FragmentActivity;
import com.twitter.android.ScrollingHeaderActivity;
import com.twitter.library.service.y;
import android.content.Context;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import com.twitter.android.oy;
import android.widget.ListView;
import com.twitter.refresh.widget.a;
import com.twitter.android.TimelineFragment;

public class ScrollingHeaderTimelineFragment extends TimelineFragment
{
    @Override
    public a E() {
        final ListView y = this.Y();
        final int headerViewsCount = y.getHeaderViewsCount();
        final int firstVisiblePosition = y.getFirstVisiblePosition();
        if (firstVisiblePosition < headerViewsCount) {
            return new a(firstVisiblePosition, -1L, 0);
        }
        return super.E();
    }
    
    @Override
    protected Loader a(final oy oy) {
        return new CursorLoader((Context)this.getActivity(), oy.a, oy.b, oy.c, oy.d, oy.e);
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        super.a(n, y);
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof ScrollingHeaderActivity) {
            ((ScrollingHeaderActivity)activity).a(false);
        }
    }
    
    @Override
    protected boolean aA() {
        return true;
    }
    
    @Override
    protected void k() {
    }
    
    @Override
    protected boolean z_() {
        return true;
    }
}
