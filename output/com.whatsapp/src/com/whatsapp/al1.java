// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class al1 implements View$OnClickListener
{
    final RecordAudio a;
    
    al1(final RecordAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        Label_0157: {
            if (RecordAudio.j(this.a).f()) {
                RecordAudio.i(this.a).removeMessages(0);
                RecordAudio.j(this.a).a();
                RecordAudio.b(this.a, 5);
                if (!i) {
                    break Label_0157;
                }
            }
            if (RecordAudio.c(this.a) == 5 && RecordAudio.j(this.a).i() != RecordAudio.j(this.a).e()) {
                RecordAudio.b(this.a, 3);
                RecordAudio.j(this.a).a(RecordAudio.h(this.a).getProgress());
                RecordAudio.j(this.a).h();
                RecordAudio.i(this.a).sendEmptyMessage(0);
                if (!i) {
                    break Label_0157;
                }
            }
            RecordAudio.a(this.a, RecordAudio.h(this.a).getProgress());
        }
        RecordAudio.c(this.a, RecordAudio.c(this.a));
    }
}
