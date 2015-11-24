// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import com.twitter.library.provider.DraftTweet;
import android.text.TextUtils;
import com.twitter.library.util.bo;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.provider.f;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.widget.CursorAdapter;

class fp extends CursorAdapter
{
    public fp(final Context context) {
        super(context, null, 0);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final DraftTweet a = f.a(cursor);
        final fq fq = (fq)view.getTag();
        if (a.media.isEmpty()) {
            fq.a.setVisibility(8);
        }
        else {
            fq.a.setVisibility(0);
            fq.a.a(a.media.get(0).b(context));
        }
        fq.b.setTextSize(0, bo.a);
        if (TextUtils.isEmpty((CharSequence)a.statusText)) {
            fq.b.setText(2131296899);
            return;
        }
        fq.b.setText((CharSequence)a.statusText);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final RelativeLayout relativeLayout = (RelativeLayout)LayoutInflater.from(context).inflate(2130968737, viewGroup, false);
        final fq tag = new fq();
        tag.a = (MediaImageView)relativeLayout.findViewById(2131886661);
        tag.b = (TextView)relativeLayout.findViewById(2131886102);
        relativeLayout.setTag((Object)tag);
        return (View)relativeLayout;
    }
}
