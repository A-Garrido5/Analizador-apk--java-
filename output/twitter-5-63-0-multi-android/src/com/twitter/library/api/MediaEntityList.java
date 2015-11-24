// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Collections;

public class MediaEntityList extends EntityList
{
    private static final MediaEntityList a;
    
    static {
        a = new MediaEntityList(Collections.emptyList());
    }
    
    public MediaEntityList(final List list) {
        super(list);
    }
    
    public static MediaEntityList e() {
        return MediaEntityList.a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new MediaEntityList$SerializationProxy(this);
    }
    
    public MediaEntity a(final long n) {
        for (final MediaEntity mediaEntity : this) {
            if (mediaEntity.id == n) {
                return mediaEntity;
            }
        }
        return null;
    }
    
    public boolean a(final MediaEntity$Type mediaEntity$Type) {
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().type == mediaEntity$Type) {
                return true;
            }
        }
        return false;
    }
}
