// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.api.z;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.api.TwitterUser;

public class ad
{
    private boolean a;
    private TwitterUser b;
    private FriendshipCache c;
    private final j d;
    private final List e;
    
    public ad(final Context context, final TwitterUser twitterUser, final boolean b) {
        this(context, twitterUser, b, new FriendshipCache());
    }
    
    public ad(final Context context, final TwitterUser b, final boolean a, final FriendshipCache c) {
        this.e = new ArrayList();
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = new j(context);
    }
    
    private void i() {
        for (final WeakReference<ae> weakReference : this.e) {
            if (weakReference.get() != null) {
                ((ae)weakReference.get()).a(this);
            }
        }
    }
    
    public TwitterUser a() {
        return this.b;
    }
    
    public void a(final int friendship) {
        this.b.friendship = friendship;
        this.i();
    }
    
    public void a(final ae ae) {
        final Iterator<WeakReference<ae>> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            if (ae == iterator.next().get()) {
                return;
            }
        }
        this.e.add(new WeakReference<ae>(ae));
    }
    
    public void a(final TwitterUser b, final boolean a) {
        this.b = b;
        this.a = a;
        this.i();
    }
    
    public void b(final int n) {
        this.a(z.a(this.d(), n));
    }
    
    public boolean b() {
        return this.a;
    }
    
    public FriendshipCache c() {
        return this.c;
    }
    
    public void c(final int n) {
        this.a(z.b(this.d(), n));
    }
    
    public int d() {
        return this.b.friendship;
    }
    
    public long e() {
        if (this.a() != null) {
            return this.a().a();
        }
        return 0L;
    }
    
    public String f() {
        final String a = this.d.a(this.b);
        if (a != null) {
            return a;
        }
        if (this.b != null) {
            return this.b.profileHeaderImageUrl;
        }
        return null;
    }
    
    public boolean g() {
        return this.d.a(this.b) != null;
    }
    
    public void h() {
        if (this.b != null) {
            this.d.b(this.b.username);
        }
    }
}
