// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public abstract class hv implements Iterable
{
    static final boolean a;
    public static final hv b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "p!\u0011s\"".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001a';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = 'u';
                    break;
                }
                case 2: {
                    c2 = 'W';
                    break;
                }
                case 3: {
                    c2 = '^';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "p!\u0011s\"\u0005\u001b8*:V\u0000'.uW\u00012:%".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u001a';
                    break;
                }
                case 0: {
                    c4 = '%';
                    break;
                }
                case 1: {
                    c4 = 'u';
                    break;
                }
                case 2: {
                    c4 = 'W';
                    break;
                }
                case 3: {
                    c4 = '^';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "v\u001a\",y@U20~\u0005\u001a18i@\u0001wb:\u0015Ow".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u001a';
                    break;
                }
                case 0: {
                    c6 = '%';
                    break;
                }
                case 1: {
                    c6 = 'u';
                    break;
                }
                case 2: {
                    c6 = 'W';
                    break;
                }
                case 3: {
                    c6 = '^';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "i\u001099nMUk~*\u001fU".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u001a';
                    break;
                }
                case 0: {
                    c8 = '%';
                    break;
                }
                case 1: {
                    c8 = 'u';
                    break;
                }
                case 2: {
                    c8 = 'W';
                    break;
                }
                case 3: {
                    c8 = '^';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "v\u001a\",y@U88|V\u0010#~&\u0005Em~".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u001a';
                    break;
                }
                case 0: {
                    c10 = '%';
                    break;
                }
                case 1: {
                    c10 = 'u';
                    break;
                }
                case 2: {
                    c10 = 'W';
                    break;
                }
                case 3: {
                    c10 = '^';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "q\u0014%9\u007fQU20~\u0005\u001a18i@\u0001wb:\u0015Ow".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u001a';
                    break;
                }
                case 0: {
                    c12 = '%';
                    break;
                }
                case 1: {
                    c12 = 'u';
                    break;
                }
                case 2: {
                    c12 = 'W';
                    break;
                }
                case 3: {
                    c12 = '^';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "q\u0014%9\u007fQU88|V\u0010#~&\u0005Em~".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u001a';
                    break;
                }
                case 0: {
                    c14 = '%';
                    break;
                }
                case 1: {
                    c14 = 'u';
                    break;
                }
                case 2: {
                    c14 = 'W';
                    break;
                }
                case 3: {
                    c14 = '^';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u00197.*\u007fv\u0001%7tB5r-:V\u001c-;'\u0000\u0011i".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u001a';
                    break;
                }
                case 0: {
                    c16 = '%';
                    break;
                }
                case 1: {
                    c16 = 'u';
                    break;
                }
                case 2: {
                    c16 = 'W';
                    break;
                }
                case 3: {
                    c16 = '^';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "p!\u0011s\"".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\u001a';
                    break;
                }
                case 0: {
                    c18 = '%';
                    break;
                }
                case 1: {
                    c18 = 'u';
                    break;
                }
                case 2: {
                    c18 = 'W';
                    break;
                }
                case 3: {
                    c18 = '^';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "p!\u0011s\"\u0005\u001b8*:V\u0000'.uW\u00012:%".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\u001a';
                    break;
                }
                case 0: {
                    c20 = '%';
                    break;
                }
                case 1: {
                    c20 = 'u';
                    break;
                }
                case 2: {
                    c20 = 'W';
                    break;
                }
                case 3: {
                    c20 = '^';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        while (true) {
            z2[9] = new String(charArray10).intern();
            z = z2;
            while (true) {
                try {
                    if (!hv.class.desiredAssertionStatus()) {
                        final boolean a2 = true;
                        a = a2;
                        b = new hj(new byte[0]);
                        return;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final boolean a2 = false;
                continue;
            }
        }
    }
    
    static ap a(final int n) {
        return new ap(n, null);
    }
    
    public static hv a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    public static hv a(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return new hj(array2);
    }
    
    public static hv b(final String s) {
        try {
            return new hj(s.getBytes(hv.z[8]));
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(hv.z[9], ex);
        }
    }
    
    protected abstract int a(final int p0, final int p1, final int p2);
    
    public abstract String a(final String p0);
    
    protected abstract void a(final byte[] p0, final int p1, final int p2, final int p3);
    
    public byte[] a() {
        final int c = this.c();
        final byte[] array = new byte[c];
        this.a(array, 0, 0, c);
        return array;
    }
    
    public abstract byte b(final int p0);
    
    protected abstract int b(final int p0, final int p1, final int p2);
    
    public void b(final byte[] array, final int n, final int n2, final int n3) {
        if (n < 0) {
            try {
                throw new IndexOutOfBoundsException(hv.z[4] + n);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        if (n2 < 0) {
            try {
                throw new IndexOutOfBoundsException(hv.z[6] + n2);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        if (n3 < 0) {
            try {
                throw new IndexOutOfBoundsException(hv.z[3] + n3);
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        final int n4 = n + n3;
        try {
            if (n4 > this.c()) {
                throw new IndexOutOfBoundsException(hv.z[2] + (n + n3));
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
        final int n5 = n2 + n3;
        try {
            if (n5 > array.length) {
                throw new IndexOutOfBoundsException(hv.z[5] + (n2 + n3));
            }
        }
        catch (RuntimeException ex5) {
            throw ex5;
        }
        if (n3 <= 0) {
            return;
        }
        try {
            this.a(array, n, n2, n3);
        }
        catch (RuntimeException ex6) {
            throw ex6;
        }
    }
    
    public abstract boolean b();
    
    public abstract int c();
    
    public boolean d() {
        try {
            if (this.c() == 0) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    protected abstract int e();
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract hb f();
    
    public abstract cL g();
    
    public abstract InputStream h();
    
    @Override
    public abstract int hashCode();
    
    public String i() {
        try {
            return this.a(hv.z[0]);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(hv.z[1], ex);
        }
    }
    
    @Override
    public Iterator iterator() {
        return this.f();
    }
    
    @Override
    public String toString() {
        return String.format(hv.z[7], Integer.toHexString(System.identityHashCode(this)), this.c());
    }
}
