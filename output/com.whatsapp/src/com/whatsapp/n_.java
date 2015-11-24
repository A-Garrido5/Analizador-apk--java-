// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.br;
import android.os.Environment;
import android.view.View;
import android.view.View$OnClickListener;

class n_ implements View$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "Fgm\f]Nl".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = '\u0018';
                    break;
                }
                case 3: {
                    c2 = 'b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    n_(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.G(this.a).dismiss();
        if (!Environment.getExternalStorageState().equals(n_.z)) {
            this.a.showDialog(15);
            if (!App.I) {
                return;
            }
        }
        br.a(23, this.a);
        Conversation.a_ = false;
    }
}
