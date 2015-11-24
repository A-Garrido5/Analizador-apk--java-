// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextWatcher;

class yh implements TextWatcher
{
    final VerifySms a;
    private String b;
    
    yh(final VerifySms a) {
        this.a = a;
        this.b = "";
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean i = App.I;
        VerifySms.j(this.a).removeTextChangedListener((TextWatcher)this);
        int selectionStart = VerifySms.j(this.a).getSelectionStart();
        String s = editable.toString().replace(Character.toString(' '), "");
        final int n = VerifySms.n() / 2;
        Label_0145: {
            if (s.length() > 0 && this.b.startsWith(s) && this.b.indexOf(45) >= 0 && s.indexOf(45) < 0) {
                s = s.substring(0, -1 + s.length());
                --selectionStart;
                if (!i) {
                    break Label_0145;
                }
            }
            if (s.length() > selectionStart && s.indexOf(45) == selectionStart && selectionStart == n + 1) {
                ++selectionStart;
            }
        }
        String s2 = s.replace(Character.toString('-'), "");
        int length = s2.length();
        if (length > n) {
            ++length;
        }
        while (s2.length() < n) {
            s2 += ' ';
            if (i) {
                break;
            }
        }
        String text = s2.substring(0, n) + '-' + s2.substring(n, Math.min(VerifySms.n(), s2.length()));
        while (text.length() < 1 + VerifySms.n()) {
            text += ' ';
            if (i) {
                break;
            }
        }
        VerifySms.j(this.a).setText((CharSequence)text);
        VerifySms.j(this.a).setSelection(Math.min(selectionStart, Math.min(length, text.length())));
        VerifySms.j(this.a).addTextChangedListener((TextWatcher)this);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (charSequence != null) {
            this.b = charSequence.toString();
        }
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (charSequence != null) {
            final String replace = charSequence.toString().replace(Character.toString(' '), "").replace(Character.toString('-'), "");
            if (replace.length() == VerifySms.n()) {
                if (VerifySms.c(this.a, replace)) {
                    a8s.a(new asi(this.a), new String[] { replace });
                    if (!App.I) {
                        return;
                    }
                }
                if (!this.a.isFinishing()) {
                    this.a.showDialog(33);
                }
            }
        }
    }
}
