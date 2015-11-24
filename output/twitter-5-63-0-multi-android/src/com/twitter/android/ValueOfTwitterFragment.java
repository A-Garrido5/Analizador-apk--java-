// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import com.twitter.android.client.c;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class ValueOfTwitterFragment extends AbsFragment implements View$OnClickListener
{
    private FollowFlowController a;
    
    public void onClick(final View view) {
        if (view.getId() == 2131887205) {
            com.twitter.android.client.c.a((Context)this.getActivity()).a(this.aF().g(), this.a.f(), "value_of_twitter", "", "", "done");
            this.a.a(this.getActivity());
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        if (bundle != null) {
            this.a = (FollowFlowController)bundle.getParcelable("state_flow_controller");
        }
        else {
            this.a = (FollowFlowController)arguments.getParcelable("flow_controller");
        }
        if (this.a == null) {
            this.a = new FollowFlowController((String)null);
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130969190, viewGroup, false);
        inflate.findViewById(2131887205).setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("state_flow_controller", (Parcelable)this.a);
    }
}
