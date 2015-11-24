// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.view.View;
import android.text.TextUtils;
import android.text.Editable;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.internal.android.widget.ad;
import android.view.View$OnClickListener;
import android.text.TextWatcher;

public class k implements TextWatcher, View$OnClickListener, ad
{
    protected PopupEditText b;
    
    public k(final PopupEditText b) {
        (this.b = b).setOnClickListener((View$OnClickListener)this);
        this.b.setPopupEditTextListener(this);
        this.b.addTextChangedListener((TextWatcher)this);
    }
    
    public void I_() {
    }
    
    public void a(final int n) {
        final String text = (String)this.b.getAdapter().getItem(n);
        this.b.setText((CharSequence)text);
        this.b.setSelection(text.length());
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final CharSequence charSequence) {
    }
    
    public boolean a() {
        return this.b.hasFocus() && this.b.getAdapter().getCount() > 0;
    }
    
    public void afterTextChanged(final Editable editable) {
        if (this.a()) {
            if (!TextUtils.isEmpty((CharSequence)editable)) {
                this.b.b();
                return;
            }
            this.b.a();
        }
    }
    
    public PopupEditText b() {
        return this.b;
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onClick(final View view) {
        if (this.a()) {
            if (!this.b.c()) {
                this.b.a();
                return;
            }
            this.b.b();
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
