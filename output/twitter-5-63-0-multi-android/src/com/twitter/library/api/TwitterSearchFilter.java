// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterSearchFilter implements Externalizable
{
    private static final long serialVersionUID = 6856870025935576940L;
    public boolean follow;
    public boolean nearby;
    
    public TwitterSearchFilter() {
    }
    
    public TwitterSearchFilter(final boolean follow, final boolean nearby) {
        this.follow = follow;
        this.nearby = nearby;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TwitterSearchFilter twitterSearchFilter = (TwitterSearchFilter)o;
            if (this.follow != twitterSearchFilter.follow) {
                return false;
            }
            if (this.nearby != twitterSearchFilter.nearby) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        int n2;
        if (this.follow) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final int n3 = n2 * 31;
        if (!this.nearby) {
            n = 0;
        }
        return n3 + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.follow = objectInput.readBoolean();
        this.nearby = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.follow);
        objectOutput.writeBoolean(this.nearby);
    }
}
