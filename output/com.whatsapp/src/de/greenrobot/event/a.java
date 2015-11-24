// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

public enum a
{
    public static final a Async;
    public static final a BackgroundThread;
    public static final a MainThread;
    public static final a PostThread;
    public static boolean b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "M/!\u00197u27\f\u0007";
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
                        c2 = 'c';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
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
                    s = "P!;\u00037u27\f\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\3+\u0003\u0000";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "_!1\u0006\u0004o/'\u0003\u0007I( \b\u0002y";
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
        PostThread = new a(de.greenrobot.event.a.z[0], 0);
        MainThread = new a(de.greenrobot.event.a.z[1], 1);
        BackgroundThread = new a(de.greenrobot.event.a.z[3], 2);
        Async = new a(de.greenrobot.event.a.z[2], 3);
    }
    
    private a(final String s, final int n) {
    }
}
