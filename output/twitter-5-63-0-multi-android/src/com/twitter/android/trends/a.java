// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.android.highlights.e;
import com.twitter.library.client.k;
import com.twitter.library.util.bk;
import com.twitter.library.featureswitch.d;
import com.twitter.ui.widget.Tooltip;
import com.twitter.android.util.u;
import java.util.HashMap;
import java.util.Map;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import com.twitter.library.api.TwitterUser;

public class a
{
    private final TwitterUser a;
    private final Context b;
    private final FragmentManager c;
    private final Map d;
    
    public a(final Context b, final TwitterUser a, final FragmentManager c) {
        this.d = new HashMap();
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private u d(final String s) {
        u u = null;
        switch (s) {
            default: {
                u = null;
                break;
            }
            case "trendsplus_tooltip": {
                u = new u(this.b, "trendsplus_fatigue", 1, 0L, this.a.username);
                break;
            }
            case "highlights_tooltip": {
                u = new u(this.b, "highlights_fatigue", 1, 0L, this.a.username);
                break;
            }
        }
        if (u != null) {
            this.d.put(s, u);
        }
        return u;
    }
    
    public void a(final String s) {
        if (this.b(s)) {
            switch (s) {
                case "trendsplus_tooltip": {
                    Tooltip.a(this.b, 2131887418).b(2131493306).a(2131297967).c(1).a(this.c, "trendsplus_tooltip");
                    break;
                }
                case "highlights_tooltip": {
                    Tooltip.a(this.b, 2131887429).b(2131493306).a(2131297065).c(1).a(this.c, "highlights_tooltip");
                    break;
                }
            }
            final u c = this.c(s);
            if (c != null) {
                c.b();
            }
        }
    }
    
    boolean b(final String s) {
        switch (s) {
            default: {
                throw new IllegalArgumentException("Invalid tooltip name");
            }
            case "trendsplus_tooltip": {
                final boolean equals = "trends_plus_plus_enabled".equals(com.twitter.library.experiments.a.a(false, this.b));
                final boolean f = com.twitter.library.featureswitch.d.f("trends_plus_plus_tooltip_enabled");
                boolean b;
                if (604800000L + this.a.createdAt < bk.a()) {
                    b = true;
                }
                else {
                    b = false;
                }
                final u c = this.c(s);
                boolean b2;
                if (c == null || c.a()) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (f && equals && b && b2) {
                    break;
                }
                return false;
            }
            case "highlights_tooltip": {
                final u c2 = this.c(s);
                boolean b3;
                if (c2 == null || c2.a()) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final k k = new k(this.b, this.a.username);
                if (!b3 || !e.a(k) || !e.a(this.a.userId, k)) {
                    return false;
                }
                break;
            }
        }
        return true;
    }
    
    u c(final String s) {
        u d = this.d.get(s);
        if (d == null) {
            d = this.d(s);
        }
        return d;
    }
}
