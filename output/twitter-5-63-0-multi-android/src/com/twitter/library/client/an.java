// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

public class an
{
    private static volatile an a;
    private final al b;
    
    private an() {
        this.b = new al(300000L, 60000L, 10);
    }
    
    public static an a() {
        Label_0028: {
            if (an.a != null) {
                break Label_0028;
            }
            synchronized (aj.class) {
                if (an.a == null) {
                    an.a = new an();
                }
                return an.a;
            }
        }
    }
    
    public al b() {
        return this.b;
    }
}
