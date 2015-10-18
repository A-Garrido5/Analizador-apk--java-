// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.media.MediaFormat;

public abstract class an extends ao
{
    private static final String[] b;
    protected StringBuilder a;
    
    static {
        b = new String[] { "INIT", "TRANSCODING_SETUP", "TRANSCODING_START", "READING_FINISHED", "TRANSFER_FINISHED", "TRANSCODING_FINISHED", "TRANSCODING_ERROR", "TRANSCODING_OK" };
    }
    
    public an() {
        this.a = new StringBuilder();
    }
    
    @Override
    public ao a(final int n, final int n2) {
        return this.a("STATE: " + an.b[n] + " -> " + an.b[n2]);
    }
    
    @Override
    public ao a(final Exception ex) {
        return this.a(ao.b(ex));
    }
    
    @Override
    public abstract ao a(final String p0);
    
    @Override
    public ao a(final String s, final String s2, final MediaFormat mediaFormat) {
        return this.a("Video Format '" + s + "': " + s2 + ' ' + mediaFormat.toString());
    }
    
    @Override
    public ao b(final String s) {
        return this.a("STEP: '" + s + "'");
    }
}
