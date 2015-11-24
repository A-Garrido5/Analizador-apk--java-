// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class K
{
    private static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static String a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    public static String a(final byte[] array, final int n, final int n2) {
        final int a = m.a;
        final StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < n2) {
            a(sb, array[n + i]);
            sb.append(" ");
            ++i;
            if (a != 0) {
                break;
            }
        }
        return sb.toString();
    }
    
    private static void a(final StringBuffer sb, final int n) {
        sb.append(K.a[0xF & n >> 4]);
        sb.append(K.a[n & 0xF]);
    }
}
