// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.widget.TextView;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.view.ViewTreeObserver;
import android.view.View;
import android.content.Intent;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import android.text.Editable;
import com.twitter.android.client.ca;
import com.twitter.library.client.ap;
import com.twitter.internal.util.Optional;
import com.twitter.library.util.be;
import java.util.ArrayList;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.util.concurrent.i;
import java.util.concurrent.Future;
import com.twitter.util.concurrent.d;
import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.net.Uri;
import com.twitter.library.client.Session;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import android.content.Context;
import com.twitter.library.client.az;
import android.widget.Toast;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import android.widget.Button;
import com.twitter.android.client.c;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;

public class EditAccountActivity extends BaseSignUpActivity implements TextWatcher, View$OnClickListener, View$OnFocusChangeListener, TextView$OnEditorActionListener
{
    private String A;
    private c B;
    private int F;
    private Button u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    
    private String a(final long n) {
        if (this.i.b()) {
            this.B.a(n, "edit_account::phone_number::prefill");
            int n2;
            if (this.i.a()) {
                n2 = 2131297802;
            }
            else {
                n2 = 2131297803;
            }
            return this.getString(n2, new Object[] { this.i.a(this.i.f(), PhoneNumberUtil$PhoneNumberFormat.b).replace(" ", " ") });
        }
        return this.getString(2131297804);
    }
    
