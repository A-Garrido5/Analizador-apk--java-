// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class EditableSegmentedVideo$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -8316430463197754811L;
    private EditableSegmentedVideo mEditableSegmentedVideo;
    
    public EditableSegmentedVideo$SerializationProxy() {
    }
    
    public EditableSegmentedVideo$SerializationProxy(final EditableSegmentedVideo mEditableSegmentedVideo) {
        this.mEditableSegmentedVideo = mEditableSegmentedVideo;
    }
    
    private Object readResolve() {
        return this.mEditableSegmentedVideo;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mEditableSegmentedVideo = new EditableSegmentedVideo((SegmentedVideoFile)objectInput.readObject(), (String)objectInput.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mEditableSegmentedVideo.mediaFile);
        objectOutput.writeObject(this.mEditableSegmentedVideo.source);
    }
}
