// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.CategoryListItem;
import android.widget.CheckedTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;

public class jp extends ArrayAdapter
{
    public jp(final Context context, final ArrayList list) {
        super(context, 17367056, (List)list);
    }
    
    public View getView(final int id, final View view, final ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(context).inflate(17367056, viewGroup, false);
        }
        else {
            inflate = view;
        }
        final CheckedTextView checkedTextView = (CheckedTextView)inflate;
        final CategoryListItem categoryListItem = (CategoryListItem)this.getItem(id);
        checkedTextView.setId(id);
        checkedTextView.setText((CharSequence)categoryListItem.a());
        return inflate;
    }
}
