// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.app.Activity;
import com.whatsapp.util.br;
import android.os.Environment;
import android.view.View;
import android.view.View$OnClickListener;

class jb implements View$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "@hJ1\u0010Hc".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = '-';
                    break;
                }
                case 1: {
                    c2 = '\u0007';
                    break;
                }
                case 2: {
                    c2 = '?';
                    break;
                }
                case 3: {
                    c2 = '_';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    jb(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (!Voip.d()) {
            Conversation.G(this.a).dismiss();
            if (!Environment.getExternalStorageState().equals(jb.z)) {
                this.a.showDialog(15);
                if (!App.I) {
                    return;
                }
            }
            br.a(4, this.a);
            Conversation.a_ = false;
            return;
        }
        App.a((Context)this.a, 2131231092, 0);
    }
}
