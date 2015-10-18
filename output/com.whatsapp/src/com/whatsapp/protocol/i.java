// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class i extends a
{
    private static final String[] z;
    final byte[] a;
    final byte[] b;
    final Runnable c;
    final String d;
    final bf e;
    
    static {
        final String[] z2 = new String[2];
        String s = "*\u000fx\u000e<&";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'H';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9\u001cr\r?&\u000fe";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    i(final bf e, final String d, final byte[] b, final byte[] a, final Runnable c) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a(final int n) {
        bf.d(this.e).a(n, null, this.d, this.b, this.a, this.c);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final c0 a = c0.a(0);
        c0.b(a, i.z[0]);
        bf.d(this.e).a(0, a.b(i.z[1]).a, this.d, this.b, this.a, this.c);
    }
}
