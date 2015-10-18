// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public enum MediaEntity$Type
{
    a("UNKNOWN", 0, 0), 
    b("IMAGE", 1, 1), 
    c("ANIMATED_GIF", 2, 2), 
    d("VIDEO", 3, 3);
    
    private static final MediaEntity$Type[] e;
    public final int typeId;
    
    static {
        e = values();
    }
    
    private MediaEntity$Type(final String s, final int n, final int typeId) {
        this.typeId = typeId;
    }
    
    public static MediaEntity$Type a(final int n) {
        if (n >= 0 && n < MediaEntity$Type.e.length) {
            return MediaEntity$Type.e[n];
        }
        return MediaEntity$Type.a;
    }
}
