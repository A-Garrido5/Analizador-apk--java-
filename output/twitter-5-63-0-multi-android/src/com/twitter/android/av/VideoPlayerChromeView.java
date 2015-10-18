// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.control.e;
import android.content.Context;

public class VideoPlayerChromeView extends BaseVideoPlayerChromeView
{
    public VideoPlayerChromeView(final Context context) {
        this(context, new e());
    }
    
    public VideoPlayerChromeView(final Context context, final e e) {
        super(context, e);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.b.layout(n, n4 - this.b.getHeight(), n3, n4);
        final int n5 = (n4 - n2 + this.d.getHeight()) / 2;
        final int n6 = n5 - this.d.getHeight();
        final int n7 = (n3 - n - this.d.getWidth()) / 2;
        int n8;
        int n9;
        if (n7 > 0) {
            n8 = n + n7;
            n9 = n3 - n7;
        }
        else {
            n9 = n3;
            n8 = n;
        }
        this.d.layout(n8, n6, n9, n5);
        this.j.a(b, n, n2, n3, n4);
    }
}
