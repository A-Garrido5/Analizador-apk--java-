// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public final class bg implements bf
{
    private static bg a;
    
    public static bf b() {
        synchronized (bg.class) {
            if (bg.a == null) {
                bg.a = new bg();
            }
            return bg.a;
        }
    }
    
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}
