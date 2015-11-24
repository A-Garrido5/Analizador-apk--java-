// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.common;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;

public abstract class ModelSerializationProxy implements Externalizable
{
    private Object mObject;
    
    public ModelSerializationProxy() {
    }
    
    public ModelSerializationProxy(final Object mObject) {
        this.mObject = mObject;
    }
    
    protected abstract void a(final ObjectOutput p0, final Object p1);
    
    protected abstract Object b(final ObjectInput p0);
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mObject = this.b(objectInput);
    }
    
    protected Object readResolve() {
        if (this.mObject != null) {
            return this.mObject;
        }
        throw new IllegalStateException("readResolve called without an object.");
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        if (this.mObject != null) {
            this.a(objectOutput, this.mObject);
            return;
        }
        throw new IllegalStateException("writeExternal called without an object.");
    }
}
