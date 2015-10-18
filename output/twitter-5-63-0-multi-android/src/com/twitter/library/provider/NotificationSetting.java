// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

public enum NotificationSetting
{
    a("MENTIONS", 0, "notif_mention", 2, 1, 8, 4), 
    b("RETWEETS", 1, "notif_mention", 8, 4, 256, 128), 
    c("FAVORITES", 2, "notif_mention", 32, 16, 64, 32), 
    d("FOLLOWS", 3, "notif_mention", 0, 64, 0, 16), 
    e("MESSAGES", 4, "notif_message", 0, 1, 0, 1), 
    f("LIFELINE_ALERTS", 5, "notif_lifeline_alerts", 0, 1, 0, 8192), 
    g("TWEETS", 6, "notif_tweet", 0, 1, 0, 512), 
    h("ADDRESS_BOOK", 7, "notif_mention", 0, 256, 0, 2048), 
    i("EXPERIMENTAL", 8, "notif_experimental", 0, 1, 0, 4096), 
    j("RECOMMENDATIONS", 9, "notif_recommendations", 0, 1, 0, 16384), 
    k("NEWS", 10, "notif_news", 0, 1, 0, 131072), 
    l("RETWEETED_MENTION", 11, "notif_mention", 0, 512, 0, 32768), 
    m("FAVORITED_MENTION", 12, "notif_mention", 0, 1024, 0, 65536), 
    n("VIT_NOTABLE_EVENT", 13, "notif_mention", 0, 1, 0, 262144), 
    o("FOLLOWED_VERIFIED", 14, "notif_mention", 0, 2048, 0, 524288), 
    p("OFFER_REDEMPTION", 15, "notif_offer_redemption", 0, 1, 0, 1048576), 
    q("HIGHLIGHTS", 16, "notif_highlights", 0, 1, 0, 2097152);
    
    public final int enabledFor;
    public final int enabledForAll;
    public final String settingColumn;
    public final int settingEnabled;
    public final int settingEnabledAll;
    
    private NotificationSetting(final String s, final int n, final String settingColumn, final int settingEnabledAll, final int settingEnabled, final int enabledForAll, final int enabledFor) {
        this.settingColumn = settingColumn;
        this.settingEnabledAll = settingEnabledAll;
        this.settingEnabled = settingEnabled;
        this.enabledForAll = enabledForAll;
        this.enabledFor = enabledFor;
    }
    
    private static int a(final int n, final int n2, final int n3, final int n4) {
        if (n2 == 0) {
            return n & (-1 ^ (n3 | n4));
        }
        if (n2 == 1) {
            return (n | n3) & ~n4;
        }
        return (n | n4) & ~n3;
    }
    
    public int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 1: {
                return this.enabledFor;
            }
            case 2: {
                return this.enabledForAll;
            }
        }
    }
    
    public int a(final int n, final int n2) {
        return a(n, n2, this.enabledFor, this.enabledForAll);
    }
    
    public int b(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 1: {
                return this.settingEnabled;
            }
            case 2: {
                return this.settingEnabledAll;
            }
        }
    }
    
    public int b(final int n, final int n2) {
        return a(n, n2, this.settingEnabled, this.settingEnabledAll);
    }
    
    public int c(final int n) {
        if ((n & this.settingEnabled) != 0x0) {
            return 1;
        }
        if ((n & this.settingEnabledAll) != 0x0) {
            return 2;
        }
        return 0;
    }
    
    public int d(final int n) {
        if ((n & this.settingEnabled) != 0x0) {
            return this.enabledFor;
        }
        if ((n & this.settingEnabledAll) != 0x0) {
            return this.enabledForAll;
        }
        return 0;
    }
    
    public int e(final int n) {
        if ((n & this.enabledForAll) != 0x0) {
            return this.settingEnabledAll;
        }
        if ((n & this.enabledFor) != 0x0) {
            return this.settingEnabled;
        }
        return 0;
    }
}
