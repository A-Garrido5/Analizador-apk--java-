// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.res.Resources$Theme;
import android.view.LayoutInflater;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater$Factory;

final class a implements LayoutInflater$Factory
{
    private final ClassLoader a;
    
    public a(final ClassLoader classLoader) {
        this.a = (ClassLoader)c.a(classLoader, "remoteClassLoader cannot be null");
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        try {
            return (View)this.a.loadClass(s).asSubclass(View.class).getConstructor((Class<?>[])aa.a).newInstance(context, set);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
        catch (NoSuchMethodException ex2) {
            return null;
        }
        catch (IllegalArgumentException ex3) {
            return null;
        }
        catch (InstantiationException ex4) {
            return null;
        }
        catch (IllegalAccessException ex5) {
            return null;
        }
        catch (InvocationTargetException ex6) {
            return null;
        }
    }
}
