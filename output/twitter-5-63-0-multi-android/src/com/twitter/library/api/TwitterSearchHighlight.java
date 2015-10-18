// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterSearchHighlight implements Externalizable
{
    private static final long serialVersionUID = -256063452514498910L;
    public long timeSince;
    public long timeUntil;
    public String type;
    
    public TwitterSearchHighlight() {
    }
    
    public TwitterSearchHighlight(final String type, final long timeSince, final long timeUntil) {
        this.type = type;
        this.timeSince = timeSince;
        this.timeUntil = timeUntil;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TwitterSearchHighlight twitterSearchHighlight = (TwitterSearchHighlight)o;
            boolean equals;
            if (this.type == null) {
                if (twitterSearchHighlight.type == null) {
                    equals = true;
                }
                else {
                    equals = false;
                }
            }
            else {
                equals = this.type.equals(twitterSearchHighlight.type);
            }
            if (!equals || this.timeSince != twitterSearchHighlight.timeSince || this.timeUntil != twitterSearchHighlight.timeUntil) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.type != null) {
            hashCode = this.type.hashCode();
        }
        else {
            hashCode = 0;
        }
        return 31 * (hashCode * 31 + (int)this.timeSince) + (int)this.timeUntil;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.type = (String)objectInput.readObject();
        this.timeSince = objectInput.readLong();
        this.timeUntil = objectInput.readLong();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.type);
        objectOutput.writeLong(this.timeSince);
        objectOutput.writeLong(this.timeUntil);
    }
}
