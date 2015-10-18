// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.media.manager.aq;
import com.twitter.library.media.manager.aj;
import com.twitter.library.media.manager.q;
import android.text.TextUtils;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.manager.ResourceResponse;
import android.content.Context;
import java.util.concurrent.Future;
import com.twitter.library.media.manager.ap;
import com.twitter.library.av.playback.p;
import com.twitter.library.media.manager.ar;
import com.twitter.android.vineloops.a;

public class m implements al, a, ar
{
    private final p a;
    private ap b;
    private VideoPlayerView c;
    private Future d;
    
    public m() {
        this.a = p.a();
    }
    
    private void a(final String s) {
        this.a.b();
        if (this.c != null) {
            this.c.a(s);
        }
    }
    
    @Override
    public void a() {
        synchronized (this) {
            this.b = null;
            if (this.d != null) {
                this.d.cancel(true);
                this.d = null;
            }
            if (this.c != null) {
                this.c.e();
                this.c = null;
            }
        }
    }
    
    @Override
    public void a(final Context context, final VideoPlayerView c) {
        this.c = c;
    }
    
    @Override
    public void a(final ResourceResponse resourceResponse) {
        synchronized (this) {
            if (this.b != null) {
                this.b = null;
                final VideoFile videoFile = (VideoFile)resourceResponse.c();
                if (videoFile != null && videoFile.file != null) {
                    final String absolutePath = videoFile.file.getAbsolutePath();
                    if (!TextUtils.isEmpty((CharSequence)absolutePath)) {
                        this.a(absolutePath);
                    }
                }
            }
        }
    }
    
    @Override
    public boolean a(final Context context, final String s) {
        synchronized (this) {
            final boolean empty = TextUtils.isEmpty((CharSequence)s);
            boolean b = false;
            if (!empty) {
                if (this.c != null) {
                    this.c.a(context);
                }
                final aq a = ap.a(s);
                a.a(this);
                this.b = a.a();
                this.d = q.a(context.getApplicationContext()).e().b(this.b);
                final boolean done = this.d.isDone();
                b = false;
                if (!done) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    @Override
    public void h() {
        if (this.c != null) {
            this.c.b();
            this.c.c();
        }
    }
}
