// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class ss implements View$OnClickListener
{
    private static final String z;
    final DeleteAccount a;
    
    static {
        final char[] charArray = "=ba$\f<*l\"\u001b6rc5W:ol/\u001f<ix,\u001a<u".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '\u0007';
                    break;
                }
                case 2: {
                    c2 = '\r';
                    break;
                }
                case 3: {
                    c2 = 'A';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ss(final DeleteAccount a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(ss.z);
        this.a.startActivity(new Intent((Context)this.a, (Class)ChangeNumberOverview.class));
    }
}
