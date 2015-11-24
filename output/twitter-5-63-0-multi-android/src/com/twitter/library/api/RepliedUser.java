// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.text.TextUtils;
import com.twitter.library.provider.Tweet;
import java.io.Externalizable;

public class RepliedUser implements Externalizable
{
    private static final long serialVersionUID = -552657074939876108L;
    public String name;
    public String screenName;
    public long userId;
    
    public RepliedUser() {
    }
    
    public RepliedUser(final String screenName, final long userId, final String name) {
        this.screenName = screenName;
        this.userId = userId;
        this.name = name;
    }
    
    public static RepliedUser a(final MediaTag mediaTag) {
        return new RepliedUser(mediaTag.screenName, mediaTag.userId, mediaTag.name);
    }
    
    public static RepliedUser a(final MentionEntity mentionEntity) {
        return new RepliedUser(mentionEntity.screenName, mentionEntity.userId, mentionEntity.name);
    }
    
    public static RepliedUser a(final Tweet tweet) {
        return new RepliedUser(tweet.F, tweet.C, tweet.a());
    }
    
    public static RepliedUser b(final Tweet tweet) {
        return new RepliedUser(tweet.z, tweet.f, tweet.b());
    }
    
    public boolean a(final RepliedUser repliedUser) {
        return repliedUser != null && TextUtils.equals((CharSequence)this.screenName, (CharSequence)repliedUser.screenName);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a((RepliedUser)o));
    }
    
    @Override
    public int hashCode() {
        if (this.screenName == null) {
            return 0;
        }
        return this.screenName.hashCode();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.screenName = (String)objectInput.readObject();
        this.userId = objectInput.readLong();
        this.name = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.screenName);
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.name);
    }
}
