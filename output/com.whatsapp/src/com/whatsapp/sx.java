// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.protocol.bi;

final class sx extends sj
{
    @Override
    public void b(final bi bi, final int n) {
        final boolean i = App.I;
        synchronized (VideoTranscodeService.b()) {
            if (bi.I == 3) {
                Label_0055: {
                    if (bi.c == 1) {
                        VideoTranscodeService.b().put(bi.a, bi);
                        if (!i) {
                            break Label_0055;
                        }
                    }
                    VideoTranscodeService.b().remove(bi.a);
                }
                if (VideoTranscodeService.b().isEmpty()) {
                    App.aq.stopService(new Intent((Context)App.aq, (Class)VideoTranscodeService.class));
                    if (!i) {
                        return;
                    }
                }
                App.aq.startService(new Intent((Context)App.aq, (Class)VideoTranscodeService.class));
            }
        }
    }
}
