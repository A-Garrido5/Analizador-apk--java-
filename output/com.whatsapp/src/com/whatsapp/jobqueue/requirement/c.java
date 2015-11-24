// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import com.whatsapp.as0;
import de.greenrobot.event.m;
import org.whispersystems.jobqueue.requirements.a;

public final class c implements org.whispersystems.jobqueue.requirements.c
{
    private a a;
    
    public c() {
        m.b().d(this);
    }
    
    @Override
    public void a(final a a) {
        this.a = a;
    }
    
    public void onEvent(final as0 as0) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
