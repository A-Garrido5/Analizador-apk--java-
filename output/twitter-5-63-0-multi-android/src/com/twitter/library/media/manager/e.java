// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.Closeable;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class e implements g
{
    @Override
    public boolean a(final Object o, final OutputStream outputStream) {
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        try {
            objectOutputStream.writeObject(o);
            return true;
        }
        finally {
            yh.a(objectOutputStream);
        }
    }
}
