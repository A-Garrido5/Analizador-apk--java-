// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class DiscoverStoryMetadata implements Externalizable
{
    private static final long serialVersionUID = -5693000437874210513L;
    private String mSource;
    private String mType;
    
    public DiscoverStoryMetadata() {
    }
    
    public DiscoverStoryMetadata(final String mSource, final String mType) {
        this.mSource = mSource;
        this.mType = mType;
    }
    
    public String a() {
        return this.mSource;
    }
    
    public String b() {
        return this.mType;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mSource = (String)objectInput.readObject();
        this.mType = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mSource);
        objectOutput.writeObject(this.mType);
    }
}
