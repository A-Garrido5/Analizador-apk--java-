// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.e;
import android.os.Build$VERSION;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.internal.ap;
import android.content.Context;

public class cv
{
    private static Context a;
    private static am b;
    
    public static am a(final Context context) {
        ap.a(context);
        if (cv.b != null) {
            return cv.b;
        }
        b(context);
        cv.b = c(context);
        try {
            cv.b.a(n.a(d(context).getResources()), 6587000);
            return cv.b;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    private static Object a(final Class clazz) {
        try {
            return clazz.newInstance();
        }
        catch (InstantiationException ex) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + clazz.getName());
        }
        catch (IllegalAccessException ex2) {
            throw new IllegalStateException("Unable to call the default constructor of " + clazz.getName());
        }
    }
    
    private static Object a(final ClassLoader classLoader, final String s) {
        try {
            return a(((ClassLoader)ap.a(classLoader)).loadClass(s));
        }
        catch (ClassNotFoundException ex) {
            throw new IllegalStateException("Unable to find dynamic class " + s);
        }
    }
    
    public static boolean a() {
        return false;
    }
    
    private static Class b() {
        try {
            if (Build$VERSION.SDK_INT < 15) {
                return Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
            }
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static void b(final Context context) {
        final int a = e.a(context);
        switch (a) {
            default: {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            case 0: {}
        }
    }
    
    private static am c(final Context context) {
        if (a()) {
            Log.i(cv.class.getSimpleName(), "Making Creator statically");
            return (am)a(b());
        }
        Log.i(cv.class.getSimpleName(), "Making Creator dynamically");
        return an.a((IBinder)a(d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }
    
    private static Context d(final Context context) {
        if (cv.a == null) {
            if (a()) {
                cv.a = context.getApplicationContext();
            }
            else {
                cv.a = e.c(context);
            }
        }
        return cv.a;
    }
}
