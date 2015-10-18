// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

@Deprecated
public class MediaTag implements Externalizable
{
    static final long serialVersionUID = 5429693440322044067L;
    public String name;
    public String screenName;
    public long userId;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.userId = objectInput.readLong();
        this.name = (String)objectInput.readObject();
        this.screenName = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
