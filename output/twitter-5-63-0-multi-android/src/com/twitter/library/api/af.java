// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.util.Iterator;
import java.util.Collections;
import com.twitter.util.k;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import java.util.ArrayList;
import com.twitter.internal.android.util.Size;

public class af extends ca
{
    long c;
    long d;
    String e;
    MediaEntity$Type f;
    Size g;
    ArrayList h;
    List i;
    MediaVideoInfo j;
    List k;
    
    public af() {
        this.f = MediaEntity$Type.a;
        this.g = Size.a;
    }
    
    public af(final MediaEntity mediaEntity) {
        super(mediaEntity);
        this.f = MediaEntity$Type.a;
        this.g = Size.a;
        this.c = mediaEntity.id;
        this.d = mediaEntity.sourceTweetId;
        this.e = mediaEntity.mediaUrl;
        this.f = mediaEntity.type;
        this.g = mediaEntity.size;
        this.h = mediaEntity.mLegacyFaces;
        this.i = mediaEntity.mFaces;
        this.j = mediaEntity.videoInfo;
        this.k = mediaEntity.tags;
    }
    
    public af a(final long c) {
        this.c = c;
        return this;
    }
    
    public af a(final Size g) {
        this.g = g;
        return this;
    }
    
    public af a(final MediaEntity$Type f) {
        this.f = f;
        return this;
    }
    
    public af a(final MediaVideoInfo j) {
        this.j = j;
        return this;
    }
    
    public af a(final String e) {
        this.e = e;
        return this;
    }
    
    public af a(final ArrayList h) {
        this.h = h;
        return this;
    }
    
    public af a(final List k) {
        this.k = k;
        return this;
    }
    
    public af b(final long d) {
        this.d = d;
        return this;
    }
    
    protected MediaEntity c() {
        return new MediaEntity(this);
    }
}
