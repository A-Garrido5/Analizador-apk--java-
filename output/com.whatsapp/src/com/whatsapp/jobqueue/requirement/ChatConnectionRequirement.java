// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import de.greenrobot.event.m;
import com.whatsapp.fr;
import org.whispersystems.jobqueue.requirements.e;

public final class ChatConnectionRequirement implements e
{
    public static boolean a = false;
    private static final long serialVersionUID = 1L;
    
    @Override
    public boolean a() {
        return ((fr)m.b().a(fr.class)).a();
    }
}
