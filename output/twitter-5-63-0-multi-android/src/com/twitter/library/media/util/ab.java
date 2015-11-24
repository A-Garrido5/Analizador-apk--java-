// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.net.Uri;
import java.util.ArrayList;
import android.media.MediaScannerConnection$MediaScannerConnectionClient;

class ab implements MediaScannerConnection$MediaScannerConnectionClient
{
    final /* synthetic */ aa a;
    
    ab(final aa a) {
        this.a = a;
    }
    
    public void onMediaScannerConnected() {
        synchronized (this.a.b) {
            final ArrayList b = this.a.b;
            final ad[] array = b.toArray(new ad[b.size()]);
            b.clear();
            // monitorexit(this.a.b)
            for (final ad ad : array) {
                this.a.a.scanFile(ad.a, ad.b);
            }
        }
    }
    
    public void onScanCompleted(final String s, final Uri uri) {
        synchronized (this.a.e) {
            final ae ae = (ae)this.a.e.remove(s);
            // monitorexit(this.a.e)
            if (ae != null) {
                this.a.d.post((Runnable)new ac(this, ae, s));
            }
        }
    }
}
