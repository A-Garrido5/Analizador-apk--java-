// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.ak;
import android.content.Intent;
import com.twitter.library.featureswitch.d;
import android.widget.TextView;
import android.text.TextUtils;
import android.text.Editable;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.view.View;
import com.twitter.util.t;
import android.content.Context;
import com.twitter.library.api.account.x;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.library.service.y;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;

public class ChangePasswordActivity extends TwitterFragmentActivity implements TextWatcher, View$OnClickListener, View$OnFocusChangeListener
{
    public boolean a;
    public y b;
    private TwitterEditText c;
    private TwitterEditText d;
    private TwitterEditText e;
    private Button f;
    private Session g;
    
    public ChangePasswordActivity() {
        this.a = false;
    }
    
    private void a(final String s, final String s2) {
        final x b = new x((Context)this, new ab(this.g), s2, s, null);
        b.g(1);
        this.a(b, 0);
        if (this.a) {
            this.b = b;
        }
    }
    
    private boolean a(final String s) {
        return s.contains(" ");
    }
    
    private boolean a(final String s, final String s2, final String s3) {
        if (this.a(s)) {
            this.d.setError(2131297815);
            return false;
        }
        if (!s.equals(s2)) {
            this.e.setError(2131297375);
            return false;
        }
        if (s.equals(s3)) {
            this.d.setError(2131297294);
            return false;
        }
        return true;
    }
    
    private boolean h() {
        return this.c.length() > 0 && this.d.length() > 0 && this.e.length() > 0 && this.e.length() == this.d.length() && this.d.length() >= 6 && !this.a(this.d.getText().toString());
    }
    
    private void i() {
        t.a((Context)this, (View)this.e, false);
        final String string = this.c.getText().toString();
        final String string2 = this.d.getText().toString();
        if (this.a(string2, this.e.getText().toString(), string)) {
            this.a(string2, string);
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968634);
        bn.a(false);
        bn.b(false);
        return bn;
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        if (y.P() != null && this.g.g() != y.P().c) {
            return;
        }
        final aa aa = (aa)y.l().b();
        final l f = aa.f();
        Object b = null;
        if (f != null) {
            b = f.b;
        }
        final int[] a = ae.a(aa.c);
        String s;
        int n2 = 0;
        if ("OK".equals(b)) {
            this.d.setText((CharSequence)"");
            this.c.setText((CharSequence)"");
            this.e.setText((CharSequence)"");
            s = "settings:change_password::change_password:success";
            n2 = 2131297372;
        }
        else {
            int n3;
            if (a == null || a.length == 0) {
                n3 = 0;
            }
            else {
                n3 = a[0];
            }
            switch (n3) {
                default: {
                    s = "settings:change_password::change_password:failure";
                    n2 = 2131297369;
                    break;
                }
                case 114: {
                    s = "settings:change_password::change_password:wrong_old";
                    n2 = 2131297371;
                    break;
                }
                case 62: {
                    s = "settings:change_password::change_password:minimum_length";
                    n2 = 2131297815;
                    break;
                }
                case 238: {
                    s = "settings:change_password::change_password:weak";
                    n2 = 2131297370;
                    break;
                }
                case 60: {
                    s = "settings:change_password::change_password:mismatch";
                    n2 = 2131297375;
                    break;
                }
            }
        }
        Toast.makeText(this.getBaseContext(), n2, 0).show();
        this.G().a(y.P().c, s);
    }
    
    public void afterTextChanged(final Editable editable) {
        if (editable == this.d.getText()) {
            if (this.a(this.d.getText().toString())) {
                this.d.setError(2131297815);
            }
            else {
                this.d.e();
            }
        }
        else if (editable == this.e.getText()) {
            if (this.a(this.e.getText().toString())) {
                this.e.setError(2131297815);
            }
            else {
                this.e.e();
            }
        }
        this.f.setEnabled(this.h());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final String stringExtra = this.getIntent().getStringExtra("ChangePasswordActivity_account_name");
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            throw new IllegalStateException("ChangePasswordActivity requires a target account");
        }
        this.g = this.T().b(stringExtra);
        this.G().a(this.g.g(), "settings:change_password:::impression");
        this.c = (TwitterEditText)this.findViewById(2131886377);
        this.d = (TwitterEditText)this.findViewById(2131886378);
        this.e = (TwitterEditText)this.findViewById(2131886379);
        (this.f = (Button)this.findViewById(2131886380)).setOnClickListener((View$OnClickListener)this);
        this.c.addTextChangedListener((TextWatcher)this);
        this.d.addTextChangedListener((TextWatcher)this);
        this.e.addTextChangedListener((TextWatcher)this);
        this.c.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.d.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.e.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        ((TextView)this.findViewById(2131886381)).setOnClickListener((View$OnClickListener)this);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131886380) {
            this.G().a(this.g.g(), "settings:change_password::change_password:click");
            this.i();
        }
        else if (id == 2131886381) {
            this.G().a(this.g.g(), "settings:change_password::forgot_password:click");
            if (com.twitter.library.featureswitch.d.f("native_pw_reset_from_change_pw_enabled")) {
                final Intent intent = new Intent((Context)this, (Class)PasswordResetActivity.class);
                final String e = this.g.e();
                if (e != null) {
                    intent.putExtra("account_id", e);
                }
                this.startActivity(intent);
                this.finish();
                return;
            }
            ak.a((Context)this, "", 2131298236);
        }
    }
    
    public void onFocusChange(final View view, final boolean b) {
        final int id = view.getId();
        if (id == 2131886379) {
            if (!b && !TextUtils.isEmpty((CharSequence)this.e.getText()) && (this.a(this.e.getText().toString()) || this.e.length() < 6)) {
                this.e.setError(2131297815);
            }
        }
        else if (id == 2131886378 && !b && !TextUtils.isEmpty((CharSequence)this.d.getText()) && (this.a(this.d.getText().toString()) || this.d.length() < 6)) {
            this.d.setError(2131297815);
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
