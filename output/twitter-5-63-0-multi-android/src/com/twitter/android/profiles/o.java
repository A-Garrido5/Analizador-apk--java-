// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.util.d;
import com.twitter.library.provider.bf;
import com.twitter.library.api.z;
import com.twitter.library.api.TwitterUser;

public class o extends ag
{
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    
    public o(final TwitterUser twitterUser, final int n, final boolean b, final TwitterUser twitterUser2) {
        boolean j = true;
        this.a = ah.a(b, n);
        this.b = z.e(n);
        final boolean d = z.d(n);
        this.d = (twitterUser != null && !this.b && !b && j);
        this.e = (twitterUser != null && bf.b(twitterUser.flags) && !b && j);
        this.f = (twitterUser != null && b && j);
        this.g = (twitterUser != null && !ah.a(b, twitterUser, n) && j);
        this.h = (twitterUser != null && z.b(n) && !d && j);
        this.c = z.g(n);
        this.i = (twitterUser != null && !b && j);
        if (twitterUser == null || !ah.b(twitterUser, n, b)) {
            j = false;
        }
        this.j = j;
        this.k = com.twitter.android.util.d.a(twitterUser2, b);
    }
    
    @Override
    public void a(final ToolBar toolBar) {
        boolean b = true;
        toolBar.a(2131887450).b(this.j);
        toolBar.a(2131887465).b(this.d && !this.a && b);
        toolBar.a(2131887466).b(this.g && !this.a && b);
        toolBar.a(2131887462).b(this.h && this.c && !this.a && b);
        toolBar.a(2131887463).b(this.h && !this.c && !this.a && b);
        toolBar.a(2131887468).b(this.e && this.b && b);
        toolBar.a(2131887464).b(this.f);
        final jx a = toolBar.a(2131887400);
        if (!this.e || this.b) {
            b = false;
        }
        a.b(b);
        toolBar.a(2131887469).b(this.i);
        toolBar.a(2131887470).b(this.k);
    }
}
