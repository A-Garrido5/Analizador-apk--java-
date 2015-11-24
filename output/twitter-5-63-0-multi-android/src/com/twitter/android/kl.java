// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.app.ProgressDialog;
import android.app.Dialog;
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
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import com.twitter.util.t;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.android.client.c;
import android.text.TextUtils;
import android.net.Uri;
import com.twitter.android.util.ak;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.dialog.e;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;
import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.featureswitch.d;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.telephony.TelephonyUtil;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.Session;
import com.twitter.library.client.bf;
import com.twitter.library.client.bd;

class kl implements bd, bf
{
    final /* synthetic */ LoginActivity a;
    
    public kl(final LoginActivity a) {
        this.a = a;
    }
    
    private void b(final Session session, final int n, final int[] array) {
        if (this.a.h_()) {
            this.a.removeDialog(1);
            final long g = session.g();
            int a = 0;
            if (n == 2) {
                if (this.a.a) {
                    final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)this.a.getIntent().getParcelableExtra("accountAuthenticatorResponse");
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onError(400, this.a.getString(2131297928));
                    }
                }
                this.a.G().a(g, "login::::failure");
                a = 2131297928;
            }
            else {
                int n2;
                if (array == null || array.length == 0) {
                    n2 = 0;
                }
                else {
                    n2 = array[0];
                }
                switch (n2) {
                    default: {
                        if (TelephonyUtil.c(this.a.getApplicationContext())) {
                            a = 2131297188;
                            break;
                        }
                        a = 2131297194;
                        break;
                    }
                    case 32: {
                        a = kq.a(this.a.G(), g, this.a.m().trim());
                        this.a.d++;
                        break;
                    }
                    case 229: {
                        this.a.l();
                        this.a.G().a(g, "login:form::identifier:ambiguous");
                        return;
                    }
                    case 231: {
                        this.a.j();
                        return;
                    }
                    case 244: {
                        this.a.k();
                        return;
                    }
                    case 305: {
                        a = 2131297195;
                        this.a.G().a(g, "login:form::identifier:shared_email");
                        break;
                    }
                }
            }
            if (a != 0) {
                Toast.makeText((Context)this.a, a, 1).show();
            }
            if (this.a.d >= 4) {
                this.a.d = 0;
                PromptDialogFragment.b(2).c(2131297196).h(2131298158).j(2131297303).a(this.a.getSupportFragmentManager());
                this.a.G().a(g, "login::forgot_password_prompt::impression");
            }
        }
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final int[] array, final boolean b) {
        this.b(session, n, array);
        this.a.k = false;
        if (this.a.l == 6) {
            this.a.G().a(session.g(), new String[] { null, "1fa_verify_email::1fa_login:failure" });
        }
    }
    
    @Override
    public void a(final Session session, final int n, final int[] array) {
        this.b(session, n, array);
    }
    
    @Override
    public void a(final Session session, final LoginVerificationRequiredResponse loginVerificationRequiredResponse) {
        if (!this.a.h_()) {
            return;
        }
        this.a.removeDialog(1);
        Serializable s;
        String s2;
        int n;
        if (d.f("two_factor_challenge_in_web_view_enabled")) {
            s = LoginChallengeActivity.class;
            s2 = "login_challenge_required_response";
            n = 3;
        }
        else {
            s = VerifyLoginActivity.class;
            s2 = "login_verification_required_response";
            n = 2;
        }
        final Intent putExtra = new Intent((Context)this.a, (Class)s).putExtra(s2, (Parcelable)loginVerificationRequiredResponse).putExtra("username", this.a.m()).putExtra("session_id", session.c());
        if (this.a.k && !this.a.getIntent().hasExtra("android.intent.extra.INTENT")) {
            putExtra.putExtra("start_main", true);
        }
        this.a.k = false;
        this.a.startActivityForResult(putExtra, n);
    }
    
    @Override
    public void a(final Session session, final String s) {
        if (!this.a.h_()) {
            return;
        }
        this.a.removeDialog(1);
        this.a.a(session, s);
    }
    
    @Override
    public void a(final Session session, final String s, final boolean b) {
        if (this.a.h_()) {
            this.a.removeDialog(1);
            this.a.a(session, s);
            this.a.k = false;
            if (this.a.l == 6) {
                this.a.G().a(session.g(), new String[] { null, "1fa_verify_email::1fa_login:success" });
            }
        }
    }
    
    @Override
    public void b(final Session session, final LoginVerificationRequiredResponse loginVerificationRequiredResponse) {
        if (!this.a.h_()) {
            return;
        }
        this.a.removeDialog(1);
        this.a.startActivityForResult(new Intent((Context)this.a, (Class)LoginChallengeActivity.class).putExtra("login_challenge_required_response", (Parcelable)loginVerificationRequiredResponse).putExtra("username", this.a.m()).putExtra("session_id", session.c()), 3);
    }
}
