// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.app.ActionBar$LayoutParams;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.ActionBarPolicy;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.support.v7.app.ActionBar$OnMenuVisibilityListener;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import java.util.ArrayList;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.app.Dialog;
import android.support.v7.view.ActionMode$Callback;
import android.support.v7.view.ActionMode;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.internal.widget.ActionBarContextView;
import android.content.Context;
import android.view.View;
import android.support.v7.internal.widget.ActionBarContainer;
import android.app.Activity;
import android.support.v7.internal.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback;
import android.support.v7.app.ActionBar;

public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout$ActionBarVisibilityCallback
{
    static final boolean $assertionsDisabled;
    private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
    private static final String[] z;
    WindowDecorActionBar$ActionModeImpl mActionMode;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private boolean mContentAnimations;
    private View mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    private ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    private DecorToolbar mDecorToolbar;
    ActionMode mDeferredDestroyActionMode;
    ActionMode$Callback mDeferredModeDestroyCallback;
    private Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    final ViewPropertyAnimatorListener mHideListener;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private boolean mShowHideAnimationEnabled;
    final ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    final ViewPropertyAnimatorUpdateListener mUpdateListener;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_0       
        //     2: iconst_4       
        //     3: anewarray       Ljava/lang/String;
        //     6: astore_1       
        //     7: ldc             "t\u0004'WF\u0017\b(\u001bW\u0017\u0004i\u0014WT\n;PFX\n%\u0012SEE&\u0005F\u0017\n/P"
        //     9: astore_2       
        //    10: iconst_m1      
        //    11: istore_3       
        //    12: aload_1        
        //    13: astore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: aload_2        
        //    19: invokevirtual   java/lang/String.toCharArray:()[C
        //    22: astore          6
        //    24: aload           6
        //    26: arraylength    
        //    27: istore          7
        //    29: iconst_0       
        //    30: istore          8
        //    32: iload           7
        //    34: iload           8
        //    36: if_icmpgt       191
        //    39: new             Ljava/lang/String;
        //    42: dup            
        //    43: aload           6
        //    45: invokespecial   java/lang/String.<init>:([C)V
        //    48: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //    51: astore          11
        //    53: iload_3        
        //    54: tableswitch {
        //                0: 101
        //                1: 122
        //                2: 143
        //          default: 80
        //        }
        //    80: aload           4
        //    82: iload           5
        //    84: aload           11
        //    86: aastore        
        //    87: ldc             "v\u0006=\u0019]YE+\u0011@\u0017\b<\u0003F\u0017\u0007,P[YE&\u0006WE\t(\t\u0012Z\n-\u0015\u0012\u001f2 \u001eVX\u0012g6wv1\u001c\"wh*\u001f5`{$\u0010/st1\u0000?|h'\b\"\u001b\u0017\u0011&PWY\u0004+\u001cW\u0017\r \u0014W\u0017\n'PQX\u000b=\u0015\\CE:\u0013@X\t%"
        //    89: astore_2       
        //    90: iload_0        
        //    91: istore          5
        //    93: aload_1        
        //    94: astore          4
        //    96: iconst_0       
        //    97: istore_3       
        //    98: goto            18
        //   101: aload           4
        //   103: iload           5
        //   105: aload           11
        //   107: aastore        
        //   108: ldc             "\u0017\u0006(\u001e\u0012X\u000b%\t\u0012U\u0000i\u0005AR\u0001i"
        //   110: astore_2       
        //   111: iconst_2       
        //   112: istore          5
        //   114: aload_1        
        //   115: astore          4
        //   117: iload_0        
        //   118: istore_3       
        //   119: goto            18
        //   122: aload           4
        //   124: iload           5
        //   126: aload           11
        //   128: aastore        
        //   129: iconst_3       
        //   130: istore          5
        //   132: aload_1        
        //   133: astore          4
        //   135: ldc             "@\f=\u0018\u0012VE*\u001f_G\u0004=\u0019P[\u0000i\u0007[Y\u0001&\u0007\u0012S\u0000*\u001f@\u0017\t(\t]B\u0011"
        //   137: astore_2       
        //   138: iconst_2       
        //   139: istore_3       
        //   140: goto            18
        //   143: aload           4
        //   145: iload           5
        //   147: aload           11
        //   149: aastore        
        //   150: aload_1        
        //   151: putstatic       android/support/v7/internal/app/WindowDecorActionBar.z:[Ljava/lang/String;
        //   154: ldc             Landroid/support/v7/internal/app/WindowDecorActionBar;.class
        //   156: invokevirtual   java/lang/Class.desiredAssertionStatus:()Z
        //   159: istore          13
        //   161: iload           13
        //   163: ifne            286
        //   166: iload_0        
        //   167: istore          14
        //   169: iload           14
        //   171: putstatic       android/support/v7/internal/app/WindowDecorActionBar.$assertionsDisabled:Z
        //   174: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   177: istore          16
        //   179: iload           16
        //   181: bipush          14
        //   183: if_icmplt       297
        //   186: iload_0        
        //   187: putstatic       android/support/v7/internal/app/WindowDecorActionBar.ALLOW_SHOW_HIDE_ANIMATIONS:Z
        //   190: return         
        //   191: aload           6
        //   193: iload           8
        //   195: caload         
        //   196: istore          9
        //   198: iload           8
        //   200: iconst_5       
        //   201: irem           
        //   202: tableswitch {
        //                0: 253
        //                1: 260
        //                2: 267
        //                3: 274
        //          default: 232
        //        }
        //   232: bipush          50
        //   234: istore          10
        //   236: aload           6
        //   238: iload           8
        //   240: iload           10
        //   242: iload           9
        //   244: ixor           
        //   245: i2c            
        //   246: castore        
        //   247: iinc            8, 1
        //   250: goto            32
        //   253: bipush          55
        //   255: istore          10
        //   257: goto            236
        //   260: bipush          101
        //   262: istore          10
        //   264: goto            236
        //   267: bipush          73
        //   269: istore          10
        //   271: goto            236
        //   274: bipush          112
        //   276: istore          10
        //   278: goto            236
        //   281: astore          12
        //   283: aload           12
        //   285: athrow         
        //   286: iconst_0       
        //   287: istore          14
        //   289: goto            169
        //   292: astore          15
        //   294: aload           15
        //   296: athrow         
        //   297: iconst_0       
        //   298: istore_0       
        //   299: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  154    161    281    286    Ljava/lang/IllegalStateException;
        //  169    179    292    297    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0169:
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
    
    public WindowDecorActionBar(final Activity p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   android/support/v7/app/ActionBar.<init>:()V
        //     8: aload_0        
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: putfield        android/support/v7/internal/app/WindowDecorActionBar.mTabs:Ljava/util/ArrayList;
        //    19: aload_0        
        //    20: iconst_m1      
        //    21: putfield        android/support/v7/internal/app/WindowDecorActionBar.mSavedTabPosition:I
        //    24: aload_0        
        //    25: new             Ljava/util/ArrayList;
        //    28: dup            
        //    29: invokespecial   java/util/ArrayList.<init>:()V
        //    32: putfield        android/support/v7/internal/app/WindowDecorActionBar.mMenuVisibilityListeners:Ljava/util/ArrayList;
        //    35: aload_0        
        //    36: iconst_0       
        //    37: putfield        android/support/v7/internal/app/WindowDecorActionBar.mCurWindowVisibility:I
        //    40: aload_0        
        //    41: iconst_1       
        //    42: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContentAnimations:Z
        //    45: aload_0        
        //    46: iconst_1       
        //    47: putfield        android/support/v7/internal/app/WindowDecorActionBar.mNowShowing:Z
        //    50: aload_0        
        //    51: new             Landroid/support/v7/internal/app/WindowDecorActionBar$1;
        //    54: dup            
        //    55: aload_0        
        //    56: invokespecial   android/support/v7/internal/app/WindowDecorActionBar$1.<init>:(Landroid/support/v7/internal/app/WindowDecorActionBar;)V
        //    59: putfield        android/support/v7/internal/app/WindowDecorActionBar.mHideListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //    62: aload_0        
        //    63: new             Landroid/support/v7/internal/app/WindowDecorActionBar$2;
        //    66: dup            
        //    67: aload_0        
        //    68: invokespecial   android/support/v7/internal/app/WindowDecorActionBar$2.<init>:(Landroid/support/v7/internal/app/WindowDecorActionBar;)V
        //    71: putfield        android/support/v7/internal/app/WindowDecorActionBar.mShowListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //    74: aload_0        
        //    75: new             Landroid/support/v7/internal/app/WindowDecorActionBar$3;
        //    78: dup            
        //    79: aload_0        
        //    80: invokespecial   android/support/v7/internal/app/WindowDecorActionBar$3.<init>:(Landroid/support/v7/internal/app/WindowDecorActionBar;)V
        //    83: putfield        android/support/v7/internal/app/WindowDecorActionBar.mUpdateListener:Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;
        //    86: aload_0        
        //    87: aload_1        
        //    88: putfield        android/support/v7/internal/app/WindowDecorActionBar.mActivity:Landroid/app/Activity;
        //    91: aload_1        
        //    92: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    95: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    98: astore          4
        //   100: aload_0        
        //   101: aload           4
        //   103: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.init:(Landroid/view/View;)V
        //   106: iload_2        
        //   107: ifne            121
        //   110: aload_0        
        //   111: aload           4
        //   113: ldc             16908290
        //   115: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   118: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   121: iload_3        
        //   122: ifeq            143
        //   125: getstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   128: istore          7
        //   130: iconst_0       
        //   131: istore          8
        //   133: iload           7
        //   135: ifeq            154
        //   138: iload           8
        //   140: putstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   143: return         
        //   144: astore          5
        //   146: aload           5
        //   148: athrow         
        //   149: astore          6
        //   151: aload           6
        //   153: athrow         
        //   154: iconst_1       
        //   155: istore          8
        //   157: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  100    106    144    149    Ljava/lang/IllegalStateException;
        //  110    121    144    149    Ljava/lang/IllegalStateException;
        //  125    130    149    154    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
    
    public WindowDecorActionBar(final Dialog mDialog) {
        final int b = ToolbarActionBar.b;
        this.mTabs = new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = new WindowDecorActionBar$1(this);
        this.mShowListener = new WindowDecorActionBar$2(this);
        this.mUpdateListener = new WindowDecorActionBar$3(this);
        this.mDialog = mDialog;
        this.init(mDialog.getWindow().getDecorView());
        if (AppCompatActivity.b) {
            ToolbarActionBar.b = b + 1;
        }
    }
    
    static boolean access$000(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContentAnimations;
    }
    
    static View access$100(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContentView;
    }
    
    static ActionBarContextView access$1000(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContextView;
    }
    
    static DecorToolbar access$1100(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mDecorToolbar;
    }
    
    static Context access$1200(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContext;
    }
    
    static ActionBarContainer access$200(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContainerView;
    }
    
    static ActionBarContainer access$300(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mSplitView;
    }
    
    static int access$400(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContextDisplayMode;
    }
    
    static ViewPropertyAnimatorCompatSet access$502(final WindowDecorActionBar windowDecorActionBar, final ViewPropertyAnimatorCompatSet mCurrentShowAnim) {
        return windowDecorActionBar.mCurrentShowAnim = mCurrentShowAnim;
    }
    
    static ActionBarOverlayLayout access$600(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mOverlayLayout;
    }
    
    static boolean access$700(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mHiddenByApp;
    }
    
    static boolean access$800(final WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mHiddenBySystem;
    }
    
    static boolean access$900(final boolean b, final boolean b2, final boolean b3) {
        return checkShowingFlags(b, b2, b3);
    }
    
    private static boolean checkShowingFlags(final boolean b, final boolean b2, final boolean b3) {
        return b3 || (!b && !b2);
    }
    
    private DecorToolbar getDecorToolbar(final View view) {
        try {
            if (view instanceof DecorToolbar) {
                return (DecorToolbar)view;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (view instanceof Toolbar) {
                return ((Toolbar)view).getWrapper();
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        throw new IllegalStateException(WindowDecorActionBar.z[0] + view.getClass().getSimpleName());
    }
    
    private void hideForActionMode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowingForMode:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            34
        //     9: aload_0        
        //    10: iconst_0       
        //    11: putfield        android/support/v7/internal/app/WindowDecorActionBar.mShowingForMode:Z
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    18: ifnull          29
        //    21: aload_0        
        //    22: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    25: iconst_0       
        //    26: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setShowingForActionMode:(Z)V
        //    29: aload_0        
        //    30: iconst_0       
        //    31: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.updateVisibility:(Z)V
        //    34: return         
        //    35: astore_1       
        //    36: aload_1        
        //    37: athrow         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      35     38     Ljava/lang/IllegalStateException;
        //  9      29     38     41     Ljava/lang/IllegalStateException;
        //  36     38     38     41     Ljava/lang/IllegalStateException;
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
    
    private void init(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: aload_1        
        //     4: getstatic       android/support/v7/appcompat/R$id.decor_content_parent:I
        //     7: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    10: checkcast       Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    13: putfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    16: aload_0        
        //    17: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    20: ifnull          31
        //    23: aload_0        
        //    24: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setActionBarVisibilityCallback:(Landroid/support/v7/internal/widget/ActionBarOverlayLayout$ActionBarVisibilityCallback;)V
        //    31: aload_0        
        //    32: aload_0        
        //    33: aload_1        
        //    34: getstatic       android/support/v7/appcompat/R$id.action_bar:I
        //    37: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    40: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.getDecorToolbar:(Landroid/view/View;)Landroid/support/v7/internal/widget/DecorToolbar;
        //    43: putfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    46: aload_0        
        //    47: aload_1        
        //    48: getstatic       android/support/v7/appcompat/R$id.action_context_bar:I
        //    51: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    54: checkcast       Landroid/support/v7/internal/widget/ActionBarContextView;
        //    57: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    60: aload_0        
        //    61: aload_1        
        //    62: getstatic       android/support/v7/appcompat/R$id.action_bar_container:I
        //    65: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    68: checkcast       Landroid/support/v7/internal/widget/ActionBarContainer;
        //    71: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    74: aload_0        
        //    75: aload_1        
        //    76: getstatic       android/support/v7/appcompat/R$id.split_action_bar:I
        //    79: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    82: checkcast       Landroid/support/v7/internal/widget/ActionBarContainer;
        //    85: putfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    88: aload_0        
        //    89: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    92: astore          7
        //    94: aload           7
        //    96: ifnull          117
        //    99: aload_0        
        //   100: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   103: astore          8
        //   105: aload           8
        //   107: ifnull          117
        //   110: aload_0        
        //   111: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   114: ifnonnull       179
        //   117: new             Ljava/lang/IllegalStateException;
        //   120: dup            
        //   121: new             Ljava/lang/StringBuilder;
        //   124: dup            
        //   125: invokespecial   java/lang/StringBuilder.<init>:()V
        //   128: aload_0        
        //   129: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   132: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: getstatic       android/support/v7/internal/app/WindowDecorActionBar.z:[Ljava/lang/String;
        //   141: iconst_2       
        //   142: aaload         
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: getstatic       android/support/v7/internal/app/WindowDecorActionBar.z:[Ljava/lang/String;
        //   149: iconst_3       
        //   150: aaload         
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   160: athrow         
        //   161: astore          6
        //   163: aload           6
        //   165: athrow         
        //   166: astore_3       
        //   167: aload_3        
        //   168: athrow         
        //   169: astore          4
        //   171: aload           4
        //   173: athrow         
        //   174: astore          5
        //   176: aload           5
        //   178: athrow         
        //   179: aload_0        
        //   180: aload_0        
        //   181: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //   184: invokeinterface android/support/v7/internal/widget/DecorToolbar.getContext:()Landroid/content/Context;
        //   189: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContext:Landroid/content/Context;
        //   192: aload_0        
        //   193: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //   196: invokeinterface android/support/v7/internal/widget/DecorToolbar.isSplit:()Z
        //   201: istore          10
        //   203: iload           10
        //   205: ifeq            356
        //   208: iload_2        
        //   209: istore          11
        //   211: aload_0        
        //   212: iload           11
        //   214: putfield        android/support/v7/internal/app/WindowDecorActionBar.mContextDisplayMode:I
        //   217: iconst_4       
        //   218: aload_0        
        //   219: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //   222: invokeinterface android/support/v7/internal/widget/DecorToolbar.getDisplayOptions:()I
        //   227: iand           
        //   228: ifeq            362
        //   231: iload_2        
        //   232: istore          12
        //   234: iload           12
        //   236: ifeq            244
        //   239: aload_0        
        //   240: iconst_1       
        //   241: putfield        android/support/v7/internal/app/WindowDecorActionBar.mDisplayHomeAsUpSet:Z
        //   244: aload_0        
        //   245: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContext:Landroid/content/Context;
        //   248: invokestatic    android/support/v7/internal/view/ActionBarPolicy.get:(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
        //   251: astore          13
        //   253: aload           13
        //   255: invokevirtual   android/support/v7/internal/view/ActionBarPolicy.enableHomeButtonByDefault:()Z
        //   258: istore          16
        //   260: iload           16
        //   262: ifne            270
        //   265: iload           12
        //   267: ifeq            383
        //   270: aload_0        
        //   271: iload_2        
        //   272: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.setHomeButtonEnabled:(Z)V
        //   275: aload_0        
        //   276: aload           13
        //   278: invokevirtual   android/support/v7/internal/view/ActionBarPolicy.hasEmbeddedTabs:()Z
        //   281: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.setHasEmbeddedTabs:(Z)V
        //   284: aload_0        
        //   285: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContext:Landroid/content/Context;
        //   288: aconst_null    
        //   289: getstatic       android/support/v7/appcompat/R$styleable.ActionBar:[I
        //   292: getstatic       android/support/v7/appcompat/R$attr.actionBarStyle:I
        //   295: iconst_0       
        //   296: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
        //   299: astore          17
        //   301: aload           17
        //   303: getstatic       android/support/v7/appcompat/R$styleable.ActionBar_hideOnContentScroll:I
        //   306: iconst_0       
        //   307: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   310: ifeq            318
        //   313: aload_0        
        //   314: iconst_1       
        //   315: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.setHideOnContentScrollEnabled:(Z)V
        //   318: aload           17
        //   320: getstatic       android/support/v7/appcompat/R$styleable.ActionBar_elevation:I
        //   323: iconst_0       
        //   324: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //   327: istore          19
        //   329: iload           19
        //   331: ifeq            345
        //   334: iload           19
        //   336: i2f            
        //   337: fstore          20
        //   339: aload_0        
        //   340: fload           20
        //   342: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.setElevation:(F)V
        //   345: aload           17
        //   347: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   350: return         
        //   351: astore          9
        //   353: aload           9
        //   355: athrow         
        //   356: iconst_0       
        //   357: istore          11
        //   359: goto            211
        //   362: iconst_0       
        //   363: istore          12
        //   365: goto            234
        //   368: astore          22
        //   370: aload           22
        //   372: athrow         
        //   373: astore          14
        //   375: aload           14
        //   377: athrow         
        //   378: astore          15
        //   380: aload           15
        //   382: athrow         
        //   383: iconst_0       
        //   384: istore_2       
        //   385: goto            270
        //   388: astore          18
        //   390: aload           18
        //   392: athrow         
        //   393: astore          21
        //   395: aload           21
        //   397: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      31     166    169    Ljava/lang/IllegalStateException;
        //  31     94     169    174    Ljava/lang/IllegalStateException;
        //  99     105    174    179    Ljava/lang/IllegalStateException;
        //  110    117    161    166    Ljava/lang/IllegalStateException;
        //  117    161    161    166    Ljava/lang/IllegalStateException;
        //  171    174    174    179    Ljava/lang/IllegalStateException;
        //  176    179    161    166    Ljava/lang/IllegalStateException;
        //  179    203    351    356    Ljava/lang/IllegalStateException;
        //  239    244    368    373    Ljava/lang/IllegalStateException;
        //  253    260    373    383    Ljava/lang/IllegalStateException;
        //  301    318    388    393    Ljava/lang/IllegalStateException;
        //  339    345    393    398    Ljava/lang/IllegalStateException;
        //  375    378    378    383    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 191, Size: 191
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
    
    private void setHasEmbeddedTabs(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: iload_1        
        //     8: putfield        android/support/v7/internal/app/WindowDecorActionBar.mHasEmbeddedTabs:Z
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHasEmbeddedTabs:Z
        //    15: istore          6
        //    17: iload           6
        //    19: ifne            47
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    26: aconst_null    
        //    27: invokeinterface android/support/v7/internal/widget/DecorToolbar.setEmbeddedTabView:(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    36: aload_0        
        //    37: getfield        android/support/v7/internal/app/WindowDecorActionBar.mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
        //    40: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setTabContainer:(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
        //    43: iload_3        
        //    44: ifeq            68
        //    47: aload_0        
        //    48: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    51: aconst_null    
        //    52: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setTabContainer:(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
        //    55: aload_0        
        //    56: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    59: aload_0        
        //    60: getfield        android/support/v7/internal/app/WindowDecorActionBar.mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
        //    63: invokeinterface android/support/v7/internal/widget/DecorToolbar.setEmbeddedTabView:(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
        //    68: aload_0        
        //    69: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.getNavigationMode:()I
        //    72: istore          8
        //    74: iload           8
        //    76: iconst_2       
        //    77: if_icmpne       216
        //    80: iload_2        
        //    81: istore          9
        //    83: aload_0        
        //    84: getfield        android/support/v7/internal/app/WindowDecorActionBar.mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
        //    87: astore          14
        //    89: aload           14
        //    91: ifnull          138
        //    94: iload           9
        //    96: ifeq            129
        //    99: aload_0        
        //   100: getfield        android/support/v7/internal/app/WindowDecorActionBar.mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
        //   103: iconst_0       
        //   104: invokevirtual   android/support/v7/internal/widget/ScrollingTabContainerView.setVisibility:(I)V
        //   107: aload_0        
        //   108: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   111: astore          24
        //   113: aload           24
        //   115: ifnull          138
        //   118: aload_0        
        //   119: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   122: invokestatic    android/support/v4/view/ViewCompat.requestApplyInsets:(Landroid/view/View;)V
        //   125: iload_3        
        //   126: ifeq            138
        //   129: aload_0        
        //   130: getfield        android/support/v7/internal/app/WindowDecorActionBar.mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
        //   133: bipush          8
        //   135: invokevirtual   android/support/v7/internal/widget/ScrollingTabContainerView.setVisibility:(I)V
        //   138: aload_0        
        //   139: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //   142: astore          17
        //   144: aload_0        
        //   145: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHasEmbeddedTabs:Z
        //   148: istore          18
        //   150: iload           18
        //   152: ifne            252
        //   155: iload           9
        //   157: ifeq            252
        //   160: iload_2        
        //   161: istore          19
        //   163: aload           17
        //   165: iload           19
        //   167: invokeinterface android/support/v7/internal/widget/DecorToolbar.setCollapsible:(Z)V
        //   172: aload_0        
        //   173: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   176: astore          22
        //   178: aload_0        
        //   179: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHasEmbeddedTabs:Z
        //   182: istore          23
        //   184: iload           23
        //   186: ifne            268
        //   189: iload           9
        //   191: ifeq            268
        //   194: aload           22
        //   196: iload_2        
        //   197: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setHasNonEmbeddedTabs:(Z)V
        //   200: return         
        //   201: astore          4
        //   203: aload           4
        //   205: athrow         
        //   206: astore          5
        //   208: aload           5
        //   210: athrow         
        //   211: astore          7
        //   213: aload           7
        //   215: athrow         
        //   216: iconst_0       
        //   217: istore          9
        //   219: goto            83
        //   222: astore          10
        //   224: aload           10
        //   226: athrow         
        //   227: astore          11
        //   229: aload           11
        //   231: athrow         
        //   232: astore          12
        //   234: aload           12
        //   236: athrow         
        //   237: astore          13
        //   239: aload           13
        //   241: athrow         
        //   242: astore          15
        //   244: aload           15
        //   246: athrow         
        //   247: astore          16
        //   249: aload           16
        //   251: athrow         
        //   252: iconst_0       
        //   253: istore          19
        //   255: goto            163
        //   258: astore          20
        //   260: aload           20
        //   262: athrow         
        //   263: astore          21
        //   265: aload           21
        //   267: athrow         
        //   268: iconst_0       
        //   269: istore_2       
        //   270: goto            194
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      17     201    206    Ljava/lang/IllegalStateException;
        //  22     43     206    211    Ljava/lang/IllegalStateException;
        //  47     68     206    211    Ljava/lang/IllegalStateException;
        //  68     74     211    216    Ljava/lang/IllegalStateException;
        //  83     89     222    232    Ljava/lang/IllegalStateException;
        //  99     113    232    237    Ljava/lang/IllegalStateException;
        //  118    125    237    242    Ljava/lang/IllegalStateException;
        //  129    138    237    242    Ljava/lang/IllegalStateException;
        //  138    150    242    252    Ljava/lang/IllegalStateException;
        //  163    184    258    268    Ljava/lang/IllegalStateException;
        //  203    206    206    211    Ljava/lang/IllegalStateException;
        //  224    227    227    232    Ljava/lang/IllegalStateException;
        //  229    232    232    237    Ljava/lang/IllegalStateException;
        //  234    237    237    242    Ljava/lang/IllegalStateException;
        //  244    247    247    252    Ljava/lang/IllegalStateException;
        //  260    263    263    268    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 136, Size: 136
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
    
    private void showForActionMode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowingForMode:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            34
        //     9: aload_0        
        //    10: iconst_1       
        //    11: putfield        android/support/v7/internal/app/WindowDecorActionBar.mShowingForMode:Z
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    18: ifnull          29
        //    21: aload_0        
        //    22: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    25: iconst_1       
        //    26: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setShowingForActionMode:(Z)V
        //    29: aload_0        
        //    30: iconst_0       
        //    31: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.updateVisibility:(Z)V
        //    34: return         
        //    35: astore_1       
        //    36: aload_1        
        //    37: athrow         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      35     38     Ljava/lang/IllegalStateException;
        //  9      29     38     41     Ljava/lang/IllegalStateException;
        //  36     38     38     41     Ljava/lang/IllegalStateException;
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
    
    private void updateVisibility(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHiddenByApp:Z
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHiddenBySystem:Z
        //     8: aload_0        
        //     9: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowingForMode:Z
        //    12: invokestatic    android/support/v7/internal/app/WindowDecorActionBar.checkShowingFlags:(ZZZ)Z
        //    15: ifeq            49
        //    18: aload_0        
        //    19: getfield        android/support/v7/internal/app/WindowDecorActionBar.mNowShowing:Z
        //    22: istore          5
        //    24: iload           5
        //    26: ifne            66
        //    29: aload_0        
        //    30: iconst_1       
        //    31: putfield        android/support/v7/internal/app/WindowDecorActionBar.mNowShowing:Z
        //    34: aload_0        
        //    35: iload_1        
        //    36: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.doShow:(Z)V
        //    39: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //    42: istore          6
        //    44: iload           6
        //    46: ifeq            66
        //    49: aload_0        
        //    50: getfield        android/support/v7/internal/app/WindowDecorActionBar.mNowShowing:Z
        //    53: ifeq            66
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        android/support/v7/internal/app/WindowDecorActionBar.mNowShowing:Z
        //    61: aload_0        
        //    62: iload_1        
        //    63: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.doHide:(Z)V
        //    66: return         
        //    67: astore_3       
        //    68: aload_3        
        //    69: athrow         
        //    70: astore          4
        //    72: aload           4
        //    74: athrow         
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     24     67     70     Ljava/lang/IllegalStateException;
        //  29     44     70     75     Ljava/lang/IllegalStateException;
        //  49     66     75     78     Ljava/lang/IllegalStateException;
        //  68     70     70     75     Ljava/lang/IllegalStateException;
        //  72     75     75     78     Ljava/lang/IllegalStateException;
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
    
    public void animateToMode(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifeq            14
        //     4: aload_0        
        //     5: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.showForActionMode:()V
        //     8: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //    11: ifeq            18
        //    14: aload_0        
        //    15: invokespecial   android/support/v7/internal/app/WindowDecorActionBar.hideForActionMode:()V
        //    18: aload_0        
        //    19: getfield        android/support/v7/internal/app/WindowDecorActionBar.mDecorToolbar:Landroid/support/v7/internal/widget/DecorToolbar;
        //    22: astore          4
        //    24: iload_1        
        //    25: ifeq            68
        //    28: bipush          8
        //    30: istore          5
        //    32: aload           4
        //    34: iload           5
        //    36: invokeinterface android/support/v7/internal/widget/DecorToolbar.animateToVisibility:(I)V
        //    41: aload_0        
        //    42: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    45: astore          7
        //    47: iconst_0       
        //    48: istore          8
        //    50: iload_1        
        //    51: ifeq            79
        //    54: aload           7
        //    56: iload           8
        //    58: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.animateToVisibility:(I)V
        //    61: return         
        //    62: astore_2       
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: iconst_0       
        //    69: istore          5
        //    71: goto            32
        //    74: astore          6
        //    76: aload           6
        //    78: athrow         
        //    79: bipush          8
        //    81: istore          8
        //    83: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      14     62     65     Ljava/lang/IllegalStateException;
        //  14     18     62     65     Ljava/lang/IllegalStateException;
        //  18     24     65     68     Ljava/lang/IllegalStateException;
        //  32     47     74     79     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
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
    
    @Override
    public boolean collapseActionView() {
        try {
            if (this.mDecorToolbar == null) {
                return false;
            }
            final WindowDecorActionBar windowDecorActionBar = this;
            final DecorToolbar decorToolbar = windowDecorActionBar.mDecorToolbar;
            final boolean b = decorToolbar.hasExpandedActionView();
            if (b) {
                final WindowDecorActionBar windowDecorActionBar2 = this;
                final DecorToolbar decorToolbar2 = windowDecorActionBar2.mDecorToolbar;
                decorToolbar2.collapseActionView();
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final WindowDecorActionBar windowDecorActionBar = this;
            final DecorToolbar decorToolbar = windowDecorActionBar.mDecorToolbar;
            final boolean b = decorToolbar.hasExpandedActionView();
            if (b) {
                final WindowDecorActionBar windowDecorActionBar2 = this;
                final DecorToolbar decorToolbar2 = windowDecorActionBar2.mDecorToolbar;
                decorToolbar2.collapseActionView();
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    void completeDeferredDestroyActionMode() {
        try {
            if (this.mDeferredModeDestroyCallback != null) {
                this.mDeferredModeDestroyCallback.onDestroyActionMode(this.mDeferredDestroyActionMode);
                this.mDeferredDestroyActionMode = null;
                this.mDeferredModeDestroyCallback = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void dispatchMenuVisibilityChanged(final boolean mLastMenuVisibility) {
        while (true) {
            final int b = ToolbarActionBar.b;
            try {
                if (mLastMenuVisibility == this.mLastMenuVisibility) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            this.mLastMenuVisibility = mLastMenuVisibility;
            int n;
            for (int size = this.mMenuVisibilityListeners.size(), i = 0; i < size; i = n) {
                ((ActionBar$OnMenuVisibilityListener)this.mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(mLastMenuVisibility);
                n = i + 1;
                if (b != 0) {
                    return;
                }
            }
        }
    }
    
    public void doHide(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //    11: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.cancel:()V
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurWindowVisibility:I
        //    18: istore          6
        //    20: iload           6
        //    22: ifne            295
        //    25: getstatic       android/support/v7/internal/app/WindowDecorActionBar.ALLOW_SHOW_HIDE_ANIMATIONS:Z
        //    28: istore          8
        //    30: iload           8
        //    32: ifeq            295
        //    35: aload_0        
        //    36: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowHideAnimationEnabled:Z
        //    39: istore          9
        //    41: iload           9
        //    43: ifne            50
        //    46: iload_1        
        //    47: ifeq            295
        //    50: aload_0        
        //    51: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    54: fconst_1       
        //    55: invokestatic    android/support/v4/view/ViewCompat.setAlpha:(Landroid/view/View;F)V
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    62: iconst_1       
        //    63: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setTransitioning:(Z)V
        //    66: new             Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //    69: dup            
        //    70: invokespecial   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.<init>:()V
        //    73: astore          10
        //    75: aload_0        
        //    76: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    79: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getHeight:()I
        //    82: ineg           
        //    83: i2f            
        //    84: fstore          11
        //    86: iload_1        
        //    87: ifeq            122
        //    90: iconst_2       
        //    91: newarray        I
        //    93: dup            
        //    94: iconst_0       
        //    95: iconst_0       
        //    96: iastore        
        //    97: dup            
        //    98: iconst_1       
        //    99: iconst_0       
        //   100: iastore        
        //   101: astore          12
        //   103: aload_0        
        //   104: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   107: aload           12
        //   109: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getLocationInWindow:([I)V
        //   112: fload           11
        //   114: aload           12
        //   116: iconst_1       
        //   117: iaload         
        //   118: i2f            
        //   119: fsub           
        //   120: fstore          11
        //   122: aload_0        
        //   123: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   126: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   129: fload           11
        //   131: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   134: astore          13
        //   136: aload           13
        //   138: aload_0        
        //   139: getfield        android/support/v7/internal/app/WindowDecorActionBar.mUpdateListener:Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;
        //   142: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.setUpdateListener:(Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   145: pop            
        //   146: aload           10
        //   148: aload           13
        //   150: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   153: pop            
        //   154: aload_0        
        //   155: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentAnimations:Z
        //   158: istore          18
        //   160: iload           18
        //   162: ifeq            190
        //   165: aload_0        
        //   166: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   169: ifnull          190
        //   172: aload           10
        //   174: aload_0        
        //   175: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   178: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   181: fload           11
        //   183: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   186: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   189: pop            
        //   190: aload_0        
        //   191: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   194: astore          21
        //   196: aload           21
        //   198: ifnull          243
        //   201: aload_0        
        //   202: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   205: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getVisibility:()I
        //   208: ifne            243
        //   211: aload_0        
        //   212: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   215: fconst_1       
        //   216: invokestatic    android/support/v4/view/ViewCompat.setAlpha:(Landroid/view/View;F)V
        //   219: aload           10
        //   221: aload_0        
        //   222: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   225: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   228: aload_0        
        //   229: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   232: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getHeight:()I
        //   235: i2f            
        //   236: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   239: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   242: pop            
        //   243: aload           10
        //   245: aload_0        
        //   246: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContext:Landroid/content/Context;
        //   249: ldc_w           17432581
        //   252: invokestatic    android/view/animation/AnimationUtils.loadInterpolator:(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
        //   255: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setInterpolator:(Landroid/view/animation/Interpolator;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   258: pop            
        //   259: aload           10
        //   261: ldc2_w          250
        //   264: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setDuration:(J)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   267: pop            
        //   268: aload           10
        //   270: aload_0        
        //   271: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHideListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //   274: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setListener:(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   277: pop            
        //   278: aload_0        
        //   279: aload           10
        //   281: putfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   284: aload           10
        //   286: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.start:()V
        //   289: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //   292: ifeq            305
        //   295: aload_0        
        //   296: getfield        android/support/v7/internal/app/WindowDecorActionBar.mHideListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //   299: aconst_null    
        //   300: invokeinterface android/support/v4/view/ViewPropertyAnimatorListener.onAnimationEnd:(Landroid/view/View;)V
        //   305: return         
        //   306: astore_2       
        //   307: aload_2        
        //   308: athrow         
        //   309: astore_3       
        //   310: aload_3        
        //   311: athrow         
        //   312: astore          4
        //   314: aload           4
        //   316: athrow         
        //   317: astore          5
        //   319: aload           5
        //   321: athrow         
        //   322: astore          14
        //   324: aload           14
        //   326: athrow         
        //   327: astore          15
        //   329: aload           15
        //   331: athrow         
        //   332: astore          19
        //   334: aload           19
        //   336: athrow         
        //   337: astore          20
        //   339: aload           20
        //   341: athrow         
        //   342: astore          7
        //   344: aload           7
        //   346: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     306    309    Ljava/lang/IllegalStateException;
        //  14     20     309    312    Ljava/lang/IllegalStateException;
        //  25     30     312    317    Ljava/lang/IllegalStateException;
        //  35     41     317    322    Ljava/lang/IllegalStateException;
        //  136    160    322    327    Ljava/lang/IllegalStateException;
        //  165    190    327    332    Ljava/lang/IllegalStateException;
        //  190    196    332    337    Ljava/lang/IllegalStateException;
        //  201    243    337    342    Ljava/lang/IllegalStateException;
        //  243    295    342    347    Ljava/lang/IllegalStateException;
        //  295    305    342    347    Ljava/lang/IllegalStateException;
        //  310    312    312    317    Ljava/lang/IllegalStateException;
        //  314    317    317    322    Ljava/lang/IllegalStateException;
        //  324    327    327    332    Ljava/lang/IllegalStateException;
        //  334    337    337    342    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 174, Size: 174
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
    
    public void doShow(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //    11: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.cancel:()V
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    18: iconst_0       
        //    19: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setVisibility:(I)V
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/app/WindowDecorActionBar.mCurWindowVisibility:I
        //    26: istore          6
        //    28: iload           6
        //    30: ifne            321
        //    33: getstatic       android/support/v7/internal/app/WindowDecorActionBar.ALLOW_SHOW_HIDE_ANIMATIONS:Z
        //    36: istore          14
        //    38: iload           14
        //    40: ifeq            321
        //    43: aload_0        
        //    44: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowHideAnimationEnabled:Z
        //    47: istore          15
        //    49: iload           15
        //    51: ifne            58
        //    54: iload_1        
        //    55: ifeq            321
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    62: fconst_0       
        //    63: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //    66: aload_0        
        //    67: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    70: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getHeight:()I
        //    73: ineg           
        //    74: i2f            
        //    75: fstore          16
        //    77: iload_1        
        //    78: ifeq            113
        //    81: iconst_2       
        //    82: newarray        I
        //    84: dup            
        //    85: iconst_0       
        //    86: iconst_0       
        //    87: iastore        
        //    88: dup            
        //    89: iconst_1       
        //    90: iconst_0       
        //    91: iastore        
        //    92: astore          17
        //    94: aload_0        
        //    95: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    98: aload           17
        //   100: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getLocationInWindow:([I)V
        //   103: fload           16
        //   105: aload           17
        //   107: iconst_1       
        //   108: iaload         
        //   109: i2f            
        //   110: fsub           
        //   111: fstore          16
        //   113: aload_0        
        //   114: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   117: fload           16
        //   119: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   122: new             Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   125: dup            
        //   126: invokespecial   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.<init>:()V
        //   129: astore          18
        //   131: aload_0        
        //   132: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   135: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   138: fconst_0       
        //   139: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   142: astore          19
        //   144: aload           19
        //   146: aload_0        
        //   147: getfield        android/support/v7/internal/app/WindowDecorActionBar.mUpdateListener:Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;
        //   150: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.setUpdateListener:(Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   153: pop            
        //   154: aload           18
        //   156: aload           19
        //   158: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   161: pop            
        //   162: aload_0        
        //   163: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentAnimations:Z
        //   166: istore          24
        //   168: iload           24
        //   170: ifeq            206
        //   173: aload_0        
        //   174: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   177: ifnull          206
        //   180: aload_0        
        //   181: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   184: fload           16
        //   186: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   189: aload           18
        //   191: aload_0        
        //   192: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   195: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   198: fconst_0       
        //   199: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   202: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   205: pop            
        //   206: aload_0        
        //   207: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   210: astore          27
        //   212: aload           27
        //   214: ifnull          265
        //   217: aload_0        
        //   218: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextDisplayMode:I
        //   221: iconst_1       
        //   222: if_icmpne       265
        //   225: aload_0        
        //   226: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   229: aload_0        
        //   230: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   233: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getHeight:()I
        //   236: i2f            
        //   237: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   240: aload_0        
        //   241: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   244: iconst_0       
        //   245: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setVisibility:(I)V
        //   248: aload           18
        //   250: aload_0        
        //   251: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   254: invokestatic    android/support/v4/view/ViewCompat.animate:(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   257: fconst_0       
        //   258: invokevirtual   android/support/v4/view/ViewPropertyAnimatorCompat.translationY:(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
        //   261: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.play:(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   264: pop            
        //   265: aload           18
        //   267: aload_0        
        //   268: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContext:Landroid/content/Context;
        //   271: ldc_w           17432582
        //   274: invokestatic    android/view/animation/AnimationUtils.loadInterpolator:(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
        //   277: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setInterpolator:(Landroid/view/animation/Interpolator;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   280: pop            
        //   281: aload           18
        //   283: ldc2_w          250
        //   286: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setDuration:(J)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   289: pop            
        //   290: aload           18
        //   292: aload_0        
        //   293: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //   296: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.setListener:(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   299: pop            
        //   300: aload_0        
        //   301: aload           18
        //   303: putfield        android/support/v7/internal/app/WindowDecorActionBar.mCurrentShowAnim:Landroid/support/v7/internal/view/ViewPropertyAnimatorCompatSet;
        //   306: aload           18
        //   308: invokevirtual   android/support/v7/internal/view/ViewPropertyAnimatorCompatSet.start:()V
        //   311: getstatic       android/support/v7/internal/app/ToolbarActionBar.b:I
        //   314: istore          32
        //   316: iload           32
        //   318: ifeq            416
        //   321: aload_0        
        //   322: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   325: fconst_1       
        //   326: invokestatic    android/support/v4/view/ViewCompat.setAlpha:(Landroid/view/View;F)V
        //   329: aload_0        
        //   330: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   333: fconst_0       
        //   334: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   337: aload_0        
        //   338: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentAnimations:Z
        //   341: istore          9
        //   343: iload           9
        //   345: ifeq            363
        //   348: aload_0        
        //   349: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   352: ifnull          363
        //   355: aload_0        
        //   356: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContentView:Landroid/view/View;
        //   359: fconst_0       
        //   360: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   363: aload_0        
        //   364: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   367: astore          12
        //   369: aload           12
        //   371: ifnull          406
        //   374: aload_0        
        //   375: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextDisplayMode:I
        //   378: iconst_1       
        //   379: if_icmpne       406
        //   382: aload_0        
        //   383: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   386: fconst_1       
        //   387: invokestatic    android/support/v4/view/ViewCompat.setAlpha:(Landroid/view/View;F)V
        //   390: aload_0        
        //   391: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   394: fconst_0       
        //   395: invokestatic    android/support/v4/view/ViewCompat.setTranslationY:(Landroid/view/View;F)V
        //   398: aload_0        
        //   399: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   402: iconst_0       
        //   403: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setVisibility:(I)V
        //   406: aload_0        
        //   407: getfield        android/support/v7/internal/app/WindowDecorActionBar.mShowListener:Landroid/support/v4/view/ViewPropertyAnimatorListener;
        //   410: aconst_null    
        //   411: invokeinterface android/support/v4/view/ViewPropertyAnimatorListener.onAnimationEnd:(Landroid/view/View;)V
        //   416: aload_0        
        //   417: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   420: ifnull          430
        //   423: aload_0        
        //   424: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   427: invokestatic    android/support/v4/view/ViewCompat.requestApplyInsets:(Landroid/view/View;)V
        //   430: return         
        //   431: astore_2       
        //   432: aload_2        
        //   433: athrow         
        //   434: astore_3       
        //   435: aload_3        
        //   436: athrow         
        //   437: astore          4
        //   439: aload           4
        //   441: athrow         
        //   442: astore          5
        //   444: aload           5
        //   446: athrow         
        //   447: astore          20
        //   449: aload           20
        //   451: athrow         
        //   452: astore          21
        //   454: aload           21
        //   456: athrow         
        //   457: astore          25
        //   459: aload           25
        //   461: athrow         
        //   462: astore          26
        //   464: aload           26
        //   466: athrow         
        //   467: astore          28
        //   469: aload           28
        //   471: athrow         
        //   472: astore          7
        //   474: aload           7
        //   476: athrow         
        //   477: astore          8
        //   479: aload           8
        //   481: athrow         
        //   482: astore          10
        //   484: aload           10
        //   486: athrow         
        //   487: astore          11
        //   489: aload           11
        //   491: athrow         
        //   492: astore          13
        //   494: aload           13
        //   496: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     431    434    Ljava/lang/IllegalStateException;
        //  14     28     434    437    Ljava/lang/IllegalStateException;
        //  33     38     437    442    Ljava/lang/IllegalStateException;
        //  43     49     442    447    Ljava/lang/IllegalStateException;
        //  144    168    447    452    Ljava/lang/IllegalStateException;
        //  173    206    452    457    Ljava/lang/IllegalStateException;
        //  206    212    457    462    Ljava/lang/IllegalStateException;
        //  217    265    462    467    Ljava/lang/IllegalStateException;
        //  265    316    467    472    Ljava/lang/IllegalStateException;
        //  321    343    472    477    Ljava/lang/IllegalStateException;
        //  348    363    477    482    Ljava/lang/IllegalStateException;
        //  363    369    482    487    Ljava/lang/IllegalStateException;
        //  374    406    487    492    Ljava/lang/IllegalStateException;
        //  416    430    492    497    Ljava/lang/IllegalStateException;
        //  435    437    437    442    Ljava/lang/IllegalStateException;
        //  439    442    442    447    Ljava/lang/IllegalStateException;
        //  449    452    452    457    Ljava/lang/IllegalStateException;
        //  459    462    462    467    Ljava/lang/IllegalStateException;
        //  469    472    472    477    Ljava/lang/IllegalStateException;
        //  474    477    477    482    Ljava/lang/IllegalStateException;
        //  484    487    487    492    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 250, Size: 250
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
    
    @Override
    public void enableContentAnimations(final boolean mContentAnimations) {
        this.mContentAnimations = mContentAnimations;
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }
    
    public int getNavigationMode() {
        return this.mDecorToolbar.getNavigationMode();
    }
    
    @Override
    public Context getThemedContext() {
        Label_0070: {
            if (this.mThemedContext != null) {
                break Label_0070;
            }
            final TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            final int resourceId = typedValue.resourceId;
            Label_0062: {
                if (resourceId == 0) {
                    break Label_0062;
                }
                try {
                    this.mThemedContext = (Context)new ContextThemeWrapper(this.mContext, resourceId);
                    if (ToolbarActionBar.b != 0) {
                        this.mThemedContext = this.mContext;
                    }
                    return this.mThemedContext;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void hide() {
        try {
            if (!this.mHiddenByApp) {
                this.mHiddenByApp = true;
                this.updateVisibility(false);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void hideForSystem() {
        try {
            if (!this.mHiddenBySystem) {
                this.updateVisibility(this.mHiddenBySystem = true);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        this.setHasEmbeddedTabs(ActionBarPolicy.get(this.mContext).hasEmbeddedTabs());
    }
    
    @Override
    public void onContentScrollStarted() {
        try {
            if (this.mCurrentShowAnim != null) {
                this.mCurrentShowAnim.cancel();
                this.mCurrentShowAnim = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onContentScrollStopped() {
    }
    
    @Override
    public void onWindowVisibilityChanged(final int mCurWindowVisibility) {
        this.mCurWindowVisibility = mCurWindowVisibility;
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable primaryBackground) {
        this.mContainerView.setPrimaryBackground(primaryBackground);
    }
    
    @Override
    public void setCustomView(final View customView) {
        this.mDecorToolbar.setCustomView(customView);
    }
    
    @Override
    public void setCustomView(final View customView, final ActionBar$LayoutParams layoutParams) {
        customView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.mDecorToolbar.setCustomView(customView);
    }
    
    @Override
    public void setDefaultDisplayHomeAsUpEnabled(final boolean displayHomeAsUpEnabled) {
        try {
            if (!this.mDisplayHomeAsUpSet) {
                this.setDisplayHomeAsUpEnabled(displayHomeAsUpEnabled);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void setDisplayHomeAsUpEnabled(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 4);
    }
    
    public void setDisplayOptions(final int n, final int n2) {
        final int displayOptions = this.mDecorToolbar.getDisplayOptions();
        Label_0021: {
            if ((n2 & 0x4) == 0x0) {
                break Label_0021;
            }
            try {
                this.mDisplayHomeAsUpSet = true;
                this.mDecorToolbar.setDisplayOptions((n & n2) | (displayOptions & ~n2));
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void setDisplayShowCustomEnabled(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 16);
    }
    
    @Override
    public void setDisplayShowHomeEnabled(final boolean b) {
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 2);
    }
    
    @Override
    public void setDisplayShowTitleEnabled(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 8);
    }
    
    @Override
    public void setElevation(final float n) {
        try {
            ViewCompat.setElevation((View)this.mContainerView, n);
            if (this.mSplitView != null) {
                ViewCompat.setElevation((View)this.mSplitView, n);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void setHideOnContentScrollEnabled(final boolean b) {
        if (b) {
            try {
                if (!this.mOverlayLayout.isInOverlayMode()) {
                    throw new IllegalStateException(WindowDecorActionBar.z[1]);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        this.mHideOnContentScroll = b;
        this.mOverlayLayout.setHideOnContentScrollEnabled(b);
    }
    
    @Override
    public void setHomeAsUpIndicator(final Drawable navigationIcon) {
        this.mDecorToolbar.setNavigationIcon(navigationIcon);
    }
    
    public void setHomeButtonEnabled(final boolean homeButtonEnabled) {
        this.mDecorToolbar.setHomeButtonEnabled(homeButtonEnabled);
    }
    
    @Override
    public void setIcon(final Drawable icon) {
        this.mDecorToolbar.setIcon(icon);
    }
    
    @Override
    public void setShowHideAnimationEnabled(final boolean mShowHideAnimationEnabled) {
        try {
            if (this.mShowHideAnimationEnabled = mShowHideAnimationEnabled) {
                return;
            }
            final WindowDecorActionBar windowDecorActionBar = this;
            final ViewPropertyAnimatorCompatSet set = windowDecorActionBar.mCurrentShowAnim;
            if (set != null) {
                final WindowDecorActionBar windowDecorActionBar2 = this;
                final ViewPropertyAnimatorCompatSet set2 = windowDecorActionBar2.mCurrentShowAnim;
                set2.cancel();
            }
            return;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final WindowDecorActionBar windowDecorActionBar = this;
            final ViewPropertyAnimatorCompatSet set = windowDecorActionBar.mCurrentShowAnim;
            if (set != null) {
                final WindowDecorActionBar windowDecorActionBar2 = this;
                final ViewPropertyAnimatorCompatSet set2 = windowDecorActionBar2.mCurrentShowAnim;
                set2.cancel();
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        this.mDecorToolbar.setSubtitle(subtitle);
    }
    
    @Override
    public void setTitle(final int n) {
        this.setTitle(this.mContext.getString(n));
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mDecorToolbar.setTitle(title);
    }
    
    @Override
    public void setWindowTitle(final CharSequence windowTitle) {
        this.mDecorToolbar.setWindowTitle(windowTitle);
    }
    
    @Override
    public void show() {
        try {
            if (this.mHiddenByApp) {
                this.updateVisibility(this.mHiddenByApp = false);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void showForSystem() {
        try {
            if (this.mHiddenBySystem) {
                this.mHiddenBySystem = false;
                this.updateVisibility(true);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public ActionMode startActionMode(final ActionMode$Callback p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/app/WindowDecorActionBar.mActionMode:Landroid/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/app/WindowDecorActionBar.mActionMode:Landroid/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl;
        //    11: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl.finish:()V
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //    18: iconst_0       
        //    19: invokevirtual   android/support/v7/internal/widget/ActionBarOverlayLayout.setHideOnContentScrollEnabled:(Z)V
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    26: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.killMode:()V
        //    29: new             Landroid/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl;
        //    32: dup            
        //    33: aload_0        
        //    34: aload_0        
        //    35: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    38: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //    41: aload_1        
        //    42: invokespecial   android/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl.<init>:(Landroid/support/v7/internal/app/WindowDecorActionBar;Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V
        //    45: astore_3       
        //    46: aload_3        
        //    47: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl.dispatchOnCreate:()Z
        //    50: istore          9
        //    52: iload           9
        //    54: ifeq            177
        //    57: aload_3        
        //    58: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl.invalidate:()V
        //    61: aload_0        
        //    62: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    65: aload_3        
        //    66: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.initForMode:(Landroid/support/v7/view/ActionMode;)V
        //    69: aload_0        
        //    70: iconst_1       
        //    71: invokevirtual   android/support/v7/internal/app/WindowDecorActionBar.animateToMode:(Z)V
        //    74: aload_0        
        //    75: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //    78: astore          10
        //    80: aload           10
        //    82: ifnull          133
        //    85: aload_0        
        //    86: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextDisplayMode:I
        //    89: istore          11
        //    91: iload           11
        //    93: iconst_1       
        //    94: if_icmpne       133
        //    97: aload_0        
        //    98: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   101: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.getVisibility:()I
        //   104: istore          12
        //   106: iload           12
        //   108: ifeq            133
        //   111: aload_0        
        //   112: getfield        android/support/v7/internal/app/WindowDecorActionBar.mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
        //   115: iconst_0       
        //   116: invokevirtual   android/support/v7/internal/widget/ActionBarContainer.setVisibility:(I)V
        //   119: aload_0        
        //   120: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   123: ifnull          133
        //   126: aload_0        
        //   127: getfield        android/support/v7/internal/app/WindowDecorActionBar.mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
        //   130: invokestatic    android/support/v4/view/ViewCompat.requestApplyInsets:(Landroid/view/View;)V
        //   133: aload_0        
        //   134: getfield        android/support/v7/internal/app/WindowDecorActionBar.mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   137: bipush          32
        //   139: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.sendAccessibilityEvent:(I)V
        //   142: aload_0        
        //   143: aload_3        
        //   144: putfield        android/support/v7/internal/app/WindowDecorActionBar.mActionMode:Landroid/support/v7/internal/app/WindowDecorActionBar$ActionModeImpl;
        //   147: aload_3        
        //   148: areturn        
        //   149: astore_2       
        //   150: aload_2        
        //   151: athrow         
        //   152: astore          4
        //   154: aload           4
        //   156: athrow         
        //   157: astore          5
        //   159: aload           5
        //   161: athrow         
        //   162: astore          6
        //   164: aload           6
        //   166: athrow         
        //   167: astore          7
        //   169: aload           7
        //   171: athrow         
        //   172: astore          8
        //   174: aload           8
        //   176: athrow         
        //   177: aconst_null    
        //   178: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     149    152    Ljava/lang/IllegalStateException;
        //  46     52     152    157    Ljava/lang/IllegalStateException;
        //  57     80     157    162    Ljava/lang/IllegalStateException;
        //  85     91     162    167    Ljava/lang/IllegalStateException;
        //  97     106    167    172    Ljava/lang/IllegalStateException;
        //  111    133    172    177    Ljava/lang/IllegalStateException;
        //  154    157    157    162    Ljava/lang/IllegalStateException;
        //  159    162    162    167    Ljava/lang/IllegalStateException;
        //  164    167    167    172    Ljava/lang/IllegalStateException;
        //  169    172    172    177    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
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
}
