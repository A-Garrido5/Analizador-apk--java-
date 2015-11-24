// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum MediaUploadDetails$MediaSourceType
{
    a("UNKNOWN", 0, 0), 
    b("CAPTURE", 1, 1), 
    c("IMPORT", 2, 2);
    
    private static final SparseArray d;
    private final int mValue;
    
    static {
        int i = 0;
        d = new SparseArray();
        for (MediaUploadDetails$MediaSourceType[] values = values(); i < values.length; ++i) {
            final MediaUploadDetails$MediaSourceType mediaUploadDetails$MediaSourceType = values[i];
            MediaUploadDetails$MediaSourceType.d.put(mediaUploadDetails$MediaSourceType.a(), (Object)mediaUploadDetails$MediaSourceType);
        }
    }
    
    private MediaUploadDetails$MediaSourceType(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static MediaUploadDetails$MediaSourceType a(final int n) {
        return (MediaUploadDetails$MediaSourceType)MediaUploadDetails$MediaSourceType.d.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
