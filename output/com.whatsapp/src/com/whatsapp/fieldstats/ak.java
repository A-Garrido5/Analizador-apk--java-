// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ak
{
    public static final ak BANNER;
    public static final ak CONTACTS;
    public static final ak MENU;
    public static final ak MULTISELECT;
    private static final ak[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0001)C`M\u00012^";
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
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000f3A`E\u0011#AqO\u0016";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0000'CzI\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000f#Ca";
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
        BANNER = new ak(ak.z[2], 0, 1);
        MENU = new ak(ak.z[3], 1, 2);
        CONTACTS = new ak(ak.z[0], 2, 3);
        MULTISELECT = new ak(ak.z[1], 3, 4);
        b = new ak[] { ak.BANNER, ak.MENU, ak.CONTACTS, ak.MULTISELECT };
    }
    
    private ak(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
