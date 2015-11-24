// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ContextThemeWrapper;
import android.widget.ImageView$ScaleType;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.AdapterView$OnItemClickListener;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;

class al implements View$OnKeyListener
{
    final /* synthetic */ ToolBar a;
    
    al(final ToolBar a) {
        this.a = a;
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (n == 82) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                return true;
            }
            if (keyEvent.getAction() == 1) {
                this.a.F.dismiss();
                return true;
            }
        }
        return false;
    }
}
