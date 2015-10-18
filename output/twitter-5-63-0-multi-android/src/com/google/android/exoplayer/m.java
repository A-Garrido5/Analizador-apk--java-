// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.exoplayer.audio.AudioTrack$InitializationException;
import android.os.Handler;
import com.google.android.exoplayer.audio.AudioTrack;
import android.annotation.TargetApi;

@TargetApi(16)
public class m extends MediaCodecTrackRenderer
{
    private final o c;
    private final AudioTrack d;
    private int e;
    private long f;
    
    public m(final ah ah, final ad ad, final boolean b, final Handler handler, final o o) {
        this(ah, ad, b, handler, o, new AudioTrack());
    }
    
    public m(final ah ah, final ad ad, final boolean b, final Handler handler, final o c, final AudioTrack audioTrack) {
        super(ah, ad, b, handler, c);
        this.c = c;
        this.d = (AudioTrack)ae.a(audioTrack);
        this.e = 0;
    }
    
    public m(final ah ah, final Handler handler, final o o) {
        this(ah, null, true, handler, o);
    }
    
    private void a(final AudioTrack$InitializationException ex) {
        if (this.b != null && this.c != null) {
            this.b.post((Runnable)new n(this, ex));
        }
    }
    
    protected void a(final int n) {
    }
    
    @Override
    public void a(final int n, final Object o) {
        if (n == 1) {
            this.d.a((float)o);
            return;
        }
        super.a(n, o);
    }
    
    @Override
    protected void a(final long n) {
        super.a(n);
        this.d.h();
        this.f = Long.MIN_VALUE;
    }
    
    @Override
    protected void a(final long n, final boolean b) {
        super.a(n, b);
        this.f = Long.MIN_VALUE;
    }
    
    @Override
    protected void a(final MediaFormat mediaFormat) {
        this.d.a(mediaFormat);
    }
    
    @Override
    protected boolean a() {
        return true;
    }
    
    @Override
    protected boolean a(final long n, final long n2, final MediaCodec mediaCodec, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final int n3, final boolean b) {
        if (b) {
            mediaCodec.releaseOutputBuffer(n3, false);
            final a a = this.a;
            ++a.f;
            this.d.d();
            return true;
        }
        while (true) {
            if (!this.d.a()) {
                try {
                    if (this.e != 0) {
                        this.d.a(this.e);
                    }
                    else {
                        this.a(this.e = this.d.b());
                    }
                    if (this.q() == 3) {
                        this.d.c();
                    }
                    final int a2 = this.d.a(byteBuffer, mediaCodec$BufferInfo.offset, mediaCodec$BufferInfo.size, mediaCodec$BufferInfo.presentationTimeUs);
                    if ((a2 & 0x1) != 0x0) {
                        this.f = Long.MIN_VALUE;
                    }
                    if ((a2 & 0x2) != 0x0) {
                        mediaCodec.releaseOutputBuffer(n3, false);
                        final a a3 = this.a;
                        ++a3.e;
                        return true;
                    }
                }
                catch (AudioTrack$InitializationException ex) {
                    this.a(ex);
                    throw new ExoPlaybackException(ex);
                }
                return false;
            }
            continue;
        }
    }
    
    @Override
    protected boolean a(final String s) {
        return af.b(s) && super.a(s);
    }
    
    @Override
    protected void b() {
        super.b();
        this.d.c();
    }
    
    @Override
    protected void c() {
        this.d.g();
        super.c();
    }
    
    @Override
    protected boolean d() {
        return super.d() && (!this.d.e() || !this.d.f());
    }
    
    @Override
    protected boolean e() {
        return this.d.e() || (super.e() && this.p() == 2);
    }
    
    @Override
    protected long f() {
        final long a = this.d.a(this.d());
        if (a == Long.MIN_VALUE) {
            this.f = Math.max(this.f, super.f());
        }
        else {
            this.f = Math.max(this.f, a);
        }
        return this.f;
    }
    
    @Override
    protected void g() {
        this.e = 0;
        try {
            this.d.h();
        }
        finally {
            super.g();
        }
    }
}
