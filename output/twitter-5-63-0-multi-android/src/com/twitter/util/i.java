// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.util.Locale;

public class i
{
    private static String a(String s) {
        if ("iw".equals(s)) {
            s = "he";
        }
        else {
            if ("in".equals(s)) {
                return "id";
            }
            if ("yi".equals(s)) {
                return "ji";
            }
        }
        return s;
    }
    
    public static String a(final String s, final boolean b) {
        if (b) {
            return '\u200f' + s;
        }
        return '\u200e' + s;
    }
    
    public static boolean a() {
        return a(Locale.getDefault());
    }
    
    public static boolean a(final char c) {
        final byte directionality = Character.getDirectionality(c);
        return directionality == 1 || directionality == 2;
    }
    
    public static boolean a(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        boolean b;
        while (true) {
            b = false;
            if (n >= length) {
                break;
            }
            if (a(charSequence.charAt(n))) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    public static boolean a(final Locale locale) {
        final byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        if (directionality != 1) {
            final boolean b = false;
            if (directionality != 2) {
                return b;
            }
        }
        return true;
    }
    
    public static String b(final Locale locale) {
        String s = a(locale.getLanguage());
        if ("zh".equals(s)) {
            final String country = locale.getCountry();
            if (!q.a(country)) {
                s = s + "-" + country;
            }
        }
        return s;
    }
    
    public static String c(final Locale locale) {
        final String a = a(locale.getLanguage());
        final StringBuilder sb = new StringBuilder();
        if (!q.a(a)) {
            sb.append(a);
            final String country = locale.getCountry();
            if (!q.a(country)) {
                sb.append("-");
                sb.append(country);
            }
        }
        return sb.toString();
    }
    
    public static boolean d(final Locale locale) {
        return !q.a(locale.getLanguage()) && !q.a(locale.getCountry()) && q.a(locale.getVariant());
    }
    
    public static String e(final Locale locale) {
        return locale.getLanguage() + "_" + locale.getCountry();
    }
}
