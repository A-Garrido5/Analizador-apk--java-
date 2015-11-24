// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import java.util.List;
import java.util.HashMap;
import android.widget.BaseExpandableListAdapter;

public class PrimerAdaptador extends BaseExpandableListAdapter
{
    private HashMap<String, List<String>> Movies_Category;
    private List<String> Movies_List;
    private Context ctx;
    
    public PrimerAdaptador(final Context ctx, final HashMap<String, List<String>> movies_Category, final List<String> movies_List) {
        this.ctx = ctx;
        this.Movies_Category = movies_Category;
        this.Movies_List = movies_List;
    }
    
    public Object getChild(final int n, final int n2) {
        return this.Movies_Category.get(this.Movies_List.get(n)).get(n2);
    }
    
    public long getChildId(final int n, final int n2) {
        return n2;
    }
    
    public View getChildView(final int n, final int n2, final boolean b, View inflate, final ViewGroup viewGroup) {
        final String text = (String)this.getChild(n, n2);
        if (inflate == null) {
            inflate = ((LayoutInflater)this.ctx.getSystemService("layout_inflater")).inflate(2130968604, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131492953);
        final ImageView imageView = (ImageView)inflate.findViewById(2131492954);
        if (n == 0) {
            imageView.setImageResource(2130837589);
        }
        else if (n == 1) {
            imageView.setImageResource(2130837580);
        }
        else if (n == 2) {
            imageView.setImageResource(2130837572);
        }
        else if (n == 3) {
            imageView.setImageResource(2130837586);
        }
        else if (n == 4) {
            imageView.setImageResource(2130837591);
        }
        else if (n == 5) {
            imageView.setImageResource(2130837588);
        }
        textView.setText((CharSequence)text);
        return inflate;
    }
    
    public int getChildrenCount(final int n) {
        return this.Movies_Category.get(this.Movies_List.get(n)).size();
    }
    
    public Object getGroup(final int n) {
        return this.Movies_List.get(n);
    }
    
    public int getGroupCount() {
        return this.Movies_List.size();
    }
    
    public long getGroupId(final int n) {
        return n;
    }
    
    public View getGroupView(final int n, final boolean b, View inflate, final ViewGroup viewGroup) {
        final String text = (String)this.getGroup(n);
        if (inflate == null) {
            inflate = ((LayoutInflater)this.ctx.getSystemService("layout_inflater")).inflate(2130968609, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131492964);
        textView.setTypeface((Typeface)null, 1);
        textView.setText((CharSequence)text);
        return inflate;
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    public boolean isChildSelectable(final int n, final int n2) {
        return false;
    }
}
