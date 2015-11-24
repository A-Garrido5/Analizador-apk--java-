// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.util.t;
import com.twitter.library.provider.Tweet;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.twitter.util.a;
import com.twitter.library.provider.ActivityDataList;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

public class af
{
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final View f;
    public long g;
    public int h;
    public ArrayList i;
    public ActivityDataList j;
    
    public af(final View view) {
        this.a = (ImageView)view.findViewById(2131886127);
        this.f = view.findViewById(2131886236);
        this.b = (TextView)view.findViewById(2131886237);
        this.d = (ViewGroup)view.findViewById(2131886089);
        this.e = (ViewGroup)view.findViewById(2131886238);
        this.c = (TextView)view.findViewById(2131886239);
        if (this.e != null) {
            com.twitter.util.a.a((View)this.e, 4);
        }
    }
    
    public static View a(final LayoutInflater layoutInflater, final View$OnClickListener onClickListener, final int n, final int h) {
        final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
        final af tag = new af(inflate);
        tag.h = h;
        inflate.setTag((Object)tag);
        inflate.setOnClickListener(onClickListener);
        return inflate;
    }
    
    public static void a(final Context context, final View view, final int imageResource, final ArrayList i, final ArrayList list, final boolean b, final long g, final int h, final boolean b2, final long n) {
        final af af = (af)view.getTag();
        final Resources resources = context.getResources();
        af.g = g;
        af.h = h;
        af.i = i;
        af.a.setImageResource(imageResource);
        if (b) {
            af.c.setVisibility(0);
            view.setPadding(view.getPaddingLeft(), resources.getDimensionPixelSize(2131558446), view.getPaddingRight(), resources.getDimensionPixelSize(2131558448));
        }
        else {
            af.c.setVisibility(8);
        }
        int size;
        if (list == null) {
            size = 0;
        }
        else {
            size = list.size();
        }
        if (size > 0) {
            af.d.setVisibility(0);
            final int childCount = af.d.getChildCount();
            final int min = Math.min(size, childCount);
            for (int j = 0; j < min; ++j) {
                final View child = af.d.getChildAt(j);
                child.setVisibility(0);
                final TypefacesTextView typefacesTextView = (TypefacesTextView)child.findViewById(2131886948);
                typefacesTextView.setVisibility(0);
                if (b2) {
                    typefacesTextView.setGravity(5);
                }
                t.a(context, typefacesTextView, list.get(j).c());
            }
            for (int k = min; k < childCount; ++k) {
                final View child2 = af.d.getChildAt(k);
                child2.setVisibility(8);
                child2.setTag((Object)null);
            }
        }
        else {
            af.d.setVisibility(8);
        }
    }
}
