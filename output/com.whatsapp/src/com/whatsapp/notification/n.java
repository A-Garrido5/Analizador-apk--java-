// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.util.Log;
import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

class n implements SensorEventListener
{
    private static final String z;
    final PopupNotification a;
    
    static {
        final char[] charArray = "L(\u001e<NR(\u001a XU$\u000f=WS)A9LS?\u0007$WH>T".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '>';
                    break;
                }
                case 0: {
                    c2 = '<';
                    break;
                }
                case 1: {
                    c2 = 'G';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'I';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    n(final PopupNotification a) {
        this.a = a;
    }
    
    public void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public void onSensorChanged(final SensorEvent sensorEvent) {
        PopupNotification.a(this.a, sensorEvent.values[0]);
        Log.i(n.z + PopupNotification.a(this.a));
    }
}
