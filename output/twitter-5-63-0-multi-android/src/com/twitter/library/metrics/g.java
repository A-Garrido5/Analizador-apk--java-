// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.net.TrafficStats;
import android.util.Log;
import android.os.Process;
import android.content.Context;

public class g extends iv
{
    private final boolean a;
    private final int b;
    private boolean c;
    private long d;
    
    public g(final Context context, final String s, final im im, final String s2, final in in, final int n, final boolean a) {
        super(context, s, im, s2, in, true, n);
        this.a = a;
        this.b = Process.myUid();
        final long a2 = this.A();
        if (a2 == -1L) {
            this.c = false;
            Log.e("NetworkUsage", "Android TrafficStats unsupported!");
            return;
        }
        this.c = true;
        if (this.d == -1L) {
            this.d = a2;
            return;
        }
        this.d = Math.min(this.d, a2);
    }
    
    private long A() {
        if (this.a) {
            long n = TrafficStats.getUidTxBytes(this.b);
            if (n != -1L) {
                return n;
            }
            n = TrafficStats.getUidTcpTxBytes(this.b) + TrafficStats.getUidUdpTxBytes(this.b);
            if (n >= 0L) {
                return n;
            }
        }
        else {
            long n = TrafficStats.getUidRxBytes(this.b);
            if (n != -1L) {
                return n;
            }
            n = TrafficStats.getUidTcpRxBytes(this.b) + TrafficStats.getUidUdpRxBytes(this.b);
            if (n >= 0L) {
                return n;
            }
        }
        return -1L;
    }
    
    public static g a(final String s, final ir ir, final im im, final int n, final boolean b) {
        ig ig = ir.a(ig.a("NetworkUsage", s));
        if (ig == null) {
            ig = ir.d(new g(ir.f(), s, im, ig.a("NetworkUsage", s), ir, n, b));
        }
        return (g)ig;
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.a(sharedPreferences$Editor);
        sharedPreferences$Editor.putLong(this.a("bytes"), this.d);
        sharedPreferences$Editor.putBoolean(this.a("trafficSupported"), this.c);
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        super.a(sharedPreferences);
        this.d = sharedPreferences.getLong(this.a("bytes"), -1L);
        this.c = sharedPreferences.getBoolean(this.a("trafficSupported"), false);
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        sharedPreferences$Editor.remove(this.a("bytes"));
    }
    
    @Override
    public Long d() {
        if (!this.c) {
            return -1L;
        }
        return this.A() - this.d;
    }
    
    @Override
    protected void e() {
        super.e();
        if (this.c) {
            this.d = this.A();
            this.q();
        }
    }
    
    public boolean f() {
        return this.c;
    }
    
    @Override
    public boolean r() {
        return this.c && this.l();
    }
}
