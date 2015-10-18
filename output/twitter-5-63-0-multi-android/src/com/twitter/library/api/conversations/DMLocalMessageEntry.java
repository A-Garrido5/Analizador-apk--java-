// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.api.TweetEntities;

public class DMLocalMessageEntry extends DMMessageEntry
{
    private static final long serialVersionUID = -1647463718954145869L;
    public int status;
    
    public DMLocalMessageEntry() {
    }
    
    public DMLocalMessageEntry(final long n, final String s, final String s2, final long n2, final long n3, final String s3, final TweetEntities tweetEntities, final BaseDMAttachment baseDMAttachment) {
        super(n, n, s, s2, n2, n3, s3, tweetEntities, baseDMAttachment, false, true, false, 1);
        this.status = 0;
    }
    
    public boolean e() {
        return !s.a(this.conversationId);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.status = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeInt(this.status);
    }
}
