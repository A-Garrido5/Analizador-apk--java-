// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.text;

import java.util.Locale;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Plurals
{
    private static final Map a;
    
    static {
        final HashMap<String, Plurals$RuleSet> hashMap = new HashMap<String, Plurals$RuleSet>();
        hashMap.put("ar", Plurals$RuleSet.a);
        hashMap.put("da", Plurals$RuleSet.c);
        hashMap.put("de", Plurals$RuleSet.c);
        hashMap.put("en", Plurals$RuleSet.c);
        hashMap.put("es", Plurals$RuleSet.c);
        hashMap.put("fa", Plurals$RuleSet.g);
        hashMap.put("fi", Plurals$RuleSet.c);
        hashMap.put("fr", Plurals$RuleSet.d);
        hashMap.put("he", Plurals$RuleSet.b);
        hashMap.put("hi", Plurals$RuleSet.c);
        hashMap.put("hu", Plurals$RuleSet.g);
        hashMap.put("in", Plurals$RuleSet.g);
        hashMap.put("it", Plurals$RuleSet.c);
        hashMap.put("iw", Plurals$RuleSet.b);
        hashMap.put("ja", Plurals$RuleSet.g);
        hashMap.put("ko", Plurals$RuleSet.g);
        hashMap.put("ms", Plurals$RuleSet.g);
        hashMap.put("nb", Plurals$RuleSet.c);
        hashMap.put("nl", Plurals$RuleSet.c);
        hashMap.put("pl", Plurals$RuleSet.f);
        hashMap.put("pt", Plurals$RuleSet.c);
        hashMap.put("ru", Plurals$RuleSet.e);
        hashMap.put("sv", Plurals$RuleSet.c);
        hashMap.put("th", Plurals$RuleSet.g);
        hashMap.put("tl", Plurals$RuleSet.c);
        hashMap.put("tr", Plurals$RuleSet.g);
        hashMap.put("zh", Plurals$RuleSet.g);
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public static Plurals$Rule a(final double n) {
        return a(Locale.getDefault().getLanguage().toLowerCase(), n);
    }
    
    public static Plurals$Rule a(final float n) {
        return a((double)n);
    }
    
    public static Plurals$Rule a(final String s) {
        try {
            return a(Double.parseDouble(s));
        }
        catch (NumberFormatException ex) {
            return Plurals$Rule.f;
        }
    }
    
    public static Plurals$Rule a(final String s, final double n) {
        final long n2 = (long)n;
        final boolean b = n == n2;
        Plurals$RuleSet g = Plurals.a.get(s);
        if (g == null) {
            g = Plurals$RuleSet.g;
        }
        switch (com.twitter.library.util.text.b.a[g.ordinal()]) {
            case 1: {
                if (!b) {
                    break;
                }
                final long n3 = n2 % 100L;
                if (n3 >= 3L && n3 <= 10L) {
                    return Plurals$Rule.d;
                }
                if (n3 >= 11L && n3 <= 99L) {
                    return Plurals$Rule.e;
                }
                if (n2 == 1L) {
                    return Plurals$Rule.b;
                }
                if (n2 == 2L) {
                    return Plurals$Rule.c;
                }
                if (n2 == 0L) {
                    return Plurals$Rule.a;
                }
                break;
            }
            case 2: {
                if (!b) {
                    break;
                }
                final long n4 = n2 % 10L;
                if (n2 != 0L && n4 == 0L) {
                    return Plurals$Rule.e;
                }
                if (n2 == 1L) {
                    return Plurals$Rule.b;
                }
                if (n2 == 2L) {
                    return Plurals$Rule.c;
                }
                break;
            }
            case 3: {
                if (b && n2 == 1L) {
                    return Plurals$Rule.b;
                }
                break;
            }
            case 4: {
                if (n >= 0.0 && n < 2.0) {
                    return Plurals$Rule.b;
                }
                break;
            }
            case 5: {
                if (!b) {
                    break;
                }
                final long n5 = n2 % 10L;
                final long n6 = n2 % 100L;
                if (n5 >= 2L && n5 <= 4L && (n6 < 12L || n6 > 14L)) {
                    return Plurals$Rule.d;
                }
                if (n5 == 0L || (n5 >= 5L && n5 <= 9L) || (n6 >= 11L && n6 <= 14L)) {
                    return Plurals$Rule.e;
                }
                if (n5 == 1L && n6 != 11L) {
                    return Plurals$Rule.b;
                }
                break;
            }
            case 6: {
                if (!b) {
                    break;
                }
                final long n7 = n2 % 10L;
                final long n8 = n2 % 100L;
                if (n7 >= 2L && n7 <= 4L && (n8 < 12L || n8 > 14L)) {
                    return Plurals$Rule.d;
                }
                if ((n2 != 1L && n7 >= 0L && n7 <= 1L) || (n7 >= 5L && n7 <= 9L) || (n8 >= 12L && n8 <= 14L)) {
                    return Plurals$Rule.e;
                }
                if (n2 == 1L) {
                    return Plurals$Rule.b;
                }
                break;
            }
        }
        return Plurals$Rule.f;
    }
}
