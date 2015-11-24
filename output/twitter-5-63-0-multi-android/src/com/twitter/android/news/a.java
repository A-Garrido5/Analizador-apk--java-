// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.news;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.media.manager.j;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.widget.CursorAdapter;

public class a extends CursorAdapter
{
    public a(final Context context) {
        super(context, null, 2);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final b b = (b)view.getTag();
        b.a.setText((CharSequence)cursor.getString(4));
        b.b.setText((CharSequence)cursor.getString(6));
        if (cursor.getString(5) != null) {
            b.c.setVisibility(0);
            b.c.a(j.a(cursor.getString(5)));
            return;
        }
        b.c.setVisibility(8);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2130968940, viewGroup, false);
        inflate.setTag((Object)new b(this, inflate));
        return inflate;
    }
}
