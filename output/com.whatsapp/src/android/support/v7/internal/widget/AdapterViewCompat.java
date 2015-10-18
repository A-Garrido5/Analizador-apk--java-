// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View$OnClickListener;
import android.view.ViewDebug$CapturedViewProperty;
import android.widget.Adapter;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewDebug$ExportedProperty;
import android.view.View;
import android.view.ViewGroup;

public abstract class AdapterViewCompat extends ViewGroup
{
    public static int a;
    private static final String[] z;
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    @ViewDebug$ExportedProperty(category = "scrolling")
    int mFirstPosition;
    boolean mInLayout;
    @ViewDebug$ExportedProperty(category = "list")
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    @ViewDebug$ExportedProperty(category = "list")
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    AdapterViewCompat$OnItemClickListener mOnItemClickListener;
    AdapterViewCompat$OnItemSelectedListener mOnItemSelectedListener;
    @ViewDebug$ExportedProperty(category = "list")
    int mSelectedPosition;
    long mSelectedRowId;
    private AdapterViewCompat$SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;
    
    static {
        final String[] z2 = new String[8];
        String s = "99\u0011\u0012f=*]\u0012f=*Ydf6)YdC9$\u001a1{\b<\u0007%b+tU-|x3\u001a0/+(\u00054`*)\u0010 /13U\u0005k9-\u0001!}\u000e4\u00103";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = 'D';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "99\u0011\u0012f=*]\u0012f=*Ydf6)\\df+}\u001b+{x.\u00004\u007f7/\u0001!kx4\u001bdN<<\u00050j*\u000b\u001c!x";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*8\u0018+y=\u001c\u0019(Y18\u00027'q}\u001c7/62\u0001d|--\u0005+},8\u0011df6}4 n()\u00106Y18\u0002";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001c2\u001bc{x>\u0014(cx.\u00100@6\u001e\u0019-l3\u0011\u001c7{=3\u00106/>2\u0007dn6}4 n()\u00106Y18\u0002j/\u00012\u0000d\u007f*2\u0017%m4$U3n6)U7j,\u0012\u001b\r{=06(f;69-|,8\u001b!}x4\u001b7{=<\u0011";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "*8\u0018+y=\u000b\u001c!xp\u000b\u001c!xq}\u001c7/62\u0001d|--\u0005+},8\u0011df6}4 n()\u00106Y18\u0002";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "*8\u0018+y=\u000b\u001c!x\u0019)]-a,tU-|x3\u001a0/+(\u00054`*)\u0010 /13U\u0005k9-\u0001!}\u000e4\u00103";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "99\u0011\u0012f=*]\u0012f=*YdC9$\u001a1{\b<\u0007%b+tU-|x3\u001a0/+(\u00054`*)\u0010 /13U\u0005k9-\u0001!}\u000e4\u00103";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "99\u0011\u0012f=*]\u0012f=*\\df+}\u001b+{x.\u00004\u007f7/\u0001!kx4\u001bdN<<\u00050j*\u000b\u001c!x";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    AdapterViewCompat(final Context context) {
        super(context);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    AdapterViewCompat(final Context context, final AttributeSet set) {
        super(context, set);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    AdapterViewCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    static void access$000(final AdapterViewCompat adapterViewCompat, final Parcelable parcelable) {
        adapterViewCompat.onRestoreInstanceState(parcelable);
    }
    
    static Parcelable access$100(final AdapterViewCompat adapterViewCompat) {
        return adapterViewCompat.onSaveInstanceState();
    }
    
    static void access$200(final AdapterViewCompat adapterViewCompat) {
        adapterViewCompat.fireOnSelected();
    }
    
    private void fireOnSelected() {
        while (true) {
            try {
                if (this.mOnItemSelectedListener == null) {
                    return;
                }
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            final int selectedItemPosition = this.getSelectedItemPosition();
            Label_0057: {
                if (selectedItemPosition < 0) {
                    break Label_0057;
                }
                final View selectedView = this.getSelectedView();
                try {
                    this.mOnItemSelectedListener.onItemSelected(this, selectedView, selectedItemPosition, this.getAdapter().getItemId(selectedItemPosition));
                    if (AdapterViewCompat.a != 0) {
                        this.mOnItemSelectedListener.onNothingSelected(this);
                    }
                }
                catch (UnsupportedOperationException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    private void updateEmptyStatus(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isInFilterMode:()Z
        //     8: ifeq            13
        //    11: iconst_0       
        //    12: istore_1       
        //    13: iload_1        
        //    14: ifeq            87
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/widget/AdapterViewCompat.mEmptyView:Landroid/view/View;
        //    21: astore          6
        //    23: aload           6
        //    25: ifnull          46
        //    28: aload_0        
        //    29: getfield        android/support/v7/internal/widget/AdapterViewCompat.mEmptyView:Landroid/view/View;
        //    32: iconst_0       
        //    33: invokevirtual   android/view/View.setVisibility:(I)V
        //    36: aload_0        
        //    37: bipush          8
        //    39: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.setVisibility:(I)V
        //    42: iload_2        
        //    43: ifeq            51
        //    46: aload_0        
        //    47: iconst_0       
        //    48: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.setVisibility:(I)V
        //    51: aload_0        
        //    52: getfield        android/support/v7/internal/widget/AdapterViewCompat.mDataChanged:Z
        //    55: istore          9
        //    57: iload           9
        //    59: ifeq            108
        //    62: aload_0        
        //    63: iconst_0       
        //    64: aload_0        
        //    65: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getLeft:()I
        //    68: aload_0        
        //    69: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getTop:()I
        //    72: aload_0        
        //    73: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getRight:()I
        //    76: aload_0        
        //    77: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getBottom:()I
        //    80: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.onLayout:(ZIIII)V
        //    83: iload_2        
        //    84: ifeq            108
        //    87: aload_0        
        //    88: getfield        android/support/v7/internal/widget/AdapterViewCompat.mEmptyView:Landroid/view/View;
        //    91: ifnull          103
        //    94: aload_0        
        //    95: getfield        android/support/v7/internal/widget/AdapterViewCompat.mEmptyView:Landroid/view/View;
        //    98: bipush          8
        //   100: invokevirtual   android/view/View.setVisibility:(I)V
        //   103: aload_0        
        //   104: iconst_0       
        //   105: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.setVisibility:(I)V
        //   108: return         
        //   109: astore          4
        //   111: aload           4
        //   113: athrow         
        //   114: astore          5
        //   116: aload           5
        //   118: athrow         
        //   119: astore          7
        //   121: aload           7
        //   123: athrow         
        //   124: astore          8
        //   126: aload           8
        //   128: athrow         
        //   129: astore_3       
        //   130: aload_3        
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  17     23     109    114    Ljava/lang/UnsupportedOperationException;
        //  28     42     114    119    Ljava/lang/UnsupportedOperationException;
        //  46     51     114    119    Ljava/lang/UnsupportedOperationException;
        //  51     57     119    124    Ljava/lang/UnsupportedOperationException;
        //  62     83     124    129    Ljava/lang/UnsupportedOperationException;
        //  87     103    129    132    Ljava/lang/UnsupportedOperationException;
        //  111    114    114    119    Ljava/lang/UnsupportedOperationException;
        //  121    124    124    129    Ljava/lang/UnsupportedOperationException;
        //  126    129    129    132    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
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
    
    public void addView(final View view) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[7]);
    }
    
    public void addView(final View view, final int n) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[1]);
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[0]);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[6]);
    }
    
    protected boolean canAnimate() {
        try {
            if (!super.canAnimate()) {
                return false;
            }
            final AdapterViewCompat adapterViewCompat = this;
            final int n = adapterViewCompat.mItemCount;
            if (n > 0) {
                return true;
            }
            return false;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final AdapterViewCompat adapterViewCompat = this;
            final int n = adapterViewCompat.mItemCount;
            if (n > 0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        return false;
    }
    
    void checkFocus() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getAdapter:()Landroid/widget/Adapter;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          22
        //     9: aload_1        
        //    10: invokeinterface android/widget/Adapter.getCount:()I
        //    15: istore          20
        //    17: iload           20
        //    19: ifne            135
        //    22: iconst_1       
        //    23: istore_2       
        //    24: iload_2        
        //    25: ifeq            39
        //    28: aload_0        
        //    29: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isInFilterMode:()Z
        //    32: istore          18
        //    34: iload           18
        //    36: ifeq            145
        //    39: iconst_1       
        //    40: istore_3       
        //    41: iload_3        
        //    42: ifeq            155
        //    45: aload_0        
        //    46: getfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableInTouchModeState:Z
        //    49: istore          16
        //    51: iload           16
        //    53: ifeq            155
        //    56: iconst_1       
        //    57: istore          4
        //    59: aload_0        
        //    60: iload           4
        //    62: invokespecial   android/view/ViewGroup.setFocusableInTouchMode:(Z)V
        //    65: iload_3        
        //    66: ifeq            171
        //    69: aload_0        
        //    70: getfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableState:Z
        //    73: istore          14
        //    75: iload           14
        //    77: ifeq            171
        //    80: iconst_1       
        //    81: istore          7
        //    83: aload_0        
        //    84: iload           7
        //    86: invokespecial   android/view/ViewGroup.setFocusable:(Z)V
        //    89: aload_0        
        //    90: getfield        android/support/v7/internal/widget/AdapterViewCompat.mEmptyView:Landroid/view/View;
        //    93: astore          11
        //    95: aload           11
        //    97: ifnull          129
        //   100: aload_1        
        //   101: ifnull          120
        //   104: aload_1        
        //   105: invokeinterface android/widget/Adapter.isEmpty:()Z
        //   110: istore          13
        //   112: iconst_0       
        //   113: istore          12
        //   115: iload           13
        //   117: ifeq            123
        //   120: iconst_1       
        //   121: istore          12
        //   123: aload_0        
        //   124: iload           12
        //   126: invokespecial   android/support/v7/internal/widget/AdapterViewCompat.updateEmptyStatus:(Z)V
        //   129: return         
        //   130: astore          19
        //   132: aload           19
        //   134: athrow         
        //   135: iconst_0       
        //   136: istore_2       
        //   137: goto            24
        //   140: astore          17
        //   142: aload           17
        //   144: athrow         
        //   145: iconst_0       
        //   146: istore_3       
        //   147: goto            41
        //   150: astore          15
        //   152: aload           15
        //   154: athrow         
        //   155: iconst_0       
        //   156: istore          4
        //   158: goto            59
        //   161: astore          5
        //   163: aload           5
        //   165: athrow         
        //   166: astore          6
        //   168: aload           6
        //   170: athrow         
        //   171: iconst_0       
        //   172: istore          7
        //   174: goto            83
        //   177: astore          8
        //   179: aload           8
        //   181: athrow         
        //   182: astore          9
        //   184: aload           9
        //   186: athrow         
        //   187: astore          10
        //   189: aload           10
        //   191: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  9      17     130    135    Ljava/lang/UnsupportedOperationException;
        //  28     34     140    145    Ljava/lang/UnsupportedOperationException;
        //  45     51     150    155    Ljava/lang/UnsupportedOperationException;
        //  59     65     161    166    Ljava/lang/UnsupportedOperationException;
        //  69     75     166    171    Ljava/lang/UnsupportedOperationException;
        //  83     95     177    187    Ljava/lang/UnsupportedOperationException;
        //  104    112    187    192    Ljava/lang/UnsupportedOperationException;
        //  163    166    166    171    Ljava/lang/UnsupportedOperationException;
        //  179    182    182    187    Ljava/lang/UnsupportedOperationException;
        //  184    187    187    192    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    void checkSelectionChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //     4: istore_3       
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/widget/AdapterViewCompat.mOldSelectedPosition:I
        //     9: istore          4
        //    11: iload_3        
        //    12: iload           4
        //    14: if_icmpne       29
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedRowId:J
        //    21: aload_0        
        //    22: getfield        android/support/v7/internal/widget/AdapterViewCompat.mOldSelectedRowId:J
        //    25: lcmp           
        //    26: ifeq            56
        //    29: aload_0        
        //    30: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.selectionChanged:()V
        //    33: aload_0        
        //    34: aload_0        
        //    35: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //    38: putfield        android/support/v7/internal/widget/AdapterViewCompat.mOldSelectedPosition:I
        //    41: aload_0        
        //    42: aload_0        
        //    43: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedRowId:J
        //    46: putfield        android/support/v7/internal/widget/AdapterViewCompat.mOldSelectedRowId:J
        //    49: return         
        //    50: astore_1       
        //    51: aload_1        
        //    52: athrow         
        //    53: astore_2       
        //    54: aload_2        
        //    55: athrow         
        //    56: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      11     50     53     Ljava/lang/UnsupportedOperationException;
        //  17     29     53     56     Ljava/lang/UnsupportedOperationException;
        //  29     49     53     56     Ljava/lang/UnsupportedOperationException;
        //  51     53     53     56     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        final View selectedView = this.getSelectedView();
        if (selectedView != null) {
            try {
                if (selectedView.getVisibility() != 0) {
                    return false;
                }
                final View view = selectedView;
                final AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
                final boolean b = view.dispatchPopulateAccessibilityEvent(accessibilityEvent2);
                if (b) {
                    return true;
                }
                return false;
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            try {
                final View view = selectedView;
                final AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
                final boolean b = view.dispatchPopulateAccessibilityEvent(accessibilityEvent2);
                if (b) {
                    return true;
                }
            }
            catch (UnsupportedOperationException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }
    
    protected void dispatchSaveInstanceState(final SparseArray sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }
    
    int findSyncPosition() {
        final int a = AdapterViewCompat.a;
        final int mItemCount = this.mItemCount;
        int n;
        if (mItemCount == 0) {
            n = -1;
        }
        else {
            final long mSyncRowId = this.mSyncRowId;
            final int mSyncPosition = this.mSyncPosition;
            if (mSyncRowId == Long.MIN_VALUE) {
                return -1;
            }
            int min = Math.min(mItemCount - 1, Math.max(0, mSyncPosition));
            final long n2 = 100L + SystemClock.uptimeMillis();
            final Adapter adapter = this.getAdapter();
            if (adapter == null) {
                return -1;
            }
            int n3 = min;
            n = min;
            int n4 = 0;
            while (SystemClock.uptimeMillis() <= n2) {
                if (adapter.getItemId(n) == mSyncRowId) {
                    return n;
                }
                boolean b;
                if (min == mItemCount - 1) {
                    b = true;
                }
                else {
                    b = false;
                }
                boolean b2;
                if (n3 == 0) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (b && b2 && a == 0) {
                    break;
                }
                if (b2 || (n4 != 0 && !b)) {
                    ++min;
                    n4 = 0;
                    if (a == 0) {
                        n = min;
                        n4 = 0;
                        continue;
                    }
                    n = min;
                }
                if (!b && (n4 != 0 || b2)) {
                    continue;
                }
                --n3;
                n4 = 1;
                if (a != 0) {
                    break;
                }
                n = n3;
            }
            return -1;
        }
        return n;
    }
    
    public abstract Adapter getAdapter();
    
    public long getItemIdAtPosition(final int n) {
        final Adapter adapter = this.getAdapter();
        if (adapter == null || n < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(n);
    }
    
    @ViewDebug$CapturedViewProperty
    public long getSelectedItemId() {
        return this.mNextSelectedRowId;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.mNextSelectedPosition;
    }
    
    public abstract View getSelectedView();
    
    void handleDataChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/widget/AdapterViewCompat.mItemCount:I
        //     4: istore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: iload_1        
        //     8: ifle            129
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/AdapterViewCompat.mNeedSync:Z
        //    15: istore          5
        //    17: iload           5
        //    19: ifeq            188
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNeedSync:Z
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.findSyncPosition:()I
        //    31: istore          10
        //    33: iload           10
        //    35: iflt            188
        //    38: aload_0        
        //    39: iload           10
        //    41: iconst_1       
        //    42: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.lookForSelectablePosition:(IZ)I
        //    45: iload           10
        //    47: if_icmpne       188
        //    50: aload_0        
        //    51: iload           10
        //    53: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.setNextSelectedPositionInt:(I)V
        //    56: iconst_1       
        //    57: istore          6
        //    59: iload           6
        //    61: ifne            175
        //    64: aload_0        
        //    65: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getSelectedItemPosition:()I
        //    68: istore          7
        //    70: iload           7
        //    72: iload_1        
        //    73: if_icmplt       81
        //    76: iload_1        
        //    77: iconst_1       
        //    78: isub           
        //    79: istore          7
        //    81: iload           7
        //    83: ifge            89
        //    86: iconst_0       
        //    87: istore          7
        //    89: aload_0        
        //    90: iload           7
        //    92: iconst_1       
        //    93: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.lookForSelectablePosition:(IZ)I
        //    96: istore          8
        //    98: iload           8
        //   100: ifge            181
        //   103: aload_0        
        //   104: iload           7
        //   106: iconst_0       
        //   107: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.lookForSelectablePosition:(IZ)I
        //   110: istore          9
        //   112: iload           9
        //   114: iflt            175
        //   117: aload_0        
        //   118: iload           9
        //   120: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.setNextSelectedPositionInt:(I)V
        //   123: aload_0        
        //   124: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.checkSelectionChanged:()V
        //   127: iconst_1       
        //   128: istore_2       
        //   129: iload_2        
        //   130: ifne            166
        //   133: aload_0        
        //   134: iconst_m1      
        //   135: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //   138: aload_0        
        //   139: ldc2_w          -9223372036854775808
        //   142: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedRowId:J
        //   145: aload_0        
        //   146: iconst_m1      
        //   147: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedPosition:I
        //   150: aload_0        
        //   151: ldc2_w          -9223372036854775808
        //   154: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedRowId:J
        //   157: aload_0        
        //   158: iconst_0       
        //   159: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNeedSync:Z
        //   162: aload_0        
        //   163: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.checkSelectionChanged:()V
        //   166: return         
        //   167: astore          4
        //   169: aload           4
        //   171: athrow         
        //   172: astore_3       
        //   173: aload_3        
        //   174: athrow         
        //   175: iload           6
        //   177: istore_2       
        //   178: goto            129
        //   181: iload           8
        //   183: istore          9
        //   185: goto            112
        //   188: iconst_0       
        //   189: istore          6
        //   191: goto            59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  11     17     167    172    Ljava/lang/UnsupportedOperationException;
        //  133    166    172    175    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0166:
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
    
    boolean isInFilterMode() {
        return false;
    }
    
    int lookForSelectablePosition(final int n, final boolean b) {
        return n;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks((Runnable)this.mSelectionNotifier);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.mLayoutHeight = this.getHeight();
    }
    
    public boolean performItemClick(final View p0, final int p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/widget/AdapterViewCompat.mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewCompat$OnItemClickListener;
        //     4: astore          7
        //     6: iconst_0       
        //     7: istore          8
        //     9: aload           7
        //    11: ifnull          44
        //    14: aload_0        
        //    15: iconst_0       
        //    16: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.playSoundEffect:(I)V
        //    19: aload_1        
        //    20: ifnull          28
        //    23: aload_1        
        //    24: iconst_1       
        //    25: invokevirtual   android/view/View.sendAccessibilityEvent:(I)V
        //    28: aload_0        
        //    29: getfield        android/support/v7/internal/widget/AdapterViewCompat.mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewCompat$OnItemClickListener;
        //    32: aload_0        
        //    33: aload_1        
        //    34: iload_2        
        //    35: lload_3        
        //    36: invokeinterface android/support/v7/internal/widget/AdapterViewCompat$OnItemClickListener.onItemClick:(Landroid/support/v7/internal/widget/AdapterViewCompat;Landroid/view/View;IJ)V
        //    41: iconst_1       
        //    42: istore          8
        //    44: iload           8
        //    46: ireturn        
        //    47: astore          5
        //    49: aload           5
        //    51: athrow         
        //    52: astore          6
        //    54: aload           6
        //    56: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      47     52     Ljava/lang/UnsupportedOperationException;
        //  14     19     52     57     Ljava/lang/UnsupportedOperationException;
        //  23     28     52     57     Ljava/lang/UnsupportedOperationException;
        //  49     52     52     57     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    void rememberSyncState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getChildCount:()I
        //     8: ifle            187
        //    11: aload_0        
        //    12: iconst_1       
        //    13: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNeedSync:Z
        //    16: aload_0        
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/widget/AdapterViewCompat.mLayoutHeight:I
        //    21: i2l            
        //    22: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncHeight:J
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //    29: istore_3       
        //    30: iload_3        
        //    31: iflt            88
        //    34: aload_0        
        //    35: aload_0        
        //    36: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //    39: aload_0        
        //    40: getfield        android/support/v7/internal/widget/AdapterViewCompat.mFirstPosition:I
        //    43: isub           
        //    44: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getChildAt:(I)Landroid/view/View;
        //    47: astore          13
        //    49: aload_0        
        //    50: aload_0        
        //    51: getfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedRowId:J
        //    54: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncRowId:J
        //    57: aload_0        
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedPosition:I
        //    62: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncPosition:I
        //    65: aload           13
        //    67: ifnull          79
        //    70: aload_0        
        //    71: aload           13
        //    73: invokevirtual   android/view/View.getTop:()I
        //    76: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSpecificTop:I
        //    79: aload_0        
        //    80: iconst_0       
        //    81: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncMode:I
        //    84: iload_1        
        //    85: ifeq            187
        //    88: aload_0        
        //    89: iconst_0       
        //    90: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getChildAt:(I)Landroid/view/View;
        //    93: astore          4
        //    95: aload_0        
        //    96: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getAdapter:()Landroid/widget/Adapter;
        //    99: astore          5
        //   101: aload_0        
        //   102: getfield        android/support/v7/internal/widget/AdapterViewCompat.mFirstPosition:I
        //   105: istore          9
        //   107: iload           9
        //   109: iflt            153
        //   112: aload_0        
        //   113: getfield        android/support/v7/internal/widget/AdapterViewCompat.mFirstPosition:I
        //   116: istore          11
        //   118: aload           5
        //   120: invokeinterface android/widget/Adapter.getCount:()I
        //   125: istore          12
        //   127: iload           11
        //   129: iload           12
        //   131: if_icmpge       153
        //   134: aload_0        
        //   135: aload           5
        //   137: aload_0        
        //   138: getfield        android/support/v7/internal/widget/AdapterViewCompat.mFirstPosition:I
        //   141: invokeinterface android/widget/Adapter.getItemId:(I)J
        //   146: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncRowId:J
        //   149: iload_1        
        //   150: ifeq            160
        //   153: aload_0        
        //   154: ldc2_w          -1
        //   157: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncRowId:J
        //   160: aload_0        
        //   161: aload_0        
        //   162: getfield        android/support/v7/internal/widget/AdapterViewCompat.mFirstPosition:I
        //   165: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncPosition:I
        //   168: aload           4
        //   170: ifnull          182
        //   173: aload_0        
        //   174: aload           4
        //   176: invokevirtual   android/view/View.getTop:()I
        //   179: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSpecificTop:I
        //   182: aload_0        
        //   183: iconst_1       
        //   184: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncMode:I
        //   187: return         
        //   188: astore_2       
        //   189: aload_2        
        //   190: athrow         
        //   191: astore          14
        //   193: aload           14
        //   195: athrow         
        //   196: astore          6
        //   198: aload           6
        //   200: athrow         
        //   201: astore          7
        //   203: aload           7
        //   205: athrow         
        //   206: astore          8
        //   208: aload           8
        //   210: athrow         
        //   211: astore          10
        //   213: aload           10
        //   215: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      30     188    191    Ljava/lang/UnsupportedOperationException;
        //  49     65     191    196    Ljava/lang/UnsupportedOperationException;
        //  70     79     191    196    Ljava/lang/UnsupportedOperationException;
        //  101    107    196    201    Ljava/lang/UnsupportedOperationException;
        //  112    127    201    206    Ljava/lang/UnsupportedOperationException;
        //  134    149    206    211    Ljava/lang/UnsupportedOperationException;
        //  153    160    206    211    Ljava/lang/UnsupportedOperationException;
        //  160    168    211    216    Ljava/lang/UnsupportedOperationException;
        //  173    182    211    216    Ljava/lang/UnsupportedOperationException;
        //  198    201    201    206    Ljava/lang/UnsupportedOperationException;
        //  203    206    206    211    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
    
    public void removeAllViews() {
        throw new UnsupportedOperationException(AdapterViewCompat.z[2]);
    }
    
    public void removeView(final View view) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[4]);
    }
    
    public void removeViewAt(final int n) {
        throw new UnsupportedOperationException(AdapterViewCompat.z[5]);
    }
    
    void selectionChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/widget/AdapterViewCompat.mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewCompat$OnItemSelectedListener;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          72
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/AdapterViewCompat.mInLayout:Z
        //    15: istore          11
        //    17: iload           11
        //    19: ifne            33
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/widget/AdapterViewCompat.mBlockLayoutRequests:Z
        //    26: istore          14
        //    28: iload           14
        //    30: ifeq            68
        //    33: aload_0        
        //    34: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewCompat$SelectionNotifier;
        //    37: ifnonnull       53
        //    40: aload_0        
        //    41: new             Landroid/support/v7/internal/widget/AdapterViewCompat$SelectionNotifier;
        //    44: dup            
        //    45: aload_0        
        //    46: aconst_null    
        //    47: invokespecial   android/support/v7/internal/widget/AdapterViewCompat$SelectionNotifier.<init>:(Landroid/support/v7/internal/widget/AdapterViewCompat;Landroid/support/v7/internal/widget/AdapterViewCompat$1;)V
        //    50: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewCompat$SelectionNotifier;
        //    53: aload_0        
        //    54: aload_0        
        //    55: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewCompat$SelectionNotifier;
        //    58: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.post:(Ljava/lang/Runnable;)Z
        //    61: pop            
        //    62: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //    65: ifeq            72
        //    68: aload_0        
        //    69: invokespecial   android/support/v7/internal/widget/AdapterViewCompat.fireOnSelected:()V
        //    72: aload_0        
        //    73: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSelectedPosition:I
        //    76: istore          9
        //    78: iload           9
        //    80: iconst_m1      
        //    81: if_icmpeq       107
        //    84: aload_0        
        //    85: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isShown:()Z
        //    88: istore          10
        //    90: iload           10
        //    92: ifeq            107
        //    95: aload_0        
        //    96: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isInTouchMode:()Z
        //    99: ifne            107
        //   102: aload_0        
        //   103: iconst_4       
        //   104: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.sendAccessibilityEvent:(I)V
        //   107: return         
        //   108: astore_1       
        //   109: aload_1        
        //   110: athrow         
        //   111: astore_2       
        //   112: aload_2        
        //   113: athrow         
        //   114: astore_3       
        //   115: aload_3        
        //   116: athrow         
        //   117: astore          4
        //   119: aload           4
        //   121: athrow         
        //   122: astore          12
        //   124: aload           12
        //   126: athrow         
        //   127: astore          6
        //   129: aload           6
        //   131: athrow         
        //   132: astore          7
        //   134: aload           7
        //   136: athrow         
        //   137: astore          8
        //   139: aload           8
        //   141: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      108    111    Ljava/lang/UnsupportedOperationException;
        //  11     17     111    114    Ljava/lang/UnsupportedOperationException;
        //  22     28     114    117    Ljava/lang/UnsupportedOperationException;
        //  33     53     117    122    Ljava/lang/UnsupportedOperationException;
        //  53     68     122    127    Ljava/lang/UnsupportedOperationException;
        //  68     72     122    127    Ljava/lang/UnsupportedOperationException;
        //  72     78     127    132    Ljava/lang/UnsupportedOperationException;
        //  84     90     132    137    Ljava/lang/UnsupportedOperationException;
        //  95     107    137    142    Ljava/lang/UnsupportedOperationException;
        //  109    111    111    114    Ljava/lang/UnsupportedOperationException;
        //  112    114    114    117    Ljava/lang/UnsupportedOperationException;
        //  115    117    117    122    Ljava/lang/UnsupportedOperationException;
        //  129    132    132    137    Ljava/lang/UnsupportedOperationException;
        //  134    137    137    142    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
    
    public void setFocusable(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getAdapter:()Landroid/widget/Adapter;
        //     6: astore_3       
        //     7: aload_3        
        //     8: ifnull          24
        //    11: aload_3        
        //    12: invokeinterface android/widget/Adapter.getCount:()I
        //    17: istore          9
        //    19: iload           9
        //    21: ifne            72
        //    24: iload_2        
        //    25: istore          4
        //    27: aload_0        
        //    28: iload_1        
        //    29: putfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableState:Z
        //    32: iload_1        
        //    33: ifne            41
        //    36: aload_0        
        //    37: iconst_0       
        //    38: putfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableInTouchModeState:Z
        //    41: iload_1        
        //    42: ifeq            88
        //    45: iload           4
        //    47: ifeq            61
        //    50: aload_0        
        //    51: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isInFilterMode:()Z
        //    54: istore          7
        //    56: iload           7
        //    58: ifeq            88
        //    61: aload_0        
        //    62: iload_2        
        //    63: invokespecial   android/view/ViewGroup.setFocusable:(Z)V
        //    66: return         
        //    67: astore          8
        //    69: aload           8
        //    71: athrow         
        //    72: iconst_0       
        //    73: istore          4
        //    75: goto            27
        //    78: astore          5
        //    80: aload           5
        //    82: athrow         
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    88: iconst_0       
        //    89: istore_2       
        //    90: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  11     19     67     72     Ljava/lang/UnsupportedOperationException;
        //  27     32     78     83     Ljava/lang/UnsupportedOperationException;
        //  36     41     78     83     Ljava/lang/UnsupportedOperationException;
        //  50     56     83     88     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
    
    public void setFocusableInTouchMode(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getAdapter:()Landroid/widget/Adapter;
        //     6: astore_3       
        //     7: aload_3        
        //     8: ifnull          24
        //    11: aload_3        
        //    12: invokeinterface android/widget/Adapter.getCount:()I
        //    17: istore          9
        //    19: iload           9
        //    21: ifne            72
        //    24: iload_2        
        //    25: istore          4
        //    27: aload_0        
        //    28: iload_1        
        //    29: putfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableInTouchModeState:Z
        //    32: iload_1        
        //    33: ifeq            41
        //    36: aload_0        
        //    37: iconst_1       
        //    38: putfield        android/support/v7/internal/widget/AdapterViewCompat.mDesiredFocusableState:Z
        //    41: iload_1        
        //    42: ifeq            88
        //    45: iload           4
        //    47: ifeq            61
        //    50: aload_0        
        //    51: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.isInFilterMode:()Z
        //    54: istore          7
        //    56: iload           7
        //    58: ifeq            88
        //    61: aload_0        
        //    62: iload_2        
        //    63: invokespecial   android/view/ViewGroup.setFocusableInTouchMode:(Z)V
        //    66: return         
        //    67: astore          8
        //    69: aload           8
        //    71: athrow         
        //    72: iconst_0       
        //    73: istore          4
        //    75: goto            27
        //    78: astore          5
        //    80: aload           5
        //    82: athrow         
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    88: iconst_0       
        //    89: istore_2       
        //    90: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  11     19     67     72     Ljava/lang/UnsupportedOperationException;
        //  27     32     78     83     Ljava/lang/UnsupportedOperationException;
        //  36     41     78     83     Ljava/lang/UnsupportedOperationException;
        //  50     56     83     88     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
    
    void setNextSelectedPositionInt(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1        
        //     2: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedPosition:I
        //     5: aload_0        
        //     6: aload_0        
        //     7: iload_1        
        //     8: invokevirtual   android/support/v7/internal/widget/AdapterViewCompat.getItemIdAtPosition:(I)J
        //    11: putfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedRowId:J
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/widget/AdapterViewCompat.mNeedSync:Z
        //    18: istore          5
        //    20: iload           5
        //    22: ifeq            53
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncMode:I
        //    29: istore          6
        //    31: iload           6
        //    33: ifne            53
        //    36: iload_1        
        //    37: iflt            53
        //    40: aload_0        
        //    41: iload_1        
        //    42: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncPosition:I
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        android/support/v7/internal/widget/AdapterViewCompat.mNextSelectedRowId:J
        //    50: putfield        android/support/v7/internal/widget/AdapterViewCompat.mSyncRowId:J
        //    53: return         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      20     54     57     Ljava/lang/UnsupportedOperationException;
        //  25     31     57     60     Ljava/lang/UnsupportedOperationException;
        //  40     53     60     65     Ljava/lang/UnsupportedOperationException;
        //  55     57     57     60     Ljava/lang/UnsupportedOperationException;
        //  58     60     60     65     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
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
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        throw new RuntimeException(AdapterViewCompat.z[3]);
    }
    
    public void setOnItemClickListener(final AdapterViewCompat$OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }
    
    void setSelectedPositionInt(final int mSelectedPosition) {
        this.mSelectedPosition = mSelectedPosition;
        this.mSelectedRowId = this.getItemIdAtPosition(mSelectedPosition);
    }
}
