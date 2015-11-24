// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.media.AudioManager$OnAudioFocusChangeListener;

class c implements AudioManager$OnAudioFocusChangeListener
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    public void onAudioFocusChange(final int c) {
        switch (c) {
            case -2: {
                this.a.a.b();
                this.a.b = false;
                break;
            }
            case -3: {
                this.a.a.c();
                break;
            }
            case 1: {
                if (this.a.c == -3) {
                    this.a.a.d();
                }
                else {
                    this.a.a.a();
                }
                this.a.b = true;
                break;
            }
            case -1: {
                this.a.a.b();
                this.a.b();
                break;
            }
        }
        this.a.c = c;
    }
}
