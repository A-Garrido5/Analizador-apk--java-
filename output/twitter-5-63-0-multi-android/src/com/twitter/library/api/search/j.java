// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.Iterator;
import com.twitter.library.api.bp;
import java.util.ArrayList;

public class j
{
    public final ArrayList a;
    public final String b;
    public final String c;
    private ArrayList d;
    
    public j(final ArrayList a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ArrayList a() {
        Label_0077: {
            final ArrayList<bp> d;
            synchronized (this) {
                if (this.d != null) {
                    break Label_0077;
                }
                d = new ArrayList<bp>();
                for (final b b : this.a) {
                    if (b.a == 1) {
                        d.add(b.b);
                    }
                }
            }
            this.d = d;
        }
        // monitorexit(this)
        return this.d;
    }
}
