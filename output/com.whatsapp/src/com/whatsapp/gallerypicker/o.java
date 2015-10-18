// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.BitmapFactory$Options;

class o
{
    private static final String[] z;
    public BitmapFactory$Options a;
    public an b;
    public boolean c;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0011\f:SN";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
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
                        c2 = 'P';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|@9LM9\u000f8O\u0019m@";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "$\b$YX4@%HX$\u0005v\u0001\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0013\u00018_\\<";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private o() {
        this.b = an.ALLOW;
    }
    
    o(final t t) {
        this();
    }
    
    @Override
    public String toString() {
        final int v = MediaGalleryBase.v;
        if (this.b == an.CANCEL) {
            final String s = o.z[3];
            if (v == 0) {
                return o.z[2] + s + o.z[1] + this.a;
            }
        }
        if (this.b == an.ALLOW) {
            final String s = o.z[0];
            if (v == 0) {
                return o.z[2] + s + o.z[1] + this.a;
            }
        }
        final String s = "?";
        return o.z[2] + s + o.z[1] + this.a;
    }
}
