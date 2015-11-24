// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.RatingBar;
import android.widget.RatingBar$OnRatingBarChangeListener;

class a_i implements RatingBar$OnRatingBarChangeListener
{
    final CallRatingActivity a;
    
    a_i(final CallRatingActivity a) {
        this.a = a;
    }
    
    public void onRatingChanged(final RatingBar ratingBar, final float n, final boolean b) {
        final String[] stringArray = this.a.getResources().getStringArray(2131689496);
        Label_0074: {
            if (n > 0.0f && n <= stringArray.length) {
                CallRatingActivity.e(this.a).setText((CharSequence)stringArray[-1 + (int)n]);
                CallRatingActivity.e(this.a).setVisibility(0);
                if (!App.I) {
                    break Label_0074;
                }
            }
            CallRatingActivity.e(this.a).setVisibility(4);
        }
        CallRatingActivity.b(this.a);
    }
}
