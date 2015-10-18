// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$Metadata implements Externalizable
{
    private static final long serialVersionUID = -7365565875047260532L;
    public String id;
    public boolean spiking;
    public int type;
    
    public TwitterTopic$Metadata() {
    }
    
    public TwitterTopic$Metadata(final int type, final String id, final boolean spiking) {
        this.type = type;
        this.id = id;
        this.spiking = spiking;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.type = objectInput.readInt();
        this.id = (String)objectInput.readObject();
        this.spiking = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.type);
        objectOutput.writeObject(this.id);
        objectOutput.writeBoolean(this.spiking);
    }
}
