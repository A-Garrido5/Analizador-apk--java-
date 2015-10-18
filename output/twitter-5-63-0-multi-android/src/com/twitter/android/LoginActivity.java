// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.bh;
import com.twitter.library.util.a;
import android.view.View$OnFocusChangeListener;
import android.widget.TextView;
import android.widget.ImageButton;
import android.text.Editable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import android.app.Activity;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.library.api.b;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.bf;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import com.twitter.util.t;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.android.client.c;
import com.twitter.library.client.bd;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.text.TextUtils;
import android.net.Uri;
import com.twitter.library.client.Session;
import com.twitter.android.util.ak;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.featureswitch.d;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.dialog.e;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;

public class LoginActivity extends TwitterFragmentActivity implements TextWatcher, View$OnClickListener, View$OnTouchListener, e
{
    private static final int[] b;
    boolean a;
    private final kl c;
    private int d;
    private String e;
    private String f;
    private TwitterEditText g;
    private TwitterEditText h;
    private Button i;
    private String j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    
    static {
        b = new int[] { 2130772623 };
    }
    
    public LoginActivity() {
        this.c = new kl(this);
        this.e = "no_prefill";
        this.f = "";
        this.n = -1;
    }
    
    private void a(final int n) {
        if (com.twitter.library.featureswitch.d.f("native_password_reset_enabled")) {
            this.startActivityForResult(new Intent((Context)this, (Class)PasswordResetActivity.class).putExtra("account_id", this.m()), 4);
            return;
        }
        ak.a((Context)this, this.m(), n);
    }
    
    private void b(final Uri uri) {
        if (com.twitter.library.featureswitch.d.f("native_password_reset_enabled")) {
            final String queryParameter = uri.getQueryParameter("screen_name");
            final String queryParameter2 = uri.getQueryParameter("login_verification_user_id");
            final String queryParameter3 = uri.getQueryParameter("login_verification_request_id");
            final String queryParameter4 = uri.getQueryParameter("login_verification_cause");
            final String queryParameter5 = uri.getQueryParameter("login_verification_request_url");
            if (!TextUtils.isEmpty((CharSequence)queryParameter) && !TextUtils.isEmpty((CharSequence)queryParameter2) && !TextUtils.isEmpty((CharSequence)queryParameter3) && !TextUtils.isEmpty((CharSequence)queryParameter4)) {
                try {
                    final long long1 = Long.parseLong(queryParameter2);
                    this.l = Integer.parseInt(queryParameter4);
                    final Session a = this.T().a(queryParameter);
                    Label_0167: {
                        if (this.l != 1) {
                            break Label_0167;
                        }
                        final String queryParameter6 = uri.getQueryParameter("login_verification_type");
                        if (TextUtils.isEmpty((CharSequence)queryParameter6)) {
                            return;
                        }
                        try {
                            final int int1 = Integer.parseInt(queryParameter6);
                            this.k = true;
                            this.c.a(a, new LoginVerificationRequiredResponse(long1, queryParameter3, int1, queryParameter5, this.l));
                            return;
                            this.showDialog(1);
                            this.k = true;
                            this.j = this.T().a(a, long1, queryParameter3, null, this.c);
                        }
                        catch (NumberFormatException ex) {}
                    }
                }
                catch (NumberFormatException ex2) {}
            }
        }
    }
    
    private boolean h() {
        return this.g.length() > 0 && this.h.length() > 0 && (bq.a((Context)this, App.n(), this.g.getText().toString()) || bq.c((Context)this));
    }
    
    private void i() {
        t.a((Context)this, (View)this.h, false);
        final String m = this.m();
        final String string = this.h.getText().toString();
        if (!m.equals(this.f)) {
            this.G().a(this.U().g(), String.format("login:identifier:%s::prefill_changed", this.e));
        }
        this.G().a(new TwitterScribeLog(this.U().g()).b(new String[] { "login:form:::submit" }));
        this.j = this.T().a(m, string, this.c);
        this.showDialog(1);
    }
    
    private void j() {
        PromptDialogFragment.b(3).c(2131298036).d(2131298035).h(2131297362).j(2131297033).a(this.getSupportFragmentManager());
        this.G().a(this.U().g(), "login::use_temporary_password_prompt::impression");
    }
    
    private void k() {
        PromptDialogFragment.b(4).c(2131297561).d(2131297562).h(2131297996).j(2131297561).a(this.getSupportFragmentManager());
    }
    
    private void l() {
        this.n = 0;
        PromptDialogFragment.b(5).c(2131297193).f(2131361813).g(this.n).j(2131296445).h(2131297187).a(this.getSupportFragmentManager());
        this.G().a(this.U().g(), "login::choose_id_type_dialog::impression");
    }
    
    private String m() {
        return this.g.getText().toString();
    }
    
