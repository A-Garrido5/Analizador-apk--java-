// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaFormat;
import android.media.MediaExtractor;
import java.util.Map;
import android.net.Uri;
import android.content.Context;
import android.annotation.TargetApi;

@TargetApi(16)
public final class k implements ah
{
    private final Context a;
    private final Uri b;
    private final Map c;
    private MediaExtractor d;
    private ai[] e;
    private boolean f;
    private int g;
    private int[] h;
    private boolean[] i;
    private long j;
    
    public k(final Context a, final Uri b, final Map c, final int g) {
        ae.b(ai.a >= 16);
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
    }
    
    @TargetApi(18)
    private Map e() {
        Map psshInfo = this.d.getPsshInfo();
        if (psshInfo == null || psshInfo.isEmpty()) {
            psshInfo = null;
        }
        return psshInfo;
    }
    
    @Override
    public int a(final int n, final long n2, final af af, final ag ag, final boolean b) {
        int n3 = -2;
        ae.b(this.f);
        ae.b(this.h[n] != 0);
        if (this.i[n]) {
            this.i[n] = false;
            n3 = -5;
        }
        else if (!b) {
            if (this.h[n] != 2) {
                af.a = com.google.android.exoplayer.ae.a(this.d.getTrackFormat(n));
                Map e;
                if (ai.a >= 18) {
                    e = this.e();
                }
                else {
                    e = null;
                }
                af.b = e;
                this.h[n] = 2;
                return -4;
            }
            final int sampleTrackIndex = this.d.getSampleTrackIndex();
            if (sampleTrackIndex == n) {
                if (ag.b != null) {
                    final int position = ag.b.position();
                    ag.c = this.d.readSampleData(ag.b, position);
                    ag.b.position(position + ag.c);
                }
                else {
                    ag.c = 0;
                }
                ag.e = this.d.getSampleTime();
                ag.d = this.d.getSampleFlags();
                if ((0x2 & ag.d) != 0x0) {
                    ag.a.a(this.d);
                }
                this.j = -1L;
                this.d.advance();
                return -3;
            }
            int n4;
            if (sampleTrackIndex < 0) {
                n4 = -1;
            }
            else {
                n4 = n3;
            }
            return n4;
        }
        return n3;
    }
    
    @Override
    public ai a(final int n) {
        ae.b(this.f);
        return this.e[n];
    }
    
    @Override
    public void a(final int n, final long n2) {
        ae.b(this.f);
        ae.b(this.h[n] == 0);
        this.h[n] = 1;
        this.d.selectTrack(n);
        this.b(n2);
    }
    
    @Override
    public boolean a() {
        if (!this.f) {
            (this.d = new MediaExtractor()).setDataSource(this.a, this.b, this.c);
            this.h = new int[this.d.getTrackCount()];
            this.i = new boolean[this.h.length];
            this.e = new ai[this.h.length];
            for (int i = 0; i < this.h.length; ++i) {
                final MediaFormat trackFormat = this.d.getTrackFormat(i);
                long long1;
                if (trackFormat.containsKey("durationUs")) {
                    long1 = trackFormat.getLong("durationUs");
                }
                else {
                    long1 = -1L;
                }
                this.e[i] = new ai(trackFormat.getString("mime"), long1);
            }
            this.f = true;
        }
        return true;
    }
    
    @Override
    public boolean a(final long n) {
        return true;
    }
    
    @Override
    public int b() {
        ae.b(this.f);
        return this.h.length;
    }
    
    @Override
    public void b(final int n) {
        ae.b(this.f);
        ae.b(this.h[n] != 0);
        this.d.unselectTrack(n);
        this.i[n] = false;
        this.h[n] = 0;
    }
    
    @Override
    public void b(final long j) {
        int i = 0;
        ae.b(this.f);
        if (this.j != j) {
            this.j = j;
            this.d.seekTo(j, 0);
            while (i < this.h.length) {
                if (this.h[i] != 0) {
                    this.i[i] = true;
                }
                ++i;
            }
        }
    }
    
    @Override
    public long c() {
        ae.b(this.f);
        final long cachedDuration = this.d.getCachedDuration();
        if (cachedDuration == -1L) {
            return -1L;
        }
        return cachedDuration + this.d.getSampleTime();
    }
    
    @Override
    public void d() {
        ae.b(this.g > 0);
        final int g = -1 + this.g;
        this.g = g;
        if (g == 0) {
            this.d.release();
            this.d = null;
        }
    }
}
