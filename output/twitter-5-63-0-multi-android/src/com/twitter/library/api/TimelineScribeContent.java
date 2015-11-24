// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TimelineScribeContent implements Externalizable
{
    private static final long serialVersionUID = 9118173910167616137L;
    public int eventType;
    public String id;
    private String mImpressionId;
    private String mSource;
    private String mType;
    public String query;
    public long tweetCount;
    public int tweetProofCursor;
    
    public TimelineScribeContent() {
    }
    
    public TimelineScribeContent(final String mSource, final String mImpressionId, final String mType) {
        this.mSource = mSource;
        this.mImpressionId = mImpressionId;
        this.mType = mType;
    }
    
    public String a() {
        return this.mSource;
    }
    
    public String b() {
        return this.mImpressionId;
    }
    
    public String c() {
        return this.mType;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mSource = (String)objectInput.readObject();
        this.mImpressionId = (String)objectInput.readObject();
        this.mType = (String)objectInput.readObject();
        this.id = (String)objectInput.readObject();
        this.tweetProofCursor = objectInput.readInt();
        this.eventType = objectInput.readInt();
        this.query = (String)objectInput.readObject();
        this.tweetCount = objectInput.readLong();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mSource);
        objectOutput.writeObject(this.mImpressionId);
        objectOutput.writeObject(this.mType);
        objectOutput.writeObject(this.id);
        objectOutput.writeInt(this.tweetProofCursor);
        objectOutput.writeInt(this.eventType);
        objectOutput.writeObject(this.query);
        objectOutput.writeLong(this.tweetCount);
    }
}
