// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.io.Externalizable;

public class MediaTag implements Externalizable
{
    private static final long serialVersionUID = 5429693440322044067L;
    public String name;
    public String screenName;
    public long userId;
    
    public MediaTag() {
    }
    
    public MediaTag(final long userId, final String s, final String screenName) {
        this.userId = userId;
        this.name = s.trim();
        this.screenName = screenName;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof MediaTag && ((MediaTag)o).userId == this.userId;
    }
    
    @Override
    public int hashCode() {
        return l.a(this.userId);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.userId = objectInput.readLong();
        this.name = (String)objectInput.readObject();
        this.screenName = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.screenName);
    }
}
