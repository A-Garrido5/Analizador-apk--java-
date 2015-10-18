// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import java.util.Iterator;
import com.twitter.library.util.bk;
import android.app.Activity;
import com.twitter.library.client.ad;
import com.twitter.android.ac;
import com.twitter.library.client.p;
import java.util.Arrays;
import com.twitter.android.VideoEditorActivity;
import com.twitter.android.EditImageActivity;
import com.twitter.android.media.camera.CameraActivity;
import com.twitter.android.MediaTagActivity;
import java.util.List;
import com.twitter.library.client.af;

public class ay implements af
{
    private static final List a;
    private static ay b;
    private long c;
    private long d;
    private boolean e;
    private boolean f;
    
    static {
        a = Arrays.asList(ComposerActivity.class, MediaTagActivity.class, CameraActivity.class, EditImageActivity.class, VideoEditorActivity.class);
    }
    
    public static ay a() {
        Label_0050: {
            if (ay.b != null) {
                break Label_0050;
            }
            synchronized (ay.class) {
                if (ay.b == null) {
                    ay.b = new ay();
                    p.a().a(new az());
                    ad.a().a(ay.b);
                }
                return ay.b;
            }
        }
    }
    
    @Override
    public void a(final Activity activity) {
        if (this.f) {
            if (!this.e) {
                this.c();
                return;
            }
            this.c += bk.a() - this.d;
        }
    }
    
    public void a(final boolean e) {
        this.c = 0L;
        this.d = bk.a();
        this.e = e;
        this.f = true;
    }
    
    @Override
    public void b(final Activity activity) {
        if (this.f) {
            this.d = bk.a();
        }
    }
    
    public boolean b() {
        return this.f;
    }
    
    public long c() {
        if (this.f) {
            final long n = this.c + bk.a() - this.d;
            this.c = 0L;
            this.d = 0L;
            this.e = false;
            this.f = false;
            return n;
        }
        return -1L;
    }
    
    protected void c(final Activity activity) {
        if (this.f) {
            final Class<? extends Activity> class1 = activity.getClass();
            final Iterator<Class> iterator = (Iterator<Class>)ay.a.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    if (iterator.next().isAssignableFrom(class1)) {
                        final int n = 1;
                        if (n == 0) {
                            this.c();
                        }
                        return;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
}
