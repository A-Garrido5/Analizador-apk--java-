// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.widget.u;
import com.twitter.library.widget.FadeInTextView;
import com.twitter.android.client.TwitterFragmentActivity;

public class InstantTimelineWaitingActivity extends TwitterFragmentActivity
{
    private FollowFlowController a;
    private boolean b;
    
    private void h() {
        ((FadeInTextView)this.findViewById(2131886889)).setCycleListener(null);
        this.a.a(this);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        bn.a(0);
        bn.c(2130968844);
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
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        if (bundle == null) {
            this.G().a(this.U().g(), "instant_timeline", "loading", null, null, "impression");
        }
        ((FadeInTextView)this.findViewById(2131886889)).setCycleListener(new jo(this));
    }
    
    public void onPause() {
        if (this.isFinishing()) {
            FollowFlowController.d(this);
        }
        else {
            this.G().a(this.U().g(), "instant_timeline", "loading", null, null, "background");
            this.a.c(this);
        }
        super.onPause();
    }
    
    public void onResume() {
        super.onResume();
        FollowFlowController.d(this);
        if (this.b) {
            this.G().a(this.U().g(), "instant_timeline", "loading", null, null, "foreground");
            this.h();
        }
        this.b = true;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.a);
    }
}
