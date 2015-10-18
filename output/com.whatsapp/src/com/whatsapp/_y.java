// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.OutputStream;

public class _y extends OutputStream
{
    final OutputStream a;
    final int b;
    
    public _y(final OutputStream a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void write(final int n) {
        this.a.write(n);
        atd.a(1L, this.b);
    }
    
    @Override
    public void write(@NonNull final byte[] array) {
        this.a.write(array);
        atd.a(array.length, this.b);
    }
    
    @Override
    public void write(@NonNull final byte[] array, final int n, final int n2) {
        this.a.write(array, n, n2);
        atd.a(n2, this.b);
    }
}
