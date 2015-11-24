// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

public enum ModernAsyncTask$Status
{
    private static final ModernAsyncTask$Status[] $VALUES;
    public static final ModernAsyncTask$Status FINISHED;
    public static final ModernAsyncTask$Status PENDING;
    public static final ModernAsyncTask$Status RUNNING;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "?>%+K12/";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = 'b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ")2%&Q70";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+\"%,Q70";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PENDING = new ModernAsyncTask$Status(ModernAsyncTask$Status.z[1], 0);
        RUNNING = new ModernAsyncTask$Status(ModernAsyncTask$Status.z[2], 1);
        FINISHED = new ModernAsyncTask$Status(ModernAsyncTask$Status.z[0], 2);
        $VALUES = new ModernAsyncTask$Status[] { ModernAsyncTask$Status.PENDING, ModernAsyncTask$Status.RUNNING, ModernAsyncTask$Status.FINISHED };
    }
    
    private ModernAsyncTask$Status(final String s, final int n) {
    }
}
