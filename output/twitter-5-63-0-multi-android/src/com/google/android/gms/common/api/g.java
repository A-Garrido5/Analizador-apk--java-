// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.e;
import android.content.Intent;
import android.support.v4.content.Loader;
import android.util.Log;
import android.support.v4.app.LoaderManager;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.ap;
import android.support.v4.app.FragmentActivity;
import android.os.Looper;
import android.util.SparseArray;
import android.os.Handler;
import com.google.android.gms.common.a;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.content.DialogInterface$OnCancelListener;
import android.support.v4.app.Fragment;

public class g extends Fragment implements DialogInterface$OnCancelListener, LoaderManager$LoaderCallbacks
{
    private boolean a;
    private int b;
    private a c;
    private final Handler d;
    private final SparseArray e;
    
    public g() {
        this.b = -1;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new SparseArray();
    }
    
    public static g a(final FragmentActivity fragmentActivity) {
        ap.b("Must be called from main thread of process");
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            g g = (g)supportFragmentManager.findFragmentByTag("GmsSupportLifecycleFragment");
            if (g == null || g.isRemoving()) {
                g = new g();
                supportFragmentManager.beginTransaction().add(g, "GmsSupportLifecycleFragment").commit();
                supportFragmentManager.executePendingTransactions();
            }
            return g;
        }
        catch (ClassCastException ex) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", ex);
        }
    }
    
    private void a() {
        int i = 0;
        this.a = false;
        this.b = -1;
        this.c = null;
        final LoaderManager loaderManager = this.getLoaderManager();
        while (i < this.e.size()) {
            final int key = this.e.keyAt(i);
            final aj c = this.c(key);
            if (c != null) {
                c.a();
            }
            loaderManager.initLoader(key, null, this);
            ++i;
        }
    }
    
    private void a(final int b, final a c) {
        if (!this.a) {
            this.a = true;
            this.b = b;
            this.c = c;
            this.d.post((Runnable)new al(this, b, c));
        }
    }
    
    private void b(final int n, final a a) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        final ak ak = (ak)this.e.get(n);
        if (ak != null) {
            this.b(n);
            final q b = ak.b;
            if (b != null) {
                b.a(a);
            }
        }
        this.a();
    }
    
    private void d(final int n) {
        if (n == this.b) {
            this.a();
        }
    }
    
    public n a(final int n) {
        if (this.getActivity() != null) {
            final aj c = this.c(n);
            if (c != null) {
                return c.a;
            }
        }
        return null;
    }
    
    public void a(final int n, final n n2, final q q) {
        ap.a(n2, "GoogleApiClient instance cannot be null");
        ap.a(this.e.indexOfKey(n) < 0, (Object)("Already managing a GoogleApiClient with id " + n));
        this.e.put(n, (Object)new ak(n2, q, null));
        if (this.getActivity() != null) {
            this.getLoaderManager().initLoader(n, null, this);
        }
    }
    
    public void a(final Loader loader, final a a) {
        if (a.b()) {
            this.d(loader.getId());
            return;
        }
        this.a(loader.getId(), a);
    }
    
    public void b(final int n) {
        this.getLoaderManager().destroyLoader(n);
        this.e.remove(n);
    }
    
    aj c(final int n) {
        try {
            return (aj)this.getLoaderManager().getLoader(n);
        }
        catch (ClassCastException ex) {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", ex);
        }
    }
    
    @Override
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        boolean b = true;
        Label_0031: {
            switch (n) {
                case 2: {
                    if (com.google.android.gms.common.e.a((Context)this.getActivity()) == 0) {
                        break Label_0031;
                    }
                    break;
                }
                case 1: {
                    if (n2 == -1) {
                        break Label_0031;
                    }
                    break;
                }
            }
            b = false;
        }
        if (b) {
            this.a();
            return;
        }
        this.b(this.b, this.c);
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        for (int i = 0; i < this.e.size(); ++i) {
            final int key = this.e.keyAt(i);
            final aj c = this.c(key);
            if (c != null && ((ak)this.e.valueAt(i)).a != c.a) {
                this.getLoaderManager().restartLoader(key, null, this);
            }
            else {
                this.getLoaderManager().initLoader(key, null, this);
            }
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.b(this.b, this.c);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("resolving_error", false);
            this.b = bundle.getInt("failed_client_id", -1);
            if (this.b >= 0) {
                this.c = new a(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new aj((Context)this.getActivity(), ((ak)this.e.get(n)).a);
    }
    
    public void onLoaderReset(final Loader loader) {
        if (loader.getId() == this.b) {
            this.a();
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.a);
        if (this.b >= 0) {
            bundle.putInt("failed_client_id", this.b);
            bundle.putInt("failed_status", this.c.c());
            bundle.putParcelable("failed_resolution", (Parcelable)this.c.d());
        }
    }
    
    @Override
    public void onStart() {
        super.onStart();
        if (!this.a) {
            for (int i = 0; i < this.e.size(); ++i) {
                this.getLoaderManager().initLoader(this.e.keyAt(i), null, this);
            }
        }
    }
}
