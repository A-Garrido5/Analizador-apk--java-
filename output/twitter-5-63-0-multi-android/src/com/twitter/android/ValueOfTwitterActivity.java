// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class ValueOfTwitterActivity extends TwitterFragmentActivity
{
    private FollowFlowController a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        Parcelable parcelable;
        if (bundle == null) {
            parcelable = intent.getParcelableExtra("flow_controller");
        }
        else {
            parcelable = bundle.getParcelable("flow_controller");
        }
        this.a = (FollowFlowController)parcelable;
        if (this.a == null) {
            this.a = new FollowFlowController((String)null);
        }
        bn.c(2130969191);
        bn.e(true);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        if (bundle == null) {
            final ValueOfTwitterFragment valueOfTwitterFragment = new ValueOfTwitterFragment();
            final Bundle arguments = new Bundle();
            arguments.putParcelable("flow_controller", (Parcelable)this.a);
            valueOfTwitterFragment.setArguments(arguments);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, valueOfTwitterFragment).commit();
            this.G().a(this.U().g(), this.a.f(), "value_of_twitter", "", "", "impression");
        }
    }
    
    @Override
    public void onBackPressed() {
        this.G().a(this.U().g(), this.a.f(), "value_of_twitter", "", "back_button:click");
        super.onBackPressed();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.a);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        FollowFlowController.d(this);
    }
    
    @Override
    protected void onStop() {
        if (this.isFinishing()) {
            FollowFlowController.d(this);
        }
        else {
            this.a.c(this);
        }
        super.onStop();
    }
}
