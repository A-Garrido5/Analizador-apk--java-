// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import java.io.File;
import android.net.Uri;
import android.content.ContentResolver;

public class ag implements bj
{
    private static final String z;
    private final aa a;
    private long b;
    private long c;
    private final ContentResolver d;
    private final Uri e;
    
    static {
        final char[] charArray = "K.U^\b\u0005q".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'g';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = '1';
                    break;
                }
                case 3: {
                    c2 = '7';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ag(final aa a, final ContentResolver d, final String s, final long c, final long b) {
        this.a = a;
        this.d = d;
        this.e = Uri.fromFile(new File(s));
        this.c = c;
        this.b = b;
    }
    
    @Override
    public Bitmap a(final int n) {
        return this.a(0, 0);
    }
    
    public Bitmap a(final int n, final int n2) {
        return null;
    }
    
    @Override
    public Uri a() {
        return this.e;
    }
    
    @Override
    public String b() {
        return this.e.getPath();
    }
    
    @Override
    public long c() {
        return this.c;
    }
    
    @Override
    public long d() {
        return this.b;
    }
    
    @Override
    public String e() {
        return ag.z;
    }
}
