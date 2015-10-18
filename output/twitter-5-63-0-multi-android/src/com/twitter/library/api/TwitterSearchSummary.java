// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import android.util.SparseArray;
import java.util.HashMap;
import java.io.Externalizable;

public class TwitterSearchSummary implements Externalizable
{
    private static final HashMap a;
    private static final SparseArray b;
    private static final long serialVersionUID = -2609686999919462904L;
    public String query;
    public String title;
    public ArrayList tweets;
    public int type;
    
    static {
        (a = new HashMap(4)).put("acronym_expansion", 0);
        TwitterSearchSummary.a.put("twitterism", 1);
        TwitterSearchSummary.a.put("tweets", 2);
        TwitterSearchSummary.a.put("leaderboard", 3);
        (b = new SparseArray(4)).put(0, (Object)"acronym_expansion");
        TwitterSearchSummary.b.put(1, (Object)"twitterism");
        TwitterSearchSummary.b.put(2, (Object)"tweet_list_glance");
        TwitterSearchSummary.b.put(3, (Object)"tweet_list_popular");
    }
    
    public TwitterSearchSummary() {
    }
    
    public TwitterSearchSummary(final int type, final String query, final String title, final ArrayList tweets) {
        this.type = type;
        this.query = query;
        this.title = title;
        this.tweets = tweets;
    }
    
    public static int a(final String s) {
        if (TwitterSearchSummary.a.containsKey(s)) {
            return TwitterSearchSummary.a.get(s);
        }
        return -1;
    }
    
    public String a() {
        final String s = (String)TwitterSearchSummary.b.get(this.type);
        if (s != null) {
            return s;
        }
        return "invalid";
    }
    
    public boolean b() {
        return this.type == 2 || this.type == 3;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TwitterSearchSummary twitterSearchSummary = (TwitterSearchSummary)o;
            if (this.type != twitterSearchSummary.type) {
                return false;
            }
            Label_0072: {
                if (this.query != null) {
                    if (this.query.equals(twitterSearchSummary.query)) {
                        break Label_0072;
                    }
                }
                else if (twitterSearchSummary.query == null) {
                    break Label_0072;
                }
                return false;
            }
            Label_0102: {
                if (this.title != null) {
                    if (this.title.equals(twitterSearchSummary.title)) {
                        break Label_0102;
                    }
                }
                else if (twitterSearchSummary.title == null) {
                    break Label_0102;
                }
                return false;
            }
            if (this.tweets != null) {
                if (this.tweets.equals(twitterSearchSummary.tweets)) {
                    return true;
                }
            }
            else if (twitterSearchSummary.tweets == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.type;
        int hashCode;
        if (this.query != null) {
            hashCode = this.query.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.title != null) {
            hashCode2 = this.title.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        final ArrayList tweets = this.tweets;
        int hashCode3 = 0;
        if (tweets != null) {
            hashCode3 = this.tweets.hashCode();
        }
        return n3 + hashCode3;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.type = objectInput.readInt();
        this.query = (String)objectInput.readObject();
        this.title = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.type);
        objectOutput.writeObject(this.query);
        objectOutput.writeObject(this.title);
    }
}
