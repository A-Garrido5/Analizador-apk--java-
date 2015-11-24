// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.Sensor;

public final class k
{
    private static final String z;
    private final Sensor a;
    private final SensorManager b;
    private SensorEventListener c;
    
    static {
        final char[] charArray = "\u00022\u000eS@\u0003".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '/';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = 'W';
                    break;
                }
                case 2: {
                    c2 = '`';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public k(final Context context) {
        this.b = (SensorManager)context.getSystemService(k.z);
        this.a = this.b.getDefaultSensor(8);
    }
    
    static Sensor a(final k k) {
        return k.a;
    }
    
    public void a(final b4 b4) {
        if (this.c != null) {
            this.b.unregisterListener(this.c, this.a);
            this.c = null;
        }
        if (b4 != null) {
            this.c = (SensorEventListener)new ch(this, b4);
            this.b.registerListener(this.c, this.a, 2);
        }
    }
}
