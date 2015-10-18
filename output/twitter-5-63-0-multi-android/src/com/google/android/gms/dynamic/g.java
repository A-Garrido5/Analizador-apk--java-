// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.ap;
import android.content.Context;

public abstract class g
{
    private final String a;
    private Object b;
    
    protected g(final String a) {
        this.a = a;
    }
    
    protected final Object a(final Context context) {
        Label_0060: {
            if (this.b != null) {
                break Label_0060;
            }
            ap.a(context);
            final Context c = e.c(context);
            if (c == null) {
                throw new g$a("Could not get remote context.");
            }
            final ClassLoader classLoader = c.getClassLoader();
            try {
                this.b = this.a((IBinder)classLoader.loadClass(this.a).newInstance());
                return this.b;
            }
            catch (ClassNotFoundException ex) {
                throw new g$a("Could not load creator class.", ex);
            }
            catch (InstantiationException ex2) {
                throw new g$a("Could not instantiate creator.", ex2);
            }
            catch (IllegalAccessException ex3) {
                throw new g$a("Could not access creator.", ex3);
            }
        }
    }
    
    protected abstract Object a(final IBinder p0);
}
