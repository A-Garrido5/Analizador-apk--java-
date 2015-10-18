// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

@Deprecated
public class TweetMediaFeature implements Externalizable
{
    static final long serialVersionUID = 6441783362961660943L;
    public int h;
    public String type;
    public int w;
    public int x;
    public int y;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.x = objectInput.readInt();
        this.y = objectInput.readInt();
        this.w = objectInput.readInt();
        this.h = objectInput.readInt();
        this.type = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
