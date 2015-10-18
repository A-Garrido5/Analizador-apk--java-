// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.view.LayoutInflater$Factory;
import android.app.Activity;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.view.LayoutInflater;
import android.content.res.Resources;

public final class aa extends y
{
    private static final Class[] a;
    private final Resources b;
    private final LayoutInflater c;
    private final Resources$Theme d;
    
    static {
        a = new Class[] { Context.class, AttributeSet.class };
    }
    
    public aa(final Activity activity, final Resources resources, final ClassLoader classLoader, final int n) {
        super(activity);
        this.b = (Resources)com.google.android.youtube.player.internal.c.a(resources, "resources cannot be null");
        final LayoutInflater cloneInContext = ((LayoutInflater)super.getSystemService("layout_inflater")).cloneInContext((Context)this);
        cloneInContext.setFactory((LayoutInflater$Factory)new a(classLoader));
        this.c = cloneInContext;
        (this.d = resources.newTheme()).applyStyle(n, false);
    }
    
    @Override
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }
    
    @Override
    public final Context getBaseContext() {
        return super.getBaseContext();
    }
    
    @Override
    public final Resources getResources() {
        return this.b;
    }
    
    @Override
    public final Object getSystemService(final String s) {
        if ("layout_inflater".equals(s)) {
            return this.c;
        }
        return super.getSystemService(s);
    }
    
    @Override
    public final Resources$Theme getTheme() {
        return this.d;
    }
}
