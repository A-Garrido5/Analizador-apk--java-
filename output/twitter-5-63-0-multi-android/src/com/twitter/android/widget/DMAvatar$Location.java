// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

enum DMAvatar$Location
{
    a("RIGHT", 0, new int[] { 11 }), 
    b("LEFT", 1, new int[] { 9 }), 
    c("TOP_LEFT", 2, new int[] { 10, 9 }), 
    d("BOTTOM_LEFT", 3, new int[] { 12, 9 });
    
    public final int[] layoutRules;
    
    private DMAvatar$Location(final String s, final int n, final int... layoutRules) {
        this.layoutRules = layoutRules;
    }
    
    int a(final int n) {
        if (this == DMAvatar$Location.a) {
            return n;
        }
        return 0;
    }
    
    boolean a() {
        return this == DMAvatar$Location.a || this == DMAvatar$Location.b;
    }
    
    int b(final int n) {
        if (this == DMAvatar$Location.a) {
            return n;
        }
        return 0;
    }
    
    int c(final int n) {
        if (this == DMAvatar$Location.b || this == DMAvatar$Location.c) {
            return n;
        }
        return 0;
    }
    
    int d(final int n) {
        if (this == DMAvatar$Location.b || this == DMAvatar$Location.d) {
            return n;
        }
        return 0;
    }
}
