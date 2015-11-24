// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.io.Flushable;
import java.io.Closeable;

public abstract class z extends ac
{
    private final Closeable a;
    private final boolean b;
    
    protected z(final Closeable a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void a() {
        if (this.a instanceof Flushable) {
            ((Flushable)this.a).flush();
        }
        Label_0039: {
            if (!this.b) {
                break Label_0039;
            }
            try {
                this.a.close();
                return;
                this.a.close();
            }
            catch (IOException ex) {}
        }
    }
}
