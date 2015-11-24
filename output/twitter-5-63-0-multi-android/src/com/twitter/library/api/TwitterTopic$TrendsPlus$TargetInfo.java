// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$TargetInfo implements Externalizable
{
    private static final long serialVersionUID = -1015209886650539760L;
    public ArrayList pinnedTweetIds;
    public String query;
    
    public TwitterTopic$TrendsPlus$TargetInfo() {
    }
    
    public TwitterTopic$TrendsPlus$TargetInfo(final String query, final ArrayList pinnedTweetIds) {
        this.query = query;
        this.pinnedTweetIds = pinnedTweetIds;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.query = (String)objectInput.readObject();
        this.pinnedTweetIds = (ArrayList)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.query);
        objectOutput.writeObject(this.pinnedTweetIds);
    }
}
