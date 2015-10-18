// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TweetMediaFeature implements Externalizable
{
    private static final long serialVersionUID = 6441783362961660943L;
    public int h;
    public String type;
    public int w;
    public int x;
    public int y;
    
    public TweetMediaFeature() {
    }
    
    public TweetMediaFeature(final int x, final int y, final int w, final int h) {
        this.type = "faces";
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
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
        objectOutput.writeInt(this.x);
        objectOutput.writeInt(this.y);
        objectOutput.writeInt(this.w);
        objectOutput.writeInt(this.h);
        objectOutput.writeObject(this.type);
    }
}
