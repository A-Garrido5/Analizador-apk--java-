// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ThemeData implements Serializable
{
    public final int backgroundColor;
    public final int foregroundColor;
    
    public ThemeData(final int foregroundColor, final int backgroundColor) {
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new ThemeData$SerializationProxy(this);
    }
}
