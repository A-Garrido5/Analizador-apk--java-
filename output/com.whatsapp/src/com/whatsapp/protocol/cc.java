// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class cc extends cr
{
    private static final String[] z;
    public long f;
    
    static {
        final String[] z2 = new String[2];
        String s = "lYQ=KaCM";
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
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "|IQ1VfMW9";
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
    
    public cc(final cr cr, final long f) {
        super(cr);
        this.f = f;
    }
    
    @Override
    public c0 a() {
        if (this.f > 0L) {
            return new c0(cc.z[1], new bm[] { new bm(cc.z[0], String.valueOf(this.f)) });
        }
        return null;
    }
}
