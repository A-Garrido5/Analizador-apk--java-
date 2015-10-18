// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.params.ConnPerRoute;

class b4 implements ConnPerRoute
{
    final q a;
    
    b4(final q a) {
        this.a = a;
    }
    
    public int getMaxForRoute(final HttpRoute httpRoute) {
        return 2;
    }
}
