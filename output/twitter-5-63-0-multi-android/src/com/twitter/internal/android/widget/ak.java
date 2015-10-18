// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ContextThemeWrapper;
import android.widget.ImageView$ScaleType;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnKeyListener;
import android.view.View$OnClickListener;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Rect;
import android.widget.PopupWindow;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class ak implements AdapterView$OnItemClickListener
{
    final /* synthetic */ ToolBar a;
    
    ak(final ToolBar a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.F.dismiss();
        if (this.a.s != null) {
            this.a.s.a((jx)adapterView.getItemAtPosition(n));
        }
    }
}
