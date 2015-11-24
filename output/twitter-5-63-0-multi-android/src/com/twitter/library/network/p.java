// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.io.Closeable;
import java.io.OutputStream;
import java.io.InputStream;
import android.content.Context;
import android.net.Uri;

public class p implements n
{
    private final Uri a;
    private final Context b;
    
    public p(final Context b, final Uri a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public InputStream a() {
        return this.b.getContentResolver().openInputStream(this.a);
    }
    
    @Override
    public void a(final OutputStream outputStream) {
        final InputStream openInputStream = this.b.getContentResolver().openInputStream(this.a);
        yh.a(openInputStream, outputStream, 4096);
        yh.a((Closeable)openInputStream);
    }
}
