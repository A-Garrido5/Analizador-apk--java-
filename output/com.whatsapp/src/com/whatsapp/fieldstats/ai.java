// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ai
{
    public static final ai NO_BACKUP_FOUND;
    public static final ai ONLY_LOCAL_BACKUP_FOUND;
    public static final ai ONLY_REMOTE_BACKUP_FOUND;
    public static final ai REMOTE_AND_LOCAL_BACKUP_FOUND;
    private static final ai[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "Hkw~\u0000Eo}l\u001e@k}r\u0005";
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
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = '$';
                        break;
                    }
                    case 2: {
                        c2 = '(';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Taes\u0015C{ir\u0005Yhg\u007f\u0000J{j}\u0002Mqxc\u0007Iqfx";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Ijde\u001eTaes\u0015C{j}\u0002Mqxc\u0007Iqfx";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Ijde\u001eJkk}\rYfi\u007f\nStwz\u000eSjl";
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
        REMOTE_AND_LOCAL_BACKUP_FOUND = new ai(ai.z[1], 0, 1);
        ONLY_REMOTE_BACKUP_FOUND = new ai(ai.z[2], 1, 2);
        ONLY_LOCAL_BACKUP_FOUND = new ai(ai.z[3], 2, 3);
        NO_BACKUP_FOUND = new ai(ai.z[0], 3, 4);
        b = new ai[] { ai.REMOTE_AND_LOCAL_BACKUP_FOUND, ai.ONLY_REMOTE_BACKUP_FOUND, ai.ONLY_LOCAL_BACKUP_FOUND, ai.NO_BACKUP_FOUND };
    }
    
    private ai(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
