// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class a8 implements Runnable
{
    private static final String z;
    final int a;
    final b0 b;
    
    static {
        final char[] charArray = "+\u0011F\u0005/6\u0013A\\!<\u0006[\u0007#u\u001bP\u0002#*\u0002W\u0003i:\u0015Q\u001a3(YW\u000347\u0006\u0012".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'F';
                    break;
                }
                case 0: {
                    c2 = 'X';
                    break;
                }
                case 1: {
                    c2 = 't';
                    break;
                }
                case 2: {
                    c2 = '2';
                    break;
                }
                case 3: {
                    c2 = 'q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a8(final b0 b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(a8.z + this.a);
        SettingsGoogleDrive.b(this.b.b, this.a);
    }
}
