// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

public enum ai
{
    a("DEVELOPER", 0, 1), 
    b("USER_SIDELOAD", 1, 2), 
    c("TEST_DISTRIBUTION", 2, 3), 
    d("APP_STORE", 3, 4);
    
    private final int e;
    
    private ai(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ai a(final String s) {
        int n;
        if (s != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return ai.d;
        }
        return ai.a;
    }
    
    public final int a() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
