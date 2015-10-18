// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.support.annotation.IdRes;

public class ac
{
    private final int a;
    @IdRes
    private final int b;
    
    public ac(final int n) {
        this(n, -1);
    }
    
    public ac(final int a, @IdRes final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static RelativeLayout$LayoutParams a(final View view, final ac[][] array, final int n) {
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)view.getLayoutParams();
        final ac[] array2 = (ac[])view.getTag(2131886095);
        if (array2 != null) {
            for (int length = array2.length, i = 0; i < length; ++i) {
                array2[i].b(relativeLayout$LayoutParams);
            }
        }
        final ac[] array3 = array[n];
        for (int length2 = array3.length, j = 0; j < length2; ++j) {
            array3[j].a(relativeLayout$LayoutParams);
        }
        view.setTag(2131886095, (Object)array3);
        return relativeLayout$LayoutParams;
    }
    
    public void a(final RelativeLayout$LayoutParams relativeLayout$LayoutParams) {
        relativeLayout$LayoutParams.addRule(this.a, this.b);
    }
    
    public void b(final RelativeLayout$LayoutParams relativeLayout$LayoutParams) {
        relativeLayout$LayoutParams.addRule(this.a, 0);
    }
}
