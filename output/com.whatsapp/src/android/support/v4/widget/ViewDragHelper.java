// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.support.v4.view.VelocityTrackerCompat;
import java.util.Arrays;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Interpolator;

public class ViewDragHelper
{
    private static final Interpolator sInterpolator;
    private static final String[] z;
    private int mActivePointerId;
    private final ViewDragHelper$Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0011l\u0017^`&-\nU{&a\u001csn\"y\fBj6[\u0010Ux\u0013yY_z&~\u0010Tjrb\u001f\u0010nrn\u0018\\cry\u0016\u0010L3a\u0015Rn1fZ_a\u0004d\u001cG]7a\u001cQ|7i";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
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
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1l\tDz h:Xf>i/Yj%7Y@n l\u0014U{7\u007fY]z!yYRjrlYTj!n\u001c^k3c\r\u0010`4-\rXjr[\u0010Ux\u0016\u007f\u0018WG7a\tU}u~YD}3n\u0012Ukr}\u0018Bj<yYFf7zY\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011l\u0015\\m3n\u0012\u0010b3tY^`&-\u001bU/<x\u0015\\";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0002l\u000bUa&-\u000fYj%-\u0014Qvrc\u0016D/0hY^z>a";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        sInterpolator = (Interpolator)new ViewDragHelper$1();
    }
    
    private ViewDragHelper(final Context context, final ViewGroup mParentView, final ViewDragHelper$Callback mCallback) {
        this.mActivePointerId = -1;
        this.mSetIdleRunnable = new ViewDragHelper$2(this);
        if (mParentView == null) {
            throw new IllegalArgumentException(ViewDragHelper.z[3]);
        }
        if (mCallback == null) {
            try {
                throw new IllegalArgumentException(ViewDragHelper.z[2]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.mParentView = mParentView;
        this.mCallback = mCallback;
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.mEdgeSize = (int)(0.5f + 20.0f * context.getResources().getDisplayMetrics().density);
        this.mTouchSlop = value.getScaledTouchSlop();
        this.mMaxVelocity = value.getScaledMaximumFlingVelocity();
        this.mMinVelocity = value.getScaledMinimumFlingVelocity();
        this.mScroller = ScrollerCompat.create(context, ViewDragHelper.sInterpolator);
    }
    
    private boolean checkNewEdgeDrag(final float p0, final float p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: fload_1        
        //     1: invokestatic    java/lang/Math.abs:(F)F
        //     4: fstore          5
        //     6: fload_2        
        //     7: invokestatic    java/lang/Math.abs:(F)F
        //    10: fstore          6
        //    12: aload_0        
        //    13: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //    16: iload_3        
        //    17: iaload         
        //    18: istore          13
        //    20: iload           13
        //    22: iload           4
        //    24: iand           
        //    25: iload           4
        //    27: if_icmpne       110
        //    30: aload_0        
        //    31: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //    34: istore          14
        //    36: iload           14
        //    38: iload           4
        //    40: iand           
        //    41: ifeq            110
        //    44: aload_0        
        //    45: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsLocked:[I
        //    48: iload_3        
        //    49: iaload         
        //    50: istore          15
        //    52: iload           15
        //    54: iload           4
        //    56: iand           
        //    57: iload           4
        //    59: if_icmpeq       110
        //    62: aload_0        
        //    63: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsInProgress:[I
        //    66: iload_3        
        //    67: iaload         
        //    68: istore          16
        //    70: iload           16
        //    72: iload           4
        //    74: iand           
        //    75: iload           4
        //    77: if_icmpeq       110
        //    80: aload_0        
        //    81: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //    84: istore          17
        //    86: fload           5
        //    88: iload           17
        //    90: i2f            
        //    91: fcmpg          
        //    92: ifgt            142
        //    95: aload_0        
        //    96: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //    99: istore          23
        //   101: fload           6
        //   103: iload           23
        //   105: i2f            
        //   106: fcmpg          
        //   107: ifgt            142
        //   110: iconst_0       
        //   111: ireturn        
        //   112: astore          7
        //   114: aload           7
        //   116: athrow         
        //   117: astore          8
        //   119: aload           8
        //   121: athrow         
        //   122: astore          9
        //   124: aload           9
        //   126: athrow         
        //   127: astore          10
        //   129: aload           10
        //   131: athrow         
        //   132: astore          11
        //   134: aload           11
        //   136: athrow         
        //   137: astore          12
        //   139: aload           12
        //   141: athrow         
        //   142: fload           5
        //   144: fload           6
        //   146: ldc             0.5
        //   148: fmul           
        //   149: fcmpg          
        //   150: ifge            189
        //   153: aload_0        
        //   154: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   157: iload           4
        //   159: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onEdgeLock:(I)Z
        //   162: ifeq            189
        //   165: aload_0        
        //   166: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsLocked:[I
        //   169: astore          22
        //   171: aload           22
        //   173: iload_3        
        //   174: iload           4
        //   176: aload           22
        //   178: iload_3        
        //   179: iaload         
        //   180: ior            
        //   181: iastore        
        //   182: iconst_0       
        //   183: ireturn        
        //   184: astore          21
        //   186: aload           21
        //   188: athrow         
        //   189: aload_0        
        //   190: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsInProgress:[I
        //   193: iload_3        
        //   194: iaload         
        //   195: istore          20
        //   197: iload           20
        //   199: iload           4
        //   201: iand           
        //   202: ifne            110
        //   205: fload           5
        //   207: aload_0        
        //   208: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //   211: i2f            
        //   212: fcmpl          
        //   213: ifle            110
        //   216: iconst_1       
        //   217: ireturn        
        //   218: astore          18
        //   220: aload           18
        //   222: athrow         
        //   223: astore          19
        //   225: aload           19
        //   227: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     20     112    117    Ljava/lang/IllegalArgumentException;
        //  30     36     117    122    Ljava/lang/IllegalArgumentException;
        //  44     52     122    127    Ljava/lang/IllegalArgumentException;
        //  62     70     127    132    Ljava/lang/IllegalArgumentException;
        //  80     86     132    137    Ljava/lang/IllegalArgumentException;
        //  95     101    137    142    Ljava/lang/IllegalArgumentException;
        //  114    117    117    122    Ljava/lang/IllegalArgumentException;
        //  119    122    122    127    Ljava/lang/IllegalArgumentException;
        //  124    127    127    132    Ljava/lang/IllegalArgumentException;
        //  129    132    132    137    Ljava/lang/IllegalArgumentException;
        //  134    137    137    142    Ljava/lang/IllegalArgumentException;
        //  153    182    184    189    Ljava/lang/IllegalArgumentException;
        //  189    197    218    223    Ljava/lang/IllegalArgumentException;
        //  205    216    223    228    Ljava/lang/IllegalArgumentException;
        //  220    223    223    228    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    private boolean checkTouchSlop(final View p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore          4
        //     3: aload_1        
        //     4: ifnonnull       13
        //     7: iconst_0       
        //     8: istore          4
        //    10: iload           4
        //    12: ireturn        
        //    13: aload_0        
        //    14: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //    17: aload_1        
        //    18: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.getViewHorizontalDragRange:(Landroid/view/View;)I
        //    21: istore          6
        //    23: iload           6
        //    25: ifle            101
        //    28: iload           4
        //    30: istore          7
        //    32: aload_0        
        //    33: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //    36: aload_1        
        //    37: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.getViewVerticalDragRange:(Landroid/view/View;)I
        //    40: istore          9
        //    42: iload           9
        //    44: ifle            112
        //    47: iload           4
        //    49: istore          10
        //    51: iload           7
        //    53: ifeq            123
        //    56: iload           10
        //    58: ifeq            123
        //    61: fload_2        
        //    62: fload_2        
        //    63: fmul           
        //    64: fload_3        
        //    65: fload_3        
        //    66: fmul           
        //    67: fadd           
        //    68: fstore          17
        //    70: aload_0        
        //    71: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //    74: istore          19
        //    76: aload_0        
        //    77: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //    80: istore          20
        //    82: fload           17
        //    84: iload           19
        //    86: iload           20
        //    88: imul           
        //    89: i2f            
        //    90: fcmpl          
        //    91: ifgt            10
        //    94: iconst_0       
        //    95: ireturn        
        //    96: astore          5
        //    98: aload           5
        //   100: athrow         
        //   101: iconst_0       
        //   102: istore          7
        //   104: goto            32
        //   107: astore          8
        //   109: aload           8
        //   111: athrow         
        //   112: iconst_0       
        //   113: istore          10
        //   115: goto            51
        //   118: astore          18
        //   120: aload           18
        //   122: athrow         
        //   123: iload           7
        //   125: ifeq            156
        //   128: fload_2        
        //   129: invokestatic    java/lang/Math.abs:(F)F
        //   132: fstore          15
        //   134: aload_0        
        //   135: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //   138: istore          16
        //   140: fload           15
        //   142: iload           16
        //   144: i2f            
        //   145: fcmpl          
        //   146: ifgt            10
        //   149: iconst_0       
        //   150: ireturn        
        //   151: astore          14
        //   153: aload           14
        //   155: athrow         
        //   156: iload           10
        //   158: ifeq            189
        //   161: fload_3        
        //   162: invokestatic    java/lang/Math.abs:(F)F
        //   165: fstore          12
        //   167: aload_0        
        //   168: getfield        android/support/v4/widget/ViewDragHelper.mTouchSlop:I
        //   171: istore          13
        //   173: fload           12
        //   175: iload           13
        //   177: i2f            
        //   178: fcmpl          
        //   179: ifgt            10
        //   182: iconst_0       
        //   183: ireturn        
        //   184: astore          11
        //   186: aload           11
        //   188: athrow         
        //   189: iconst_0       
        //   190: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  13     23     96     101    Ljava/lang/IllegalArgumentException;
        //  32     42     107    112    Ljava/lang/IllegalArgumentException;
        //  70     82     118    123    Ljava/lang/IllegalArgumentException;
        //  128    140    151    156    Ljava/lang/IllegalArgumentException;
        //  161    173    184    189    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 106, Size: 106
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
    
    private float clampMag(final float n, final float n2, float n3) {
        final float abs = Math.abs(n);
        if (abs < n2) {
            n3 = 0.0f;
        }
        else {
            if (abs <= n3) {
                return n;
            }
            if (n <= 0.0f) {
                return -n3;
            }
        }
        return n3;
    }
    
    private int clampMag(final int n, final int n2, int n3) {
        final int abs = Math.abs(n);
        if (abs < n2) {
            n3 = 0;
        }
        else {
            if (abs <= n3) {
                return n;
            }
            if (n <= 0) {
                return -n3;
            }
        }
        return n3;
    }
    
    private void clearMotionHistory() {
        try {
            if (this.mInitialMotionX == null) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        Arrays.fill(this.mInitialMotionX, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }
    
    private void clearMotionHistory(final int n) {
        try {
            if (this.mInitialMotionX == null) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.mInitialMotionX[n] = 0.0f;
        this.mInitialMotionY[n] = 0.0f;
        this.mLastMotionX[n] = 0.0f;
        this.mLastMotionY[n] = 0.0f;
        this.mInitialEdgesTouched[n] = 0;
        this.mEdgeDragsInProgress[n] = 0;
        this.mEdgeDragsLocked[n] = 0;
        this.mPointersDown &= (-1 ^ 1 << n);
    }
    
    private int computeAxisDuration(final int n, final int n2, final int n3) {
        if (n == 0) {
            return 0;
        }
        final int width = this.mParentView.getWidth();
        final int n4 = width / 2;
        final float n5 = n4 + n4 * this.distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(n) / width));
        final int abs = Math.abs(n2);
        if (abs > 0) {
            final int n6 = 4 * Math.round(1000.0f * Math.abs(n5 / abs));
            if (!SlidingPaneLayout.a) {
                return Math.min(n6, 600);
            }
        }
        final int n6 = (int)(256.0f * (1.0f + Math.abs(n) / n3));
        return Math.min(n6, 600);
    }
    
    private int computeSettleDuration(final View view, final int n, final int n2, final int n3, final int n4) {
        final int clampMag = this.clampMag(n3, (int)this.mMinVelocity, (int)this.mMaxVelocity);
        final int clampMag2 = this.clampMag(n4, (int)this.mMinVelocity, (int)this.mMaxVelocity);
        final int abs = Math.abs(n);
        final int abs2 = Math.abs(n2);
        final int abs3 = Math.abs(clampMag);
        final int abs4 = Math.abs(clampMag2);
        final int n5 = abs3 + abs4;
        final int n6 = abs + abs2;
        float n7;
        if (clampMag != 0) {
            n7 = abs3 / n5;
        }
        else {
            n7 = abs / n6;
        }
        float n8;
        if (clampMag2 != 0) {
            n8 = abs4 / n5;
        }
        else {
            n8 = abs2 / n6;
        }
        return (int)(n7 * this.computeAxisDuration(n, clampMag, this.mCallback.getViewHorizontalDragRange(view)) + n8 * this.computeAxisDuration(n2, clampMag2, this.mCallback.getViewVerticalDragRange(view)));
    }
    
    public static ViewDragHelper create(final ViewGroup viewGroup, final float n, final ViewDragHelper$Callback viewDragHelper$Callback) {
        final ViewDragHelper create = create(viewGroup, viewDragHelper$Callback);
        create.mTouchSlop *= (int)(1.0f / n);
        return create;
    }
    
    public static ViewDragHelper create(final ViewGroup viewGroup, final ViewDragHelper$Callback viewDragHelper$Callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, viewDragHelper$Callback);
    }
    
    private void dispatchViewReleased(final float n, final float n2) {
        try {
            this.mReleaseInProgress = true;
            this.mCallback.onViewReleased(this.mCapturedView, n, n2);
            this.mReleaseInProgress = false;
            if (this.mDragState == 1) {
                this.setDragState(0);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private float distanceInfluenceForSnapDuration(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    private void dragTo(final int n, final int n2, final int n3, final int n4) {
        final int left = this.mCapturedView.getLeft();
        final int top = this.mCapturedView.getTop();
        int clampViewPositionHorizontal;
        if (n3 != 0) {
            clampViewPositionHorizontal = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, n, n3);
            this.mCapturedView.offsetLeftAndRight(clampViewPositionHorizontal - left);
        }
        else {
            clampViewPositionHorizontal = n;
        }
        int clampViewPositionVertical;
        if (n4 != 0) {
            clampViewPositionVertical = this.mCallback.clampViewPositionVertical(this.mCapturedView, n2, n4);
            this.mCapturedView.offsetTopAndBottom(clampViewPositionVertical - top);
        }
        else {
            clampViewPositionVertical = n2;
        }
        if (n3 != 0 || n4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, clampViewPositionHorizontal, clampViewPositionVertical, clampViewPositionHorizontal - left, clampViewPositionVertical - top);
        }
    }
    
    private void ensureMotionHistorySizeForId(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //     4: ifnull          20
        //     7: aload_0        
        //     8: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //    11: arraylength    
        //    12: istore          11
        //    14: iload           11
        //    16: iload_1        
        //    17: if_icmpgt       227
        //    20: iload_1        
        //    21: iconst_1       
        //    22: iadd           
        //    23: newarray        F
        //    25: astore_3       
        //    26: iload_1        
        //    27: iconst_1       
        //    28: iadd           
        //    29: newarray        F
        //    31: astore          4
        //    33: iload_1        
        //    34: iconst_1       
        //    35: iadd           
        //    36: newarray        F
        //    38: astore          5
        //    40: iload_1        
        //    41: iconst_1       
        //    42: iadd           
        //    43: newarray        F
        //    45: astore          6
        //    47: iload_1        
        //    48: iconst_1       
        //    49: iadd           
        //    50: newarray        I
        //    52: astore          7
        //    54: iload_1        
        //    55: iconst_1       
        //    56: iadd           
        //    57: newarray        I
        //    59: astore          8
        //    61: iload_1        
        //    62: iconst_1       
        //    63: iadd           
        //    64: newarray        I
        //    66: astore          9
        //    68: aload_0        
        //    69: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //    72: ifnull          186
        //    75: aload_0        
        //    76: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //    79: iconst_0       
        //    80: aload_3        
        //    81: iconst_0       
        //    82: aload_0        
        //    83: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //    86: arraylength    
        //    87: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    90: aload_0        
        //    91: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //    94: iconst_0       
        //    95: aload           4
        //    97: iconst_0       
        //    98: aload_0        
        //    99: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //   102: arraylength    
        //   103: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   106: aload_0        
        //   107: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionX:[F
        //   110: iconst_0       
        //   111: aload           5
        //   113: iconst_0       
        //   114: aload_0        
        //   115: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionX:[F
        //   118: arraylength    
        //   119: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   122: aload_0        
        //   123: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionY:[F
        //   126: iconst_0       
        //   127: aload           6
        //   129: iconst_0       
        //   130: aload_0        
        //   131: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionY:[F
        //   134: arraylength    
        //   135: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   138: aload_0        
        //   139: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   142: iconst_0       
        //   143: aload           7
        //   145: iconst_0       
        //   146: aload_0        
        //   147: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   150: arraylength    
        //   151: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   154: aload_0        
        //   155: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsInProgress:[I
        //   158: iconst_0       
        //   159: aload           8
        //   161: iconst_0       
        //   162: aload_0        
        //   163: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsInProgress:[I
        //   166: arraylength    
        //   167: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   170: aload_0        
        //   171: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsLocked:[I
        //   174: iconst_0       
        //   175: aload           9
        //   177: iconst_0       
        //   178: aload_0        
        //   179: getfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsLocked:[I
        //   182: arraylength    
        //   183: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   186: aload_0        
        //   187: aload_3        
        //   188: putfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //   191: aload_0        
        //   192: aload           4
        //   194: putfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //   197: aload_0        
        //   198: aload           5
        //   200: putfield        android/support/v4/widget/ViewDragHelper.mLastMotionX:[F
        //   203: aload_0        
        //   204: aload           6
        //   206: putfield        android/support/v4/widget/ViewDragHelper.mLastMotionY:[F
        //   209: aload_0        
        //   210: aload           7
        //   212: putfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   215: aload_0        
        //   216: aload           8
        //   218: putfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsInProgress:[I
        //   221: aload_0        
        //   222: aload           9
        //   224: putfield        android/support/v4/widget/ViewDragHelper.mEdgeDragsLocked:[I
        //   227: return         
        //   228: astore_2       
        //   229: aload_2        
        //   230: athrow         
        //   231: astore          10
        //   233: aload           10
        //   235: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      14     228    231    Ljava/lang/IllegalArgumentException;
        //  68     186    231    236    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0186:
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
    
    private boolean forceSettleCapturedViewAt(final int n, final int n2, final int n3, final int n4) {
        final int left = this.mCapturedView.getLeft();
        final int top = this.mCapturedView.getTop();
        final int n5 = n - left;
        final int n6 = n2 - top;
        if (n5 == 0 && n6 == 0) {
            try {
                this.mScroller.abortAnimation();
                this.setDragState(0);
                return false;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.mScroller.startScroll(left, top, n5, n6, this.computeSettleDuration(this.mCapturedView, n5, n6, n3, n4));
        this.setDragState(2);
        return true;
    }
    
    private int getEdgesTouched(final int n, final int n2) {
        final int n3 = this.mParentView.getLeft() + this.mEdgeSize;
        int n4 = 0;
        if (n < n3) {
            n4 = 1;
        }
        if (n2 < this.mParentView.getTop() + this.mEdgeSize) {
            n4 |= 0x4;
        }
        if (n > this.mParentView.getRight() - this.mEdgeSize) {
            n4 |= 0x2;
        }
        if (n2 > this.mParentView.getBottom() - this.mEdgeSize) {
            n4 |= 0x8;
        }
        return n4;
    }
    
    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        this.dispatchViewReleased(this.clampMag(VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), this.clampMag(VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }
    
    private void reportNewEdgeDrags(final float n, final float n2, final int n3) {
        int n4 = 1;
        while (true) {
            Label_0106: {
                if (!this.checkNewEdgeDrag(n, n2, n3, n4)) {
                    break Label_0106;
                }
                if (this.checkNewEdgeDrag(n2, n, n3, 4)) {
                    n4 |= 0x4;
                }
                if (this.checkNewEdgeDrag(n, n2, n3, 2)) {
                    n4 |= 0x2;
                }
                if (this.checkNewEdgeDrag(n2, n, n3, 8)) {
                    n4 |= 0x8;
                }
                if (n4 == 0) {
                    return;
                }
                try {
                    final int[] mEdgeDragsInProgress = this.mEdgeDragsInProgress;
                    mEdgeDragsInProgress[n3] |= n4;
                    this.mCallback.onEdgeDragStarted(n4, n3);
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n4 = 0;
            continue;
        }
    }
    
    private void saveInitialMotion(final float n, final float n2, final int n3) {
        this.ensureMotionHistorySizeForId(n3);
        this.mInitialMotionX[n3] = (this.mLastMotionX[n3] = n);
        this.mInitialMotionY[n3] = (this.mLastMotionY[n3] = n2);
        this.mInitialEdgesTouched[n3] = this.getEdgesTouched((int)n, (int)n2);
        this.mPointersDown |= 1 << n3;
    }
    
    private void saveLastMotion(final MotionEvent motionEvent) {
        final boolean a = SlidingPaneLayout.a;
        final int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        int i = 0;
        while (i < pointerCount) {
            final int pointerId = MotionEventCompat.getPointerId(motionEvent, i);
            final float x = MotionEventCompat.getX(motionEvent, i);
            final float y = MotionEventCompat.getY(motionEvent, i);
            this.mLastMotionX[pointerId] = x;
            this.mLastMotionY[pointerId] = y;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    public void abort() {
        this.cancel();
        if (this.mDragState == 2) {
            final int currX = this.mScroller.getCurrX();
            final int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            final int currX2 = this.mScroller.getCurrX();
            final int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.setDragState(0);
    }
    
    public void cancel() {
        try {
            this.mActivePointerId = -1;
            this.clearMotionHistory();
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void captureChildView(final View mCapturedView, final int mActivePointerId) {
        try {
            if (mCapturedView.getParent() != this.mParentView) {
                throw new IllegalArgumentException(ViewDragHelper.z[1] + this.mParentView + ")");
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.mCapturedView = mCapturedView;
        this.mActivePointerId = mActivePointerId;
        this.mCallback.onViewCaptured(mCapturedView, mActivePointerId);
        this.setDragState(1);
    }
    
    public boolean checkTouchSlop(final int n) {
        final boolean a = SlidingPaneLayout.a;
        final int length = this.mInitialMotionX.length;
        int n2 = 0;
        do {
            boolean b = false;
            if (n2 >= length) {
                return b;
            }
            try {
                if (this.checkTouchSlop(n, n2)) {
                    b = true;
                    return b;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            ++n2;
        } while (!a);
        return false;
    }
    
    public boolean checkTouchSlop(final int n, final int n2) {
        while (true) {
            boolean b = true;
            try {
                if (!this.isPointerDown(n2)) {
                    b = false;
                    return b;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int n3 = 0;
            int n4 = 0;
            float n5 = 0.0f;
            float n6 = 0.0f;
            Label_0122: {
                if ((n & 0x1) != (b ? 1 : 0)) {
                    break Label_0122;
                }
                n3 = (b ? 1 : 0);
            Label_0043_Outer:
                while (true) {
                    Label_0128: {
                        if ((n & 0x2) != 0x2) {
                            break Label_0128;
                        }
                        n4 = (b ? 1 : 0);
                        while (true) {
                            n5 = this.mLastMotionX[n2] - this.mInitialMotionX[n2];
                            n6 = this.mLastMotionY[n2] - this.mInitialMotionY[n2];
                            if (n3 == 0 || n4 == 0) {
                                break Label_0122;
                            }
                            final float n7 = n5 * n5 + n6 * n6;
                            try {
                                if (n7 <= this.mTouchSlop * this.mTouchSlop) {
                                    return false;
                                }
                                return b;
                                n4 = 0;
                                continue;
                                n3 = 0;
                                continue Label_0043_Outer;
                            }
                            catch (IllegalArgumentException ex2) {
                                throw ex2;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            if (n3 != 0) {
                try {
                    if (Math.abs(n5) <= this.mTouchSlop) {
                        return false;
                    }
                    return b;
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
            if (n4 != 0) {
                try {
                    if (Math.abs(n6) <= this.mTouchSlop) {
                        return false;
                    }
                    return b;
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
                break;
            }
            break;
        }
        return false;
    }
    
    public boolean continueSettling(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //     4: iconst_2       
        //     5: if_icmpne       191
        //     8: aload_0        
        //     9: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    12: invokevirtual   android/support/v4/widget/ScrollerCompat.computeScrollOffset:()Z
        //    15: istore          4
        //    17: aload_0        
        //    18: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    21: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrX:()I
        //    24: istore          5
        //    26: aload_0        
        //    27: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //    30: invokevirtual   android/support/v4/widget/ScrollerCompat.getCurrY:()I
        //    33: istore          6
        //    35: iload           5
        //    37: aload_0        
        //    38: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //    41: invokevirtual   android/view/View.getLeft:()I
        //    44: isub           
        //    45: istore          7
        //    47: iload           6
        //    49: aload_0        
        //    50: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //    53: invokevirtual   android/view/View.getTop:()I
        //    56: isub           
        //    57: istore          8
        //    59: iload           7
        //    61: ifeq            73
        //    64: aload_0        
        //    65: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //    68: iload           7
        //    70: invokevirtual   android/view/View.offsetLeftAndRight:(I)V
        //    73: iload           8
        //    75: ifeq            87
        //    78: aload_0        
        //    79: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //    82: iload           8
        //    84: invokevirtual   android/view/View.offsetTopAndBottom:(I)V
        //    87: iload           7
        //    89: ifne            97
        //    92: iload           8
        //    94: ifeq            116
        //    97: aload_0        
        //    98: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   101: aload_0        
        //   102: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   105: iload           5
        //   107: iload           6
        //   109: iload           7
        //   111: iload           8
        //   113: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onViewPositionChanged:(Landroid/view/View;IIII)V
        //   116: iload           4
        //   118: ifeq            233
        //   121: iload           5
        //   123: aload_0        
        //   124: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   127: invokevirtual   android/support/v4/widget/ScrollerCompat.getFinalX:()I
        //   130: if_icmpne       233
        //   133: aload_0        
        //   134: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   137: invokevirtual   android/support/v4/widget/ScrollerCompat.getFinalY:()I
        //   140: istore          14
        //   142: iload           6
        //   144: iload           14
        //   146: if_icmpne       233
        //   149: aload_0        
        //   150: getfield        android/support/v4/widget/ViewDragHelper.mScroller:Landroid/support/v4/widget/ScrollerCompat;
        //   153: invokevirtual   android/support/v4/widget/ScrollerCompat.abortAnimation:()V
        //   156: iconst_0       
        //   157: istore          10
        //   159: iload           10
        //   161: ifne            191
        //   164: iload_1        
        //   165: ifeq            186
        //   168: aload_0        
        //   169: getfield        android/support/v4/widget/ViewDragHelper.mParentView:Landroid/view/ViewGroup;
        //   172: aload_0        
        //   173: getfield        android/support/v4/widget/ViewDragHelper.mSetIdleRunnable:Ljava/lang/Runnable;
        //   176: invokevirtual   android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
        //   179: pop            
        //   180: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   183: ifeq            191
        //   186: aload_0        
        //   187: iconst_0       
        //   188: invokevirtual   android/support/v4/widget/ViewDragHelper.setDragState:(I)V
        //   191: aload_0        
        //   192: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   195: istore_3       
        //   196: iload_3        
        //   197: iconst_2       
        //   198: if_icmpne       231
        //   201: iconst_1       
        //   202: ireturn        
        //   203: astore          16
        //   205: aload           16
        //   207: athrow         
        //   208: astore          15
        //   210: aload           15
        //   212: athrow         
        //   213: astore          9
        //   215: aload           9
        //   217: athrow         
        //   218: astore          13
        //   220: aload           13
        //   222: athrow         
        //   223: astore          11
        //   225: aload           11
        //   227: athrow         
        //   228: astore_2       
        //   229: aload_2        
        //   230: athrow         
        //   231: iconst_0       
        //   232: ireturn        
        //   233: iload           4
        //   235: istore          10
        //   237: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  64     73     203    208    Ljava/lang/IllegalArgumentException;
        //  78     87     208    213    Ljava/lang/IllegalArgumentException;
        //  97     116    213    218    Ljava/lang/IllegalArgumentException;
        //  121    142    218    223    Ljava/lang/IllegalArgumentException;
        //  168    186    223    228    Ljava/lang/IllegalArgumentException;
        //  186    191    223    228    Ljava/lang/IllegalArgumentException;
        //  191    196    228    231    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 118, Size: 118
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
    
    public View findTopChildUnder(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_3       
        //     4: iconst_m1      
        //     5: aload_0        
        //     6: getfield        android/support/v4/widget/ViewDragHelper.mParentView:Landroid/view/ViewGroup;
        //     9: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //    12: iadd           
        //    13: istore          4
        //    15: iload           4
        //    17: iflt            123
        //    20: aload_0        
        //    21: getfield        android/support/v4/widget/ViewDragHelper.mParentView:Landroid/view/ViewGroup;
        //    24: aload_0        
        //    25: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //    28: iload           4
        //    30: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.getOrderedChildIndex:(I)I
        //    33: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //    36: astore          5
        //    38: aload           5
        //    40: invokevirtual   android/view/View.getLeft:()I
        //    43: istore          10
        //    45: iload_1        
        //    46: iload           10
        //    48: if_icmplt       113
        //    51: aload           5
        //    53: invokevirtual   android/view/View.getRight:()I
        //    56: istore          12
        //    58: iload_1        
        //    59: iload           12
        //    61: if_icmpge       113
        //    64: aload           5
        //    66: invokevirtual   android/view/View.getTop:()I
        //    69: istore          13
        //    71: iload_2        
        //    72: iload           13
        //    74: if_icmplt       113
        //    77: aload           5
        //    79: invokevirtual   android/view/View.getBottom:()I
        //    82: istore          14
        //    84: iload_2        
        //    85: iload           14
        //    87: if_icmpge       113
        //    90: aload           5
        //    92: areturn        
        //    93: astore          6
        //    95: aload           6
        //    97: athrow         
        //    98: astore          7
        //   100: aload           7
        //   102: athrow         
        //   103: astore          8
        //   105: aload           8
        //   107: athrow         
        //   108: astore          9
        //   110: aload           9
        //   112: athrow         
        //   113: iload           4
        //   115: iconst_1       
        //   116: isub           
        //   117: istore          11
        //   119: iload_3        
        //   120: ifeq            125
        //   123: aconst_null    
        //   124: areturn        
        //   125: iload           11
        //   127: istore          4
        //   129: goto            15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  38     45     93     98     Ljava/lang/IllegalArgumentException;
        //  51     58     98     103    Ljava/lang/IllegalArgumentException;
        //  64     71     103    108    Ljava/lang/IllegalArgumentException;
        //  77     84     108    113    Ljava/lang/IllegalArgumentException;
        //  95     98     98     103    Ljava/lang/IllegalArgumentException;
        //  100    103    103    108    Ljava/lang/IllegalArgumentException;
        //  105    108    108    113    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
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
    
    public View getCapturedView() {
        return this.mCapturedView;
    }
    
    public int getEdgeSize() {
        return this.mEdgeSize;
    }
    
    public int getTouchSlop() {
        return this.mTouchSlop;
    }
    
    public int getViewDragState() {
        return this.mDragState;
    }
    
    public boolean isCapturedViewUnder(final int n, final int n2) {
        return this.isViewUnder(this.mCapturedView, n, n2);
    }
    
    public boolean isPointerDown(final int n) {
        try {
            if ((this.mPointersDown & 1 << n) != 0x0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isViewUnder(final View p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       6
        //     4: iconst_0       
        //     5: ireturn        
        //     6: aload_1        
        //     7: invokevirtual   android/view/View.getLeft:()I
        //    10: istore          8
        //    12: iload_2        
        //    13: iload           8
        //    15: if_icmplt       4
        //    18: aload_1        
        //    19: invokevirtual   android/view/View.getRight:()I
        //    22: istore          9
        //    24: iload_2        
        //    25: iload           9
        //    27: if_icmpge       4
        //    30: aload_1        
        //    31: invokevirtual   android/view/View.getTop:()I
        //    34: istore          10
        //    36: iload_3        
        //    37: iload           10
        //    39: if_icmplt       4
        //    42: aload_1        
        //    43: invokevirtual   android/view/View.getBottom:()I
        //    46: istore          11
        //    48: iload_3        
        //    49: iload           11
        //    51: if_icmpge       4
        //    54: iconst_1       
        //    55: ireturn        
        //    56: astore          4
        //    58: aload           4
        //    60: athrow         
        //    61: astore          5
        //    63: aload           5
        //    65: athrow         
        //    66: astore          6
        //    68: aload           6
        //    70: athrow         
        //    71: astore          7
        //    73: aload           7
        //    75: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      12     56     61     Ljava/lang/IllegalArgumentException;
        //  18     24     61     66     Ljava/lang/IllegalArgumentException;
        //  30     36     66     71     Ljava/lang/IllegalArgumentException;
        //  42     48     71     76     Ljava/lang/IllegalArgumentException;
        //  58     61     61     66     Ljava/lang/IllegalArgumentException;
        //  63     66     66     71     Ljava/lang/IllegalArgumentException;
        //  68     71     71     76     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
    
    public void processTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokestatic    android/support/v4/view/MotionEventCompat.getActionMasked:(Landroid/view/MotionEvent;)I
        //     8: istore_3       
        //     9: aload_1        
        //    10: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //    13: istore          4
        //    15: iload_3        
        //    16: ifne            23
        //    19: aload_0        
        //    20: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //    23: aload_0        
        //    24: getfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    27: ifnonnull       37
        //    30: aload_0        
        //    31: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //    34: putfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    37: aload_0        
        //    38: getfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    41: aload_1        
        //    42: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //    45: iload_3        
        //    46: tableswitch {
        //                0: 99
        //                1: 752
        //                2: 325
        //                3: 772
        //                4: 88
        //                5: 188
        //                6: 584
        //          default: 88
        //        }
        //    88: return         
        //    89: astore          66
        //    91: aload           66
        //    93: athrow         
        //    94: astore          5
        //    96: aload           5
        //    98: athrow         
        //    99: aload_1        
        //   100: invokevirtual   android/view/MotionEvent.getX:()F
        //   103: fstore          59
        //   105: aload_1        
        //   106: invokevirtual   android/view/MotionEvent.getY:()F
        //   109: fstore          60
        //   111: aload_1        
        //   112: iconst_0       
        //   113: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   116: istore          61
        //   118: aload_0        
        //   119: fload           59
        //   121: f2i            
        //   122: fload           60
        //   124: f2i            
        //   125: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   128: astore          62
        //   130: aload_0        
        //   131: fload           59
        //   133: fload           60
        //   135: iload           61
        //   137: invokespecial   android/support/v4/widget/ViewDragHelper.saveInitialMotion:(FFI)V
        //   140: aload_0        
        //   141: aload           62
        //   143: iload           61
        //   145: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   148: pop            
        //   149: aload_0        
        //   150: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   153: iload           61
        //   155: iaload         
        //   156: istore          64
        //   158: iload           64
        //   160: aload_0        
        //   161: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   164: iand           
        //   165: ifeq            88
        //   168: aload_0        
        //   169: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   172: iload           64
        //   174: aload_0        
        //   175: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   178: iand           
        //   179: iload           61
        //   181: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onEdgeTouched:(II)V
        //   184: iload_2        
        //   185: ifeq            88
        //   188: aload_1        
        //   189: iload           4
        //   191: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   194: istore          48
        //   196: aload_1        
        //   197: iload           4
        //   199: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   202: fstore          49
        //   204: aload_1        
        //   205: iload           4
        //   207: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   210: fstore          50
        //   212: aload_0        
        //   213: fload           49
        //   215: fload           50
        //   217: iload           48
        //   219: invokespecial   android/support/v4/widget/ViewDragHelper.saveInitialMotion:(FFI)V
        //   222: aload_0        
        //   223: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   226: ifne            285
        //   229: aload_0        
        //   230: aload_0        
        //   231: fload           49
        //   233: f2i            
        //   234: fload           50
        //   236: f2i            
        //   237: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   240: iload           48
        //   242: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   245: pop            
        //   246: aload_0        
        //   247: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   250: iload           48
        //   252: iaload         
        //   253: istore          57
        //   255: iload           57
        //   257: aload_0        
        //   258: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   261: iand           
        //   262: ifeq            281
        //   265: aload_0        
        //   266: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   269: iload           57
        //   271: aload_0        
        //   272: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   275: iand           
        //   276: iload           48
        //   278: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onEdgeTouched:(II)V
        //   281: iload_2        
        //   282: ifeq            88
        //   285: fload           49
        //   287: f2i            
        //   288: istore          51
        //   290: fload           50
        //   292: f2i            
        //   293: istore          52
        //   295: aload_0        
        //   296: iload           51
        //   298: iload           52
        //   300: invokevirtual   android/support/v4/widget/ViewDragHelper.isCapturedViewUnder:(II)Z
        //   303: istore          54
        //   305: iload           54
        //   307: ifeq            88
        //   310: aload_0        
        //   311: aload_0        
        //   312: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   315: iload           48
        //   317: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   320: pop            
        //   321: iload_2        
        //   322: ifeq            88
        //   325: aload_0        
        //   326: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   329: istore          27
        //   331: iload           27
        //   333: iconst_1       
        //   334: if_icmpne       430
        //   337: aload_1        
        //   338: aload_0        
        //   339: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   342: invokestatic    android/support/v4/view/MotionEventCompat.findPointerIndex:(Landroid/view/MotionEvent;I)I
        //   345: istore          43
        //   347: aload_1        
        //   348: iload           43
        //   350: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   353: fstore          44
        //   355: aload_1        
        //   356: iload           43
        //   358: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   361: fstore          45
        //   363: fload           44
        //   365: aload_0        
        //   366: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionX:[F
        //   369: aload_0        
        //   370: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   373: faload         
        //   374: fsub           
        //   375: f2i            
        //   376: istore          46
        //   378: fload           45
        //   380: aload_0        
        //   381: getfield        android/support/v4/widget/ViewDragHelper.mLastMotionY:[F
        //   384: aload_0        
        //   385: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   388: faload         
        //   389: fsub           
        //   390: f2i            
        //   391: istore          47
        //   393: aload_0        
        //   394: iload           46
        //   396: aload_0        
        //   397: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   400: invokevirtual   android/view/View.getLeft:()I
        //   403: iadd           
        //   404: iload           47
        //   406: aload_0        
        //   407: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   410: invokevirtual   android/view/View.getTop:()I
        //   413: iadd           
        //   414: iload           46
        //   416: iload           47
        //   418: invokespecial   android/support/v4/widget/ViewDragHelper.dragTo:(IIII)V
        //   421: aload_0        
        //   422: aload_1        
        //   423: invokespecial   android/support/v4/widget/ViewDragHelper.saveLastMotion:(Landroid/view/MotionEvent;)V
        //   426: iload_2        
        //   427: ifeq            88
        //   430: aload_1        
        //   431: invokestatic    android/support/v4/view/MotionEventCompat.getPointerCount:(Landroid/view/MotionEvent;)I
        //   434: istore          28
        //   436: iconst_0       
        //   437: istore          29
        //   439: iload           29
        //   441: iload           28
        //   443: if_icmpge       575
        //   446: aload_1        
        //   447: iload           29
        //   449: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   452: istore          30
        //   454: aload_1        
        //   455: iload           29
        //   457: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   460: fstore          31
        //   462: aload_1        
        //   463: iload           29
        //   465: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   468: fstore          32
        //   470: fload           31
        //   472: aload_0        
        //   473: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //   476: iload           30
        //   478: faload         
        //   479: fsub           
        //   480: fstore          33
        //   482: fload           32
        //   484: aload_0        
        //   485: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //   488: iload           30
        //   490: faload         
        //   491: fsub           
        //   492: fstore          34
        //   494: aload_0        
        //   495: fload           33
        //   497: fload           34
        //   499: iload           30
        //   501: invokespecial   android/support/v4/widget/ViewDragHelper.reportNewEdgeDrags:(FFI)V
        //   504: aload_0        
        //   505: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   508: istore          36
        //   510: iload           36
        //   512: iconst_1       
        //   513: if_icmpne       520
        //   516: iload_2        
        //   517: ifeq            575
        //   520: aload_0        
        //   521: fload           31
        //   523: f2i            
        //   524: fload           32
        //   526: f2i            
        //   527: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   530: astore          37
        //   532: aload_0        
        //   533: aload           37
        //   535: fload           33
        //   537: fload           34
        //   539: invokespecial   android/support/v4/widget/ViewDragHelper.checkTouchSlop:(Landroid/view/View;FF)Z
        //   542: istore          41
        //   544: iload           41
        //   546: ifeq            568
        //   549: aload_0        
        //   550: aload           37
        //   552: iload           30
        //   554: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   557: istore          42
        //   559: iload           42
        //   561: ifeq            568
        //   564: iload_2        
        //   565: ifeq            575
        //   568: iinc            29, 1
        //   571: iload_2        
        //   572: ifeq            439
        //   575: aload_0        
        //   576: aload_1        
        //   577: invokespecial   android/support/v4/widget/ViewDragHelper.saveLastMotion:(Landroid/view/MotionEvent;)V
        //   580: iload_2        
        //   581: ifeq            88
        //   584: aload_1        
        //   585: iload           4
        //   587: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   590: istore          9
        //   592: aload_0        
        //   593: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   596: iconst_1       
        //   597: if_icmpne       742
        //   600: aload_0        
        //   601: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   604: istore          12
        //   606: iload           9
        //   608: iload           12
        //   610: if_icmpne       742
        //   613: aload_1        
        //   614: invokestatic    android/support/v4/view/MotionEventCompat.getPointerCount:(Landroid/view/MotionEvent;)I
        //   617: istore          13
        //   619: iconst_0       
        //   620: istore          14
        //   622: iconst_m1      
        //   623: istore          15
        //   625: iload           14
        //   627: iload           13
        //   629: if_icmpge       732
        //   632: aload_1        
        //   633: iload           14
        //   635: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   638: istore          17
        //   640: aload_0        
        //   641: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   644: istore          19
        //   646: iload           17
        //   648: iload           19
        //   650: if_icmpne       657
        //   653: iload_2        
        //   654: ifeq            725
        //   657: aload_1        
        //   658: iload           14
        //   660: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   663: fstore          20
        //   665: aload_1        
        //   666: iload           14
        //   668: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   671: fstore          21
        //   673: fload           20
        //   675: f2i            
        //   676: istore          22
        //   678: fload           21
        //   680: f2i            
        //   681: istore          23
        //   683: aload_0        
        //   684: iload           22
        //   686: iload           23
        //   688: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   691: aload_0        
        //   692: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   695: if_acmpne       725
        //   698: aload_0        
        //   699: aload_0        
        //   700: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   703: iload           17
        //   705: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   708: istore          25
        //   710: iload           25
        //   712: ifeq            725
        //   715: aload_0        
        //   716: getfield        android/support/v4/widget/ViewDragHelper.mActivePointerId:I
        //   719: istore          15
        //   721: iload_2        
        //   722: ifeq            732
        //   725: iinc            14, 1
        //   728: iload_2        
        //   729: ifeq            625
        //   732: iload           15
        //   734: iconst_m1      
        //   735: if_icmpne       742
        //   738: aload_0        
        //   739: invokespecial   android/support/v4/widget/ViewDragHelper.releaseViewForPointerUp:()V
        //   742: aload_0        
        //   743: iload           9
        //   745: invokespecial   android/support/v4/widget/ViewDragHelper.clearMotionHistory:(I)V
        //   748: iload_2        
        //   749: ifeq            88
        //   752: aload_0        
        //   753: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   756: iconst_1       
        //   757: if_icmpne       764
        //   760: aload_0        
        //   761: invokespecial   android/support/v4/widget/ViewDragHelper.releaseViewForPointerUp:()V
        //   764: aload_0        
        //   765: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   768: iload_2        
        //   769: ifeq            88
        //   772: aload_0        
        //   773: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   776: iconst_1       
        //   777: if_icmpne       786
        //   780: aload_0        
        //   781: fconst_0       
        //   782: fconst_0       
        //   783: invokespecial   android/support/v4/widget/ViewDragHelper.dispatchViewReleased:(FF)V
        //   786: aload_0        
        //   787: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   790: return         
        //   791: astore          65
        //   793: aload           65
        //   795: athrow         
        //   796: astore          58
        //   798: aload           58
        //   800: athrow         
        //   801: astore          53
        //   803: aload           53
        //   805: athrow         
        //   806: astore          26
        //   808: aload           26
        //   810: athrow         
        //   811: astore          35
        //   813: aload           35
        //   815: athrow         
        //   816: astore          38
        //   818: aload           38
        //   820: athrow         
        //   821: astore          39
        //   823: aload           39
        //   825: athrow         
        //   826: astore          40
        //   828: aload           40
        //   830: athrow         
        //   831: astore          10
        //   833: aload           10
        //   835: athrow         
        //   836: astore          18
        //   838: aload           18
        //   840: athrow         
        //   841: astore          24
        //   843: aload           24
        //   845: athrow         
        //   846: astore          16
        //   848: aload           16
        //   850: athrow         
        //   851: astore          11
        //   853: aload           11
        //   855: athrow         
        //   856: astore          7
        //   858: aload           7
        //   860: athrow         
        //   861: astore          8
        //   863: aload           8
        //   865: athrow         
        //   866: astore          6
        //   868: aload           6
        //   870: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  19     23     89     94     Ljava/lang/IllegalArgumentException;
        //  23     37     94     99     Ljava/lang/IllegalArgumentException;
        //  158    184    791    796    Ljava/lang/IllegalArgumentException;
        //  255    281    796    801    Ljava/lang/IllegalArgumentException;
        //  295    305    801    806    Ljava/lang/IllegalArgumentException;
        //  310    321    806    811    Ljava/lang/IllegalArgumentException;
        //  325    331    806    811    Ljava/lang/IllegalArgumentException;
        //  494    510    811    816    Ljava/lang/IllegalArgumentException;
        //  532    544    816    821    Ljava/lang/IllegalArgumentException;
        //  549    559    821    831    Ljava/lang/IllegalArgumentException;
        //  592    606    831    836    Ljava/lang/IllegalArgumentException;
        //  640    646    836    841    Ljava/lang/IllegalArgumentException;
        //  683    710    841    846    Ljava/lang/IllegalArgumentException;
        //  738    742    846    851    Ljava/lang/IllegalArgumentException;
        //  742    748    851    856    Ljava/lang/IllegalArgumentException;
        //  752    764    856    861    Ljava/lang/IllegalArgumentException;
        //  764    768    861    866    Ljava/lang/IllegalArgumentException;
        //  772    786    866    871    Ljava/lang/IllegalArgumentException;
        //  803    806    806    811    Ljava/lang/IllegalArgumentException;
        //  818    821    821    831    Ljava/lang/IllegalArgumentException;
        //  823    826    826    831    Ljava/lang/IllegalArgumentException;
        //  853    856    856    861    Ljava/lang/IllegalArgumentException;
        //  863    866    866    871    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 436, Size: 436
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
    
    void setDragState(final int n) {
        try {
            this.mParentView.removeCallbacks(this.mSetIdleRunnable);
            if (this.mDragState == n) {
                return;
            }
            final ViewDragHelper viewDragHelper = this;
            final int n2 = n;
            viewDragHelper.mDragState = n2;
            final ViewDragHelper viewDragHelper2 = this;
            final ViewDragHelper$Callback viewDragHelper$Callback = viewDragHelper2.mCallback;
            final int n3 = n;
            viewDragHelper$Callback.onViewDragStateChanged(n3);
            final ViewDragHelper viewDragHelper3 = this;
            final int n4 = viewDragHelper3.mDragState;
            if (n4 == 0) {
                final ViewDragHelper viewDragHelper4 = this;
                final View view = null;
                viewDragHelper4.mCapturedView = view;
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final ViewDragHelper viewDragHelper = this;
            final int n2 = n;
            viewDragHelper.mDragState = n2;
            final ViewDragHelper viewDragHelper2 = this;
            final ViewDragHelper$Callback viewDragHelper$Callback = viewDragHelper2.mCallback;
            final int n3 = n;
            viewDragHelper$Callback.onViewDragStateChanged(n3);
            final ViewDragHelper viewDragHelper3 = this;
            final int n4 = viewDragHelper3.mDragState;
            if (n4 == 0) {
                final ViewDragHelper viewDragHelper4 = this;
                final View view = null;
                viewDragHelper4.mCapturedView = view;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public void setEdgeTrackingEnabled(final int mTrackingEdges) {
        this.mTrackingEdges = mTrackingEdges;
    }
    
    public void setMinVelocity(final float mMinVelocity) {
        this.mMinVelocity = mMinVelocity;
    }
    
    public boolean settleCapturedViewAt(final int n, final int n2) {
        try {
            if (!this.mReleaseInProgress) {
                throw new IllegalStateException(ViewDragHelper.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.forceSettleCapturedViewAt(n, n2, (int)VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int)VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId));
    }
    
    public boolean shouldInterceptTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokestatic    android/support/v4/view/MotionEventCompat.getActionMasked:(Landroid/view/MotionEvent;)I
        //     8: istore_3       
        //     9: aload_1        
        //    10: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //    13: istore          4
        //    15: iload_3        
        //    16: ifne            23
        //    19: aload_0        
        //    20: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //    23: aload_0        
        //    24: getfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    27: ifnonnull       37
        //    30: aload_0        
        //    31: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //    34: putfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    37: aload_0        
        //    38: getfield        android/support/v4/widget/ViewDragHelper.mVelocityTracker:Landroid/view/VelocityTracker;
        //    41: aload_1        
        //    42: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //    45: iload_3        
        //    46: tableswitch {
        //                0: 112
        //                1: 685
        //                2: 348
        //                3: 685
        //                4: 88
        //                5: 222
        //                6: 667
        //          default: 88
        //        }
        //    88: aload_0        
        //    89: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //    92: istore          8
        //    94: iload           8
        //    96: iconst_1       
        //    97: if_icmpne       778
        //   100: iconst_1       
        //   101: ireturn        
        //   102: astore          61
        //   104: aload           61
        //   106: athrow         
        //   107: astore          5
        //   109: aload           5
        //   111: athrow         
        //   112: aload_1        
        //   113: invokevirtual   android/view/MotionEvent.getX:()F
        //   116: fstore          51
        //   118: aload_1        
        //   119: invokevirtual   android/view/MotionEvent.getY:()F
        //   122: fstore          52
        //   124: aload_1        
        //   125: iconst_0       
        //   126: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   129: istore          53
        //   131: aload_0        
        //   132: fload           51
        //   134: fload           52
        //   136: iload           53
        //   138: invokespecial   android/support/v4/widget/ViewDragHelper.saveInitialMotion:(FFI)V
        //   141: aload_0        
        //   142: fload           51
        //   144: f2i            
        //   145: fload           52
        //   147: f2i            
        //   148: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   151: astore          54
        //   153: aload_0        
        //   154: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   157: astore          57
        //   159: aload           54
        //   161: aload           57
        //   163: if_acmpne       183
        //   166: aload_0        
        //   167: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   170: iconst_2       
        //   171: if_icmpne       183
        //   174: aload_0        
        //   175: aload           54
        //   177: iload           53
        //   179: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   182: pop            
        //   183: aload_0        
        //   184: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   187: iload           53
        //   189: iaload         
        //   190: istore          58
        //   192: iload           58
        //   194: aload_0        
        //   195: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   198: iand           
        //   199: ifeq            88
        //   202: aload_0        
        //   203: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   206: iload           58
        //   208: aload_0        
        //   209: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   212: iand           
        //   213: iload           53
        //   215: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onEdgeTouched:(II)V
        //   218: iload_2        
        //   219: ifeq            88
        //   222: aload_1        
        //   223: iload           4
        //   225: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   228: istore          41
        //   230: aload_1        
        //   231: iload           4
        //   233: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   236: fstore          42
        //   238: aload_1        
        //   239: iload           4
        //   241: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   244: fstore          43
        //   246: aload_0        
        //   247: fload           42
        //   249: fload           43
        //   251: iload           41
        //   253: invokespecial   android/support/v4/widget/ViewDragHelper.saveInitialMotion:(FFI)V
        //   256: aload_0        
        //   257: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   260: ifne            302
        //   263: aload_0        
        //   264: getfield        android/support/v4/widget/ViewDragHelper.mInitialEdgesTouched:[I
        //   267: iload           41
        //   269: iaload         
        //   270: istore          49
        //   272: iload           49
        //   274: aload_0        
        //   275: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   278: iand           
        //   279: ifeq            298
        //   282: aload_0        
        //   283: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   286: iload           49
        //   288: aload_0        
        //   289: getfield        android/support/v4/widget/ViewDragHelper.mTrackingEdges:I
        //   292: iand           
        //   293: iload           41
        //   295: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.onEdgeTouched:(II)V
        //   298: iload_2        
        //   299: ifeq            88
        //   302: aload_0        
        //   303: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   306: istore          45
        //   308: iload           45
        //   310: iconst_2       
        //   311: if_icmpne       88
        //   314: aload_0        
        //   315: fload           42
        //   317: f2i            
        //   318: fload           43
        //   320: f2i            
        //   321: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   324: astore          46
        //   326: aload           46
        //   328: aload_0        
        //   329: getfield        android/support/v4/widget/ViewDragHelper.mCapturedView:Landroid/view/View;
        //   332: if_acmpne       344
        //   335: aload_0        
        //   336: aload           46
        //   338: iload           41
        //   340: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   343: pop            
        //   344: iload_2        
        //   345: ifeq            88
        //   348: aload_0        
        //   349: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //   352: astore          12
        //   354: aload           12
        //   356: ifnull          88
        //   359: aload_0        
        //   360: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //   363: astore          13
        //   365: aload           13
        //   367: ifnull          88
        //   370: aload_1        
        //   371: invokestatic    android/support/v4/view/MotionEventCompat.getPointerCount:(Landroid/view/MotionEvent;)I
        //   374: istore          14
        //   376: iconst_0       
        //   377: istore          15
        //   379: iload           15
        //   381: iload           14
        //   383: if_icmpge       658
        //   386: aload_1        
        //   387: iload           15
        //   389: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   392: istore          16
        //   394: aload_1        
        //   395: iload           15
        //   397: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   400: fstore          17
        //   402: aload_1        
        //   403: iload           15
        //   405: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   408: fstore          18
        //   410: fload           17
        //   412: aload_0        
        //   413: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionX:[F
        //   416: iload           16
        //   418: faload         
        //   419: fsub           
        //   420: fstore          19
        //   422: fload           18
        //   424: aload_0        
        //   425: getfield        android/support/v4/widget/ViewDragHelper.mInitialMotionY:[F
        //   428: iload           16
        //   430: faload         
        //   431: fsub           
        //   432: fstore          20
        //   434: aload_0        
        //   435: fload           17
        //   437: f2i            
        //   438: fload           18
        //   440: f2i            
        //   441: invokevirtual   android/support/v4/widget/ViewDragHelper.findTopChildUnder:(II)Landroid/view/View;
        //   444: astore          21
        //   446: aload           21
        //   448: ifnull          742
        //   451: aload_0        
        //   452: aload           21
        //   454: fload           19
        //   456: fload           20
        //   458: invokespecial   android/support/v4/widget/ViewDragHelper.checkTouchSlop:(Landroid/view/View;FF)Z
        //   461: istore          40
        //   463: iload           40
        //   465: ifeq            742
        //   468: iconst_1       
        //   469: istore          22
        //   471: iload           22
        //   473: ifeq            598
        //   476: aload           21
        //   478: invokevirtual   android/view/View.getLeft:()I
        //   481: istore          31
        //   483: iload           31
        //   485: fload           19
        //   487: f2i            
        //   488: iadd           
        //   489: istore          32
        //   491: aload_0        
        //   492: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   495: aload           21
        //   497: iload           32
        //   499: fload           19
        //   501: f2i            
        //   502: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.clampViewPositionHorizontal:(Landroid/view/View;II)I
        //   505: istore          33
        //   507: aload           21
        //   509: invokevirtual   android/view/View.getTop:()I
        //   512: istore          34
        //   514: iload           34
        //   516: fload           20
        //   518: f2i            
        //   519: iadd           
        //   520: istore          35
        //   522: aload_0        
        //   523: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   526: aload           21
        //   528: iload           35
        //   530: fload           20
        //   532: f2i            
        //   533: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.clampViewPositionVertical:(Landroid/view/View;II)I
        //   536: istore          36
        //   538: aload_0        
        //   539: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   542: aload           21
        //   544: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.getViewHorizontalDragRange:(Landroid/view/View;)I
        //   547: istore          37
        //   549: aload_0        
        //   550: getfield        android/support/v4/widget/ViewDragHelper.mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
        //   553: aload           21
        //   555: invokevirtual   android/support/v4/widget/ViewDragHelper$Callback.getViewVerticalDragRange:(Landroid/view/View;)I
        //   558: istore          38
        //   560: iload           37
        //   562: ifeq            577
        //   565: iload           37
        //   567: ifle            598
        //   570: iload           33
        //   572: iload           31
        //   574: if_icmpne       598
        //   577: iload           38
        //   579: ifeq            658
        //   582: iload           38
        //   584: ifle            598
        //   587: iload           36
        //   589: iload           34
        //   591: if_icmpne       598
        //   594: iload_2        
        //   595: ifeq            658
        //   598: aload_0        
        //   599: fload           19
        //   601: fload           20
        //   603: iload           16
        //   605: invokespecial   android/support/v4/widget/ViewDragHelper.reportNewEdgeDrags:(FFI)V
        //   608: aload_0        
        //   609: getfield        android/support/v4/widget/ViewDragHelper.mDragState:I
        //   612: istore          28
        //   614: iload           28
        //   616: iconst_1       
        //   617: if_icmpne       624
        //   620: iload_2        
        //   621: ifeq            658
        //   624: iload           22
        //   626: ifeq            648
        //   629: aload_0        
        //   630: aload           21
        //   632: iload           16
        //   634: invokevirtual   android/support/v4/widget/ViewDragHelper.tryCaptureViewForDrag:(Landroid/view/View;I)Z
        //   637: istore          30
        //   639: iload           30
        //   641: ifeq            648
        //   644: iload_2        
        //   645: ifeq            658
        //   648: iload           15
        //   650: iconst_1       
        //   651: iadd           
        //   652: istore          29
        //   654: iload_2        
        //   655: ifeq            780
        //   658: aload_0        
        //   659: aload_1        
        //   660: invokespecial   android/support/v4/widget/ViewDragHelper.saveLastMotion:(Landroid/view/MotionEvent;)V
        //   663: iload_2        
        //   664: ifeq            88
        //   667: aload_1        
        //   668: iload           4
        //   670: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   673: istore          9
        //   675: aload_0        
        //   676: iload           9
        //   678: invokespecial   android/support/v4/widget/ViewDragHelper.clearMotionHistory:(I)V
        //   681: iload_2        
        //   682: ifeq            88
        //   685: aload_0        
        //   686: invokevirtual   android/support/v4/widget/ViewDragHelper.cancel:()V
        //   689: goto            88
        //   692: astore          6
        //   694: aload           6
        //   696: athrow         
        //   697: astore          55
        //   699: aload           55
        //   701: athrow         
        //   702: astore          56
        //   704: aload           56
        //   706: athrow         
        //   707: astore          59
        //   709: aload           59
        //   711: athrow         
        //   712: astore          50
        //   714: aload           50
        //   716: athrow         
        //   717: astore          44
        //   719: aload           44
        //   721: athrow         
        //   722: astore          47
        //   724: aload           47
        //   726: athrow         
        //   727: astore          10
        //   729: aload           10
        //   731: athrow         
        //   732: astore          11
        //   734: aload           11
        //   736: athrow         
        //   737: astore          39
        //   739: aload           39
        //   741: athrow         
        //   742: iconst_0       
        //   743: istore          22
        //   745: goto            471
        //   748: astore          23
        //   750: aload           23
        //   752: athrow         
        //   753: astore          24
        //   755: aload           24
        //   757: athrow         
        //   758: astore          25
        //   760: aload           25
        //   762: athrow         
        //   763: astore          26
        //   765: aload           26
        //   767: athrow         
        //   768: astore          27
        //   770: aload           27
        //   772: athrow         
        //   773: astore          7
        //   775: aload           7
        //   777: athrow         
        //   778: iconst_0       
        //   779: ireturn        
        //   780: iload           29
        //   782: istore          15
        //   784: goto            379
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  19     23     102    107    Ljava/lang/IllegalArgumentException;
        //  23     37     107    112    Ljava/lang/IllegalArgumentException;
        //  88     94     773    778    Ljava/lang/IllegalArgumentException;
        //  153    159    697    702    Ljava/lang/IllegalArgumentException;
        //  166    183    702    707    Ljava/lang/IllegalArgumentException;
        //  192    218    707    712    Ljava/lang/IllegalArgumentException;
        //  272    298    712    717    Ljava/lang/IllegalArgumentException;
        //  302    308    717    722    Ljava/lang/IllegalArgumentException;
        //  326    344    722    727    Ljava/lang/IllegalArgumentException;
        //  348    354    727    732    Ljava/lang/IllegalArgumentException;
        //  359    365    732    737    Ljava/lang/IllegalArgumentException;
        //  451    463    737    742    Ljava/lang/IllegalArgumentException;
        //  598    614    748    763    Ljava/lang/IllegalArgumentException;
        //  629    639    763    773    Ljava/lang/IllegalArgumentException;
        //  675    681    692    697    Ljava/lang/IllegalArgumentException;
        //  685    689    692    697    Ljava/lang/IllegalArgumentException;
        //  699    702    702    707    Ljava/lang/IllegalArgumentException;
        //  729    732    732    737    Ljava/lang/IllegalArgumentException;
        //  750    753    753    763    Ljava/lang/IllegalArgumentException;
        //  755    758    758    763    Ljava/lang/IllegalArgumentException;
        //  760    763    763    773    Ljava/lang/IllegalArgumentException;
        //  765    768    768    773    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 385, Size: 385
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
    
    public boolean smoothSlideViewTo(final View mCapturedView, final int n, final int n2) {
        this.mCapturedView = mCapturedView;
        this.mActivePointerId = -1;
        final boolean forceSettleCapturedView = this.forceSettleCapturedViewAt(n, n2, 0, 0);
        if (!forceSettleCapturedView) {
            try {
                if (this.mDragState != 0) {
                    return forceSettleCapturedView;
                }
                final ViewDragHelper viewDragHelper = this;
                final View view = viewDragHelper.mCapturedView;
                if (view != null) {
                    final ViewDragHelper viewDragHelper2 = this;
                    final View view2 = null;
                    viewDragHelper2.mCapturedView = view2;
                    return forceSettleCapturedView;
                }
                return forceSettleCapturedView;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final ViewDragHelper viewDragHelper = this;
                final View view = viewDragHelper.mCapturedView;
                if (view != null) {
                    final ViewDragHelper viewDragHelper2 = this;
                    final View view2 = null;
                    viewDragHelper2.mCapturedView = view2;
                    return forceSettleCapturedView;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return forceSettleCapturedView;
    }
    
    boolean tryCaptureViewForDrag(final View view, final int mActivePointerId) {
        Label_0030: {
            try {
                if (view != this.mCapturedView) {
                    break Label_0030;
                }
                final ViewDragHelper viewDragHelper = this;
                final int n = viewDragHelper.mActivePointerId;
                final int n2 = mActivePointerId;
                if (n == n2) {
                    return true;
                }
                break Label_0030;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final ViewDragHelper viewDragHelper = this;
                final int n = viewDragHelper.mActivePointerId;
                final int n2 = mActivePointerId;
                if (n == n2) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        if (view != null) {
            try {
                if (this.mCallback.tryCaptureView(view, mActivePointerId)) {
                    this.captureChildView(view, this.mActivePointerId = mActivePointerId);
                    return true;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return false;
    }
}
