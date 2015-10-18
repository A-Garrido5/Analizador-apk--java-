// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.content.DialogInterface;
import android.widget.EditText;
import android.content.DialogInterface$OnClickListener;

class rg implements DialogInterface$OnClickListener
{
    final VerifySms a;
    final EditText b;
    
    rg(final VerifySms a, final EditText b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final String trim = this.b.getText().toString().trim();
        if (TextUtils.isEmpty((CharSequence)trim) || trim.length() != VerifySms.n()) {
            this.a.removeDialog(32);
            this.a.showDialog(33);
            if (!App.I) {
                return;
            }
        }
        this.a.removeDialog(32);
        a8s.a(new asi(this.a), new String[] { trim });
    }
}
