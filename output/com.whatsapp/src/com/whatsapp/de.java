// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;

class de implements Runnable
{
    final PhotoView a;
    final a9b b;
    final int c;
    final Bitmap d;
    
    de(final a9b b, final int c, final PhotoView a, final Bitmap d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        Label_0057: {
            Label_0097: {
                switch (this.c) {
                    case 6: {
                        this.a.setRotation(90.0f, false);
                        if (i) {
                            break Label_0097;
                        }
                        break Label_0057;
                    }
                    case 3: {
                        this.a.setRotation(180.0f, false);
                        if (i) {
                            break Label_0097;
                        }
                        break Label_0057;
                    }
                    case 8: {
                        this.a.setRotation(270.0f, false);
                        if (i) {
                            break;
                        }
                        break Label_0057;
                    }
                }
            }
            this.a.setRotation(0.0f, false);
        }
        this.a.a(this.d);
    }
}
