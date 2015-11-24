// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.c;
import android.view.View;
import android.support.v4.app.Fragment;
import com.twitter.android.util.al;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import com.twitter.android.util.ap;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.util.q;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import android.widget.Button;
import android.app.Activity;
import com.twitter.library.util.ar;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.service.y;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.ui.dialog.e;
import com.twitter.android.client.bg;
import android.view.View$OnClickListener;

public class PhoneVerifyNuxActivity extends PhoneVerifyBaseActivity implements View$OnClickListener, bg, e
{
    private FollowFlowController c;
    private Session d;
    private String e;
    
    private void c(final String s) {
        this.G().a(this.U().g(), this.c.f(), "enter_phone_verify", "", s);
    }
    
    private void d(final String s) {
        this.G().a(this.U().g(), this.c.f(), "enter_phone_verify", "device_registration", s);
    }
    
    private void q() {
        if (TextUtils.isEmpty((CharSequence)this.p())) {
            this.d("complete:failure");
            return;
        }
        this.a(mq.a((Context)this, this.d, this.p(), this.e, false), 2);
        this.d("complete:attempt");
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
        this.c = (FollowFlowController)parcelable;
        bn.a(false);
        bn.a(0);
        bn.c(2130968773);
        bn.b(10);
        if (this.c == null) {
            this.c = new FollowFlowController((String)null);
        }
        return bn;
    }
    
    public void a(final int n, final y y) {
        if (n == 1) {
            this.o();
            final int[] e = ((mp)y).e();
            int n2;
            if (((aa)y.l().b()).a()) {
                n2 = 2131297761;
                this.d("begin:success");
            }
            else if (e != null && CollectionUtils.a(e, 285)) {
                n2 = 2131297750;
                this.d("begin:registered");
            }
            else if (e != null && CollectionUtils.a(e, 299)) {
                n2 = 2131297751;
                this.d("begin:rate_limit");
            }
            else {
                n2 = 2131297760;
                this.d("begin:failure");
            }
            Toast.makeText((Context)this, n2, 1).show();
        }
        else if (n == 2) {
            if (((aa)y.l().b()).a()) {
                ar.a((Context)this).a(true, true);
                final ab p2 = y.P();
                if (p2 != null) {
                    this.a(new qd((Context)this, p2, p2.c, p2.e));
                }
                this.d("complete:success");
                this.c.a(this);
                return;
            }
            this.j();
            final Button button = (Button)this.findViewById(2131886705);
            if (button != null) {
                button.setEnabled(false);
            }
            Toast.makeText((Context)this, 2131297762, 1).show();
            this.d("complete:pin_invalid");
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 0) {
            if (n2 != -1) {
                this.c("resend:cancel");
                return;
            }
            final String p3 = this.p();
            if (q.a(p3)) {
                this.c("resend:failure");
                return;
            }
            this.a(2131297834);
            this.a(mp.a((Context)this, this.d, p3), 1);
            this.d("begin:attempt");
            this.c("resend:accept");
        }
    }
    
    public void a(final String e) {
        this.e = e;
        this.q();
    }
    
    public void ag_() {
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.d = this.T().b(this.getIntent().getStringExtra("account_name"));
        if (bundle == null) {
            this.G().a(this.U().g(), this.c.f(), "enter_phone_verify", "", "", "impression");
        }
        this.findViewById(2131886704).setVisibility(8);
        final Button button = (Button)this.findViewById(2131886705);
        button.setText(2131297431);
        button.setEnabled(false);
        button.setOnClickListener((View$OnClickListener)this);
        super.b(bundle, bn);
    }
    
    public void b(final String e) {
        this.findViewById(2131886705).setEnabled(true);
        this.e = e;
    }
    
    public void f() {
    }
    
    public void g() {
    }
    
    public void h() {
        PromptDialogFragment.b(0).c(2131297422).h(2131297424).j(2131296445).a(this.getSupportFragmentManager());
        this.c("resend:click");
    }
    
    public String i() {
        final al a = ap.a((Context)this);
        final String a2 = a.a(a.a(this.p()), PhoneNumberUtil$PhoneNumberFormat.b);
        if (a2 != null) {
            return a2.replace(" ", " ");
        }
        return "";
    }
    
    @Override
    protected void m() {
        this.a = 1;
        this.b = new ManualEntryPinFragment();
        final Bundle arguments = new Bundle();
        arguments.putBoolean("nux_flow", true);
        this.b.setArguments(arguments);
        this.getSupportFragmentManager().beginTransaction().add(2131886241, this.b, "manual").addToBackStack("manual").commit();
    }
    
    @Override
    protected void n() {
    }
    
    @Override
    public void onBackPressed() {
        this.G().a(this.U().g(), this.c.f(), "enter_phone_verify", "", "back_button:click");
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886705) {
            this.G().a(this.U().g(), this.c.f(), "enter_phone_verify", "", "", "submit");
            this.q();
        }
    }
    
    public void onPause() {
        super.onPause();
        com.twitter.android.client.c.a((Context)this).g();
    }
    
    public void onResume() {
        super.onResume();
        com.twitter.android.client.c.a((Context)this).a(this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.c);
    }
    
    protected void onStart() {
        super.onStart();
        FollowFlowController.d(this);
    }
    
    protected void onStop() {
        if (this.isFinishing()) {
            FollowFlowController.d(this);
        }
        else if (this.c != null) {
            this.c.c(this);
        }
        super.onStop();
    }
    
    @Override
    protected String p() {
        return this.c.a();
    }
}
