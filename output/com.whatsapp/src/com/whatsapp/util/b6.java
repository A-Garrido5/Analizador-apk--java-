// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.format.Time;
import com.whatsapp.App;
import java.util.GregorianCalendar;
import java.util.Calendar;
import android.text.format.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.whatsapp.alm;
import android.content.Context;

public class b6
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "12:R-bs";
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
                        c2 = 'L';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "12:R-1";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "9\bDb<j\u0012vN$p.=c09tAb<j\u0012vN$p.G\u0015k8z0Gg9\bDb<j\u0012vN$p.=c09tAb<j\u0012vN$p.G\u0015k8z0";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "t ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "t ";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "h*cG\u0001\\7~";
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
    
    public static CharSequence a(final Context context, final long n, final boolean b) {
        final int c = c(System.currentTimeMillis(), n);
        if (b) {
            return context.getString(2131231959);
        }
        if (c == 0) {
            return context.getString(2131231962, new Object[] { c(context, n) });
        }
        if (c == 1) {
            return context.getString(2131231963, new Object[] { c(context, n) });
        }
        if (a(System.currentTimeMillis(), n)) {
            final String s = i(context, n);
            if (!Log.l) {
                return context.getString(2131231961, new Object[] { s + alm.a() + " " + c(context, n) });
            }
        }
        final String s = j(context, n);
        return context.getString(2131231961, new Object[] { s + alm.a() + " " + c(context, n) });
    }
    
    public static String a() {
        return new SimpleDateFormat(b6.z[5], Locale.US).format(new Date());
    }
    
    public static String a(final Context context, final long n) {
        return DateFormat.getDateFormat(context).format(new Date(n));
    }
    
    private static String a(String replace, final long timeInMillis) {
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(timeInMillis);
        if (instance.get(10) == 1) {
            replace = replace.replace(b6.z[0], b6.z[1]);
        }
        return replace;
    }
    
    public static java.text.DateFormat a(final Context context) {
        final SimpleDateFormat simpleDateFormat = (SimpleDateFormat)DateFormat.getLongDateFormat(context);
        simpleDateFormat.applyPattern(simpleDateFormat.toPattern().replaceAll(b6.z[2], ""));
        return simpleDateFormat;
    }
    
    public static boolean a(final long n) {
        return c(System.currentTimeMillis(), n) == 0;
    }
    
    public static boolean a(final long timeInMillis, final long timeInMillis2) {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(timeInMillis);
        final GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(timeInMillis2);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1);
    }
    
    public static CharSequence b(final Context context, final long n) {
        final boolean l = Log.l;
        final int c = c(System.currentTimeMillis(), n);
        if (c == 0) {
            final int n2 = (int)((System.currentTimeMillis() - n) / 60000L);
            String s = null;
            Label_0103: {
                if (n2 < 1) {
                    s = context.getString(2131231262);
                    if (!l) {
                        break Label_0103;
                    }
                }
                if (n2 < 60) {
                    s = String.format(App.C.a(2131296279, n2), n2);
                    if (!l) {
                        break Label_0103;
                    }
                }
                s = context.getString(2131231855);
            }
            if (!l) {
                return s + alm.a() + " " + c(context, n);
            }
        }
        if (c == 1) {
            final String s = context.getString(2131231978);
            if (!l) {
                return s + alm.a() + " " + c(context, n);
            }
        }
        if (a(System.currentTimeMillis(), n)) {
            final String s = i(context, n);
            if (!l) {
                return s + alm.a() + " " + c(context, n);
            }
        }
        String s = j(context, n);
        return s + alm.a() + " " + c(context, n);
    }
    
    public static boolean b(final long timeInMillis, final long timeInMillis2) {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(timeInMillis);
        final GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(timeInMillis2);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5);
    }
    
    public static int c(final long n, final long n2) {
        final Time time = new Time();
        time.set(n);
        final int n3 = (int)((n + 1000L * time.gmtoff) / 86400000L);
        time.set(n2);
        return n3 - (int)((n2 + 1000L * time.gmtoff) / 86400000L);
    }
    
    public static String c(final Context context, final long n) {
        return DateFormat.getTimeFormat(context).format(new Date(n));
    }
    
    public static String d(final Context context, final long n) {
        final boolean l = Log.l;
        final int c = c(System.currentTimeMillis(), n);
        String s = null;
        Label_0107: {
            if (c == 0) {
                s = context.getString(2131231856, new Object[] { c(context, n) });
                if (!l) {
                    break Label_0107;
                }
            }
            if (c == 1) {
                s = context.getString(2131231979, new Object[] { c(context, n) });
                if (!l) {
                    break Label_0107;
                }
            }
            if (c <= 30) {
                s = j(context, n);
                if (!l) {
                    break Label_0107;
                }
            }
            s = a(context, n);
        }
        if (b6.z[3].equals(Locale.getDefault().getLanguage())) {
            s = a(s, n);
        }
        return s;
    }
    
    public static String e(final Context context, final long n) {
        final boolean l = Log.l;
        final int c = c(System.currentTimeMillis(), n);
        String s = null;
        Label_0107: {
            if (c == 0) {
                s = context.getString(2131231856, new Object[] { c(context, n) });
                if (!l) {
                    break Label_0107;
                }
            }
            if (c == 1) {
                s = context.getString(2131231979, new Object[] { c(context, n) });
                if (!l) {
                    break Label_0107;
                }
            }
            if (c <= 30) {
                s = j(context, n);
                if (!l) {
                    break Label_0107;
                }
            }
            s = a(context, n);
        }
        if (b6.z[4].equals(Locale.getDefault().getLanguage())) {
            s = a(s, n);
        }
        return s;
    }
    
    public static String f(final Context context, final long n) {
        final int c = c(System.currentTimeMillis(), n);
        if (c == 0) {
            return context.getString(2131231855, new Object[] { c(context, n) });
        }
        if (c == 1) {
            return context.getString(2131231978, new Object[] { c(context, n) });
        }
        return DateFormat.getLongDateFormat(context).format(new Date(n));
    }
    
    public static String g(final Context context, final long n) {
        return java.text.DateFormat.getDateInstance().format(new Date(n));
    }
    
    public static String h(final Context context, final long n) {
        return c(context, n);
    }
    
    public static String i(final Context context, final long n) {
        return a(context).format(new Date(n));
    }
    
    public static String j(final Context context, final long n) {
        return a(context, n) + alm.a() + " " + c(context, n);
    }
    
    public static String k(final Context context, final long n) {
        final int c = c(System.currentTimeMillis(), n);
        if (c == 0) {
            return c(context, n);
        }
        if (c == 1) {
            return context.getString(2131231978);
        }
        return a(context, n);
    }
    
    public static String l(final Context context, final long n) {
        if (a(n)) {
            return c(context, n);
        }
        return b(context, n).toString();
    }
    
    public static String m(final Context context, final long n) {
        return j(context, n);
    }
    
    public static String n(final Context context, final long n) {
        final long n2 = n / 3600000L;
        long n3 = (n - 3600000L * n2) / 60000L;
        if (n2 == 0L) {
            if (n3 == 0L) {
                n3 = 1L;
            }
            return String.format(App.C.a(2131296278, (int)n3), (int)n3);
        }
        if (n3 == 0L) {
            return String.format(App.C.a(2131296273, (int)n2), (int)n2);
        }
        return context.getString(2131231235, new Object[] { String.format(App.C.a(2131296273, (int)n2), (int)n2), String.format(App.C.a(2131296278, (int)n3), (int)n3) });
    }
}
