// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.app.Activity;
import android.os.Bundle;
import com.twitter.android.jw;
import com.twitter.util.d;
import com.twitter.android.ac;

public class p
{
    private static volatile p a;
    private final q b;
    
    private p() {
        this.b = new q();
    }
    
    public static p a() {
        Label_0028: {
            if (p.a != null) {
                break Label_0028;
            }
            synchronized (p.class) {
                if (p.a == null) {
                    p.a = new p();
                }
                return p.a;
            }
        }
    }
    
    public void a(final ac ac) {
        d.a();
        this.b.a(ac);
    }
    
    public void a(final jw jw, final Bundle bundle) {
        d.a();
        jw.a(this.b);
        this.b.a((Activity)jw, bundle);
    }
    
    public Activity b() {
        return this.b.a();
    }
    
    public void b(final ac ac) {
        d.a();
        this.b.b(ac);
    }
}
