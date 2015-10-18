// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.InputStream;

final class bq implements bt
{
    private boolean a;
    private /* synthetic */ StringBuilder b;
    
    bq(final bp bp, final StringBuilder b) {
        this.b = b;
        this.a = true;
    }
    
    @Override
    public final void a(final InputStream inputStream, final int n) {
        if (this.a) {
            this.a = false;
        }
        else {
            this.b.append(", ");
        }
        this.b.append(n);
    }
}
