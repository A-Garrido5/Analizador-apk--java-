// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;

public abstract class ao
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0010\u001dMA*".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Y';
                    break;
                }
                case 0: {
                    c2 = '>';
                    break;
                }
                case 1: {
                    c2 = 'r';
                    break;
                }
                case 2: {
                    c2 = '=';
                    break;
                }
                case 3: {
                    c2 = '4';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static ao a(final String s) {
        if (s.endsWith(ao.z)) {
            return new at(s);
        }
        return new a9(s);
    }
    
    public abstract void a();
    
    public abstract void a(final int p0);
    
    public abstract void a(final MediaPlayer$OnErrorListener p0);
    
    public abstract void a(final MediaPlayer$OnPreparedListener p0);
    
    public abstract void b();
    
    public abstract void b(final int p0);
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract int e();
    
    public abstract boolean f();
    
    public abstract void g();
    
    public abstract void h();
    
    public abstract int i();
}
