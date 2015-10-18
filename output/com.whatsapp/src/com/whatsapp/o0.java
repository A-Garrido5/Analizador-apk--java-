// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import com.whatsapp.util.OpusRecorder;

class o0 extends od
{
    private OpusRecorder d;
    
    public o0(final String s) {
        this.a = new File(s);
        this.c = 16000;
        this.d = new OpusRecorder(s);
    }
    
    @Override
    public void c() {
        this.d.prepare();
    }
    
    @Override
    public void d() {
        this.d.start();
    }
    
    @Override
    public void e() {
        this.d.stop();
    }
    
    @Override
    public void f() {
        this.d.close();
    }
}
