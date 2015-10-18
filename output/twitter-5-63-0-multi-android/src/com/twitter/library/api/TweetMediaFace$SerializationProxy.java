// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class TweetMediaFace$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -7280886685476404404L;
    private float mH;
    private float mW;
    private float mX;
    private float mY;
    
    TweetMediaFace$SerializationProxy(final TweetMediaFace tweetMediaFace) {
        this.mX = tweetMediaFace.x;
        this.mY = tweetMediaFace.y;
        this.mW = tweetMediaFace.w;
        this.mH = tweetMediaFace.h;
    }
    
    private Object readResolve() {
        return new TweetMediaFace(this.mX, this.mY, this.mW, this.mH);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mX = objectInput.readFloat();
        this.mY = objectInput.readFloat();
        this.mW = objectInput.readFloat();
        this.mH = objectInput.readFloat();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeFloat(this.mX);
        objectOutput.writeFloat(this.mY);
        objectOutput.writeFloat(this.mW);
        objectOutput.writeFloat(this.mH);
    }
}
