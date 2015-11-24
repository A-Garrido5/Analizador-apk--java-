// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.common;

import java.io.OptionalDataException;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public abstract class BuilderSerializationProxy implements Externalizable
{
    private final a mBuilder;
    private final Object mObject;
    
    public BuilderSerializationProxy(final a mBuilder) {
        this.mBuilder = mBuilder;
        this.mObject = null;
    }
    
    public BuilderSerializationProxy(final Object mObject) {
        this.mBuilder = null;
        this.mObject = mObject;
    }
    
    protected abstract void a(final ObjectInput p0, final a p1);
    
    protected abstract void a(final ObjectOutput p0, final Object p1);
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        Label_0017: {
            if (this.mBuilder == null) {
                break Label_0017;
            }
            try {
                this.a(objectInput, this.mBuilder);
                return;
                throw new IllegalStateException("readExternal called without a builder.");
            }
            catch (OptionalDataException ex) {}
        }
    }
    
    protected Object readResolve() {
        if (this.mBuilder != null) {
            return this.mBuilder.f();
        }
        throw new IllegalStateException("readResolve called without a builder.");
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
