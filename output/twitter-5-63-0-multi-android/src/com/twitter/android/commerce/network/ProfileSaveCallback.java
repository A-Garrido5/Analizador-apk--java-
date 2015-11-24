// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.network;

import com.twitter.internal.android.service.a;
import android.os.Bundle;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

public class ProfileSaveCallback extends z
{
    private final WeakReference a;
    private ProfileSaveCallback$RequestType b;
    private boolean c;
    
    public ProfileSaveCallback(final h h, final ProfileSaveCallback$RequestType b) {
        this.a = new WeakReference((T)h);
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        boolean b = true;
        if (!this.c) {
            final aa aa = (aa)y.l().b();
            final Bundle bundle = aa.c.getBundle("commerce_error_list_bundle");
            final h h = (h)this.a.get();
            if (h != null && !h.isFinishing()) {
                if (this.b == ProfileSaveCallback$RequestType.a) {
                    if (bundle == null) {
                        b = false;
                    }
                    if (!b) {
                        h.a_(aa.c.getBundle("address_signature_bundle"));
                        return;
                    }
                    h.e(bundle);
                }
                else {
                    final Bundle bundle2 = aa.c.getBundle("store_profile_bundle");
                    int n;
                    if (bundle2 == null || (bundle2 != null && !bundle2.getBoolean("storeprofile_bundle_success"))) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        h.f(bundle);
                        return;
                    }
                    h.d(bundle2);
                }
            }
        }
    }
}
