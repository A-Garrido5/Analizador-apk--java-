// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import com.twitter.internal.android.util.Size;
import java.io.File;
import java.io.ObjectInput;
import java.io.Externalizable;

class ImageFile$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -43936705225171357L;
    private ImageFile mImageFile;
    
    public ImageFile$SerializationProxy() {
    }
    
    public ImageFile$SerializationProxy(final ImageFile mImageFile) {
        this.mImageFile = mImageFile;
    }
    
    private Object readResolve() {
        return this.mImageFile;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mImageFile = new ImageFile((File)objectInput.readObject(), (Size)objectInput.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mImageFile.file);
        objectOutput.writeObject(this.mImageFile.size);
    }
}
