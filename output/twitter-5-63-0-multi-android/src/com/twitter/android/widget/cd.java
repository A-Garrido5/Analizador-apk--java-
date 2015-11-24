// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.manager.g;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.a;

class cd implements Runnable
{
    final /* synthetic */ a a;
    final /* synthetic */ String b;
    final /* synthetic */ Bitmap c;
    final /* synthetic */ cc d;
    
    cd(final cc d, final a a, final String b, final Bitmap c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        try {
            this.a.a(this.b, this.c, this.d);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
        }
    }
}
