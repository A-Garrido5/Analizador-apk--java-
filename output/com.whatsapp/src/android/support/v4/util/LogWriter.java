// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.util.Log;
import java.io.Writer;

public class LogWriter extends Writer
{
    private StringBuilder mBuilder;
    private final String mTag;
    
    public LogWriter(final String mTag) {
        this.mBuilder = new StringBuilder(128);
        this.mTag = mTag;
    }
    
    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            Log.d(this.mTag, this.mBuilder.toString());
            this.mBuilder.delete(0, this.mBuilder.length());
        }
    }
    
    @Override
    public void close() {
        this.flushBuilder();
    }
    
    @Override
    public void flush() {
        this.flushBuilder();
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        final int a = LruCache.a;
        int i = 0;
        while (i < n2) {
            final char c = array[n + i];
            Label_0048: {
                if (c == '\n') {
                    this.flushBuilder();
                    if (a == 0) {
                        break Label_0048;
                    }
                }
                this.mBuilder.append(c);
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
    }
}
