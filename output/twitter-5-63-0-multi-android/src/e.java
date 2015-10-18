import java.util.Iterator;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class e
{
    private static final Map a;
    private static final Set b;
    private static final Map c;
    private static final Map d;
    private static final Set e;
    private static final Set f;
    private static final int[] g;
    private static final int[] h;
    
    static {
        a = new HashMap();
        c = new HashMap();
        e.a.put(9, "CAR");
        e.c.put("CAR", 9);
        e.a.put(6, "PAGER");
        e.c.put("PAGER", 6);
        e.a.put(11, "ISDN");
        e.c.put("ISDN", 11);
        e.c.put("HOME", 1);
        e.c.put("WORK", 3);
        e.c.put("CELL", 2);
        e.c.put("OTHER", 7);
        e.c.put("CALLBACK", 8);
        e.c.put("COMPANY-MAIN", 10);
        e.c.put("RADIO", 14);
        e.c.put("TTY-TDD", 16);
        e.c.put("ASSISTANT", 19);
        e.c.put("VOICE", 7);
        (b = new HashSet()).add("MODEM");
        e.b.add("MSG");
        e.b.add("BBS");
        e.b.add("VIDEO");
        (d = new HashMap()).put(0, "X-AIM");
        e.d.put(1, "X-MSN");
        e.d.put(2, "X-YAHOO");
        e.d.put(3, "X-SKYPE-USERNAME");
        e.d.put(5, "X-GOOGLE-TALK");
        e.d.put(6, "X-ICQ");
        e.d.put(7, "X-JABBER");
        e.d.put(4, "X-QQ");
        e.d.put(8, "X-NETMEETING");
        e = new HashSet(Arrays.asList("MOBILE", "\u643a\u5e2f\u96fb\u8a71", "\u643a\u5e2f", "\u30b1\u30a4\u30bf\u30a4", "\uff79\uff72\uff80\uff72"));
        f = new HashSet(Arrays.asList('[', ']', '=', ':', '.', ',', ' '));
        g = new int[] { 58, 59, 44, 32 };
        h = new int[] { 59, 58 };
    }
    
    public static int a(final int n) {
        if (c.j(n)) {
            return 2;
        }
        return 1;
    }
    
    public static String a(final int n, final String s, final String s2, final String s3, final String s4, final String s5) {
        final StringBuilder sb = new StringBuilder();
        final String[] a = a(n, s, s2, s3);
        int n2 = 1;
        if (!TextUtils.isEmpty((CharSequence)s4)) {
            sb.append(s4);
            n2 = 0;
        }
        for (final String s6 : a) {
            if (!TextUtils.isEmpty((CharSequence)s6)) {
                if (n2 != 0) {
                    n2 = 0;
                }
                else {
                    sb.append(' ');
                }
                sb.append(s6);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)s5)) {
            if (n2 == 0) {
                sb.append(' ');
            }
            sb.append(s5);
        }
        return sb.toString();
    }
    
    public static String a(final Integer n) {
        return e.a.get(n);
    }
    
    private static String a(String s, final int[] array) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = "";
        }
        final StringBuilder sb = new StringBuilder();
        final int length = s.length();
        int i = 0;
        boolean b = false;
        while (i < length) {
            final int codePoint = s.codePointAt(i);
            if (codePoint >= 32 && codePoint != 34) {
                sb.appendCodePoint(codePoint);
                for (int length2 = array.length, j = 0; j < length2; ++j) {
                    if (codePoint == array[j]) {
                        b = true;
                        break;
                    }
                }
            }
            i = s.offsetByCodePoints(i, 1);
        }
        final String string = sb.toString();
        if (string.isEmpty() || d(new String[] { string })) {
            return "";
        }
        if (b) {
            return '\"' + string + '\"';
        }
        return string;
    }
    
    public static boolean a(final String s) {
        return "_AUTO_CELL".equals(s) || e.e.contains(s);
    }
    
    public static boolean a(final Collection collection) {
        if (collection == null) {
            return true;
        }
        for (final String s : collection) {
            if (!TextUtils.isEmpty((CharSequence)s) && !g.a(s)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean a(final String... array) {
        return array == null || a(Arrays.asList(array));
    }
    
    public static String[] a(final int n, final String s, final String s2, final String s3) {
        final String[] array = new String[3];
        switch (c.e(n)) {
            default: {
                array[0] = s3;
                array[1] = s2;
                array[2] = s;
                return array;
            }
            case 8: {
                if (a(new String[] { s }) && a(new String[] { s3 })) {
                    array[0] = s3;
                    array[1] = s2;
                    array[2] = s;
                    return array;
                }
                array[0] = s;
                array[1] = s2;
                array[2] = s3;
                return array;
            }
            case 4: {
                array[0] = s2;
                array[1] = s3;
                array[2] = s;
                return array;
            }
        }
    }
    
    public static String b(final int n, final String s, final String s2, final String s3) {
        return a(n, s, s2, s3, null, null);
    }
    
    public static boolean b(final String s) {
        return e.b.contains(s);
    }
    
    public static boolean b(final Collection collection) {
        if (collection == null) {
            return true;
        }
        for (final String s : collection) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                for (int length = s.length(), i = 0; i < length; i = s.offsetByCodePoints(i, 1)) {
                    final int codePoint = s.codePointAt(i);
                    if (32 > codePoint || codePoint > 126) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean b(final String... array) {
        return array == null || b(Arrays.asList(array));
    }
    
    public static boolean c(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            for (int length = s.length(), i = 0; i < length; i = s.offsetByCodePoints(i, 1)) {
                final int codePoint = s.codePointAt(i);
                if (32 > codePoint || codePoint > 126 || e.f.contains((char)codePoint)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean c(final Collection collection) {
        if (collection == null) {
            return true;
        }
        for (final String s : collection) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                for (int length = s.length(), i = 0; i < length; i = s.offsetByCodePoints(i, 1)) {
                    final int codePoint = s.codePointAt(i);
                    if ((97 > codePoint || codePoint >= 123) && (65 > codePoint || codePoint >= 91) && (48 > codePoint || codePoint >= 58) && codePoint != 45) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean c(final String... array) {
        return array == null || c(Arrays.asList(array));
    }
    
    public static String d(final String s) {
        return a(s, e.g);
    }
    
    public static boolean d(final Collection collection) {
        if (collection == null) {
            return true;
        }
        for (final String s : collection) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                for (int length = s.length(), i = 0; i < length; i = s.offsetByCodePoints(i, 1)) {
                    if (!Character.isWhitespace(s.codePointAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean d(final String... array) {
        return array == null || d(Arrays.asList(array));
    }
    
    public static String e(final String s) {
        return a(s, e.h);
    }
    
    public static String f(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; i = s.offsetByCodePoints(i, 1)) {
            final char char1 = s.charAt(i);
            final String a = a.a(char1);
            if (a != null) {
                sb.append(a);
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
}
