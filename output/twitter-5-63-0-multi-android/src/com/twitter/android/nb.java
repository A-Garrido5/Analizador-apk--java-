// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AbsListView;
import com.twitter.android.client.TwitterListFragment;
import android.support.v4.app.Fragment;
import com.twitter.internal.android.widget.DockLayout;
import android.support.v4.view.ViewPager;
import android.net.Uri;
import com.twitter.android.client.bw;

public class nb implements bw
{
    final Uri b;
    final ViewPager c;
    final DockLayout d;
    final AbsPagesAdapter e;
    
    public nb(final Uri b, final ViewPager c, final DockLayout d, final AbsPagesAdapter e) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    private boolean a(final gm gm, final Fragment fragment) {
        return gm != null && fragment != null && gm.a().equals(fragment.getTag());
    }
    
    gm a() {
        return this.e.a(this.c.getCurrentItem());
    }
    
    @Override
    public void a(final TwitterListFragment twitterListFragment) {
        if (this.d != null && this.a(this.a(), twitterListFragment)) {
            this.d.a(0);
            this.d.setTopLocked(true);
        }
    }
    
    @Override
    public void a(final TwitterListFragment twitterListFragment, final AbsListView absListView, final int n) {
    }
    
    @Override
    public void b(final TwitterListFragment twitterListFragment) {
        if (this.d != null && this.a(this.a(), twitterListFragment)) {
            this.d.setTopLocked(false);
        }
    }
}
