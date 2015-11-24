// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.content.Context;

public class x
{
    public static void a(final Context context, final ImageView imageView, final ImageView imageView2, final boolean b, final boolean b2, final boolean b3) {
        if (imageView != null) {
            if (b) {
                imageView.setImageResource(2130839214);
                imageView.setContentDescription((CharSequence)context.getString(2131297090));
                imageView.setVisibility(0);
                imageView.setOnClickListener((View$OnClickListener)new y(context));
            }
            else if (b3) {
                imageView.setImageResource(2130839208);
                imageView.setContentDescription((CharSequence)context.getString(2131297089));
                imageView.setColorFilter(context.getResources().getColor(2131689540));
                imageView.setVisibility(0);
            }
            else {
                imageView.setVisibility(8);
            }
        }
        if (imageView2 != null) {
            if (!b2) {
                imageView2.setVisibility(8);
                return;
            }
            imageView2.setImageResource(2130839213);
            imageView2.setVisibility(0);
        }
    }
}
