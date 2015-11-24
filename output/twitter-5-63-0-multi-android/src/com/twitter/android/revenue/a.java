// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

public class a
{
    private static View a(final Context context, final int imageResource, final int rightMargin) {
        final ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageResource);
        final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
        layoutParams.rightMargin = rightMargin;
        imageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        return (View)imageView;
    }
    
    public static void a(final Context context, final LinearLayout linearLayout, final int n, final int n2, final int n3, final int n4, final float n5, final float n6) {
        b(context, linearLayout, n, n2, n3, n4, n5, n6);
    }
    
    private static void b(final Context context, final LinearLayout linearLayout, final int n, final int n2, final int n3, final int n4, final float n5, final float n6) {
        linearLayout.removeAllViews();
        double n7;
        int n8;
        View a;
        int n9;
        for (n7 = Math.round(2.0f * n5) / 2.0, n8 = 0; n8 + 1 <= n7; n8 = n9) {
            a = a(context, n, n4);
            n9 = n8 + 1;
            linearLayout.addView(a, n8);
        }
        int n10;
        if (n7 != (int)n7) {
            final View a2 = a(context, n2, n4);
            n10 = n8 + 1;
            linearLayout.addView(a2, n8);
        }
        else {
            n10 = n8;
        }
        while (n10 < n6) {
            final View a3 = a(context, n3, n4);
            final int n11 = n10 + 1;
            linearLayout.addView(a3, n10);
            n10 = n11;
        }
    }
}
