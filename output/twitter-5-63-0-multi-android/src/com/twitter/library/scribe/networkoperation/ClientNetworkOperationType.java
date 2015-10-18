// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkOperationType
{
    a("FAVORITE", 0, 1), 
    b("UNFAVORITE", 1, 2), 
    c("TWEET", 2, 3), 
    d("RETWEET", 3, 4), 
    e("FOLLOW", 4, 5), 
    f("UNFOLLOW", 5, 6), 
    g("FOLLOW_PEOPLE", 6, 7), 
    h("UNFOLLOW_PEOPLE", 7, 8), 
    i("DIRECT_MESSAGE", 8, 9), 
    j("SIGNUP", 9, 10), 
    k("LOGIN", 10, 11), 
    l("VERIFY_CREDENTIALS", 11, 12), 
    m("SUGGEST_SCREEN_NAMES", 12, 13), 
    n("PHONE_EMAIL_AVAILABILITY_CHECK", 13, 14), 
    o("TIMELINE_PULL_TO_REFRESH", 14, 15), 
    p("LOAD_IMAGE", 15, 16), 
    q("LOAD_TWEET_DETAILS", 16, 17), 
    r("LOAD_PROFILE_DETAILS", 17, 18), 
    s("UNSEGMENTED_MEDIA_UPLOAD", 18, 19), 
    t("SEGMENTED_MEDIA_UPLOAD", 19, 20);
    
    private static final SparseArray u;
    private final int mValue;
    
    static {
        int n2 = 0;
        u = new SparseArray();
        for (ClientNetworkOperationType[] values = values(); n2 < values.length; ++n2) {
            final ClientNetworkOperationType clientNetworkOperationType = values[n2];
            ClientNetworkOperationType.u.put(clientNetworkOperationType.a(), (Object)clientNetworkOperationType);
        }
    }
    
    private ClientNetworkOperationType(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkOperationType a(final int n) {
        return (ClientNetworkOperationType)ClientNetworkOperationType.u.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
