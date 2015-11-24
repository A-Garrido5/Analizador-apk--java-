// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.profiles.c;
import android.content.Context;
import com.twitter.android.profiles.b;
import android.view.View;
import android.view.ViewStub;

public class ProfileBlockerInterstitialFragment extends ProfileSingleViewFragment
{
    @Override
    protected int e() {
        return 2130968992;
    }
    
    public void onInflate(final ViewStub viewStub, final View view) {
        final com.twitter.android.profiles.b b = new com.twitter.android.profiles.b((Context)this.getActivity(), view, this.a.username);
        if (this.getActivity() instanceof com.twitter.android.profiles.c) {
            b.a((com.twitter.android.profiles.c)this.getActivity());
        }
    }
}
