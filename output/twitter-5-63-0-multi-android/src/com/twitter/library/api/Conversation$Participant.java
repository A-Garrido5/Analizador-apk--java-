// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Conversation$Participant implements Externalizable
{
    private static final long serialVersionUID = -6217273974638003984L;
    public long id;
    public String name;
    public String profileImageUrl;
    public String username;
    
    public Conversation$Participant() {
    }
    
    public Conversation$Participant(final TwitterUser twitterUser) {
        this.id = twitterUser.userId;
        this.username = twitterUser.username;
        this.name = twitterUser.name;
        this.profileImageUrl = twitterUser.profileImageUrl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Conversation$Participant conversation$Participant = (Conversation$Participant)o;
            if (this.id != conversation$Participant.id) {
                return false;
            }
            Label_0073: {
                if (this.name != null) {
                    if (this.name.equals(conversation$Participant.name)) {
                        break Label_0073;
                    }
                }
                else if (conversation$Participant.name == null) {
                    break Label_0073;
                }
                return false;
            }
            Label_0103: {
                if (this.profileImageUrl != null) {
                    if (this.profileImageUrl.equals(conversation$Participant.profileImageUrl)) {
                        break Label_0103;
                    }
                }
                else if (conversation$Participant.profileImageUrl == null) {
                    break Label_0103;
                }
                return false;
            }
            if (this.username != null) {
                if (this.username.equals(conversation$Participant.username)) {
                    return true;
                }
            }
            else if (conversation$Participant.username == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (int)(this.id ^ this.id >>> 32);
        int hashCode;
        if (this.username != null) {
            hashCode = this.username.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.name != null) {
            hashCode2 = this.name.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        final String profileImageUrl = this.profileImageUrl;
        int hashCode3 = 0;
        if (profileImageUrl != null) {
            hashCode3 = this.profileImageUrl.hashCode();
        }
        return n3 + hashCode3;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readLong();
        this.username = (String)objectInput.readObject();
        this.name = (String)objectInput.readObject();
        this.profileImageUrl = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.id);
        objectOutput.writeObject(this.username);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.profileImageUrl);
    }
}
