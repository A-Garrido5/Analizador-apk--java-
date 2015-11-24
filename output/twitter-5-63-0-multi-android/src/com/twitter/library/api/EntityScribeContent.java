// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.HashMap;

public class EntityScribeContent extends TimelineScribeContent
{
    private static final long serialVersionUID = -2832901239847208472L;
    public String scribeComponent;
    public HashMap scribeItemExtras;
    
    public EntityScribeContent() {
    }
    
    public EntityScribeContent(final String scribeComponent, final HashMap scribeItemExtras) {
        this.tweetCount = -1L;
        this.eventType = -1;
        this.scribeComponent = scribeComponent;
        this.scribeItemExtras = scribeItemExtras;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.scribeComponent = (String)objectInput.readObject();
        this.scribeItemExtras = (HashMap)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.scribeComponent);
        objectOutput.writeObject(this.scribeItemExtras);
    }
}
