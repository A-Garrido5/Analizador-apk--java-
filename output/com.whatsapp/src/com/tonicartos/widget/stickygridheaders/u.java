// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import com.whatsapp.DialogToastActivity;
import java.util.Arrays;
import com.whatsapp.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.view.View;
import android.database.DataSetObserver;
import android.content.Context;
import java.util.List;
import android.widget.BaseAdapter;

public class u extends BaseAdapter
{
    private static boolean c;
    private static final String z;
    private final List a;
    private int b;
    private final t d;
    private final Context e;
    private DataSetObserver f;
    private View[] g;
    private StickyGridHeadersGridView h;
    private int i;
    
    static {
        final char[] charArray = "cy\u0019\u00118ij\u0002\u001b7xh\u0011\u00166b~\u0012\u0013 ul\u0014\u0013#dh\u0002\u0005!q}\u0000\u0017!?j\u0015\u00065ya\u001c\u0017!fd\u0015\u0005sg\u007f\u001f\u001c40y\t\u00026".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'S';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = 'p';
                    break;
                }
                case 3: {
                    c2 = 'r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public u(final Context e, final StickyGridHeadersGridView h, final t d) {
        this.f = new n(this);
        this.a = new ArrayList();
        this.i = 1;
        this.e = e;
        this.d = d;
        this.h = h;
        d.registerDataSetObserver(this.f);
    }
    
    private StickyGridHeadersBaseAdapterWrapper$FillerView a(final View view, final ViewGroup viewGroup) {
        View view2;
        if (view != null && !(view instanceof StickyGridHeadersBaseAdapterWrapper$FillerView)) {
            Log.e(u.z + view + " " + view.getTag());
            view2 = null;
        }
        else {
            view2 = view;
        }
        StickyGridHeadersBaseAdapterWrapper$FillerView stickyGridHeadersBaseAdapterWrapper$FillerView = (StickyGridHeadersBaseAdapterWrapper$FillerView)view2;
        if (stickyGridHeadersBaseAdapterWrapper$FillerView == null) {
            stickyGridHeadersBaseAdapterWrapper$FillerView = new StickyGridHeadersBaseAdapterWrapper$FillerView(this, this.e);
        }
        return stickyGridHeadersBaseAdapterWrapper$FillerView;
    }
    
    static List a(final u u) {
        return u.a;
    }
    
    private View b(final int n, final View view, final ViewGroup viewGroup) {
        final StickyGridHeadersBaseAdapterWrapper$HeaderFillerView stickyGridHeadersBaseAdapterWrapper$HeaderFillerView = (StickyGridHeadersBaseAdapterWrapper$HeaderFillerView)view;
        final StickyGridHeadersBaseAdapterWrapper$HeaderFillerView stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2 = new StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(this, this.e);
        stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2.setHeaderWidth(this.h.getWidth());
        return (View)stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2;
    }
    
    private void b(final int n) {
        Arrays.fill(this.g = new View[n], null);
    }
    
    static View[] b(final u u) {
        return u.g;
    }
    
    private int c(final int n) {
        final int n2 = this.d.a(n) % this.i;
        if (n2 == 0) {
            return 0;
        }
        return this.i - n2;
    }
    
    protected View a(final int n, final View view, final ViewGroup viewGroup) {
        if (this.d.a() == 0) {
            return null;
        }
        return this.d.a(this.e(n).c, view, viewGroup);
    }
    
    protected void a() {
        final int c = StickyGridHeadersGridView.c;
        this.b = 0;
        final int a = this.d.a();
        int i = 0;
        if (a == 0) {
            this.b = this.d.getCount();
        }
        else {
            while (i < a) {
                this.b += this.d.a(i) + this.i;
                ++i;
                if (c != 0) {
                    return;
                }
            }
        }
    }
    
    public void a(final int i) {
        this.b(this.i = i);
    }
    
    public boolean areAllItemsEnabled() {
        return false;
    }
    
    protected long d(final int n) {
        return this.e(n).c;
    }
    
