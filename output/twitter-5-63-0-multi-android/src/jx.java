import android.widget.Toast;
import android.support.v4.view.ViewCompat;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.View;
import com.twitter.internal.android.widget.ToolBarItemView;
import com.twitter.internal.android.widget.ToolBar;

// 
// Decompiled by Procyon v0.5.30
// 

public class jx
{
    private final boolean a;
    private final ToolBar b;
    private ToolBarItemView c;
    private int d;
    private int e;
    private int f;
    private View g;
    private jy h;
    private boolean i;
    private boolean j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private Intent n;
    private boolean o;
    private int p;
    private CharSequence q;
    private Drawable r;
    private int s;
    private int t;
    
    public jx(final ToolBar b, final Context context, final AttributeSet set) {
        int int1 = -1;
        this.b = b;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ToolBarItem);
        this.e = obtainStyledAttributes.getResourceId(li.ToolBarItem_android_id, 0);
        this.d = obtainStyledAttributes.getResourceId(li.ToolBarItem_android_icon, 0);
        this.l = obtainStyledAttributes.getText(li.ToolBarItem_android_title);
        if (this.d == 0 && this.l == null) {
            throw new IllegalArgumentException("ToolBar item requires either icon or title.");
        }
        this.a = obtainStyledAttributes.getBoolean(li.ToolBarItem_primaryItem, false);
        this.f = obtainStyledAttributes.getInt(li.ToolBarItem_showAsAction, 1);
        this.b(obtainStyledAttributes.getResourceId(li.ToolBarItem_actionLayout, 0));
        this.k = obtainStyledAttributes.getBoolean(li.ToolBarItem_android_enabled, true);
        this.j = obtainStyledAttributes.getBoolean(li.ToolBarItem_android_visible, true);
        this.q = obtainStyledAttributes.getText(li.ToolBarItem_subtitle);
        this.g(obtainStyledAttributes.getResourceId(li.ToolBarItem_overflowIcon, 0));
        if (obtainStyledAttributes.hasValue(li.ToolBarItem_order)) {
            int1 = obtainStyledAttributes.getInt(li.ToolBarItem_order, int1);
            if (int1 <= 0) {
                throw new IllegalArgumentException("ToolBar item order must be greater than 0");
            }
        }
        this.s = int1;
        this.t = obtainStyledAttributes.getInt(li.ToolBarItem_priority, Integer.MAX_VALUE);
        this.t();
        obtainStyledAttributes.recycle();
    }
    
    public jx(final ToolBar b, final boolean a) {
        this.b = b;
        this.j = true;
        this.k = true;
        this.f = 1;
        this.a = a;
    }
    
    private void t() {
        if (this.c != null) {
            if (this.m != null) {
                this.c.setContentDescription(this.m);
            }
            else if (this.l != null) {
                this.c.setContentDescription(this.l);
            }
        }
    }
    
    public int a() {
        return this.e;
    }
    
    public jx a(final int e) {
        this.e = e;
        return this;
    }
    
    public jx a(final Intent n) {
        this.n = n;
        return this;
    }
    
    public jx a(final Drawable r) {
        if (r != this.r) {
            this.r = r;
            this.b.g();
        }
        return this;
    }
    
    public jx a(final View g) {
        this.g = g;
        return this;
    }
    
    public jx a(final ToolBarItemView c) {
        this.c = c;
        this.t();
        return this;
    }
    
    public jx a(final CharSequence l) {
        this.l = l;
        this.t();
        return this;
    }
    
    public jx a(final jy h) {
        this.h = h;
        return this;
    }
    
    public void a(final boolean i) {
        this.i = i;
    }
    
    public jx b(final int n) {
        if (n != 0) {
            this.g = LayoutInflater.from(this.b.getThemedContext()).inflate(n, (ViewGroup)null, false);
        }
        return this;
    }
    
    public jx b(final CharSequence m) {
        this.m = m;
        this.t();
        return this;
    }
    
    public jx b(final boolean j) {
        if (this.j != j) {
            this.j = j;
            this.b.d(this);
        }
        return this;
    }
    
    public boolean b() {
        return this.a;
    }
    
    public int c() {
        return this.d;
    }
    
    public jx c(final int f) {
        this.f = f;
        return this;
    }
    
    public jx c(final CharSequence q) {
        this.q = q;
        return this;
    }
    
    public jx c(final boolean b) {
        this.k = b;
        if (this.c != null) {
            this.c.setEnabled(b);
        }
        return this;
    }
    
    public View d() {
        return this.c;
    }
    
    public jx d(final int n) {
        if (n != 0) {
            this.l = this.b.getThemedContext().getString(n);
            this.t();
        }
        return this;
    }
    
    public void d(final boolean o) {
        this.o = o;
    }
    
    public View e() {
        return this.g;
    }
    
    public void e(final int badgeMode) {
        if (this.c != null) {
            this.c.setBadgeMode(badgeMode);
        }
    }
    
    public void f(final int n) {
        if (this.p != n) {
            this.p = n;
            if (this.c != null) {
                this.c.setNumber(n);
            }
        }
    }
    
    public boolean f() {
        return !this.i && (0x8 & this.f) != 0x0 && this.g != null && (this.h == null || this.h.b(this)) && this.b.c(this);
    }
    
    public jx g(final int n) {
        if (n != 0) {
            this.r = this.b.getThemedContext().getResources().getDrawable(n);
        }
        return this;
    }
    
    public boolean g() {
        return this.i && (0x8 & this.f) != 0x0 && this.g != null && (this.h == null || this.h.a(this)) && this.b.b(this);
    }
    
    public jx h(final int s) {
        this.s = s;
        return this;
    }
    
    public boolean h() {
        return this.i;
    }
    
    public boolean i() {
        return this.j;
    }
    
    public int j() {
        return this.f;
    }
    
    public CharSequence k() {
        return this.l;
    }
    
    public void l() {
        final Context context = this.c.getContext();
        final int[] array = new int[2];
        final Rect rect = new Rect();
        this.c.getLocationOnScreen(array);
        this.c.getWindowVisibleDisplayFrame(rect);
        final int width = this.c.getWidth();
        final int height = this.c.getHeight();
        final int n = array[1] + height / 2;
        int n2 = array[0] + width / 2;
        if (ViewCompat.getLayoutDirection(this.c) == 0) {
            n2 = context.getResources().getDisplayMetrics().widthPixels - n2;
        }
        final Toast text = Toast.makeText(context, this.k(), 0);
        if (n < rect.height()) {
            text.setGravity(8388661, n2, height);
        }
        else {
            text.setGravity(81, 0, height);
        }
        text.show();
    }
    
    public boolean m() {
        return this.k;
    }
    
    public Intent n() {
        return this.n;
    }
    
    public boolean o() {
        return this.o;
    }
    
    public CharSequence p() {
        return this.q;
    }
    
    public Drawable q() {
        return this.r;
    }
    
    public int r() {
        return this.s;
    }
    
    public int s() {
        return this.t;
    }
}
