// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.m;
import com.whatsapp.protocol.b2;

class gc implements Runnable
{
    private static final String z;
    final b2 a;
    final byte[] b;
    final App c;
    final int d;
    final b2[] e;
    
    static {
        final char[] charArray = "y;k&YX<60AIf+4E".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '1';
                    break;
                }
                case 0: {
                    c2 = '9';
                    break;
                }
                case 1: {
                    c2 = 'H';
                    break;
                }
                case 2: {
                    c2 = 'E';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    gc(final App c, final byte[] b, final int d, final b2[] e, final b2 a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.c.ap.remove(App.au() + gc.z);
        App.a(this.b, m.a(this.d), (byte)5, this.e, this.a);
    }
}
