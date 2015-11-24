// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.widget.AbsListView;
import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import android.view.View;
import com.twitter.library.client.Session;
import com.twitter.android.util.ai;

public class MentionTimelineFragment extends TimelineFragment
{
    private ai k;
    private boolean l;
    
    public MentionTimelineFragment() {
        this.l = true;
    }
    
    @Override
    protected void a(final long n, final long n2) {
        super.a(n, n2);
        final Session b = this.aE().b(n2);
        this.k.a(com.twitter.android.util.ai.a(this.O), b.g(), b.e());
    }
    
    @Override
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        super.a(view, tweet, bundle);
        this.k.a(tweet.A);
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.k.c();
        }
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (n == 0 && n2 > 0) {
            this.k.b();
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.k.c();
    }
    
    @Override
    protected boolean n() {
        return this.l && super.n();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.l = this.getArguments().getBoolean("should_fetch_new_data", true);
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final Session af = this.aF();
        this.k = new ai((Context)this.getActivity(), com.twitter.android.util.ai.a(this.O), af.g(), af.e());
    }
}
