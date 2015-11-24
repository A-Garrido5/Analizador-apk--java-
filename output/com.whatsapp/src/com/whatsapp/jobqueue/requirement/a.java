// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import com.whatsapp.fr;
import de.greenrobot.event.m;
import org.whispersystems.jobqueue.requirements.c;

public final class a implements c
{
    private org.whispersystems.jobqueue.requirements.a a;
    
    public a() {
        m.b().d(this);
    }
    
    @Override
    public void a(final org.whispersystems.jobqueue.requirements.a a) {
        this.a = a;
    }
    
    public void onEvent(final fr fr) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
