// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class az extends a
{
    private static final String[] z;
    final bf a;
    
    static {
        final String[] z2 = new String[8];
        String s = "4\u0019'5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = 'A';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1\u0014";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "1\u0014";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "*\u00153(\u001f,\u000255\u00057\u001e";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ",\t$$";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "+\u001b18";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "<\u00193$\u001f,";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "0\u0011')";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    az(final bf a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (n == 404) {
            bf.c(this.a).a();
            if (bi.O == 0) {
                return;
            }
        }
        if (n == 503) {
            bf.c(this.a).c();
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final int o = bi.O;
        final c0 a = c0.a(c0.b(az.z[6]));
        final c0 a2 = c0.a(a.b(az.z[3]));
        final c0 a3 = c0.a(a.b(az.z[4]));
        final c0 a4 = c0.a(c0.a(a.b(az.z[5])).b(az.z[2]));
        final c0 a5 = c0.a(a.b(az.z[0]));
        final c0 a6 = c0.a(a.b(az.z[7]));
        int length;
        if (a5.d != null) {
            length = a5.d.length;
        }
        else {
            length = 0;
        }
        final byte[][] array = new byte[length][];
        int i = 0;
        while (i < length) {
            c0.b(a5.d[i], az.z[1]);
            array[i] = c0.a(a5.d[i], 3);
            ++i;
            if (o != 0) {
                break;
            }
        }
        bf.c(this.a).a(c0.a(a2, 4), c0.a(a3, 1)[0], c0.a(a4, 3), array, c0.a(a6, 20));
    }
}
