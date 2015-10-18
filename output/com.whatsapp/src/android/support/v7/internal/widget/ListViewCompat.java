// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.widget.AbsListView;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import java.lang.reflect.Field;
import android.widget.ListView;

public class ListViewCompat extends ListView
{
    private static final int[] STATE_SET_NOTHING;
    private static final String z;
    private Field mIsChildViewEnabled;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    private ListViewCompat$GateKeeperDrawable mSelector;
    final Rect mSelectorRect;
    
    static {
        final char[] charArray = "\u0002842A\u0006\u001d#'@\n\u0006\u0002\u001fH\r\u001d\"\u0015".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = 'o';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = 'q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        STATE_SET_NOTHING = new int[] { 0 };
    }
    
    public ListViewCompat(final Context context) {
        this(context, null);
    }
    
    public ListViewCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ListViewCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        try {
            (this.mIsChildViewEnabled = AbsListView.class.getDeclaredField(ListViewCompat.z)).setAccessible(true);
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        this.drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }
    
    protected void drawSelectorCompat(final Canvas canvas) {
        if (!this.mSelectorRect.isEmpty()) {
            final Drawable selector = this.getSelector();
            if (selector != null) {
                selector.setBounds(this.mSelectorRect);
                selector.draw(canvas);
            }
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.updateSelectorStateCompat();
    }
    
    public int measureHeightOfChildrenCompat(final int n, final int n2, final int n3, int n4, final int n5) {
        final int a = AdapterViewCompat.a;
        final int listPaddingTop = this.getListPaddingTop();
        final int listPaddingBottom = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        if (adapter != null) {
            int n6 = listPaddingBottom + listPaddingTop;
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int n7 = 0;
            View view = null;
            int n8 = 0;
            final int count = adapter.getCount();
            int i = 0;
            while (i < count) {
                final int itemViewType = adapter.getItemViewType(i);
                View view2;
                if (itemViewType != n8) {
                    view2 = null;
                    n8 = itemViewType;
                }
                else {
                    view2 = view;
                }
                view = adapter.getView(i, view2, (ViewGroup)this);
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                int n9 = 0;
                Label_0188: {
                    if (layoutParams != null && layoutParams.height > 0) {
                        n9 = View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                        if (a == 0) {
                            break Label_0188;
                        }
                    }
                    n9 = View$MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(n, n9);
                int n10;
                if (i > 0) {
                    n10 = n6 + dividerHeight;
                }
                else {
                    n10 = n6;
                }
                n6 = n10 + view.getMeasuredHeight();
                if (n6 >= n4) {
                    if (n5 >= 0 && i > n5 && n7 > 0 && n6 != n4) {
                        return n7;
                    }
                    return n4;
                }
                else {
                    if (n5 >= 0 && i >= n5) {
                        n7 = n6;
                    }
                    final int n11 = i + 1;
                    if (a != 0) {
                        break;
                    }
                    i = n11;
                }
            }
            return n6;
        }
        n4 = listPaddingTop + listPaddingBottom;
        return n4;
    }
    
    protected void positionSelectorCompat(final int p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/ListViewCompat.mSelectorRect:Landroid/graphics/Rect;
        //     4: astore_3       
        //     5: aload_3        
        //     6: aload_2        
        //     7: invokevirtual   android/view/View.getLeft:()I
        //    10: aload_2        
        //    11: invokevirtual   android/view/View.getTop:()I
        //    14: aload_2        
        //    15: invokevirtual   android/view/View.getRight:()I
        //    18: aload_2        
        //    19: invokevirtual   android/view/View.getBottom:()I
        //    22: invokevirtual   android/graphics/Rect.set:(IIII)V
        //    25: aload_3        
        //    26: aload_3        
        //    27: getfield        android/graphics/Rect.left:I
        //    30: aload_0        
        //    31: getfield        android/support/v7/internal/widget/ListViewCompat.mSelectionLeftPadding:I
        //    34: isub           
        //    35: putfield        android/graphics/Rect.left:I
        //    38: aload_3        
        //    39: aload_3        
        //    40: getfield        android/graphics/Rect.top:I
        //    43: aload_0        
        //    44: getfield        android/support/v7/internal/widget/ListViewCompat.mSelectionTopPadding:I
        //    47: isub           
        //    48: putfield        android/graphics/Rect.top:I
        //    51: aload_3        
        //    52: aload_3        
        //    53: getfield        android/graphics/Rect.right:I
        //    56: aload_0        
        //    57: getfield        android/support/v7/internal/widget/ListViewCompat.mSelectionRightPadding:I
        //    60: iadd           
        //    61: putfield        android/graphics/Rect.right:I
        //    64: aload_3        
        //    65: aload_3        
        //    66: getfield        android/graphics/Rect.bottom:I
        //    69: aload_0        
        //    70: getfield        android/support/v7/internal/widget/ListViewCompat.mSelectionBottomPadding:I
        //    73: iadd           
        //    74: putfield        android/graphics/Rect.bottom:I
        //    77: aload_0        
        //    78: getfield        android/support/v7/internal/widget/ListViewCompat.mIsChildViewEnabled:Ljava/lang/reflect/Field;
        //    81: aload_0        
        //    82: invokevirtual   java/lang/reflect/Field.getBoolean:(Ljava/lang/Object;)Z
        //    85: istore          5
        //    87: aload_2        
        //    88: invokevirtual   android/view/View.isEnabled:()Z
        //    91: iload           5
        //    93: if_icmpeq       130
        //    96: aload_0        
        //    97: getfield        android/support/v7/internal/widget/ListViewCompat.mIsChildViewEnabled:Ljava/lang/reflect/Field;
        //   100: astore          8
        //   102: iload           5
        //   104: ifne            149
        //   107: iconst_1       
        //   108: istore          9
        //   110: aload           8
        //   112: aload_0        
        //   113: iload           9
        //   115: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   118: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   121: iload_1        
        //   122: iconst_m1      
        //   123: if_icmpeq       130
        //   126: aload_0        
        //   127: invokevirtual   android/support/v7/internal/widget/ListViewCompat.refreshDrawableState:()V
        //   130: return         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: astore          7
        //   138: aload           7
        //   140: athrow         
        //   141: astore          4
        //   143: aload           4
        //   145: invokevirtual   java/lang/IllegalAccessException.printStackTrace:()V
        //   148: return         
        //   149: iconst_0       
        //   150: istore          9
        //   152: goto            110
        //   155: astore          10
        //   157: aload           10
        //   159: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  77     87     141    149    Ljava/lang/IllegalAccessException;
        //  87     102    131    141    Ljava/lang/IllegalAccessException;
        //  110    121    155    160    Ljava/lang/IllegalAccessException;
        //  126    130    155    160    Ljava/lang/IllegalAccessException;
        //  133    136    136    141    Ljava/lang/IllegalAccessException;
        //  138    141    141    149    Ljava/lang/IllegalAccessException;
        //  157    160    141    149    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    protected void positionSelectorLikeFocusCompat(final int n, final View view) {
        boolean b = true;
        final Drawable selector = this.getSelector();
        final boolean b2 = selector != null && n != -1 && b;
        if (b2) {
            selector.setVisible(false, false);
        }
        this.positionSelectorCompat(n, view);
        if (b2) {
            final Rect mSelectorRect = this.mSelectorRect;
            final float exactCenterX = mSelectorRect.exactCenterX();
            final float exactCenterY = mSelectorRect.exactCenterY();
            if (this.getVisibility() != 0) {
                b = false;
            }
            selector.setVisible(b, false);
            DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
        }
    }
    
    protected void positionSelectorLikeTouchCompat(final int n, final View view, final float n2, final float n3) {
        this.positionSelectorLikeFocusCompat(n, view);
        final Drawable selector = this.getSelector();
        if (selector != null && n != -1) {
            DrawableCompat.setHotspot(selector, n2, n3);
        }
    }
    
    public void setSelector(final Drawable drawable) {
        ListViewCompat$GateKeeperDrawable mSelector;
        if (drawable != null) {
            mSelector = new ListViewCompat$GateKeeperDrawable(drawable);
        }
        else {
            mSelector = null;
        }
        super.setSelector((Drawable)(this.mSelector = mSelector));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }
    
    protected void setSelectorEnabled(final boolean enabled) {
        if (this.mSelector != null) {
            this.mSelector.setEnabled(enabled);
        }
    }
    
    protected boolean shouldShowSelectorCompat() {
        return this.touchModeDrawsInPressedStateCompat() && this.isPressed();
    }
    
    protected boolean touchModeDrawsInPressedStateCompat() {
        return false;
    }
    
    protected void updateSelectorStateCompat() {
        final Drawable selector = this.getSelector();
        if (selector != null && this.shouldShowSelectorCompat()) {
            selector.setState(this.getDrawableState());
        }
    }
}
