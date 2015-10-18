import java.util.Iterator;
import com.twitter.library.metrics.ForegroundMetricTracker;
import com.twitter.library.metrics.ForegroundMetricTracker$BackgroundBehavior;
import com.twitter.library.featureswitch.d;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

package java.lang;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ue extends ix
{
    private final HashMap a;
    private String b;
    private String c;
    private String d;
    
    public ue() {
        super("image:wait_time", new il(com.twitter.library.featureswitch.d.a("photo_wait_time_sample_rate", 500)), null, null);
        this.a = new HashMap();
        this.b = "unknown";
        this.d = "not_loaded";
        ForegroundMetricTracker.a(this, ForegroundMetricTracker$BackgroundBehavior.a);
    }
    
    @Override
    public String a() {
        return super.a() + ":" + this.b + ":" + this.d + ":" + this.c;
    }
    
    public void b(final String s, final String s2) {
        if (s == null || s2 == null) {
            return;
        }
        this.a.put(s.replaceAll("[\\,\\=]", ""), s2.replaceAll("[\\,\\=]", ""));
    }
    
    @Override
    protected void c() {
        super.c();
        final int a = com.twitter.library.featureswitch.d.a("photo_wait_time_fling_threshold", 250);
        if ("navigate".equals(this.c) && this.t < a) {
            this.c = "fling";
        }
        if (this.b != null && !this.b.equals("profile")) {
            ir.b().a((ih)this);
        }
    }
    
    public void c(final String b) {
        if (b == null) {
            return;
        }
        this.b = b;
    }
    
    public void d(final String s) {
        if (s == null) {
            return;
        }
        this.d = s.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
    
    public void e(final String c) {
        this.c = c;
    }
    
    @Override
    protected boolean h() {
        return false;
    }
    
    @Override
    public String t() {
        final StringBuilder sb = new StringBuilder();
        for (final String s : this.a.keySet()) {
            sb.append(s).append("=").append((String)this.a.get(s)).append(",");
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.substring(0, -1 + sb.length());
    }
}
