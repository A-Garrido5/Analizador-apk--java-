// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.aj;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import com.twitter.library.service.y;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.app.Activity;

public class PhoneEntryNuxActivity extends PhoneEntryBaseActivity
{
    private FollowFlowController c;
    
    private void b(final String s) {
        this.G().a(this.U().g(), this.c.f(), "enter_phone", "device_registration", "begin", s);
    }
    
    public void J_() {
        this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::skip" });
        this.c.a(this);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.b(10);
        final Intent intent = this.getIntent();
        Parcelable parcelable;
        if (bundle == null) {
            parcelable = intent.getParcelableExtra("flow_controller");
        }
        else {
            parcelable = bundle.getParcelable("flow_controller");
        }
        this.c = (FollowFlowController)parcelable;
        if (this.c == null) {
            this.c = new FollowFlowController((String)null);
        }
        return a;
    }
    
    public void a(final int n, final y y) {
        if (n == 1) {
            this.h();
            final aj t = ((mp)y).t();
            String a;
            if (t == null) {
                a = null;
            }
            else {
                a = t.a;
            }
            final int[] e = ((mp)y).e();
            if (y.X() && !TextUtils.isEmpty((CharSequence)a)) {
                this.b("success");
                this.c.b(a).c("phone_verify");
                this.c.a(this);
            }
            else {
                if (e != null && CollectionUtils.a(e, 285)) {
                    Toast.makeText((Context)this, 2131297750, 1).show();
                    this.b("registered");
                    return;
                }
                if (e != null && CollectionUtils.a(e, 299)) {
                    Toast.makeText((Context)this, 2131297751, 1).show();
                    this.b("rate_limit");
                    return;
                }
                this.i();
                this.b("failure");
            }
        }
    }
    
    public void b() {
        this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::submit" });
        final String g = this.g();
        if (TextUtils.isEmpty((CharSequence)g)) {
            this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::unavailable" });
            this.i();
            return;
        }
        final String a = this.a.a(this.a.a(g));
        if (a != null) {
            this.findViewById(2131887109).setVisibility(8);
            this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::success" });
            this.a(2131297834);
            this.a(mp.a((Context)this, this.U(), a), 1);
            return;
        }
        this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::error" });
        this.i();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        if (bundle == null) {
            this.G().a(this.U().g(), new String[] { this.c.f(), "enter_phone:::impression" });
        }
    }
    
    @Override
    public void onBackPressed() {
        this.G().a(this.U().g(), this.c.f(), "enter_phone", "", "back_button:click");
        super.onBackPressed();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.c.d("phone_verify");
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.c);
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
        else if (this.c != null) {
            this.c.c(this);
        }
        super.onStop();
    }
}
