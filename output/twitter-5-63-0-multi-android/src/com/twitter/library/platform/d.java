// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.text.TextUtils;
import com.twitter.library.api.bp;
import com.twitter.library.api.TwitterUser;
import java.util.List;
import com.twitter.library.platform.notifications.f;

public final class d
{
    public static final c[] a;
    public int b;
    public int c;
    public String d;
    public String e;
    public long f;
    public long g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public String o;
    public int p;
    public int q;
    public String r;
    @Deprecated
    public Object s;
    public c[] t;
    public com.twitter.library.platform.notifications.d u;
    public f v;
    public List w;
    String x;
    
    static {
        a = new c[0];
    }
    
    public d() {
        this.t = com.twitter.library.platform.d.a;
    }
    
    public d a(final TwitterUser twitterUser) {
        if (twitterUser != null) {
            this.g = twitterUser.userId;
            this.h = twitterUser.username;
            this.x = twitterUser.name;
        }
        return this;
    }
    
    d a(final bp bp) {
        if (bp != null) {
            this.e = bp.b;
            this.f = bp.a;
        }
        return this;
    }
    
    public String a() {
        if (TextUtils.isEmpty((CharSequence)this.x)) {
            return "@" + this.h;
        }
        return this.x;
    }
}
