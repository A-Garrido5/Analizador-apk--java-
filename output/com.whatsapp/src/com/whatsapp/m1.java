// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class m1 implements DialogInterface$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "\u0010g\u001b\u0002\u0015\u0001{\u0014\u0000\u0019\u001cfZ\u0010\u0019\u0012d\u001a\u0013_\u0011d\u001a\u0017\u001b\\f\u001aY\u001e\u0016|\u0002\u001b\u0002\u0018%\u0016\u0015\u001e\u001dg\u0001Y\u0012\u001fg\u0016\u001f]\u0001m\u0005\u001b\u0002\u0007".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'p';
                    break;
                }
                case 0: {
                    c2 = 's';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = 'u';
                    break;
                }
                case 3: {
                    c2 = 't';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    m1(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (!App.O()) {
            Log.w(m1.z);
            App.a(this.a.getBaseContext(), 2131231421, 0);
            if (!App.I) {
                return;
            }
        }
        Conversation.m(this.a, true);
        App.a((gu)null, 0, 2131231591);
        bm.a(new adt(this));
    }
}
