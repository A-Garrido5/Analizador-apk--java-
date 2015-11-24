// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.service.f;
import android.os.Bundle;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class an extends c
{
    public an(final Context context, final Session session) {
        this(context, new ab(session));
    }
    
    public an(final Context context, final ab ab) {
        super(context, an.class.getName(), ab);
    }
    
    @Override
    protected e a() {
        final int o = this.O();
        final Bundle o2 = this.o;
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "prompts", "record_event" }).a("user_id", String.valueOf(o2.getLong("user_id"))).a("prompt_id", String.valueOf(o2.getInt("prompt_id")));
        switch (o) {
            default: {
                throw new IllegalArgumentException("Invalid action " + o);
            }
            case 1: {
                a.a("action", "acted_on");
                break;
            }
            case 2: {
                a.a("action", "dismissed");
                break;
            }
            case 3: {
                a.a("action", "shown");
                break;
            }
        }
        return a.a();
    }
    
    protected bg b() {
        return null;
    }
}
