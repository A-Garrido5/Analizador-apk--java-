// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.model.common.a;
import com.twitter.model.common.BuilderSerializationProxy;

class ExtendedProfile$SerializationProxy extends BuilderSerializationProxy
{
    private static final long serialVersionUID = -3883897643978267132L;
    
    public ExtendedProfile$SerializationProxy() {
        super(new x());
    }
    
    public ExtendedProfile$SerializationProxy(final ExtendedProfile extendedProfile) {
        super(extendedProfile);
    }
    
    protected void a(final ObjectInput objectInput, final x x) {
        x.a(objectInput.readLong()).a(objectInput.readInt()).b(objectInput.readInt()).c(objectInput.readInt()).b(objectInput.readLong());
    }
    
    protected void a(final ObjectOutput objectOutput, final ExtendedProfile extendedProfile) {
        objectOutput.writeLong(extendedProfile.mUserId);
        objectOutput.writeInt(extendedProfile.mBirthDay);
        objectOutput.writeInt(extendedProfile.mBirthMonth);
        objectOutput.writeInt(extendedProfile.mBirthYear);
        objectOutput.writeLong(extendedProfile.mUpdateTime);
    }
}
