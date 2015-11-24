// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.WindowManager$LayoutParams;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.AbsListView;
import android.view.ViewStub;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Dialog;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class f extends BaseAdapter
{
    final /* synthetic */ BottomSheet a;
    private final LayoutInflater b;
    private final int c;
    private final int d;
    private final int e;
    
    public f(final BottomSheet a, final Context context) {
        this.a = a;
        this.b = LayoutInflater.from(context);
        if (a.b.d) {
            this.c = lc.bottom_sheet_grid_item;
            this.d = 0;
        }
        else {
            this.c = lc.bottom_sheet_list_item;
            this.d = lc.bottom_sheet_divider;
        }
        if (a.b.e != 0) {
            this.e = context.getResources().getColor(a.b.e);
            return;
        }
        this.e = 0;
    }
    
    public BottomSheetItem a(final int n) {
        return this.a.a.get(n);
    }
    
    public boolean areAllItemsEnabled() {
        return false;
    }
    
    public int getCount() {
        return this.a.a.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public int getItemViewType(final int n) {
        return this.a(n).d();
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final BottomSheetItem a = this.a(n);
        if (a.c()) {
            if (view == null) {
                view = this.b.inflate(this.d, (ViewGroup)null);
            }
            return view;
        }
        if (view == null) {
            view = this.b.inflate(this.c, viewGroup, false);
            i.a(view, this.e);
        }
        ((i)view.getTag()).a(a);
        return view;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public boolean isEnabled(final int n) {
        return !this.a(n).c();
    }
}
