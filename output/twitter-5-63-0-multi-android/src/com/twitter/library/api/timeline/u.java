// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Iterator;
import java.util.Collection;
import com.twitter.library.api.bp;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import android.content.Context;

public class u extends ak
{
    private static final String a;
    private final long e;
    
    static {
        a = u.class.getName();
    }
    
    public u(final Context context, final ab ab, final long e) {
        super(context, u.a, ab);
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
    Label_0159:
        while (true) {
            Label_0196: {
                if (httpOperation.j()) {
                    final long c = this.P().c;
                    final long h = this.H();
                    final long j = this.J();
                    final ArrayList list = (ArrayList)bg.a();
                    boolean b;
                    if (h == 0L && j == 0L) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                Label_0104:
                    while (true) {
                        if (b) {
                            final Iterator<bp> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                if (this.e == iterator.next().a()) {
                                    final int n = 1;
                                    break Label_0104;
                                }
                            }
                        }
                        Label_0202: {
                            break Label_0202;
                            final int n;
                            if (n != 0 || !b) {
                                final b w = this.W();
                                final int n2 = 0 + this.V().a(list, c, 21, this.e, true, false, false, null, true, w, true).size();
                                w.a();
                                break Label_0159;
                            }
                            httpOperation.l().a = 0;
                            break Label_0196;
                        }
                        final int n = 0;
                        continue Label_0104;
                    }
                }
                break Label_0196;
                int n2 = 0;
                aa.c.putInt("new_tweet", n2);
                aa.c.putInt("scribe_item_count", n2);
                return;
            }
            final int n2 = 0;
            continue Label_0159;
        }
    }
    
    protected bg f() {
        return bg.a(3);
    }
    
    @Override
    protected f g() {
        return this.M().a(new Object[] { "conversation", "show" }).a("id", this.e).a("count", 20L);
    }
}
