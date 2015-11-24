// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import com.twitter.internal.android.util.Size;
import java.io.File;
import java.io.ObjectInput;
import java.io.Externalizable;

class AnimatedGifFile$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 6446199009249531834L;
    private AnimatedGifFile mAnimatedGifFile;
    
    public AnimatedGifFile$SerializationProxy() {
    }
    
    public AnimatedGifFile$SerializationProxy(final AnimatedGifFile mAnimatedGifFile) {
        this.mAnimatedGifFile = mAnimatedGifFile;
    }
    
    private Object readResolve() {
        return this.mAnimatedGifFile;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mAnimatedGifFile = new AnimatedGifFile((File)objectInput.readObject(), (Size)objectInput.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mAnimatedGifFile.file);
        objectOutput.writeObject(this.mAnimatedGifFile.size);
    }
}
