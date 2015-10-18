// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import com.whatsapp.vp;
import de.greenrobot.event.m;
import org.whispersystems.jobqueue.requirements.a;
import org.whispersystems.jobqueue.requirements.c;

public final class b implements c
{
    private a a;
    
    public b() {
        m.b().d(this);
    }
    
    @Override
    public void a(final a a) {
        this.a = a;
    }
    
    public void onEvent(final vp vp) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
