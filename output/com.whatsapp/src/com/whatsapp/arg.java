// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class arg implements AdapterView$OnItemClickListener
{
    private static final String z;
    final MediaGallery a;
    
    static {
        final char[] charArray = "},$%\u0005h4".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '`';
                    break;
                }
                case 0: {
                    c2 = '\u001a';
                    break;
                }
                case 1: {
                    c2 = 'M';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = 'I';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    arg(final MediaGallery a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final bi a = MediaGallery.d(this.a).a(n);
        if (MediaGallery.e(this.a) != null) {
            MediaGallery.a(this.a, a, view);
            if (!MediaGallery.b(this.a).isEmpty()) {
                return;
            }
            MediaGallery.e(this.a).finish();
            if (!App.I) {
                return;
            }
        }
        this.a.startActivity(MediaView.a(a, MediaGallery.g(this.a), (Context)this.a, view).putExtra(arg.z, true));
        if (a.I == 1 && MediaView.c()) {
            this.a.overridePendingTransition(0, 0);
        }
    }
}
