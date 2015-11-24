// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.bitrate;

import com.twitter.util.units.Unit;
import com.twitter.util.units.duration.Seconds;
import com.twitter.util.units.data.Kilobits;
import com.twitter.util.units.duration.Duration;
import com.twitter.util.units.data.Data;

public class KilobitsPerSecond extends Bitrate
{
    public static final KilobitsPerSecond a;
    public static final KilobitsPerSecond b;
    
    static {
        a = new KilobitsPerSecond(0.0);
        b = new KilobitsPerSecond(1.0);
    }
    
    public KilobitsPerSecond(final double n) {
        super(n);
    }
    
    public KilobitsPerSecond(final Data data, final Duration duration) {
        super(new Kilobits(data).doubleValue() / new Seconds(duration).doubleValue());
    }
    
    public KilobitsPerSecond b() {
        return KilobitsPerSecond.b;
    }
}
