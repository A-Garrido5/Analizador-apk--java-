// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import com.whatsapp.ym;
import android.text.format.DateUtils;
import android.os.Message;
import android.os.Handler;

class u extends Handler
{
    final CameraActivity a;
    
    u(final CameraActivity a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean m = CameraActivity.m;
        if (CameraActivity.j(this.a).g()) {
            CameraActivity.t(this.a).setText((CharSequence)DateUtils.formatElapsedTime((long)(int)((System.currentTimeMillis() - CameraActivity.p(this.a)) / 1000L)));
            CameraActivity.o(this.a).sendEmptyMessageDelayed(0, 50L);
            Label_0138: {
                if (CameraActivity.l(this.a) != null) {
                    final long length = CameraActivity.l(this.a).length();
                    if (length > 1048576L * ym.k) {
                        CameraActivity.a(this.a, true);
                        if (!m) {
                            break Label_0138;
                        }
                    }
                    CameraActivity.m(this.a).setProgress((int)(length * 100L / (1048576L * ym.k)));
                }
            }
            if (!m) {
                return;
            }
        }
        CameraActivity.t(this.a).setVisibility(8);
        CameraActivity.m(this.a).setVisibility(8);
    }
}
