// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.util.Iterator;
import com.twitter.library.media.util.ag;
import java.util.Set;
import com.twitter.library.provider.Tweet;
import com.twitter.library.card.instance.CardInstanceData;
import java.io.Externalizable;

public class QuotedTweetData implements Externalizable
{
    private static final long serialVersionUID = -1378962662768019003L;
    private transient TweetClassicCard a;
    public CardInstanceData cardInstanceData;
    public long createdAt;
    public TweetEntities entities;
    public boolean isShareable;
    public boolean possiblySensitive;
    public PromotedContent promotedContent;
    public String renderedText;
    public long statusId;
    public String text;
    public String userHandle;
    public long userId;
    public String userName;
    public String userProfileImageUrl;
    
    public QuotedTweetData() {
        this.entities = TweetEntities.a;
    }
    
    public QuotedTweetData(final bp bp) {
        this.entities = TweetEntities.a;
        final bp c = bp.c();
        final TwitterUser y = c.y;
        this.statusId = c.a;
        this.userId = y.userId;
        this.userName = y.c();
        this.userHandle = y.username;
        this.text = c.b;
        this.renderedText = c.d;
        this.entities = c.c;
        this.createdAt = c.f;
        this.userProfileImageUrl = c.y.profileImageUrl;
        if (c.v != null) {
            this.cardInstanceData = c.v.cardInstanceData;
        }
        this.possiblySensitive = c.p;
        this.promotedContent = c.s;
        this.isShareable = !y.isProtected;
    }
    
    public QuotedTweetData(final Tweet tweet) {
        this.entities = TweetEntities.a;
        this.statusId = tweet.D;
        this.userId = tweet.C;
        this.userName = tweet.a();
        this.userHandle = tweet.F;
        this.text = tweet.y;
        this.renderedText = tweet.c();
        this.entities = tweet.G;
        this.createdAt = tweet.A;
        this.userProfileImageUrl = tweet.B;
        this.cardInstanceData = tweet.W();
        this.possiblySensitive = tweet.x();
        this.promotedContent = tweet.j;
        this.isShareable = !tweet.P;
    }
    
    public String a() {
        return Tweet.a(this.statusId, this.userHandle);
    }
    
    public void a(final long n, final Set set) {
        if (n != this.userId) {
            set.add(new RepliedUser(this.userHandle, this.userId, this.userName));
        }
        for (final MentionEntity mentionEntity : this.entities.mentions) {
            if (mentionEntity.userId != n) {
                set.add(RepliedUser.a(mentionEntity));
            }
        }
        final TweetClassicCard b = this.b();
        if (b != null) {
            final CardUser authorUser = b.authorUser;
            if (authorUser != null && n != authorUser.userId) {
                set.add(new RepliedUser(authorUser.screenName, authorUser.userId, authorUser.fullName));
            }
        }
        if (!this.entities.media.c()) {
            for (final MediaTag mediaTag : ag.a(this.entities.media)) {
                if (n != mediaTag.userId) {
                    set.add(RepliedUser.a(mediaTag));
                }
            }
        }
    }
    
    public boolean a(final QuotedTweetData quotedTweetData) {
        return this == quotedTweetData || (quotedTweetData != null && this.userId == quotedTweetData.userId && l.a(this.userName, quotedTweetData.userName) && l.a(this.userHandle, quotedTweetData.userHandle) && this.statusId == quotedTweetData.statusId && l.a(this.text, quotedTweetData.text) && l.a(this.renderedText, quotedTweetData.renderedText) && this.entities.a(quotedTweetData.entities) && this.createdAt == quotedTweetData.createdAt && l.a(this.userProfileImageUrl, quotedTweetData.userProfileImageUrl) && l.a(this.cardInstanceData, quotedTweetData.cardInstanceData) && this.possiblySensitive == quotedTweetData.possiblySensitive && l.a(this.promotedContent, quotedTweetData.promotedContent) && this.isShareable == quotedTweetData.isShareable);
    }
    
    public TweetClassicCard b() {
        if (this.cardInstanceData != null && this.a == null) {
            this.a = new TwitterStatusCard(this.cardInstanceData).classicCard;
        }
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && o instanceof QuotedTweetData && this.a((QuotedTweetData)o));
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * l.a(this.userId) + l.a(this.userName)) + l.a(this.userHandle)) + l.a(this.statusId)) + l.a(this.text)) + l.a(this.renderedText)) + this.entities.hashCode()) + l.a(this.createdAt)) + l.a(this.userProfileImageUrl)) + l.a(this.cardInstanceData));
        int n3;
        if (this.possiblySensitive) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (31 * (31 * (n3 + n2) + l.a(this.promotedContent)) + l.a(this.a));
        if (!this.isShareable) {
            n = 0;
        }
        return n4 + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.userId = objectInput.readLong();
        this.userName = (String)objectInput.readObject();
        this.userHandle = (String)objectInput.readObject();
        this.statusId = objectInput.readLong();
        this.text = (String)objectInput.readObject();
        this.renderedText = (String)objectInput.readObject();
        TweetEntities a = (TweetEntities)objectInput.readObject();
        Label_0168: {
            if (a == null) {
                break Label_0168;
            }
            while (true) {
                this.entities = a;
                this.createdAt = objectInput.readLong();
                this.userProfileImageUrl = (String)objectInput.readObject();
                try {
                    this.cardInstanceData = (CardInstanceData)objectInput.readObject();
                    objectInput.readObject();
                    this.possiblySensitive = objectInput.readBoolean();
                    this.promotedContent = (PromotedContent)objectInput.readObject();
                    this.isShareable = objectInput.readBoolean();
                    return;
                    a = TweetEntities.a;
                }
                catch (Exception ex) {}
            }
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.userName);
        objectOutput.writeObject(this.userHandle);
        objectOutput.writeLong(this.statusId);
        objectOutput.writeObject(this.text);
        objectOutput.writeObject(this.renderedText);
        objectOutput.writeObject(this.entities);
        objectOutput.writeLong(this.createdAt);
        objectOutput.writeObject(this.userProfileImageUrl);
        objectOutput.writeObject(this.cardInstanceData);
        objectOutput.writeObject(null);
        objectOutput.writeBoolean(this.possiblySensitive);
        objectOutput.writeObject(this.promotedContent);
        objectOutput.writeBoolean(this.isShareable);
    }
}
