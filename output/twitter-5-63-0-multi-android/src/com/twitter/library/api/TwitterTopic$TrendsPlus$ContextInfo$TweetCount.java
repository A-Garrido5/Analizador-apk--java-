// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$ContextInfo$TweetCount implements Externalizable
{
    private static final long serialVersionUID = -7525411946191715443L;
    public long count;
    public int durationInMins;
    
    public TwitterTopic$TrendsPlus$ContextInfo$TweetCount() {
    }
    
    public TwitterTopic$TrendsPlus$ContextInfo$TweetCount(final int durationInMins, final long count) {
        this.durationInMins = durationInMins;
        this.count = count;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.durationInMins = objectInput.readInt();
        this.count = objectInput.readLong();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.durationInMins);
        objectOutput.writeLong(this.count);
    }
}
