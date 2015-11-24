// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class EditableVideo$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 3496858402433330067L;
    private EditableVideo mEditableVideo;
    
    public EditableVideo$SerializationProxy() {
    }
    
    public EditableVideo$SerializationProxy(final EditableVideo mEditableVideo) {
        this.mEditableVideo = mEditableVideo;
    }
    
    private Object readResolve() {
        return this.mEditableVideo;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mEditableVideo = new EditableVideo((VideoFile)objectInput.readObject(), (String)objectInput.readObject());
        this.mEditableVideo.clipStart = objectInput.readInt();
        this.mEditableVideo.clipEnd = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mEditableVideo.mediaFile);
        objectOutput.writeObject(this.mEditableVideo.source);
        objectOutput.writeInt(this.mEditableVideo.clipStart);
        objectOutput.writeInt(this.mEditableVideo.clipEnd);
    }
}
