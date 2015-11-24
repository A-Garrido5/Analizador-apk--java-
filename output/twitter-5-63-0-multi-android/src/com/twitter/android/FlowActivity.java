// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.content.Intent;
import com.twitter.library.client.au;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.client.as;
import com.twitter.util.q;
import java.util.List;
import android.support.v4.app.Fragment;
import com.twitter.library.client.AbsFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class FlowActivity extends TwitterFragmentActivity implements View$OnClickListener, hu, ml, mo, ng
{
    private FlowPresenter a;
    
    public void J_() {
    }
    
    public void R_() {
        this.a.a(new Flow$EmailSignupStep(), null);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        bn.a(0);
        bn.c(2130968770);
        bn.b(10);
        bn.d(false);
        return bn;
    }
    
    public void a(final ht ht) {
        this.a.a(ht);
    }
    
    public void a(final AbsFragment absFragment, final FlowPresenter$Direction flowPresenter$Direction) {
        this.getSupportFragmentManager().beginTransaction().replace(2131886241, absFragment).commit();
    }
    
    public void a(final String s) {
        this.a.a().b(s);
    }
    
    public void a(final boolean b) {
    }
    
    public void b() {
        this.a.b();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        if (this.a == null) {
            this.a = new hv(this);
        }
        if (bundle != null) {
            this.a.b(bundle);
        }
        else {
            this.a.a(new FlowActivity$1(this, this.getIntent().getBooleanExtra("phone100_signup_first_step_password", false)), new FlowData());
        }
        this.a.a(FlowPresenter$Direction.a);
        if (this.findViewById(2131886763) != null) {
            this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
            this.findViewById(2131886705).setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public void b(final String s) {
        this.a.a().a(s);
    }
    
    public void b(final boolean b) {
        final String b2 = this.a.a().b();
        if (!q.a(b2)) {
            as.a((Context)this).a(new oj(this.getApplicationContext(), this.U(), b2), 1, 0, new sw(this));
            if (b) {
                this.d();
            }
            return;
        }
        this.a.a(new ht(null, null, this.getString(2131297817), null, null));
    }
    
    public void d() {
        this.a.b(FlowPresenter$Direction.a);
    }
    
    public void f() {
        this.startActivity(new Intent((Context)this, (Class)LoggedOutSettingsActivity.class).putExtra("show_disco_settings", true));
    }
    
    public void g() {
        this.finish();
    }
    
    @Override
    public void onBackPressed() {
        this.a.b(FlowPresenter$Direction.b);
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886705) {
            this.b();
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.a(bundle);
    }
}
