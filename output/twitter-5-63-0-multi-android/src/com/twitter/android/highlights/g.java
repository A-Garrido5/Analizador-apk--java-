// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import java.util.List;

public class g extends af
{
    public final boolean a;
    private int b;
    private int c;
    private h d;
    
    public g(final boolean a) {
        super("IntroStory", 2147483647L, 0, new mx(0, 0, null), true, null, null);
        this.b = 1;
        this.c = -1;
        this.a = a;
    }
    
    @Override
    public int a() {
        return 10;
    }
    
    @Override
    public Intent a(final Context context) {
        return null;
    }
    
    @Override
    public ag a(final View view) {
        return new i(view);
    }
    
    public void a(final int b) {
        if (b != this.b) {
            this.c = this.b;
            this.b = b;
        }
    }
    
    public void a(final i i, final Context context) {
        if (this.d == null) {
            this.d = new h(context, this, i);
        }
        else {
            this.d.a(i);
        }
        i.c.setOnPreparedListener((MediaPlayer$OnPreparedListener)this.d);
        i.c.setOnCompletionListener((MediaPlayer$OnCompletionListener)this.d);
        i.c.setOnErrorListener((MediaPlayer$OnErrorListener)this.d);
        i.c.setVideoPath("android.resource://com.twitter.android/2131230725");
    }
    
    @Override
    public String b() {
        return null;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public void e() {
        this.c = this.b;
    }
}
