// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class y
{
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000bb*\u0015P\u0012iw\u0016X\u000ft=Fb";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = '}';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = 'f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "!)";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public y(final int c, final int b, final int a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static y a(final String s) {
        try {
            final String[] split = s.split(y.z[1]);
            return new y(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        catch (Exception ex) {
            Log.e(y.z[0] + s + "]");
            return null;
        }
    }
    
    public int a(final y y) {
        if (this.c >= y.c) {
            if (this.c > y.c) {
                return 1;
            }
            if (this.b >= y.b) {
                if (this.b > y.b) {
                    return 1;
                }
                if (this.a >= y.a) {
                    if (this.a > y.a) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        return this.c + "." + this.b + "." + this.a;
    }
}
