// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.hardware.Camera$Size;
import java.util.Comparator;

class x implements Comparator
{
    final CameraView a;
    
    x(final CameraView a) {
        this.a = a;
    }
    
    public int a(final Camera$Size camera$Size, final Camera$Size camera$Size2) {
        final int n = camera$Size.width * camera$Size.height;
        final int n2 = camera$Size2.width * camera$Size2.height;
        if (n > n2) {
            return -1;
        }
        if (n == n2) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((Camera$Size)o, (Camera$Size)o2);
    }
}
