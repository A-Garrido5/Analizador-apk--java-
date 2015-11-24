// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.HashMap;
import java.io.Externalizable;

public class Recap$Metadata implements Externalizable
{
    private static final long serialVersionUID = 4521415413009282389L;
    public String cancel;
    public String confirm;
    public String dismiss;
    public boolean display;
    public long entityId;
    public String feedback;
    public String header;
    public boolean jump;
    public String scribeComponent;
    public HashMap scribeItemExtras;
    public long tweetId;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.tweetId = objectInput.readLong();
        this.scribeComponent = (String)objectInput.readObject();
        this.scribeItemExtras = (HashMap)objectInput.readObject();
        this.header = (String)objectInput.readObject();
        this.dismiss = (String)objectInput.readObject();
        this.feedback = (String)objectInput.readObject();
        this.confirm = (String)objectInput.readObject();
        this.cancel = (String)objectInput.readObject();
        this.jump = objectInput.readBoolean();
        this.display = objectInput.readBoolean();
        this.entityId = objectInput.readLong();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.tweetId);
        objectOutput.writeObject(this.scribeComponent);
        objectOutput.writeObject(this.scribeItemExtras);
        objectOutput.writeObject(this.header);
        objectOutput.writeObject(this.dismiss);
        objectOutput.writeObject(this.feedback);
        objectOutput.writeObject(this.confirm);
        objectOutput.writeObject(this.cancel);
        objectOutput.writeBoolean(this.jump);
        objectOutput.writeBoolean(this.display);
        objectOutput.writeLong(this.entityId);
    }
}
