// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import de.greenrobot.event.m;

public class h
{
    private static final String z;
    private final Object a;
    private final m b;
    private final Executor c;
    private final Constructor d;
    
    static {
        final char[] charArray = "\n\t?a+>\rvh()\u0006\"-= \t%~~!\u001d%y~$\t h~-H5b0?\u001c$x=8\u0007$-)%\u001c>-1\"\rv}?>\t;h*)\u001avb8l\u001c/};l<>\u007f1;\t4a;".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = 'L';
                    break;
                }
                case 1: {
                    c2 = 'h';
                    break;
                }
                case 2: {
                    c2 = 'V';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private h(final Executor c, final m b, final Class clazz, final Object a) {
        this.c = c;
        this.b = b;
        this.a = a;
        try {
            this.d = clazz.getConstructor(Throwable.class);
        }
        catch (NoSuchMethodException ex) {
            throw new RuntimeException(h.z, ex);
        }
    }
    
    h(final Executor executor, final m m, final Class clazz, final Object o, final f f) {
        this(executor, m, clazz, o);
    }
    
    static m a(final h h) {
        return h.b;
    }
    
    public static a a() {
        return new a(null);
    }
    
    public static h b() {
        return new a(null).a();
    }
    
    static Constructor b(final h h) {
        return h.d;
    }
    
    static Object c(final h h) {
        return h.a;
    }
    
    public void a(final b b) {
        this.c.execute(new f(this, b));
    }
}
