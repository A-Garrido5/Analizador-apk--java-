// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

@Deprecated
public class MediaVideoVariant implements Externalizable
{
    static final long serialVersionUID = -1124359188841849336L;
    public int bitrate;
    public String contentType;
    public String url;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.url = (String)objectInput.readObject();
        this.contentType = (String)objectInput.readObject();
        this.bitrate = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
