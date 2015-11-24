// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.br;
import android.graphics.Bitmap;
import java.io.File;
import android.content.ContentResolver;
import android.net.Uri;

public class aq implements bj
{
    private static final String z;
    private final Uri a;
    private long b;
    private final ContentResolver c;
    private long d;
    private final aa e;
    
    static {
        final char[] charArray = "f\u0013\fm}?P".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = 'z';
                    break;
                }
                case 2: {
                    c2 = 'h';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public aq(final aa e, final ContentResolver c, final String s, final long b, final long d) {
        this.e = e;
        this.c = c;
        this.a = Uri.fromFile(new File(s));
        this.b = b;
        this.d = d;
    }
    
    @Override
    public Bitmap a(final int n) {
        return this.a(n, 2 * (n * n));
    }
    
    public Bitmap a(final int n, final int n2) {
        return br.b(this.b());
    }
    
    @Override
    public Uri a() {
        return this.a;
    }
    
    @Override
    public String b() {
        return this.a.getPath();
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public long d() {
        return this.d;
    }
    
    @Override
    public String e() {
        return aq.z;
    }
}
