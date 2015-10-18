// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.q;
import android.net.Uri;

public enum ImageFormat
{
    a("JPEG", 0, new String[] { ".jpeg", ".jpg" }), 
    b("GIF", 1, new String[] { ".gif" }), 
    c("PNG", 2, new String[] { ".png" }), 
    d("INVALID", 3, new String[0]);
    
    public final String[] extensions;
    
    private ImageFormat(final String s, final int n, final String[] extensions) {
        this.extensions = extensions;
    }
    
    public static ImageFormat a(final String s) {
        final String path = Uri.parse(s).getPath();
        for (final ImageFormat imageFormat : values()) {
            final String[] extensions = imageFormat.extensions;
            for (int length2 = extensions.length, j = 0; j < length2; ++j) {
                if (q.b(path, extensions[j])) {
                    return imageFormat;
                }
            }
        }
        return ImageFormat.d;
    }
}
