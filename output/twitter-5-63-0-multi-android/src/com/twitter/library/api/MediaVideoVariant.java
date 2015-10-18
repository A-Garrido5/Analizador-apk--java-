// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.io.Externalizable;

public class MediaVideoVariant implements Externalizable
{
    private static final long serialVersionUID = -1124359188841849336L;
    public int bitrate;
    public String contentType;
    public String url;
    
    public MediaVideoVariant() {
    }
    
    public MediaVideoVariant(final String url, final String contentType, final int bitrate) {
        this.url = url;
        this.contentType = contentType;
        this.bitrate = bitrate;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final MediaVideoVariant mediaVideoVariant = (MediaVideoVariant)o;
            if (this.bitrate != mediaVideoVariant.bitrate || !this.url.equals(mediaVideoVariant.url) || !this.contentType.equals(mediaVideoVariant.contentType)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * l.a(this.url) + l.a(this.contentType)) + this.bitrate;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.url = (String)objectInput.readObject();
        this.contentType = (String)objectInput.readObject();
        this.bitrate = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.contentType);
        objectOutput.writeInt(this.bitrate);
    }
}
