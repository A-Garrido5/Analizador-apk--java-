// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

public enum DMPaginationStatus
{
    a("AT_END", 0), 
    b("HAS_MORE", 1);
    
    private DMPaginationStatus(final String s, final int n) {
    }
    
    public static DMPaginationStatus a(final String s) {
        try {
            return valueOf(s);
        }
        catch (IllegalArgumentException ex) {
            return null;
        }
    }
}
