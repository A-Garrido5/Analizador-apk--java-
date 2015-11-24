// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.util;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class Size$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 2344626313801010644L;
    private Size mSize;
    
    public Size$SerializationProxy() {
    }
    
    public Size$SerializationProxy(final Size mSize) {
        this.mSize = mSize;
    }
    
    private Object readResolve() {
        return this.mSize;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mSize = Size.a(objectInput.readInt(), objectInput.readInt());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.mSize.a());
        objectOutput.writeInt(this.mSize.b());
    }
}
