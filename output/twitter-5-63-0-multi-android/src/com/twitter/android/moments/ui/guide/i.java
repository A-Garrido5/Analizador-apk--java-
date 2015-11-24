// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import com.twitter.library.api.moments.Moment;
import com.twitter.library.media.manager.k;
import com.twitter.android.moments.viewmodels.ListMomentModule;
import android.view.View;
import android.widget.ImageView;
import com.twitter.internal.android.widget.RichImageView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;

class i
{
    private final MediaImageView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final Button e;
    
    public i(final ViewGroup viewGroup) {
        final RichImageView richImageView = new RichImageView(viewGroup.getContext());
        richImageView.setCornerRadius(viewGroup.getResources().getDimensionPixelOffset(2131558736));
        this.a = new MediaImageView(viewGroup.getContext(), richImageView, false);
        ((ViewGroup)viewGroup.findViewById(2131886962)).addView((View)this.a);
        this.b = (TextView)viewGroup.findViewById(2131886950);
        this.c = (TextView)viewGroup.findViewById(2131886951);
        this.d = (TextView)viewGroup.findViewById(2131886963);
        this.e = (Button)viewGroup.findViewById(2131886394);
    }
    
    public void a(final ListMomentModule listMomentModule) {
        final Moment c = listMomentModule.c();
        this.a.a(new k(listMomentModule.a()), true);
        this.b.setText((CharSequence)c.b);
        this.c.setText((CharSequence)"Started 6AM");
        if (c.c) {
            this.e.setVisibility(0);
        }
        else {
            this.e.setVisibility(8);
        }
        if (c.d) {
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }
}
