// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.Context;
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import android.os.IBinder;

public final class w
{
    private static IBinder a(final Class clazz, final IBinder binder, final IBinder binder2) {
        try {
            return clazz.getConstructor(IBinder.class, IBinder.class).newInstance(binder, binder2);
        }
        catch (NoSuchMethodException ex) {
            throw new w$a("Could not find the right constructor for " + clazz.getName(), ex);
        }
        catch (InvocationTargetException ex2) {
            throw new w$a("Exception thrown by invoked constructor in " + clazz.getName(), ex2);
        }
        catch (InstantiationException ex3) {
            throw new w$a("Unable to instantiate the dynamic class " + clazz.getName(), ex3);
        }
        catch (IllegalAccessException ex4) {
            throw new w$a("Unable to call the default constructor of " + clazz.getName(), ex4);
        }
    }
    
    private static IBinder a(final ClassLoader classLoader, final String s, final IBinder binder, final IBinder binder2) {
        try {
            return a(classLoader.loadClass(s), binder, binder2);
        }
        catch (ClassNotFoundException ex) {
            throw new w$a("Unable to find dynamic class " + s, ex);
        }
    }
    
    public static i a(final Activity activity, final IBinder binder) {
        c.a(activity, "activity cannot be null");
        c.a(binder, "serviceBinder cannot be null");
        final Context b = bg.b((Context)activity);
        if (b == null) {
            throw new w$a("Could not create remote context");
        }
        return j.a(a(b.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", be.a(new aa(activity, b.getResources(), b.getClassLoader(), bg.a((Context)activity, b))).asBinder(), binder));
    }
}
