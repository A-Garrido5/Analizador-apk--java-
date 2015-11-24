// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.app.AlertDialog;
import android.view.KeyEvent;
import com.twitter.android.util.w;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.library.client.bj;
import com.twitter.library.scribe.ScribeLog;
import android.text.method.MovementMethod;
import com.twitter.library.client.bh;
import com.twitter.library.util.a;
import com.twitter.library.client.App;
import android.text.method.LinkMovementMethod;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeLog;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import android.widget.TextView;
import android.app.Dialog;
import com.twitter.android.client.bn;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Toast;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.library.api.as;
import com.twitter.library.client.Session;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.ListAdapter;
import java.util.Collection;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.ArrayAdapter;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.android.widget.ProgressDialogFragment;
import android.graphics.Bitmap;
import com.twitter.android.util.ao;
import com.twitter.android.util.k;
import android.widget.Button;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.c;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public class SignUpActivity extends BaseSignUpActivity implements LoaderManager$LoaderCallbacks, View$OnClickListener, View$OnFocusChangeListener, TextView$OnEditorActionListener, sr, c, e
{
    private SignUpFlowController A;
    private Button B;
    private String F;
    private boolean G;
    private k H;
    private k I;
    private ao J;
    String u;
    Bitmap v;
    String w;
    boolean x;
    private final sp y;
    private ProgressDialogFragment z;
    
    public SignUpActivity() {
        this.y = new sp(this, (Context)this);
    }
    
    private void a(final ArrayAdapter adapter, final PopupEditText popupEditText) {
        if (this.i.j()) {
            adapter.addAll((Collection)xi.b((Context)this));
        }
        else if (!this.i.k()) {
            this.J = new sn(this, adapter);
            this.i.a(this.J);
        }
        popupEditText.setAdapter((ListAdapter)adapter);
    }
    
    private void a(final EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            ((ScrollView)this.findViewById(2131886662)).smoothScrollTo(0, editText.getBottom());
            editText.setSelection(editText.getText().length());
        }
    }
    
    private void a(final Session session, final as as) {
        final long g = session.g();
        final com.twitter.android.client.c g2 = this.G();
        this.a(this.b, as.a);
        TwitterEditText twitterEditText;
        if (as.a != null) {
            this.A.a("fullname", "", "failure", g);
            this.a(this.b, false);
            twitterEditText = this.b;
        }
        else {
            twitterEditText = null;
        }
        if (this.q == 0 && this.p == 2) {
            this.a(this.c, as.c);
            if (as.c != null) {
                this.A.a("email", "phone", "failure", g);
                this.a(this.c, false);
                if (twitterEditText == null) {
                    twitterEditText = this.c;
                }
            }
        }
        else {
            this.a(this.c, as.b);
            if (as.b != null) {
                this.A.a("email", "", "failure", g);
                this.a(this.c, false);
                if (twitterEditText == null) {
                    twitterEditText = this.c;
                }
            }
        }
        this.a(this.d, as.d);
        if (as.d != null) {
            this.A.a("screen_name", "", "failure", g);
            this.a(this.d, false);
            if (twitterEditText == null) {
                twitterEditText = this.d;
            }
        }
        this.a(this.e, as.e);
        if (as.e != null) {
            this.A.a("password", "", "failure", g);
            this.a(this.e, false);
            if (twitterEditText == null) {
                twitterEditText = this.e;
            }
        }
        if (twitterEditText != null) {
            twitterEditText.requestFocus();
            ((ScrollView)this.findViewById(2131886662)).smoothScrollTo(0, twitterEditText.getTop());
            return;
        }
        this.A.a("", "", "failure", g);
        g2.a(g, "signup:form:::failure");
        this.m();
    }
    
    private void a(final String s, final String s2) {
        this.startActivity(new Intent((Context)this, (Class)LoginActivity.class).putExtra("screen_name", s).putExtra("password", s2));
        this.finish();
    }
    
    private void b(final int n) {
        if (this.z == null) {
            (this.z = ProgressDialogFragment.a(n)).setRetainInstance(true);
            this.z.a(this.getSupportFragmentManager());
        }
    }
    
    private boolean n() {
        if (!TextUtils.isEmpty((CharSequence)this.c.getText())) {
            return true;
        }
        final String c = com.twitter.library.network.c.a((Context)this).c();
        if (TextUtils.isEmpty((CharSequence)c)) {
            return false;
        }
        this.c.setText((CharSequence)c);
        this.l = 2;
        this.s.a(2);
        return true;
    }
    
    private void p() {
        this.getSupportLoaderManager().initLoader(0, null, this);
    }
    
    private void r() {
        this.A.a(this.b.getText().toString()).d(this.i.n()).e(this.i.a(PhoneNumberUtil$PhoneNumberFormat.b)).c(this.e.getText().toString()).b(this.d.getText().toString()).c(this.g.isChecked()).a((sr)this).a((Intent)this.getIntent().getParcelableExtra("android.intent.extra.INTENT"));
    }
    
    private void s() {
        if (this.A.q()) {
            this.a(this.A.l(), this.A.m());
        }
        if (this.A.r()) {
            this.a(this.A.o(), this.A.p());
        }
        if (this.A.n() != 0) {
            Toast.makeText((Context)this, this.A.n(), 0).show();
        }
        this.A.w();
    }
    
    private void t() {
        final ArrayAdapter adapter = new ArrayAdapter((Context)this, 2130969131, xi.a((Context)this));
        ((PopupEditText)this.c).setAdapter((ListAdapter)adapter);
        if (this.q == 0) {
            this.a(adapter, (PopupEditText)this.c);
        }
        else if (this.q == 1) {
            this.a(new ArrayAdapter((Context)this, 2130969131), (PopupEditText)this.f);
        }
    }
    
    private void u() {
        if (this.q == 0 && this.p == 2) {
            if (this.A.j() && this.i.n().equals(this.A.c())) {
                this.r();
                this.A.z();
                this.b(2131297807);
                return;
            }
            this.w().a(this.getSupportFragmentManager());
        }
        else {
            if (this.q == 1 && !TextUtils.isEmpty((CharSequence)this.f.getText())) {
                this.w().a(this.getSupportFragmentManager());
                return;
            }
            this.l();
        }
    }
    
    private PromptDialogFragment w() {
        this.A.a("", "dialog", "impression");
        return (PromptDialogFragment)PromptDialogFragment.b(2).c(2131297833).h(2131297362).j(2131296901).a(2130969106, this).m();
    }
    
    private void x() {
        if (this.z != null) {
            this.z.dismiss();
            this.z = null;
        }
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969105);
        bn.d(false);
        bn.b(false);
        bn.a(false);
        return bn;
    }
    
    public void a(final Dialog dialog, final int n, final Bundle bundle) {
        if (n == 2) {
            ((TextView)dialog.findViewById(2131887278)).setText((CharSequence)this.i.a(PhoneNumberUtil$PhoneNumberFormat.b));
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 2) {
            if (n2 == -1) {
                this.A.a("", "dialog", "accept");
                if (this.q != 1) {
                    this.r();
                    this.A.a(this.G()).x();
                    this.b(2131297834);
                    return;
                }
                this.l();
            }
            else if (n2 == -2) {
                this.A.a("", "dialog", "cancel");
                if (this.q == 1) {
                    this.a(this.f);
                    return;
                }
                this.a(this.c);
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (TextUtils.isEmpty((CharSequence)this.b.getText()) && cursor != null && cursor.moveToFirst()) {
            final String string = cursor.getString(cursor.getColumnIndex("display_name"));
            if (string != null && kq.a.matcher(string).matches()) {
                this.G().a(new TwitterScribeLog(this.U().g()).b("signup", "form", "fullname", "", "failure_all_digits"));
            }
            else if (!TextUtils.isEmpty((CharSequence)string)) {
                this.b.setText((CharSequence)string);
                this.k = 2;
                this.s.a(1);
                this.e.requestFocus();
            }
        }
        this.t = this.n();
        this.g();
    }
    
    public void a(final boolean b, final int[] array) {
        this.x();
        if (b) {
            this.A.g("waiting_screen").a((Activity)this);
        }
        else if (array != null) {
            CharSequence charSequence = null;
            if (CollectionUtils.a(array, 285)) {
                this.a(this.c, this.getString(2131297821));
                this.a(this.c, false);
            }
            else if (CollectionUtils.a(array, 295)) {
                charSequence = this.getString(2131297820);
            }
            else {
                charSequence = this.getString(2131297818);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Toast.makeText((Context)this, charSequence, 1).show();
            }
        }
    }
    
    @Override
    void b() {
        this.B.setEnabled(this.h());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(2131297835);
        final Intent intent = this.getIntent();
        this.x = intent.getBooleanExtra("add_account", false);
        this.q = intent.getIntExtra("signup_layout_type", 0);
        final String stringExtra = intent.getStringExtra("signup_identifier");
        this.p = intent.getIntExtra("signup_identifier_type", 1);
        final String stringExtra2 = intent.getStringExtra("signup_username");
        final String stringExtra3 = intent.getStringExtra("signup_password");
        final String stringExtra4 = intent.getStringExtra("signup_phone");
        this.G = intent.getBooleanExtra("authorize_account", false);
        final MovementMethod instance = LinkMovementMethod.getInstance();
        final TextView textView = (TextView)this.findViewById(2131886255);
        if (this.i.a()) {
            textView.setText(2131297837);
        }
        textView.setMovementMethod(instance);
        (this.B = (Button)this.findViewById(2131887276)).setOnClickListener((View$OnClickListener)this);
        final com.twitter.android.client.c g = this.G();
        if (App.b() && com.twitter.library.util.a.b((Context)this) == 0) {
            this.c.setLabelText("@twitter.com email");
        }
        this.A = SignUpFlowController.a((Context)this);
        if (this.q == 1) {
            this.A.l("email_and_phone_signup");
            this.s_();
            if (this.i.j()) {
                this.G().a(this.U().g(), "email_and_phone_signup:form:phone_number::prefill");
            }
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                this.c.setText((CharSequence)stringExtra);
            }
            if (!TextUtils.isEmpty((CharSequence)stringExtra4)) {
                this.f.setText((CharSequence)stringExtra4);
            }
            this.t_();
        }
        else {
            this.A.l("email_or_phone_signup");
            if (this.i.j()) {
                this.G().a(this.U().g(), "email_or_phone_signup:form:phone_number::prefill");
            }
            this.c.setLabelText(2131297830);
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                this.c.setText((CharSequence)stringExtra);
            }
            if (!TextUtils.isEmpty((CharSequence)stringExtra2)) {
                this.d.setText((CharSequence)stringExtra2);
            }
            if (!TextUtils.isEmpty((CharSequence)stringExtra3)) {
                this.e.setText((CharSequence)stringExtra3);
            }
        }
        this.p();
        this.t();
        final TextView textView2 = (TextView)this.findViewById(2131887112);
        textView2.setPaintFlags(0x8 | textView2.getPaintFlags());
        textView2.setOnClickListener((View$OnClickListener)this);
        if (bundle == null) {
            final ScribeLog b = new TwitterScribeLog(this.U().g()).b(new String[] { "signup::::impression" });
            if (intent.getBooleanExtra("from_widget", false)) {
                b.g("widget");
            }
            g.a(b);
            this.A.a("", "", "impression");
            kg.b(this, "signup");
        }
        else {
            this.F = bundle.getString("reqId");
            this.T().a(this.F, this.y);
        }
        this.H = new k((PopupEditText)this.c);
        this.I = new k((PopupEditText)this.f);
    }
    
    public void b(final boolean b) {
        this.x();
        if (b) {
            this.A.b((Activity)this);
        }
        else if (this.A.s()) {
            this.s();
        }
    }
    
    public void b(final boolean b, final int[] array) {
        if (b) {
            this.b(2131297807);
            this.A.z();
            return;
        }
        this.x();
        Toast.makeText((Context)this, 2131297818, 1).show();
    }
    
    protected String j() {
        return "welcome";
    }
    
    @Override
    protected void k() {
        if (this.G) {
            this.finish();
            return;
        }
        super.k();
    }
    
    void l() {
        this.b(2131297807);
        this.G().a(new TwitterScribeLog(this.U().g()).b(new String[] { "signup:form:::submit" }));
        this.F = this.T().a(this.b.getText().toString(), this.d.getText().toString(), this.c.getText().toString(), this.e.getText().toString(), this.u, this.w, this.y, null);
    }
    
    void m() {
        Toast.makeText((Context)this, 2131297810, 1).show();
    }
    
    public void onBackPressed() {
        this.G().a(this.U().g(), "signup:::back_button:click");
        this.A.v().u();
        super.onBackPressed();
    }
    
    @Override
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131887276) {
            this.A.a("", "sign_up", "click");
            this.u();
            return;
        }
        if (id == 2131887112) {
            this.A.a("", "settings", "click");
            this.startActivity(new Intent((Context)this, (Class)LoggedOutSettingsActivity.class).putExtra("show_disco_settings", true));
            return;
        }
        super.onClick(view);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final View inflate = LayoutInflater.from((Context)this).inflate(2130968625, (ViewGroup)null);
                final sm sm = new sm(this);
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297806).setView(inflate).setPositiveButton(2131297835, (DialogInterface$OnClickListener)sm).setNegativeButton(2131296445, (DialogInterface$OnClickListener)sm).create();
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return com.twitter.android.util.w.a((Context)this).c();
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.T().e(this.F);
    }
    
    @Override
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final int id = textView.getId();
        if ((id != 2131886374 && id != 2131886668) || n != 2) {
            return super.onEditorAction(textView, n, keyEvent);
        }
        if (this.h()) {
            this.u();
            return true;
        }
        this.r_();
        return false;
    }
    
    @Override
    public void onFocusChange(final View view, final boolean b) {
        super.onFocusChange(view, b);
        final int id = view.getId();
        if (id == 2131886666) {
            if (!this.H.a()) {
                this.H.b().b();
                return;
            }
            this.H.b().a();
        }
        else if (id == 2131886668) {
            if (this.I.a()) {
                this.I.b().a();
                return;
            }
            this.I.b().b();
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    public void onPause() {
        super.onPause();
        this.A.b((sr)this);
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        switch (n) {
            default: {
                super.onPrepareDialog(n, dialog);
            }
            case 1: {
                final AlertDialog alertDialog = (AlertDialog)dialog;
                ((ImageView)alertDialog.findViewById(2131886356)).setImageBitmap(this.v);
                ((EditText)alertDialog.findViewById(2131886357)).setText((CharSequence)null);
            }
        }
    }
    
    public void onResume() {
        super.onResume();
        if (this.q == 0 && this.p == 2) {
            this.A.a((sr)this);
            if (this.A.f()) {
                this.A.b(false);
                this.a(this.c);
            }
        }
        if (this.A.s()) {
            this.s();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("reqId", this.F);
    }
    
    public boolean onSearchRequested() {
        return false;
    }
    
    public void q() {
    }
}
