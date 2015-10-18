// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b7;
import android.view.View;
import android.view.View$OnClickListener;

class a_q implements View$OnClickListener
{
    final ConversationRowAudio a;
    
    a_q(final ConversationRowAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Label_0072: {
            if (this.a.t.a.b) {
                if (b7.a(this.a.t.c, 2) >= 0) {
                    App.a(this.a.getContext(), 2131231128, 0);
                }
                else {
                    ((MediaData)this.a.t.N).uploader.i();
                    if (App.I) {
                        break Label_0072;
                    }
                }
                return;
            }
        }
        ((MediaData)this.a.t.N).downloader.a();
    }
}
