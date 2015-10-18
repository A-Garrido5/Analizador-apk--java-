// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.units.bitrate.KilobitsPerSecond;
import com.twitter.util.platform.TwRadioType;

class i
{
    public static KilobitsPerSecond a(final TwRadioType twRadioType) {
        switch (j.a[twRadioType.ordinal()]) {
            default: {
                return new KilobitsPerSecond(1000.0);
            }
            case 1: {
                return KilobitsPerSecond.a;
            }
            case 2: {
                return new KilobitsPerSecond(14.0);
            }
            case 3: {
                return new KilobitsPerSecond(25.0);
            }
            case 4: {
                return new KilobitsPerSecond(50.0);
            }
            case 5: {
                return new KilobitsPerSecond(50.0);
            }
            case 6: {
                return new KilobitsPerSecond(100.0);
            }
            case 7: {
                return new KilobitsPerSecond(400.0);
            }
            case 8: {
                return new KilobitsPerSecond(400.0);
            }
            case 9: {
                return new KilobitsPerSecond(600.0);
            }
            case 10: {
                return new KilobitsPerSecond(700.0);
            }
            case 11: {
                return new KilobitsPerSecond(1000.0);
            }
            case 12: {
                return new KilobitsPerSecond(1000.0);
            }
            case 13: {
                return new KilobitsPerSecond(2000.0);
            }
            case 14: {
                return new KilobitsPerSecond(5000.0);
            }
            case 15: {
                return new KilobitsPerSecond(10000.0);
            }
            case 16: {
                return new KilobitsPerSecond(10000.0);
            }
        }
    }
    
    public static KilobitsPerSecond b(final TwRadioType twRadioType) {
        switch (j.a[twRadioType.ordinal()]) {
            default: {
                return new KilobitsPerSecond(500.0);
            }
            case 1: {
                return KilobitsPerSecond.a;
            }
            case 2: {
                return new KilobitsPerSecond(14.0);
            }
            case 3: {
                return new KilobitsPerSecond(15.0);
            }
            case 6: {
                return new KilobitsPerSecond(25.0);
            }
            case 4: {
                return new KilobitsPerSecond(50.0);
            }
            case 5: {
                return new KilobitsPerSecond(50.0);
            }
            case 7: {
                return new KilobitsPerSecond(50.0);
            }
            case 8: {
                return new KilobitsPerSecond(128.0);
            }
            case 13: {
                return new KilobitsPerSecond(300.0);
            }
            case 14: {
                return new KilobitsPerSecond(600.0);
            }
            case 9: {
                return new KilobitsPerSecond(500.0);
            }
            case 10: {
                return new KilobitsPerSecond(500.0);
            }
            case 11: {
                return new KilobitsPerSecond(500.0);
            }
            case 12: {
                return new KilobitsPerSecond(1000.0);
            }
            case 15: {
                return new KilobitsPerSecond(10000.0);
            }
            case 16: {
                return new KilobitsPerSecond(10000.0);
            }
        }
    }
}
