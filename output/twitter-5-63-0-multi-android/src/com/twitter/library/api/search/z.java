// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public class z extends i
{
    private final String a;
    private final int e;
    private final int f;
    private final String h;
    private TwitterTypeAheadGroup i;
    
    public z(final Context context, final Session session, final String a, final int e, final int f, final String h) {
        super(context, z.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.h = h;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.i = (TwitterTypeAheadGroup)bg.a();
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "search", "typeahead" });
        a.a("prefetch", false);
        String s;
        if (this.e == 1) {
            if (this.a.startsWith("@")) {
                s = this.a;
            }
            else {
                s = "@" + this.a;
            }
        }
        else if (this.e == 2) {
            if (this.a.startsWith("#")) {
                s = this.a;
            }
            else {
                s = "#" + this.a;
            }
        }
        else {
            s = this.a;
        }
        a.a("q", s);
        a.a("src", this.h);
        switch (this.e) {
            default: {
                a.a("result_type", "all");
                a.a("filters", true);
                break;
            }
            case 1: {
                a.a("result_type", "users");
                break;
            }
            case 3: {
                a.a("result_type", "topics");
                a.a("filters", true);
                break;
            }
            case 2: {
                a.a("result_type", "hashtags");
                break;
            }
        }
        if (this.f > 0) {
            a.a("count", this.f);
        }
        return a;
    }
    
    public int e() {
        return this.e;
    }
    
    public String f() {
        return this.a;
    }
    
    public TwitterTypeAheadGroup g() {
        return this.i;
    }
    
    protected bg t() {
        return bg.a(39);
    }
}
