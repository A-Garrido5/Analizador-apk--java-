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
import android.content.Context;
import android.graphics.Typeface;
import android.widget.ListAdapter;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.List;
import com.twitter.library.api.account.w;
import com.twitter.library.service.aa;
import com.twitter.library.util.text.d;
import com.twitter.library.service.y;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.text.Editable;
import com.twitter.android.util.al;
import com.twitter.android.util.x;
import android.widget.CheckBox;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.ui.widget.TwitterEditText;
import android.widget.LinearLayout;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnTouchListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class BaseSignUpActivity extends TwitterFragmentActivity implements TextWatcher, View$OnClickListener, View$OnFocusChangeListener, View$OnTouchListener, CompoundButton$OnCheckedChangeListener, TextView$OnEditorActionListener, ad
{
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[][] y;
    protected LinearLayout a;
    protected TwitterEditText b;
    protected TwitterEditText c;
    protected PopupEditText d;
    protected TwitterEditText e;
    protected TwitterEditText f;
    protected CheckBox g;
    protected x h;
    protected al i;
    protected int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    ym r;
    ay s;
    boolean t;
    
    static {
        u = null;
        v = new int[] { 2130772624 };
        w = new int[] { 2130772623 };
        x = new int[] { 2130772623, 2130772624 };
        y = new int[][] { BaseSignUpActivity.u, BaseSignUpActivity.v, BaseSignUpActivity.w, BaseSignUpActivity.x };
    }
    
    public BaseSignUpActivity() {
        this.j = 0;
        this.p = 1;
        this.q = 0;
    }
    
    private int a(final TwitterEditText twitterEditText, final int n) {
        this.a(twitterEditText, false);
        this.a(twitterEditText, null);
        final int length = twitterEditText.length();
        int n2;
        if (length >= n) {
            n2 = 2;
        }
        else {
            n2 = 0;
            if (n > 1) {
                n2 = 0;
                if (length < n) {
                    return 3;
                }
            }
        }
        return n2;
    }
    
    private boolean a(final int n, final TwitterEditText twitterEditText) {
        return n == 0 && twitterEditText.length() > 0 && TextUtils.isEmpty(twitterEditText.getError());
    }
    
    private static int b(final Editable editable) {
        if (d.d.matcher((CharSequence)editable).matches()) {
            return 2131297823;
        }
        return 2131297822;
    }
    
    private boolean l() {
        return this.a.getVisibility() != 0 || this.o == 1;
    }
    
    public void I_() {
    }
    
    public void a(final int n) {
        final String a = this.r.a(n);
        this.d.setText((CharSequence)a);
        this.d.setSelection(0, a.length());
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                if (aa.a()) {
                    this.a(this.c, true);
                    this.l = 1;
                    this.p = 1;
                    this.a(this.c, null);
                }
                else {
                    this.a(this.c, false);
                    this.l = 0;
                    this.a(this.c, aa.d());
                }
                this.b();
            }
            case 2: {
                if (aa.a()) {
                    this.a(this.d, true);
                    this.m = 1;
                    this.a(this.d, null);
                }
                else {
                    this.a(this.d, false);
                    this.m = 0;
                    this.a(this.d, aa.d());
                }
                this.b();
            }
            case 3: {
                if (!aa.a()) {
                    break;
                }
                final List f = ((w)y).f();
                if (f != null && f.size() != 0) {
                    if (this.d.getText().length() == 0 && f.size() > 0) {
                        this.d.setText((CharSequence)f.get(0));
                        this.m = 1;
                    }
                    this.r.a(f);
                    if (this.i()) {
                        this.d.a();
                    }
                    this.b();
                    return;
                }
                break;
            }
            case 4: {
                if (aa.a()) {
                    if (((pt)y).e().a()) {
                        this.a(this.e, true);
                        this.n = 1;
                        this.a(this.e, null);
                    }
                    else {
                        this.a(this.e, false);
                        this.n = 0;
                        this.a(this.e, this.getString(2131297816));
                    }
                }
                else {
                    this.a(this.e, true);
                    this.a(this.e, null);
                    this.n = 1;
                }
                this.b();
            }
        }
    }
    
    void a(final TwitterEditText twitterEditText, final String error) {
        if (error != null) {
            twitterEditText.setError(error);
            return;
        }
        twitterEditText.e();
    }
    
    void a(final TwitterEditText twitterEditText, final String s, final int n) {
        if (n == 0 && TextUtils.isEmpty(twitterEditText.getError())) {
            this.a(twitterEditText, s);
        }
    }
    
    void a(final TwitterEditText twitterEditText, final boolean b) {
        if (twitterEditText == this.e) {
            if (b) {
                this.j |= 0x1;
            }
            else {
                this.j &= 0xFFFFFFFE;
            }
            this.e.setExtraState(BaseSignUpActivity.y[this.j]);
            return;
        }
        int[] extraState;
        if (b) {
            extraState = BaseSignUpActivity.v;
        }
        else {
            extraState = BaseSignUpActivity.u;
        }
        twitterEditText.setExtraState(extraState);
    }
    
    public void a(final CharSequence charSequence) {
    }
    
    public void afterTextChanged(final Editable editable) {
        int n = 500;
        int o;
        int n2;
        if (editable == this.b.getText()) {
            final int a = this.a(this.b, 1);
            this.k = a;
            final String string = editable.toString();
            if (!TextUtils.isEmpty((CharSequence)string.trim()) && string.charAt(-1 + string.length()) == ' ') {
                this.t = true;
                this.g();
            }
            o = a;
            n2 = 1;
        }
        else if (editable == this.c.getText()) {
            final int a2 = this.a(this.c, 0);
            this.l = a2;
            o = a2;
            n2 = 2;
        }
        else if (editable == this.d.getText()) {
            if (TextUtils.isEmpty((CharSequence)editable.toString())) {
                this.d.a();
            }
            else {
                this.d.b();
            }
            this.m = this.a(this.d, 6);
            o = this.m;
            n2 = 3;
        }
        else if (editable == this.e.getText()) {
            final int a3 = this.a(this.e, 1);
            this.n = a3;
            if (this.e.length() < 6) {
                n = 1500;
                n2 = 4;
                o = a3;
            }
            else {
                n2 = 4;
                o = a3;
            }
        }
        else {
            o = this.a(this.f, 0);
            this.o = o;
            n2 = 5;
            n = 1500;
        }
        if (o == 2) {
            this.s.a(n2, n);
        }
        else {
            this.s.removeMessages(n2);
        }
        this.b();
    }
    
    abstract void b();
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.s = new ay(this);
        this.a = (LinearLayout)this.findViewById(2131886667);
        this.b = (TwitterEditText)this.findViewById(2131886307);
        this.c = (TwitterEditText)this.findViewById(2131886666);
        this.d = (PopupEditText)this.findViewById(2131886308);
        this.e = (TwitterEditText)this.findViewById(2131886374);
        this.f = (TwitterEditText)this.findViewById(2131886668);
        (this.g = (CheckBox)this.findViewById(2131886669)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        this.r = new ym();
        this.d.setAdapter((ListAdapter)this.r);
        this.b.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.c.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.d.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.e.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.d.setOnClickListener((View$OnClickListener)this);
        this.b.addTextChangedListener((TextWatcher)this);
        this.c.addTextChangedListener((TextWatcher)this);
        this.d.addTextChangedListener((TextWatcher)this);
        this.e.addTextChangedListener((TextWatcher)this);
        this.e.setTypeface(Typeface.DEFAULT);
        this.e.setOnTouchListener((View$OnTouchListener)this);
        this.d.setPopupEditTextListener(this);
        this.o = 1;
        this.h = com.twitter.android.util.w.a((Context)this);
        this.d.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        this.e.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        this.i = ap.a((Context)this);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    void g() {
        if (this.t) {
            String value = String.valueOf(this.c.getText());
            final String value2 = String.valueOf(this.b.getText());
            if (value2.length() > 0) {
                final Session u = this.U();
                if (value.indexOf(64) <= 0) {
                    value = "";
                }
                this.a(new w((Context)this, u, value, value2), 3);
            }
        }
    }
    
    boolean h() {
        return this.k == 1 && this.l == 1 && this.m == 1 && this.n == 1 && this.l();
    }
    
    boolean i() {
        return this.d.hasFocus() && this.r.getCount() > 0;
    }
    
    abstract String j();
    
    protected void k() {
        final boolean checked = this.g.isChecked();
        final long g = this.U().g();
        String s3;
        int n2;
        boolean b2;
        if (this.q == 1) {
            this.G().a(g, "email_and_phone_signup:form:::success");
            final String n = this.i.n();
            boolean b;
            if (!TextUtils.isEmpty((CharSequence)n)) {
                b = true;
            }
            else {
                b = false;
            }
            final c g2 = this.G();
            final String[] array = { "signup:form:phone_number", null, null };
            String s;
            if (this.i.j()) {
                s = "has_phone";
            }
            else {
                s = "no_phone";
            }
            array[1] = s;
            String s2;
            if (b) {
                s2 = "filled";
            }
            else {
                s2 = "non_filled";
            }
            array[2] = s2;
            g2.a(g, array);
            s3 = n;
            n2 = (b ? 1 : 0);
            b2 = false;
        }
        else if (this.q == 0) {
            this.G().a(g, "email_or_phone_signup:form:::success");
            b2 = true;
            s3 = "";
            n2 = 0;
        }
        else {
            final String g3 = this.i.g();
            int n3;
            if (checked && this.i.b()) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            final boolean c = this.i.c();
            final c g4 = this.G();
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(g);
            final String[] array2 = { "signup:form:checkbox", null, null };
            String s4;
            if (this.i.b()) {
                s4 = "has_phone";
            }
            else {
                s4 = "no_phone";
            }
            array2[1] = s4;
            String s5;
            if (checked) {
                s5 = "opt_in";
            }
            else {
                s5 = "opt_out";
            }
            array2[2] = s5;
            final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)twitterScribeLog.b(array2);
            String s6;
            if (this.i.d()) {
                s6 = "JP_SIM";
            }
            else {
                s6 = null;
            }
            g4.a(twitterScribeLog2.d(s6));
            b2 = c;
            s3 = g3;
            n2 = n3;
        }
        final boolean b3 = n2 == 0 || !this.i.a();
        if (!this.i.d()) {
            final c g5 = this.G();
            final String[] array3 = { "signup:form:phone_number", "", null };
            String s7;
            if (this.i.j()) {
                s7 = "available";
            }
            else {
                s7 = "unavailable";
            }
            array3[2] = s7;
            g5.a(g, array3);
        }
        final c g6 = this.G();
        final String[] array4 = { "signup:form:checkbox", "", null };
        String s8;
        if (checked) {
            s8 = "opt_in";
        }
        else {
            s8 = "opt_out";
        }
        array4[2] = s8;
        g6.a(g, array4);
        final FollowFlowController a = new FollowFlowController(this.j()).a(checked).c(true).a((Intent)this.getIntent().getParcelableExtra("android.intent.extra.INTENT"));
        final String string = PreferenceManager.getDefaultSharedPreferences((Context)this).getString("pref_referral_campaign", (String)null);
        if (lj.a(string) != null) {
            a.a(string).g(b2);
        }
        else {
            a.f(b2).b(false);
        }
        a.b(this);
        if (n2 != 0) {
            er.a(a.f(), this.getApplicationContext()).a(s3, b3);
        }
        this.finish();
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        if (compoundButton.getId() == 2131886669) {
            this.G().a(this.U().g(), "signup:form:checkbox::interaction");
        }
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886308 && this.i()) {
            if (!this.d.c()) {
                this.d.a();
                return;
            }
            this.d.b();
        }
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() == 2131886308 && n == 5) {
            this.e.requestFocus();
            return true;
        }
        return false;
    }
    
    public void onFocusChange(final View view, final boolean b) {
        final int id = view.getId();
        if (id == 2131886307) {
            if (!b) {
                if (!this.a(this.k, this.b)) {
                    this.t = true;
                    this.g();
                    return;
                }
                int n;
                if (this.b.getText().toString().trim().length() == 0) {
                    n = 2131297813;
                }
                else {
                    n = 2131297812;
                }
                this.a(this.b, this.getString(n));
                this.k = 0;
            }
        }
        else if (id == 2131886666) {
            if (!b) {
                if (this.a(this.l, this.c)) {
                    final String string = this.c.getText().toString();
                    String s;
                    if (this.q == 0) {
                        if (kq.b.matcher(string).matches()) {
                            s = this.getString(2131297817);
                        }
                        else {
                            s = this.getString(2131297819);
                        }
                    }
                    else {
                        s = this.getString(2131297811);
                    }
                    this.a(this.c, s);
                    return;
                }
                if (this.l == 3) {
                    this.s.b(2);
                }
            }
        }
        else if (id == 2131886308) {
            if (this.i()) {
                this.d.a();
                return;
            }
            if (!b) {
                if (this.a(this.m, this.d)) {
                    this.a(this.d, this.getString(b(this.d.getText())));
                    return;
                }
                if (this.m == 3) {
                    this.s.b(3);
                }
            }
        }
        else if (id == 2131886374) {
            if (!b) {
                if (this.a(this.n, this.e)) {
                    this.a(this.e, this.getString(2131297815));
                    return;
                }
                if (this.n == 3) {
                    this.s.b(4);
                }
            }
        }
        else if (id == 2131886668 && !b) {
            if (this.a(this.o, this.f)) {
                this.a(this.f, this.getString(2131297817));
                return;
            }
            if (this.o == 3) {
                this.s.b(5);
            }
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (view == this.e) {
            final Drawable drawable = this.e.getCompoundDrawables()[2];
            if (motionEvent.getAction() == 0 && drawable != null && (int)motionEvent.getX() + drawable.getIntrinsicWidth() + view.getPaddingRight() + this.e.getCompoundDrawablePadding() - view.getWidth() > 0) {
                this.e.removeTextChangedListener((TextWatcher)this);
                final int selectionStart = this.e.getSelectionStart();
                final int selectionEnd = this.e.getSelectionEnd();
                if (this.e.getInputType() != 145) {
                    this.e.setInputType(145);
                    this.j |= 0x2;
                }
                else {
                    this.e.setInputType(129);
                    this.j &= 0xFFFFFFFD;
                }
                final TwitterEditText e = this.e;
                final int n = this.n;
                boolean b = false;
                if (n == 1) {
                    b = true;
                }
                this.a(e, b);
                this.e.setSelection(selectionStart, selectionEnd);
                this.e.addTextChangedListener((TextWatcher)this);
                return true;
            }
        }
        return false;
    }
    
    void r_() {
        int n;
        if (this.b.getText().toString().trim().length() == 0) {
            n = 2131297813;
        }
        else {
            n = 2131297812;
        }
        this.a(this.b, this.getString(n), this.k);
        this.a(this.c, this.getString(2131297811), this.l);
        this.a(this.d, this.getString(2131297614), this.m);
        this.a(this.e, this.getString(2131297815), this.n);
        if (this.a.getVisibility() == 0 && !TextUtils.isEmpty((CharSequence)this.f.getText().toString())) {
            this.a(this.f, this.getString(2131297817), this.o);
        }
    }
    
    void s_() {
        this.e.setImeOptions(5);
        this.a.setVisibility(0);
        this.f.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        this.f.addTextChangedListener((TextWatcher)this);
        this.f.setOnEditorActionListener((TextView$OnEditorActionListener)this);
    }
    
    void t_() {
        if (TextUtils.isEmpty((CharSequence)this.f.getText())) {
            this.f.setText((CharSequence)this.i.g());
        }
    }
}
