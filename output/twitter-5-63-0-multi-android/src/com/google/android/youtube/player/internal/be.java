// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import java.lang.reflect.Field;
import android.os.IBinder;

public final class be extends bc
{
    private final Object a;
    
    private be(final Object a) {
        this.a = a;
    }
    
    public static bb a(final Object o) {
        return new be(o);
    }
    
    public static Object a(final bb bb) {
        if (bb instanceof be) {
            return ((be)bb).a;
        }
        final IBinder binder = bb.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            final Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (NullPointerException ex) {
                    throw new IllegalArgumentException("Binder object is null.", ex);
                }
                catch (IllegalArgumentException ex2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", ex2);
                }
                catch (IllegalAccessException ex3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex3);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
