// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.config;

public enum AppFlavor
{
    a("DEFAULT", 0, ""), 
    b("TABLET", 1, "com.twitter.android.tablet");
    
    private final String mApplicationId;
    
    private AppFlavor(final String s, final int n, final String mApplicationId) {
        this.mApplicationId = mApplicationId;
    }
    
    public String a() {
        return this.mApplicationId;
    }
}
