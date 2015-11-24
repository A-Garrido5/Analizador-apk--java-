// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Context;
import android.view.View$OnTouchListener;
import com.twitter.library.util.bo;
import com.twitter.library.featureswitch.d;
import android.widget.TextView;

public class al extends am
{
    private TextView r;
    
    public al(final l l) {
        super(l, 2130968916);
    }
    
    @Override
    protected float a(final vj vj) {
        if (!this.a) {
            return 1.0f;
        }
        if (com.twitter.library.featureswitch.d.a("card_registry_native_summary_to_website_android_2882", new String[] { "final_summary_and_website" })) {
            return 2.0f;
        }
        return 2.5f;
    }
    
    @Override
    public void a(final long n, final vc vc) {
        super.a(n, vc);
        if (this.r != null) {
            final String a = wb.a("description", vc);
            this.r.setTextSize(0, bo.a);
            if (a != null) {
                this.r.setText((CharSequence)a);
                this.r.setTag((Object)"description");
                this.r.setOnTouchListener((View$OnTouchListener)this.k);
            }
        }
    }
    
    @Override
    protected void a(final Context context, final DisplayMode displayMode) {
        super.a(context, displayMode);
        this.r = (TextView)this.m.findViewById(2131887000);
    }
    
    @Override
    protected String b() {
        return "summary_photo_image";
    }
}
