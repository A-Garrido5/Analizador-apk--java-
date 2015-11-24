// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

class a97 implements SensorEventListener
{
    final up a;
    
    a97(final up a) {
        this.a = a;
    }
    
    public void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public void onSensorChanged(final SensorEvent sensorEvent) {
        final boolean i = App.I;
        if (up.n == null) {
            this.a.a(false);
            up.d(this.a);
            if (!i) {
                return;
            }
        }
        if (up.n != this.a) {
            up.d(this.a);
            if (!i) {
                return;
            }
        }
        final float n = sensorEvent.values[0];
        if (n >= 5.0f || n == up.e(this.a).getMaximumRange()) {
            this.a.a(false);
            if (!i) {
                return;
            }
        }
        this.a.a(true);
    }
}
