// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.units.Unit;
import com.twitter.util.units.bitrate.KilobitsPerSecond;
import com.twitter.util.units.data.Data;
import com.twitter.util.platform.TwRadioType;
import com.twitter.internal.network.r;
import com.twitter.internal.network.e;
import com.twitter.util.platform.i;
import com.twitter.library.client.y;
import com.twitter.util.units.duration.Minutes;
import com.twitter.util.units.duration.Duration;
import com.twitter.util.units.duration.Milliseconds;
import com.twitter.util.units.data.Kibibytes;
import com.twitter.util.platform.l;
import com.twitter.util.platform.j;
import com.twitter.library.client.z;
import com.twitter.util.m;
import com.twitter.util.n;

class d implements n
{
    final /* synthetic */ m a;
    final /* synthetic */ c b;
    
    d(final c b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final z z) {
        this.b.a(new j(z.a));
        this.a.b(this);
    }
}