    protected f e(int n) {
        final int c = StickyGridHeadersGridView.c;
        final int a = this.d.a();
        if (a != 0) {
            int i = 0;
            int n2 = n;
            while (i < a) {
                final int a2 = this.d.a(i);
                if (n == 0) {
                    return new f(this, -2, i);
                }
                final int n3 = n - this.i;
                if (n3 < 0) {
                    return new f(this, -1, i);
                }
                final int n4 = n2 - this.i;
                if (n3 < a2) {
                    return new f(this, n4, i);
                }
                final int c2 = this.c(i);
                n2 = n4 - c2;
                n = n3 - (a2 + c2);
                ++i;
                if (c != 0) {
                    break;
                }
            }
            return new f(this, -1, i);
        }
        if (n >= this.d.getCount()) {
            return new f(this, -1, 0);
        }
        return new f(this, n, 0);
    }
    
    public int getCount() {
        final int c = StickyGridHeadersGridView.c;
        this.b = 0;
        final int a = this.d.a();
        int i = 0;
        if (a == 0) {
            return this.d.getCount();
        }
        while (i < a) {
            this.b += this.d.a(i) + this.c(i) + this.i;
            ++i;
            if (c != 0) {
                break;
            }
        }
        return this.b;
    }
    
    public Object getItem(final int n) {
        final f e = this.e(n);
        if (e.a == -1 || e.a == -2) {
            return null;
        }
        return this.d.getItem(e.a);
    }
    
    public long getItemId(final int n) {
        final f e = this.e(n);
        if (e.a == -2) {
            return -1L;
        }
        if (e.a == -1) {
            return -2L;
        }
        return this.d.getItemId(e.a);
    }
    
    public int getItemViewType(final int n) {
        final f e = this.e(n);
        int itemViewType;
        if (e.a == -2) {
            itemViewType = 1;
        }
        else {
            if (e.a == -1) {
                return 0;
            }
            itemViewType = this.d.getItemViewType(e.a);
            if (itemViewType != -1) {
                return itemViewType + 2;
            }
        }
        return itemViewType;
    }
    
    public View getView(final int position, final View view, final ViewGroup viewGroup) {
        final int c = StickyGridHeadersGridView.c;
        Object o;
        View child;
        if (view instanceof StickyGridHeadersBaseAdapterWrapper$ReferenceView) {
            o = view;
            child = ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)o).getChildAt(0);
        }
        else {
            child = view;
            o = null;
        }
        final f e = this.e(position);
        View view2 = null;
        Label_0163: {
            if (e.a == -2) {
                view2 = this.b(e.c, child, viewGroup);
                ((StickyGridHeadersBaseAdapterWrapper$HeaderFillerView)view2).setHeaderId(e.c);
                view2.setTag((Object)this.d.a(e.c, (View)view2.getTag(), viewGroup));
                if (c == 0) {
                    break Label_0163;
                }
                DialogToastActivity.h = !DialogToastActivity.h;
            }
            else {
                view2 = child;
            }
            if (e.a == -1) {
                view2 = this.a(view2, viewGroup);
                if (c == 0) {
                    break Label_0163;
                }
            }
            view2 = this.d.getView(e.a, view2, viewGroup);
        }
        if (o == null) {
            o = new StickyGridHeadersBaseAdapterWrapper$ReferenceView(this, this.e);
        }
        ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)o).removeAllViews();
        ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)o).addView(view2);
        ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)o).setPosition(position);
        ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)o).setNumColumns(this.i);
        ((StickyGridHeadersBaseAdapterWrapper$ReferenceView)(this.g[position % this.i] = (View)o)).setRowSiblings(this.g);
        if (!u.c && (position % this.i == -1 + this.i || position == -1 + this.getCount())) {
            this.b(this.i);
        }
        return (View)o;
    }
    
    public int getViewTypeCount() {
        return 2 + this.d.getViewTypeCount();
    }
    
    public boolean hasStableIds() {
        return this.d.hasStableIds();
    }
    
    public boolean isEmpty() {
        return this.d.isEmpty();
    }
    
    public boolean isEnabled(final int n) {
        final f e = this.e(n);
        return e.a != -1 && e.a != -2 && this.d.isEnabled(e.a);
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.d.registerDataSetObserver(dataSetObserver);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.d.unregisterDataSetObserver(dataSetObserver);
    }
}
