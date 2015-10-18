// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

@Deprecated
public class i
{
    public static final byte[] a;
    public static final byte[] b;
    public static final String c;
    public static final String d;
    
    static {
        a = new byte[] { -100, -100, -81, -60, -39, -65, -37, -51, -58, -67, -31, -105, -104, -59, -35, -32, -95, -87, -90, -81, -86, -48 };
        b = new byte[] { -37, -82, -94, -96, -59, -49, -93, -62, -98, -36, -90, -96, -87, -37, -32, -53, -82, -89, -60, -99, -98, -104, -89, -63, -53, -49, -102, -83, -60, -48, -93, -67, -84, -105, -82, -54, -72, -102, -57, -82, -68 };
        c = a((byte)17, i.a);
        d = a((byte)17, i.b);
    }
    
    public static String a(final byte b, final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append((char)(b - array[i]));
        }
        return sb.toString();
    }
}
