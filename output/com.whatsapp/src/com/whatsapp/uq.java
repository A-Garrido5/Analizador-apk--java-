// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import com.whatsapp.util.ay;

class uq extends ay
{
    private boolean b;
    
    public uq(final File file) {
        super(file);
    }
    
    public void a() {
        this.b = true;
    }
    
    @Override
    public boolean a() {
        return !this.b;
    }
}