    private void a(final long n, final int n2) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "edit_account:::settings:failure" });
        if (n2 != 0) {
            twitterScribeLog.c(new String[] { Integer.toString(n2) });
        }
        this.B.a(twitterScribeLog);
        Toast.makeText(this.getBaseContext(), 2131296904, 1).show();
    }
    
    private void a(final String s) {
        final Session b = az.a((Context)this).b();
        String string;
        if (this.r()) {
            string = this.d.getText().toString();
        }
        else {
            string = null;
        }
        String string2;
        if (this.q()) {
            string2 = this.c.getText().toString();
        }
        else {
            string2 = null;
        }
        this.a(ab.a(this.getApplicationContext(), b, string, s, this.e.getText().toString(), string2, false), 5);
    }
    
    private void b(final Session session) {
        this.h.r().q();
        final i b = MediaFile.b((Context)this, Uri.parse(this.w), MediaType.b);
        b.a(new e().a(com.twitter.util.concurrent.h.a).a(new ft(this, session)));
        this.a(b);
    }
    
    private void l() {
        this.a(this.b, true);
        this.k = 1;
        this.a(this.b, null);
    }
    
    private void m() {
        this.a(this.c, true);
        this.l = 1;
        this.a(this.c, null);
    }
    
    private void n() {
        this.a(this.d, true);
        this.m = 1;
        this.a(this.d, null);
    }
    
    private boolean p() {
        return !this.v.equals(this.b.getText().toString());
    }
    
    private boolean q() {
        return !this.y.equals(this.c.getText().toString());
    }
    
    private boolean r() {
        return !this.x.equals(this.d.getText().toString());
    }
    
    private void s() {
        this.showDialog(1);
        this.h.a(String.valueOf(this.e.getText())).p();
        this.a(this.z);
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968738);
        bn.a(false);
        bn.b(10);
        return bn;
    }
    
    @Override
    public void a(final int n, final y y) {
        if (n == 5) {
            final com.twitter.library.service.ab p2 = y.P();
            if (p2 != null) {
                final Session c = az.a(this.getApplicationContext()).c(p2.a);
                if (c != null) {
                    final long g = c.g();
                    final aa aa = (aa)y.l().b();
                    ArrayList list;
                    if (aa != null) {
                        list = (ArrayList)aa.c.getSerializable("CUSTOM_ERRORS");
                    }
                    else {
                        list = null;
                    }
                    int c2;
                    if (aa != null) {
                        c2 = aa.c();
                    }
                    else {
                        c2 = 0;
                    }
                    if (c2 == 200) {
                        this.B.a(g, "edit_account:::settings:success");
                        this.b(c);
                    }
                    else {
                        if (list == null || list.isEmpty()) {
                            this.a(g, c2);
                            this.b(c);
                            return;
                        }
                        if (!be.c(list)) {
                            boolean b;
                            if (this.r() && be.b(list) != null) {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            boolean b2;
                            if (this.q() && be.a(list) != null) {
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            int n2;
                            if (b && b2) {
                                this.B.a(g, "edit_account:::email:failure");
                                this.B.a(g, "edit_account:::username:failure");
                                n2 = 2131296903;
                            }
                            else if (b) {
                                this.B.a(g, "edit_account:::username:failure");
                                n2 = 2131296905;
                            }
                            else if (b2) {
                                this.B.a(g, "edit_account:::email:failure");
                                n2 = 2131296902;
                            }
                            else {
                                this.B.a(g, "edit_account:::settings:error");
                                n2 = 2131296904;
                            }
                            Toast.makeText(this.getBaseContext(), n2, 1).show();
                            this.b(c);
                            return;
                        }
                        this.h.a(this.z).p();
                        if (be.a(list, 114) && this.F == 0) {
                            ++this.F;
                            this.B.a(g, "edit_account:::password:wrong_old");
                            this.B.a(g, "edit_account:::password:retry");
                            this.a(this.A);
                            return;
                        }
                        if (be.a(list, 114)) {
                            this.B.a(g, "edit_account:::password:wrong_old");
                            Toast.makeText(this.getBaseContext(), 2131296904, 1).show();
                            this.b(c);
                            return;
                        }
                        if (be.a(list, 60)) {
                            this.B.a(g, "edit_account:::password:mismatch");
                            Toast.makeText(this.getBaseContext(), 2131296904, 1).show();
                            this.b(c);
                            return;
                        }
                        if (be.a(list, 238)) {
                            this.removeDialog(1);
                            this.B.a(g, "edit_account:::password:weak");
                            Toast.makeText(this.getBaseContext(), 2131297370, 1).show();
                            return;
                        }
                        if (be.a(list, 62)) {
                            this.removeDialog(1);
                            this.B.a(g, "edit_account:::password:minimum_length");
                            Toast.makeText(this.getBaseContext(), 2131297815, 1).show();
                        }
                    }
                }
            }
            return;
        }
        super.a(n, y);
    }
    
    void a(final Session session) {
        if (session != null) {
            this.a(session.g(), 0);
        }
        this.k();
    }
    
    void a(final MediaFile mediaFile, final Session session) {
        final ap ap = new ap(mediaFile, null, false, this.b.getText().toString(), null, null, null, Optional.a(), false, false);
        this.removeDialog(1);
        if (session != null) {
            ca.a((Context)this, session, ap);
            this.B.a(session.g(), "edit_account::::success");
        }
        this.k();
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        final String string = this.b.getText().toString();
        final String string2 = this.c.getText().toString();
        final String string3 = this.d.getText().toString();
        if (editable.toString().equals(string) && this.v.equals(string)) {
            this.l();
            return;
        }
        if (editable.toString().equals(string2) && this.y.equals(string2)) {
            this.m();
            return;
        }
        if (editable.toString().equals(string3) && this.x.equals(string3)) {
            this.n();
            return;
        }
        super.afterTextChanged(editable);
    }
    
    @Override
    void b() {
        this.u.setEnabled(this.h());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.B = com.twitter.android.client.c.a((Context)this);
        final Session b = az.a((Context)this).b();
        as.a((Context)this).a(ab.a((Context)this, b), (z)null);
        this.q = 2;
        (this.u = (Button)this.findViewById(2131886670)).setEnabled(false);
        this.u.setOnClickListener((View$OnClickListener)this);
        final EditText editText = (EditText)this.findViewById(2131886307);
        final EditText editText2 = (EditText)this.findViewById(2131886666);
        final EditText editText3 = (EditText)this.findViewById(2131886308);
        final Intent intent = this.getIntent();
        if (bundle == null) {
            this.B.a(b.g(), "edit_account::::impression");
            this.v = intent.getStringExtra("fullname");
            this.y = intent.getStringExtra("email");
            this.w = intent.getStringExtra("avatar_uri");
            this.x = intent.getStringExtra("username");
            this.z = intent.getStringExtra("password");
            this.A = intent.getStringExtra("default_password");
            if (TextUtils.isEmpty((CharSequence)this.z)) {
                this.z = this.A;
            }
            this.F = 0;
        }
        else {
            this.v = bundle.getString("fullname");
            this.y = bundle.getString("email");
            this.w = bundle.getString("avatar_uri");
            this.x = bundle.getString("username");
            this.z = bundle.getString("password");
            this.A = bundle.getString("default_password");
            this.F = bundle.getInt("password_retry_count");
        }
        editText.setText((CharSequence)this.v);
        editText3.setText((CharSequence)this.x);
        editText2.setText((CharSequence)this.y);
        super.b(bundle, bn);
        this.l();
        this.m();
        this.n();
        this.e.requestFocus();
        final View viewById = this.findViewById(2131886662);
        final fr fr = new fr(this, viewById);
        final ViewTreeObserver viewTreeObserver = viewById.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)fr);
        }
        this.g.setText((CharSequence)this.a(b.g()));
    }
    
    protected String j() {
        return "edit_account";
    }
    
    @Override
    public void onClick(final View view) {
        super.onClick(view);
        final long g = this.U().g();
        if (this.p()) {
            this.B.a(g, "edit_account:::full_name:change");
        }
        if (this.r()) {
            this.B.a(g, "edit_account:::username:change");
        }
        if (this.q()) {
            this.B.a(g, "edit_account:::email:change");
        }
        this.B.a(g, "edit_account:::next_button:click");
        if (view.getId() == 2131886670) {
            this.s();
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131297602));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() != 2131886374 || n != 6) {
            return super.onEditorAction(textView, n, keyEvent);
        }
        if (this.h()) {
            this.s();
            return true;
        }
        this.r_();
        return false;
    }
    
    @Override
    public void onFocusChange(final View view, final boolean b) {
        final int id = view.getId();
        if (!b && id == 2131886307 && !this.p()) {
            this.l();
            return;
        }
        if (!b && id == 2131886666 && !this.q()) {
            this.m();
            return;
        }
        if (!b && id == 2131886308 && !this.r()) {
            this.n();
            return;
        }
        super.onFocusChange(view, b);
    }
    
    protected void onPause() {
        super.onPause();
        this.removeDialog(1);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("fullname", this.v);
        bundle.putString("email", this.y);
        bundle.putString("username", this.x);
        bundle.putString("password", this.z);
        bundle.putString("default_password", this.A);
        bundle.putString("avatar_uri", this.w);
        bundle.putInt("password_retry_count", this.F);
    }
}
