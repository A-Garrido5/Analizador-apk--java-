// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.util;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Serializable;
import java.io.Externalizable;

public class Optional$ExternalizableOptional implements Externalizable
{
    private static final long serialVersionUID = -8360490445102657828L;
    private Serializable mValue;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mValue = (Serializable)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mValue);
    }
}
