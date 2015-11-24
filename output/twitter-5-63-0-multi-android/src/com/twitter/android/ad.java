// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.content.Intent;
import com.twitter.util.d;
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

public class ad
{
    private final List a;
    
    public ad() {
        this.a = new ArrayList();
    }
    
    public void a(final Activity activity) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).a(activity);
        }
    }
    
    public void a(final Activity activity, final Intent intent) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).a(activity, intent);
        }
    }
    
    public void a(final Activity activity, final Bundle bundle) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).a(activity, bundle);
        }
    }
    
    public void a(final ac ac) {
        d.a();
        this.a.add(ac);
    }
    
    public void b(final Activity activity) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).b(activity);
        }
    }
    
    public void b(final Activity activity, final Bundle bundle) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).b(activity, bundle);
        }
    }
    
    public boolean b(final ac ac) {
        d.a();
        return this.a.remove(ac);
    }
    
    public void c(final Activity activity) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).c(activity);
        }
    }
    
    public void d(final Activity activity) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).d(activity);
        }
    }
    
    public void e(final Activity activity) {
        d.a();
        final List a = this.a;
        for (int i = -1 + a.size(); i >= 0; --i) {
            a.get(i).e(activity);
        }
    }
}
