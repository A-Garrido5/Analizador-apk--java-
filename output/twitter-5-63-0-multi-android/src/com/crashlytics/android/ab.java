// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.bd;
import com.crashlytics.android.internal.ar;
import android.content.Context;

final class ab
{
    private final Context a;
    private final ar b;
    
    public ab(final Context a, final ar b) {
        this.a = a;
        this.b = b;
    }
    
    private String a(final String s, final String s2) {
        final String a = bd.a(this.a, s);
        int n;
        if (a == null || a.length() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return s2;
        }
        return a;
    }
    
    public final String a() {
        return this.a("com.crashlytics.CrashSubmissionPromptTitle", this.b.a);
    }
    
    public final String b() {
        return this.a("com.crashlytics.CrashSubmissionPromptMessage", this.b.b);
    }
    
    public final String c() {
        return this.a("com.crashlytics.CrashSubmissionSendTitle", this.b.c);
    }
    
    public final String d() {
        return this.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.b.g);
    }
    
    public final String e() {
        return this.a("com.crashlytics.CrashSubmissionCancelTitle", this.b.e);
    }
}
