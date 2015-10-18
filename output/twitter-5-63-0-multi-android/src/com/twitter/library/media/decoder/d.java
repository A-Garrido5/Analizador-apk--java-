// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import com.twitter.library.media.model.MediaType;

final class d implements e
{
    @Override
    public ImageDecoder a(final MediaType mediaType) {
        if (mediaType == MediaType.d || mediaType == MediaType.e) {
            return new i();
        }
        return new a();
    }
}
