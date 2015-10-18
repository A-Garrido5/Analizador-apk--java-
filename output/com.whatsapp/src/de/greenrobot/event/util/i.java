// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.util.Log;
import android.content.res.Resources;
import de.greenrobot.event.m;

public class i
{
    private static final String z;
    final int a;
    final int b;
    m c;
    final Resources d;
    final j e;
    Class f;
    String g;
    int h;
    boolean i;
    
    static {
        final char[] charArray = "\u000ewTtO%{\u001daV#8\u0019bL3y\u0013b\u001f2}\u0007tP5j\u0017b\u001f\t\\TaP5v\u0010'Y/jT".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '?';
                    break;
                }
                case 0: {
                    c2 = '@';
                    break;
                }
                case 1: {
                    c2 = '\u0018';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = '\u0007';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public i(final Resources d, final int b, final int a) {
        this.i = true;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = new j();
    }
    
    public int a(final Throwable t) {
        final Integer b = this.e.b(t);
        if (b != null) {
            return b;
        }
        Log.d(m.s, de.greenrobot.event.util.i.z + t);
        return this.a;
    }
    
    m a() {
        if (this.c != null) {
            return this.c;
        }
        return m.b();
    }
    
    public i a(final Class clazz, final int n) {
        this.e.a(clazz, n);
        return this;
    }
    
    public void a(final int h) {
        this.h = h;
    }
    
    public void a(final m c) {
        this.c = c;
    }
    
    public void a(final Class f) {
        this.f = f;
    }
    
    public void a(final String g) {
        this.g = g;
    }
    
    public void b() {
        this.i = false;
    }
}
