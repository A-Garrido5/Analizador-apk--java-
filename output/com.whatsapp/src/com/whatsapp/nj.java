// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.view.View;
import android.widget.EditText;
import android.view.View$OnClickListener;

class nj implements View$OnClickListener
{
    private static final String z;
    final Advanced a;
    final EditText b;
    
    static {
        final char[] charArray = "a\u0012lY\b{\tlD\u0003|\u0018>C\fd".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'm';
                    break;
                }
                case 0: {
                    c2 = '\b';
                    break;
                }
                case 1: {
                    c2 = '}';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '-';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    nj(final Advanced a, final EditText b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        App.F(nj.z);
        try {
            Advanced.a(this.a, App.T.a(), Integer.parseInt(this.b.getText().toString()));
        }
        catch (IOException ex) {
            Log.b(ex);
        }
        catch (NumberFormatException ex2) {
            Log.c(ex2);
        }
    }
}
