// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.Button;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class InterestPickerActivity extends TwitterFragmentActivity implements View$OnClickListener, jr
{
    private FollowFlowController a;
    private InterestPickerFragment b;
    private boolean c;
    private boolean d;
    private Button e;
    
    public InterestPickerActivity() {
        this.c = true;
    }
    
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
        bn.c(2130968773);
        bn.b(10);
        bn.a(false);
        return bn;
    }
    
    public void aa_() {
        if (this.c) {
            this.c = false;
            int title;
            if (this.a.e()) {
                title = 2131298218;
            }
            else {
                title = 2131297112;
            }
            this.setTitle(title);
        }
        if (this.e != null) {
            this.e.setEnabled(this.d || this.b.e() > 0);
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        InterestPickerFragment b;
        if (bundle == null) {
            b = new InterestPickerFragment();
            b.a(intent).h(false);
            b.getArguments().putParcelable("flow_controller", (Parcelable)this.a);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, b).commit();
            this.G().a(this.U().g(), this.a.f(), "interest_picker", "", "", "impression");
        }
        else {
            b = (InterestPickerFragment)this.getSupportFragmentManager().findFragmentById(2131886241);
            this.c = bundle.getBoolean("loading");
        }
        (this.b = b).a(this);
        this.d = intent.getBooleanExtra("allow_continue", false);
        this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
        this.e = (Button)this.findViewById(2131886705);
        if (this.e != null) {
            this.e.setText(2131296717);
            this.e.setOnClickListener((View$OnClickListener)this);
        }
        if (this.c) {
            this.setTitle(2131297168);
            return;
        }
        int title;
        if (this.a.e()) {
            title = 2131298218;
        }
        else {
            title = 2131297112;
        }
        this.setTitle(title);
    }
    
    @Override
    public void onBackPressed() {
        this.G().a(this.U().g(), this.a.f(), "interest_picker", "", "back_button:click");
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886705) {
            this.b.r();
            this.a.c("follow_interest_suggestions");
        }
        else if (view.getId() == 2131886704) {
            this.G().a(this.U().g(), this.a.f(), "interest_picker", "", "", "skip");
        }
        this.a.a(this);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a.d("follow_interest_suggestions");
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.a);
        bundle.putBoolean("loading", this.c);
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
