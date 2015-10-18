// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class q extends a
{
    private static final String[] z;
    final String a;
    final bf b;
    final int c;
    
    static {
        final String[] z2 = new String[13];
        String s = "}Kh\u001e";
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
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = '\u0006';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "xWt\u000e;a\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z@s\u0018";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "bSu\t";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "ySo\t";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "k@t\u0012 ";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "lSe\u0016=hT";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "m]b\u0018";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "g\\p\u001c>gV";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "aGr";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "d[b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "{Ac\u000f";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "g\\";
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
    
    q(final bf b, final String a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private int a(final bo[] array, final int n, final c0 c0) {
        final int o = bi.O;
        final c0[] d = c0.d;
        int i = 0;
        if (d != null) {
            int b = 0;
            Label_0077: {
                if (!c0.a(c0, q.z[12]) || o != 0) {
                    if (c0.a(c0, q.z[9])) {
                        b = 1;
                        i = 0;
                        if (o == 0) {
                            break Label_0077;
                        }
                    }
                    c0.b(c0, q.z[8]);
                    b = 2;
                }
                else {
                    b = 0;
                    i = 0;
                }
            }
            while (i < d.length) {
                final c0 c2 = d[i];
                c0.b(c2, q.z[11]);
                final bo bo = new bo();
                bo.c = c2.c(q.z[10]);
                bo.a = c2.a();
                bo.b = b;
                array[n + i] = bo;
                ++i;
                if (o != 0) {
                    return i;
                }
            }
        }
        return i;
    }
    
    private void a(final c0 c0, final bo[] array) {
        bf.d(this.b).a(this.a, this.c, array);
        if (q.z[2].equals(c0.c(q.z[3]))) {
            final String c2 = c0.c(q.z[1]);
            final String c3 = c0.c(q.z[4]);
            long n = -1L;
            if (c3 != null) {
                n = 1000L * Long.parseLong(c3);
            }
            bf.d(this.b).b(this.a, c2, n);
        }
    }
    
    @Override
    public void a(final int n) {
        bf.d(this.b).a(this.a, this.c, n, 0L);
    }
    
    @Override
    public void a(final c0 c0) {
        final c0 b = c0.b(q.z[5]);
        long n = -1L;
        int int1 = 0;
        while (true) {
            Label_0103: {
                if (b == null) {
                    break Label_0103;
                }
                final String c2 = b.c(q.z[7]);
                int1 = 0;
                if (c2 != null) {
                    int1 = Integer.parseInt(c2);
                }
                final String c3 = b.c(q.z[6]);
                if (c3 == null) {
                    break Label_0103;
                }
                n = 1000L * Long.parseLong(c3);
                final int n2 = int1;
                bf.d(this.b).a(this.a, this.c, n2, n);
                return;
            }
            final int n2 = int1;
            continue;
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        int i = 0;
        final int o = bi.O;
        final c0 b = c0.b(q.z[0]);
        if (b == null) {
            return;
        }
        final c0[] d = b.d;
        int length;
        if (d != null) {
            length = d.length;
        }
        else {
            length = 0;
        }
        int j = 0;
        int n = 0;
        while (j < length) {
            if (d[j].d != null) {
                n += d[j].d.length;
            }
            ++j;
            if (o != 0) {
                break;
            }
        }
        final bo[] array = new bo[n];
        int n2 = 0;
        while (i < length) {
            n2 += this.a(array, n2, d[i]);
            ++i;
            if (o != 0) {
                break;
            }
        }
        this.a(b, array);
    }
}
