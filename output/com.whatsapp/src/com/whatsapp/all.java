// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import java.util.Locale;

public class all
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0019K\u000b9:9\u0018[";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'g';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '*';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "8P";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "4OT*\u0001;DS.\u0005'X\t1\u00023_C0\u0013!EB&H+DP\"\u000b+N\u000b/\u0006,MS\"\u0000'\n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "4OT*\u0001;DS.\u0005'X\t1\u00023_C0\u0013!EB&H+DP\"\u000b+N\u000b \b7DR1\u001eb";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0019k\u000b\u0019:9\u0018[";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0018p";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static Locale a() {
        Locale locale = App.aq.getResources().getConfiguration().locale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale;
    }
    
    public static String b() {
        String language = a().getLanguage();
        if (language == null || !Pattern.matches(all.z[0], language)) {
            Log.i(all.z[2] + language);
            language = all.z[1];
        }
        return language;
    }
    
    public static String c() {
        String country = a().getCountry();
        if (country == null || !Pattern.matches(all.z[4], country)) {
            Log.i(all.z[3] + country);
            country = all.z[5];
        }
        return country;
    }
}
