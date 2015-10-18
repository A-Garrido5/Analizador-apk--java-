// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class DebugUtils
{
    private static final String z;
    
    static {
        final char[] charArray = "\"\u000bK6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = 'L';
                    break;
                }
                case 1: {
                    c2 = '~';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static void buildShortClassTag(final Object o, final StringBuilder sb) {
        if (o == null) {
            sb.append(DebugUtils.z);
            if (LruCache.a == 0) {
                return;
            }
        }
        String s = o.getClass().getSimpleName();
        if (s == null || s.length() <= 0) {
            s = o.getClass().getName();
            final int lastIndex = s.lastIndexOf(46);
            if (lastIndex > 0) {
                s = s.substring(lastIndex + 1);
            }
        }
        sb.append(s);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(o)));
    }
}
