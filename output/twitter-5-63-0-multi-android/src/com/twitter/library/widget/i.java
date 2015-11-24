// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

class i
{
    public final ImageView a;
    public final TextView b;
    
    public i(final View view) {
        this.a = (ImageView)view.findViewById(la.bottom_sheet_item_icon);
        this.b = (TextView)view.findViewById(la.bottom_sheet_item_text);
    }
    
    static void a(final View view, final int colorFilter) {
        if (view.getTag() == null) {
            final i tag = new i(view);
            view.setTag((Object)tag);
            if (colorFilter != 0) {
                tag.a.setColorFilter(colorFilter);
            }
        }
    }
    
    public void a(final BottomSheetItem bottomSheetItem) {
        this.b.setText(bottomSheetItem.a());
        final int e = bottomSheetItem.e();
        if (e != 0) {
            this.a.setImageResource(e);
            this.a.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
    }
}
