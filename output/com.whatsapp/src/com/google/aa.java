// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class aa extends an
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0019zws".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'l';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = 'N';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aa(final hN hn) {
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
        sb.append(aa.z);
        sb.append(a);
        sb.append(')');
        final int a2 = this.a().a(50, 10);
        if (a2 / 100 == 0) {
            sb.append('0');
        }
        if (a2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(a2);
        sb.append(this.a().a(60, null).a());
        final String string = sb.toString();
        if (c != 0) {
            ++fN.a;
        }
        return string;
    }
}
