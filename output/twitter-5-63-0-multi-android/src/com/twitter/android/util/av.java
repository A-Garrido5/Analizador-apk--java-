// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Parcelable;
import com.twitter.library.client.as;
import com.twitter.library.api.Prompt;
import com.twitter.library.api.ao;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.content.Context;
import com.twitter.android.oy;
import java.util.HashMap;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.au;

public class av implements au
{
    private TwitterFragmentActivity a;
    private CursorAdapter b;
    private b c;
    private ax d;
    private az e;
    private aw f;
    private HashMap g;
    private long h;
    private long i;
    private oy j;
    
    public av(final TwitterFragmentActivity a, final CursorAdapter b) {
        this.g = new HashMap();
        this.a = a;
        this.b = b;
        this.h = com.twitter.library.client.az.a((Context)this.a).b().g();
    }
    
    public b a() {
        if (this.c == null) {
            this.c = new b((Context)this.a, this.j, this.b);
        }
        return this.c;
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        if (aa.a() && y instanceof ao) {
            this.a((Prompt)aa.c.getParcelable("prompt"));
        }
    }
    
    public void a(final Bundle bundle) {
        final Bundle bundle2 = (Bundle)bundle.getParcelable("state_action_prompt_handler");
        if (bundle2 != null) {
            this.a().a(bundle2);
        }
    }
    
    public void a(final oy j) {
        this.j = j;
    }
    
    public void a(final aw f) {
        this.f = f;
    }
    
    public void a(final Prompt prompt) {
        if (this.f == null || !this.f.a(prompt)) {
            boolean b;
            if (prompt != null) {
                final ay ay = this.g.get(prompt.b);
                if (ay != null) {
                    ay.a(prompt);
                    b = true;
                }
                else if (prompt.h()) {
                    this.b().a(prompt);
                    b = true;
                }
                else if (prompt.f()) {
                    this.a().a(prompt);
                    b = true;
                }
                else if (prompt.e()) {
                    this.c().a(prompt);
                    b = true;
                }
                else {
                    b = false;
                }
            }
            else {
                b = false;
            }
            if (this.f != null && !b) {
                this.f.b(prompt);
            }
        }
    }
    
    public void a(final String s) {
        as.a((Context)this.a).a(ao.a((Context)this.a, com.twitter.library.client.az.a((Context)this.a).b(), s, ap.a((Context)this.a).e()), 0, 0, this);
    }
    
    public ax b() {
        if (this.d == null) {
            this.d = new ax(this);
        }
        return this.d;
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    public az c() {
        if (this.e == null) {
            this.e = new az(this);
        }
        return this.e;
    }
    
    public Parcelable d() {
        final Bundle bundle = new Bundle();
        if (this.c != null) {
            bundle.putParcelable("state_action_prompt_handler", (Parcelable)this.c.b());
        }
        return (Parcelable)bundle;
    }
}
