// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.util.Log;
import java.io.Writer;

class t extends Writer
{
    private StringBuilder a;
    
    t() {
        this.a = new StringBuilder();
    }
    
    private void a() {
        if (this.a.length() > 0) {
            Log.v("GLSurfaceView", this.a.toString());
            this.a.delete(0, this.a.length());
        }
    }
    
    @Override
    public void close() {
        this.a();
    }
    
    @Override
    public void flush() {
        this.a();
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.a.append(c);
            }
        }
    }
}
