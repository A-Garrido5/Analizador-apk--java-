// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.List;
import java.io.Externalizable;

@Deprecated
public class MediaVideoInfo implements Externalizable
{
    static final long serialVersionUID = 3295350313851190225L;
    public float aspectRatio;
    public float durationSeconds;
    public List variants;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.aspectRatio = objectInput.readFloat();
        this.durationSeconds = objectInput.readFloat();
        this.variants = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
