// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.protocol;

import org.apache.thrift.transport.b;

public class TBinaryProtocol$Factory implements TProtocolFactory
{
    protected int readLength_;
    protected boolean strictRead_;
    protected boolean strictWrite_;
    
    public TBinaryProtocol$Factory() {
        this(false, true);
    }
    
    public TBinaryProtocol$Factory(final boolean b, final boolean b2) {
        this(b, b2, 0);
    }
    
    public TBinaryProtocol$Factory(final boolean strictRead_, final boolean strictWrite_, final int readLength_) {
        this.strictRead_ = false;
        this.strictWrite_ = true;
        this.strictRead_ = strictRead_;
        this.strictWrite_ = strictWrite_;
        this.readLength_ = readLength_;
    }
    
    @Override
    public d a(final b b) {
        final TBinaryProtocol tBinaryProtocol = new TBinaryProtocol(b, this.strictRead_, this.strictWrite_);
        if (this.readLength_ != 0) {
            tBinaryProtocol.b(this.readLength_);
        }
        return tBinaryProtocol;
    }
}
