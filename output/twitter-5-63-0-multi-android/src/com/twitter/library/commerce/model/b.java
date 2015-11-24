// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.MissingResourceException;
import java.util.Collections;
import java.util.Locale;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import java.util.Map;
import java.util.List;

public class b
{
    private static Object a;
    private static volatile b b;
    private List c;
    private Map d;
    
    static {
        com.twitter.library.commerce.model.b.a = new Object();
    }
    
    private b(final Context context) {
        this.b(context);
    }
    
    public static b a(final Context context) {
        Label_0031: {
            if (com.twitter.library.commerce.model.b.b != null) {
                break Label_0031;
            }
            synchronized (com.twitter.library.commerce.model.b.a) {
                if (com.twitter.library.commerce.model.b.b == null) {
                    com.twitter.library.commerce.model.b.b = new b(context);
                }
                return com.twitter.library.commerce.model.b.b;
            }
        }
    }
    
    public static List a(final List list, final List list2) {
        return b(list, list2);
    }
    
    public static boolean a() {
        return d.f("commerce_international_shipping_enabled");
    }
    
    public static boolean a(final String s, final List list) {
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(s)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean a(final List list) {
        return list != null && list.size() == 1 && "all".equalsIgnoreCase(list.get(0));
    }
    
    public static List b() {
        final ArrayList h = d.h("commerce_international_shipping_countries");
        final ArrayList<String> list = new ArrayList<String>();
        for (final String next : h) {
            if (next instanceof String) {
                list.add(next);
            }
        }
        return list;
    }
    
    private static List b(final List list, final List list2) {
        final HashSet<Object> set = new HashSet<Object>();
        final HashSet<Object> set2 = new HashSet<Object>();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        final Iterator<?> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            set2.add(iterator2.next());
        }
        set.retainAll(set2);
        return new ArrayList(set);
    }
    
    private void b(final Context context) {
        this.c = new ArrayList();
        this.d = new HashMap();
        final String[] isoCountries = Locale.getISOCountries();
        final int length = isoCountries.length;
        int n = 0;
    Label_0135_Outer:
        while (true) {
            Label_0141: {
                if (n >= length) {
                    break Label_0141;
                }
                final Locale locale = new Locale("", isoCountries[n]);
                while (true) {
                    try {
                        final String country = locale.getCountry();
                        final String iso3Country = locale.getISO3Country();
                        final String trim = locale.getDisplayCountry().trim();
                        if (!this.d.containsKey(country)) {
                            final Country country2 = new Country(country, iso3Country, trim);
                            this.c.add(country2);
                            this.d.put(country2.a(), country2);
                        }
                        ++n;
                        continue Label_0135_Outer;
                        Collections.sort((List<Comparable>)this.c);
                    }
                    catch (MissingResourceException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public Country a(final String s) {
        return this.d.get(s);
    }
    
    public List a(final String[] array) {
        final ArrayList<Country> list = new ArrayList<Country>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final Country a = this.a(array[i]);
            if (a != null) {
                list.add(a);
            }
        }
        return list;
    }
    
    public List c() {
        return this.c;
    }
}
