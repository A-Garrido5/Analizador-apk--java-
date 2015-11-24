// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.io.File;

class ac implements Runnable
{
    final /* synthetic */ ae a;
    final /* synthetic */ String b;
    final /* synthetic */ ab c;
    
    ac(final ab c, final ae a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(new File(this.b));
    }
}
