// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.protocol;

import java.nio.ByteBuffer;
import org.apache.thrift.transport.b;

public abstract class d
{
    protected b e;
    
    protected d(final b e) {
        this.e = e;
    }
    
    public abstract void a();
    
    public abstract void a(final int p0);
    
    public abstract void a(final long p0);
    
    public abstract void a(final String p0);
    
    public abstract void a(final ByteBuffer p0);
    
    public abstract void a(final a p0);
    
    public abstract void a(final org.apache.thrift.protocol.b p0);
    
    public abstract void a(final c p0);
    
    public abstract void a(final e p0);
    
    public abstract void a(final short p0);
    
    public abstract void a(final boolean p0);
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void e();
}
