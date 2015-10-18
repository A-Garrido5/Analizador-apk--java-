// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.d;
import java.util.Iterator;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.service.c;

public class h extends c
{
    private ArrayList a;
    private int[] e;
    
    public h(final Context context, final Session session) {
        super(context, h.class.getName(), session);
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "account", "login_verification_request" }).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final ArrayList a = (ArrayList)bg.a();
            final String e = this.P().e;
            final Iterator<LoginVerificationRequest> iterator = a.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(e);
            }
            this.a = a;
            return;
        }
        this.e = ae.a((List)bg.a());
    }
    
    public ArrayList b() {
        return this.a;
    }
    
    public int[] e() {
        return this.e;
    }
    
    protected bg f() {
        return bg.a(42);
    }
}
