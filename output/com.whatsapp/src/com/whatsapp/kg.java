// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import com.whatsapp.util.Log;
import android.text.format.DateUtils;
import android.os.Message;
import android.os.Handler;

class kg extends Handler
{
    private static final String z;
    final MediaView a;
    
    static {
        final char[] charArray = "0A{Gj+MzY$<Q{GdrWzZ+)K?]\u007f2T?]\u007f<Pj]".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000b';
                    break;
                }
                case 0: {
                    c2 = ']';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = '\u001f';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    kg(final MediaView a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        if (MediaView.q(this.a) != null) {
            Label_0139: {
                if (MediaView.u(this.a) == 4) {
                    if (MediaView.b(this.a).a() > 0) {
                        final int min = Math.min(MediaView.q(this.a).i(), MediaView.b(this.a).a());
                        if (MediaView.r(this.a) / 1000 != min / 1000) {
                            MediaView.e(this.a).setText((CharSequence)DateUtils.formatElapsedTime((long)(min / 1000)));
                            MediaView.h(this.a, min);
                        }
                        MediaView.b(this.a).setProgress(min);
                        if (!i) {
                            break Label_0139;
                        }
                    }
                    this.a.a(2131231095);
                }
            }
            if (!this.a.isFinishing() && MediaView.u(this.a) == 4 && MediaView.q(this.a).f()) {
                MediaView.t(this.a).sendEmptyMessageDelayed(0, 50L);
                if (!i) {
                    return;
                }
            }
            if (MediaView.u(this.a) != 5) {
                Log.i(kg.z);
                MediaView.b(this.a).setProgress(MediaView.b(this.a).a());
                MediaView.e(this.a).setText((CharSequence)DateUtils.formatElapsedTime((long)(MediaView.q(this.a).e() / 1000)));
                MediaView.a(this.a, 5);
                MediaView.m(this.a).setImageDrawable((Drawable)new m(this.a.getResources().getDrawable(2130838954)));
            }
        }
    }
}
