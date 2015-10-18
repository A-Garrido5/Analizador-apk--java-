// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import com.twitter.android.widget.x;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;
import android.support.v4.widget.CursorAdapter;

class ch extends CursorAdapter
{
    private final long a;
    private final LayoutInflater b;
    
    public ch(final Context context, final long a) {
        super(context, null, 2);
        this.a = a;
        this.b = LayoutInflater.from(context);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final x x = (x)view.getTag();
        x.a(context, cursor);
        x.a(x.g != this.a);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = this.b.inflate(2130968645, viewGroup, false);
        inflate.setTag((Object)new x(inflate));
        return inflate;
    }
}
