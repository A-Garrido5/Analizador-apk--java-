// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.units.Unit;
import com.twitter.util.units.bitrate.KilobitsPerSecond;
import com.twitter.util.n;
import com.twitter.util.platform.TwRadioType;
import com.twitter.internal.network.r;
import com.twitter.internal.network.e;
import com.twitter.util.platform.i;
import com.twitter.library.client.y;
import com.twitter.util.units.duration.Minutes;
import com.twitter.util.units.data.Kibibytes;
import com.twitter.util.m;
import com.twitter.internal.network.l;
import com.twitter.util.units.duration.Duration;
import com.twitter.util.units.data.Data;
import com.twitter.util.units.duration.Milliseconds;
import com.twitter.util.units.data.Bytes;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.d;

class f implements d
{
    final /* synthetic */ c a;
    
    f(final c a) {
        this.a = a;
    }
    
    @Override
    public void a(final HttpOperation httpOperation) {
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final Exception ex) {
    }
    
    @Override
    public void b(final HttpOperation httpOperation) {
        final l l = httpOperation.l();
        final Bytes bytes = new Bytes(httpOperation.f());
        final Milliseconds milliseconds = new Milliseconds(httpOperation.g());
        final Bytes bytes2 = new Bytes(l.i);
        final Milliseconds milliseconds2 = new Milliseconds(l.f);
        final Milliseconds milliseconds3 = new Milliseconds(l.t[3]);
        this.a.a(bytes, milliseconds, this.a.f);
        this.a.a(bytes2, milliseconds2, this.a.g);
        this.a.a(milliseconds3);
    }
}
