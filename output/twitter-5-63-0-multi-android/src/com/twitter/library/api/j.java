// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;

public class j extends k
{
    private ArrayList a;
    
    public j(final Context context, final Session session) {
        super(context, session, j.class.getName());
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.a = (ArrayList)bg.a();
        }
    }
    
    protected bg e() {
        return bg.a(96);
    }
    
    public ArrayList f() {
        return this.a;
    }
}
