// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.widget.ListAdapter;
import android.widget.Adapter;
import android.os.Handler;
import android.view.MotionEvent;
import android.os.Build$VERSION;
import android.widget.AbsListView;
import android.os.Parcelable;
import android.graphics.Canvas;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import com.whatsapp.DialogToastActivity;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.view.View;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AbsListView$OnScrollListener;
import android.widget.GridView;

public class StickyGridHeadersGridView extends GridView implements AbsListView$OnScrollListener, AdapterView$OnItemClickListener, AdapterView$OnItemSelectedListener, AdapterView$OnItemLongClickListener
{
    public static int c;
    private int A;
    private r B;
    private boolean C;
    private AdapterView$OnItemSelectedListener D;
    private boolean E;
    private AdapterView$OnItemClickListener F;
    private AdapterView$OnItemLongClickListener G;
    private int a;
    private AbsListView$OnScrollListener b;
    protected u d;
    private Runnable e;
    private int f;
    private int g;
    protected int h;
    private float i;
    private int j;
    private int k;
    public b l;
    private q m;
    private View n;
    private boolean o;
    private final Rect p;
    private int q;
    private boolean r;
    private int s;
    private long t;
    private DataSetObserver u;
    protected boolean v;
    private j w;
    private boolean x;
    protected int y;
    public i z;
    
    public StickyGridHeadersGridView(final Context context) {
        this(context, null);
    }
    
    public StickyGridHeadersGridView(final Context context, final AttributeSet set) {
        this(context, set, 16842865);
    }
    
    public StickyGridHeadersGridView(final Context context, final AttributeSet set, final int n) {
        final int c = StickyGridHeadersGridView.c;
        super(context, set, n);
        this.E = true;
        this.p = new Rect();
        this.t = -1L;
        this.u = new g(this);
        this.q = 1;
        this.g = 0;
        this.r = true;
        super.setOnScrollListener((AbsListView$OnScrollListener)this);
        this.setVerticalFadingEdgeEnabled(false);
        if (!this.o) {
            this.A = -1;
        }
        this.s = ViewConfiguration.get(context).getScaledTouchSlop();
        if (DialogToastActivity.h) {
            StickyGridHeadersGridView.c = c + 1;
        }
    }
    
    private int a(final float n) {
        final int c = StickyGridHeadersGridView.c;
        if (this.n == null || n > this.n.getBottom()) {
            int n2 = 0;
            int i = this.getFirstVisiblePosition();
            while (i <= this.getLastVisiblePosition()) {
                if (this.getItemIdAtPosition(i) == -1L) {
                    final View child = this.getChildAt(n2);
                    final int bottom = child.getBottom();
                    final int top = child.getTop();
                    if (n <= bottom && n >= top) {
                        return n2;
                    }
                }
                i += this.q;
                n2 += this.q;
                if (c != 0) {
                    break;
                }
            }
            return -1;
        }
        return -2;
    }
    
    static int a(final StickyGridHeadersGridView stickyGridHeadersGridView) {
        return stickyGridHeadersGridView.getWindowAttachCount();
    }
    
    static long a(final StickyGridHeadersGridView stickyGridHeadersGridView, final int n) {
        return stickyGridHeadersGridView.c(n);
    }
    
    private void a() {
        this.f = 0;
        this.n = null;
        this.t = Long.MIN_VALUE;
    }
    
    static int b(final StickyGridHeadersGridView stickyGridHeadersGridView) {
        return stickyGridHeadersGridView.getWindowAttachCount();
    }
    
    private void b() {
        if (this.n == null) {
            return;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824);
        final ViewGroup$LayoutParams layoutParams = this.n.getLayoutParams();
        int n = 0;
        Label_0069: {
            if (layoutParams != null && layoutParams.height > 0) {
                n = View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                if (StickyGridHeadersGridView.c == 0) {
                    break Label_0069;
                }
            }
            n = View$MeasureSpec.makeMeasureSpec(0, 0);
        }
        this.n.measure(measureSpec, n);
        this.n.layout(this.getLeft() + this.getPaddingLeft(), 0, this.getRight() - this.getPaddingRight(), this.n.getMeasuredHeight());
    }
    
