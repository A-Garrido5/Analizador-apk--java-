// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

public enum b
{
    public static final b BOTH;
    public static final b INVISIBLE_ONLY;
    public static final b VISIBLE_ONLY;
    private static final b[] b;
    private static final String[] z;
    private final String[] a;
    
    static {
        final String[] z2 = new String[4];
        String s = "WCcK\u0016MD^Q\u001aaJNR\nN\r\u0001\u001d@";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "wcjt,wopx qcpd";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "hdot=rhcr1rt";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "|bhu";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        BOTH = new b(com.whatsapp.contact.b.z[3], 0, null);
        VISIBLE_ONLY = new b(com.whatsapp.contact.b.z[2], 1, new String[] { "1" });
        INVISIBLE_ONLY = new b(com.whatsapp.contact.b.z[1], 2, new String[] { "0" });
        b = new b[] { com.whatsapp.contact.b.BOTH, com.whatsapp.contact.b.VISIBLE_ONLY, com.whatsapp.contact.b.INVISIBLE_ONLY };
    }
    
    private b(final String s, final int n, final String[] a) {
        this.a = a;
    }
    
    public String[] getWhereArgs() {
        return this.a;
    }
    
    public String getWhereClause() {
        if (this.a != null) {
            return com.whatsapp.contact.b.z[0];
        }
        return null;
    }
}
