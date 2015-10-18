// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.os.Message;
import android.os.Handler;

class u8 extends Handler
{
    int a;
    final RecordAudio b;
    
    u8(final RecordAudio b) {
        this.b = b;
        this.a = 0;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        while (true) {
            Label_0381: {
                if (RecordAudio.c(this.b) == 3) {
                    final int j = RecordAudio.j(this.b).i();
                    if (j / 1000 != this.a) {
                        RecordAudio.m(this.b).setText((CharSequence)DateUtils.formatElapsedTime((long)(j / 1000)));
                        this.a = j / 1000;
                    }
                    RecordAudio.n(this.b).setProgress(j);
                    RecordAudio.h(this.b).setProgress(j);
                    if (!i) {
                        break Label_0381;
                    }
                }
                if (RecordAudio.c(this.b) != 1) {
                    break Label_0381;
                }
                final long n = System.currentTimeMillis() - RecordAudio.l(this.b);
                int n2;
                if (n > 120000L) {
                    RecordAudio.k(this.b);
                    RecordAudio.b(this.b, 4);
                    RecordAudio.c(this.b, RecordAudio.c(this.b));
                    if (!i) {
                        n2 = 1;
                        break Label_0222;
                    }
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                final long n3 = n / 1000L;
                RecordAudio.m(this.b).setText((CharSequence)DateUtils.formatElapsedTime(120L - n3));
                RecordAudio.e(this.b).setText((CharSequence)DateUtils.formatElapsedTime(n3));
                RecordAudio.n(this.b).setProgress((int)n);
                if (n2 == 0 && !this.b.isFinishing() && ((RecordAudio.c(this.b) == 3 && RecordAudio.j(this.b).f()) || RecordAudio.c(this.b) == 1)) {
                    RecordAudio.i(this.b).sendEmptyMessageDelayed(0, 50L);
                    if (!i) {
                        return;
                    }
                }
                Label_0347: {
                    if (RecordAudio.c(this.b) == 3) {
                        RecordAudio.h(this.b).setProgress(0);
                        if (!i) {
                            break Label_0347;
                        }
                    }
                    if (RecordAudio.c(this.b) == 1) {
                        RecordAudio.n(this.b).setProgress(RecordAudio.n(this.b).getMax());
                    }
                }
                RecordAudio.b(this.b, 4);
                RecordAudio.c(this.b, RecordAudio.c(this.b));
                return;
            }
            int n2 = 0;
            continue;
        }
    }
}
