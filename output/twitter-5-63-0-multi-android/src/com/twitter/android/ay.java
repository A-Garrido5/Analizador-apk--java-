// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.widget.TextView;
import android.view.View;
import android.widget.CompoundButton;
import com.twitter.android.client.c;
import android.app.Activity;
import android.preference.PreferenceManager;
import android.content.Intent;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.util.ap;
import android.graphics.Typeface;
import android.widget.ListAdapter;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.List;
import com.twitter.library.api.account.w;
import com.twitter.library.service.aa;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.android.util.al;
import com.twitter.android.util.x;
import android.widget.CheckBox;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.LinearLayout;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnTouchListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;
import android.text.Editable;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.library.util.text.d;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import android.os.Message;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.library.util.text.a;
import java.lang.ref.WeakReference;
import android.os.Handler;

public class ay extends Handler
{
    private final WeakReference a;
    
    public ay(final BaseSignUpActivity baseSignUpActivity) {
        this.a = new WeakReference((T)baseSignUpActivity);
    }
    
    private void a(final BaseSignUpActivity baseSignUpActivity) {
        final String string = baseSignUpActivity.c.getText().toString();
        if (com.twitter.library.util.text.a.c.matcher(string).matches() && bq.a((Context)baseSignUpActivity, App.n(), string)) {
            this.a(baseSignUpActivity, string);
            return;
        }
        if (kq.b.matcher(string).matches()) {
            this.a(baseSignUpActivity, string, 1, false);
            baseSignUpActivity.p = 2;
            return;
        }
        if (!baseSignUpActivity.c.hasFocus()) {
            baseSignUpActivity.a(baseSignUpActivity.c, false);
            baseSignUpActivity.a(baseSignUpActivity.c, baseSignUpActivity.getString(2131297819));
        }
        baseSignUpActivity.l = 0;
    }
    
    private void a(final BaseSignUpActivity baseSignUpActivity, final String a) {
        final ox ox = (ox)new ox((Context)baseSignUpActivity, baseSignUpActivity.U()).g(1);
        ox.a = a;
        baseSignUpActivity.a(ox, 1);
    }
    
    private void a(final BaseSignUpActivity baseSignUpActivity, final String s, final int n, final boolean b) {
        new jm(baseSignUpActivity, n, b).execute((Object[])new String[] { s });
    }
    
    private void b(final BaseSignUpActivity baseSignUpActivity) {
        final String string = baseSignUpActivity.c.getText().toString();
        if (com.twitter.library.util.text.a.c.matcher(string).matches() && bq.a((Context)baseSignUpActivity, App.n(), string)) {
            this.a(baseSignUpActivity, string);
            return;
        }
        if (!baseSignUpActivity.c.hasFocus()) {
            baseSignUpActivity.a(baseSignUpActivity.c, baseSignUpActivity.getString(2131297811));
        }
        baseSignUpActivity.l = 0;
    }
    
    private void c(final BaseSignUpActivity baseSignUpActivity) {
        final String string = baseSignUpActivity.f.getText().toString();
        if (string.length() == 0) {
            baseSignUpActivity.o = 1;
            return;
        }
        if (kq.b.matcher(string).matches()) {
            this.a(baseSignUpActivity, string, 2, true);
            return;
        }
        baseSignUpActivity.a(baseSignUpActivity.f, baseSignUpActivity.getString(2131297817));
        baseSignUpActivity.o = 0;
    }
    
    public void a(final int n) {
        this.a(n, 500);
    }
    
    public void a(final int n, final int n2) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, (long)n2);
    }
    
    public void b(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessage(n);
    }
    
    public void handleMessage(final Message message) {
        final BaseSignUpActivity baseSignUpActivity = (BaseSignUpActivity)this.a.get();
        if (baseSignUpActivity == null) {
            return;
        }
        switch (message.what) {
            case 1: {
                final String trim = baseSignUpActivity.b.getText().toString().trim();
                final String e = bq.e(trim);
                final boolean b = trim.length() > 0 && trim.equals(e);
                baseSignUpActivity.a(baseSignUpActivity.b, b);
                if (b) {
                    baseSignUpActivity.k = 1;
                }
                else {
                    if (!trim.equals(e)) {
                        baseSignUpActivity.a(baseSignUpActivity.b, baseSignUpActivity.getString(2131297812));
                    }
                    else if (!baseSignUpActivity.b.hasFocus()) {
                        baseSignUpActivity.a(baseSignUpActivity.b, baseSignUpActivity.getString(2131297813));
                    }
                    baseSignUpActivity.k = 0;
                }
                baseSignUpActivity.g();
                break;
            }
            case 2: {
                if (baseSignUpActivity.q == 0) {
                    baseSignUpActivity.i.b(null);
                    this.a(baseSignUpActivity);
                }
                else {
                    this.b(baseSignUpActivity);
                }
                baseSignUpActivity.g();
                break;
            }
            case 3: {
                final Editable text = baseSignUpActivity.d.getText();
                final boolean matches = d.d.matcher((CharSequence)text).matches();
                if (text.length() < 6) {
                    if (!baseSignUpActivity.d.hasFocus()) {
                        baseSignUpActivity.a(baseSignUpActivity.d, baseSignUpActivity.getString(2131297614));
                    }
                    baseSignUpActivity.m = 0;
                    break;
                }
                if (d.a.matcher((CharSequence)text).matches() && !matches) {
                    final ox ox = (ox)new ox((Context)baseSignUpActivity, baseSignUpActivity.U()).g(2);
                    ox.e = text.toString();
                    baseSignUpActivity.a(ox, 2);
                    break;
                }
                final int a = b(text);
                if (!baseSignUpActivity.d.hasFocus()) {
                    baseSignUpActivity.a(baseSignUpActivity.d, baseSignUpActivity.getString(a));
                }
                baseSignUpActivity.m = 0;
                break;
            }
            case 4: {
                if (baseSignUpActivity.e.length() < 6) {
                    baseSignUpActivity.a(baseSignUpActivity.e, baseSignUpActivity.getString(2131297815));
                    baseSignUpActivity.n = 0;
                    break;
                }
                if (com.twitter.library.featureswitch.d.f("signup_password_strength_enabled")) {
                    final pt pt = new pt((Context)baseSignUpActivity, baseSignUpActivity.U(), baseSignUpActivity.e.getText().toString(), baseSignUpActivity.b.getText().toString(), baseSignUpActivity.d.getText().toString());
                    final String string = baseSignUpActivity.c.getText().toString();
                    if (string.matches("^.+@.+$")) {
                        pt.a(string);
                    }
                    baseSignUpActivity.a(pt, 4);
                    break;
                }
                baseSignUpActivity.n = 1;
                baseSignUpActivity.a(baseSignUpActivity.e, true);
                baseSignUpActivity.a(baseSignUpActivity.e, null);
                break;
            }
            case 5: {
                baseSignUpActivity.i.b(null);
                this.c(baseSignUpActivity);
                break;
            }
        }
        baseSignUpActivity.b();
    }
}
