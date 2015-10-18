// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import com.twitter.internal.android.util.Size;
import java.io.Serializable;

public class TweetMediaFace implements Serializable
{
    public final float h;
    public final float w;
    public final float x;
    public final float y;
    
    public TweetMediaFace(final float x, final float y, final float w, final float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public TweetMediaFace(final TweetMediaFeature tweetMediaFeature, final Size size) {
        final int a = size.a();
        float x;
        if (a > 0) {
            x = tweetMediaFeature.x / a;
        }
        else {
            x = 0.0f;
        }
        this.x = x;
        float w;
        if (a > 0) {
            w = tweetMediaFeature.w / a;
        }
        else {
            w = 0.0f;
        }
        this.w = w;
        final int b = size.b();
        float y;
        if (b > 0) {
            y = tweetMediaFeature.y / b;
        }
        else {
            y = 0.0f;
        }
        this.y = y;
        float h = 0.0f;
        if (b > 0) {
            h = tweetMediaFeature.h / b;
        }
        this.h = h;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new TweetMediaFace$SerializationProxy(this);
    }
}
