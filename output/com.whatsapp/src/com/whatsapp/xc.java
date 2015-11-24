// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class xc implements Runnable
{
    private static final String[] z;
    final ie a;
    final a_9 b;
    final _2 c;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0002@s\u00053NW;\b#\u0002\r&J";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\"';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "PVx\u000f/TV\u007fJ6J\\o\u0005\u0019V[n\u0007$}Z\u007fJ/LEz\u0006/F\u001f;";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "PVx\u000f/TV\u007fJ6J\\o\u0005\u0019DFw\u0006\u0019KW;\u0003(TRw\u0003\"\u000e\u0013";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0002@s\u00053NW;\b#\u0002\r&J";
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
    
    xc(final ie a, final a_9 b, final _2 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        this.b.a(this.c.c, this.c.e);
        int n = this.b.v;
        Label_0137: {
            if (this.c.c != null) {
                n = this.c.a;
                if (!i) {
                    break Label_0137;
                }
            }
            if (n != this.c.a) {
                if (this.c.a < n) {
                    Log.e(xc.z[2] + this.c.a + xc.z[0] + n);
                    if (!i) {
                        break Label_0137;
                    }
                }
                this.b.b().delete();
                n = 0;
            }
        }
        int n2 = this.b.q;
        Label_0249: {
            if (this.c.e != null) {
                n2 = this.c.a;
                if (!i) {
                    break Label_0249;
                }
            }
            if (n2 != this.c.a) {
                if (this.c.a < n2) {
                    Log.e(xc.z[1] + this.c.a + xc.z[3] + n2);
                    if (!i) {
                        break Label_0249;
                    }
                }
                this.b.y().delete();
                n2 = 0;
            }
        }
        this.b.a(n, n2);
        if (this.c.c != null) {
            App.Y.b(this.b.u);
        }
        if (this.c.e != null) {
            App.a7.b(this.b.u);
        }
        if (this.c.c != null || this.c.e != null) {
            App.aq.a5().post((Runnable)new bw(this));
        }
    }
}
