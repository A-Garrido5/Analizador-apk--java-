// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Map;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.z;
import java.util.HashMap;
import java.io.Serializable;

public class FriendshipCache implements Serializable
{
    private static final long serialVersionUID = 7278868434033045713L;
    private final HashMap mCache;
    
    public FriendshipCache() {
        this.mCache = new HashMap();
    }
    
    public FriendshipCache(final int n) {
        this.mCache = new HashMap(n);
    }
    
    private void d(final long n, final int n2) {
        final Integer n3 = this.mCache.get(n);
        int intValue;
        if (n3 == null) {
            intValue = 0;
        }
        else {
            intValue = n3;
        }
        this.mCache.put(n, z.a(intValue, n2));
    }
    
    private void e(final long n, final int n2) {
        final Integer n3 = this.mCache.get(n);
        int intValue;
        if (n3 == null) {
            intValue = 0;
        }
        else {
            intValue = n3;
        }
        this.mCache.put(n, z.b(intValue, n2));
    }
    
    private boolean f(final long n, final int n2) {
        final Integer n3 = this.mCache.get(n);
        return n3 != null && (n2 & n3) != 0x0;
    }
    
    public void a(final TwitterUser twitterUser) {
        this.c(twitterUser.userId, twitterUser.friendship);
    }
    
    public void a(final Tweet tweet) {
        this.c(tweet.C, tweet.r);
    }
    
    public void a(final FriendshipCache friendshipCache) {
        this.mCache.putAll(friendshipCache.mCache);
    }
    
    public boolean a() {
        return this.mCache.isEmpty();
    }
    
    public boolean a(final long n) {
        return this.mCache.containsKey(n);
    }
    
    public boolean a(final long n, final int n2) {
        final Integer n3 = this.mCache.get(n);
        return n3 != null && n3 == n2;
    }
    
    public void b() {
        this.mCache.clear();
    }
    
    public void b(final long n) {
        this.d(n, 1);
    }
    
    public void b(final long n, final int n2) {
        this.mCache.put(n, n2);
    }
    
    public void c(final long n) {
        this.e(n, 1);
    }
    
    public void c(final long n, final int n2) {
        if (!this.a(n)) {
            this.b(n, n2);
            return;
        }
        if ((n2 & 0x80) != 0x0) {
            return;
        }
        final int intValue = this.j(n);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (intValue | 0x1);
        }
        else {
            n3 = (intValue & 0xFFFFFFFE);
        }
        this.b(n, n3 & 0xFFFFFF7F);
    }
    
    public void d(final long n) {
        this.d(n, 16);
    }
    
    public void e(final long n) {
        this.e(n, 16);
    }
    
    public void f(final long n) {
        this.d(n, 8192);
    }
    
    public void g(final long n) {
        this.e(n, 8192);
    }
    
    public void h(final long n) {
        this.d(n, 4);
    }
    
    public void i(final long n) {
        this.e(n, 4);
    }
    
    public Integer j(final long n) {
        return this.mCache.get(n);
    }
    
    public boolean k(final long n) {
        return this.f(n, 1);
    }
}
