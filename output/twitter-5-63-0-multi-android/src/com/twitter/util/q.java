// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.regex.Pattern;
import java.security.SecureRandom;

public final class q
{
    public static final SecureRandom a;
    public static final Pattern b;
    private static final char[] c;
    
    static {
        a = new SecureRandom();
        b = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        c = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
    
    public static String a(final int n) {
        if (n < 1) {
            return "";
        }
        final char[] array = new char[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = q.c[q.a.nextInt(71)];
        }
        return new String(array);
    }
    
    public static String a(String string, final int n) {
        int n2 = 0;
        if (n < 1) {
            throw new IllegalArgumentException("numberOfSpaces must be > 0");
        }
        final int length = string.length();
        final int[] array = new int[n];
        int n3 = n - 1;
        int lastIndex = length;
        int n4 = 0;
        while (n3 >= 0 && lastIndex != -1) {
            lastIndex = string.lastIndexOf(" ", lastIndex - 1);
            if ((array[n3] = lastIndex) != -1) {
                ++n4;
            }
            --n3;
        }
        if (n4 > 0) {
            final StringBuilder sb = new StringBuilder(length);
            int n5;
            for (int i = n - n4; i < n; i = n5) {
                sb.append(string.substring(n2, array[i]));
                sb.append(" ");
                n5 = i + 1;
                n2 = 1 + array[i];
            }
            sb.append(string.substring(n2));
            string = sb.toString();
        }
        return string;
    }
    
    public static String a(final String s, final int n, final int n2) {
        if (n > n2) {
            throw new IllegalArgumentException("Start (" + n + ") is greater than end (" + n2 + ")");
        }
        if (n < 0) {
            throw new IndexOutOfBoundsException("Start (" + n + ") is less than zero");
        }
        if (n2 > s.length()) {
            throw new IndexOutOfBoundsException("End (" + n2 + ") is greater than the string length (" + s.length() + ")");
        }
        if (n == 0) {
            return s.substring(n2);
        }
        if (n2 == s.length()) {
            return s.substring(0, n);
        }
        return s.substring(0, n) + s.substring(n2);
    }
    
    public static String a(final long[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            sb.append(array[i]);
            if (i < -1 + array.length) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
    
    public static boolean a(final String s) {
        return s == null || s.length() == 0;
    }
    
    public static boolean a(final String s, final String s2) {
        if (s == null) {
            return s2 == null;
        }
        return s.equalsIgnoreCase(s2);
    }
    
    public static String b(final int n) {
        final StringBuilder sb = new StringBuilder();
        while (sb.length() < n) {
            sb.append(Integer.toHexString(q.a.nextInt(16)));
        }
        return sb.toString();
    }
    
    public static String b(final String s) {
        return s.replaceAll("\\s", "");
    }
    
    public static boolean b(final String s, final String s2) {
        if (s != null && s2 != null) {
            final int length = s.length();
            final int length2 = s2.length();
            if (length2 <= length) {
                int n = length - 1;
                for (int i = length2 - 1; i >= 0; --i) {
                    if (Character.toLowerCase(s.charAt(n)) != Character.toLowerCase(s2.charAt(i))) {
                        return false;
                    }
                    --n;
                }
                return true;
            }
        }
        return false;
    }
    
    public static String c(final String s) {
        return q.b.matcher(Normalizer.normalize(s, Normalizer.Form.NFD)).replaceAll("");
    }
}