    private void b(final int n) {
        final int c = StickyGridHeadersGridView.c;
        if (this.d != null && this.d.getCount() != 0 && this.E && this.getChildAt(0) != null) {
            int n2 = n - this.q;
            if (n2 < 0) {
                n2 = n;
            }
            int n3 = n + this.q;
            if (n3 >= this.d.getCount()) {
                n3 = n;
            }
            long t = 0L;
            Label_0207: {
                if (this.k == 0) {
                    t = this.d.d(n);
                    if (c == 0) {
                        n3 = n;
                        break Label_0207;
                    }
                }
                if (this.k < 0) {
                    this.d.d(n);
                    Label_0152: {
                        if (this.getChildAt(this.q).getTop() <= 0) {
                            t = this.d.d(n3);
                            if (c == 0) {
                                break Label_0152;
                            }
                        }
                        else {
                            n3 = n;
                        }
                        t = this.d.d(n);
                    }
                    if (c == 0) {
                        break Label_0207;
                    }
                }
                else {
                    n3 = n;
                }
                final int top = this.getChildAt(0).getTop();
                if (top > 0 && top < this.k) {
                    t = this.d.d(n2);
                    if (c == 0) {
                        n3 = n2;
                        break Label_0207;
                    }
                    n3 = n2;
                }
                t = this.d.d(n);
            }
            if (this.t != t) {
                this.n = this.d.a(n3, this.n, (ViewGroup)this);
                this.b();
                this.t = t;
            }
            final int childCount = this.getChildCount();
            if (childCount != 0) {
                View view = null;
                int n4 = 99999;
                int i = 0;
                while (true) {
                    while (i < childCount) {
                        final StickyGridHeadersBaseAdapterWrapper$ReferenceView stickyGridHeadersBaseAdapterWrapper$ReferenceView = (StickyGridHeadersBaseAdapterWrapper$ReferenceView)super.getChildAt(i);
                        int top2 = 0;
                        Label_0314: {
                            if (this.C) {
                                top2 = stickyGridHeadersBaseAdapterWrapper$ReferenceView.getTop() - this.getPaddingTop();
                                if (c == 0) {
                                    break Label_0314;
                                }
                            }
                            top2 = stickyGridHeadersBaseAdapterWrapper$ReferenceView.getTop();
                        }
                        View view2;
                        int n5;
                        if ((top2 >= 0 || c != 0) && stickyGridHeadersBaseAdapterWrapper$ReferenceView.a() instanceof StickyGridHeadersBaseAdapterWrapper$HeaderFillerView && top2 < n4) {
                            view2 = (View)stickyGridHeadersBaseAdapterWrapper$ReferenceView;
                            n5 = top2;
                        }
                        else {
                            n5 = n4;
                            view2 = view;
                        }
                        final int n6 = i + this.q;
                        if (c != 0) {
                            final int c2 = this.c();
                            if (view2 != null) {
                                if (n == 0 && super.getChildAt(0).getTop() > 0 && !this.C) {
                                    this.f = 0;
                                    if (c == 0) {
                                        return;
                                    }
                                }
                                if (this.C) {
                                    this.f = Math.min(view2.getTop(), c2 + this.getPaddingTop());
                                    int f;
                                    if (this.f < this.getPaddingTop()) {
                                        f = c2 + this.getPaddingTop();
                                    }
                                    else {
                                        f = this.f;
                                    }
                                    this.f = f;
                                    if (c == 0) {
                                        return;
                                    }
                                }
                                this.f = Math.min(view2.getTop(), c2);
                                int f2;
                                if (this.f < 0) {
                                    f2 = c2;
                                }
                                else {
                                    f2 = this.f;
                                }
                                this.f = f2;
                                if (c == 0) {
                                    return;
                                }
                            }
                            this.f = c2;
                            if (this.C) {
                                this.f += this.getPaddingTop();
                            }
                            return;
                        }
                        else {
                            i = n6;
                            view = view2;
                            n4 = n5;
                        }
                    }
                    View view2 = view;
                    continue;
                }
            }
        }
    }
    
