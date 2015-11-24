// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.br;
import android.content.Context;
import android.os.Environment;
import android.view.View;
import android.view.View$OnClickListener;

class cc implements View$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "z\u0007\"g`r\f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0014';
                    break;
                }
                case 0: {
                    c2 = '\u0017';
                    break;
                }
                case 1: {
                    c2 = 'h';
                    break;
                }
                case 2: {
                    c2 = 'W';
                    break;
                }
                case 3: {
                    c2 = '\t';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    cc(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        Conversation.G(this.a).dismiss();
        if (!Environment.getExternalStorageState().equals(cc.z)) {
            this.a.showDialog(15);
            if (!i) {
                return;
            }
        }
        String s = null;
        Label_0136: {
            if (this.a.s.m()) {
                s = this.a.getString(2131231158, new Object[] { this.a.s.a((Context)this.a) });
                if (!i) {
                    break Label_0136;
                }
            }
            s = this.a.getString(2131231643, new Object[] { this.a.s.a((Context)this.a) });
        }
        br.a(this.a, s);
        Conversation.a_ = false;
    }
}
