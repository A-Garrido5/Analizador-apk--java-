// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import com.whatsapp.a6k;
import de.greenrobot.event.m;
import org.whispersystems.jobqueue.requirements.a;
import org.whispersystems.jobqueue.requirements.c;

public final class d implements c
{
    private a a;
    
    public d() {
        m.b().d(this);
    }
    
    @Override
    public void a(final a a) {
        this.a = a;
    }
    
    public void onEvent(final a6k a6k) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
