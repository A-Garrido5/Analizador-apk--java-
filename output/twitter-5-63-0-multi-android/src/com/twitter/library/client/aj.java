// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.android.ac;

public class aj
{
    private static volatile aj a;
    private final al b;
    
    private aj() {
        this.b = new al(300000L, 30000L, 3);
    }
    
    public static aj a() {
        Label_0041: {
            if (aj.a != null) {
                break Label_0041;
            }
            synchronized (aj.class) {
                if (aj.a == null) {
                    aj.a = new aj();
                    p.a().a(new ak());
                }
                return aj.a;
            }
        }
    }
    
    public al b() {
        return this.b;
    }
}
