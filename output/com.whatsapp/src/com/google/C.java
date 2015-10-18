// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class C
{
    private static final String[] z;
    private final Appendable a;
    private final StringBuilder b;
    private boolean c;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "C\n3Y5\u0006+2\u0005xC2/Y9\f02\r<\u00021%E8\r\"fd?\u0007 (YyJk".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Q';
                    break;
                }
                case 0: {
                    c2 = 'c';
                    break;
                }
                case 1: {
                    c2 = 'E';
                    break;
                }
                case 2: {
                    c2 = 'F';
                    break;
                }
                case 3: {
                    c2 = '-';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "Ce".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'Q';
                    break;
                }
                case 0: {
                    c4 = 'c';
                    break;
                }
                case 1: {
                    c4 = 'E';
                    break;
                }
                case 2: {
                    c4 = 'F';
                    break;
                }
                case 3: {
                    c4 = '-';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    private C(final Appendable a) {
        this.b = new StringBuilder();
        this.c = true;
        this.a = a;
    }
    
    C(final Appendable appendable, final be be) {
        this(appendable);
    }
    
    private void a(final CharSequence charSequence, final int n) {
        if (n == 0) {
            return;
        }
        try {
            if (this.c) {
                this.c = false;
                this.a.append(this.b);
            }
            this.a.append(charSequence);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void a() {
        final int length = this.b.length();
        if (length == 0) {
            try {
                throw new IllegalArgumentException(C.z[0]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.b.delete(length - 2, length);
    }
    
    public void a(final CharSequence charSequence) {
        int n = 0;
        final boolean b = dt.b;
        final int length = charSequence.length();
        int i = 0;
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                this.a(charSequence.subSequence(n, length), 1 + (i - n));
                n = i + 1;
                this.c = true;
            }
            ++i;
            if (b) {
                break;
            }
        }
        this.a(charSequence.subSequence(n, length), length - n);
    }
    
    public void b() {
        this.b.append(C.z[1]);
    }
}
