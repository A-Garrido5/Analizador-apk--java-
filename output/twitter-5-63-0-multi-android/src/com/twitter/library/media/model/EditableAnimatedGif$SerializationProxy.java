// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class EditableAnimatedGif$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -438662659801197828L;
    private EditableAnimatedGif mEditableAnimatedGif;
    
    public EditableAnimatedGif$SerializationProxy() {
    }
    
    public EditableAnimatedGif$SerializationProxy(final EditableAnimatedGif mEditableAnimatedGif) {
        this.mEditableAnimatedGif = mEditableAnimatedGif;
    }
    
    private Object readResolve() {
        return this.mEditableAnimatedGif;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mEditableAnimatedGif = new EditableAnimatedGif((AnimatedGifFile)objectInput.readObject(), (String)objectInput.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mEditableAnimatedGif.mediaFile);
        objectOutput.writeObject(this.mEditableAnimatedGif.source);
    }
}
