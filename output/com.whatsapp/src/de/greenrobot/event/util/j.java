// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.m;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class j
{
    private static final String z;
    public final Map a;
    
    static {
        final char[] charArray = "-@^`B\u0006L\u0017u[\u0000\u000f\u0013vA\u0010N\u0019v\u0012\u0011J\r`]\u0016]\u001dv\u0012*k^u]\u0016A\u001a3T\f]^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '2';
                    break;
                }
                case 0: {
                    c2 = 'c';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public j() {
        this.a = new HashMap();
    }
    
    public j a(final Class clazz, final int n) {
        this.a.put(clazz, n);
        return this;
    }
    
    protected Integer a(final Throwable t) {
        final int b = c.b;
        final Class<? extends Throwable> class1 = t.getClass();
        final Integer n = this.a.get(class1);
        if (n == null) {
            final Iterator<Map.Entry<Class, V>> iterator = this.a.entrySet().iterator();
            Class clazz = null;
            Integer n2 = n;
            while (iterator.hasNext()) {
                final Map.Entry<Class, V> entry = iterator.next();
                final Class clazz2 = entry.getKey();
                Integer n3;
                Class clazz3;
                if (clazz2.isAssignableFrom(class1) && (clazz == null || clazz.isAssignableFrom(clazz2))) {
                    n3 = (Integer)entry.getValue();
                    clazz3 = clazz2;
                }
                else {
                    clazz3 = clazz;
                    n3 = n2;
                }
                if (b != 0) {
                    return n3;
                }
                clazz = clazz3;
                n2 = n3;
            }
            return n2;
        }
        return n;
    }
    
    public Integer b(final Throwable t) {
        int n = 20;
        Throwable cause = t;
        do {
            final Integer a = this.a(cause);
            if (a != null) {
                return a;
            }
            cause = cause.getCause();
        } while (--n > 0 && cause != t && cause != null);
        Log.d(m.s, j.z + t);
        return null;
    }
}
