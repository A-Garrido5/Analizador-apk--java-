// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;

public class g extends y
{
    private String[] a;
    private int e;
    private long f;
    private int g;
    
    public g(final Context context, final Session session, final long f, final String[] a, final int e) {
        super(context, g.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    public int a() {
        return this.g;
    }
    
    @Override
    protected void a_(final aa aa) {
        final aa aa2 = new aa();
        final aa aa3 = new aa();
        int i = 0;
        int n = 0;
        aa aa4 = aa3;
        aa aa5 = aa2;
        while (i < this.a.length) {
            final l l = (l)new l(this.p, this.P(), this.f, this.a[i], (this.e - this.g) / (this.a.length - i)).a(this);
            String s;
            if (i == 0) {
                s = "-1";
            }
            else {
                s = null;
            }
            l.a(s);
            String s2;
            if (i == -1 + this.a.length) {
                s2 = "0";
            }
            else {
                s2 = null;
            }
            l.b(s2);
            aa s3 = l.S();
            int n2;
            aa aa6;
            if (s3.a()) {
                n2 = 1;
                aa6 = s3;
                s3 = aa4;
            }
            else {
                n2 = n;
                aa6 = aa5;
            }
            this.g += l.f();
            ++i;
            n = n2;
            aa4 = s3;
            aa5 = aa6;
        }
        if (n != 0) {
            aa.a(aa5);
            return;
        }
        aa.a(aa4);
    }
}
