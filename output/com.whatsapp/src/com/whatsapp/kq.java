// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;
import java.util.List;

public class kq extends j1
{
    private static final String[] z;
    String b;
    int c;
    boolean d;
    String e;
    List f;
    
    static {
        final String[] z2 = new String[3];
        String s = "/\u0004G\u0005B";
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
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = '\u000f';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~\u001f|M\u0007|\u001dLQ\u0011jMWF\u0012jW\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "/NGZ\u0016n\u0004OLX/";
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
    
    public kq(final String e, final List f, final int c, final boolean d, final String b) {
        this.e = e;
        this.f = f;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public boolean a() {
        return this.d || super.a();
    }
    
    @Override
    public String b() {
        final StringBuilder append = new StringBuilder().append(kq.z[1]).append(this.c).append(kq.z[0]).append(this.e).append(kq.z[2]);
        Serializable value;
        if (this.f != null) {
            value = this.f.size();
        }
        else {
            value = "-";
        }
        return append.append(value).toString();
    }
    
    @Override
    public void c() {
        App.a(this.e, this.f, this.c, this.d, this.b);
    }
}
