// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.text.TextUtils;
import android.annotation.TargetApi;
import com.twitter.library.util.bk;
import java.util.concurrent.TimeUnit;
import android.net.wifi.ScanResult;
import android.os.Build$VERSION;
import com.twitter.internal.util.Optional;

public class m
{
    private static final boolean a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final Optional f;
    
    static {
        a = (Build$VERSION.SDK_INT >= 17);
    }
    
    public m(final String b, final String c, final int d, final int e, final Optional f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @TargetApi(17)
    public static m a(final ScanResult scanResult) {
        Optional optional;
        if (m.a) {
            optional = Optional.a(bk.a(scanResult.timestamp, TimeUnit.MICROSECONDS));
        }
        else {
            optional = Optional.a();
        }
        return new m(scanResult.SSID, scanResult.BSSID, scanResult.level, scanResult.frequency, optional);
    }
    
    public String a() {
        return this.c;
    }
    
    public int b() {
        return this.d;
    }
    
    public int c() {
        return this.e;
    }
    
    public Optional d() {
        return this.f;
    }
    
    public boolean e() {
        final String b = this.b;
        return TextUtils.isEmpty((CharSequence)b) || b.toLowerCase().endsWith("_nomap");
    }
}
