// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class b0 extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    String a;
    Throwable b;
    
    static {
        final String[] z2 = new String[2];
        String s = ")*Hg.V\u0002I`\u0011F)Ej\u0019S\u0018Tf\u0012\u0003\u0000\\z\b\u0003\u001fIh\u0012Y\r\u0007)";
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
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
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
                    s = "t\u001e\\y\fJ\u0002Z3\\";
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
    
    public b0(final Throwable b, final String a) {
        this.a = a;
        this.b = b;
    }
    
    public Throwable a() {
        return this.b;
    }
    
    @Override
    public String getMessage() {
        return b0.z[1] + this.b + b0.z[0] + this.a;
    }
}