    private int c() {
        if (this.n != null) {
            return this.n.getMeasuredHeight();
        }
        return 0;
    }
    
    private long c(final int n) {
        if (n == -2) {
            return this.t;
        }
        return this.d.d(n + this.getFirstVisiblePosition());
    }
    
    static void c(final StickyGridHeadersGridView stickyGridHeadersGridView) {
        stickyGridHeadersGridView.a();
    }
    
    public View a(final int n) {
        if (n == -2) {
            try {
                return this.n;
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        try {
            return (View)this.getChildAt(n).getTag();
        }
        catch (Exception ex2) {
            return null;
        }
    }
    
    public boolean a(final View view, final long n) {
        if (this.m != null) {
            this.playSoundEffect(0);
            if (view != null) {
                view.sendAccessibilityEvent(1);
            }
            this.m.a((AdapterView)this, view, n);
            return true;
        }
        return false;
    }
    
    public boolean b(final View view, final long n) {
        final boolean b = this.B != null && this.B.a((AdapterView)this, view, n);
        if (b) {
            if (view != null) {
                view.sendAccessibilityEvent(2);
            }
            this.performHapticFeedback(0);
        }
        return b;
    }
    
    protected void dispatchDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.c:I
        //     3: istore_2       
        //     4: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     7: bipush          8
        //     9: if_icmpge       20
        //    12: aload_0        
        //    13: aload_0        
        //    14: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getFirstVisiblePosition:()I
        //    17: invokespecial   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.b:(I)V
        //    20: aload_0        
        //    21: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //    24: ifnull          560
        //    27: aload_0        
        //    28: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.E:Z
        //    31: istore          52
        //    33: iload           52
        //    35: ifeq            560
        //    38: aload_0        
        //    39: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //    42: invokevirtual   android/view/View.getVisibility:()I
        //    45: istore          53
        //    47: iload           53
        //    49: ifne            560
        //    52: iconst_1       
        //    53: istore          7
        //    55: aload_0        
        //    56: invokespecial   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.c:()I
        //    59: istore          8
        //    61: aload_0        
        //    62: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.f:I
        //    65: iload           8
        //    67: isub           
        //    68: istore          9
        //    70: iload           7
        //    72: ifeq            149
        //    75: aload_0        
        //    76: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.r:Z
        //    79: istore          49
        //    81: iload           49
        //    83: ifeq            149
        //    86: aload_0        
        //    87: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //    90: aload_0        
        //    91: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //    94: putfield        android/graphics/Rect.left:I
        //    97: aload_0        
        //    98: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   101: aload_0        
        //   102: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   105: aload_0        
        //   106: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   109: isub           
        //   110: putfield        android/graphics/Rect.right:I
        //   113: aload_0        
        //   114: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   117: aload_0        
        //   118: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.f:I
        //   121: putfield        android/graphics/Rect.top:I
        //   124: aload_0        
        //   125: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   128: aload_0        
        //   129: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getHeight:()I
        //   132: putfield        android/graphics/Rect.bottom:I
        //   135: aload_1        
        //   136: invokevirtual   android/graphics/Canvas.save:()I
        //   139: pop            
        //   140: aload_1        
        //   141: aload_0        
        //   142: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   145: invokevirtual   android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
        //   148: pop            
        //   149: aload_0        
        //   150: aload_1        
        //   151: invokespecial   android/widget/GridView.dispatchDraw:(Landroid/graphics/Canvas;)V
        //   154: new             Ljava/util/ArrayList;
        //   157: dup            
        //   158: invokespecial   java/util/ArrayList.<init>:()V
        //   161: astore          10
        //   163: iconst_0       
        //   164: istore          11
        //   166: aload_0        
        //   167: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getFirstVisiblePosition:()I
        //   170: istore          12
        //   172: iload           12
        //   174: aload_0        
        //   175: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getLastVisiblePosition:()I
        //   178: if_icmpgt       229
        //   181: aload_0        
        //   182: iload           12
        //   184: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getItemIdAtPosition:(I)J
        //   187: ldc2_w          -1
        //   190: lcmp           
        //   191: ifne            207
        //   194: aload           10
        //   196: iload           11
        //   198: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   201: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   206: pop            
        //   207: iload           12
        //   209: aload_0        
        //   210: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.q:I
        //   213: iadd           
        //   214: istore          12
        //   216: iload           11
        //   218: aload_0        
        //   219: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.q:I
        //   222: iadd           
        //   223: istore          11
        //   225: iload_2        
        //   226: ifeq            172
        //   229: iconst_0       
        //   230: istore          13
        //   232: iload           13
        //   234: aload           10
        //   236: invokeinterface java/util/List.size:()I
        //   241: if_icmpge       512
        //   244: aload_0        
        //   245: aload           10
        //   247: iload           13
        //   249: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   254: checkcast       Ljava/lang/Integer;
        //   257: invokevirtual   java/lang/Integer.intValue:()I
        //   260: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getChildAt:(I)Landroid/view/View;
        //   263: checkcast       Lcom/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView;
        //   266: astore          26
        //   268: aload           26
        //   270: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getTag:()Ljava/lang/Object;
        //   273: checkcast       Landroid/view/View;
        //   276: astore          28
        //   278: aload           26
        //   280: iconst_0       
        //   281: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getChildAt:(I)Landroid/view/View;
        //   284: checkcast       Lcom/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$HeaderFillerView;
        //   287: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$HeaderFillerView.a:()I
        //   290: i2l            
        //   291: lstore          32
        //   293: aload_0        
        //   294: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.t:J
        //   297: lstore          34
        //   299: lload           32
        //   301: lload           34
        //   303: lcmp           
        //   304: ifne            596
        //   307: aload           26
        //   309: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getTop:()I
        //   312: istore          43
        //   314: iload           43
        //   316: ifge            596
        //   319: aload_0        
        //   320: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.E:Z
        //   323: istore          44
        //   325: iload           44
        //   327: ifeq            596
        //   330: iconst_1       
        //   331: istore          36
        //   333: aload           28
        //   335: invokevirtual   android/view/View.getVisibility:()I
        //   338: istore          39
        //   340: iload           39
        //   342: ifne            502
        //   345: iload           36
        //   347: ifeq            354
        //   350: iload_2        
        //   351: ifeq            502
        //   354: aload           28
        //   356: aload_0        
        //   357: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   360: ldc             1073741824
        //   362: aload_0        
        //   363: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   366: isub           
        //   367: aload_0        
        //   368: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   371: isub           
        //   372: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   375: iconst_0       
        //   376: iconst_0       
        //   377: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   380: invokevirtual   android/view/View.measure:(II)V
        //   383: aload           28
        //   385: aload_0        
        //   386: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getLeft:()I
        //   389: aload_0        
        //   390: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   393: iadd           
        //   394: iconst_0       
        //   395: aload_0        
        //   396: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getRight:()I
        //   399: aload_0        
        //   400: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   403: isub           
        //   404: aload           26
        //   406: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getHeight:()I
        //   409: invokevirtual   android/view/View.layout:(IIII)V
        //   412: aload_0        
        //   413: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   416: aload_0        
        //   417: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   420: putfield        android/graphics/Rect.left:I
        //   423: aload_0        
        //   424: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   427: aload_0        
        //   428: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   431: aload_0        
        //   432: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   435: isub           
        //   436: putfield        android/graphics/Rect.right:I
        //   439: aload_0        
        //   440: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   443: aload           26
        //   445: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getBottom:()I
        //   448: putfield        android/graphics/Rect.bottom:I
        //   451: aload_0        
        //   452: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   455: aload           26
        //   457: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getTop:()I
        //   460: putfield        android/graphics/Rect.top:I
        //   463: aload_1        
        //   464: invokevirtual   android/graphics/Canvas.save:()I
        //   467: pop            
        //   468: aload_1        
        //   469: aload_0        
        //   470: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   473: invokevirtual   android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
        //   476: pop            
        //   477: aload_1        
        //   478: aload_0        
        //   479: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   482: i2f            
        //   483: aload           26
        //   485: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersBaseAdapterWrapper$ReferenceView.getTop:()I
        //   488: i2f            
        //   489: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   492: aload           28
        //   494: aload_1        
        //   495: invokevirtual   android/view/View.draw:(Landroid/graphics/Canvas;)V
        //   498: aload_1        
        //   499: invokevirtual   android/graphics/Canvas.restore:()V
        //   502: iload           13
        //   504: iconst_1       
        //   505: iadd           
        //   506: istore          40
        //   508: iload_2        
        //   509: ifeq            884
        //   512: iload           7
        //   514: ifeq            536
        //   517: aload_0        
        //   518: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.r:Z
        //   521: istore          25
        //   523: iload           25
        //   525: ifeq            536
        //   528: aload_1        
        //   529: invokevirtual   android/graphics/Canvas.restore:()V
        //   532: iload_2        
        //   533: ifeq            627
        //   536: iload           7
        //   538: ifne            627
        //   541: return         
        //   542: astore_3       
        //   543: aload_3        
        //   544: athrow         
        //   545: astore          4
        //   547: aload           4
        //   549: athrow         
        //   550: astore          5
        //   552: aload           5
        //   554: athrow         
        //   555: astore          6
        //   557: aload           6
        //   559: athrow         
        //   560: iconst_0       
        //   561: istore          7
        //   563: goto            55
        //   566: astore          47
        //   568: aload           47
        //   570: athrow         
        //   571: astore          48
        //   573: aload           48
        //   575: athrow         
        //   576: astore          45
        //   578: aload           45
        //   580: athrow         
        //   581: astore          29
        //   583: aload           29
        //   585: athrow         
        //   586: astore          30
        //   588: aload           30
        //   590: athrow         
        //   591: astore          31
        //   593: aload           31
        //   595: athrow         
        //   596: iconst_0       
        //   597: istore          36
        //   599: goto            333
        //   602: astore          37
        //   604: aload           37
        //   606: athrow         
        //   607: astore          38
        //   609: aload           38
        //   611: athrow         
        //   612: astore          22
        //   614: aload           22
        //   616: athrow         
        //   617: astore          23
        //   619: aload           23
        //   621: athrow         
        //   622: astore          24
        //   624: aload           24
        //   626: athrow         
        //   627: aload_0        
        //   628: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //   631: invokevirtual   android/view/View.getWidth:()I
        //   634: aload_0        
        //   635: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   638: aload_0        
        //   639: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   642: isub           
        //   643: aload_0        
        //   644: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   647: isub           
        //   648: if_icmpeq       723
        //   651: aload_0        
        //   652: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   655: ldc             1073741824
        //   657: aload_0        
        //   658: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   661: isub           
        //   662: aload_0        
        //   663: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   666: isub           
        //   667: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   670: istore          20
        //   672: iconst_0       
        //   673: iconst_0       
        //   674: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   677: istore          21
        //   679: aload_0        
        //   680: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //   683: iload           20
        //   685: iload           21
        //   687: invokevirtual   android/view/View.measure:(II)V
        //   690: aload_0        
        //   691: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //   694: aload_0        
        //   695: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getLeft:()I
        //   698: aload_0        
        //   699: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   702: iadd           
        //   703: iconst_0       
        //   704: aload_0        
        //   705: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getRight:()I
        //   708: aload_0        
        //   709: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   712: isub           
        //   713: aload_0        
        //   714: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //   717: invokevirtual   android/view/View.getHeight:()I
        //   720: invokevirtual   android/view/View.layout:(IIII)V
        //   723: aload_0        
        //   724: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   727: aload_0        
        //   728: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   731: putfield        android/graphics/Rect.left:I
        //   734: aload_0        
        //   735: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   738: aload_0        
        //   739: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getWidth:()I
        //   742: aload_0        
        //   743: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingRight:()I
        //   746: isub           
        //   747: putfield        android/graphics/Rect.right:I
        //   750: aload_0        
        //   751: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   754: iload           9
        //   756: iload           8
        //   758: iadd           
        //   759: putfield        android/graphics/Rect.bottom:I
        //   762: aload_0        
        //   763: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.C:Z
        //   766: istore          16
        //   768: iload           16
        //   770: ifeq            788
        //   773: aload_0        
        //   774: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   777: aload_0        
        //   778: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingTop:()I
        //   781: putfield        android/graphics/Rect.top:I
        //   784: iload_2        
        //   785: ifeq            796
        //   788: aload_0        
        //   789: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   792: iconst_0       
        //   793: putfield        android/graphics/Rect.top:I
        //   796: aload_1        
        //   797: invokevirtual   android/graphics/Canvas.save:()I
        //   800: pop            
        //   801: aload_1        
        //   802: aload_0        
        //   803: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.p:Landroid/graphics/Rect;
        //   806: invokevirtual   android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
        //   809: pop            
        //   810: aload_1        
        //   811: aload_0        
        //   812: invokevirtual   com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getPaddingLeft:()I
        //   815: i2f            
        //   816: iload           9
        //   818: i2f            
        //   819: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   822: aload_1        
        //   823: fconst_0       
        //   824: fconst_0       
        //   825: aload_1        
        //   826: invokevirtual   android/graphics/Canvas.getWidth:()I
        //   829: i2f            
        //   830: aload_1        
        //   831: invokevirtual   android/graphics/Canvas.getHeight:()I
        //   834: i2f            
        //   835: ldc_w           255.0
        //   838: aload_0        
        //   839: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.f:I
        //   842: i2f            
        //   843: fmul           
        //   844: iload           8
        //   846: i2f            
        //   847: fdiv           
        //   848: f2i            
        //   849: iconst_4       
        //   850: invokevirtual   android/graphics/Canvas.saveLayerAlpha:(FFFFII)I
        //   853: pop            
        //   854: aload_0        
        //   855: getfield        com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.n:Landroid/view/View;
        //   858: aload_1        
        //   859: invokevirtual   android/view/View.draw:(Landroid/graphics/Canvas;)V
        //   862: aload_1        
        //   863: invokevirtual   android/graphics/Canvas.restore:()V
        //   866: aload_1        
        //   867: invokevirtual   android/graphics/Canvas.restore:()V
        //   870: return         
        //   871: astore          14
        //   873: aload           14
        //   875: athrow         
        //   876: astore          15
        //   878: aload           15
        //   880: athrow         
        //   881: astore          27
        //   883: return         
        //   884: iload           40
        //   886: istore          13
        //   888: goto            232
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      20     542    545    Ljava/lang/Exception;
        //  20     33     545    550    Ljava/lang/Exception;
        //  38     47     550    560    Ljava/lang/Exception;
        //  75     81     566    571    Ljava/lang/Exception;
        //  86     149    571    576    Ljava/lang/Exception;
        //  194    207    576    581    Ljava/lang/Exception;
        //  268    278    881    884    Ljava/lang/Exception;
        //  278    299    581    586    Ljava/lang/Exception;
        //  307    314    586    591    Ljava/lang/Exception;
        //  319    325    591    596    Ljava/lang/Exception;
        //  333    340    602    612    Ljava/lang/Exception;
        //  517    523    612    617    Ljava/lang/Exception;
        //  528    532    617    627    Ljava/lang/Exception;
        //  547    550    550    560    Ljava/lang/Exception;
        //  552    555    555    560    Ljava/lang/Exception;
        //  568    571    571    576    Ljava/lang/Exception;
        //  583    586    586    591    Ljava/lang/Exception;
        //  588    591    591    596    Ljava/lang/Exception;
        //  604    607    607    612    Ljava/lang/Exception;
        //  614    617    617    627    Ljava/lang/Exception;
        //  619    622    622    627    Ljava/lang/Exception;
        //  723    768    871    876    Ljava/lang/Exception;
        //  773    784    876    881    Ljava/lang/Exception;
        //  788    796    876    881    Ljava/lang/Exception;
        //  873    876    876    881    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 449, Size: 449
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.F.onItemClick(adapterView, view, this.d.e(n).a, n2);
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        return this.G.onItemLongClick(adapterView, view, this.d.e(n).a, n2);
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.D.onItemSelected(adapterView, view, this.d.e(n).a, n2);
    }
    
    protected void onMeasure(final int n, final int n2) {
        int q = 1;
        final int c = StickyGridHeadersGridView.c;
        Label_0117: {
            if (this.A == -1) {
                Label_0099: {
                    if (this.a > 0) {
                        final int max = Math.max(View$MeasureSpec.getSize(n) - this.getPaddingLeft() - this.getPaddingRight(), 0);
                        int n3 = max / this.a;
                        Label_0092: {
                            if (n3 > 0) {
                                while (n3 != q && n3 * this.a + (n3 - 1) * this.j > max) {
                                    --n3;
                                    if (c != 0) {
                                        break Label_0092;
                                    }
                                }
                                q = n3;
                            }
                        }
                        if (c == 0) {
                            break Label_0099;
                        }
                    }
                    q = 2;
                }
                this.q = q;
                if (c == 0) {
                    break Label_0117;
                }
            }
            this.q = this.A;
        }
        if (this.d != null) {
            this.d.a(this.q);
        }
        this.b();
        super.onMeasure(n, n2);
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
        this.D.onNothingSelected(adapterView);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final a a = (a)parcelable;
        super.onRestoreInstanceState(a.getSuperState());
        this.E = a.a;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final a a = new a(super.onSaveInstanceState());
        a.a = this.E;
        return (Parcelable)a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.b != null) {
            this.b.onScroll(absListView, n, n2, n3);
        }
        if (Build$VERSION.SDK_INT >= 8) {
            this.b(n);
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int g) {
        if (this.b != null) {
            this.b.onScrollStateChanged(absListView, g);
        }
        this.g = g;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int c = StickyGridHeadersGridView.c;
        Label_0214: {
            switch (0xFF & motionEvent.getAction()) {
                case 0: {
                    if (this.l == null) {
                        this.l = new b(this);
                    }
                    this.postDelayed((Runnable)this.l, (long)ViewConfiguration.getTapTimeout());
                    final int n = (int)motionEvent.getY();
                    this.i = n;
                    this.h = this.a((float)n);
                    if (this.h != -1 && (this.g != 2 || c != 0)) {
                        this.y = 0;
                        return true;
                    }
                    break;
                }
                case 2: {
                    if (this.h == -1 || Math.abs(motionEvent.getY() - this.i) <= this.s) {
                        break;
                    }
                    this.y = -1;
                    final View a = this.a(this.h);
                    if (a != null) {
                        a.setPressed(false);
                    }
                    final Handler handler = this.getHandler();
                    if (handler != null) {
                        handler.removeCallbacks((Runnable)this.z);
                    }
                    this.h = -1;
                    if (c != 0) {
                        break Label_0214;
                    }
                    break;
                }
                case 1: {
                    if (this.y == -2) {
                        return true;
                    }
                    if (this.y != -1 && (this.h != -1 || c != 0)) {
                        final View a2 = this.a(this.h);
                        Label_0454: {
                            if (a2 != null && !a2.hasFocusable()) {
                                if (this.y != 0) {
                                    a2.setPressed(false);
                                }
                                if (this.w == null) {
                                    this.w = new j(this, null);
                                }
                                final j w = this.w;
                                w.c = this.h;
                                w.b();
                                if (this.y != 0 || this.y != 1) {
                                    final Handler handler2 = this.getHandler();
                                    if (handler2 != null) {
                                        Runnable runnable;
                                        if (this.y == 0) {
                                            runnable = this.l;
                                        }
                                        else {
                                            runnable = this.z;
                                        }
                                        handler2.removeCallbacks(runnable);
                                    }
                                    Label_0438: {
                                        if (!this.v) {
                                            this.y = 1;
                                            a2.setPressed(true);
                                            this.setPressed(true);
                                            if (this.e != null) {
                                                this.removeCallbacks(this.e);
                                            }
                                            this.postDelayed(this.e = new e(this, a2, w), (long)ViewConfiguration.getPressedStateDuration());
                                            if (c == 0) {
                                                break Label_0438;
                                            }
                                        }
                                        this.y = -1;
                                    }
                                    if (c == 0) {
                                        break Label_0454;
                                    }
                                }
                                if (!this.v) {
                                    w.run();
                                }
                            }
                        }
                        this.y = -1;
                        return true;
                    }
                    break;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setAdapter(final Adapter adapter) {
        this.setAdapter((ListAdapter)adapter);
    }
    
    public void setAdapter(final ListAdapter listAdapter) {
        final int c = StickyGridHeadersGridView.c;
        if (this.d != null && this.u != null) {
            this.d.unregisterDataSetObserver(this.u);
        }
        if (!this.x) {
            this.C = true;
        }
        t t = null;
        Label_0091: {
            if (listAdapter instanceof t) {
                t = (t)listAdapter;
                if (c == 0) {
                    break Label_0091;
                }
            }
            if (listAdapter instanceof c) {
                final m m = new m((c)listAdapter);
                if (c == 0) {
                    t = m;
                    break Label_0091;
                }
            }
            t = new k(listAdapter);
        }
        (this.d = new u(this.getContext(), this, t)).registerDataSetObserver(this.u);
        this.a();
        super.setAdapter((ListAdapter)this.d);
    }
    
    public void setClipToPadding(final boolean b) {
        super.setClipToPadding(b);
        this.C = b;
        this.x = true;
    }
    
    public void setColumnWidth(final int n) {
        super.setColumnWidth(n);
        this.a = n;
    }
    
    public void setHorizontalSpacing(final int n) {
        super.setHorizontalSpacing(n);
        this.j = n;
    }
    
    public void setNumColumns(final int n) {
        super.setNumColumns(n);
        this.o = true;
        this.A = n;
        if (n != -1 && this.d != null) {
            this.d.a(n);
        }
    }
    
    public void setOnItemClickListener(final AdapterView$OnItemClickListener f) {
        this.F = f;
        super.setOnItemClickListener((AdapterView$OnItemClickListener)this);
    }
    
    public void setOnItemLongClickListener(final AdapterView$OnItemLongClickListener g) {
        this.G = g;
        super.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)this);
    }
    
    public void setOnItemSelectedListener(final AdapterView$OnItemSelectedListener d) {
        this.D = d;
        super.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
    }
    
    public void setOnScrollListener(final AbsListView$OnScrollListener b) {
        this.b = b;
    }
    
    public void setVerticalSpacing(final int n) {
        super.setVerticalSpacing(n);
        this.k = n;
    }
}
