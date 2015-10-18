// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.text.Editable;
import android.net.Uri;
import android.app.Activity;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.api.account.ab;
import android.view.View;
import android.content.Context;
import com.twitter.util.t;
import com.twitter.library.service.y;
import com.twitter.library.client.Session;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;

public class ChangeScreenNameActivity extends TwitterFragmentActivity implements TextWatcher, View$OnClickListener
{
    int a;
    private cf b;
    private EditText c;
    private Button d;
    private TextView e;
    private Drawable f;
    private int g;
    private int h;
    private String i;
    private Session j;
    
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
    
    private boolean a(final String s, final String s2) {
        return !s.equals(s2);
    }
    
    private void h() {
        this.a(this.c, true);
        this.a = 1;
        this.a(this.c, this.e, null);
    }
    
    private void i() {
        t.a((Context)this, (View)this.c, false);
        final String string = this.c.getText().toString();
        if (this.a(string, this.i)) {
            this.a(ab.a((Context)this, this.j, this.j.j(), false, string), 2);
            return;
        }
        Toast.makeText(this.getBaseContext(), 2131297296, 0).show();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968635);
        bn.a(false);
        return bn;
    }
    
    public void a(final int n, final y y) {
        switch (n) {
            case 1: {
                final aa aa = (aa)y.l().b();
                if (aa.a()) {
                    this.a(this.c, true);
                    this.a = 1;
                    this.a(this.c, this.e, null);
                }
                else {
                    this.a(this.c, false);
                    this.a = 0;
                    this.a(this.c, this.e, aa.d());
                }
                this.b();
            }
            case 2: {
                final aa aa2 = (aa)y.l().b();
                if (aa2 != null && aa2.c.getString("OLD_SCREEN_NAME") != null) {
                    int n2;
                    String s;
                    if (y.X()) {
                        n2 = 2131297613;
                        s = "settings:update_username::update_username:success";
                        MainActivity.a(this, null);
                    }
                    else {
                        s = "settings:update_username::update_username:failure";
                        n2 = 2131297612;
                    }
                    Toast.makeText(this.getBaseContext(), n2, 0).show();
                    this.G().a(this.j.g(), s);
                    return;
                }
                break;
            }
        }
    }
    
    void a(final EditText editText, final TextView textView, final String text) {
        if (text != null) {
            editText.setTextColor(this.g);
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
            return;
        }
        editText.setTextColor(this.h);
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
            editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, this.f, (Drawable)null);
            return;
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = this.c.getText().toString();
        if (editable.toString().equals(string) && this.i.equals(string)) {
            this.h();
        }
        else {
            this.a = this.a(this.c, this.e, 6);
            final int a = this.a;
            if (a == 2) {
                this.b.a(3);
            }
            else if (a == 3) {
                this.a(this.c, this.e, this.getString(2131297614));
            }
            else {
                this.b.removeMessages(3);
            }
        }
        this.b();
    }
    
    void b() {
        boolean enabled = true;
        final Button d = this.d;
        if (this.a != (enabled ? 1 : 0)) {
            enabled = false;
        }
        d.setEnabled(enabled);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.i = this.getIntent().getStringExtra("ChangeScreenNameActivity_account_name");
        this.j = this.T().b(this.i);
        this.b = new cf(this);
        this.G().a(this.j.g(), "settings:update_username::update_username:impression");
        final Resources resources = this.getResources();
        this.f = resources.getDrawable(2130838976);
        this.h = resources.getColor(17170444);
        this.g = resources.getColor(2131689575);
        (this.c = (EditText)this.findViewById(2131886382)).setText((CharSequence)this.i);
        this.c.setSelection(this.i.length());
        this.c.addTextChangedListener((TextWatcher)this);
        this.e = (TextView)this.findViewById(2131886383);
        (this.d = (Button)this.findViewById(2131886384)).setOnClickListener((View$OnClickListener)this);
        this.j = az.a(this.getBaseContext()).b(this.i);
        as.a((Context)this).a(ab.a((Context)this, this.j), (z)null);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886384) {
            this.G().a(this.j.g(), "settings:update_username::update_username:click");
            this.i();
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
