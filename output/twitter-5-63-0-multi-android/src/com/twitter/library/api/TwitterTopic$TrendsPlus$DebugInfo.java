// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$DebugInfo implements Externalizable
{
    private static final long serialVersionUID = -4330841523842069353L;
    public String debugString;
    public boolean shouldIgnore;
    
    public TwitterTopic$TrendsPlus$DebugInfo() {
    }
    
    public TwitterTopic$TrendsPlus$DebugInfo(final String debugString, final boolean shouldIgnore) {
        this.debugString = debugString;
        this.shouldIgnore = shouldIgnore;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.debugString = (String)objectInput.readObject();
        this.shouldIgnore = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.debugString);
        objectOutput.writeBoolean(this.shouldIgnore);
    }
}
