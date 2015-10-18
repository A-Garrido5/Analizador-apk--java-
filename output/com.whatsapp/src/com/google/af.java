// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class af extends an
{
    private static final String z;
    
    static {
        final char[] charArray = "$L\r\u0001".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = '\f';
                    break;
                }
                case 1: {
                    c2 = '\u007f';
                    break;
                }
                case 2: {
                    c2 = '4';
                    break;
                }
                case 3: {
                    c2 = '3';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    af(final hN hn) {
        super(hn);
    }
    
    @Override
    public String c() {
        final int c = ay.c;
        if (this.b().b() < 48) {
            throw fv.a();
        }
        final StringBuilder sb = new StringBuilder();
        this.a(sb, 8);
        final int a = this.a().a(48, 2);
        sb.append(af.z);
        sb.append(a);
        sb.append(')');
        sb.append(this.a().a(50, null).a());
        final String string = sb.toString();
        if (fN.a != 0) {
            ay.c = c + 1;
        }
        return string;
    }
}
