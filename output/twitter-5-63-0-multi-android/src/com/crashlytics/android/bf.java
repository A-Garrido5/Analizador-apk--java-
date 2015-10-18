// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.InputStream;
import com.crashlytics.android.internal.bt;

final class bf implements bt
{
    private /* synthetic */ byte[] a;
    private /* synthetic */ int[] b;
    
    bf(final bc bc, final byte[] a, final int[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final InputStream inputStream, final int n) {
        try {
            inputStream.read(this.a, this.b[0], n);
            final int[] b = this.b;
            b[0] += n;
        }
        finally {
            inputStream.close();
        }
    }
}
