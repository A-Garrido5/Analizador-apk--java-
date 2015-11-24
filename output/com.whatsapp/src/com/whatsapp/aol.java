// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Looper;
import android.text.TextUtils;

public class aol
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "2?.z+%w#jg3\"//./w4fg,6(ag5?3j&%";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "2?.z+%w/`3a5$/549af)a: f)a#)}\" 3";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static CharSequence a(final CharSequence charSequence) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                throw new IllegalArgumentException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return charSequence;
    }
    
    public static Object a(final Object o) {
        if (o == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return o;
    }
    
    public static Object a(final Object o, final String s) {
        if (o == null) {
            try {
                throw new NullPointerException(s);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return o;
    }
    
    public static void a() {
        while (true) {
            while (true) {
                try {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        final boolean b = true;
                        a(b, aol.z[0]);
                        return;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public static void a(final String s) {
        a(false, s);
    }
    
    public static void a(final boolean b, final String s) {
        if (!b) {
            try {
                if (App.aV >= 3) {
                    throw new AssertionError((Object)s);
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            Log.e(s);
        }
    }
    
    public static byte[] a(final byte[] array) {
        while (true) {
            if (array != null) {
                try {
                    if (array.length == 0) {
                        throw new IllegalArgumentException();
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return array;
            }
            continue;
        }
    }
    
    public static void b() {
        while (true) {
            while (true) {
                try {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        final boolean b = true;
                        a(b, aol.z[1]);
                        return;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
}
