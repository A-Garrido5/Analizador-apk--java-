// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import java.util.Iterator;
import android.widget.TextView;
import android.widget.ImageView;
import android.util.Pair;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.HashSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import android.content.Context;
import java.util.Set;
import android.view.View$OnLayoutChangeListener;
import android.widget.BaseAdapter;
import android.database.DataSetObserver;

class s extends DataSetObserver
{
    final /* synthetic */ ChunkedAdapter a;
    private int b;
    
    public s(final ChunkedAdapter a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onChanged() {
        int[] array;
        int n;
        int n2;
        if (this.b == 0) {
            array = this.a.s;
            n = this.a.s.length;
            n2 = this.a.d.getCount();
        }
        else {
            if (this.b != 1) {
                this.a.notifyDataSetChanged();
                return;
            }
            array = this.a.u;
            n = this.a.u.length;
            n2 = this.a.e.getCount();
        }
        if (n2 != n) {
            final int[] array2 = new int[n2];
            System.arraycopy(array, 0, array2, 0, Math.min(n, n2));
            if (this.b == 0) {
                this.a.s = array2;
            }
            else if (this.b == 1) {
                this.a.u = array2;
            }
        }
        this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
