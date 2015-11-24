// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.api.bh;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.QuotedTweetData;

public class DMTweet extends BaseDMAttachment
{
    private static final long serialVersionUID = -4383099651513220062L;
    public QuotedTweetData quotedTweetData;
    public long tweetId;
    
    public DMTweet() {
    }
    
    public DMTweet(final long tweetId, final QuotedTweetData quotedTweetData) {
        this.tweetId = tweetId;
        this.quotedTweetData = quotedTweetData;
    }
    
    public static DMTweet g(final JsonParser jsonParser) {
        DMTweet dmTweet = new DMTweet();
        dmTweet.b(jsonParser);
        if (dmTweet.quotedTweetData == null) {
            dmTweet = null;
        }
        return dmTweet;
    }
    
    @Override
    public String a() {
        return "tweet";
    }
    
    @Override
    protected void d(final JsonParser jsonParser) {
        if ("status".equals(jsonParser.e())) {
            this.quotedTweetData = new QuotedTweetData(bh.a(jsonParser, true));
            return;
        }
        super.d(jsonParser);
    }
    
    @Override
    protected void f(final JsonParser jsonParser) {
        if ("id".equals(jsonParser.e())) {
            this.tweetId = jsonParser.o();
            return;
        }
        super.f(jsonParser);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.tweetId = objectInput.readLong();
        try {
            this.quotedTweetData = (QuotedTweetData)objectInput.readObject();
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeLong(this.tweetId);
        objectOutput.writeObject(this.quotedTweetData);
    }
}
