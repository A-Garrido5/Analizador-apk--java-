// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import android.content.ContentResolver;

public class e extends d
{
    private long d;
    
    public e(final aa aa, final ContentResolver contentResolver, final String s, final long d) {
        super(aa, contentResolver, Uri.fromFile(new File(s)));
        this.d = d;
    }
    
    @Override
    public Bitmap a(final int n) {
        return super.a(n);
    }
    
    @Override
    public Bitmap a(final int n, final int n2) {
        return super.a(n, n2);
    }
    
    @Override
    public Uri a() {
        return super.a();
    }
    
    @Override
    public String b() {
        return super.b();
    }
    
    @Override
    public long c() {
        return this.d;
    }
    
    @Override
    public long d() {
        return super.d();
    }
    
    @Override
    public String e() {
        return super.e();
    }
}
