// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.network.b;
import android.content.res.Resources;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import com.twitter.library.service.ab;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.service.aa;
import android.widget.ListAdapter;
import android.widget.AutoCompleteTextView;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;
import com.twitter.android.client.c;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;

public class EmailEntryFragment extends AbsFragment implements TextWatcher, TextView$OnEditorActionListener
{
    TextView a;
    int b;
    Drawable c;
    hf d;
    private int e;
    private int f;
    private EditText g;
    private String h;
    private List i;
    private mo j;
    private ArrayAdapter k;
    private c l;
    
    private int a(final EditText editText, final TextView textView, final int n) {
        this.a(editText, false);
        this.a(editText, textView, null);
        final int length = editText.length();
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
    
    private void d() {
        if (TextUtils.isEmpty((CharSequence)this.g.getText()) && !TextUtils.isEmpty((CharSequence)this.h)) {
            this.g.setText((CharSequence)this.h);
        }
    }
    
    private void e() {
        if (this.i != null && !this.i.isEmpty()) {
            ((AutoCompleteTextView)this.g).setAdapter((ListAdapter)(this.k = new ArrayAdapter(this.an, 17367050, this.i)));
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                if (aa.a()) {
                    this.a(this.g, true);
                    this.b = 1;
                    this.a(this.g, this.a, null);
                }
                else {
                    this.a(this.g, false);
                    this.b = 0;
                    String s;
                    if (!TextUtils.isEmpty((CharSequence)aa.d())) {
                        s = aa.d();
                    }
                    else if (!TelephonyUtil.c((Context)this.getActivity())) {
                        s = this.an.getString(2131297814);
                    }
                    else {
                        s = null;
                    }
                    this.a(this.g, this.a, s);
                }
                this.j.a(this.b());
            }
            case 2: {
                final ab p2 = y.P();
                if (p2 == null) {
                    break;
                }
                final Session c = this.aE().c(p2.a);
                if (c != null) {
                    final boolean a = ((aa)y.l().b()).a();
                    final c l = this.l;
                    final long g = c.g();
                    final String[] array = { "email_or_phone_signup:add_email::email_attach", null };
                    String s2;
                    if (a) {
                        s2 = "success";
                    }
                    else {
                        s2 = "failure";
                    }
                    array[1] = s2;
                    l.a(g, array);
                    return;
                }
                break;
            }
        }
    }
    
    void a(final EditText editText, final TextView textView, final String text) {
        if (text != null) {
            editText.setTextColor(this.e);
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
            return;
        }
        editText.setTextColor(this.f);
        textView.setVisibility(8);
    }
    
    void a(final EditText editText, final boolean b) {
        final Drawable[] compoundDrawables = editText.getCompoundDrawables();
        Drawable drawable;
        if (compoundDrawables == null) {
            drawable = null;
        }
        else {
            drawable = compoundDrawables[0];
        }
        if (b) {
            editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, this.c, (Drawable)null);
            return;
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    protected void a(final String s) {
        final String string = this.g.getText().toString();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.a(string, s);
        }
        this.j.d();
    }
    
    public void a(final String s, final String s2) {
        this.l.a(this.aF().g(), "email_or_phone_signup:add_email::email_attach:attempt");
        this.a(com.twitter.library.api.account.ab.a(this.an, this.aF(), null, s2, null, s, false), 2, 0);
    }
    
    public void afterTextChanged(final Editable editable) {
        int a;
        int n;
        if (editable.toString().equals(this.g.getText().toString())) {
            a = this.a(this.g, this.a, 3);
            this.b = a;
            n = 1;
        }
        else {
            n = 0;
            a = 0;
        }
        if (a == 2) {
            this.d.a(n);
        }
        else {
            this.d.removeMessages(n);
        }
        this.j.a(this.b());
    }
    
    boolean b() {
        return this.b == 1;
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    protected void c() {
        this.j.d();
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.j = (mo)activity;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Resources resources = this.getResources();
        final b a = com.twitter.library.network.c.a(this.an);
        this.l = com.twitter.android.client.c.a(this.an);
        this.h = a.c();
        this.i = a.b();
        this.d = new hf(this);
        this.c = resources.getDrawable(2130838976);
        this.f = resources.getColor(17170444);
        this.e = resources.getColor(2131689575);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968750, viewGroup, false);
        this.g = (EditText)inflate.findViewById(2131886706);
        this.a = (TextView)inflate.findViewById(2131886707);
        this.g.addTextChangedListener((TextWatcher)this);
        this.g.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        this.d();
        this.e();
        this.g.requestFocus();
        return inflate;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() == 2131886706 && n == 5 && this.b()) {
            this.j.b();
            return true;
        }
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
