// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.account.x;
import com.twitter.library.service.ab;
import android.view.View;
import android.text.Editable;
import android.util.Patterns;
import android.text.TextWatcher;
import android.text.TextUtils;
import android.widget.Button;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session;
import android.widget.EditText;
import com.twitter.library.service.y;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ChangeEmailActivity extends TwitterFragmentActivity implements View$OnClickListener
{
    public boolean a;
    public y b;
    private EditText c;
    private EditText d;
    private Session e;
    
    public ChangeEmailActivity() {
        this.a = false;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968633);
        bn.a(false);
        return bn;
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        if (y.P() != null && this.e.g() != y.P().c) {
            return;
        }
        switch (n) {
            default: {
                throw new IllegalStateException("Unrecognized request type in completion handler.");
            }
            case 0: {
                final aa aa = (aa)y.l().b();
                int n2;
                if (aa != null && aa.a()) {
                    n2 = 2131297672;
                    this.c.setText((CharSequence)"");
                    this.d.setText((CharSequence)"");
                }
                else {
                    n2 = 2131297671;
                }
                Toast.makeText((Context)this, n2, 0).show();
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Button button = (Button)this.findViewById(2131886376);
        button.setOnClickListener((View$OnClickListener)this);
        final String stringExtra = this.getIntent().getStringExtra("ChangeEmailActivity_account_name");
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            throw new IllegalStateException("ChangeEmailActivity requires a target account");
        }
        this.e = this.T().b(stringExtra);
        final ce ce = new ce(this, button);
        (this.c = (EditText)this.findViewById(2131886373)).addTextChangedListener((TextWatcher)ce);
        this.c.requestFocus();
        (this.d = (EditText)this.findViewById(2131886374)).addTextChangedListener((TextWatcher)ce);
    }
    
    boolean b() {
        final Editable text = this.c.getText();
        return !TextUtils.isEmpty((CharSequence)text) && Patterns.EMAIL_ADDRESS.matcher((CharSequence)text).matches();
    }
    
    public void onClick(final View view) {
        final x b = new x((Context)this, new ab(this.e), this.d.getText().toString(), null, this.c.getText().toString());
        b.g(2);
        this.a(b, 0);
        if (this.a) {
            this.b = b;
        }
    }
    
    boolean w_() {
        return !TextUtils.isEmpty((CharSequence)this.d.getText());
    }
}
