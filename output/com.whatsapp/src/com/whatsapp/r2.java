// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.b7;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;

class r2 implements Runnable
{
    final adq a;
    final ArrayList b;
    
    r2(final adq a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        if (!this.a.isCancelled()) {
            for (final bi bi : this.b) {
                Label_0136: {
                    if (bi.I == 1 || bi.I == 2 || bi.I == 3) {
                        final MediaData mediaData = (MediaData)bi.N;
                        Label_0127: {
                            if (bi.d != null && (mediaData == null || mediaData.file == null)) {
                                App.b(bi, true);
                                if (!i) {
                                    break Label_0127;
                                }
                            }
                            if (b7.a(bi.c, 2) < 0) {
                                App.n(bi);
                                if (!i) {
                                    break Label_0127;
                                }
                            }
                            App.b(bi, true);
                        }
                        if (!i) {
                            break Label_0136;
                        }
                    }
                    App.b(bi, true);
                }
                if (i) {
                    break;
                }
            }
        }
    }
}
