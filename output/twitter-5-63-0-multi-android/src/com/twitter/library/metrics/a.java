// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.app.Activity;
import android.os.SystemClock;
import com.twitter.library.client.ad;
import android.content.Context;
import com.twitter.library.client.af;

public class a extends ic implements af
{
    private int a;
    private long b;
    
    public a(final Context context, final String s, final im im, final String s2, final in in, final int n) {
        super(context, s, im, s2, in, n);
        this.p = "ActiveNetwork";
        ad.a().a(this);
    }
    
    public static a a(final ir ir, final im im, final int n) {
        ig ig = ir.a(ig.a("ActiveNetwork", "api:active:::rxbytes"));
        if (ig == null) {
            ig = ir.d(new a(ir.f(), "api:active:::rxbytes", im, ig.a("ActiveNetwork", "api:active:::rxbytes"), ir, n));
        }
        return (a)ig;
    }
    
    public int A() {
        if (this.b == 0L) {
            return this.a;
        }
        return (int)(this.a + SystemClock.elapsedRealtime() - this.b);
    }
    
    @Override
    public void a(final Activity activity) {
        if (this.b != 0L) {
            this.a += (int)(SystemClock.elapsedRealtime() - this.b);
        }
        this.b = 0L;
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.a(sharedPreferences$Editor);
        sharedPreferences$Editor.putInt(this.a("time_in_foregournd"), this.A());
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        super.a(sharedPreferences);
        this.a = sharedPreferences.getInt(this.a("time_in_foregournd"), 0);
    }
    
    @Override
    public void b(final Activity activity) {
        this.b = SystemClock.elapsedRealtime();
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        sharedPreferences$Editor.remove(this.a("time_in_foregournd"));
    }
    
    @Override
    protected void e() {
        super.e();
        this.a = 0;
        if (ad.a().c()) {
            this.b = SystemClock.elapsedRealtime();
            return;
        }
        this.b = 0L;
    }
    
    @Override
    public String t() {
        return String.valueOf(this.A());
    }
}