    private void n() {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(new String[] { "login::::success" });
        twitterScribeLog.f("app_download_client_event");
        twitterScribeLog.a("4", bj.a());
        final b a = u.a.a();
        if (a != null) {
            twitterScribeLog.a("6", a.a());
            twitterScribeLog.a(a.b());
        }
        this.G().a(twitterScribeLog);
    }
    
    private void p() {
        if (TextUtils.isEmpty((CharSequence)this.g.getText())) {
            final String c = com.twitter.library.network.c.a((Context)this).c();
            if (!TextUtils.isEmpty((CharSequence)c)) {
                this.g.setText((CharSequence)c);
                this.e = "email";
                this.f = c;
                this.h.requestFocus();
            }
        }
        this.G().a(this.U().g(), String.format("login:identifier:%s::prefill", this.e));
    }
    
    private void q() {
        final PopupEditText popupEditText = (PopupEditText)this.g;
        popupEditText.setAdapter((ListAdapter)new ArrayAdapter((Context)this, 2130969131, xi.a((Context)this)));
        new km(this, popupEditText);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968857);
        bn.a(false);
        bn.d(false);
        bn.b(false);
        return bn;
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 2: {
                if (n2 == -1) {
                    this.a(2131298235);
                    return;
                }
                break;
            }
            case 3: {
                if (n2 == -2) {
                    this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.getString(2131298224))));
                    this.G().a(this.U().g(), "login::use_temporary_password_prompt:get_help:click");
                    return;
                }
                break;
            }
            case 4: {
                if (n2 == -2) {
                    this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.getString(2131298233))));
                    return;
                }
                break;
            }
            case 5: {
                switch (n2) {
                    default: {
                        this.G().a(this.U().g(), "login::choose_id_type_dialog:cancel:click");
                        return;
                    }
                    case 0: {
                        this.n = 0;
                        this.G().a(this.U().g(), "login::choose_id_type_dialog:phone_number:click");
                        return;
                    }
                    case 1: {
                        this.n = 1;
                        this.G().a(this.U().g(), "login::choose_id_type_dialog:username:click");
                        return;
                    }
                    case -1: {
                        if (this.n == 0) {
                            this.g.setText((CharSequence)("+" + this.m()));
                        }
                        else if (this.n == 1) {
                            this.g.setText((CharSequence)("@" + this.m()));
                        }
                        this.i();
                        this.G().a(this.U().g(), "login::choose_id_type_dialog:signin:click");
                        return;
                    }
                }
                break;
            }
        }
    }
    
    void a(final Session session, final String s) {
        final c g = this.G();
        final String e = session.e();
        final long g2 = this.U().g();
        kq.a(this, session, this.a, s, this.T());
        kq.a(this, this.a, g2, g);
        if (!this.m) {
            final Intent intent = new Intent((Context)this, (Class)DispatchActivity.class);
            if (this.getIntent().hasExtra("android.intent.extra.INTENT")) {
                intent.putExtra("android.intent.extra.INTENT", this.getIntent().getParcelableExtra("android.intent.extra.INTENT"));
            }
            this.startActivity(intent.setFlags(67108864));
        }
        this.setResult(-1, new Intent().putExtra("AbsFragmentActivity_account_name", e));
        AppEventTrack.a(this.getApplicationContext(), AppEventTrack$EventType.c, new String[0]);
        this.n();
        g.a(g2, String.format("login:identifier:%s::success", this.e));
        g.a(g2, "login::::success", false);
        as.a((Context)this).a(ab.a((Context)this, session), (z)null);
        this.finish();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951638, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887446) {
            final Intent intent = this.getIntent();
            final Intent intent2 = new Intent((Context)this, (Class)SignUpActivity.class);
            this.G().a(this.U().g(), "login:form::signup:click");
            if (intent.hasExtra("android.intent.extra.INTENT")) {
                intent2.putExtra("android.intent.extra.INTENT", intent.getParcelableExtra("android.intent.extra.INTENT"));
            }
            intent2.putExtra("add_account", true);
            intent2.putExtra("authorize_account", this.m);
            if (!this.m) {
                SignUpFlowController.a((Context)this).a(true).b(intent2);
            }
            this.startActivityForResult(intent2, 1);
            return true;
        }
        if (a == 2131887447) {
            this.startActivity(new Intent((Context)this, (Class)AboutActivity.class));
            return true;
        }
        return super.a(jx);
    }
    
    public void afterTextChanged(final Editable editable) {
        this.i.setEnabled(this.h());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131297203);
        final Intent intent = this.getIntent();
        this.a = intent.getBooleanExtra("add_account", false);
        this.m = intent.getBooleanExtra("authorize_account", false);
        final c g = this.G();
        this.g = (TwitterEditText)this.findViewById(2131886905);
        this.h = (TwitterEditText)this.findViewById(2131886906);
        (this.i = (Button)this.findViewById(2131886907)).setOnClickListener((View$OnClickListener)this);
        this.g.addTextChangedListener((TextWatcher)this);
        this.h.addTextChangedListener((TextWatcher)this);
        this.h.setOnTouchListener((View$OnTouchListener)this);
        ((ImageButton)this.findViewById(2131886908)).setOnClickListener((View$OnClickListener)this);
        ((TextView)this.findViewById(2131886381)).setOnClickListener((View$OnClickListener)this);
        this.d = 0;
        final Uri data = intent.getData();
        String text;
        String text2;
        if (data != null) {
            text = data.getQueryParameter("screen_name");
            text2 = data.getQueryParameter("password");
        }
        else {
            text = intent.getStringExtra("screen_name");
            text2 = intent.getStringExtra("password");
        }
        final long g2 = this.U().g();
        if (!TextUtils.isEmpty((CharSequence)text)) {
            g.a(g2, "login:::username:prefill");
            this.g.setText((CharSequence)text);
            if (TextUtils.isEmpty((CharSequence)text2)) {
                this.h.requestFocus();
            }
            else {
                this.h.setText((CharSequence)text2);
                this.i.requestFocus();
            }
        }
        else {
            g.a(g2, "login:::username:prefill_fail");
        }
        this.g.addTextChangedListener((TextWatcher)new ki(this, g));
        this.h.setOnFocusChangeListener((View$OnFocusChangeListener)new kj(this, g, g2));
        this.i.setEnabled(this.h());
        if (App.n() && !bq.c((Context)this) && com.twitter.library.util.a.b((Context)this) == 0) {
            this.g.setLabelText("@twitter.com email");
        }
        if (bundle == null) {
            g.a(new TwitterScribeLog(g2).b(new String[] { "login::::impression" }));
            kg.b(this, "login");
            if (data != null) {
                this.b(data);
            }
            this.p();
        }
        else {
            this.j = bundle.getString("reqId");
            this.k = bundle.getBoolean("passwordResetLogin", false);
            this.l = bundle.getInt("loginVerificationCause");
            this.T().a(this.j, this.c);
            this.e = bundle.getString("prefill_type");
            this.f = bundle.getString("prefill_value");
        }
        this.q();
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
                break;
            }
            case 1: {
                if (n2 == -1) {
                    if (!this.a) {
                        final Intent intent2 = (Intent)this.getIntent().getParcelableExtra("android.intent.extra.INTENT");
                        if (intent2 != null) {
                            this.startActivity(intent2);
                        }
                    }
                    this.setResult(-1, intent);
                    cm.a();
                    this.finish();
                    return;
                }
                break;
            }
            case 2:
            case 3: {
                if (n2 == -1) {
                    this.setResult(-1, intent);
                    this.finish();
                    return;
                }
                break;
            }
            case 4: {
                if (n2 == -1) {
                    this.b(intent.getData());
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.a) {
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)this.getIntent().getParcelableExtra("accountAuthenticatorResponse");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(4, "");
            }
        }
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131886908: {
                this.startActivity(new Intent((Context)this, (Class)LoggedOutSettingsActivity.class));
            }
            case 2131886381: {
                this.a(2131298236);
            }
            case 2131886907: {
                if (this.h()) {
                    this.i();
                    return;
                }
                break;
            }
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setMessage(this.getText(2131297201));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.T().e(this.j);
    }
    
    public void onResume() {
        super.onResume();
        switch (kk.a[this.U().b().ordinal()]) {
            case 1: {
                if ("android.intent.action.MAIN".equals(this.getIntent().getAction())) {
                    this.setResult(-1);
                    MainActivity.a(this, MainActivity.c);
                    return;
                }
                break;
            }
            case 2: {
                this.showDialog(1);
            }
            case 3: {
                this.removeDialog(1);
            }
            case 4: {
                this.removeDialog(1);
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("reqId", this.j);
        bundle.putBoolean("passwordResetLogin", this.k);
        bundle.putInt("loginVerificationCause", this.l);
        bundle.putString("prefill_type", this.e);
        bundle.putString("prefill_value", this.f);
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final Drawable drawable = this.h.getCompoundDrawables()[2];
        if (motionEvent.getAction() == 0 && drawable != null && (int)motionEvent.getX() + drawable.getIntrinsicWidth() + view.getPaddingRight() + this.h.getCompoundDrawablePadding() - view.getWidth() > 0) {
            this.h.removeTextChangedListener((TextWatcher)this);
            final int selectionStart = this.h.getSelectionStart();
            final int selectionEnd = this.h.getSelectionEnd();
            if (this.h.getInputType() != 145) {
                this.h.setInputType(145);
                this.h.setExtraState(LoginActivity.b);
            }
            else {
                this.h.setInputType(129);
                this.h.setExtraState(null);
            }
            this.h.setSelection(selectionStart, selectionEnd);
            this.h.addTextChangedListener((TextWatcher)this);
            return true;
        }
        return false;
    }
}
