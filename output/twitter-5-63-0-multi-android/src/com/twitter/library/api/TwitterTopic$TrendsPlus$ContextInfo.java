// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$ContextInfo implements Externalizable
{
    private static final long serialVersionUID = -2088158504862552984L;
    public ArrayList relatedContext;
    public long trendStartMillis;
    public TwitterTopic$TrendsPlus$ContextInfo$TweetCount tweetCount;
    public TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity velocity;
    
    public TwitterTopic$TrendsPlus$ContextInfo() {
    }
    
    public TwitterTopic$TrendsPlus$ContextInfo(final ArrayList relatedContext, final long trendStartMillis, final TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity velocity, final TwitterTopic$TrendsPlus$ContextInfo$TweetCount tweetCount) {
        this.relatedContext = relatedContext;
        this.trendStartMillis = trendStartMillis;
        this.velocity = velocity;
        this.tweetCount = tweetCount;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.relatedContext = (ArrayList)objectInput.readObject();
        this.trendStartMillis = (long)objectInput.readObject();
        this.velocity = (TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity)objectInput.readObject();
        this.tweetCount = (TwitterTopic$TrendsPlus$ContextInfo$TweetCount)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.relatedContext);
        objectOutput.writeObject(this.trendStartMillis);
        objectOutput.writeObject(this.velocity);
        objectOutput.writeObject(this.tweetCount);
    }
}
