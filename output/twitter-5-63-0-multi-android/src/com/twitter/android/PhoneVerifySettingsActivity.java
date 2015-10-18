// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.c;
import com.twitter.android.util.al;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import com.twitter.android.util.ap;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import android.content.Intent;
import com.twitter.library.util.ar;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.client.Session;
import com.twitter.ui.dialog.e;
import com.twitter.android.client.bg;

public class PhoneVerifySettingsActivity extends PhoneVerifyBaseActivity implements bg, e
{
    private Session c;
    private String d;
    
    private void c(final String s) {
        this.a(2131297834);
        this.a(mq.a((Context)this, this.c, this.p(), s, false), 2);
        this.g("complete:attempt");
    }
    
    private void d(final String s) {
        this.G().a(this.U().g(), "phone_association:" + this.q() + ":" + s);
    }
    
    private void g(final String s) {
        this.G().a(this.U().g(), "phone_association:" + this.q() + ":device_registration:" + s);
    }
    
    private String q() {
        if (this.a == 0) {
            return "waiting_screen";
        }
        return "pin_entry";
    }
    
    @Override
    public void a(final int n, final y y) {
        if (n == 1) {
            this.o();
            final int[] e = ((mp)y).e();
            int n2;
            if (((aa)y.l().b()).a()) {
                n2 = 2131297761;
                this.g("begin:success");
            }
            else if (e != null && CollectionUtils.a(e, 285)) {
                n2 = 2131297750;
                this.g("begin:registered");
            }
            else if (e != null && CollectionUtils.a(e, 299)) {
                n2 = 2131297751;
                this.g("begin:rate_limit");
            }
            else {
                n2 = 2131297760;
                this.g("begin:failure");
            }
            Toast.makeText((Context)this, n2, 1).show();
        }
        else if (n == 2) {
            this.o();
            if (((aa)y.l().b()).a()) {
                ar.a((Context)this).a(true, true);
                final ab p2 = y.P();
                if (p2 != null) {
                    this.a(new qd((Context)this, p2, p2.c, p2.e));
                }
                this.startActivity(new Intent((Context)this, (Class)AccountSettingsActivity.class).putExtra("phone_association", this.p()).putExtra("AccountSettingsActivity_account_name", p2.e).putExtra("account_id", p2.c).setFlags(67108864));
                if (this.getIntent().getBooleanExtra("umf_flow", false)) {
                    this.setResult(-1);
                    this.finish();
                }
                this.g("complete:success");
                return;
            }
            this.j();
            Toast.makeText((Context)this, 2131297762, 1).show();
            this.g("complete:pin_invalid");
        }
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 0) {
            if (n2 != -1) {
                this.d(":resend:cancel");
                return;
            }
            this.a(mp.a((Context)this, this.c, this.p()), 1);
            this.d(":resend:accept");
            this.g("begin:attempt");
        }
    }
    
    @Override
    public void a(final String s) {
        this.c(s);
    }
    
    @Override
    public void ag_() {
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.c = this.T().b(this.getIntent().getStringExtra("account_name"));
        this.d = this.getIntent().getStringExtra("phone");
    }
    
    @Override
    public void b(final String s) {
        this.c(s);
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void g() {
        this.d(":manual_entry:click");
        this.m();
    }
    
    @Override
    public void h() {
        PromptDialogFragment.b(0).c(2131297422).h(2131297424).j(2131296445).a(this.getSupportFragmentManager());
        this.d(":resend:click");
    }
    
    @Override
    public String i() {
        final al a = ap.a((Context)this);
        final String a2 = a.a(a.a(this.d), PhoneNumberUtil$PhoneNumberFormat.b);
        if (a2 != null) {
            return a2.replace(" ", " ");
        }
        return "";
    }
    
    @Override
    protected void m() {
        super.m();
        this.d("::impression");
    }
    
    @Override
    protected void n() {
        super.n();
        this.d("::impression");
    }
    
    public void onPause() {
        super.onPause();
        com.twitter.android.client.c.a((Context)this).g();
    }
    
    public void onResume() {
        super.onResume();
        com.twitter.android.client.c.a((Context)this).a(this);
    }
    
    @Override
    protected String p() {
        return this.d;
    }
}
