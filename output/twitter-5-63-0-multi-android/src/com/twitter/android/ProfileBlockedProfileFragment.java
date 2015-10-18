// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.android.profiles.ah;
import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;

public class ProfileBlockedProfileFragment extends ProfileSingleViewFragment
{
    @Override
    protected int e() {
        return 2130969000;
    }
    
    public void onInflate(final ViewStub viewStub, final View view) {
        view.findViewById(2131887195).setVisibility(8);
        com.twitter.android.profiles.ah.a((Context)this.getActivity(), (TextView)view.findViewById(2131887196), this.a.username);
    }
}
