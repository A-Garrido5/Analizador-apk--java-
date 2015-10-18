// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.api.TwitterUser;
import com.twitter.android.media.camera.VideoTooltipManager;
import com.twitter.android.util.l;
import com.twitter.android.util.u;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import java.util.HashMap;
import android.content.Context;
import com.twitter.ui.widget.Tooltip;
import java.util.Map;
import com.twitter.ui.widget.y;

public class ba implements y
{
    public static final String[] a;
    private static ba b;
    private final Map c;
    private Tooltip d;
    private Context e;
    private y f;
    private boolean g;
    
    static {
        a = new String[] { "record_video_tooltip" };
    }
    
    private ba(final Context e) {
        this.c = new HashMap();
        this.e = e;
    }
    
    public static ba a(final Context context, final FragmentManager fragmentManager, final Bundle bundle) {
        ba b;
        if (ba.b != null) {
            b = ba.b;
        }
        else {
            b = new ba(context);
        }
        if (bundle != null) {
            b.g = bundle.getBoolean("composer_tooltip_suppress_in_session");
            final String[] a = ba.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                final Tooltip d = (Tooltip)fragmentManager.findFragmentByTag(a[i]);
                if (d != null) {
                    d.a(b);
                    b.d = d;
                    break;
                }
            }
        }
        return b;
    }
    
    private Map c() {
        final Context e = this.e;
        final String e2 = az.a(e).b().e();
        if (!this.c.containsKey(e2)) {
            final HashMap<String, u> hashMap = new HashMap<String, u>();
            hashMap.put("record_video_tooltip", new u(e, "record_video_tooltip", 1, 0L, e2));
            this.c.put(e2, hashMap);
        }
        return (Map)this.c.get(e2);
    }
    
    void a(final Bundle bundle) {
        bundle.putBoolean("composer_tooltip_suppress_in_session", this.g);
    }
    
    @Override
    public void a(final Tooltip tooltip, final int n) {
        switch (n) {
            case 1: {
                tooltip.a(true);
                break;
            }
            case 2: {
                this.d = null;
                break;
            }
        }
        if (this.f != null) {
            this.f.a(tooltip, n);
        }
    }
    
    public void a(final y f) {
        this.f = f;
    }
    
    void a(final String s, final FragmentManager fragmentManager) {
        if (this.a(s)) {
            switch (s) {
                case "record_video_tooltip": {
                    this.d = Tooltip.a(this.e.getApplicationContext(), 2131886575).a(2131296444).d(2131886551).a(this).a(fragmentManager, s);
                    this.b(s);
                }
            }
        }
    }
    
    boolean a() {
        return this.d != null;
    }
    
    boolean a(final String s) {
        final TwitterUser f = az.a(this.e).b().f();
        if (!this.g && f != null && (!s.equals("record_video_tooltip") || (l.a() && !VideoTooltipManager.a(this.e.getApplicationContext())))) {
            final u u = this.c().get(s);
            return u != null && u.a();
        }
        return false;
    }
    
    void b() {
        this.g = true;
    }
    
    public void b(final String s) {
        final u u = this.c().get(s);
        if (u != null) {
            u.b();
        }
        this.b();
    }
}
