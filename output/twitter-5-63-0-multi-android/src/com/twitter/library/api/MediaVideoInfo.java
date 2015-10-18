// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.util.collection.CollectionUtils;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.util.List;
import java.io.Externalizable;

public class MediaVideoInfo implements Externalizable
{
    private static final long serialVersionUID = 3295350313851190225L;
    public float aspectRatio;
    public float durationSeconds;
    public List variants;
    
    public MediaVideoInfo() {
    }
    
    public MediaVideoInfo(final float aspectRatio, final float durationSeconds, final List variants) {
        this.aspectRatio = aspectRatio;
        this.durationSeconds = durationSeconds;
        this.variants = variants;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final MediaVideoInfo mediaVideoInfo = (MediaVideoInfo)o;
            if (Float.compare(this.aspectRatio, mediaVideoInfo.aspectRatio) != 0 || Float.compare(this.durationSeconds, mediaVideoInfo.durationSeconds) != 0 || !this.variants.equals(mediaVideoInfo.variants)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * l.a(this.aspectRatio) + l.a(this.durationSeconds)) + l.a(this.variants);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.aspectRatio = objectInput.readFloat();
        this.durationSeconds = objectInput.readFloat();
        this.variants = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeFloat(this.aspectRatio);
        objectOutput.writeFloat(this.durationSeconds);
        objectOutput.writeObject(CollectionUtils.b(this.variants));
    }
}
