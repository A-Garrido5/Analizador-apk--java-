// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager$SimpleOnPageChangeListener;

class a9 extends ViewPager$SimpleOnPageChangeListener
{
    final a3 a;
    final GalleryPicker b;
    
    a9(final GalleryPicker b, final a3 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void onPageSelected(final int n) {
        super.onPageSelected(n);
        this.a.a(n);
        Label_0059: {
            switch (n) {
                case 0: {
                    GalleryPicker.a(this.b, 1);
                    if (MediaGalleryBase.v != 0) {
                        break Label_0059;
                    }
                    break;
                }
                case 1: {
                    GalleryPicker.a(this.b, 4);
                    break;
                }
            }
        }
        this.b.invalidateOptionsMenu();
    }
}
