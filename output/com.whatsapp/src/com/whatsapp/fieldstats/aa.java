// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum aa
{
    public static final aa CANCEL;
    public static final aa CURRENT_LOCATION;
    public static final aa CUSTOM_LOCATION;
    public static final aa PLACE;
    private static final aa[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "`[\u0010\u0007:";
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
                        c2 = '0';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = 'D';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "sB\u0003\u0016:~C\u000e\b0sV\u0005\r0~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "sB\u0002\u00100}H\u001d\u000b<qC\u0018\u000b1";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "sV\u001f\u0007:|";
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
        CANCEL = new aa(aa.z[3], 0, 1);
        CURRENT_LOCATION = new aa(aa.z[1], 1, 2);
        CUSTOM_LOCATION = new aa(aa.z[2], 2, 3);
        PLACE = new aa(aa.z[0], 3, 4);
        a = new aa[] { aa.CANCEL, aa.CURRENT_LOCATION, aa.CUSTOM_LOCATION, aa.PLACE };
    }
    
    private aa(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
