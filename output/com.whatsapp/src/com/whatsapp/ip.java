// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

class ip implements _b
{
    File a;
    
    public ip(final File a) {
        this.a = a;
    }
    
    @Override
    public String a() {
        return this.a.getName();
    }
    
    @Override
    public long b() {
        return this.a.length();
    }
    
    @Override
    public InputStream c() {
        return new FileInputStream(this.a);
    }
}
