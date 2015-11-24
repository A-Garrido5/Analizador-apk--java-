// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.File;
import java.util.concurrent.Callable;

final class ag implements Callable
{
    final /* synthetic */ File a;
    
    ag(final File a) {
        this.a = a;
    }
    
    public Boolean a() {
        return af.b(this.a);
    }
}
