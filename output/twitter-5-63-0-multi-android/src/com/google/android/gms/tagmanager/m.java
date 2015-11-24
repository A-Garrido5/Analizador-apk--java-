// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import android.content.ComponentCallbacks;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import android.content.Context;
import java.util.Map;

class m implements h
{
    final /* synthetic */ l a;
    
    m(final l a) {
        this.a = a;
    }
    
    @Override
    public void a(final Map map) {
        final Object value = map.get("event");
        if (value != null) {
            this.a.a(value.toString());
        }
    }
}
