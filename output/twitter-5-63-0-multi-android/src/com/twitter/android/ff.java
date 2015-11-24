// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.util.aj;
import android.content.Context;
import android.view.View;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.Intent;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;

public class ff
{
    public final MediaImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public long f;
    public Intent g;
    public String h;
    public TwitterScribeItem i;
    
    ff(final View view) {
        this.e = false;
        this.a = (MediaImageView)view.findViewById(2131886198);
        this.b = (TextView)view.findViewById(2131886313);
        this.c = (TextView)view.findViewById(2131886138);
        this.d = (TextView)view.findViewById(2131887253);
    }
    
    void a(final int n, final int n2, final Context context) {
        int n3 = 2131296953;
        if (this.e && n > 0) {
            switch (n2) {
                case 1: {
                    n3 = 2131296954;
                    break;
                }
            }
            this.d.setText((CharSequence)context.getString(n3, new Object[] { aj.b(context.getResources(), n) }));
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }
    
    void a(final int n, final Context context) {
        int n2 = 2130839446;
        if (!this.e) {
            switch (n) {
                case 2: {
                    n2 = 2130839443;
                    break;
                }
            }
        }
        this.a.setDefaultDrawable(context.getResources().getDrawable(n2));
    }
    
    void a(final Context context, final int n, final int n2) {
        this.a(context, context.getText(n), n2);
    }
    
    void a(final Context context, final CharSequence text, final int n) {
        this.b.setText(text);
        this.b.setTextSize(0, (float)n);
    }
    
    void a(final PromotedContent promotedContent, final Context context) {
        this.e = (promotedContent != null);
        if (promotedContent == null) {
            this.d.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        if (!TextUtils.isEmpty((CharSequence)promotedContent.advertiserName)) {
            this.c.setText((CharSequence)context.getString(2131297492, new Object[] { promotedContent.advertiserName }));
        }
        if (promotedContent.a()) {
            this.c.setCompoundDrawablesWithIntrinsicBounds(2130838723, 0, 0, 0);
            return;
        }
        this.c.setCompoundDrawablesWithIntrinsicBounds(2130838724, 0, 0, 0);
    }
    
    void a(final String text) {
        this.b.setText((CharSequence)text);
    }
    
    void b(final int n, final Context context) {
        this.a.setDefaultDrawable(context.getResources().getDrawable(n));
    }
}
