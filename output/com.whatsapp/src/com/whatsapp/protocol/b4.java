// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.OutputStream;
import java.io.InputStream;

public interface b4
{
    InputStream a(final InputStream p0);
    
    OutputStream a(final OutputStream p0);
    
    void a(final byte[] p0, final int p1, final int p2);
    
    byte[] a();
    
    void b(final byte[] p0, final int p1, final int p2);
    
    byte[] b();
}
