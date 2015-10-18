// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListView;
import com.twitter.library.scribe.ScribeLog;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.support.v4.content.Loader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import com.twitter.refresh.widget.a;
import com.twitter.library.api.TwitterTopic;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import com.twitter.library.scribe.TwitterScribeAssociation;

public class EventGridFragment extends SearchPhotosFragment
{
    private boolean I;
    private int ao;
    
    @Override
    protected nw P_() {
        final nw p_ = super.P_();
        p_.a(true);
        return p_;
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof ScrollingHeaderActivity) {
            ((ScrollingHeaderActivity)activity).a(false);
        }
    }
    
    @Override
    protected void a(final Context context) {
        if (this.I) {
            super.a(context);
            return;
        }
        this.A();
    }
    
    @Override
    protected void a(final TwitterTopic twitterTopic) {
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        if (this.b(a.b) >= this.Y().getHeaderViewsCount() || !b) {
            this.b(1, a.c);
        }
    }
    
    @Override
    protected void a_(final int n) {
    }
    
    @Override
    protected void ae_() {
        this.I = false;
        super.ae_();
    }
    
    @Override
    protected View$OnClickListener b(final Context context) {
        return (View$OnClickListener)new hl(this, context);
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968903, viewGroup);
    }
    
    @Override
    protected void c() {
        this.I = true;
        super.c();
    }
    
    @Override
    protected void c_(final int n) {
        if (n == 2 && this.G != null) {
            this.G.a();
        }
        else if (n == 3 || n == 5) {
            this.g(false);
        }
    }
    
    @Override
    protected void k() {
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.ao = this.getResources().getDimensionPixelSize(2131558806);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(aw.a, this.aF().g()), cc.a, "search_id=?", new String[] { String.valueOf(this.s) }, "type_id ASC, _id ASC");
    }
    
    @Override
    public void r() {
        final ListView y = this.Y();
        if (y != null && y.getFirstVisiblePosition() != 0) {
            this.b(1, this.ao);
        }
        if (this.o > 0) {
            this.e();
            this.a(ScribeLog.a(this.B, this.M_(), "new_tweet_prompt", null, "click"));
        }
    }
    
    @Override
    public int t() {
        return 7;
    }
    
    @Override
    protected boolean z_() {
        return true;
    }
}
