// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

class ch implements SensorEventListener
{
    private boolean a;
    final b4 b;
    final k c;
    
    ch(final k c, final b4 b) {
        this.c = c;
        this.b = b;
    }
    
    public void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public void onSensorChanged(final SensorEvent sensorEvent) {
        final float n = sensorEvent.values[0];
        final float n2 = fcmpg(n, 5.0f);
        boolean a = false;
        if (n2 < 0) {
            final float n3 = fcmpl(n, k.a(this.c).getMaximumRange());
            a = false;
            if (n3 != 0) {
                a = true;
            }
        }
        if (a != this.a) {
            this.a = a;
            this.b.a(a);
        }
    }
}
