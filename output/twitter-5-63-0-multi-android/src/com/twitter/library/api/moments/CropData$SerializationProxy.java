// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import java.io.ObjectOutput;
import com.twitter.internal.android.util.Size;
import java.io.ObjectInput;
import com.twitter.model.common.ModelSerializationProxy;

class CropData$SerializationProxy extends ModelSerializationProxy
{
    private static final long serialVersionUID = 3862753400672837252L;
    
    public CropData$SerializationProxy() {
    }
    
    public CropData$SerializationProxy(final CropData cropData) {
        super(cropData);
    }
    
    protected CropData a(final ObjectInput objectInput) {
        return (CropData)new b().a(objectInput.readInt()).b(objectInput.readInt()).c(objectInput.readInt()).d(objectInput.readInt()).a((Size)objectInput.readObject()).f();
    }
    
    protected void a(final ObjectOutput objectOutput, final CropData cropData) {
        objectOutput.writeInt(cropData.x);
        objectOutput.writeInt(cropData.y);
        objectOutput.writeInt(cropData.width);
        objectOutput.writeInt(cropData.height);
        objectOutput.writeObject(cropData.contentSize);
    }
}
