// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.view.View;
import android.widget.ListView;
import android.widget.AbsListView;
import com.twitter.android.EventGridFragment;

public class ScrollableEventGridFragment extends EventGridFragment implements e
{
    private final com.twitter.android.events.d I;
    private boolean ao;
    private int ap;
    private int aq;
    
    public ScrollableEventGridFragment() {
        this.I = new com.twitter.android.events.d();
        this.ao = false;
        this.ap = 0;
        this.aq = 0;
    }
    
    @Override
    public void R() {
    }
    
    @Override
    public void S() {
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        final TwitterEventActivity twitterEventActivity = (TwitterEventActivity)this.getActivity();
        if (twitterEventActivity.q()) {
            this.I.a(n);
            twitterEventActivity.a(this.I);
            this.I.d();
            if (n == 0) {
                final ListView y = this.Y();
                final View child = y.getChildAt(0);
                if (child != null) {
                    this.ap = y.getFirstVisiblePosition();
                    this.aq = child.getTop();
                }
            }
            return super.a(absListView, n);
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        final TwitterEventActivity twitterEventActivity = (TwitterEventActivity)this.getActivity();
        if (twitterEventActivity.q()) {
            this.I.a(absListView, n, b, this.ai);
            twitterEventActivity.a(this.I);
            this.I.d();
            return super.a(absListView, n, n2, n3, b);
        }
        return false;
    }
    
    @Override
    protected void c() {
        this.I.d();
        this.I.b(0);
        super.c();
    }
    
    @Override
    public void e(int aq) {
        final int ap = this.ap;
        if (this.ap != 0) {
            aq = this.aq;
        }
        this.b(ap, aq);
    }
    
    @Override
    protected void k() {
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.ao = true;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.ao) {
            this.i();
            this.ao = false;
        }
    }
    
    @Override
    public int t() {
        return -1;
    }
}
