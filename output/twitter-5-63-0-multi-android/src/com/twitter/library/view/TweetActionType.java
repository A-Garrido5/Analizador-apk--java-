// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

public enum TweetActionType
{
    a("None", 0), 
    b("Favorite", 1), 
    c("Retweet", 2), 
    d("Reply", 3), 
    e("Follow", 4), 
    f("Delete", 5), 
    g("Share", 6), 
    h("Dismiss", 7), 
    i("GoodFeedback", 8), 
    j("BadFeedback", 9), 
    k("GotoRelated", 10), 
    l("Mute", 11), 
    m("Unmute", 12), 
    n("Block", 13), 
    o("Unblock", 14), 
    p("SharePrivately", 15), 
    q("ViewTweetAnalytics", 16), 
    r("ViewQuoteTweet", 17);
    
    private TweetActionType(final String s, final int n) {
    }
}
