// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;
import android.os.IBinder;

public final class zze extends zzd$zza
{
    private final Object mWrappedObject;
    
    private zze(final Object mWrappedObject) {
        this.mWrappedObject = mWrappedObject;
    }
    
    public static Object zzn(final zzd zzd) {
        try {
            if (zzd instanceof zze) {
                return ((zze)zzd).mWrappedObject;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final IBinder binder = zzd.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            final Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", ex2);
                }
                catch (IllegalArgumentException ex3) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", ex3);
                }
                catch (IllegalAccessException ex4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex4);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
    
    public static zzd zzw(final Object o) {
        return new zze(o);
    }
}
