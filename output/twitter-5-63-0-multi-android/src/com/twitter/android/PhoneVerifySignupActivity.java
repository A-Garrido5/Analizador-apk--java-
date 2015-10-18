// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.PromptDialogFragment;
import android.app.Activity;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import android.widget.Toast;
import android.text.TextUtils;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.ui.dialog.e;

public class PhoneVerifySignupActivity extends PhoneVerifyBaseActivity implements sr, e
{
    private SignUpFlowController c;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.d(false);
        return a;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 0) {
            if (n2 == 0) {
                if (!TextUtils.isEmpty((CharSequence)this.c.c())) {
                    this.c.a("", "resend", "accept");
                    this.c.x();
                    Toast.makeText((Context)this, 2131297429, 0).show();
                    return;
                }
                Toast.makeText((Context)this, 2131297427, 0).show();
                this.k();
            }
            else {
                if (n2 == 1) {
                    this.c.v().b(true).a("", "resend", "change");
                    this.k();
                    return;
                }
                this.c.a("", "resend", "cancel");
            }
        }
    }
    
    @Override
    public void a(final boolean b, final int[] array) {
        if (!b && array != null) {
            int n;
            if (CollectionUtils.a(array, 285)) {
                n = 2131297821;
            }
            else if (CollectionUtils.a(array, 295)) {
                n = 2131297820;
            }
            else {
                n = 2131297818;
            }
            Toast.makeText((Context)this, n, 1).show();
        }
    }
    
    @Override
    public void ag_() {
        this.c.h("manual_pin_entry");
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.c = SignUpFlowController.a((Context)this);
        super.b(bundle, bn);
    }
    
    @Override
    public void b(final String s) {
        if (this.c.t()) {
            this.c.f(s).y();
        }
    }
    
    @Override
    public void b(final boolean b) {
        this.o();
        if (b) {
            this.c.b((Activity)this);
        }
        else if (this.c.s()) {
            this.c.d(this);
        }
    }
    
    @Override
    public void b(final boolean b, final int[] array) {
        if (b) {
            if (this.a == 1) {
                ((ManualEntryPinFragment)this.b).a(false);
            }
            this.a(2131297807);
            this.c.z();
            return;
        }
        this.o();
        this.j();
        if (array == null) {
            this.c.a(2131297818).d(this);
            return;
        }
        if (CollectionUtils.a(array, 294)) {
            Toast.makeText((Context)this, 2131297433, 1).show();
            return;
        }
        this.c.a(2131297818).d(this);
    }
    
    @Override
    public void f() {
        this.c.h("waiting_screen");
    }
    
    @Override
    public void g() {
        this.c.a("", "manual_entry", "click");
        this.c.g("manual_pin_entry").a((Activity)this);
    }
    
    @Override
    public void h() {
        this.c.a("", "resend", "click");
        PromptDialogFragment.b(0).c(2131297422).e(2131361822).a(this.getSupportFragmentManager());
    }
    
    @Override
    public String i() {
        return this.c.d();
    }
    
    @Override
    protected void m() {
        super.m();
        this.c.a("", "", "impression");
    }
    
    @Override
    protected void n() {
        super.n();
        this.c.a("", "", "impression");
    }
    
    @Override
    public void onBackPressed() {
        if (this.l() == 1) {
            this.c.v();
        }
        super.onBackPressed();
    }
    
    public void onPause() {
        super.onPause();
        this.c.b((sr)this);
    }
    
    public void onResume() {
        super.onResume();
        this.c.a((sr)this);
    }
    
    @Override
    protected String p() {
        return this.c.c();
    }
    
    @Override
    public void q() {
        this.a(2131297428);
    }
}
