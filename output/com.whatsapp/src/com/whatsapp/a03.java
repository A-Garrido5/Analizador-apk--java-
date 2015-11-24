// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b7;
import android.view.View;
import com.whatsapp.util.co;

class a03 extends co
{
    final ConversationRowMedia b;
    
    a03(final ConversationRowMedia b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        Label_0095: {
            if (this.b.t.a.b) {
                if (b7.a(this.b.t.c, 2) >= 0) {
                    App.a(this.b.getContext(), 2131231128, 0);
                }
                else {
                    final MediaData mediaData = (MediaData)this.b.t.N;
                    if (mediaData.transcoder != null) {
                        mediaData.transcoder.f();
                    }
                    if (mediaData.uploader != null) {
                        mediaData.uploader.i();
                    }
                    if (App.I) {
                        break Label_0095;
                    }
                }
                return;
            }
        }
        ((MediaData)this.b.t.N).downloader.a();
    }
}
