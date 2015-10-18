// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public final class CardUser implements Externalizable
{
    private static final long serialVersionUID = 3114522240827968025L;
    public String fullName;
    public String profileImageUrl;
    public String screenName;
    public long userId;
    public boolean verified;
    
    public CardUser() {
    }
    
    public CardUser(final long userId, final String screenName, final String fullName, final String profileImageUrl, final boolean verified) {
        this.userId = userId;
        this.screenName = screenName;
        this.fullName = fullName;
        this.profileImageUrl = profileImageUrl;
        this.verified = verified;
    }
    
    public CardUser(final TwitterUser twitterUser) {
        this(twitterUser.userId, twitterUser.username, twitterUser.name, twitterUser.profileImageUrl, twitterUser.verified);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.userId == ((CardUser)o).userId);
    }
    
    @Override
    public int hashCode() {
        return (int)(this.userId ^ this.userId >>> 32);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.userId = objectInput.readLong();
        this.screenName = (String)objectInput.readObject();
        this.fullName = (String)objectInput.readObject();
        this.profileImageUrl = (String)objectInput.readObject();
        this.verified = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.screenName);
        objectOutput.writeObject(this.fullName);
        objectOutput.writeObject(this.profileImageUrl);
        objectOutput.writeBoolean(this.verified);
    }
}
