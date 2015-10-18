// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.util.ArrayList;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.util.Iterator;
import com.twitter.util.e;
import java.util.List;

public class TwitterTopic$TrendsPlus extends TwitterTopic$Data
{
    private static final long serialVersionUID = 5285685735142370274L;
    public int changedFields;
    public TwitterTopic$TrendsPlus$ContextInfo contextInfo;
    public TwitterTopic$TrendsPlus$DebugInfo debugInfo;
    public boolean isDegraded;
    public List mediaInfo;
    public String metaDescription;
    public int rank;
    public TwitterTopic$TrendsPlus$TargetInfo targetInfo;
    
    public TwitterTopic$TrendsPlus() {
    }
    
    public TwitterTopic$TrendsPlus(final List mediaInfo, final TwitterTopic$TrendsPlus$ContextInfo contextInfo, final TwitterTopic$TrendsPlus$TargetInfo targetInfo, final TwitterTopic$TrendsPlus$DebugInfo debugInfo, final String metaDescription, final int rank) {
        this.contextInfo = contextInfo;
        this.targetInfo = targetInfo;
        this.debugInfo = debugInfo;
        if (mediaInfo != null) {
            for (final TweetEntities tweetEntities : mediaInfo) {
                e.b(tweetEntities != null && !tweetEntities.media.c());
            }
            this.mediaInfo = mediaInfo;
        }
        this.metaDescription = metaDescription;
        this.rank = rank;
    }
    
    public static String a(final boolean b) {
        if (b) {
            return "minimal";
        }
        return "full";
    }
    
    public int a(final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus) {
        int n = 1;
        if (twitterTopic$TrendsPlus == null) {
            if (this.metaDescription == null) {
                n = 0;
            }
            if (this.contextInfo != null && this.contextInfo.velocity != null) {
                n |= 0x2;
            }
        }
        else {
            if (l.a(this.metaDescription, twitterTopic$TrendsPlus.metaDescription)) {
                n = 0;
            }
            if (this.isDegraded != twitterTopic$TrendsPlus.isDegraded) {
                n |= 0x10;
            }
            if (this.rank != twitterTopic$TrendsPlus.rank) {
                n |= 0x8;
            }
            if (this.contextInfo != null && twitterTopic$TrendsPlus.contextInfo != null) {
                if (!l.a(this.contextInfo.velocity, twitterTopic$TrendsPlus.contextInfo.velocity)) {
                    return n | 0x2;
                }
            }
            else if (this.contextInfo != null || twitterTopic$TrendsPlus.contextInfo != null) {
                TwitterTopic$TrendsPlus$ContextInfo twitterTopic$TrendsPlus$ContextInfo;
                if (this.contextInfo != null) {
                    twitterTopic$TrendsPlus$ContextInfo = this.contextInfo;
                }
                else {
                    twitterTopic$TrendsPlus$ContextInfo = twitterTopic$TrendsPlus.contextInfo;
                }
                if (twitterTopic$TrendsPlus$ContextInfo.velocity != null) {
                    return n | 0x2;
                }
            }
        }
        return n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mediaInfo = (ArrayList)objectInput.readObject();
        this.contextInfo = (TwitterTopic$TrendsPlus$ContextInfo)objectInput.readObject();
        this.targetInfo = (TwitterTopic$TrendsPlus$TargetInfo)objectInput.readObject();
        this.debugInfo = (TwitterTopic$TrendsPlus$DebugInfo)objectInput.readObject();
        this.changedFields = objectInput.readInt();
        this.metaDescription = (String)objectInput.readObject();
        this.rank = objectInput.readInt();
        this.isDegraded = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mediaInfo);
        objectOutput.writeObject(this.contextInfo);
        objectOutput.writeObject(this.targetInfo);
        objectOutput.writeObject(this.debugInfo);
        objectOutput.writeInt(this.changedFields);
        objectOutput.writeObject(this.metaDescription);
        objectOutput.writeInt(this.rank);
        objectOutput.writeBoolean(this.isDegraded);
    }
}
