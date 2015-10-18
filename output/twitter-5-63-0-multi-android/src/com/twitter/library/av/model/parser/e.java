// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.parser;

import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.internal.network.l;
import java.io.InputStream;
import android.content.Context;
import com.twitter.library.av.model.Video;
import com.twitter.internal.network.j;

public abstract class e implements j
{
    public Video[] a;
    public int b;
    public boolean c;
    public boolean d;
    protected int e;
    
    public e(final Context context, final int e) {
        this.e = e;
    }
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        if (n == 200) {
            try {
                this.a(inputStream);
                if (!this.a() && this.c) {
                    this.b = lg.av_playback_forbidden_device;
                    this.a = null;
                    return;
                }
                if (this.a() && this.d) {
                    this.b = lg.av_playback_forbidden_device;
                    this.a = null;
                }
                return;
            }
            catch (Exception ex) {
                this.a = null;
                return;
            }
        }
        if (n == 403) {
            this.a = null;
            this.b = lg.av_playback_forbidden;
        }
    }
    
    @Override
    public void a(final l l) {
        this.a = null;
    }
    
    protected abstract void a(final InputStream p0);
    
    protected boolean a() {
        return TelephonyUtil.f();
    }
    
    public int b() {
        return this.e;
    }
}
