// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.br;
import android.os.Environment;
import android.view.View;
import android.view.View$OnLongClickListener;

class a_u implements View$OnLongClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "LsHp\u0010Dx".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = '\u001c';
                    break;
                }
                case 2: {
                    c2 = '=';
                    break;
                }
                case 3: {
                    c2 = '\u001e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_u(final Conversation a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        Conversation.G(this.a).dismiss();
        if (!Environment.getExternalStorageState().equals(a_u.z)) {
            this.a.showDialog(15);
            if (!App.I) {
                return true;
            }
        }
        br.a(21, this.a);
        Conversation.a_ = false;
        return true;
    }
}
