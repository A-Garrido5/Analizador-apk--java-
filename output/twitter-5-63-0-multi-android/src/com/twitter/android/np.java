// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Spannable;
import android.text.Selection;
import android.text.Editable;
import android.telephony.PhoneNumberUtils;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.Locale;
import com.google.i18n.phonenumbers.a;
import android.text.TextWatcher;

public class np implements TextWatcher
{
    private boolean a;
    private boolean b;
    private a c;
    
    public np() {
        this(Locale.getDefault().getCountry());
    }
    
    public np(final String s) {
        this.a = false;
        if (s == null) {
            throw new IllegalArgumentException();
        }
        this.c = PhoneNumberUtil.a().h(s);
    }
    
    private String a(final char c, final boolean b) {
        if (b) {
            return this.c.b(c);
        }
        return this.c.a(c);
    }
    
    private String a(final CharSequence charSequence, final int n) {
        final int n2 = n - 1;
        String s = null;
        this.c.a();
        final int length = charSequence.length();
        int i = 0;
        boolean b = false;
        char c = '\0';
        while (i < length) {
            final char char1 = charSequence.charAt(i);
            String s2;
            if (PhoneNumberUtils.isNonSeparator(char1)) {
                if (c != '\0') {
                    s = this.a(c, b);
                    b = false;
                }
                c = char1;
                s2 = s;
            }
            else {
                s2 = s;
            }
            if (i == n2) {
                b = true;
            }
            ++i;
            s = s2;
        }
        if (c != '\0') {
            s = this.a(c, b);
        }
        return s;
    }
    
    private void a() {
        this.b = true;
        this.c.a();
    }
    
    private boolean a(final CharSequence charSequence, final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public void afterTextChanged(final Editable editable) {
        boolean b = true;
        synchronized (this) {
            if (this.b) {
                if (editable.length() == 0) {
                    b = false;
                }
                this.b = b;
            }
            else if (!this.a) {
                final String a = this.a((CharSequence)editable, Selection.getSelectionEnd((CharSequence)editable));
                if (a != null) {
                    final int c = this.c.c();
                    this.a = true;
                    editable.replace(0, editable.length(), (CharSequence)a, 0, a.length());
                    if (a.equals(editable.toString())) {
                        Selection.setSelection((Spannable)editable, c);
                    }
                    this.a = false;
                }
            }
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (!this.a && !this.b && n2 > 0 && this.a(charSequence, n, n2)) {
            this.a();
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (!this.a && !this.b && n3 > 0 && this.a(charSequence, n, n3)) {
            this.a();
        }
    }
}
