// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.util.f;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class Conversation$Metadata implements Externalizable
{
    private static final long serialVersionUID = -1289743381817685593L;
    public Conversation$Participant[] participants;
    public int participantsCount;
    public int targetCount;
    public long targetTweetId;
    
    public Conversation$Metadata() {
    }
    
    public Conversation$Metadata(final long targetTweetId, final int targetCount, final Conversation$Participant[] participants, final int participantsCount) {
        this.targetTweetId = targetTweetId;
        this.targetCount = targetCount;
        this.participants = participants;
        this.participantsCount = participantsCount;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Conversation$Metadata conversation$Metadata = (Conversation$Metadata)o;
            if (this.participantsCount != conversation$Metadata.participantsCount) {
                return false;
            }
            if (this.targetCount != conversation$Metadata.targetCount) {
                return false;
            }
            if (this.targetTweetId != conversation$Metadata.targetTweetId) {
                return false;
            }
            if (!Arrays.equals(this.participants, conversation$Metadata.participants)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (int)(this.targetTweetId ^ this.targetTweetId >>> 32);
        int hashCode;
        if (this.participants != null) {
            hashCode = Arrays.hashCode(this.participants);
        }
        else {
            hashCode = 0;
        }
        return 31 * (31 * (hashCode + n) + this.participantsCount) + this.targetCount;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.targetTweetId = objectInput.readLong();
        this.targetCount = objectInput.readInt();
        this.participantsCount = objectInput.readInt();
        final int int1 = objectInput.readInt();
        if (int1 > 0) {
            this.participants = new Conversation$Participant[int1];
            for (int i = 0; i < int1; ++i) {
                this.participants[i] = (Conversation$Participant)objectInput.readObject();
            }
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.targetTweetId);
        objectOutput.writeInt(this.targetCount);
        objectOutput.writeInt(this.participantsCount);
        f.a(this.participants, objectOutput);
    }
}
