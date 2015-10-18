// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.AudioManager;

final class f implements e
{
    private final AudioManager a;
    
    private f(final AudioManager a) {
        this.a = a;
    }
    
    @Override
    public int a(final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener, final int n, final int n2) {
        return this.a.requestAudioFocus(audioManager$OnAudioFocusChangeListener, n, n2);
    }
    
    @Override
    public void a(final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener) {
        this.a.abandonAudioFocus(audioManager$OnAudioFocusChangeListener);
    }
}
