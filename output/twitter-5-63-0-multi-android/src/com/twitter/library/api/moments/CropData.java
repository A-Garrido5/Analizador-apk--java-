// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import android.graphics.Rect;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import com.twitter.internal.android.util.Size;
import java.io.Serializable;

public class CropData implements Serializable
{
    public final Size contentSize;
    public final int height;
    public final int width;
    public final int x;
    public final int y;
    
    private CropData(final b b) {
        this.x = b.a;
        this.y = b.b;
        this.width = b.c;
        this.height = b.d;
        this.contentSize = b.e;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new CropData$SerializationProxy(this);
    }
    
    public Rect a() {
        return new Rect(this.x, this.y, this.x + this.width, this.y + this.height);
    }
}
