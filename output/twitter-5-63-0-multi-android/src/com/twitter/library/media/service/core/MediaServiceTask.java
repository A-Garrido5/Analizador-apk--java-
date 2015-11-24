// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bq;
import android.os.Parcel;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.Parcelable;

public abstract class MediaServiceTask implements Parcelable
{
    private boolean a;
    private boolean b;
    
    private void a(final Context context, final WeakReference weakReference, final boolean b) {
        new i(this, b, context.getApplicationContext(), weakReference).execute((Object[])new MediaServiceTask[] { this });
    }
    
    private void a(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.setClassLoader(this.getClass().getClassLoader());
            final Parcelable parcelable = bundle.getParcelable("parcel");
            final Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.a(obtain);
            obtain.recycle();
        }
        catch (Exception ex) {
            this.a = false;
            this.b = false;
        }
    }
    
    private void e(final Context context) {
        this.a = false;
        try {
            this.a = this.c(context);
            this.b = true;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
        }
        catch (Exception ex) {}
    }
    
    public final void a(final Context context) {
        this.a = false;
        try {
            this.a = this.b(context);
            this.b = true;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
        }
        catch (Exception ex) {}
    }
    
    public void a(final Context context, final k k) {
        final WeakReference weakReference = new WeakReference((T)k);
        if (d.f("media_service_process_enabled")) {
            final MediaServiceClient a = MediaServiceClient.a(context);
            final Bundle bundle = new Bundle();
            bundle.putParcelable("parcel", (Parcelable)this);
            a.a(1, bundle, new j(this, context, weakReference));
            return;
        }
        this.a(context, weakReference, false);
    }
    
    public void a(final Parcel parcel) {
        boolean b = true;
        this.a = (parcel.readInt() != 0 && b);
        if (parcel.readInt() == 0) {
            b = false;
        }
        this.b = b;
    }
    
    public boolean a() {
        return this.b;
    }
    
    public boolean a(final Context context, final int n) {
        if (d.f("media_service_process_enabled")) {
            final Bundle bundle = new Bundle();
            bundle.putParcelable("parcel", (Parcelable)this);
            final MediaServiceClient a = MediaServiceClient.a(context);
            Bundle bundle2;
            if (n > 0) {
                bundle2 = a.a(1, bundle, n);
            }
            else {
                bundle2 = a.a(1, bundle);
            }
            this.a(bundle2);
            if (!this.a()) {
                this.e(context);
            }
        }
        else {
            this.a(context);
        }
        return this.b();
    }
    
    public boolean b() {
        return this.a;
    }
    
    protected abstract boolean b(final Context p0);
    
    protected boolean c(final Context context) {
        return false;
    }
    
    public boolean d(final Context context) {
        return this.a(context, 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        int n3;
        if (this.a) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.b) {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
