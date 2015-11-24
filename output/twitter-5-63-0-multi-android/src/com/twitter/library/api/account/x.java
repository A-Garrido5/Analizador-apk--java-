// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.d;
import java.io.Serializable;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.c;

public class x extends c
{
    public final String a;
    public final String e;
    public final String f;
    
    public x(final Context context, final ab ab, final String e, final String f, final String a) {
        super(context, x.class.getName(), ab);
        this.e = e;
        this.f = f;
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f m = this.M();
        switch (this.O()) {
            default: {
                throw new IllegalArgumentException("Invalid/unknown action: " + this.O());
            }
            case 1: {
                m.a("i");
                m.a(HttpOperation$RequestMethod.b);
                m.a(new Object[] { "account", "change_password" }).a("current_password", this.e).a("password", this.f).a("password_confirmation", this.f);
                break;
            }
            case 2: {
                m.a("1");
                m.a(HttpOperation$RequestMethod.b);
                m.a(new Object[] { "account", "update_email" }).a("email", this.a).a("password", this.e);
                break;
            }
        }
        return m.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        switch (this.O()) {
            case 1: {
                if (httpOperation.k()) {
                    break;
                }
                final int[] a = ae.a((List)bg.a());
                if (a.length > 0) {
                    aa.c.putSerializable("custom_errors", (Serializable)a);
                    return;
                }
                break;
            }
        }
    }
    
    protected bg b() {
        switch (this.O()) {
            default: {
                throw new IllegalArgumentException("Invalid action type for this request");
            }
            case 1: {
                return bg.a(64);
            }
            case 2: {
                return bg.a(65);
            }
        }
    }
}
