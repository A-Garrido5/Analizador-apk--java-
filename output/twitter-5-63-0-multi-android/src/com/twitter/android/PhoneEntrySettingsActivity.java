// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.aj;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session;

public class PhoneEntrySettingsActivity extends PhoneEntryBaseActivity
{
    private String c;
    private Session d;
    
    private void b(final String s) {
        this.G().a(this.d.g(), "phone_association:add_phone:device_registration:" + s);
    }
    
    public void J_() {
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.b(false);
        return a;
    }
    
    public void a(final int n, final y y) {
        if (n == 1) {
            this.h();
            final aj t = ((mp)y).t();
            final int[] e = ((mp)y).e();
            if (((aa)y.l().b()).a()) {
                final Intent putExtra = new Intent((Context)this, (Class)PhoneVerifySettingsActivity.class).putExtra("liveFragment", 0).putExtra("phone", t.a).putExtra("account_name", this.c);
                if (this.getIntent().getBooleanExtra("umf_flow", false)) {
                    putExtra.putExtra("umf_flow", true);
                    this.startActivityForResult(putExtra, 2);
                }
                else {
                    this.startActivity(putExtra);
                }
                this.b("begin:success");
            }
            else {
                if (e != null && CollectionUtils.a(e, 285)) {
                    Toast.makeText((Context)this, 2131297750, 1).show();
                    this.b("begin:registered");
                    return;
                }
                if (e != null && CollectionUtils.a(e, 299)) {
                    Toast.makeText((Context)this, 2131297751, 1).show();
                    this.b("begin:rate_limit");
                    return;
                }
                this.i();
                this.b("begin:failure");
            }
        }
    }
    
    public void b() {
        final String a = this.a.a(this.a.a(this.g()));
        if (a != null) {
            this.a(2131297834);
            this.a(mp.a((Context)this, this.d, a), 1);
        }
        else {
            this.i();
        }
        this.b("begin:attempt");
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.c = this.getIntent().getStringExtra("account_name");
        this.d = this.T().b(this.c);
        this.findViewById(2131886704).setVisibility(8);
    }
    
    public void g_() {
        super.onBackPressed();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 2 && n2 == -1) {
            this.finish();
        }
    }
}
