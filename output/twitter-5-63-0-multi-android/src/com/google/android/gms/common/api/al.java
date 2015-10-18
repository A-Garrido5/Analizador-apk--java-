// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Context;
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
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.content.DialogInterface$OnCancelListener;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.e;
import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import com.google.android.gms.common.a;

class al implements Runnable
{
    final /* synthetic */ g a;
    private final int b;
    private final a c;
    
    public al(final g a, final int b, final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (this.c.a()) {
            try {
                this.c.a(this.a.getActivity(), 1 + (1 + this.a.getActivity().getSupportFragmentManager().getFragments().indexOf(this.a) << 16));
                return;
            }
            catch (IntentSender$SendIntentException ex) {
                this.a.a();
                return;
            }
        }
        if (e.b(this.c.c())) {
            e.a(this.c.c(), this.a.getActivity(), this.a, 2, (DialogInterface$OnCancelListener)this.a);
            return;
        }
        this.a.b(this.b, this.c);
    }
}
