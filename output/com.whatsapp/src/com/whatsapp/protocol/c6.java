// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class c6
{
    private static final String[] z;
    public final String a;
    public final boolean b;
    public final String c;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u007f\u0007Y7\u0011<SN\r\u0016:C\u0016";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007f\u0007M \u0013>xF7A";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0018BR\t\u00157\u001a";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public c6(final String a, final boolean b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final c6 c6 = (c6)o;
            if (this.b != c6.b) {
                return false;
            }
            if (this.c == null) {
                if (c6.c != null) {
                    return false;
                }
            }
            else if (!this.c.equals(c6.c)) {
                return false;
            }
            if (this.a == null) {
                if (c6.a != null) {
                    return false;
                }
            }
            else if (!this.a.equals(c6.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.b) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        final int n2 = 31 * (n + 31);
        int hashCode;
        if (this.c == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.c.hashCode();
        }
        final int n3 = 31 * (hashCode + n2);
        final String a = this.a;
        int hashCode2 = 0;
        if (a != null) {
            hashCode2 = this.a.hashCode();
        }
        return n3 + hashCode2;
    }
    
    @Override
    public String toString() {
        return c6.z[2] + this.c + c6.z[1] + this.b + c6.z[0] + this.a + "]";
    }
}
