// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.view.View;
import android.content.Intent;
import com.twitter.library.client.bh;
import android.text.TextWatcher;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.client.bd;
import com.twitter.library.client.Session;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.os.Handler;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import com.twitter.android.widget.ProgressDialogFragment;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class VerifyLoginActivity extends TwitterFragmentActivity implements View$OnClickListener
{
    String a;
    private ProgressDialogFragment b;
    private LoginVerificationRequiredResponse c;
    private Handler d;
    private Button e;
    private Button f;
    private TextView g;
    private EditText h;
    private int i;
    private long j;
    private String k;
    private String l;
    private Session m;
    private bd n;
    
    public VerifyLoginActivity() {
        this.n = new zb(this);
    }
    
    private void a(final String s, final int n, final int n2) {
        if (n2 == 88) {
            this.G().a(this.U().g(), s + "::rate_limit");
        }
        this.G().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(new String[] { s + "::failure" })).d(String.valueOf(n))).c(String.valueOf(n2)));
    }
    
    private void h() {
        if (this.i == 1) {
            this.G().a(this.U().g(), "native_login:sms_verification::back_button:click");
        }
        else {
            this.G().a(this.U().g(), "native_login:push_verification::back_button:click");
        }
        if (this.m != null) {
            this.m.a(Session$LoginStatus.a);
        }
    }
    
    private void i() {
        (this.b = ProgressDialogFragment.a(2131298100)).a(this.getSupportFragmentManager());
        this.a = this.T().a(this.m, this.c.a, this.c.b, this.h.getText().toString(), this.n);
    }
    
    private void j() {
        if (this.e != null && this.g != null) {
            this.e.setVisibility(8);
            this.g.setVisibility(0);
        }
        this.h.setVisibility(0);
        this.f.setVisibility(0);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.c = (LoginVerificationRequiredResponse)this.getIntent().getParcelableExtra("login_verification_required_response");
        this.i = this.c.c;
        bn.a(false);
        bn.d(false);
        bn.b(false);
        if (this.i == 2) {
            bn.c(2130969192);
            return bn;
        }
        bn.c(2130969193);
        return bn;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131886126) {
            this.h();
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.d = new Handler();
        this.h = (EditText)this.findViewById(2131887339);
        final Button f = (Button)this.findViewById(2131887341);
        this.f = f;
        this.g = (TextView)this.findViewById(2131887338);
        this.e = (Button)this.findViewById(2131887340);
        this.h.addTextChangedListener((TextWatcher)new yz(this, f));
        f.setOnClickListener((View$OnClickListener)this);
        if (this.e != null) {
            this.e.setOnClickListener((View$OnClickListener)this);
        }
        if (this.i == 1) {
            this.j();
            this.G().a(this.U().g(), "native_login:sms_verification:::impression");
        }
        else {
            this.G().a(this.U().g(), "native_login:push_verification:::impression");
        }
        final TextView textView = (TextView)this.findViewById(2131887342);
        textView.setPaintFlags(0x8 | textView.getPaintFlags());
        textView.setOnClickListener((View$OnClickListener)this);
        this.j = 2000L;
        final Intent intent = this.getIntent();
        this.k = intent.getStringExtra("username");
        final az t = this.T();
        if (bundle != null) {
            t.a(this.a = bundle.getString("reqId"), this.n);
            this.l = bundle.getString("session_id");
            return;
        }
        this.l = intent.getStringExtra("session_id");
    }
    
    @Override
    public void onBackPressed() {
        this.h();
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131887341) {
            this.i();
            if (this.i != 1) {
                this.G().a(this.U().g(), "native_login:push_verification:backup_code::send");
                return;
            }
            this.G().a(this.U().g(), "native_login:sms_verification:login_code::send");
        }
        else {
            if (id == 2131887340) {
                this.j();
                this.G().a(this.U().g(), "native_login:push_verification::enter_code_button:click");
                return;
            }
            if (id == 2131887342) {
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.getString(2131298225))));
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.T().e(this.a);
    }
    
    public void onResume() {
        super.onResume();
        final az t = this.T();
        this.m = t.c(this.l);
        if (this.m == null) {
            this.m = t.a(this.k);
            this.l = this.m.c();
        }
        this.j = 2000L;
        if (this.i == 2) {
            this.d.postDelayed((Runnable)new za(this, null), this.j);
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("reqId", this.a);
        bundle.putString("session_id", this.l);
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
}
