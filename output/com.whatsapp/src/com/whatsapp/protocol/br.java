// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.Writer;

public final class br implements co
{
    private static final String[] a;
    private static final String[] c;
    private static final String[] d;
    private static final String[] z;
    private final Writer b;
    
    static {
        final String[] array = new String[9];
        String s = "\u000bSsBG$m~YZPm|DM5lMp";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0527:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\t';
                        break;
                    }
                    case 0: {
                        c3 = 'p';
                        break;
                    }
                    case 1: {
                        c3 = '(';
                        break;
                    }
                    case 2: {
                        c3 = '0';
                        break;
                    }
                    case 3: {
                        c3 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "_\u0016";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "NSKNF>|uC]#\buA@4mtptL\u0007";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "L\u0007";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    array2 = array3;
                    s = "M\u000f";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "W\bBhz\u001f]BnlM\u000f";
                    n = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "L[D\u007fl\u0011E\n~}\u0002MQ`)\u0004G\r*";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "W\u0016";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "L\u0007Cy{\u0015I]7z\u0004ZUldN";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = { null };
                    s = "\u0012GTt";
                    n = 8;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    a = array3;
                    array2 = (array3 = new String[2]);
                    s = "\u001eI]h";
                    n = 9;
                    n2 = 0;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    s = "\u0003@_\u007f}";
                    n = 10;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    c = array3;
                    final String[] array5 = new String[2];
                    s = "\u0005[U\u007f";
                    n = 11;
                    array2 = array5;
                    array3 = array5;
                    n2 = 0;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    s = "\u0013@Qy";
                    n = 12;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    break Label_0527;
                }
            }
        }
        array2[n2] = intern;
        d = array3;
    }
    
    public br(final Writer b) {
        this.b = b;
    }
    
    private static boolean a(final String s) {
        final int i = bi.O;
        int n = 0;
        do {
            final int length = br.a.length;
            boolean b = false;
            if (n < length) {
                if (!br.a[n].equals(s)) {
                    ++n;
                    continue;
                }
                b = true;
            }
            return b;
        } while (i == 0);
        return false;
    }
    
    private static boolean a(final String s, final String s2) {
        final int i = bi.O;
        int n = 0;
        do {
            final int length = br.d.length;
            boolean b = false;
            if (n < length) {
                if (br.d[n].equals(s)) {
                    int j = 0;
                    while (j < br.c.length) {
                        if (br.c[j].equals(s2)) {
                            b = true;
                            return b;
                        }
                        ++j;
                        if (i != 0) {
                            break;
                        }
                    }
                }
                ++n;
                continue;
            }
            return b;
        } while (i == 0);
        return false;
    }
    
    private void b(final c0 c0) {
        this.c(c0);
    }
    
    private void c(final c0 c0) {
        final int o = bi.O;
        this.b.write(60);
        this.b.write(c0.f);
        if (c0.c != null) {
            int i = 0;
            while (i < c0.c.length) {
                this.b.write(32);
                this.b.write(c0.c[i].a);
                this.b.write(br.z[4]);
                Label_0132: {
                    if (a(c0.f, c0.c[i].a)) {
                        this.b.write(br.z[0]);
                        if (o == 0) {
                            break Label_0132;
                        }
                    }
                    this.b(c0.c[i].b);
                }
                this.b.write(39);
                ++i;
                if (o != 0) {
                    break;
                }
            }
        }
        if (c0.a == null && c0.d == null) {
            this.b.write(br.z[1]);
            if (o == 0) {
                return;
            }
        }
        if (a(c0.f)) {
            this.b.write(br.z[2]);
            this.b.write(c0.f);
            this.b.write(62);
            if (o == 0) {
                return;
            }
        }
        this.b.write(62);
        if (c0.a != null) {
            this.a(c0.a);
        }
        final c0[] d = c0.d;
        int j = 0;
        if (d != null) {
            while (j < c0.d.length) {
                this.b(c0.d[j]);
                ++j;
                if (o != 0) {
                    break;
                }
            }
        }
        this.b.write(br.z[3]);
        this.b.write(c0.f);
        this.b.write(62);
    }
    
    @Override
    public void a() {
        synchronized (this) {
            this.b.write(br.z[8]);
            this.b.flush();
        }
    }
    
    @Override
    public void a(final b4 b4) {
    }
    
    @Override
    public void a(final c0 c0) {
        synchronized (this) {
            this.a(c0, 1);
        }
    }
    
    @Override
    public void a(final c0 c0, final int n) {
        // monitorenter(this)
        Label_0021: {
            if (c0 != null) {
                break Label_0021;
            }
            try {
                this.b.write(32);
                if (bi.O != 0) {
                    this.b(c0);
                }
                if ((n & 0x1) != 0x0) {
                    this.b.flush();
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public void a(final c0 c0, final boolean b) {
        // monitorenter(this)
        Label_0017: {
            if (!b) {
                break Label_0017;
            }
            int n = 1;
            try {
                while (true) {
                    this.a(c0, n);
                    return;
                    n = 0;
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public void a(final String s, final String s2) {
        synchronized (this) {
            this.b.write(br.z[6]);
            this.b.write(s);
            this.b.write(br.z[5]);
            this.b.write(s2);
            this.b.write(br.z[7]);
            this.b.flush();
        }
    }
    
    void a(final byte[] array) {
        final int o = bi.O;
        final StringBuilder sb = new StringBuilder();
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final byte b = array[i];
            Label_0106: {
                if (b < 33 || b == 37 || b > 126) {
                    sb.append('%');
                    final String hexString = Integer.toHexString(b & 0xFF);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                    if (o == 0) {
                        break Label_0106;
                    }
                }
                sb.append((char)b);
            }
            ++i;
            if (o != 0) {
                break;
            }
        }
        this.b.write(sb.toString());
    }
    
    void b(final String s) {
        this.a(s.getBytes());
    }
}
