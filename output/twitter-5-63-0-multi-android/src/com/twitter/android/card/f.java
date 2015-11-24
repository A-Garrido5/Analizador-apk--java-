// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

public class f
{
    private static final e a;
    private static final e b;
    private static e c;
    private static e d;
    
    static {
        a = new af(false, true, true);
        b = new ae("cards_forward_card_cache_enabled", "cards_forward_card_type_cache_enabled", true);
    }
    
    public static e a() {
        if (f.c != null) {
            return f.c;
        }
        return f.a;
    }
    
    public static e b() {
        if (f.d != null) {
            return f.d;
        }
        return f.b;
    }
}
