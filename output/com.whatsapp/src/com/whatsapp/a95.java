// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class a95 implements Runnable
{
    private static final String z;
    final a04 a;
    private String b;
    private String c;
    
    static {
        final char[] charArray = "~\u0005k=]`\u0014k#_|Xz'Uk\u0018{:\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '8';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = 'w';
                    break;
                }
                case 2: {
                    c2 = '\u000e';
                    break;
                }
                case 3: {
                    c2 = 'N';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a95(final a04 a, final String c, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (a04.a(this.a).get(this.c) != null) {
            Log.i(a95.z + this.c + " " + this.b);
            this.a.b(this.c, this.b);
            App.u(this.c);
        }
    }
}
