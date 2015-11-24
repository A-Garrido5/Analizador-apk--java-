// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectStreamClass;
import java.io.InputStream;
import java.io.ObjectInputStream;

final class b extends ObjectInputStream
{
    b(final InputStream inputStream) {
        super(inputStream);
    }
    
    @Override
    protected Class resolveClass(final ObjectStreamClass objectStreamClass) {
        final long serialVersionUID = objectStreamClass.getSerialVersionUID();
        if (serialVersionUID == 3820360449367569386L) {
            return MediaEntity.class;
        }
        if (serialVersionUID == 5429693440322044067L) {
            return MediaTag.class;
        }
        if (serialVersionUID == 3295350313851190225L) {
            return MediaVideoInfo.class;
        }
        if (serialVersionUID == -1124359188841849336L) {
            return MediaVideoVariant.class;
        }
        if (serialVersionUID == 6441783362961660943L) {
            return TweetMediaFeature.class;
        }
        return super.resolveClass(objectStreamClass);
    }
}
