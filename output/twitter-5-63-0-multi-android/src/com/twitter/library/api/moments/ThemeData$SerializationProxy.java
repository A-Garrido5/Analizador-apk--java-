// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.model.common.ModelSerializationProxy;

class ThemeData$SerializationProxy extends ModelSerializationProxy
{
    private static final long serialVersionUID = 834729592855949L;
    
    public ThemeData$SerializationProxy() {
    }
    
    public ThemeData$SerializationProxy(final ThemeData themeData) {
        super(themeData);
    }
    
    protected ThemeData a(final ObjectInput objectInput) {
        return new ThemeData(objectInput.readInt(), objectInput.readInt());
    }
    
    protected void a(final ObjectOutput objectOutput, final ThemeData themeData) {
        objectOutput.writeInt(themeData.foregroundColor);
        objectOutput.writeInt(themeData.backgroundColor);
    }
}
