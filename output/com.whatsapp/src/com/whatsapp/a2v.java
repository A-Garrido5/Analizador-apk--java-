// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import de.greenrobot.event.m;
import com.whatsapp.util.Log;

final class a2v implements Runnable
{
    private static final String z;
    final a0q a;
    private final boolean b;
    
    static {
        final char[] charArray = "\u000f7\u0007w9\t,\u0003h;L;\u000bk9\u000e9\tlu\n7\u0018':\u0002\u001f\u000fs\u0005\u001e=!b,?-\td0\u001f+P'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'U';
                    break;
                }
                case 0: {
                    c2 = 'l';
                    break;
                }
                case 1: {
                    c2 = 'X';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = '\u0007';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a2v(final a0q a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.i(a2v.z + this.b);
        _o.b(this.a.d).ap.remove(this.a.a);
        m.b().b(new as0(this.a.a));
        if (this.b) {
            App.az();
        }
    }
}
