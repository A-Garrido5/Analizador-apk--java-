// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.Button;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class EmailEntryActivity extends TwitterFragmentActivity implements View$OnClickListener, mo
{
    private Button a;
    private EmailEntryFragment b;
    private SignUpFlowController c;
    
    public void J_() {
        this.c.a("", "", "skip");
        this.b.c();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968749);
        bn.a(false);
        bn.b(false);
        bn.b(10);
        return bn;
    }
    
    public void a(final boolean enabled) {
        this.a.setEnabled(enabled);
    }
    
    public void b() {
        this.c.a("", "", "next");
        this.b.a(this.c.b());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131296927);
        this.c = SignUpFlowController.a((Context)this);
        this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
        (this.a = (Button)this.findViewById(2131886705)).setOnClickListener((View$OnClickListener)this);
        if (bundle == null) {
            (this.b = new EmailEntryFragment()).setArguments(new Bundle());
            this.c.a("", "", "impression");
            this.getSupportFragmentManager().beginTransaction().add(2131886241, this.b).commit();
        }
    }
    
    public void d() {
        this.c.c(this);
    }
    
    public void onAttachFragment(final Fragment fragment) {
        super.onAttachFragment(fragment);
        if (this.b == null) {
            this.b = (EmailEntryFragment)fragment;
        }
    }
    
    @Override
    public void onBackPressed() {
        this.c.c(this);
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131886704: {
                this.J_();
            }
            case 2131886705: {
                this.b();
            }
        }
    }
}
