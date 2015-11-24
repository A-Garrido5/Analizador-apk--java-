// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ContextThemeWrapper;
import android.widget.ImageView$ScaleType;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;
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
import java.util.Iterator;
import android.view.View;
import android.view.View$OnClickListener;

class ai implements View$OnClickListener
{
    final /* synthetic */ jx a;
    final /* synthetic */ ToolBar b;
    
    ai(final ToolBar b, final jx a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.b.x.c()) {
            for (final jx jx : this.b.w) {
                if (jx.h()) {
                    jx.g();
                    break;
                }
            }
        }
        else if (this.b.s != null) {
            this.b.s.a(this.a);
        }
    }
}
