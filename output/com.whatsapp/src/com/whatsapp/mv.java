// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.BitmapFactory;
import com.whatsapp.protocol.bi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.ar;

class mv implements ar
{
    final ChatInfoActivity a;
    final int b;
    
    mv(final ChatInfoActivity a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int a() {
        return this.b;
    }
    
    @Override
    public void a(final ImageView imageView, Bitmap decodeResource, final bi bi) {
        final boolean i = App.I;
        if (decodeResource == null) {
            final byte j = bi.I;
            int n = 0;
            Label_0095: {
                switch (j) {
                    case 1: {
                        if (i) {
                            break Label_0095;
                        }
                        n = 2130838904;
                        break;
                    }
                    case 2: {
                        n = 2130838903;
                        if (i) {
                            break Label_0095;
                        }
                        break;
                    }
                    case 3: {
                        n = 2130838911;
                        break;
                    }
                }
            }
            decodeResource = BitmapFactory.decodeResource(App.aq.getResources(), n);
        }
        if (decodeResource != null) {
            imageView.setImageBitmap(decodeResource);
            if (!i) {
                return;
            }
        }
        imageView.setImageResource(2130838904);
    }
}
