// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.featureswitch.d;

public class bz
{
    public static int a() {
        return d.a("typeahead_user_prefetch_size", 1000);
    }
    
    public static long b() {
        return 1000L * d.a("typeahead_user_prefetch_ttl_sec", 172800);
    }
    
    public static int c() {
        return d.a("typeahead_search_max_recents", 5);
    }
    
    public static int d() {
        return d.a("typeahead_search_max_topics", 3);
    }
    
    public static int e() {
        return d.a("typeahead_search_max_users", 10);
    }
    
    public static int f() {
        return d.a("typeahead_search_max_trends", 2);
    }
    
    public static int g() {
        return d.a("typeahead_composer_max_suggestions", 20);
    }
    
    public static int h() {
        return d.a("typeahead_compose_throttle_ms", 250);
    }
}
