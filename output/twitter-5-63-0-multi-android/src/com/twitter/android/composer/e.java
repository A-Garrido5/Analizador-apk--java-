// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.provider.f;
import java.util.concurrent.Callable;

class e implements Callable
{
    final /* synthetic */ f a;
    final /* synthetic */ ComposerActivity b;
    
    e(final ComposerActivity b, final f a) {
        this.b = b;
        this.a = a;
    }
    
    public Integer a() {
        return this.a.a(2);
    }
}
