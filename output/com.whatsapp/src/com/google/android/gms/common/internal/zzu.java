// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.text.TextUtils;
import android.os.Looper;

public final class zzu
{
    public static int a;
    
    public static void zzU(final boolean b) {
        if (!b) {
            try {
                throw new IllegalStateException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static void zzV(final boolean b) {
        if (!b) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static void zza(final boolean b, final Object o) {
        if (!b) {
            try {
                throw new IllegalStateException(String.valueOf(o));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static void zza(final boolean b, final String s, final Object[] array) {
        if (!b) {
            try {
                throw new IllegalStateException(String.format(s, array));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static Object zzb(final Object o, final Object o2) {
        if (o == null) {
            try {
                throw new NullPointerException(String.valueOf(o2));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return o;
    }
    
    public static void zzb(final boolean b, final Object o) {
        if (!b) {
            try {
                throw new IllegalArgumentException(String.valueOf(o));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static void zzb(final boolean b, final String s, final Object[] array) {
        if (!b) {
            try {
                throw new IllegalArgumentException(String.format(s, array));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public static void zzbY(final String s) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException(s);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static void zzbZ(final String s) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException(s);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static String zzcj(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new IllegalArgumentException("Given String is empty or null");
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return s;
    }
    
    public static String zzh(final String s, final Object o) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new IllegalArgumentException(String.valueOf(o));
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return s;
    }
    
    public static Object zzu(final Object o) {
        if (o == null) {
            try {
                throw new NullPointerException("null reference");
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return o;
    }
}
