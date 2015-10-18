// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class y
{
    private static String a;
    private static final Pattern b;
    private final String c;
    private final bu d;
    private final ax e;
    private final String f;
    
    static {
        y.a = "Crashlytics Android SDK/" + cl.a().f();
        b = Pattern.compile("http(s?)://[^\\/]+", 2);
    }
    
    public y(final String f, String replaceFirst, final bu d, final ax e) {
        if (replaceFirst == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (d == null) {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        this.f = f;
        if (!bd.e(this.f)) {
            replaceFirst = y.b.matcher(replaceFirst).replaceFirst(this.f);
        }
        this.c = replaceFirst;
        this.d = d;
        this.e = e;
    }
    
    protected final bw a(final Map map) {
        return this.d.a(this.e, this.c, map).a(false).a(10000).a("User-Agent", y.a).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1");
    }
    
    protected final String a() {
        return this.c;
    }
    
    protected final bw b() {
        return this.a(Collections.emptyMap());
    }
}
