// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;

public class cr
{
    private static final String[] z;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    
    static {
        final String[] z2 = new String[13];
        String s = "u-]f\u0001";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u'U(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000e\u001dEtR//zpE";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "u(CzQh";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "u:HeYh";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "u>PgH<-Xe];:\f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "1+]|J0<H";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "!!";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "!7Ap";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "<*";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "'+RpU%:";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "%/CaU6'AtR!";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "6\"PfO";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public cr() {
    }
    
    public cr(final cr cr) {
        this.a = cr.a;
        this.e = cr.e;
        this.c = cr.c;
        this.b = cr.b;
        this.d = cr.d;
    }
    
    public c0 a() {
        return null;
    }
    
    public Vector b() {
        final String a = this.a;
        final String e = this.e;
        String b = this.b;
        final String c = this.c;
        final String d = this.d;
        if (cr.z[10].equals(e) && cr.z[6].equals(b)) {
            b = null;
        }
        final Vector<bm> vector = new Vector<bm>(10);
        vector.addElement(new bm(cr.z[7], a));
        vector.addElement(new bm(cr.z[12], e));
        if (b != null) {
            vector.addElement(new bm(cr.z[8], b));
        }
        vector.addElement(new bm(cr.z[9], c));
        if (d != null && d.length() > 0) {
            vector.addElement(new bm(cr.z[11], d));
        }
        return vector;
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
            final cr cr = (cr)o;
            if (this.e == null) {
                if (cr.e != null) {
                    return false;
                }
            }
            else if (!this.e.equals(cr.e)) {
                return false;
            }
            if (this.a == null) {
                if (cr.a != null) {
                    return false;
                }
            }
            else if (!this.a.equals(cr.a)) {
                return false;
            }
            if (this.c == null) {
                if (cr.c != null) {
                    return false;
                }
            }
            else if (!this.c.equals(cr.c)) {
                return false;
            }
            if (this.d == null) {
                if (cr.d != null) {
                    return false;
                }
            }
            else if (!this.d.equals(cr.d)) {
                return false;
            }
            if (this.b == null) {
                if (cr.b != null) {
                    return false;
                }
            }
            else if (!this.b.equals(cr.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.e == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.e.hashCode();
        }
        final int n = 31 * (hashCode + 31);
        int hashCode2;
        if (this.a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = this.a.hashCode();
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = this.c.hashCode();
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = this.d.hashCode();
        }
        final int n4 = 31 * (hashCode4 + n3);
        final String b = this.b;
        int hashCode5 = 0;
        if (b != null) {
            hashCode5 = this.b.hashCode();
        }
        return n4 + hashCode5;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(cr.z[2]);
        String string;
        if (this.a == null) {
            string = "";
        }
        else {
            string = cr.z[3] + this.a;
        }
        final StringBuilder append2 = append.append(string);
        String string2;
        if (this.e == null) {
            string2 = "";
        }
        else {
            string2 = cr.z[0] + this.e;
        }
        final StringBuilder append3 = append2.append(string2);
        String string3;
        if (this.c == null) {
            string3 = "";
        }
        else {
            string3 = cr.z[1] + this.c;
        }
        final StringBuilder append4 = append3.append(string3);
        String string4;
        if (this.b == null) {
            string4 = "";
        }
        else {
            string4 = cr.z[4] + this.b;
        }
        final StringBuilder append5 = append4.append(string4);
        String string5;
        if (this.d == null) {
            string5 = "";
        }
        else {
            string5 = cr.z[5] + this.d;
        }
        return append5.append(string5).append("]").toString();
    }
}
