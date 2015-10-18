// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.view.View;
import android.widget.EditText;
import android.view.View$OnClickListener;

class a82 implements View$OnClickListener
{
    private static final String z;
    final EditText a;
    final Advanced b;
    
    static {
        final char[] charArray = "f2)\t*|))\u00187{8{\u0013.c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'O';
                    break;
                }
                case 0: {
                    c2 = '\u000f';
                    break;
                }
                case 1: {
                    c2 = ']';
                    break;
                }
                case 2: {
                    c2 = '\t';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a82(final Advanced b, final EditText a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(a82.z);
        try {
            Advanced.a(this.b, App.n.a(), Integer.parseInt(this.a.getText().toString()));
        }
        catch (IOException ex) {
            Log.b(ex);
        }
        catch (NumberFormatException ex2) {
            Log.c(ex2);
        }
    }
}
