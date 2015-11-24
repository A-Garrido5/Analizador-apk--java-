// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import de.greenrobot.event.m;
import com.whatsapp.vp;
import org.whispersystems.jobqueue.requirements.e;

public final class NetworkRequirement implements e
{
    private static final long serialVersionUID = 1L;
    
    @Override
    public boolean a() {
        return ((vp)m.b().a(vp.class)).c();
    }
}
