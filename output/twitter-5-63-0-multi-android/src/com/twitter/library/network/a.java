// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.internal.network.HttpOperation;
import com.twitter.library.util.bn;

public abstract class a
{
    public static String a(final byte b, final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append((char)(b - array[i]));
        }
        return sb.toString();
    }
    
    public static String a(final String s) {
        if (s == null) {
            return "";
        }
        final String a = bn.a(s, "UTF8");
        final int length = a.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = a.charAt(i);
            if (char1 == '*') {
                sb.append("%2A");
            }
            else if (char1 == '+') {
                sb.append("%20");
            }
            else if (char1 == '%' && i + 2 < length && a.charAt(i + 1) == '7' && a.charAt(i + 2) == 'E') {
                sb.append('~');
                i += 2;
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public abstract Object a();
    
    public abstract void a(final HttpOperation p0, final long p1);
}
