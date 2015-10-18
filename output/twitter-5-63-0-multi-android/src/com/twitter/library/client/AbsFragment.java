// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import java.util.Iterator;
import android.support.v4.app.FragmentActivity;
import java.util.concurrent.Future;
import com.twitter.library.service.z;
import android.os.Bundle;
import com.twitter.library.service.y;
import com.twitter.internal.android.service.a;
import com.twitter.library.util.ReferenceList;
import android.content.Context;
import com.twitter.android.jv;
import android.support.v4.app.Fragment;

public abstract class AbsFragment extends Fragment implements jv, au
{
    private az a;
    protected au am;
    protected Context an;
    private ay b;
    private as c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ReferenceList g;
    
    public AbsFragment() {
        this.g = ReferenceList.a();
    }
    
    protected final String a(final a a) {
        return this.c.a(a);
    }
    
    protected final String a(final y y) {
        return this.c.a(y);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
    }
    
    protected void a(final ay b) {
        if (this.b != null) {
            this.a.b(this.b);
        }
        this.b = b;
    }
    
    protected final void a(final z z) {
        this.c.a(z);
    }
    
    public void a(final Future future) {
        this.g.b(future);
    }
    
    protected final boolean a(final y y, final int n, final int n2) {
        if (this.aD()) {
            if (this.am == null) {
                this.am = new ao(this);
            }
            if (this.f(n2) && this.c.a(y, n, n2, this.am)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean aD() {
        return this.getActivity() != null;
    }
    
    protected az aE() {
        return this.a;
    }
    
    protected final Session aF() {
        return this.a.b();
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    protected final void b(final z z) {
        this.c.b(z);
    }
    
    protected final boolean d(final String s) {
        return this.c.a(s);
    }
    
    protected boolean f(final int n) {
        return true;
    }
    
    @Override
    public boolean h_() {
        return this.d;
    }
    
    @Override
    public boolean isDestroyed() {
        return this.f;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.an = activity.getApplicationContext();
        this.a = az.a((Context)activity);
        this.c = as.a((Context)activity);
    }
    
    @Override
    public void onDestroy() {
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel(false);
        }
        this.g.b();
        super.onDestroy();
        this.f = true;
    }
    
    @Override
    public void onPause() {
        this.e = false;
        super.onPause();
        this.a.b(this.b);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a.a(this.b);
        this.e = true;
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.d = true;
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.d = false;
    }
}
