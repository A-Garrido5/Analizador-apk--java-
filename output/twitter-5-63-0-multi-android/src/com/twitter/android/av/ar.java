// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.internal.android.service.a;
import com.twitter.library.provider.ae;
import com.twitter.library.api.timeline.l;
import com.twitter.library.api.timeline.f;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

public class ar extends z
{
    final /* synthetic */ ap a;
    
    public ar(final ap a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof f) {
            this.a.a(((f)y).f());
        }
        else {
            if (y instanceof l) {
                this.a.a(((l)y).f());
                return;
            }
            if (y instanceof oq) {
                this.a.a(((oq)y).t());
                return;
            }
            if (y instanceof ol) {
                this.a.a(ae.b(this.a.c(), this.a.b()));
            }
        }
    }
}
