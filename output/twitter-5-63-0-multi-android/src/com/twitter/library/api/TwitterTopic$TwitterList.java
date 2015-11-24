// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;

public class TwitterTopic$TwitterList extends TwitterTopic$Data
{
    private static final long serialVersionUID = -7034068153153370848L;
    public int followStatus;
    public int members;
    public int mode;
    public long mostRecentTweetTimestampMillis;
    public int subscribers;
    
    public TwitterTopic$TwitterList() {
    }
    
    TwitterTopic$TwitterList(final int members, final int subscribers, final int mode, final int followStatus, final long mostRecentTweetTimestampMillis) {
        this.members = members;
        this.subscribers = subscribers;
        this.mode = mode;
        this.followStatus = followStatus;
        this.mostRecentTweetTimestampMillis = mostRecentTweetTimestampMillis;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.members = objectInput.readInt();
        this.subscribers = objectInput.readInt();
        this.mode = objectInput.readInt();
        this.followStatus = objectInput.readInt();
        this.mostRecentTweetTimestampMillis = objectInput.readLong();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.members);
        objectOutput.writeInt(this.subscribers);
        objectOutput.writeInt(this.mode);
        objectOutput.writeInt(this.followStatus);
        objectOutput.writeLong(this.mostRecentTweetTimestampMillis);
    }
}
