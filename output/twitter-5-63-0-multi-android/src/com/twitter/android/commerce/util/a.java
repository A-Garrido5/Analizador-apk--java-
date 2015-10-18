// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.twitter.library.commerce.model.CreditCard$Type;
import java.util.ArrayList;
import com.twitter.util.q;
import java.util.Date;
import java.util.Calendar;
import android.content.Context;
import com.twitter.library.commerce.model.CreditCard;

public class a
{
    public static String a(final CreditCard creditCard, final Context context) {
        int n = 0;
        switch (b.a[creditCard.a().ordinal()]) {
            default: {
                return "";
            }
            case 4: {
                n = 2131296501;
                break;
            }
            case 1: {
                n = 2131296508;
                break;
            }
            case 2: {
                n = 2131296505;
                break;
            }
            case 3: {
                n = 2131296503;
                break;
            }
            case 5: {
                n = 2131296502;
                break;
            }
            case 6: {
                n = 2131296504;
                break;
            }
        }
        return context.getResources().getString(n, new Object[] { creditCard.b() });
    }
    
    public static String a(final String s) {
        final int length = s.length();
        if (length >= 27) {
            return s;
        }
        final int n = 27 - length;
        final StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; ++i) {
            sb.append(" ");
        }
        return sb.toString();
    }
    
    public static Date a(final Calendar calendar) {
        a(calendar, 5);
        a(calendar, 11);
        a(calendar, 12);
        a(calendar, 13);
        a(calendar, 14);
        return calendar.getTime();
    }
    
    private static void a(final Calendar calendar, final int n) {
        calendar.set(n, calendar.getMinimum(n));
    }
    
    public static String b(final String s) {
        final String b = q.b(s);
        int length = b.length();
        if (length <= 4) {
            return b;
        }
        final ArrayList<String> list = new ArrayList<String>();
        final int[] array = { 0, 0, 0 };
        switch (com.twitter.android.commerce.util.b.a[CreditCard$Type.e(b).ordinal()]) {
            default: {
                return s;
            }
            case 1:
            case 2:
            case 3: {
                list.add(" ");
                array[0] = 4;
                list.add(" ");
                array[1] = 4;
                list.add(" ");
                array[2] = 4;
                break;
            }
            case 4: {
                list.add(" ");
                array[0] = 6;
                list.add(" ");
                array[1] = 5;
                list.add("");
                array[2] = 0;
                break;
            }
            case 5: {
                list.add(" ");
                array[0] = 6;
                list.add(" ");
                array[1] = 4;
                list.add("");
                array[2] = 0;
                break;
            }
            case 6: {
                if (e(s)) {
                    list.add(" ");
                    array[0] = 4;
                    list.add(" ");
                    array[1] = 4;
                    list.add("");
                    array[2] = 3;
                    break;
                }
                list.add(" ");
                array[0] = 4;
                list.add(" ");
                array[1] = 4;
                list.add(" ");
                array[2] = 4;
                break;
            }
        }
        final String substring = b.substring(0, 4);
        int n;
        if (4 + array[0] > length) {
            n = length;
        }
        else {
            n = 4 + array[0];
        }
        final String substring2 = b.substring(4, n);
        int n2;
        if (n + array[1] > length) {
            n2 = length;
        }
        else {
            n2 = n + array[1];
        }
        final String substring3 = b.substring(n, n2);
        if (n2 + array[2] <= length) {
            length = n2 + array[2];
        }
        return String.format("%s%s%s%s%s%s%s", substring, list.get(0), substring2, list.get(1), substring3, list.get(2), b.substring(n2, length)).trim();
    }
    
    public static int c(final String s) {
        int n = 19;
        switch (b.a[CreditCard$Type.e(s).ordinal()]) {
            default: {
                n = 20;
                return n;
            }
            case 1:
            case 2:
            case 3: {
                return n;
            }
            case 4: {
                return 17;
            }
            case 5: {
                return 16;
            }
            case 6: {
                if (e(s)) {
                    return 18;
                }
                return n;
            }
        }
    }
    
    public static String d(String string) {
        try {
            Label_0182: {
                switch (string.length()) {
                    default: {
                        if (string.length() > 5) {
                            return string.substring(0, 5);
                        }
                        break;
                    }
                    case 1: {
                        if (Integer.parseInt(string) >= 2) {
                            return "0" + string + "/";
                        }
                        break;
                    }
                    case 2: {
                        final int int1 = Integer.parseInt(string);
                        if (int1 > 12 || int1 < 1) {
                            return string.substring(0, 1);
                        }
                        return string + "/";
                    }
                    case 3: {
                        if (!string.substring(2, 3).equalsIgnoreCase("/")) {
                            string = string.substring(0, 2) + "/" + string.substring(2, 3);
                            break Label_0182;
                        }
                        break;
                    }
                    case 4: {
                        if (Integer.parseInt(string.substring(3, 4)) < Integer.parseInt(String.valueOf(Calendar.getInstance().get(1)).substring(2, 3))) {
                            return string.substring(0, 3);
                        }
                        break;
                    }
                    case 5: {
                        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                        simpleDateFormat.setLenient(false);
                        if (simpleDateFormat.parse(string).before(a(Calendar.getInstance()))) {
                            return string.substring(0, 4);
                        }
                        break;
                    }
                }
            }
        }
        catch (ParseException ex) {
            string = "";
        }
        return string;
    }
    
    private static boolean e(final String s) {
        return s.startsWith("2131") || s.startsWith("1800") || s.startsWith("2100");
    }
}
