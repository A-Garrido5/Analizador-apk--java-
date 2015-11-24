// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.Collection;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.library.service.e;
import java.util.Locale;
import java.util.ArrayList;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;
import com.twitter.library.service.c;

public class i extends c
{
    private final String a;
    private final String e;
    private final List f;
    
    public i(final Context context, final Session session) {
        super(context, i.class.getName(), session);
        this.f = new ArrayList();
        final Locale locale = this.p.getResources().getConfiguration().locale;
        if (locale != null) {
            this.e = locale.getCountry();
            this.a = com.twitter.util.i.b(locale);
            return;
        }
        this.e = null;
        this.a = null;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "trends", "available" });
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            a.a("lang", this.a);
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            a.a("country", this.e);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            final List list = (List)bg.a();
            if (list != null) {
                this.f.addAll(list);
                this.V().a(list);
            }
        }
    }
    
    protected bg b() {
        return bg.a(40);
    }
    
    public List e() {
        return this.f;
    }
    
    public String f() {
        return this.a;
    }
    
    public String g() {
        return this.e;
    }
}
