// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import android.content.Context;

public abstract class zzg
{
    private final String zzaju;
    private Object zzajv;
    
    protected zzg(final String zzaju) {
        this.zzaju = zzaju;
    }
    
    protected final Object zzak(final Context context) {
        Label_0065: {
            if (this.zzajv != null) {
                break Label_0065;
            }
            zzu.zzu(context);
            final Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                try {
                    throw new zzg$zza("Could not get remote context.");
                }
                catch (ClassNotFoundException ex) {
                    throw ex;
                }
            }
            final ClassLoader classLoader = remoteContext.getClassLoader();
            try {
                this.zzajv = this.zzd((IBinder)classLoader.loadClass(this.zzaju).newInstance());
                return this.zzajv;
            }
            catch (ClassNotFoundException ex2) {
                throw new zzg$zza("Could not load creator class.", ex2);
            }
            catch (InstantiationException ex3) {
                throw new zzg$zza("Could not instantiate creator.", ex3);
            }
            catch (IllegalAccessException ex4) {
                throw new zzg$zza("Could not access creator.", ex4);
            }
        }
    }
    
    protected abstract Object zzd(final IBinder p0);
}
