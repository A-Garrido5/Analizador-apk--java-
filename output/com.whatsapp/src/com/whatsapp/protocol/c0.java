// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;
import java.io.InputStream;

public final class c0
{
    private static final String[] z;
    public final byte[] a;
    public int b;
    public final bm[] c;
    public final c0[] d;
    public InputStream e;
    public final String f;
    
    static {
        final String[] z2 = new String[14];
        String s = "B<]W4@}F^ Q4F^\u007f\u00043[_4\u001e}";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = ';';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0004.@I8J:\u000e\u001b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004|\t\u001b#A,AR#A9\u0014W4J:@Sq";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "B<]W4@}F^ Q4F^\u007f\u00043[_4\u0004";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "B<]W4@}F^ Q4F^\u007f\u00043[_4\u0004";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u00049UO0\u00041QU6P5\u0014";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u00040]H\"M3S\u001b5E)U";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "B<]W4@}F^ Q4F^\u007f\u00043[_4\u00044G\u001b?Q1X";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "E)@I8F(@^q";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u00044G\u001b?K)\u0014R?P8SI0Hg\u0014";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u00044G\u001b?K)\u0014R?P8SI0Hg\u0014";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "E)@I8F(@^q";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "V8EN8V8P\u001b0P)FR3Q)Q\u001bv";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0003}YR\"W4Z\\";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    break Label_0382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public c0(final String f, final bm[] c) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = null;
        this.a = null;
    }
    
    public c0(final String f, final bm[] c, final c0 c2) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = new c0[] { c2 };
        this.a = null;
    }
    
    public c0(final String f, final bm[] c, final InputStream e, final int b) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = null;
        this.a = null;
        this.e = e;
        this.b = b;
    }
    
    public c0(final String f, final bm[] c, final String s) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = null;
        Label_0042: {
            if (s == null) {
                break Label_0042;
            }
            try {
                this.a = b7.a(s);
                if (bi.O != 0) {
                    this.a = null;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    public c0(final String f, final bm[] c, final byte[] a) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = null;
        this.a = a;
    }
    
    public c0(final String f, final bm[] c, final c0[] d) {
        this.e = null;
        this.f = f;
        this.c = c;
        this.d = d;
        this.a = null;
    }
    
    public static c0 a(final c0 c0) {
        if (c0 == null) {
            try {
                throw new cz(c0.z[7]);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        return c0;
    }
    
    public static boolean a(final c0 c0, final String s) {
        if (c0 != null) {
            try {
                if (c0.f == null) {
                    return false;
                }
                final c0 c2 = c0;
                final String s2 = c2.f;
                final String s3 = s;
                final boolean b = s2.equals(s3);
                if (b) {
                    return true;
                }
                return false;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                final c0 c2 = c0;
                final String s2 = c2.f;
                final String s3 = s;
                final boolean b = s2.equals(s3);
                if (b) {
                    return true;
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public static byte[] a(final c0 c0, final int n) {
        try {
            if (c0.a == null) {
                throw new cz(c0.z[3] + c0 + c0.z[6]);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            if (c0.a.length != n) {
                throw new cz(c0.z[4] + c0 + c0.z[5] + c0.a.length + c0.z[2] + n);
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return c0.a;
    }
    
    public static void b(final c0 c0, final String s) {
        try {
            if (!a(c0, s)) {
                throw new cz(c0.z[0] + c0 + c0.z[1] + s);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public c0 a(final int n) {
        try {
            if (this.d == null) {
                return null;
            }
            final c0 c0 = this;
            final c0[] array = c0.d;
            final int n2 = array.length;
            final int n3 = n;
            if (n2 <= n3) {
                return null;
            }
            return this.d[n];
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final c0 c0 = this;
            final c0[] array = c0.d;
            final int n2 = array.length;
            final int n3 = n;
            if (n2 <= n3) {
                return null;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return this.d[n];
    }
    
    public String a() {
        try {
            if (this.a == null) {
                return null;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        return b7.a(this.a);
    }
    
    public String a(final String s, final String s2) {
    Block_4:
        while (true) {
            final int o = bi.O;
            try {
                if (this.c == null) {
                    return s2;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            int i = 0;
            while (i < this.c.length) {
                final bm bm = this.c[i];
                try {
                    if (s.equals(bm.a)) {
                        return bm.b;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
                ++i;
                if (o != 0) {
                    break Block_4;
                }
            }
            return s2;
        }
        return s2;
    }
    
    public Vector a(final String s) {
        final int o = bi.O;
        final Vector<c0> vector = new Vector<c0>();
        try {
            if (this.d == null) {
                return vector;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        int n = 0;
        while (true) {
            if (n >= this.d.length) {
                return vector;
            }
            try {
                if (s.equals(this.d[n].f)) {
                    vector.addElement(this.d[n]);
                }
                ++n;
                if (o != 0) {
                    return vector;
                }
                continue;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
    }
    
    public c0 b(final String s) {
        final int o = bi.O;
        try {
            if (this.d == null) {
                return null;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        int i = 0;
        while (i < this.d.length) {
            try {
                if (s.equals(this.d[i].f)) {
                    return this.d[i];
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            ++i;
            if (o != 0) {
                break;
            }
        }
        return null;
    }
    
    public String c(final String s) {
        return this.a(s, null);
    }
    
    public String d(final String s) {
        final String a = this.a(s, null);
        if (a == null) {
            try {
                throw new cz(c0.z[12] + s + c0.z[13]);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        return a;
    }
    
    public long e(final String s) {
        final String d = this.d(s);
        try {
            return Long.parseLong(d);
        }
        catch (NumberFormatException ex) {
            throw new cz(c0.z[8] + s + c0.z[9] + d);
        }
    }
    
    public int f(final String s) {
        final String d = this.d(s);
        try {
            return Integer.parseInt(d);
        }
        catch (NumberFormatException ex) {
            throw new cz(c0.z[11] + s + c0.z[10] + d);
        }
    }
}
