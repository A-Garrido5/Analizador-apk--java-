// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.Iterator;
import com.twitter.library.util.bq;
import android.content.Context;
import java.util.Date;
import java.util.ArrayList;

public class f
{
    public final String a;
    public final int b;
    public final ArrayList c;
    public final Date d;
    public final Date e;
    
    public f(final String a, final int b, final ArrayList c, final Date d, final Date e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public String a(final Context context) {
        final int a = com.twitter.library.featureswitch.a.a(String.valueOf(bq.a(context)), this.a);
        final Iterator<g> iterator = (Iterator<g>)this.c.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final g g = iterator.next();
            n += g.b;
            if (a < n) {
                return g.a;
            }
        }
        return "unassigned";
    }
}
