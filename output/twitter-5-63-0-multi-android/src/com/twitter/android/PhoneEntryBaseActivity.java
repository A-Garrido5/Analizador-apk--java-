// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.widget.EditText;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.android.util.ap;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.widget.ProgressDialogFragment;
import android.widget.Button;
import com.twitter.android.util.al;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class PhoneEntryBaseActivity extends TwitterFragmentActivity implements View$OnClickListener, mo, ng
{
    protected al a;
    protected Button b;
    private ProgressDialogFragment c;
    
    public void R_() {
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968773);
        bn.a(false);
        return bn;
    }
    
    protected void a(final int n) {
        if (this.c == null) {
            (this.c = ProgressDialogFragment.a(n)).setRetainInstance(true);
            this.c.a(this.getSupportFragmentManager(), null);
        }
    }
    
    public void a(final String s) {
    }
    
    public void a(final boolean enabled) {
        this.b.setEnabled(enabled);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131297385);
        this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
        this.b = (Button)this.findViewById(2131886705);
        this.a(true);
        this.b.setText(2131296304);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.a = ap.a((Context)this);
        if (bundle == null) {
            final PhoneEntryFragment phoneEntryFragment = new PhoneEntryFragment();
            final Bundle arguments = new Bundle();
            arguments.putBoolean("show_nux_copy", this.getIntent().getBooleanExtra("show_nux_copy", false));
            phoneEntryFragment.setArguments(arguments);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, phoneEntryFragment).commit();
        }
    }
    
    public void b(final boolean b) {
    }
    
    public void d() {
    }
    
    public void f() {
    }
    
    protected String g() {
        return ((EditText)this.findViewById(2131887108)).getText().toString();
    }
    
    protected void h() {
        if (this.c != null) {
            this.c.dismissAllowingStateLoss();
            this.c = null;
        }
    }
    
    protected void i() {
        this.findViewById(2131887109).setVisibility(0);
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
