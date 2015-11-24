// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.HighlightedLinearLayout;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.view.View;

class r
{
    public View a;
    public ArrayList b;
    public View c;
    
    public r(final View a, final ArrayList b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static View a(final LayoutInflater layoutInflater, final Context context, final ArrayList list, final boolean b, final View$OnClickListener view$OnClickListener, final int[] array) {
        final AbsListView$LayoutParams a = l.a();
        final HighlightedLinearLayout highlightedLinearLayout = new HighlightedLinearLayout(context);
        final Resources resources = context.getResources();
        highlightedLinearLayout.setLayoutParams((ViewGroup$LayoutParams)a);
        highlightedLinearLayout.setOrientation(1);
        highlightedLinearLayout.setGravity(48);
        final View a2 = u.a(layoutInflater, view$OnClickListener, array[0]);
        final LinearLayout$LayoutParams b2 = l.b();
        b2.setMargins(0, resources.getDimensionPixelOffset(2131558446), 0, 0);
        highlightedLinearLayout.addView(a2, (ViewGroup$LayoutParams)b2);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558449);
        for (final View view : list) {
            final LinearLayout$LayoutParams b3 = l.b();
            b3.setMargins(0, 0, 0, dimensionPixelSize);
            highlightedLinearLayout.addView(view, (ViewGroup$LayoutParams)b3);
        }
        View a3 = null;
        if (b) {
            a3 = o.a(layoutInflater, view$OnClickListener, array[2]);
            highlightedLinearLayout.addView(a3, (ViewGroup$LayoutParams)l.b());
            highlightedLinearLayout.setPadding(0, 0, 0, resources.getDimensionPixelOffset(2131558448));
        }
        highlightedLinearLayout.setTag((Object)new r(a2, list, a3));
        return (View)highlightedLinearLayout;
    }
}
