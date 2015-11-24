// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.ImageView;
import android.view.View$OnClickListener;

public class i implements View$OnClickListener
{
    private ImageView[] a;
    private int b;
    private Context c;
    private j d;
    
    i(final Context c, final LinearLayout linearLayout, final j d) {
        (this.a = new ImageView[5])[0] = (ImageView)linearLayout.findViewById(2131886257);
        this.a[1] = (ImageView)linearLayout.findViewById(2131886258);
        this.a[2] = (ImageView)linearLayout.findViewById(2131886259);
        this.a[3] = (ImageView)linearLayout.findViewById(2131886260);
        this.a[4] = (ImageView)linearLayout.findViewById(2131886261);
        for (int i = 0; i < 5; ++i) {
            this.a[i].setOnClickListener((View$OnClickListener)this);
        }
        this.b = 0;
        this.d = d;
        this.c = c;
    }
    
    private void a(final int n) {
        final Animation loadAnimation = AnimationUtils.loadAnimation(this.c, 2131034117);
        for (int i = 0; i < n; ++i) {
            this.a[i].setImageResource(2130837618);
            this.a[i].setAnimation(loadAnimation);
        }
    }
    
    private void b(final int b) {
        for (int i = 0; i < 5; ++i) {
            this.a[i].setClickable(false);
        }
        this.a(this.b = b);
        this.d.a(b);
    }
    
    public int a() {
        return this.b;
    }
    
    public void onClick(final View view) {
        int n = 0;
        switch (view.getId()) {
            default: {
                n = 0;
                break;
            }
            case 2131886257: {
                n = 1;
                break;
            }
            case 2131886258: {
                n = 2;
                break;
            }
            case 2131886259: {
                n = 3;
                break;
            }
            case 2131886260: {
                n = 4;
                break;
            }
            case 2131886261: {
                n = 5;
                break;
            }
        }
        if (n != 0) {
            this.b(n);
        }
    }
}
