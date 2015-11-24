// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum MediaUploadDetails$MediaType
{
    a("UNKNOWN", 0, 0), 
    b("IMAGE", 1, 1), 
    c("VIDEO", 2, 2), 
    d("ANIMATED_GIF", 3, 3);
    
    private static final SparseArray e;
    private final int mValue;
    
    static {
        int i = 0;
        e = new SparseArray();
        for (MediaUploadDetails$MediaType[] values = values(); i < values.length; ++i) {
            final MediaUploadDetails$MediaType mediaUploadDetails$MediaType = values[i];
            MediaUploadDetails$MediaType.e.put(mediaUploadDetails$MediaType.a(), (Object)mediaUploadDetails$MediaType);
        }
    }
    
    private MediaUploadDetails$MediaType(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static MediaUploadDetails$MediaType a(final int n) {
        return (MediaUploadDetails$MediaType)MediaUploadDetails$MediaType.e.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
