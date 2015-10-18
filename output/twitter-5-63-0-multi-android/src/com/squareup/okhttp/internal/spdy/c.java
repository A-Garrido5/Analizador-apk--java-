// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.List;
import java.io.Closeable;

public interface c extends Closeable
{
    void a();
    
    void a(final int p0, final int p1, final List p2);
    
    void a(final int p0, final long p1);
    
    void a(final int p0, final ErrorCode p1);
    
    void a(final int p0, final ErrorCode p1, final byte[] p2);
    
    void a(final u p0);
    
    void a(final boolean p0, final int p1, final int p2);
    
    void a(final boolean p0, final int p1, final bq p2, final int p3);
    
    void a(final boolean p0, final boolean p1, final int p2, final int p3, final int p4, final int p5, final List p6);
    
    void b();
    
    void c();
}
