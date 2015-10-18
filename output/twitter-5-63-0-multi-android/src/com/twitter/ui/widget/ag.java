// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import java.util.HashMap;
import android.util.SparseArray;
import java.util.Map;
import android.content.Context;
import android.graphics.Typeface;

public class ag
{
    private static ag g;
    public final Typeface a;
    public final Typeface b;
    public final Typeface c;
    public final Typeface d;
    public final Typeface e;
    public final boolean f;
    private final Context h;
    private final Map i;
    private final SparseArray j;
    
    private ag(final Context context) {
        this.h = context.getApplicationContext();
        this.i = new HashMap();
        this.j = new SparseArray();
        final Resources resources = context.getResources();
        this.f = (resources.getDisplayMetrics().densityDpi >= 320 || resources.getConfiguration().smallestScreenWidthDp >= 600);
        this.a = this.a("fonts/light.ttf", 0);
        this.b = this.a("fonts/lightItalic.ttf", 2);
        this.c = this.a("fonts/bold.ttf", 1);
        this.d = this.a("fonts/boldItalic.ttf", 3);
        Typeface e;
        if (this.f) {
            e = this.a;
        }
        else {
            e = Typeface.SERIF;
        }
        this.e = e;
    }
    
    public static ag a(final Context context) {
        synchronized (ag.class) {
            if (ag.g == null) {
                ag.g = new ag(context);
            }
            return ag.g;
        }
    }
    
    private Typeface c(final int n) {
        Typeface typeface = (Typeface)this.j.get(n);
        if (typeface == null) {
            switch (n) {
                default: {
                    typeface = Typeface.create(Typeface.DEFAULT, n);
                    break;
                }
                case 0: {
                    typeface = Typeface.DEFAULT;
                    break;
                }
                case 1: {
                    typeface = Typeface.DEFAULT_BOLD;
                    break;
                }
                case 3: {
                    typeface = Typeface.create(Typeface.DEFAULT_BOLD, n);
                    break;
                }
            }
            this.j.put(n, (Object)typeface);
        }
        return typeface;
    }
    
    public Typeface a(final int n) {
        if ((n & 0x1) != 0x0 && (n & 0x2) != 0x0) {
            return this.d;
        }
        if ((n & 0x1) != 0x0) {
            return this.c;
        }
        if ((n & 0x2) != 0x0) {
            return this.b;
        }
        return this.a;
    }
    
    public Typeface a(final String s, final int n) {
        if (this.f) {
            if (!this.i.containsKey(s)) {
                this.i.put(s, Typeface.createFromAsset(this.h.getAssets(), s));
            }
            return this.i.get(s);
        }
        return this.c(n);
    }
    
    public Typeface b(final int n) {
        switch (n) {
            default: {
                return this.a;
            }
            case 3: {
                return this.d;
            }
            case 1: {
                return this.c;
            }
            case 2: {
                return this.b;
            }
        }
    }
}
