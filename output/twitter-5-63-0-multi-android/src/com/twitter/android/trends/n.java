// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.api.UserSettings;
import com.twitter.library.client.Session;
import com.twitter.library.util.bo;
import android.content.res.Resources;

public class n
{
    private final float a;
    private final float b;
    private final float c;
    private final Resources d;
    
    public n(final Resources resources) {
        this(resources, bo.a);
    }
    
    public n(final Resources d, final float a) {
        this.d = d;
        this.a = a;
        this.b = a + d.getDimensionPixelSize(2131558960);
        this.c = a + d.getDimensionPixelSize(2131558959);
    }
    
    public static boolean a(final Session session) {
        final boolean d = session.d();
        boolean b = false;
        if (d) {
            final UserSettings j = session.j();
            b = false;
            if (j != null) {
                final boolean s = j.s;
                b = false;
                if (!s) {
                    b = true;
                }
            }
        }
        return b;
    }
    
    public float a() {
        return this.a;
    }
    
    public int a(final boolean b) {
        final int orientation = this.d.getConfiguration().orientation;
        final int widthPixels = this.d.getDisplayMetrics().widthPixels;
        final int dimensionPixelSize = this.d.getDimensionPixelSize(2131558952);
        if (orientation == 2 && !b && widthPixels > dimensionPixelSize) {
            return (widthPixels - dimensionPixelSize) / 2;
        }
        return 0;
    }
    
    public float b() {
        return this.b;
    }
    
    public float c() {
        return this.c;
    }
}
