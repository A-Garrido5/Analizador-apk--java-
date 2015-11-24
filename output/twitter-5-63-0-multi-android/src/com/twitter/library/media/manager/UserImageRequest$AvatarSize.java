// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

enum UserImageRequest$AvatarSize
{
    a("MINI", 0, "_mini", 24), 
    b("NORMAL", 1, "_normal", 48), 
    c("BIGGER", 2, "_bigger", 73), 
    d("X96", 3, "_x96", 96), 
    e("REASONABLY_SMALL", 4, "_reasonably_small", 128);
    
    public static final UserImageRequest$AvatarSize f;
    public final int pixelSize;
    public final String suffix;
    
    static {
        f = UserImageRequest$AvatarSize.b;
    }
    
    private UserImageRequest$AvatarSize(final String s, final int n, final String suffix, final int pixelSize) {
        this.suffix = suffix;
        this.pixelSize = pixelSize;
    }
}
