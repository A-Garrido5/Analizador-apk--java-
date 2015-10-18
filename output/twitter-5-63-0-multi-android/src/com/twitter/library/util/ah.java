// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

final class ah implements Callable
{
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    
    ah(final List a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public Boolean a() {
        final Iterator<File> iterator = (Iterator<File>)this.a.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final File file = iterator.next();
            int n2;
            if (this.b ? af.b(file) : file.delete()) {
                n2 = n + 1;
            }
            else {
                n2 = n;
            }
            n = n2;
        }
        boolean b = false;
        if (n > 0) {
            b = true;
        }
        return b;
    }
}
