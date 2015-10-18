// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class a2f implements View$OnTouchListener
{
    final Conversation a;
    
    a2f(final Conversation a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean i = App.I;
        if (motionEvent.getAction() == 1 && Conversation.D(this.a).size() > 0) {
            Label_0139: {
                if (Conversation.b(this.a)) {
                    this.a.u.getCursor().requery();
                    Conversation.k(this.a, false);
                    if (!i) {
                        break Label_0139;
                    }
                }
                for (final bi bi : Conversation.D(this.a)) {
                    if (!bi.a.b) {
                        Conversation.d(this.a, bi);
                    }
                    if (i) {
                        break;
                    }
                }
                this.a.u.notifyDataSetChanged();
                Conversation.N(this.a);
            }
            Conversation.D(this.a).clear();
        }
        return false;
    }
}
