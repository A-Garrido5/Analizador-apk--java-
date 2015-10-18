// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public abstract class fL
{
    public static boolean a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u0007L=d\nii\u001a\u000b%il+.\u000e*Wsd".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = 'I';
                    break;
                }
                case 1: {
                    c2 = '#';
                    break;
                }
                case 2: {
                    c2 = 'I';
                    break;
                }
                case 3: {
                    c2 = 'D';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u001dK 7K Pi*\u0004=\u0003(d!\u001al\u0007d*;Q(=E".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'k';
                    break;
                }
                case 0: {
                    c4 = 'I';
                    break;
                }
                case 1: {
                    c4 = '#';
                    break;
                }
                case 2: {
                    c4 = 'I';
                    break;
                }
                case 3: {
                    c4 = 'D';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u001dK 7K Pi*\u0004=\u0003(d!\u001al\u0007d;;J$-\u001f U,j".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'k';
                    break;
                }
                case 0: {
                    c6 = 'I';
                    break;
                }
                case 1: {
                    c6 = '#';
                    break;
                }
                case 2: {
                    c6 = 'I';
                    break;
                }
                case 3: {
                    c6 = 'D';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    public boolean a() {
        return this instanceof fb;
    }
    
    public boolean b() {
        return this instanceof fK;
    }
    
    public fk c() {
        try {
            if (this.e()) {
                return (fk)this;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        throw new IllegalStateException(fL.z[0] + this);
    }
    
    public fb d() {
        try {
            if (this.a()) {
                return (fb)this;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        throw new IllegalStateException(fL.z[1]);
    }
    
    public boolean e() {
        return this instanceof fk;
    }
    
    public f5 f() {
        try {
            if (this.g()) {
                return (f5)this;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        throw new IllegalStateException(fL.z[2]);
    }
    
    public boolean g() {
        return this instanceof f5;
    }
    
    @Override
    public String toString() {
        boolean a = true;
        final boolean a2 = fL.a;
        try {
            final StringWriter stringWriter = new StringWriter();
            final c3 c3 = new c3(stringWriter);
            c3.c(true);
            bS.a(this, c3);
            final String string = stringWriter.toString();
            if (!a2) {
                return string;
            }
            try {
                if (e_.a) {
                    a = false;
                }
                e_.a = a;
                return string;
            }
            catch (IOException ex) {
                throw ex;
            }
        }
        catch (IOException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
}
