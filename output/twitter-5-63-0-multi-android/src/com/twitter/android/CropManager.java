// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import android.graphics.RectF;
import com.twitter.library.media.service.tasks.CropTask;
import com.twitter.util.d;
import com.twitter.library.media.service.core.MediaServiceTask;
import android.net.Uri;
import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import android.graphics.Bitmap;
import com.twitter.library.media.service.core.k;
import android.support.v4.app.Fragment;

public class CropManager extends Fragment implements k
{
    private Bitmap a;
    private cp b;
    private WeakReference c;
    private ArrayList d;
    
    public CropManager() {
        this.d = new ArrayList();
    }
    
    public static CropManager a(final FragmentManager fragmentManager) {
        CropManager cropManager = (CropManager)fragmentManager.findFragmentByTag("CropManager");
        if (cropManager == null) {
            cropManager = new CropManager();
            final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(cropManager, "CropManager");
            beginTransaction.commit();
        }
        return cropManager;
    }
    
    private void a(final Bitmap a) {
        this.a = a;
        this.b = null;
        co co;
        if (this.c != null) {
            co = (co)this.c.get();
        }
        else {
            co = null;
        }
        if (co != null) {
            co.a(this.a != null);
        }
    }
    
    public void a(final Context context, final Uri uri) {
        this.a(context, uri, null, 0, false, false);
    }
    
    public void a(final co co) {
        this.c = new WeakReference((T)co);
    }
    
    @Override
    public void a(final boolean b, final MediaServiceTask mediaServiceTask) {
        com.twitter.util.d.a();
        final CropTask cropTask = (CropTask)mediaServiceTask;
        this.d.remove(cropTask);
        co co;
        if (this.c != null) {
            co = (co)this.c.get();
        }
        else {
            co = null;
        }
        if (co != null && !this.isDetached()) {
            if (!b) {
                co.a_(cropTask.a);
                return;
            }
            co.a(cropTask.a, cropTask.b, cropTask.c, cropTask.d);
        }
    }
    
    public boolean a() {
        return this.a != null;
    }
    
    public boolean a(final Context context, final Uri uri, final RectF rectF, final int n) {
        com.twitter.util.d.a();
        final CropTask cropTask = new CropTask(uri, af.a(context, MediaType.b.extension), rectF, n);
        this.d.add(cropTask);
        cropTask.a(context, this);
        return true;
    }
    
    public boolean a(final Context context, final Uri uri, final Uri uri2, final int n, final boolean b, final boolean b2) {
        if (this.b != null) {
            return false;
        }
        (this.b = new cp(this, context.getApplicationContext(), n, b, b2)).execute((Object[])new Uri[] { uri, uri2 });
        return true;
    }
    
    public void b(final co co) {
        if (this.c != null && this.c.get() == co) {
            this.c = null;
        }
    }
    
    public boolean b() {
        return this.b != null;
    }
    
    public boolean c() {
        com.twitter.util.d.a();
        return this.d.size() > 0;
    }
    
    public Bitmap d() {
        return this.a;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d = new ArrayList();
        this.setRetainInstance(true);
    }
    
    @Override
    public void onDestroy() {
        if (this.b != null) {
            this.b.cancel(false);
        }
        if (this.a()) {
            this.a.recycle();
        }
        super.onDestroy();
    }
}
