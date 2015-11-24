// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.view.View;
import java.lang.ref.WeakReference;

final class n extends c
{
    final /* synthetic */ WeakReference a;
    final /* synthetic */ String b;
    
    n(final int n, final boolean b, final boolean b2, final WeakReference a, final String b3) {
        this.a = a;
        this.b = b3;
        super(n, b, b2);
    }
    
    public void onClick(final View view) {
        final k k = (k)this.a.get();
        if (k != null) {
            k.a(this.b);
        }
    }
}
