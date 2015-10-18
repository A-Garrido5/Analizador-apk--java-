// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity implements Externalizable
{
    private static final long serialVersionUID = -6834152794362792079L;
    public String direction;
    public int magnitude;
    
    public TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity() {
    }
    
    public TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity(final String direction, final int magnitude) {
        this.direction = direction;
        this.magnitude = magnitude;
    }
    
    public int a() {
        switch (this.magnitude) {
            case 0: {
                if ("neutral".equals(this.direction)) {
                    return 0;
                }
                break;
            }
            case 1: {
                if ("up".equals(this.direction)) {
                    return 1;
                }
                if ("down".equals(this.direction)) {
                    return 3;
                }
                break;
            }
            case 2: {
                if ("up".equals(this.direction)) {
                    return 2;
                }
                if ("down".equals(this.direction)) {
                    return 4;
                }
                break;
            }
        }
        return -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity twitterTopic$TrendsPlus$ContextInfo$TrendVelocity = (TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity)o;
            if (this.magnitude != twitterTopic$TrendsPlus$ContextInfo$TrendVelocity.magnitude) {
                return false;
            }
            if (!this.direction.equals(twitterTopic$TrendsPlus$ContextInfo$TrendVelocity.direction)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (this.magnitude ^ this.magnitude >>> 32);
        int hashCode;
        if (this.direction != null) {
            hashCode = this.direction.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.direction = (String)objectInput.readObject();
        this.magnitude = (int)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.direction);
        objectOutput.writeObject(this.magnitude);
    }
}
