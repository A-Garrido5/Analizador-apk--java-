// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;

public final class v
{
    public static final Set a;
    
    static {
        a = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    }
    
    public static boolean a(final String s) {
        return s.equals("POST") || s.equals("PUT") || s.equals("PATCH");
    }
}
