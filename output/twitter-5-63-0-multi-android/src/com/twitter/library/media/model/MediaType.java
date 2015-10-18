// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.collection.e;
import java.util.EnumSet;

public enum MediaType
{
    a("UNKNOWN", 0, 0, (String)null, (String)null), 
    b("IMAGE", 1, 1, "image/jpeg", "jpg"), 
    c("ANIMATED_GIF", 2, 2, "image/gif", "gif"), 
    d("VIDEO", 3, 3, "video/mp4", "mp4"), 
    e("SEGMENTED_VIDEO", 4, 1000, "directory/segments", "segments");
    
    public static final EnumSet f;
    public static final EnumSet g;
    private static final e h;
    public final String extension;
    public final String mimeType;
    public final int typeId;
    
    static {
        int j = 0;
        f = EnumSet.of(MediaType.b);
        g = EnumSet.allOf(MediaType.class);
        final MediaType[] values = values();
        final e h2 = new e(values.length);
        while (j < values.length) {
            final MediaType mediaType = values[j];
            h2.a(mediaType.typeId, mediaType);
            ++j;
        }
        h = h2;
    }
    
    private MediaType(final String s, final int n, final int typeId, final String mimeType, final String extension) {
        this.typeId = typeId;
        this.mimeType = mimeType;
        this.extension = extension;
    }
    
    public static MediaType a(final int n) {
        final MediaType mediaType = (MediaType)MediaType.h.a(n);
        if (mediaType != null) {
            return mediaType;
        }
        return MediaType.a;
    }
    
    public static MediaType a(final String s) {
        if (s.startsWith("image/")) {
            if (s.equals("image/gif")) {
                return MediaType.c;
            }
            return MediaType.b;
        }
        else {
            if (s.startsWith("video/")) {
                return MediaType.d;
            }
            if (s.startsWith("directory/")) {
                return MediaType.e;
            }
            return MediaType.a;
        }
    }
}
