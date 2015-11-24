// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import com.whatsapp.util.ay;

class t4 extends ay
{
    final aar b;
    
    t4(final aar b, final File file) {
        this.b = b;
        super(file);
    }
    
    @Override
    public boolean a() {
        return !ad.a(this.b.a);
    }
}
