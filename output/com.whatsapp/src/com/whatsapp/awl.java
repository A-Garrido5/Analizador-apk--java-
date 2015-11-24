// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.HashMap;

class awl implements yk
{
    final HashMap a;
    final Conversation b;
    
    awl(final Conversation b, final HashMap a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        final boolean i = App.I;
        if (Conversation.p(this.b) && Conversation.E(this.b) > 0) {
            final int a = nm.a(this.b.u);
            if (this.b.u.getCount() > a + 1) {
                final bi bi = (bi)this.b.u.getItem(a + 1);
                final Iterator<bi> iterator = this.a.values().iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().u >= bi.u) {
                        Conversation.b(this.b, 0);
                        if (!i) {
                            break;
                        }
                    }
                    if (i) {
                        break;
                    }
                }
            }
        }
        Conversation.u(this.b);
    }
}
