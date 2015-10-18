// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.view.ViewStub;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.TwitterUser;
import android.view.ViewStub$OnInflateListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;

public abstract class ProfileSingleViewFragment extends ScrollingHeaderListFragment implements ViewStub$OnInflateListener
{
    protected TwitterUser a;
    
    public void Z_() {
        super.Z_();
        this.aC();
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return super.a(layoutInflater, 2130969004, viewGroup);
    }
    
    @Override
    protected void a(View inflate) {
        if (inflate instanceof ViewStub) {
            final ViewStub viewStub = (ViewStub)inflate;
            viewStub.setLayoutResource(2130968996);
            inflate = viewStub.inflate();
            final ViewStub viewStub2 = (ViewStub)inflate.findViewById(2131887193);
            viewStub2.setLayoutResource(this.e());
            viewStub2.setOnInflateListener((ViewStub$OnInflateListener)this);
            viewStub2.inflate();
        }
        super.a(inflate);
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, viewGroup);
    }
    
    protected abstract int e();
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a = (TwitterUser)this.getArguments().getParcelable("user");
    }
    
    public boolean p() {
        return true;
    }
    
    @Override
    protected boolean z_() {
        return true;
    }
}
