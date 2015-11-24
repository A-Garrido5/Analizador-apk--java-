// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import java.lang.ref.WeakReference;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$TwitterList;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import java.util.ArrayList;
import android.support.v4.widget.CursorAdapter;

public class d extends CursorAdapter
{
    private final boolean a;
    private final ArrayList b;
    
    public d(final Context context, final int n, final boolean a) {
        super(context, null, n);
        this.b = new ArrayList();
        this.a = a;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final e e = (e)view.getTag();
        e.a.setText((CharSequence)cursor.getString(2));
        if (((TwitterTopic$TwitterList)f.a(cursor.getBlob(10))).mode == 1) {
            e.a.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, context.getResources().getDrawable(2130839080), (Drawable)null);
        }
        else {
            e.a.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
        }
        e.b.setText((CharSequence)context.getString(2131297148, new Object[] { cursor.getString(9) }));
        e.d.a(cursor.getString(8));
    }
    
    @Override
    public Object getItem(final int n) {
        if (this.a) {
            final Cursor cursor = (Cursor)super.getItem(n);
            final Intent intent = new Intent(this.mContext, (Class)ListTabActivity.class);
            intent.putExtra("owner_id", cursor.getLong(7));
            intent.putExtra("creator_id", cursor.getLong(5));
            intent.putExtra("list_id", cursor.getLong(1));
            intent.putExtra("list_name", cursor.getString(2));
            intent.putExtra("list_description", cursor.getString(4));
            intent.putExtra("list_fullname", cursor.getString(3));
            intent.putExtra("list_mode", ((TwitterTopic$TwitterList)f.a(cursor.getBlob(10))).mode);
            return intent;
        }
        return super.getItem(n);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2130968850, viewGroup, false);
        final e tag = new e(inflate);
        this.b.add(new WeakReference<e>(tag));
        inflate.setTag((Object)tag);
        return inflate;
    }
}
