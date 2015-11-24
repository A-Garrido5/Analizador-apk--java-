// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import com.twitter.internal.android.util.Size;
import java.io.File;
import java.io.ObjectInput;
import java.io.Externalizable;

class VideoFile$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 6069472170219726439L;
    private VideoFile mVideoFile;
    
    public VideoFile$SerializationProxy() {
    }
    
    public VideoFile$SerializationProxy(final VideoFile mVideoFile) {
        this.mVideoFile = mVideoFile;
    }
    
    private Object readResolve() {
        return this.mVideoFile;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mVideoFile = new VideoFile((File)objectInput.readObject(), objectInput.readInt(), (Size)objectInput.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mVideoFile.file);
        objectOutput.writeObject(this.mVideoFile.size);
        objectOutput.writeInt(this.mVideoFile.duration);
    }
}
