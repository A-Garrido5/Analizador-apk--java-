// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.GestureDetector$OnGestureListener;
import android.os.Handler;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.MotionEvent;

class GestureDetectorCompat$GestureDetectorCompatImplBase implements GestureDetectorCompat$GestureDetectorCompatImpl
{
    private static final int DOUBLE_TAP_TIMEOUT;
    private static final int LONGPRESS_TIMEOUT;
    private static final int TAP_TIMEOUT;
    private static final String[] z;
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private GestureDetector$OnDoubleTapListener mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final Handler mHandler;
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final GestureDetector$OnGestureListener mListener;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0003-wD\u007f86BD@%0DDb)1\u0010Ly?7\u0010Oc8cRD,\"6\\M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u000f,^Ui47\u0010Ly?7\u0010Oc8cRD,\"6\\M";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
        TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
        DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    }
    
    public GestureDetectorCompat$GestureDetectorCompatImplBase(final Context p0, final GestureDetector$OnGestureListener p1, final Handler p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_3        
        //     5: ifnull          27
        //     8: aload_0        
        //     9: new             Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_3        
        //    15: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.<init>:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;Landroid/os/Handler;)V
        //    18: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //    21: getstatic       android/support/v4/view/ViewPager.a:I
        //    24: ifeq            39
        //    27: aload_0        
        //    28: new             Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.<init>:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V
        //    36: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //    39: aload_0        
        //    40: aload_2        
        //    41: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //    44: aload_2        
        //    45: instanceof      Landroid/view/GestureDetector$OnDoubleTapListener;
        //    48: ifeq            59
        //    51: aload_0        
        //    52: aload_2        
        //    53: checkcast       Landroid/view/GestureDetector$OnDoubleTapListener;
        //    56: invokevirtual   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.setOnDoubleTapListener:(Landroid/view/GestureDetector$OnDoubleTapListener;)V
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.init:(Landroid/content/Context;)V
        //    64: return         
        //    65: astore          4
        //    67: aload           4
        //    69: athrow         
        //    70: astore          5
        //    72: aload           5
        //    74: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      27     65     70     Ljava/lang/IllegalArgumentException;
        //  27     39     65     70     Ljava/lang/IllegalArgumentException;
        //  39     59     70     75     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    static MotionEvent access$000(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase) {
        return gestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent;
    }
    
    static GestureDetector$OnGestureListener access$100(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase) {
        return gestureDetectorCompat$GestureDetectorCompatImplBase.mListener;
    }
    
    static void access$200(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase) {
        gestureDetectorCompat$GestureDetectorCompatImplBase.dispatchLongPress();
    }
    
    static GestureDetector$OnDoubleTapListener access$300(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase) {
        return gestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener;
    }
    
    static boolean access$400(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase) {
        return gestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown;
    }
    
    static boolean access$502(final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase, final boolean mDeferConfirmSingleTap) {
        return gestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap = mDeferConfirmSingleTap;
    }
    
    private void cancel() {
        try {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mIsDoubleTapping = false;
            this.mStillDown = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void cancelTaps() {
        try {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mIsDoubleTapping = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void dispatchLongPress() {
        this.mHandler.removeMessages(3);
        this.mDeferConfirmSingleTap = false;
        this.mInLongPress = true;
        this.mListener.onLongPress(this.mCurrentDownEvent);
    }
    
    private void init(final Context context) {
        if (context == null) {
            try {
                throw new IllegalArgumentException(GestureDetectorCompat$GestureDetectorCompatImplBase.z[1]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (this.mListener == null) {
                throw new IllegalArgumentException(GestureDetectorCompat$GestureDetectorCompatImplBase.z[0]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        this.mIsLongpressEnabled = true;
        final ViewConfiguration value = ViewConfiguration.get(context);
        final int scaledTouchSlop = value.getScaledTouchSlop();
        final int scaledDoubleTapSlop = value.getScaledDoubleTapSlop();
        this.mMinimumFlingVelocity = value.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = value.getScaledMaximumFlingVelocity();
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }
    
    private boolean isConsideredDoubleTap(final MotionEvent motionEvent, final MotionEvent motionEvent2, final MotionEvent motionEvent3) {
        while (true) {
            try {
                if (!this.mAlwaysInBiggerTapRegion) {
                    return false;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int n3;
            try {
                if (motionEvent3.getEventTime() - motionEvent2.getEventTime() > GestureDetectorCompat$GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT) {
                    return false;
                }
                final int n = (int)motionEvent.getX() - (int)motionEvent3.getX();
                final int n2 = (int)motionEvent.getY() - (int)motionEvent3.getY();
                n3 = n * n + n2 * n2;
                final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase = this;
                final int n4 = gestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapSlopSquare;
                final int n5 = n3;
                final int n6 = n4;
                if (n5 < n6) {
                    return true;
                }
                return false;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            try {
                final GestureDetectorCompat$GestureDetectorCompatImplBase gestureDetectorCompat$GestureDetectorCompatImplBase = this;
                final int n4 = gestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapSlopSquare;
                final int n5 = n3;
                final int n6 = n4;
                if (n5 < n6) {
                    return true;
                }
                return false;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   android/view/MotionEvent.getAction:()I
        //     8: istore_3       
        //     9: aload_0        
        //    10: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //    13: ifnonnull       23
        //    16: aload_0        
        //    17: invokestatic    android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
        //    20: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //    23: aload_0        
        //    24: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //    27: aload_1        
        //    28: invokevirtual   android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
        //    31: iload_3        
        //    32: sipush          255
        //    35: iand           
        //    36: bipush          6
        //    38: if_icmpne       197
        //    41: iconst_1       
        //    42: istore          6
        //    44: iload           6
        //    46: ifeq            208
        //    49: aload_1        
        //    50: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //    53: istore          76
        //    55: iload           76
        //    57: istore          7
        //    59: aload_1        
        //    60: invokestatic    android/support/v4/view/MotionEventCompat.getPointerCount:(Landroid/view/MotionEvent;)I
        //    63: istore          8
        //    65: fconst_0       
        //    66: fstore          9
        //    68: fconst_0       
        //    69: fstore          10
        //    71: iconst_0       
        //    72: istore          11
        //    74: iload           11
        //    76: iload           8
        //    78: if_icmpge       95
        //    81: iload           7
        //    83: iload           11
        //    85: if_icmpne       214
        //    88: iinc            11, 1
        //    91: iload_2        
        //    92: ifeq            74
        //    95: fload           9
        //    97: fstore          12
        //    99: fload           10
        //   101: fstore          13
        //   103: iload           6
        //   105: ifeq            239
        //   108: iload           8
        //   110: iconst_1       
        //   111: isub           
        //   112: istore          14
        //   114: fload           13
        //   116: iload           14
        //   118: i2f            
        //   119: fdiv           
        //   120: fstore          15
        //   122: fload           12
        //   124: iload           14
        //   126: i2f            
        //   127: fdiv           
        //   128: fstore          16
        //   130: iload_3        
        //   131: sipush          255
        //   134: iand           
        //   135: istore          17
        //   137: iconst_0       
        //   138: istore          18
        //   140: iload           17
        //   142: tableswitch {
        //                0: 387
        //                1: 936
        //                2: 685
        //                3: 1226
        //                4: 184
        //                5: 246
        //                6: 281
        //          default: 184
        //        }
        //   184: iload           18
        //   186: ireturn        
        //   187: astore          4
        //   189: aload           4
        //   191: athrow         
        //   192: astore          5
        //   194: aload           5
        //   196: athrow         
        //   197: iconst_0       
        //   198: istore          6
        //   200: goto            44
        //   203: astore          75
        //   205: aload           75
        //   207: athrow         
        //   208: iconst_m1      
        //   209: istore          7
        //   211: goto            59
        //   214: fload           10
        //   216: aload_1        
        //   217: iload           11
        //   219: invokestatic    android/support/v4/view/MotionEventCompat.getX:(Landroid/view/MotionEvent;I)F
        //   222: fadd           
        //   223: fstore          10
        //   225: fload           9
        //   227: aload_1        
        //   228: iload           11
        //   230: invokestatic    android/support/v4/view/MotionEventCompat.getY:(Landroid/view/MotionEvent;I)F
        //   233: fadd           
        //   234: fstore          9
        //   236: goto            88
        //   239: iload           8
        //   241: istore          14
        //   243: goto            114
        //   246: aload_0        
        //   247: fload           15
        //   249: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   252: aload_0        
        //   253: fload           15
        //   255: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusX:F
        //   258: aload_0        
        //   259: fload           16
        //   261: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   264: aload_0        
        //   265: fload           16
        //   267: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusY:F
        //   270: aload_0        
        //   271: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.cancelTaps:()V
        //   274: iconst_0       
        //   275: istore          18
        //   277: iload_2        
        //   278: ifeq            184
        //   281: aload_0        
        //   282: fload           15
        //   284: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   287: aload_0        
        //   288: fload           15
        //   290: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusX:F
        //   293: aload_0        
        //   294: fload           16
        //   296: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   299: aload_0        
        //   300: fload           16
        //   302: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusY:F
        //   305: aload_0        
        //   306: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //   309: sipush          1000
        //   312: aload_0        
        //   313: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mMaximumFlingVelocity:I
        //   316: i2f            
        //   317: invokevirtual   android/view/VelocityTracker.computeCurrentVelocity:(IF)V
        //   320: aload_1        
        //   321: invokestatic    android/support/v4/view/MotionEventCompat.getActionIndex:(Landroid/view/MotionEvent;)I
        //   324: istore          67
        //   326: aload_1        
        //   327: iload           67
        //   329: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //   332: istore          68
        //   334: aload_0        
        //   335: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //   338: iload           68
        //   340: invokestatic    android/support/v4/view/VelocityTrackerCompat.getXVelocity:(Landroid/view/VelocityTracker;I)F
        //   343: fstore          69
        //   345: aload_0        
        //   346: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //   349: iload           68
        //   351: invokestatic    android/support/v4/view/VelocityTrackerCompat.getYVelocity:(Landroid/view/VelocityTracker;I)F
        //   354: fstore          70
        //   356: iconst_0       
        //   357: istore          71
        //   359: iload           71
        //   361: iload           8
        //   363: if_icmpge       380
        //   366: iload           71
        //   368: iload           67
        //   370: if_icmpne       1243
        //   373: iinc            71, 1
        //   376: iload_2        
        //   377: ifeq            359
        //   380: iconst_0       
        //   381: istore          18
        //   383: iload_2        
        //   384: ifeq            184
        //   387: aload_0        
        //   388: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //   391: astore          51
        //   393: iconst_0       
        //   394: istore          52
        //   396: aload           51
        //   398: ifnull          533
        //   401: aload_0        
        //   402: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   405: iconst_3       
        //   406: invokevirtual   android/os/Handler.hasMessages:(I)Z
        //   409: istore          57
        //   411: iload           57
        //   413: ifeq            424
        //   416: aload_0        
        //   417: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   420: iconst_3       
        //   421: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   424: aload_0        
        //   425: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   428: astore          61
        //   430: iconst_0       
        //   431: istore          52
        //   433: aload           61
        //   435: ifnull          520
        //   438: aload_0        
        //   439: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mPreviousUpEvent:Landroid/view/MotionEvent;
        //   442: astore          64
        //   444: iconst_0       
        //   445: istore          52
        //   447: aload           64
        //   449: ifnull          520
        //   452: iconst_0       
        //   453: istore          52
        //   455: iload           57
        //   457: ifeq            520
        //   460: aload_0        
        //   461: aload_0        
        //   462: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   465: aload_0        
        //   466: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mPreviousUpEvent:Landroid/view/MotionEvent;
        //   469: aload_1        
        //   470: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.isConsideredDoubleTap:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
        //   473: istore          65
        //   475: iconst_0       
        //   476: istore          52
        //   478: iload           65
        //   480: ifeq            520
        //   483: aload_0        
        //   484: iconst_1       
        //   485: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mIsDoubleTapping:Z
        //   488: iconst_0       
        //   489: aload_0        
        //   490: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //   493: aload_0        
        //   494: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   497: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onDoubleTap:(Landroid/view/MotionEvent;)Z
        //   502: ior            
        //   503: aload_0        
        //   504: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //   507: aload_1        
        //   508: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
        //   513: ior            
        //   514: istore          52
        //   516: iload_2        
        //   517: ifeq            533
        //   520: aload_0        
        //   521: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   524: iconst_3       
        //   525: getstatic       android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT:I
        //   528: i2l            
        //   529: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   532: pop            
        //   533: aload_0        
        //   534: fload           15
        //   536: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   539: aload_0        
        //   540: fload           15
        //   542: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusX:F
        //   545: aload_0        
        //   546: fload           16
        //   548: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   551: aload_0        
        //   552: fload           16
        //   554: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusY:F
        //   557: aload_0        
        //   558: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   561: ifnull          571
        //   564: aload_0        
        //   565: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   568: invokevirtual   android/view/MotionEvent.recycle:()V
        //   571: aload_0        
        //   572: aload_1        
        //   573: invokestatic    android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
        //   576: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   579: aload_0        
        //   580: iconst_1       
        //   581: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInTapRegion:Z
        //   584: aload_0        
        //   585: iconst_1       
        //   586: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInBiggerTapRegion:Z
        //   589: aload_0        
        //   590: iconst_1       
        //   591: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown:Z
        //   594: aload_0        
        //   595: iconst_0       
        //   596: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mInLongPress:Z
        //   599: aload_0        
        //   600: iconst_0       
        //   601: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap:Z
        //   604: aload_0        
        //   605: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mIsLongpressEnabled:Z
        //   608: ifeq            645
        //   611: aload_0        
        //   612: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   615: iconst_2       
        //   616: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   619: aload_0        
        //   620: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   623: iconst_2       
        //   624: aload_0        
        //   625: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   628: invokevirtual   android/view/MotionEvent.getDownTime:()J
        //   631: getstatic       android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.TAP_TIMEOUT:I
        //   634: i2l            
        //   635: ladd           
        //   636: getstatic       android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.LONGPRESS_TIMEOUT:I
        //   639: i2l            
        //   640: ladd           
        //   641: invokevirtual   android/os/Handler.sendEmptyMessageAtTime:(IJ)Z
        //   644: pop            
        //   645: aload_0        
        //   646: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   649: iconst_1       
        //   650: aload_0        
        //   651: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   654: invokevirtual   android/view/MotionEvent.getDownTime:()J
        //   657: getstatic       android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.TAP_TIMEOUT:I
        //   660: i2l            
        //   661: ladd           
        //   662: invokevirtual   android/os/Handler.sendEmptyMessageAtTime:(IJ)Z
        //   665: pop            
        //   666: iload           52
        //   668: aload_0        
        //   669: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //   672: aload_1        
        //   673: invokeinterface android/view/GestureDetector$OnGestureListener.onDown:(Landroid/view/MotionEvent;)Z
        //   678: ior            
        //   679: istore          18
        //   681: iload_2        
        //   682: ifeq            184
        //   685: aload_0        
        //   686: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mInLongPress:Z
        //   689: istore          39
        //   691: iload           39
        //   693: ifeq            700
        //   696: iload_2        
        //   697: ifeq            184
        //   700: aload_0        
        //   701: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   704: fload           15
        //   706: fsub           
        //   707: fstore          40
        //   709: aload_0        
        //   710: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   713: fload           16
        //   715: fsub           
        //   716: fstore          41
        //   718: aload_0        
        //   719: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mIsDoubleTapping:Z
        //   722: ifeq            744
        //   725: iload           18
        //   727: aload_0        
        //   728: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //   731: aload_1        
        //   732: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
        //   737: ior            
        //   738: istore          18
        //   740: iload_2        
        //   741: ifeq            184
        //   744: aload_0        
        //   745: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInTapRegion:Z
        //   748: istore          43
        //   750: iload           43
        //   752: ifeq            876
        //   755: fload           15
        //   757: aload_0        
        //   758: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusX:F
        //   761: fsub           
        //   762: f2i            
        //   763: istore          46
        //   765: fload           16
        //   767: aload_0        
        //   768: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDownFocusY:F
        //   771: fsub           
        //   772: f2i            
        //   773: istore          47
        //   775: iload           46
        //   777: iload           46
        //   779: imul           
        //   780: iload           47
        //   782: iload           47
        //   784: imul           
        //   785: iadd           
        //   786: istore          48
        //   788: iload           48
        //   790: aload_0        
        //   791: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mTouchSlopSquare:I
        //   794: if_icmple       858
        //   797: aload_0        
        //   798: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //   801: aload_0        
        //   802: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   805: aload_1        
        //   806: fload           40
        //   808: fload           41
        //   810: invokeinterface android/view/GestureDetector$OnGestureListener.onScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
        //   815: istore          18
        //   817: aload_0        
        //   818: fload           15
        //   820: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   823: aload_0        
        //   824: fload           16
        //   826: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   829: aload_0        
        //   830: iconst_0       
        //   831: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInTapRegion:Z
        //   834: aload_0        
        //   835: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   838: iconst_3       
        //   839: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   842: aload_0        
        //   843: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   846: iconst_1       
        //   847: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   850: aload_0        
        //   851: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   854: iconst_2       
        //   855: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   858: iload           48
        //   860: aload_0        
        //   861: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mTouchSlopSquare:I
        //   864: if_icmple       872
        //   867: aload_0        
        //   868: iconst_0       
        //   869: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInBiggerTapRegion:Z
        //   872: iload_2        
        //   873: ifeq            184
        //   876: fload           40
        //   878: invokestatic    java/lang/Math.abs:(F)F
        //   881: fconst_1       
        //   882: fcmpl          
        //   883: ifge            900
        //   886: fload           41
        //   888: invokestatic    java/lang/Math.abs:(F)F
        //   891: fstore          45
        //   893: fload           45
        //   895: fconst_1       
        //   896: fcmpl          
        //   897: iflt            184
        //   900: aload_0        
        //   901: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //   904: aload_0        
        //   905: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //   908: aload_1        
        //   909: fload           40
        //   911: fload           41
        //   913: invokeinterface android/view/GestureDetector$OnGestureListener.onScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
        //   918: istore          18
        //   920: aload_0        
        //   921: fload           15
        //   923: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusX:F
        //   926: aload_0        
        //   927: fload           16
        //   929: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mLastFocusY:F
        //   932: iload_2        
        //   933: ifeq            184
        //   936: aload_0        
        //   937: iconst_0       
        //   938: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown:Z
        //   941: aload_1        
        //   942: invokestatic    android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
        //   945: astore          20
        //   947: aload_0        
        //   948: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mIsDoubleTapping:Z
        //   951: ifeq            973
        //   954: iload           18
        //   956: aload_0        
        //   957: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //   960: aload_1        
        //   961: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
        //   966: ior            
        //   967: istore          18
        //   969: iload_2        
        //   970: ifeq            1157
        //   973: aload_0        
        //   974: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mInLongPress:Z
        //   977: istore          23
        //   979: iload           23
        //   981: ifeq            1001
        //   984: aload_0        
        //   985: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //   988: iconst_3       
        //   989: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   992: aload_0        
        //   993: iconst_0       
        //   994: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mInLongPress:Z
        //   997: iload_2        
        //   998: ifeq            1157
        //  1001: aload_0        
        //  1002: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mAlwaysInTapRegion:Z
        //  1005: istore          24
        //  1007: iload           24
        //  1009: ifeq            1057
        //  1012: aload_0        
        //  1013: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //  1016: aload_1        
        //  1017: invokeinterface android/view/GestureDetector$OnGestureListener.onSingleTapUp:(Landroid/view/MotionEvent;)Z
        //  1022: istore          18
        //  1024: aload_0        
        //  1025: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap:Z
        //  1028: istore          36
        //  1030: iload           36
        //  1032: ifeq            1157
        //  1035: aload_0        
        //  1036: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //  1039: ifnull          1157
        //  1042: aload_0        
        //  1043: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;
        //  1046: aload_1        
        //  1047: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z
        //  1052: pop            
        //  1053: iload_2        
        //  1054: ifeq            1157
        //  1057: aload_0        
        //  1058: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1061: astore          25
        //  1063: aload_1        
        //  1064: iconst_0       
        //  1065: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //  1068: istore          26
        //  1070: aload           25
        //  1072: sipush          1000
        //  1075: aload_0        
        //  1076: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mMaximumFlingVelocity:I
        //  1079: i2f            
        //  1080: invokevirtual   android/view/VelocityTracker.computeCurrentVelocity:(IF)V
        //  1083: aload           25
        //  1085: iload           26
        //  1087: invokestatic    android/support/v4/view/VelocityTrackerCompat.getYVelocity:(Landroid/view/VelocityTracker;I)F
        //  1090: fstore          27
        //  1092: aload           25
        //  1094: iload           26
        //  1096: invokestatic    android/support/v4/view/VelocityTrackerCompat.getXVelocity:(Landroid/view/VelocityTracker;I)F
        //  1099: fstore          28
        //  1101: fload           27
        //  1103: invokestatic    java/lang/Math.abs:(F)F
        //  1106: aload_0        
        //  1107: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mMinimumFlingVelocity:I
        //  1110: i2f            
        //  1111: fcmpl          
        //  1112: ifgt            1137
        //  1115: fload           28
        //  1117: invokestatic    java/lang/Math.abs:(F)F
        //  1120: fstore          32
        //  1122: aload_0        
        //  1123: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mMinimumFlingVelocity:I
        //  1126: istore          33
        //  1128: fload           32
        //  1130: iload           33
        //  1132: i2f            
        //  1133: fcmpl          
        //  1134: ifle            1157
        //  1137: aload_0        
        //  1138: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mListener:Landroid/view/GestureDetector$OnGestureListener;
        //  1141: aload_0        
        //  1142: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent:Landroid/view/MotionEvent;
        //  1145: aload_1        
        //  1146: fload           28
        //  1148: fload           27
        //  1150: invokeinterface android/view/GestureDetector$OnGestureListener.onFling:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
        //  1155: istore          18
        //  1157: aload_0        
        //  1158: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mPreviousUpEvent:Landroid/view/MotionEvent;
        //  1161: ifnull          1171
        //  1164: aload_0        
        //  1165: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mPreviousUpEvent:Landroid/view/MotionEvent;
        //  1168: invokevirtual   android/view/MotionEvent.recycle:()V
        //  1171: aload_0        
        //  1172: aload           20
        //  1174: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mPreviousUpEvent:Landroid/view/MotionEvent;
        //  1177: aload_0        
        //  1178: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1181: ifnull          1196
        //  1184: aload_0        
        //  1185: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1188: invokevirtual   android/view/VelocityTracker.recycle:()V
        //  1191: aload_0        
        //  1192: aconst_null    
        //  1193: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1196: aload_0        
        //  1197: iconst_0       
        //  1198: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mIsDoubleTapping:Z
        //  1201: aload_0        
        //  1202: iconst_0       
        //  1203: putfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap:Z
        //  1206: aload_0        
        //  1207: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //  1210: iconst_1       
        //  1211: invokevirtual   android/os/Handler.removeMessages:(I)V
        //  1214: aload_0        
        //  1215: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mHandler:Landroid/os/Handler;
        //  1218: iconst_2       
        //  1219: invokevirtual   android/os/Handler.removeMessages:(I)V
        //  1222: iload_2        
        //  1223: ifeq            184
        //  1226: aload_0        
        //  1227: invokespecial   android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.cancel:()V
        //  1230: iload           18
        //  1232: ireturn        
        //  1233: astore          19
        //  1235: aload           19
        //  1237: athrow         
        //  1238: astore          74
        //  1240: aload           74
        //  1242: athrow         
        //  1243: aload_1        
        //  1244: iload           71
        //  1246: invokestatic    android/support/v4/view/MotionEventCompat.getPointerId:(Landroid/view/MotionEvent;I)I
        //  1249: istore          72
        //  1251: fload           69
        //  1253: aload_0        
        //  1254: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1257: iload           72
        //  1259: invokestatic    android/support/v4/view/VelocityTrackerCompat.getXVelocity:(Landroid/view/VelocityTracker;I)F
        //  1262: fmul           
        //  1263: fload           70
        //  1265: aload_0        
        //  1266: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1269: iload           72
        //  1271: invokestatic    android/support/v4/view/VelocityTrackerCompat.getYVelocity:(Landroid/view/VelocityTracker;I)F
        //  1274: fmul           
        //  1275: fadd           
        //  1276: fconst_0       
        //  1277: fcmpg          
        //  1278: ifge            373
        //  1281: aload_0        
        //  1282: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.mVelocityTracker:Landroid/view/VelocityTracker;
        //  1285: invokevirtual   android/view/VelocityTracker.clear:()V
        //  1288: iload_2        
        //  1289: ifeq            380
        //  1292: goto            373
        //  1295: astore          73
        //  1297: aload           73
        //  1299: athrow         
        //  1300: astore          50
        //  1302: aload           50
        //  1304: athrow         
        //  1305: astore          66
        //  1307: aload           66
        //  1309: athrow         
        //  1310: astore          58
        //  1312: aload           58
        //  1314: athrow         
        //  1315: astore          59
        //  1317: aload           59
        //  1319: athrow         
        //  1320: astore          60
        //  1322: aload           60
        //  1324: athrow         
        //  1325: astore          62
        //  1327: aload           62
        //  1329: athrow         
        //  1330: astore          53
        //  1332: aload           53
        //  1334: athrow         
        //  1335: astore          54
        //  1337: aload           54
        //  1339: athrow         
        //  1340: astore          38
        //  1342: aload           38
        //  1344: athrow         
        //  1345: astore          42
        //  1347: aload           42
        //  1349: athrow         
        //  1350: astore          49
        //  1352: aload           49
        //  1354: athrow         
        //  1355: astore          44
        //  1357: aload           44
        //  1359: athrow         
        //  1360: astore          21
        //  1362: aload           21
        //  1364: athrow         
        //  1365: astore          22
        //  1367: aload           22
        //  1369: athrow         
        //  1370: astore          34
        //  1372: aload           34
        //  1374: athrow         
        //  1375: astore          35
        //  1377: aload           35
        //  1379: athrow         
        //  1380: astore          29
        //  1382: aload           29
        //  1384: athrow         
        //  1385: astore          30
        //  1387: aload           30
        //  1389: athrow         
        //  1390: astore          31
        //  1392: aload           31
        //  1394: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      23     187    192    Ljava/lang/IllegalArgumentException;
        //  23     31     192    197    Ljava/lang/IllegalArgumentException;
        //  49     55     203    208    Ljava/lang/IllegalArgumentException;
        //  246    274    1238   1243   Ljava/lang/IllegalArgumentException;
        //  387    393    1300   1305   Ljava/lang/IllegalArgumentException;
        //  416    424    1305   1310   Ljava/lang/IllegalArgumentException;
        //  424    430    1310   1315   Ljava/lang/IllegalArgumentException;
        //  438    444    1315   1320   Ljava/lang/IllegalArgumentException;
        //  460    475    1320   1325   Ljava/lang/IllegalArgumentException;
        //  520    533    1325   1330   Ljava/lang/IllegalArgumentException;
        //  533    571    1330   1335   Ljava/lang/IllegalArgumentException;
        //  571    645    1335   1340   Ljava/lang/IllegalArgumentException;
        //  685    691    1340   1345   Ljava/lang/IllegalArgumentException;
        //  744    750    1345   1350   Ljava/lang/IllegalArgumentException;
        //  858    872    1350   1355   Ljava/lang/IllegalArgumentException;
        //  876    893    1355   1360   Ljava/lang/IllegalArgumentException;
        //  973    979    1360   1365   Ljava/lang/IllegalArgumentException;
        //  984    997    1365   1370   Ljava/lang/IllegalArgumentException;
        //  1001   1007   1365   1370   Ljava/lang/IllegalArgumentException;
        //  1024   1030   1370   1375   Ljava/lang/IllegalArgumentException;
        //  1035   1053   1375   1380   Ljava/lang/IllegalArgumentException;
        //  1101   1128   1380   1385   Ljava/lang/IllegalArgumentException;
        //  1157   1171   1385   1390   Ljava/lang/IllegalArgumentException;
        //  1171   1196   1390   1395   Ljava/lang/IllegalArgumentException;
        //  1196   1222   1233   1238   Ljava/lang/IllegalArgumentException;
        //  1226   1230   1233   1238   Ljava/lang/IllegalArgumentException;
        //  1281   1288   1295   1300   Ljava/lang/IllegalArgumentException;
        //  1312   1315   1315   1320   Ljava/lang/IllegalArgumentException;
        //  1317   1320   1320   1325   Ljava/lang/IllegalArgumentException;
        //  1362   1365   1365   1370   Ljava/lang/IllegalArgumentException;
        //  1372   1375   1375   1380   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 689, Size: 689
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
    
    public void setOnDoubleTapListener(final GestureDetector$OnDoubleTapListener mDoubleTapListener) {
        this.mDoubleTapListener = mDoubleTapListener;
    }
}
