// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import java.util.concurrent.Executors;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class f
{
    private static final ExecutorService c;
    boolean a;
    boolean b;
    boolean d;
    List e;
    boolean f;
    boolean g;
    ExecutorService h;
    boolean i;
    
    static {
        c = Executors.newCachedThreadPool();
    }
    
    f() {
        this.d = true;
        this.a = true;
        this.f = true;
        this.g = true;
        this.b = true;
        this.h = de.greenrobot.event.f.c;
    }
}
