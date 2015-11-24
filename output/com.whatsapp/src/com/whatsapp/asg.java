// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum asg
{
    public static final asg BLUETOOTH;
    public static final asg EARPIECE;
    public static final asg HEADSET;
    public static final asg SPEAKER;
    private static final asg[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "eb#)>hs";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "hf0=$hd'";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "ok7(9bh6%";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "~w',&hu";
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
        SPEAKER = new asg(asg.z[3], 0, 1);
        EARPIECE = new asg(asg.z[1], 1, 2);
        BLUETOOTH = new asg(asg.z[2], 2, 3);
        HEADSET = new asg(asg.z[0], 3, 4);
        b = new asg[] { asg.SPEAKER, asg.EARPIECE, asg.BLUETOOTH, asg.HEADSET };
    }
    
    private asg(final String s, final int n, final int a) {
        this.a = a;
    }
    
    private int a() {
        return this.a;
    }
    
    static int a(final asg asg) {
        return asg.a();
    }
}
