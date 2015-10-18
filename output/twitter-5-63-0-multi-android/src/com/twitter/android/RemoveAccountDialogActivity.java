// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Button;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.client.Session;
import com.twitter.library.api.account.p;
import com.twitter.library.util.a;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.ay;
import android.content.Context;
import com.twitter.library.client.d;
import android.os.Bundle;
import com.twitter.library.service.aa;
import android.app.Activity;
import com.twitter.library.client.az;
import com.twitter.library.service.y;
import com.twitter.android.client.c;
import com.twitter.library.client.AbsFragmentActivity;

public class RemoveAccountDialogActivity extends AbsFragmentActivity implements ju
{
    boolean a;
    boolean b;
    c c;
    private String d;
    private px e;
    
    @Override
    protected void S_() {
        DispatchActivity.a(this, this.getIntent());
    }
    
    @Override
    public void a(final int n, final y y) {
        if (n != 1 || !this.a) {
            return;
        }
        this.removeDialog(2);
        this.a = false;
        if (((aa)y.l().b()).a()) {
            this.b();
            return;
        }
        this.showDialog(4);
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.c = com.twitter.android.client.c.a((Context)this);
        this.d = this.getIntent().getStringExtra("RemoveAccountDialogActivity_account_name");
        this.a(this.e = new px(this));
    }
    
    void b() {
        this.b = true;
        final Session b = this.T().b(this.d);
        final long g = b.g();
        this.c.a(new TwitterScribeLog(g).b(new String[] { "settings::::logout" }));
        if (com.twitter.library.util.a.a((Context)this).length == 1) {
            this.c.b(new TwitterScribeLog(g).b(new String[] { "settings::::logout_last" }));
        }
        this.T().a(b);
        if (p.f((Context)this, this.d)) {
            p.b((Context)this, this.d);
        }
        this.showDialog(1);
    }
    
    @Override
    protected void g_() {
    }
    
    protected Dialog onCreateDialog(final int n) {
        final pt pt = new pt(this);
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 3: {
                final AlertDialog create = new AlertDialog$Builder((Context)this).setTitle(2131297078).setMessage((CharSequence)"").setPositiveButton(17039379, (DialogInterface$OnClickListener)new pu(this)).setNegativeButton(17039369, (DialogInterface$OnClickListener)null).create();
                create.setOnDismissListener((DialogInterface$OnDismissListener)pt);
                create.show();
                return (Dialog)create;
            }
            case 4: {
                final AlertDialog create2 = new AlertDialog$Builder((Context)this).setTitle(2131296896).setMessage(2131297079).setPositiveButton(2131296717, (DialogInterface$OnClickListener)new pv(this)).setNegativeButton(17039369, (DialogInterface$OnClickListener)null).create();
                create2.setOnDismissListener((DialogInterface$OnDismissListener)pt);
                create2.show();
                final Button button = create2.getButton(-1);
                button.setEnabled(false);
                button.postDelayed((Runnable)new pw(this, button), 5000L);
                return (Dialog)create2;
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131297077));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 2: {
                final ProgressDialog progressDialog2 = new ProgressDialog((Context)this);
                progressDialog2.setProgressStyle(0);
                progressDialog2.setMessage(this.getText(2131297087));
                progressDialog2.setIndeterminate(true);
                progressDialog2.setCancelable(false);
                return (Dialog)progressDialog2;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.b(this.e);
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog, final Bundle bundle) {
        switch (n) {
            default: {
                super.onPrepareDialog(n, dialog);
            }
            case 3: {
                final boolean f = p.f((Context)this, this.d);
                boolean b;
                if (com.twitter.library.resilient.d.a(this.getApplicationContext()).a(this.T().b(this.d).g()) > 0) {
                    b = true;
                }
                else {
                    b = false;
                }
                final AlertDialog alertDialog = (AlertDialog)dialog;
                int n2;
                if (f && b) {
                    n2 = 2131297082;
                }
                else if (f) {
                    n2 = 2131297081;
                }
                else if (b) {
                    n2 = 2131297083;
                }
                else {
                    n2 = 2131297080;
                }
                alertDialog.setMessage((CharSequence)this.getString(n2));
            }
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.showDialog(3);
    }
    
    @Override
    public boolean v() {
        return true;
    }
}
