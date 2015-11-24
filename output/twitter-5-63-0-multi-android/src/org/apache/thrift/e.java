// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift;

import org.apache.thrift.transport.b;
import java.io.OutputStream;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.protocol.TBinaryProtocol$Factory;
import org.apache.thrift.protocol.d;
import org.apache.thrift.transport.a;
import java.io.ByteArrayOutputStream;

public class e
{
    private final ByteArrayOutputStream a;
    private final a b;
    private d c;
    
    public e() {
        this(new TBinaryProtocol$Factory());
    }
    
    public e(final TProtocolFactory tProtocolFactory) {
        this.a = new ByteArrayOutputStream();
        this.b = new a(this.a);
        this.c = tProtocolFactory.a(this.b);
    }
    
    public byte[] a(final TBase tBase) {
        this.a.reset();
        tBase.a(this.c);
        return this.a.toByteArray();
    }
}
