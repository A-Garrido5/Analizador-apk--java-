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
import android.content.Context;
import java.util.ArrayList;
import android.app.Dialog;

public class BottomSheet extends Dialog
{
    private ArrayList a;
    private g b;
    private l c;
    
    BottomSheet(final Context context) {
        this(context, lh.BottomSheet);
    }
    
    BottomSheet(final Context context, final int n) {
        super(context, n);
        this.setCanceledOnTouchOutside(true);
    }
    
    private void a(final BottomSheetItem bottomSheetItem) {
        if (this.c != null) {
            this.c.a(this.b.a, bottomSheetItem);
        }
    }
    
    private void a(final g b) {
        this.b = b;
    }
    
    public final int a() {
        return this.b.a;
    }
    
    public final void a(final l c) {
        this.c = c;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.b == null) {
            throw new IllegalStateException("Must call setParams first");
        }
        this.setContentView(lc.bottom_sheet);
        ((BottomSheetDrawerLayout)this.findViewById(la.contentPanel)).setOnClickOutsideListener((View$OnClickListener)new d(this));
        final CharSequence c = this.b.c;
        final TextView textView = (TextView)this.findViewById(la.title);
        if (TextUtils.isEmpty(c)) {
            textView.setVisibility(8);
        }
        else {
            textView.setText(c);
            textView.setVisibility(0);
        }
        this.a = new ArrayList();
        final boolean d = this.b.d;
        final boolean b = !this.b.g.isEmpty();
        final Iterator<BottomSheetItem> iterator = (Iterator<BottomSheetItem>)this.b.f.iterator();
        int n = 0;
    Label_0186_Outer:
        while (iterator.hasNext()) {
            final BottomSheetItem bottomSheetItem = iterator.next();
            while (true) {
                Label_0366: {
                    int n2;
                    if (bottomSheetItem.c()) {
                        if (d || n != 0) {
                            break Label_0366;
                        }
                        this.a.add(bottomSheetItem);
                        n2 = 1;
                    }
                    else {
                        if (b && this.b.g.contains(bottomSheetItem.b())) {
                            break Label_0366;
                        }
                        this.a.add(bottomSheetItem);
                        n2 = 0;
                    }
                    n = n2;
                    continue Label_0186_Outer;
                }
                int n2 = n;
                continue;
            }
        }
        int n3;
        if (d) {
            n3 = la.grid_stub;
        }
        else {
            n3 = la.list_stub;
        }
        ((ViewStub)this.findViewById(n3)).inflate();
        final AbsListView absListView = (AbsListView)this.findViewById(la.bottom_sheet_list);
        absListView.setAdapter((ListAdapter)new f(this, this.getContext()));
        absListView.setOnItemClickListener((AdapterView$OnItemClickListener)new e(this));
        final WindowManager$LayoutParams attributes = this.getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = -1;
        attributes.gravity = 80;
        this.getWindow().setAttributes(attributes);
    }
}
