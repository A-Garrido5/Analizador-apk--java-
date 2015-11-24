// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import android.support.v4.app.FragmentActivity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.twitter.android.client.bz;
import android.os.Bundle;
import com.twitter.library.api.TwitterLocation;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.si;
import com.twitter.android.SelectionFragment;

public class TrendsLocationFragment extends SelectionFragment
{
    private h k;
    
    public TrendsLocationFragment() {
        super(new i((g)null));
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return super.a(layoutInflater, 2130969141, viewGroup);
    }
    
    protected void a(final long n, final String s, final TwitterLocation twitterLocation) {
        if (this.k != null) {
            this.k.a(twitterLocation);
        }
    }
    
    public void a(final h k) {
        this.k = k;
    }
    
    public boolean a(final String s, final long n, final TwitterLocation twitterLocation) {
        this.a(n, twitterLocation.a(), twitterLocation);
        return true;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.f = new dh(new dd((Context)activity, this.c.b(), bz.h(), new Handler(Looper.getMainLooper())));
        this.g = new cq((Context)activity);
        activity.setTitle(2131297953);
    }
}
