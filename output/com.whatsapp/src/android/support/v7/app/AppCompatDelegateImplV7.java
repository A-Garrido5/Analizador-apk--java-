// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.view.ActionMode$Callback;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.app.Dialog;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.app.Activity;
import android.view.LayoutInflater$Factory;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.util.AndroidRuntimeException;
import android.view.KeyEvent;
import android.support.v4.view.ViewCompat;
import android.view.Window$Callback;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.Window;
import android.content.Context;
import android.widget.TextView;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.View;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.app.AppCompatViewInflater;
import android.support.v7.internal.widget.ActionBarContextView;
import android.widget.PopupWindow;
import android.support.v7.view.ActionMode;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;

class AppCompatDelegateImplV7 extends AppCompatDelegateImplBase implements MenuBuilder$Callback, LayoutInflaterFactory
{
    private static final String[] z;
    private AppCompatDelegateImplV7$ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    private AppCompatDelegateImplV7$PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private AppCompatDelegateImplV7$PanelFeatureState[] mPanels;
    private AppCompatDelegateImplV7$PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;
    private ViewGroup mWindowDecor;
    
    static {
        final String[] z2 = new String[11];
        String s = "c6\"\u0000IL\u00189\rC\u000267\u0005J@45\u0002\u0006A48IHM!v\u000bC\u0002;#\u0005J\f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '\"';
                        break;
                    }
                    case 1: {
                        c2 = 'U';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u<8\rIUu0\fGV $\f\u0006O %\u001d\u0006@0v\u001bCS 3\u001aRG1v\u000bCD:$\f\u0006C12\u0000HEu5\u0006HV08\u001d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "c%&*IO%7\u001dbG93\u000eGV0";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "a:#\u0005BLr\"IAG!v\bSF<9IKC;7\u000eCP";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "C 2\u0000I";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "v=?\u001a\u0006c6\"\u0000PK!/IGN'3\bB[u>\bU\u000248IGA!?\u0006H\u000277\u001b\u0006Q &\u0019JK02ID[u\"\u0001C\u0002\"?\u0007BM\"v\rCA:$G\u0006f:v\u0007IVu$\fWW0%\u001d\u0006u<8\rIU{\u0010,gv\u0000\u0004,yc\u0016\u0002 il\n\u0014(t\u000248\r\u0006Q0\"IQK;2\u0006Qc6\"\u0000IL\u00177\u001b\u0006V:v\u000fGN&3IOLu/\u0006SPu\"\u0001CO0v\u001dI\u0002 %\f\u0006Cu\u0002\u0006IN77\u001b\u0006K;%\u001dCC1x";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "U<8\rIU";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "U<8\rIU";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "c%&*IO%7\u001d\u0006F:3\u001a\u0006L:\"IUW%&\u0006TVu\"\u0001C\u00026#\u001bTG;\"IRJ0;\f\u0006D07\u001dSP0%";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "v=3IgA!?\u001fOV,q\u001a\u0006n4/\u0006SV\u001c8\u000fJC!3\u001b\u0006C9$\fGF,v\u0001GQu7I`C6\"\u0006T[u?\u0007UV4:\u0005CFu%\u0006\u0006U0v\nGLu8\u0006R\u0002<8\u001aRC9:IgR%\u0015\u0006KR4\"NU";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "c%&*IO%7\u001dbG93\u000eGV0";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    AppCompatDelegateImplV7(final Context context, final Window window, final AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
        this.mInvalidatePanelMenuRunnable = new AppCompatDelegateImplV7$1(this);
    }
    
    static int access$000(final AppCompatDelegateImplV7 appCompatDelegateImplV7) {
        return appCompatDelegateImplV7.mInvalidatePanelMenuFeatures;
    }
    
    static int access$002(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final int mInvalidatePanelMenuFeatures) {
        return appCompatDelegateImplV7.mInvalidatePanelMenuFeatures = mInvalidatePanelMenuFeatures;
    }
    
    static void access$100(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final int n) {
        appCompatDelegateImplV7.doInvalidatePanelMenu(n);
    }
    
    static void access$1200(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final int n) {
        appCompatDelegateImplV7.closePanel(n);
    }
    
    static boolean access$202(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final boolean mInvalidatePanelMenuPosted) {
        return appCompatDelegateImplV7.mInvalidatePanelMenuPosted = mInvalidatePanelMenuPosted;
    }
    
    static int access$300(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final int n) {
        return appCompatDelegateImplV7.updateStatusGuard(n);
    }
    
    static AppCompatDelegateImplV7$PanelFeatureState access$600(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final Menu menu) {
        return appCompatDelegateImplV7.findMenuPanel(menu);
    }
    
    static void access$700(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final int n, final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState, final Menu menu) {
        appCompatDelegateImplV7.callOnPanelClosed(n, appCompatDelegateImplV7$PanelFeatureState, menu);
    }
    
    static void access$800(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState, final boolean b) {
        appCompatDelegateImplV7.closePanel(appCompatDelegateImplV7$PanelFeatureState, b);
    }
    
    static void access$900(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final MenuBuilder menuBuilder) {
        appCompatDelegateImplV7.checkCloseActionMenu(menuBuilder);
    }
    
    private void applyFixedSizeWindow(final ContentFrameLayout p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: aload_0        
        //     2: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //     5: invokevirtual   android/view/ViewGroup.getPaddingLeft:()I
        //     8: aload_0        
        //     9: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //    12: invokevirtual   android/view/ViewGroup.getPaddingTop:()I
        //    15: aload_0        
        //    16: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //    19: invokevirtual   android/view/ViewGroup.getPaddingRight:()I
        //    22: aload_0        
        //    23: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //    26: invokevirtual   android/view/ViewGroup.getPaddingBottom:()I
        //    29: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.setDecorPadding:(IIII)V
        //    32: aload_0        
        //    33: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    36: getstatic       android/support/v7/appcompat/R$styleable.Theme:[I
        //    39: invokevirtual   android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
        //    42: astore_2       
        //    43: aload_2        
        //    44: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowMinWidthMajor:I
        //    47: aload_1        
        //    48: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getMinWidthMajor:()Landroid/util/TypedValue;
        //    51: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //    54: pop            
        //    55: aload_2        
        //    56: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowMinWidthMinor:I
        //    59: aload_1        
        //    60: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getMinWidthMinor:()Landroid/util/TypedValue;
        //    63: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //    66: pop            
        //    67: aload_2        
        //    68: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedWidthMajor:I
        //    71: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //    74: ifeq            89
        //    77: aload_2        
        //    78: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedWidthMajor:I
        //    81: aload_1        
        //    82: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getFixedWidthMajor:()Landroid/util/TypedValue;
        //    85: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //    88: pop            
        //    89: aload_2        
        //    90: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedWidthMinor:I
        //    93: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //    96: ifeq            111
        //    99: aload_2        
        //   100: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedWidthMinor:I
        //   103: aload_1        
        //   104: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getFixedWidthMinor:()Landroid/util/TypedValue;
        //   107: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //   110: pop            
        //   111: aload_2        
        //   112: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedHeightMajor:I
        //   115: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   118: ifeq            133
        //   121: aload_2        
        //   122: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedHeightMajor:I
        //   125: aload_1        
        //   126: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getFixedHeightMajor:()Landroid/util/TypedValue;
        //   129: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //   132: pop            
        //   133: aload_2        
        //   134: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedHeightMinor:I
        //   137: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   140: ifeq            155
        //   143: aload_2        
        //   144: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowFixedHeightMinor:I
        //   147: aload_1        
        //   148: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.getFixedHeightMinor:()Landroid/util/TypedValue;
        //   151: invokevirtual   android/content/res/TypedArray.getValue:(ILandroid/util/TypedValue;)Z
        //   154: pop            
        //   155: aload_2        
        //   156: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   159: aload_1        
        //   160: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.requestLayout:()V
        //   163: return         
        //   164: astore_3       
        //   165: aload_3        
        //   166: athrow         
        //   167: astore          6
        //   169: aload           6
        //   171: athrow         
        //   172: astore          7
        //   174: aload           7
        //   176: athrow         
        //   177: astore          8
        //   179: aload           8
        //   181: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  43     89     164    167    Ljava/lang/IllegalStateException;
        //  89     111    167    172    Ljava/lang/IllegalStateException;
        //  111    133    172    177    Ljava/lang/IllegalStateException;
        //  133    155    177    182    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 88, Size: 88
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
    
    private void callOnPanelClosed(final int p0, final AppCompatDelegateImplV7$PanelFeatureState p1, final Menu p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_3        
        //     1: ifnonnull       41
        //     4: aload_2        
        //     5: ifnonnull       32
        //     8: iload_1        
        //     9: iflt            32
        //    12: aload_0        
        //    13: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPanels:[Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    16: arraylength    
        //    17: istore          9
        //    19: iload_1        
        //    20: iload           9
        //    22: if_icmpge       32
        //    25: aload_0        
        //    26: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPanels:[Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    29: iload_1        
        //    30: aaload         
        //    31: astore_2       
        //    32: aload_2        
        //    33: ifnull          41
        //    36: aload_2        
        //    37: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    40: astore_3       
        //    41: aload_2        
        //    42: ifnull          67
        //    45: aload_2        
        //    46: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //    49: istore          7
        //    51: iload           7
        //    53: ifne            67
        //    56: return         
        //    57: astore          8
        //    59: aload           8
        //    61: athrow         
        //    62: astore          6
        //    64: aload           6
        //    66: athrow         
        //    67: aload_0        
        //    68: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getWindowCallback:()Landroid/view/Window$Callback;
        //    71: astore          4
        //    73: aload           4
        //    75: ifnull          56
        //    78: aload           4
        //    80: iload_1        
        //    81: aload_3        
        //    82: invokeinterface android/view/Window$Callback.onPanelClosed:(ILandroid/view/Menu;)V
        //    87: return         
        //    88: astore          5
        //    90: aload           5
        //    92: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     19     57     62     Ljava/lang/IllegalStateException;
        //  45     51     62     67     Ljava/lang/IllegalStateException;
        //  78     87     88     93     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    private void checkCloseActionMenu(final MenuBuilder menuBuilder) {
        try {
            if (this.mClosingActionMenu) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        final Window$Callback windowCallback = this.getWindowCallback();
        Label_0055: {
            if (windowCallback == null) {
                break Label_0055;
            }
            try {
                if (!this.isDestroyed()) {
                    windowCallback.onPanelClosed(8, (Menu)menuBuilder);
                }
                this.mClosingActionMenu = false;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    private void closePanel(final int n) {
        this.closePanel(this.getPanelState(n, true), true);
    }
    
    private void closePanel(final AppCompatDelegateImplV7$PanelFeatureState p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_2        
        //     1: ifeq            62
        //     4: aload_1        
        //     5: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //     8: istore          12
        //    10: iload           12
        //    12: ifne            62
        //    15: aload_0        
        //    16: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    19: astore          13
        //    21: aload           13
        //    23: ifnull          62
        //    26: aload_0        
        //    27: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    30: invokeinterface android/support/v7/internal/widget/DecorContentParent.isOverflowMenuShowing:()Z
        //    35: ifeq            62
        //    38: aload_0        
        //    39: aload_1        
        //    40: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    43: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.checkCloseActionMenu:(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
        //    46: return         
        //    47: astore          9
        //    49: aload           9
        //    51: athrow         
        //    52: astore          10
        //    54: aload           10
        //    56: athrow         
        //    57: astore          11
        //    59: aload           11
        //    61: athrow         
        //    62: aload_1        
        //    63: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //    66: istore_3       
        //    67: aload_0        
        //    68: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    71: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //    74: bipush          7
        //    76: aaload         
        //    77: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    80: checkcast       Landroid/view/WindowManager;
        //    83: astore          4
        //    85: aload           4
        //    87: ifnull          112
        //    90: iload_3        
        //    91: ifeq            112
        //    94: aload_1        
        //    95: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //    98: ifnull          112
        //   101: aload           4
        //   103: aload_1        
        //   104: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   107: invokeinterface android/view/WindowManager.removeView:(Landroid/view/View;)V
        //   112: aload_1        
        //   113: iconst_0       
        //   114: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //   117: aload_1        
        //   118: iconst_0       
        //   119: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isHandled:Z
        //   122: aload_1        
        //   123: iconst_0       
        //   124: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //   127: iload_3        
        //   128: ifeq            145
        //   131: iload_2        
        //   132: ifeq            145
        //   135: aload_0        
        //   136: aload_1        
        //   137: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //   140: aload_1        
        //   141: aconst_null    
        //   142: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.callOnPanelClosed:(ILandroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/Menu;)V
        //   145: aload_1        
        //   146: aconst_null    
        //   147: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   150: aload_1        
        //   151: iconst_1       
        //   152: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshDecorView:Z
        //   155: aload_0        
        //   156: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   159: aload_1        
        //   160: if_acmpne       46
        //   163: aload_0        
        //   164: aconst_null    
        //   165: putfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   168: return         
        //   169: astore          7
        //   171: aload           7
        //   173: athrow         
        //   174: astore          8
        //   176: aload           8
        //   178: athrow         
        //   179: astore          5
        //   181: aload           5
        //   183: athrow         
        //   184: astore          6
        //   186: aload           6
        //   188: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     47     52     Ljava/lang/IllegalStateException;
        //  15     21     52     57     Ljava/lang/IllegalStateException;
        //  26     46     57     62     Ljava/lang/IllegalStateException;
        //  49     52     52     57     Ljava/lang/IllegalStateException;
        //  54     57     57     62     Ljava/lang/IllegalStateException;
        //  94     112    174    179    Ljava/lang/IllegalStateException;
        //  112    127    179    184    Ljava/lang/IllegalStateException;
        //  135    145    184    189    Ljava/lang/IllegalStateException;
        //  145    168    169    174    Ljava/lang/IllegalStateException;
        //  181    184    184    189    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    
    private void doInvalidatePanelMenu(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: iconst_1       
        //     3: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //     6: astore_2       
        //     7: aload_2        
        //     8: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    11: ifnull          56
        //    14: new             Landroid/os/Bundle;
        //    17: dup            
        //    18: invokespecial   android/os/Bundle.<init>:()V
        //    21: astore_3       
        //    22: aload_2        
        //    23: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    26: aload_3        
        //    27: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.saveActionViewStates:(Landroid/os/Bundle;)V
        //    30: aload_3        
        //    31: invokevirtual   android/os/Bundle.size:()I
        //    34: ifle            42
        //    37: aload_2        
        //    38: aload_3        
        //    39: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.frozenActionViewState:Landroid/os/Bundle;
        //    42: aload_2        
        //    43: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    46: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.stopDispatchingItemsChanged:()V
        //    49: aload_2        
        //    50: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    53: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.clear:()V
        //    56: aload_2        
        //    57: iconst_1       
        //    58: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshMenuContent:Z
        //    61: aload_2        
        //    62: iconst_1       
        //    63: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshDecorView:Z
        //    66: iload_1        
        //    67: bipush          8
        //    69: if_icmpeq       76
        //    72: iload_1        
        //    73: ifne            114
        //    76: aload_0        
        //    77: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    80: astore          7
        //    82: aload           7
        //    84: ifnull          114
        //    87: aload_0        
        //    88: iconst_0       
        //    89: iconst_0       
        //    90: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    93: astore          8
        //    95: aload           8
        //    97: ifnull          114
        //   100: aload           8
        //   102: iconst_0       
        //   103: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //   106: aload_0        
        //   107: aload           8
        //   109: aconst_null    
        //   110: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.preparePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)Z
        //   113: pop            
        //   114: return         
        //   115: astore          4
        //   117: aload           4
        //   119: athrow         
        //   120: astore          5
        //   122: aload           5
        //   124: athrow         
        //   125: astore          6
        //   127: aload           6
        //   129: athrow         
        //   130: astore          9
        //   132: aload           9
        //   134: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  22     42     115    120    Ljava/lang/IllegalStateException;
        //  56     66     120    125    Ljava/lang/IllegalStateException;
        //  76     82     125    130    Ljava/lang/IllegalStateException;
        //  100    114    130    135    Ljava/lang/IllegalStateException;
        //  122    125    125    130    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    private void ensureSubDecor() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecorInstalled:Z
        //     8: ifne            621
        //    11: aload_0        
        //    12: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    15: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    18: astore_2       
        //    19: aload_0        
        //    20: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowNoTitle:Z
        //    23: istore          6
        //    25: iload           6
        //    27: ifne            238
        //    30: aload_0        
        //    31: getfield        android/support/v7/app/AppCompatDelegateImplV7.mIsFloating:Z
        //    34: istore          26
        //    36: iload           26
        //    38: ifeq            60
        //    41: aload_0        
        //    42: aload_2        
        //    43: getstatic       android/support/v7/appcompat/R$layout.abc_dialog_title_material:I
        //    46: aconst_null    
        //    47: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
        //    50: checkcast       Landroid/view/ViewGroup;
        //    53: putfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //    56: iload_1        
        //    57: ifeq            334
        //    60: aload_0        
        //    61: getfield        android/support/v7/app/AppCompatDelegateImplV7.mHasActionBar:Z
        //    64: istore          27
        //    66: iload           27
        //    68: ifeq            334
        //    71: new             Landroid/util/TypedValue;
        //    74: dup            
        //    75: invokespecial   android/util/TypedValue.<init>:()V
        //    78: astore          28
        //    80: aload_0        
        //    81: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    84: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //    87: getstatic       android/support/v7/appcompat/R$attr.actionBarTheme:I
        //    90: aload           28
        //    92: iconst_1       
        //    93: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //    96: pop            
        //    97: aload           28
        //    99: getfield        android/util/TypedValue.resourceId:I
        //   102: ifeq            127
        //   105: new             Landroid/support/v7/internal/view/ContextThemeWrapper;
        //   108: dup            
        //   109: aload_0        
        //   110: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   113: aload           28
        //   115: getfield        android/util/TypedValue.resourceId:I
        //   118: invokespecial   android/support/v7/internal/view/ContextThemeWrapper.<init>:(Landroid/content/Context;I)V
        //   121: astore          30
        //   123: iload_1        
        //   124: ifeq            133
        //   127: aload_0        
        //   128: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   131: astore          30
        //   133: aload_0        
        //   134: aload           30
        //   136: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   139: getstatic       android/support/v7/appcompat/R$layout.abc_screen_toolbar:I
        //   142: aconst_null    
        //   143: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
        //   146: checkcast       Landroid/view/ViewGroup;
        //   149: putfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   152: aload_0        
        //   153: aload_0        
        //   154: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   157: getstatic       android/support/v7/appcompat/R$id.decor_content_parent:I
        //   160: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   163: checkcast       Landroid/support/v7/internal/widget/DecorContentParent;
        //   166: putfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   169: aload_0        
        //   170: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   173: aload_0        
        //   174: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getWindowCallback:()Landroid/view/Window$Callback;
        //   177: invokeinterface android/support/v7/internal/widget/DecorContentParent.setWindowCallback:(Landroid/view/Window$Callback;)V
        //   182: aload_0        
        //   183: getfield        android/support/v7/app/AppCompatDelegateImplV7.mOverlayActionBar:Z
        //   186: ifeq            200
        //   189: aload_0        
        //   190: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   193: bipush          9
        //   195: invokeinterface android/support/v7/internal/widget/DecorContentParent.initFeature:(I)V
        //   200: aload_0        
        //   201: getfield        android/support/v7/app/AppCompatDelegateImplV7.mFeatureProgress:Z
        //   204: ifeq            217
        //   207: aload_0        
        //   208: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   211: iconst_2       
        //   212: invokeinterface android/support/v7/internal/widget/DecorContentParent.initFeature:(I)V
        //   217: aload_0        
        //   218: getfield        android/support/v7/app/AppCompatDelegateImplV7.mFeatureIndeterminateProgress:Z
        //   221: ifeq            234
        //   224: aload_0        
        //   225: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   228: iconst_5       
        //   229: invokeinterface android/support/v7/internal/widget/DecorContentParent.initFeature:(I)V
        //   234: iload_1        
        //   235: ifeq            334
        //   238: aload_0        
        //   239: getfield        android/support/v7/app/AppCompatDelegateImplV7.mOverlayActionMode:Z
        //   242: istore          9
        //   244: iload           9
        //   246: ifeq            268
        //   249: aload_0        
        //   250: aload_2        
        //   251: getstatic       android/support/v7/appcompat/R$layout.abc_screen_simple_overlay_action_mode:I
        //   254: aconst_null    
        //   255: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
        //   258: checkcast       Landroid/view/ViewGroup;
        //   261: putfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   264: iload_1        
        //   265: ifeq            283
        //   268: aload_0        
        //   269: aload_2        
        //   270: getstatic       android/support/v7/appcompat/R$layout.abc_screen_simple:I
        //   273: aconst_null    
        //   274: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
        //   277: checkcast       Landroid/view/ViewGroup;
        //   280: putfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   283: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   286: istore          12
        //   288: iload           12
        //   290: bipush          21
        //   292: if_icmplt       314
        //   295: aload_0        
        //   296: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   299: new             Landroid/support/v7/app/AppCompatDelegateImplV7$2;
        //   302: dup            
        //   303: aload_0        
        //   304: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$2.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;)V
        //   307: invokestatic    android/support/v4/view/ViewCompat.setOnApplyWindowInsetsListener:(Landroid/view/View;Landroid/support/v4/view/OnApplyWindowInsetsListener;)V
        //   310: iload_1        
        //   311: ifeq            334
        //   314: aload_0        
        //   315: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   318: checkcast       Landroid/support/v7/internal/widget/FitWindowsViewGroup;
        //   321: new             Landroid/support/v7/app/AppCompatDelegateImplV7$3;
        //   324: dup            
        //   325: aload_0        
        //   326: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$3.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;)V
        //   329: invokeinterface android/support/v7/internal/widget/FitWindowsViewGroup.setOnFitSystemWindowsListener:(Landroid/support/v7/internal/widget/FitWindowsViewGroup$OnFitSystemWindowsListener;)V
        //   334: aload_0        
        //   335: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   338: ifnonnull       408
        //   341: new             Ljava/lang/IllegalArgumentException;
        //   344: dup            
        //   345: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //   348: bipush          8
        //   350: aaload         
        //   351: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   354: athrow         
        //   355: astore          13
        //   357: aload           13
        //   359: athrow         
        //   360: astore_3       
        //   361: aload_3        
        //   362: athrow         
        //   363: astore          4
        //   365: aload           4
        //   367: athrow         
        //   368: astore          5
        //   370: aload           5
        //   372: athrow         
        //   373: astore          31
        //   375: aload           31
        //   377: athrow         
        //   378: astore          32
        //   380: aload           32
        //   382: athrow         
        //   383: astore          33
        //   385: aload           33
        //   387: athrow         
        //   388: astore          7
        //   390: aload           7
        //   392: athrow         
        //   393: astore          8
        //   395: aload           8
        //   397: athrow         
        //   398: astore          10
        //   400: aload           10
        //   402: athrow         
        //   403: astore          11
        //   405: aload           11
        //   407: athrow         
        //   408: aload_0        
        //   409: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   412: ifnonnull       432
        //   415: aload_0        
        //   416: aload_0        
        //   417: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   420: getstatic       android/support/v7/appcompat/R$id.title:I
        //   423: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   426: checkcast       Landroid/widget/TextView;
        //   429: putfield        android/support/v7/app/AppCompatDelegateImplV7.mTitleView:Landroid/widget/TextView;
        //   432: aload_0        
        //   433: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   436: invokestatic    android/support/v7/internal/widget/ViewUtils.makeOptionalFitsSystemWindows:(Landroid/view/View;)V
        //   439: aload_0        
        //   440: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindow:Landroid/view/Window;
        //   443: ldc_w           16908290
        //   446: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   449: checkcast       Landroid/view/ViewGroup;
        //   452: astore          15
        //   454: aload_0        
        //   455: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   458: getstatic       android/support/v7/appcompat/R$id.action_bar_activity_content:I
        //   461: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   464: checkcast       Landroid/support/v7/internal/widget/ContentFrameLayout;
        //   467: astore          16
        //   469: aload           15
        //   471: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //   474: ifle            502
        //   477: aload           15
        //   479: iconst_0       
        //   480: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   483: astore          25
        //   485: aload           15
        //   487: iconst_0       
        //   488: invokevirtual   android/view/ViewGroup.removeViewAt:(I)V
        //   491: aload           16
        //   493: aload           25
        //   495: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.addView:(Landroid/view/View;)V
        //   498: iload_1        
        //   499: ifeq            469
        //   502: aload_0        
        //   503: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindow:Landroid/view/Window;
        //   506: aload_0        
        //   507: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   510: invokevirtual   android/view/Window.setContentView:(Landroid/view/View;)V
        //   513: aload           15
        //   515: iconst_m1      
        //   516: invokevirtual   android/view/ViewGroup.setId:(I)V
        //   519: aload           16
        //   521: ldc_w           16908290
        //   524: invokevirtual   android/support/v7/internal/widget/ContentFrameLayout.setId:(I)V
        //   527: aload           15
        //   529: instanceof      Landroid/widget/FrameLayout;
        //   532: ifeq            544
        //   535: aload           15
        //   537: checkcast       Landroid/widget/FrameLayout;
        //   540: aconst_null    
        //   541: invokevirtual   android/widget/FrameLayout.setForeground:(Landroid/graphics/drawable/Drawable;)V
        //   544: aload_0        
        //   545: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getTitle:()Ljava/lang/CharSequence;
        //   548: astore          18
        //   550: aload           18
        //   552: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   555: ifne            564
        //   558: aload_0        
        //   559: aload           18
        //   561: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.onTitleChanged:(Ljava/lang/CharSequence;)V
        //   564: aload_0        
        //   565: aload           16
        //   567: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.applyFixedSizeWindow:(Landroid/support/v7/internal/widget/ContentFrameLayout;)V
        //   570: aload_0        
        //   571: aload_0        
        //   572: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   575: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.onSubDecorInstalled:(Landroid/view/ViewGroup;)V
        //   578: aload_0        
        //   579: iconst_1       
        //   580: putfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecorInstalled:Z
        //   583: aload_0        
        //   584: iconst_0       
        //   585: iconst_0       
        //   586: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   589: astore          20
        //   591: aload_0        
        //   592: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //   595: istore          24
        //   597: iload           24
        //   599: ifne            621
        //   602: aload           20
        //   604: ifnull          615
        //   607: aload           20
        //   609: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   612: ifnonnull       621
        //   615: aload_0        
        //   616: bipush          8
        //   618: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.invalidatePanelMenu:(I)V
        //   621: return         
        //   622: astore          14
        //   624: aload           14
        //   626: athrow         
        //   627: astore          17
        //   629: aload           17
        //   631: athrow         
        //   632: astore          19
        //   634: aload           19
        //   636: athrow         
        //   637: astore          21
        //   639: aload           21
        //   641: athrow         
        //   642: astore          22
        //   644: aload           22
        //   646: athrow         
        //   647: astore          23
        //   649: aload           23
        //   651: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  19     25     360    363    Ljava/lang/IllegalStateException;
        //  30     36     363    368    Ljava/lang/IllegalStateException;
        //  41     56     368    373    Ljava/lang/IllegalStateException;
        //  60     66     368    373    Ljava/lang/IllegalStateException;
        //  133    200    373    378    Ljava/lang/IllegalStateException;
        //  200    217    378    383    Ljava/lang/IllegalStateException;
        //  217    234    383    388    Ljava/lang/IllegalStateException;
        //  238    244    388    393    Ljava/lang/IllegalStateException;
        //  249    264    393    398    Ljava/lang/IllegalStateException;
        //  268    283    393    398    Ljava/lang/IllegalStateException;
        //  283    288    398    403    Ljava/lang/IllegalStateException;
        //  295    310    403    408    Ljava/lang/IllegalStateException;
        //  314    334    403    408    Ljava/lang/IllegalStateException;
        //  334    355    355    360    Ljava/lang/IllegalStateException;
        //  361    363    363    368    Ljava/lang/IllegalStateException;
        //  365    368    368    373    Ljava/lang/IllegalStateException;
        //  390    393    393    398    Ljava/lang/IllegalStateException;
        //  400    403    403    408    Ljava/lang/IllegalStateException;
        //  408    432    622    627    Ljava/lang/IllegalStateException;
        //  502    544    627    632    Ljava/lang/IllegalStateException;
        //  550    564    632    637    Ljava/lang/IllegalStateException;
        //  591    597    637    647    Ljava/lang/IllegalStateException;
        //  607    615    647    652    Ljava/lang/IllegalStateException;
        //  615    621    647    652    Ljava/lang/IllegalStateException;
        //  639    642    642    647    Ljava/lang/IllegalStateException;
        //  644    647    647    652    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 304, Size: 304
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
    
    private AppCompatDelegateImplV7$PanelFeatureState findMenuPanel(final Menu menu) {
        final boolean a = ActionBar.a;
        final AppCompatDelegateImplV7$PanelFeatureState[] mPanels = this.mPanels;
        while (true) {
            if (mPanels != null) {
            Label_0020_Outer:
                while (true) {
                    while (true) {
                        int n = 0;
                    Label_0070:
                        while (true) {
                            AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState;
                            try {
                                final int length = mPanels.length;
                                n = 0;
                                if (n >= length) {
                                    break;
                                }
                                appCompatDelegateImplV7$PanelFeatureState = mPanels[n];
                                if (appCompatDelegateImplV7$PanelFeatureState == null) {
                                    break Label_0070;
                                }
                                final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState2 = appCompatDelegateImplV7$PanelFeatureState;
                                final MenuBuilder menu2 = appCompatDelegateImplV7$PanelFeatureState2.menu;
                                final MenuBuilder menu3 = menu2;
                                final Menu menu4 = menu;
                                if (menu3 == menu4) {
                                    return appCompatDelegateImplV7$PanelFeatureState;
                                }
                                break Label_0070;
                            }
                            catch (IllegalStateException ex) {
                                throw ex;
                            }
                            try {
                                final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState2 = appCompatDelegateImplV7$PanelFeatureState;
                                final MenuBuilder menu3;
                                final MenuBuilder menu2 = menu3 = appCompatDelegateImplV7$PanelFeatureState2.menu;
                                final Menu menu4 = menu;
                                if (menu3 == menu4) {
                                    return appCompatDelegateImplV7$PanelFeatureState;
                                }
                                break Label_0070;
                                final int length = 0;
                                continue Label_0020_Outer;
                            }
                            catch (IllegalStateException ex2) {
                                throw ex2;
                            }
                            break;
                        }
                        final int n2 = n + 1;
                        if (a) {
                            break;
                        }
                        n = n2;
                        continue;
                    }
                }
                return null;
            }
            continue;
        }
    }
    
    private AppCompatDelegateImplV7$PanelFeatureState getPanelState(final int p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPanels:[Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          19
        //     9: aload_3        
        //    10: arraylength    
        //    11: istore          9
        //    13: iload           9
        //    15: iload_1        
        //    16: if_icmpgt       50
        //    19: iload_1        
        //    20: iconst_1       
        //    21: iadd           
        //    22: anewarray       Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    25: astore          4
        //    27: aload_3        
        //    28: ifnull          41
        //    31: aload_3        
        //    32: iconst_0       
        //    33: aload           4
        //    35: iconst_0       
        //    36: aload_3        
        //    37: arraylength    
        //    38: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    41: aload_0        
        //    42: aload           4
        //    44: putfield        android/support/v7/app/AppCompatDelegateImplV7.mPanels:[Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    47: aload           4
        //    49: astore_3       
        //    50: aload_3        
        //    51: iload_1        
        //    52: aaload         
        //    53: astore          5
        //    55: aload           5
        //    57: ifnonnull       88
        //    60: new             Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    63: dup            
        //    64: iload_1        
        //    65: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.<init>:(I)V
        //    68: astore          6
        //    70: aload_3        
        //    71: iload_1        
        //    72: aload           6
        //    74: aastore        
        //    75: aload           6
        //    77: areturn        
        //    78: astore          8
        //    80: aload           8
        //    82: athrow         
        //    83: astore          7
        //    85: aload           7
        //    87: athrow         
        //    88: aload           5
        //    90: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      13     78     83     Ljava/lang/IllegalStateException;
        //  31     41     83     88     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    private boolean initializePanelContent(final AppCompatDelegateImplV7$PanelFeatureState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //     4: ifnull          20
        //     7: aload_1        
        //     8: aload_1        
        //     9: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //    12: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //    15: iconst_1       
        //    16: ireturn        
        //    17: astore_2       
        //    18: aload_2        
        //    19: athrow         
        //    20: aload_1        
        //    21: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    24: astore          4
        //    26: aload           4
        //    28: ifnonnull       36
        //    31: iconst_0       
        //    32: ireturn        
        //    33: astore_3       
        //    34: aload_3        
        //    35: athrow         
        //    36: aload_0        
        //    37: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPanelMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelMenuPresenterCallback;
        //    40: ifnonnull       56
        //    43: aload_0        
        //    44: new             Landroid/support/v7/app/AppCompatDelegateImplV7$PanelMenuPresenterCallback;
        //    47: dup            
        //    48: aload_0        
        //    49: aconst_null    
        //    50: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$PanelMenuPresenterCallback.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;Landroid/support/v7/app/AppCompatDelegateImplV7$1;)V
        //    53: putfield        android/support/v7/app/AppCompatDelegateImplV7.mPanelMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelMenuPresenterCallback;
        //    56: aload_1        
        //    57: aload_0        
        //    58: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPanelMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelMenuPresenterCallback;
        //    61: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.getListMenuView:(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;
        //    64: astore          6
        //    66: aload_1        
        //    67: aload           6
        //    69: checkcast       Landroid/view/View;
        //    72: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //    75: aload_1        
        //    76: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //    79: astore          8
        //    81: aload           8
        //    83: ifnull          102
        //    86: iconst_1       
        //    87: istore          9
        //    89: iload           9
        //    91: ireturn        
        //    92: astore          5
        //    94: aload           5
        //    96: athrow         
        //    97: astore          7
        //    99: aload           7
        //   101: athrow         
        //   102: iconst_0       
        //   103: istore          9
        //   105: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      15     17     20     Ljava/lang/IllegalStateException;
        //  20     26     33     36     Ljava/lang/IllegalStateException;
        //  36     56     92     97     Ljava/lang/IllegalStateException;
        //  66     81     97     102    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    private boolean initializePanelDecor(final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState) {
        appCompatDelegateImplV7$PanelFeatureState.setStyle(this.getActionBarThemedContext());
        appCompatDelegateImplV7$PanelFeatureState.decorView = (ViewGroup)new AppCompatDelegateImplV7$ListMenuDecorView(this, appCompatDelegateImplV7$PanelFeatureState.listPresenterContext);
        appCompatDelegateImplV7$PanelFeatureState.gravity = 81;
        return true;
    }
    
    private boolean initializePanelMenu(final AppCompatDelegateImplV7$PanelFeatureState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //     9: istore          5
        //    11: iload           5
        //    13: ifeq            25
        //    16: aload_1        
        //    17: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //    20: bipush          8
        //    22: if_icmpne       240
        //    25: aload_0        
        //    26: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    29: astore          6
        //    31: aload           6
        //    33: ifnull          240
        //    36: new             Landroid/util/TypedValue;
        //    39: dup            
        //    40: invokespecial   android/util/TypedValue.<init>:()V
        //    43: astore          7
        //    45: aload_2        
        //    46: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //    49: astore          8
        //    51: aload           8
        //    53: getstatic       android/support/v7/appcompat/R$attr.actionBarTheme:I
        //    56: aload           7
        //    58: iconst_1       
        //    59: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //    62: pop            
        //    63: aload           7
        //    65: getfield        android/util/TypedValue.resourceId:I
        //    68: ifeq            217
        //    71: aload_2        
        //    72: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    75: invokevirtual   android/content/res/Resources.newTheme:()Landroid/content/res/Resources$Theme;
        //    78: astore          11
        //    80: aload           11
        //    82: aload           8
        //    84: invokevirtual   android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
        //    87: aload           11
        //    89: aload           7
        //    91: getfield        android/util/TypedValue.resourceId:I
        //    94: iconst_1       
        //    95: invokevirtual   android/content/res/Resources$Theme.applyStyle:(IZ)V
        //    98: aload           11
        //   100: getstatic       android/support/v7/appcompat/R$attr.actionBarWidgetTheme:I
        //   103: aload           7
        //   105: iconst_1       
        //   106: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //   109: pop            
        //   110: aload           7
        //   112: getfield        android/util/TypedValue.resourceId:I
        //   115: istore          13
        //   117: iload           13
        //   119: ifeq            154
        //   122: aload           11
        //   124: ifnonnull       143
        //   127: aload_2        
        //   128: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   131: invokevirtual   android/content/res/Resources.newTheme:()Landroid/content/res/Resources$Theme;
        //   134: astore          11
        //   136: aload           11
        //   138: aload           8
        //   140: invokevirtual   android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
        //   143: aload           11
        //   145: aload           7
        //   147: getfield        android/util/TypedValue.resourceId:I
        //   150: iconst_1       
        //   151: invokevirtual   android/content/res/Resources$Theme.applyStyle:(IZ)V
        //   154: aload           11
        //   156: astore          14
        //   158: aload           14
        //   160: ifnull          240
        //   163: new             Landroid/support/v7/internal/view/ContextThemeWrapper;
        //   166: dup            
        //   167: aload_2        
        //   168: iconst_0       
        //   169: invokespecial   android/support/v7/internal/view/ContextThemeWrapper.<init>:(Landroid/content/Context;I)V
        //   172: astore          15
        //   174: aload           15
        //   176: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //   179: aload           14
        //   181: invokevirtual   android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
        //   184: new             Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   187: dup            
        //   188: aload           15
        //   190: invokespecial   android/support/v7/internal/view/menu/MenuBuilder.<init>:(Landroid/content/Context;)V
        //   193: astore          16
        //   195: aload           16
        //   197: aload_0        
        //   198: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.setCallback:(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V
        //   201: aload_1        
        //   202: aload           16
        //   204: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.setMenu:(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
        //   207: iconst_1       
        //   208: ireturn        
        //   209: astore_3       
        //   210: aload_3        
        //   211: athrow         
        //   212: astore          4
        //   214: aload           4
        //   216: athrow         
        //   217: aload           8
        //   219: getstatic       android/support/v7/appcompat/R$attr.actionBarWidgetTheme:I
        //   222: aload           7
        //   224: iconst_1       
        //   225: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //   228: pop            
        //   229: aconst_null    
        //   230: astore          11
        //   232: goto            110
        //   235: astore          12
        //   237: aload           12
        //   239: athrow         
        //   240: aload_2        
        //   241: astore          15
        //   243: goto            184
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      11     209    212    Ljava/lang/IllegalStateException;
        //  16     25     212    217    Ljava/lang/IllegalStateException;
        //  25     31     212    217    Ljava/lang/IllegalStateException;
        //  110    117    235    240    Ljava/lang/IllegalStateException;
        //  210    212    212    217    Ljava/lang/IllegalStateException;
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
    
    private void invalidatePanelMenu(final int n) {
        try {
            this.mInvalidatePanelMenuFeatures |= 1 << n;
            if (this.mInvalidatePanelMenuPosted) {
                return;
            }
            final AppCompatDelegateImplV7 appCompatDelegateImplV7 = this;
            final ViewGroup viewGroup = appCompatDelegateImplV7.mWindowDecor;
            if (viewGroup != null) {
                final AppCompatDelegateImplV7 appCompatDelegateImplV8 = this;
                final ViewGroup viewGroup2 = appCompatDelegateImplV8.mWindowDecor;
                final AppCompatDelegateImplV7 appCompatDelegateImplV9 = this;
                final Runnable runnable = appCompatDelegateImplV9.mInvalidatePanelMenuRunnable;
                ViewCompat.postOnAnimation((View)viewGroup2, runnable);
                final AppCompatDelegateImplV7 appCompatDelegateImplV10 = this;
                final boolean b = true;
                appCompatDelegateImplV10.mInvalidatePanelMenuPosted = b;
            }
            return;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final AppCompatDelegateImplV7 appCompatDelegateImplV7 = this;
            final ViewGroup viewGroup = appCompatDelegateImplV7.mWindowDecor;
            if (viewGroup != null) {
                final AppCompatDelegateImplV7 appCompatDelegateImplV8 = this;
                final ViewGroup viewGroup2 = appCompatDelegateImplV8.mWindowDecor;
                final AppCompatDelegateImplV7 appCompatDelegateImplV9 = this;
                final Runnable runnable = appCompatDelegateImplV9.mInvalidatePanelMenuRunnable;
                ViewCompat.postOnAnimation((View)viewGroup2, runnable);
                final AppCompatDelegateImplV7 appCompatDelegateImplV10 = this;
                final boolean b = true;
                appCompatDelegateImplV10.mInvalidatePanelMenuPosted = b;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    private boolean onKeyDownPanel(final int n, final KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            final AppCompatDelegateImplV7$PanelFeatureState panelState = this.getPanelState(n, true);
            try {
                if (!panelState.isOpen) {
                    return this.preparePanel(panelState, keyEvent);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    private void onKeyUpPanel(final int p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //     8: astore          5
        //    10: aload           5
        //    12: ifnull          21
        //    15: return         
        //    16: astore          4
        //    18: aload           4
        //    20: athrow         
        //    21: aload_0        
        //    22: iload_1        
        //    23: iconst_1       
        //    24: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    27: astore          6
        //    29: iload_1        
        //    30: ifne            336
        //    33: aload_0        
        //    34: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    37: astore          21
        //    39: aload           21
        //    41: ifnull          336
        //    44: aload_0        
        //    45: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    48: invokeinterface android/support/v7/internal/widget/DecorContentParent.canShowOverflowMenu:()Z
        //    53: istore          22
        //    55: iload           22
        //    57: ifeq            336
        //    60: aload_0        
        //    61: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    64: invokestatic    android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
        //    67: invokestatic    android/support/v4/view/ViewConfigurationCompat.hasPermanentMenuKey:(Landroid/view/ViewConfiguration;)Z
        //    70: istore          23
        //    72: iload           23
        //    74: ifne            336
        //    77: aload_0        
        //    78: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    81: invokeinterface android/support/v7/internal/widget/DecorContentParent.isOverflowMenuShowing:()Z
        //    86: istore          24
        //    88: iload           24
        //    90: ifne            129
        //    93: aload_0        
        //    94: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //    97: ifne            330
        //   100: aload_0        
        //   101: aload           6
        //   103: aload_2        
        //   104: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.preparePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)Z
        //   107: istore          25
        //   109: iload           25
        //   111: ifeq            330
        //   114: aload_0        
        //   115: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   118: invokeinterface android/support/v7/internal/widget/DecorContentParent.showOverflowMenu:()Z
        //   123: istore          7
        //   125: iload_3        
        //   126: ifeq            232
        //   129: aload_0        
        //   130: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   133: invokeinterface android/support/v7/internal/widget/DecorContentParent.hideOverflowMenu:()Z
        //   138: istore          7
        //   140: iload_3        
        //   141: ifeq            232
        //   144: aload           6
        //   146: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //   149: ifne            164
        //   152: aload           6
        //   154: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isHandled:Z
        //   157: istore          15
        //   159: iload           15
        //   161: ifeq            182
        //   164: aload           6
        //   166: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //   169: istore          7
        //   171: aload_0        
        //   172: aload           6
        //   174: iconst_1       
        //   175: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.closePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Z)V
        //   178: iload_3        
        //   179: ifeq            232
        //   182: aload           6
        //   184: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //   187: istore          13
        //   189: iload           13
        //   191: ifeq            232
        //   194: aload           6
        //   196: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshMenuContent:Z
        //   199: ifeq            324
        //   202: aload           6
        //   204: iconst_0       
        //   205: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //   208: aload_0        
        //   209: aload           6
        //   211: aload_2        
        //   212: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.preparePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)Z
        //   215: istore          14
        //   217: iload           14
        //   219: ifeq            232
        //   222: aload_0        
        //   223: aload           6
        //   225: aload_2        
        //   226: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.openPanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)V
        //   229: iconst_1       
        //   230: istore          7
        //   232: iload           7
        //   234: ifeq            15
        //   237: aload_0        
        //   238: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   241: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //   244: iconst_4       
        //   245: aaload         
        //   246: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   249: checkcast       Landroid/media/AudioManager;
        //   252: astore          10
        //   254: aload           10
        //   256: ifnull          269
        //   259: aload           10
        //   261: iconst_0       
        //   262: invokevirtual   android/media/AudioManager.playSoundEffect:(I)V
        //   265: iload_3        
        //   266: ifeq            15
        //   269: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //   272: iconst_2       
        //   273: aaload         
        //   274: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //   277: iconst_3       
        //   278: aaload         
        //   279: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   282: pop            
        //   283: return         
        //   284: astore          11
        //   286: aload           11
        //   288: athrow         
        //   289: astore          16
        //   291: aload           16
        //   293: athrow         
        //   294: astore          17
        //   296: aload           17
        //   298: athrow         
        //   299: astore          18
        //   301: aload           18
        //   303: athrow         
        //   304: astore          19
        //   306: aload           19
        //   308: athrow         
        //   309: astore          20
        //   311: aload           20
        //   313: athrow         
        //   314: astore          8
        //   316: aload           8
        //   318: athrow         
        //   319: astore          9
        //   321: aload           9
        //   323: athrow         
        //   324: iconst_1       
        //   325: istore          14
        //   327: goto            217
        //   330: iconst_0       
        //   331: istore          7
        //   333: goto            232
        //   336: iconst_0       
        //   337: istore          7
        //   339: goto            144
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     16     21     Ljava/lang/IllegalStateException;
        //  33     39     289    294    Ljava/lang/IllegalStateException;
        //  44     55     294    299    Ljava/lang/IllegalStateException;
        //  60     72     299    304    Ljava/lang/IllegalStateException;
        //  77     88     304    309    Ljava/lang/IllegalStateException;
        //  93     109    309    314    Ljava/lang/IllegalStateException;
        //  144    159    314    319    Ljava/lang/IllegalStateException;
        //  171    178    319    324    Ljava/lang/IllegalStateException;
        //  182    189    319    324    Ljava/lang/IllegalStateException;
        //  259    265    284    289    Ljava/lang/IllegalStateException;
        //  269    283    284    289    Ljava/lang/IllegalStateException;
        //  291    294    294    299    Ljava/lang/IllegalStateException;
        //  296    299    299    304    Ljava/lang/IllegalStateException;
        //  301    304    304    309    Ljava/lang/IllegalStateException;
        //  306    309    309    314    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 164, Size: 164
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
    
    private void openPanel(final AppCompatDelegateImplV7$PanelFeatureState p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            617
        //    11: aload_0        
        //    12: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //    15: ifeq            27
        //    18: return         
        //    19: astore_3       
        //    20: aload_3        
        //    21: athrow         
        //    22: astore          4
        //    24: aload           4
        //    26: athrow         
        //    27: aload_1        
        //    28: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //    31: ifne            99
        //    34: aload_0        
        //    35: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    38: astore          42
        //    40: aload           42
        //    42: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    45: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //    48: astore          43
        //    50: aload           43
        //    52: getfield        android/content/res/Configuration.screenLayout:I
        //    55: istore          45
        //    57: iload           45
        //    59: bipush          15
        //    61: iand           
        //    62: iconst_4       
        //    63: if_icmpne       145
        //    66: iconst_1       
        //    67: istore          46
        //    69: aload           42
        //    71: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    74: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //    77: istore          48
        //    79: iload           48
        //    81: bipush          11
        //    83: if_icmplt       156
        //    86: iconst_1       
        //    87: istore          49
        //    89: iload           46
        //    91: ifeq            99
        //    94: iload           49
        //    96: ifne            617
        //    99: aload_0        
        //   100: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getWindowCallback:()Landroid/view/Window$Callback;
        //   103: astore          6
        //   105: aload           6
        //   107: ifnull          162
        //   110: aload           6
        //   112: aload_1        
        //   113: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //   116: aload_1        
        //   117: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   120: invokeinterface android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
        //   125: ifne            162
        //   128: aload_0        
        //   129: aload_1        
        //   130: iconst_1       
        //   131: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.closePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Z)V
        //   134: return         
        //   135: astore          41
        //   137: aload           41
        //   139: athrow         
        //   140: astore          44
        //   142: aload           44
        //   144: athrow         
        //   145: iconst_0       
        //   146: istore          46
        //   148: goto            69
        //   151: astore          47
        //   153: aload           47
        //   155: athrow         
        //   156: iconst_0       
        //   157: istore          49
        //   159: goto            89
        //   162: aload_0        
        //   163: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   166: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //   169: bipush          6
        //   171: aaload         
        //   172: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   175: checkcast       Landroid/view/WindowManager;
        //   178: astore          7
        //   180: aload           7
        //   182: ifnull          617
        //   185: aload_0        
        //   186: aload_1        
        //   187: aload_2        
        //   188: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.preparePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)Z
        //   191: istore          9
        //   193: iload           9
        //   195: ifeq            617
        //   198: aload_1        
        //   199: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   202: astore          15
        //   204: aload           15
        //   206: ifnull          220
        //   209: aload_1        
        //   210: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshDecorView:Z
        //   213: istore          40
        //   215: iload           40
        //   217: ifeq            390
        //   220: aload_1        
        //   221: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   224: astore          16
        //   226: aload           16
        //   228: ifnonnull       532
        //   231: aload_0        
        //   232: aload_1        
        //   233: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.initializePanelDecor:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;)Z
        //   236: istore          38
        //   238: iload           38
        //   240: ifeq            617
        //   243: aload_1        
        //   244: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   247: astore          39
        //   249: aload           39
        //   251: ifnull          617
        //   254: aload_0        
        //   255: aload_1        
        //   256: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.initializePanelContent:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;)Z
        //   259: istore          22
        //   261: iload           22
        //   263: ifeq            617
        //   266: aload_1        
        //   267: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.hasPanelItems:()Z
        //   270: istore          23
        //   272: iload           23
        //   274: ifeq            617
        //   277: aload_1        
        //   278: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   281: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   284: astore          24
        //   286: aload           24
        //   288: ifnonnull       610
        //   291: new             Landroid/view/ViewGroup$LayoutParams;
        //   294: dup            
        //   295: bipush          -2
        //   297: bipush          -2
        //   299: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   302: astore          25
        //   304: aload_1        
        //   305: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.background:I
        //   308: istore          26
        //   310: aload_1        
        //   311: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   314: iload           26
        //   316: invokevirtual   android/view/ViewGroup.setBackgroundResource:(I)V
        //   319: aload_1        
        //   320: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   323: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   326: astore          27
        //   328: aload           27
        //   330: ifnull          353
        //   333: aload           27
        //   335: instanceof      Landroid/view/ViewGroup;
        //   338: ifeq            353
        //   341: aload           27
        //   343: checkcast       Landroid/view/ViewGroup;
        //   346: aload_1        
        //   347: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   350: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   353: aload_1        
        //   354: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   357: aload_1        
        //   358: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   361: aload           25
        //   363: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   366: aload_1        
        //   367: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   370: invokevirtual   android/view/View.hasFocus:()Z
        //   373: ifne            384
        //   376: aload_1        
        //   377: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.shownPanelView:Landroid/view/View;
        //   380: invokevirtual   android/view/View.requestFocus:()Z
        //   383: pop            
        //   384: getstatic       android/support/v7/app/ActionBar.a:Z
        //   387: ifeq            603
        //   390: aload_1        
        //   391: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //   394: astore          30
        //   396: aload           30
        //   398: ifnull          603
        //   401: aload_1        
        //   402: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //   405: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   408: astore          33
        //   410: aload           33
        //   412: ifnull          603
        //   415: aload           33
        //   417: getfield        android/view/ViewGroup$LayoutParams.width:I
        //   420: istore          35
        //   422: iload           35
        //   424: iconst_m1      
        //   425: if_icmpne       603
        //   428: iconst_m1      
        //   429: istore          31
        //   431: aload_1        
        //   432: iconst_0       
        //   433: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isHandled:Z
        //   436: new             Landroid/view/WindowManager$LayoutParams;
        //   439: dup            
        //   440: iload           31
        //   442: bipush          -2
        //   444: aload_1        
        //   445: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.x:I
        //   448: aload_1        
        //   449: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.y:I
        //   452: sipush          1002
        //   455: ldc_w           8519680
        //   458: bipush          -3
        //   460: invokespecial   android/view/WindowManager$LayoutParams.<init>:(IIIIIII)V
        //   463: astore          32
        //   465: aload           32
        //   467: aload_1        
        //   468: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.gravity:I
        //   471: putfield        android/view/WindowManager$LayoutParams.gravity:I
        //   474: aload           32
        //   476: aload_1        
        //   477: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.windowAnimations:I
        //   480: putfield        android/view/WindowManager$LayoutParams.windowAnimations:I
        //   483: aload           7
        //   485: aload_1        
        //   486: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   489: aload           32
        //   491: invokeinterface android/view/WindowManager.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   496: aload_1        
        //   497: iconst_1       
        //   498: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isOpen:Z
        //   501: return         
        //   502: astore          8
        //   504: aload           8
        //   506: athrow         
        //   507: astore          10
        //   509: aload           10
        //   511: athrow         
        //   512: astore          11
        //   514: aload           11
        //   516: athrow         
        //   517: astore          12
        //   519: aload           12
        //   521: athrow         
        //   522: astore          13
        //   524: aload           13
        //   526: athrow         
        //   527: astore          14
        //   529: aload           14
        //   531: athrow         
        //   532: aload_1        
        //   533: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshDecorView:Z
        //   536: istore          19
        //   538: iload           19
        //   540: ifeq            254
        //   543: aload_1        
        //   544: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   547: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //   550: ifle            254
        //   553: aload_1        
        //   554: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.decorView:Landroid/view/ViewGroup;
        //   557: invokevirtual   android/view/ViewGroup.removeAllViews:()V
        //   560: goto            254
        //   563: astore          18
        //   565: aload           18
        //   567: athrow         
        //   568: astore          17
        //   570: aload           17
        //   572: athrow         
        //   573: astore          20
        //   575: aload           20
        //   577: athrow         
        //   578: astore          21
        //   580: aload           21
        //   582: athrow         
        //   583: astore          37
        //   585: aload           37
        //   587: athrow         
        //   588: astore          28
        //   590: aload           28
        //   592: athrow         
        //   593: astore          29
        //   595: aload           29
        //   597: athrow         
        //   598: astore          34
        //   600: aload           34
        //   602: athrow         
        //   603: bipush          -2
        //   605: istore          31
        //   607: goto            431
        //   610: aload           24
        //   612: astore          25
        //   614: goto            304
        //   617: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      19     22     Ljava/lang/IllegalStateException;
        //  11     18     22     27     Ljava/lang/IllegalStateException;
        //  20     22     22     27     Ljava/lang/IllegalStateException;
        //  50     57     140    145    Ljava/lang/IllegalStateException;
        //  69     79     151    156    Ljava/lang/IllegalStateException;
        //  110    134    135    140    Ljava/lang/IllegalStateException;
        //  185    193    502    507    Ljava/lang/IllegalStateException;
        //  198    204    507    512    Ljava/lang/IllegalStateException;
        //  209    215    512    517    Ljava/lang/IllegalStateException;
        //  220    226    517    522    Ljava/lang/IllegalStateException;
        //  231    238    522    527    Ljava/lang/IllegalStateException;
        //  243    249    527    532    Ljava/lang/IllegalStateException;
        //  254    261    573    578    Ljava/lang/IllegalStateException;
        //  266    272    578    583    Ljava/lang/IllegalStateException;
        //  333    353    583    588    Ljava/lang/IllegalStateException;
        //  353    384    588    593    Ljava/lang/IllegalStateException;
        //  384    390    593    598    Ljava/lang/IllegalStateException;
        //  390    396    593    598    Ljava/lang/IllegalStateException;
        //  415    422    598    603    Ljava/lang/IllegalStateException;
        //  509    512    512    517    Ljava/lang/IllegalStateException;
        //  514    517    517    522    Ljava/lang/IllegalStateException;
        //  519    522    522    527    Ljava/lang/IllegalStateException;
        //  524    527    527    532    Ljava/lang/IllegalStateException;
        //  532    538    568    573    Ljava/lang/IllegalStateException;
        //  543    560    563    568    Ljava/lang/IllegalStateException;
        //  570    573    563    568    Ljava/lang/IllegalStateException;
        //  575    578    578    583    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 297, Size: 297
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
    
    private boolean performPanelShortcut(final AppCompatDelegateImplV7$PanelFeatureState p0, final int p1, final KeyEvent p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_3        
        //     1: invokevirtual   android/view/KeyEvent.isSystem:()Z
        //     4: istore          6
        //     6: iconst_0       
        //     7: istore          7
        //     9: iload           6
        //    11: ifeq            22
        //    14: iload           7
        //    16: ireturn        
        //    17: astore          5
        //    19: aload           5
        //    21: athrow         
        //    22: aload_1        
        //    23: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //    26: istore          10
        //    28: iload           10
        //    30: ifne            49
        //    33: aload_0        
        //    34: aload_1        
        //    35: aload_3        
        //    36: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.preparePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)Z
        //    39: istore          13
        //    41: iconst_0       
        //    42: istore          7
        //    44: iload           13
        //    46: ifeq            76
        //    49: aload_1        
        //    50: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    53: astore          11
        //    55: iconst_0       
        //    56: istore          7
        //    58: aload           11
        //    60: ifnull          76
        //    63: aload_1        
        //    64: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    67: iload_2        
        //    68: aload_3        
        //    69: iload           4
        //    71: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.performShortcut:(ILandroid/view/KeyEvent;I)Z
        //    74: istore          7
        //    76: iload           7
        //    78: ifeq            14
        //    81: iload           4
        //    83: iconst_1       
        //    84: iand           
        //    85: ifne            14
        //    88: aload_0        
        //    89: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    92: ifnonnull       14
        //    95: aload_0        
        //    96: aload_1        
        //    97: iconst_1       
        //    98: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.closePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Z)V
        //   101: iload           7
        //   103: ireturn        
        //   104: astore          12
        //   106: aload           12
        //   108: athrow         
        //   109: astore          8
        //   111: aload           8
        //   113: athrow         
        //   114: astore          9
        //   116: aload           9
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      17     22     Ljava/lang/IllegalStateException;
        //  22     28     109    114    Ljava/lang/IllegalStateException;
        //  33     41     114    119    Ljava/lang/IllegalStateException;
        //  49     55     114    119    Ljava/lang/IllegalStateException;
        //  88     101    104    109    Ljava/lang/IllegalStateException;
        //  111    114    114    119    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    private boolean preparePanel(final AppCompatDelegateImplV7$PanelFeatureState p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            16
        //    11: iconst_0       
        //    12: ireturn        
        //    13: astore_3       
        //    14: aload_3        
        //    15: athrow         
        //    16: aload_1        
        //    17: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifeq            34
        //    27: iconst_1       
        //    28: ireturn        
        //    29: astore          5
        //    31: aload           5
        //    33: athrow         
        //    34: aload_0        
        //    35: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    38: astore          9
        //    40: aload           9
        //    42: ifnull          62
        //    45: aload_0        
        //    46: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    49: aload_1        
        //    50: if_acmpeq       62
        //    53: aload_0        
        //    54: aload_0        
        //    55: getfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //    58: iconst_0       
        //    59: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.closePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Z)V
        //    62: aload_0        
        //    63: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getWindowCallback:()Landroid/view/Window$Callback;
        //    66: astore          10
        //    68: aload           10
        //    70: ifnull          88
        //    73: aload_1        
        //    74: aload           10
        //    76: aload_1        
        //    77: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //    80: invokeinterface android/view/Window$Callback.onCreatePanelView:(I)Landroid/view/View;
        //    85: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //    88: aload_1        
        //    89: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //    92: istore          13
        //    94: iload           13
        //    96: ifeq            112
        //    99: aload_1        
        //   100: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //   103: istore          47
        //   105: iload           47
        //   107: bipush          8
        //   109: if_icmpne       348
        //   112: iconst_1       
        //   113: istore          14
        //   115: iload           14
        //   117: ifeq            136
        //   120: aload_0        
        //   121: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   124: ifnull          136
        //   127: aload_0        
        //   128: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   131: invokeinterface android/support/v7/internal/widget/DecorContentParent.setMenuPrepared:()V
        //   136: aload_1        
        //   137: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //   140: astore          21
        //   142: aload           21
        //   144: ifnonnull       583
        //   147: aload_1        
        //   148: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   151: astore          22
        //   153: aload           22
        //   155: ifnull          169
        //   158: aload_1        
        //   159: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshMenuContent:Z
        //   162: istore          45
        //   164: iload           45
        //   166: ifeq            414
        //   169: aload_1        
        //   170: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   173: astore          23
        //   175: aload           23
        //   177: ifnonnull       203
        //   180: aload_0        
        //   181: aload_1        
        //   182: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.initializePanelMenu:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;)Z
        //   185: istore          43
        //   187: iload           43
        //   189: ifeq            11
        //   192: aload_1        
        //   193: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   196: astore          44
        //   198: aload           44
        //   200: ifnull          11
        //   203: iload           14
        //   205: ifeq            256
        //   208: aload_0        
        //   209: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   212: astore          42
        //   214: aload           42
        //   216: ifnull          256
        //   219: aload_0        
        //   220: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   223: ifnonnull       239
        //   226: aload_0        
        //   227: new             Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   230: dup            
        //   231: aload_0        
        //   232: aconst_null    
        //   233: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;Landroid/support/v7/app/AppCompatDelegateImplV7$1;)V
        //   236: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   239: aload_0        
        //   240: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   243: aload_1        
        //   244: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   247: aload_0        
        //   248: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   251: invokeinterface android/support/v7/internal/widget/DecorContentParent.setMenu:(Landroid/view/Menu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
        //   256: aload_1        
        //   257: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   260: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.stopDispatchingItemsChanged:()V
        //   263: aload           10
        //   265: aload_1        
        //   266: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.featureId:I
        //   269: aload_1        
        //   270: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   273: invokeinterface android/view/Window$Callback.onCreatePanelMenu:(ILandroid/view/Menu;)Z
        //   278: istore          27
        //   280: iload           27
        //   282: ifne            409
        //   285: aload_1        
        //   286: aconst_null    
        //   287: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.setMenu:(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
        //   290: iload           14
        //   292: ifeq            11
        //   295: aload_0        
        //   296: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   299: ifnull          11
        //   302: aload_0        
        //   303: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   306: aconst_null    
        //   307: aload_0        
        //   308: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   311: invokeinterface android/support/v7/internal/widget/DecorContentParent.setMenu:(Landroid/view/Menu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
        //   316: iconst_0       
        //   317: ireturn        
        //   318: astore          26
        //   320: aload           26
        //   322: athrow         
        //   323: astore          7
        //   325: aload           7
        //   327: athrow         
        //   328: astore          8
        //   330: aload           8
        //   332: athrow         
        //   333: astore          48
        //   335: aload           48
        //   337: athrow         
        //   338: astore          11
        //   340: aload           11
        //   342: athrow         
        //   343: astore          12
        //   345: aload           12
        //   347: athrow         
        //   348: iconst_0       
        //   349: istore          14
        //   351: goto            115
        //   354: astore          46
        //   356: aload           46
        //   358: athrow         
        //   359: astore          15
        //   361: aload           15
        //   363: athrow         
        //   364: astore          16
        //   366: aload           16
        //   368: athrow         
        //   369: astore          17
        //   371: aload           17
        //   373: athrow         
        //   374: astore          18
        //   376: aload           18
        //   378: athrow         
        //   379: astore          19
        //   381: aload           19
        //   383: athrow         
        //   384: astore          20
        //   386: aload           20
        //   388: athrow         
        //   389: astore          40
        //   391: aload           40
        //   393: athrow         
        //   394: astore          41
        //   396: aload           41
        //   398: athrow         
        //   399: astore          24
        //   401: aload           24
        //   403: athrow         
        //   404: astore          25
        //   406: aload           25
        //   408: athrow         
        //   409: aload_1        
        //   410: iconst_0       
        //   411: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshMenuContent:Z
        //   414: aload_1        
        //   415: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   418: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.stopDispatchingItemsChanged:()V
        //   421: aload_1        
        //   422: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.frozenActionViewState:Landroid/os/Bundle;
        //   425: ifnull          444
        //   428: aload_1        
        //   429: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   432: aload_1        
        //   433: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.frozenActionViewState:Landroid/os/Bundle;
        //   436: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.restoreActionViewStates:(Landroid/os/Bundle;)V
        //   439: aload_1        
        //   440: aconst_null    
        //   441: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.frozenActionViewState:Landroid/os/Bundle;
        //   444: aload           10
        //   446: iconst_0       
        //   447: aload_1        
        //   448: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //   451: aload_1        
        //   452: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   455: invokeinterface android/view/Window$Callback.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
        //   460: istore          32
        //   462: iload           32
        //   464: ifne            522
        //   467: iload           14
        //   469: ifeq            493
        //   472: aload_0        
        //   473: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   476: ifnull          493
        //   479: aload_0        
        //   480: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   483: aconst_null    
        //   484: aload_0        
        //   485: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMenuPresenterCallback:Landroid/support/v7/app/AppCompatDelegateImplV7$ActionMenuPresenterCallback;
        //   488: invokeinterface android/support/v7/internal/widget/DecorContentParent.setMenu:(Landroid/view/Menu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
        //   493: aload_1        
        //   494: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   497: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.startDispatchingItemsChanged:()V
        //   500: iconst_0       
        //   501: ireturn        
        //   502: astore          28
        //   504: aload           28
        //   506: athrow         
        //   507: astore          29
        //   509: aload           29
        //   511: athrow         
        //   512: astore          30
        //   514: aload           30
        //   516: athrow         
        //   517: astore          31
        //   519: aload           31
        //   521: athrow         
        //   522: aload_2        
        //   523: ifnull          605
        //   526: aload_2        
        //   527: invokevirtual   android/view/KeyEvent.getDeviceId:()I
        //   530: istore          39
        //   532: iload           39
        //   534: istore          33
        //   536: iload           33
        //   538: invokestatic    android/view/KeyCharacterMap.load:(I)Landroid/view/KeyCharacterMap;
        //   541: astore          34
        //   543: aload           34
        //   545: invokevirtual   android/view/KeyCharacterMap.getKeyboardType:()I
        //   548: istore          36
        //   550: iload           36
        //   552: iconst_1       
        //   553: if_icmpeq       616
        //   556: iconst_1       
        //   557: istore          37
        //   559: aload_1        
        //   560: iload           37
        //   562: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.qwertyMode:Z
        //   565: aload_1        
        //   566: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   569: aload_1        
        //   570: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.qwertyMode:Z
        //   573: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.setQwertyMode:(Z)V
        //   576: aload_1        
        //   577: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   580: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.startDispatchingItemsChanged:()V
        //   583: aload_1        
        //   584: iconst_1       
        //   585: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isPrepared:Z
        //   588: aload_1        
        //   589: iconst_0       
        //   590: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.isHandled:Z
        //   593: aload_0        
        //   594: aload_1        
        //   595: putfield        android/support/v7/app/AppCompatDelegateImplV7.mPreparedPanel:Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   598: iconst_1       
        //   599: ireturn        
        //   600: astore          38
        //   602: aload           38
        //   604: athrow         
        //   605: iconst_m1      
        //   606: istore          33
        //   608: goto            536
        //   611: astore          35
        //   613: aload           35
        //   615: athrow         
        //   616: iconst_0       
        //   617: istore          37
        //   619: goto            559
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      13     16     Ljava/lang/IllegalStateException;
        //  16     22     29     34     Ljava/lang/IllegalStateException;
        //  34     40     323    328    Ljava/lang/IllegalStateException;
        //  45     62     328    333    Ljava/lang/IllegalStateException;
        //  73     88     333    338    Ljava/lang/IllegalStateException;
        //  88     94     338    343    Ljava/lang/IllegalStateException;
        //  99     105    343    348    Ljava/lang/IllegalStateException;
        //  120    136    354    359    Ljava/lang/IllegalStateException;
        //  136    142    359    364    Ljava/lang/IllegalStateException;
        //  147    153    364    369    Ljava/lang/IllegalStateException;
        //  158    164    369    374    Ljava/lang/IllegalStateException;
        //  169    175    374    379    Ljava/lang/IllegalStateException;
        //  180    187    379    384    Ljava/lang/IllegalStateException;
        //  192    198    384    389    Ljava/lang/IllegalStateException;
        //  208    214    389    394    Ljava/lang/IllegalStateException;
        //  219    239    394    399    Ljava/lang/IllegalStateException;
        //  256    280    399    404    Ljava/lang/IllegalStateException;
        //  285    290    404    409    Ljava/lang/IllegalStateException;
        //  295    316    318    323    Ljava/lang/IllegalStateException;
        //  325    328    328    333    Ljava/lang/IllegalStateException;
        //  340    343    343    348    Ljava/lang/IllegalStateException;
        //  361    364    364    369    Ljava/lang/IllegalStateException;
        //  366    369    369    374    Ljava/lang/IllegalStateException;
        //  371    374    374    379    Ljava/lang/IllegalStateException;
        //  376    379    379    384    Ljava/lang/IllegalStateException;
        //  381    384    384    389    Ljava/lang/IllegalStateException;
        //  391    394    394    399    Ljava/lang/IllegalStateException;
        //  401    404    404    409    Ljava/lang/IllegalStateException;
        //  406    409    318    323    Ljava/lang/IllegalStateException;
        //  414    444    502    507    Ljava/lang/IllegalStateException;
        //  444    462    507    517    Ljava/lang/IllegalStateException;
        //  472    493    517    522    Ljava/lang/IllegalStateException;
        //  509    512    512    517    Ljava/lang/IllegalStateException;
        //  514    517    517    522    Ljava/lang/IllegalStateException;
        //  526    532    600    605    Ljava/lang/IllegalStateException;
        //  543    550    611    616    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 310, Size: 310
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
    
    private void reopenMenu(final MenuBuilder p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //     4: astore          6
        //     6: aload           6
        //     8: ifnull          326
        //    11: aload_0        
        //    12: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    15: invokeinterface android/support/v7/internal/widget/DecorContentParent.canShowOverflowMenu:()Z
        //    20: istore          8
        //    22: iload           8
        //    24: ifeq            326
        //    27: aload_0        
        //    28: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    31: invokestatic    android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
        //    34: invokestatic    android/support/v4/view/ViewConfigurationCompat.hasPermanentMenuKey:(Landroid/view/ViewConfiguration;)Z
        //    37: ifeq            56
        //    40: aload_0        
        //    41: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    44: invokeinterface android/support/v7/internal/widget/DecorContentParent.isOverflowMenuShowPending:()Z
        //    49: istore          31
        //    51: iload           31
        //    53: ifeq            326
        //    56: aload_0        
        //    57: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getWindowCallback:()Landroid/view/Window$Callback;
        //    60: astore          9
        //    62: aload_0        
        //    63: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    66: invokeinterface android/support/v7/internal/widget/DecorContentParent.isOverflowMenuShowing:()Z
        //    71: istore          16
        //    73: iload           16
        //    75: ifeq            82
        //    78: iload_2        
        //    79: ifne            223
        //    82: aload           9
        //    84: ifnull          262
        //    87: aload_0        
        //    88: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //    91: istore          17
        //    93: iload           17
        //    95: ifne            262
        //    98: aload_0        
        //    99: getfield        android/support/v7/app/AppCompatDelegateImplV7.mInvalidatePanelMenuPosted:Z
        //   102: istore          18
        //   104: iload           18
        //   106: ifeq            139
        //   109: iconst_1       
        //   110: aload_0        
        //   111: getfield        android/support/v7/app/AppCompatDelegateImplV7.mInvalidatePanelMenuFeatures:I
        //   114: iand           
        //   115: ifeq            139
        //   118: aload_0        
        //   119: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //   122: aload_0        
        //   123: getfield        android/support/v7/app/AppCompatDelegateImplV7.mInvalidatePanelMenuRunnable:Ljava/lang/Runnable;
        //   126: invokevirtual   android/view/ViewGroup.removeCallbacks:(Ljava/lang/Runnable;)Z
        //   129: pop            
        //   130: aload_0        
        //   131: getfield        android/support/v7/app/AppCompatDelegateImplV7.mInvalidatePanelMenuRunnable:Ljava/lang/Runnable;
        //   134: invokeinterface java/lang/Runnable.run:()V
        //   139: aload_0        
        //   140: iconst_0       
        //   141: iconst_1       
        //   142: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   145: astore          19
        //   147: aload           19
        //   149: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   152: astore          23
        //   154: aload           23
        //   156: ifnull          217
        //   159: aload           19
        //   161: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshMenuContent:Z
        //   164: istore          27
        //   166: iload           27
        //   168: ifne            217
        //   171: aload           9
        //   173: iconst_0       
        //   174: aload           19
        //   176: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.createdPanelView:Landroid/view/View;
        //   179: aload           19
        //   181: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   184: invokeinterface android/view/Window$Callback.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
        //   189: ifeq            217
        //   192: aload           9
        //   194: bipush          8
        //   196: aload           19
        //   198: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   201: invokeinterface android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
        //   206: pop            
        //   207: aload_0        
        //   208: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   211: invokeinterface android/support/v7/internal/widget/DecorContentParent.showOverflowMenu:()Z
        //   216: pop            
        //   217: getstatic       android/support/v7/app/ActionBar.a:Z
        //   220: ifeq            262
        //   223: aload_0        
        //   224: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //   227: invokeinterface android/support/v7/internal/widget/DecorContentParent.hideOverflowMenu:()Z
        //   232: pop            
        //   233: aload_0        
        //   234: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.isDestroyed:()Z
        //   237: istore          26
        //   239: iload           26
        //   241: ifne            262
        //   244: aload           9
        //   246: bipush          8
        //   248: aload_0        
        //   249: iconst_0       
        //   250: iconst_1       
        //   251: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   254: getfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //   257: invokeinterface android/view/Window$Callback.onPanelClosed:(ILandroid/view/Menu;)V
        //   262: return         
        //   263: astore_3       
        //   264: aload_3        
        //   265: athrow         
        //   266: astore          4
        //   268: aload           4
        //   270: athrow         
        //   271: astore          5
        //   273: aload           5
        //   275: athrow         
        //   276: astore          10
        //   278: aload           10
        //   280: athrow         
        //   281: astore          11
        //   283: aload           11
        //   285: athrow         
        //   286: astore          12
        //   288: aload           12
        //   290: athrow         
        //   291: astore          13
        //   293: aload           13
        //   295: athrow         
        //   296: astore          14
        //   298: aload           14
        //   300: athrow         
        //   301: astore          15
        //   303: aload           15
        //   305: athrow         
        //   306: astore          20
        //   308: aload           20
        //   310: athrow         
        //   311: astore          21
        //   313: aload           21
        //   315: athrow         
        //   316: astore          22
        //   318: aload           22
        //   320: athrow         
        //   321: astore          24
        //   323: aload           24
        //   325: athrow         
        //   326: aload_0        
        //   327: iconst_0       
        //   328: iconst_1       
        //   329: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.getPanelState:(IZ)Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;
        //   332: astore          7
        //   334: aload           7
        //   336: iconst_1       
        //   337: putfield        android/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState.refreshDecorView:Z
        //   340: aload_0        
        //   341: aload           7
        //   343: iconst_0       
        //   344: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.closePanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Z)V
        //   347: aload_0        
        //   348: aload           7
        //   350: aconst_null    
        //   351: invokespecial   android/support/v7/app/AppCompatDelegateImplV7.openPanel:(Landroid/support/v7/app/AppCompatDelegateImplV7$PanelFeatureState;Landroid/view/KeyEvent;)V
        //   354: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      263    266    Ljava/lang/IllegalStateException;
        //  11     22     266    271    Ljava/lang/IllegalStateException;
        //  27     51     271    276    Ljava/lang/IllegalStateException;
        //  62     73     276    291    Ljava/lang/IllegalStateException;
        //  87     93     291    296    Ljava/lang/IllegalStateException;
        //  98     104    296    301    Ljava/lang/IllegalStateException;
        //  109    139    301    306    Ljava/lang/IllegalStateException;
        //  147    154    306    311    Ljava/lang/IllegalStateException;
        //  159    166    311    316    Ljava/lang/IllegalStateException;
        //  171    217    316    321    Ljava/lang/IllegalStateException;
        //  217    223    321    326    Ljava/lang/IllegalStateException;
        //  223    239    321    326    Ljava/lang/IllegalStateException;
        //  264    266    266    271    Ljava/lang/IllegalStateException;
        //  268    271    271    276    Ljava/lang/IllegalStateException;
        //  278    281    281    291    Ljava/lang/IllegalStateException;
        //  283    286    286    291    Ljava/lang/IllegalStateException;
        //  288    291    291    296    Ljava/lang/IllegalStateException;
        //  293    296    296    301    Ljava/lang/IllegalStateException;
        //  298    301    301    306    Ljava/lang/IllegalStateException;
        //  308    311    311    316    Ljava/lang/IllegalStateException;
        //  313    316    316    321    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 168, Size: 168
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
    
    private void throwFeatureRequestIfSubDecorInstalled() {
        try {
            if (this.mSubDecorInstalled) {
                throw new AndroidRuntimeException(AppCompatDelegateImplV7.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private int updateStatusGuard(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v7/app/ActionBar.a:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    10: ifnull          495
        //    13: aload_0        
        //    14: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    17: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    20: instanceof      Landroid/view/ViewGroup$MarginLayoutParams;
        //    23: istore          11
        //    25: iload           11
        //    27: ifeq            495
        //    30: aload_0        
        //    31: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    34: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    37: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //    40: astore          12
        //    42: aload_0        
        //    43: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    46: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.isShown:()Z
        //    49: istore          15
        //    51: iload           15
        //    53: ifeq            486
        //    56: aload_0        
        //    57: getfield        android/support/v7/app/AppCompatDelegateImplV7.mTempRect1:Landroid/graphics/Rect;
        //    60: ifnonnull       85
        //    63: aload_0        
        //    64: new             Landroid/graphics/Rect;
        //    67: dup            
        //    68: invokespecial   android/graphics/Rect.<init>:()V
        //    71: putfield        android/support/v7/app/AppCompatDelegateImplV7.mTempRect1:Landroid/graphics/Rect;
        //    74: aload_0        
        //    75: new             Landroid/graphics/Rect;
        //    78: dup            
        //    79: invokespecial   android/graphics/Rect.<init>:()V
        //    82: putfield        android/support/v7/app/AppCompatDelegateImplV7.mTempRect2:Landroid/graphics/Rect;
        //    85: aload_0        
        //    86: getfield        android/support/v7/app/AppCompatDelegateImplV7.mTempRect1:Landroid/graphics/Rect;
        //    89: astore          22
        //    91: aload_0        
        //    92: getfield        android/support/v7/app/AppCompatDelegateImplV7.mTempRect2:Landroid/graphics/Rect;
        //    95: astore          23
        //    97: aload           22
        //    99: iconst_0       
        //   100: iload_1        
        //   101: iconst_0       
        //   102: iconst_0       
        //   103: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   106: aload_0        
        //   107: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   110: aload           22
        //   112: aload           23
        //   114: invokestatic    android/support/v7/internal/widget/ViewUtils.computeFitSystemWindows:(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
        //   117: aload           23
        //   119: getfield        android/graphics/Rect.top:I
        //   122: istore          25
        //   124: iload           25
        //   126: ifne            392
        //   129: iload_1        
        //   130: istore          26
        //   132: aload           12
        //   134: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   137: iload           26
        //   139: if_icmpeq       480
        //   142: aload           12
        //   144: iload_1        
        //   145: putfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   148: aload_0        
        //   149: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   152: ifnonnull       215
        //   155: aload_0        
        //   156: new             Landroid/view/View;
        //   159: dup            
        //   160: aload_0        
        //   161: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   164: invokespecial   android/view/View.<init>:(Landroid/content/Context;)V
        //   167: putfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   170: aload_0        
        //   171: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   174: aload_0        
        //   175: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   178: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   181: getstatic       android/support/v7/appcompat/R$color.abc_input_method_navigation_guard:I
        //   184: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   187: invokevirtual   android/view/View.setBackgroundColor:(I)V
        //   190: aload_0        
        //   191: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   194: aload_0        
        //   195: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   198: iconst_m1      
        //   199: new             Landroid/view/ViewGroup$LayoutParams;
        //   202: dup            
        //   203: iconst_m1      
        //   204: iload_1        
        //   205: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   208: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
        //   211: iload_3        
        //   212: ifeq            474
        //   215: aload_0        
        //   216: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   219: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   222: astore          34
        //   224: aload           34
        //   226: getfield        android/view/ViewGroup$LayoutParams.height:I
        //   229: iload_1        
        //   230: if_icmpeq       474
        //   233: aload           34
        //   235: iload_1        
        //   236: putfield        android/view/ViewGroup$LayoutParams.height:I
        //   239: aload_0        
        //   240: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   243: aload           34
        //   245: invokevirtual   android/view/View.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   248: iload_2        
        //   249: istore          27
        //   251: aload_0        
        //   252: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   255: astore          29
        //   257: aload           29
        //   259: ifnull          413
        //   262: iload_2        
        //   263: istore          20
        //   265: aload_0        
        //   266: getfield        android/support/v7/app/AppCompatDelegateImplV7.mOverlayActionMode:Z
        //   269: istore          31
        //   271: iload           31
        //   273: ifne            283
        //   276: iload           20
        //   278: ifeq            283
        //   281: iconst_0       
        //   282: istore_1       
        //   283: iload_3        
        //   284: ifeq            468
        //   287: iload           27
        //   289: istore          32
        //   291: iload           20
        //   293: istore          17
        //   295: iload           32
        //   297: istore          16
        //   299: aload           12
        //   301: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   304: istore          19
        //   306: iload           19
        //   308: ifeq            458
        //   311: aload           12
        //   313: iconst_0       
        //   314: putfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   317: iload           17
        //   319: istore          20
        //   321: iload_2        
        //   322: ifeq            451
        //   325: aload_0        
        //   326: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   329: aload           12
        //   331: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   334: iload           20
        //   336: istore          5
        //   338: aload_0        
        //   339: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   342: astore          8
        //   344: aload           8
        //   346: ifnull          370
        //   349: aload_0        
        //   350: getfield        android/support/v7/app/AppCompatDelegateImplV7.mStatusGuard:Landroid/view/View;
        //   353: astore          9
        //   355: iconst_0       
        //   356: istore          10
        //   358: iload           5
        //   360: ifeq            444
        //   363: aload           9
        //   365: iload           10
        //   367: invokevirtual   android/view/View.setVisibility:(I)V
        //   370: iload_1        
        //   371: ireturn        
        //   372: astore          4
        //   374: aload           4
        //   376: athrow         
        //   377: astore          13
        //   379: aload           13
        //   381: athrow         
        //   382: astore          14
        //   384: aload           14
        //   386: athrow         
        //   387: astore          24
        //   389: aload           24
        //   391: athrow         
        //   392: iconst_0       
        //   393: istore          26
        //   395: goto            132
        //   398: astore          33
        //   400: aload           33
        //   402: athrow         
        //   403: astore          35
        //   405: aload           35
        //   407: athrow         
        //   408: astore          28
        //   410: aload           28
        //   412: athrow         
        //   413: iconst_0       
        //   414: istore          20
        //   416: goto            265
        //   419: astore          30
        //   421: aload           30
        //   423: athrow         
        //   424: astore          18
        //   426: aload           18
        //   428: athrow         
        //   429: astore          21
        //   431: aload           21
        //   433: athrow         
        //   434: astore          6
        //   436: aload           6
        //   438: athrow         
        //   439: astore          7
        //   441: aload           7
        //   443: athrow         
        //   444: bipush          8
        //   446: istore          10
        //   448: goto            363
        //   451: iload           20
        //   453: istore          5
        //   455: goto            338
        //   458: iload           16
        //   460: istore_2       
        //   461: iload           17
        //   463: istore          20
        //   465: goto            321
        //   468: iload           27
        //   470: istore_2       
        //   471: goto            321
        //   474: iload_2        
        //   475: istore          27
        //   477: goto            251
        //   480: iconst_0       
        //   481: istore          27
        //   483: goto            251
        //   486: iconst_0       
        //   487: istore          16
        //   489: iconst_0       
        //   490: istore          17
        //   492: goto            299
        //   495: iconst_0       
        //   496: istore          5
        //   498: goto            338
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      25     372    377    Ljava/lang/IllegalStateException;
        //  42     51     377    382    Ljava/lang/IllegalStateException;
        //  56     85     382    387    Ljava/lang/IllegalStateException;
        //  97     124    387    392    Ljava/lang/IllegalStateException;
        //  142    211    398    403    Ljava/lang/IllegalStateException;
        //  224    248    403    408    Ljava/lang/IllegalStateException;
        //  251    257    408    413    Ljava/lang/IllegalStateException;
        //  265    271    419    424    Ljava/lang/IllegalStateException;
        //  299    306    424    429    Ljava/lang/IllegalStateException;
        //  325    334    429    434    Ljava/lang/IllegalStateException;
        //  338    344    434    439    Ljava/lang/IllegalStateException;
        //  349    355    439    444    Ljava/lang/IllegalStateException;
        //  379    382    382    387    Ljava/lang/IllegalStateException;
        //  436    439    439    444    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 246, Size: 246
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
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.ensureSubDecor();
        ((ViewGroup)this.mSubDecor.findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }
    
    View callActivityOnCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        if (this.mOriginalWindowCallback instanceof LayoutInflater$Factory) {
            final View onCreateView = ((LayoutInflater$Factory)this.mOriginalWindowCallback).onCreateView(s, context, set);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }
    
    public ActionBar createSupportActionBar() {
        this.ensureSubDecor();
        Label_0047: {
            if (!(this.mOriginalWindowCallback instanceof Activity)) {
                break Label_0047;
            }
            WindowDecorActionBar windowDecorActionBar = new WindowDecorActionBar((Activity)this.mOriginalWindowCallback, this.mOverlayActionBar);
        Block_4_Outer:
            while (true) {
                if (windowDecorActionBar == null) {
                    return windowDecorActionBar;
                }
                try {
                    windowDecorActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
                    return windowDecorActionBar;
                    while (true) {
                        windowDecorActionBar = new WindowDecorActionBar((Dialog)this.mOriginalWindowCallback);
                        continue Block_4_Outer;
                        final boolean b = this.mOriginalWindowCallback instanceof Dialog;
                        windowDecorActionBar = null;
                        continue;
                    }
                }
                // iftrue(Label_0033:, !b)
                catch (IllegalStateException ex) {
                    throw ex;
                }
                break;
            }
        }
    }
    
    public View createView(final View p0, final String p1, @NonNull final Context p2, @NonNull final AttributeSet p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore          6
        //     5: iload           6
        //     7: bipush          21
        //     9: if_icmpge       96
        //    12: iconst_1       
        //    13: istore          7
        //    15: aload_0        
        //    16: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatViewInflater:Landroid/support/v7/internal/app/AppCompatViewInflater;
        //    19: ifnonnull       37
        //    22: aload_0        
        //    23: new             Landroid/support/v7/internal/app/AppCompatViewInflater;
        //    26: dup            
        //    27: aload_0        
        //    28: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    31: invokespecial   android/support/v7/internal/app/AppCompatViewInflater.<init>:(Landroid/content/Context;)V
        //    34: putfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatViewInflater:Landroid/support/v7/internal/app/AppCompatViewInflater;
        //    37: iload           7
        //    39: ifeq            122
        //    42: aload_0        
        //    43: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecorInstalled:Z
        //    46: istore          13
        //    48: iload           13
        //    50: ifeq            122
        //    53: aload_1        
        //    54: ifnull          122
        //    57: aload_1        
        //    58: invokevirtual   android/view/View.getId:()I
        //    61: istore          14
        //    63: iload           14
        //    65: ldc_w           16908290
        //    68: if_icmpeq       122
        //    71: iconst_1       
        //    72: istore          9
        //    74: aload_0        
        //    75: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatViewInflater:Landroid/support/v7/internal/app/AppCompatViewInflater;
        //    78: aload_1        
        //    79: aload_2        
        //    80: aload_3        
        //    81: aload           4
        //    83: iload           9
        //    85: iload           7
        //    87: invokevirtual   android/support/v7/internal/app/AppCompatViewInflater.createView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/view/View;
        //    90: areturn        
        //    91: astore          5
        //    93: aload           5
        //    95: athrow         
        //    96: iconst_0       
        //    97: istore          7
        //    99: goto            15
        //   102: astore          8
        //   104: aload           8
        //   106: athrow         
        //   107: astore          10
        //   109: aload           10
        //   111: athrow         
        //   112: astore          11
        //   114: aload           11
        //   116: athrow         
        //   117: astore          12
        //   119: aload           12
        //   121: athrow         
        //   122: iconst_0       
        //   123: istore          9
        //   125: goto            74
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      91     96     Ljava/lang/IllegalStateException;
        //  15     37     102    107    Ljava/lang/IllegalStateException;
        //  42     48     107    117    Ljava/lang/IllegalStateException;
        //  57     63     117    122    Ljava/lang/IllegalStateException;
        //  109    112    112    117    Ljava/lang/IllegalStateException;
        //  114    117    117    122    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        Label_0029: {
            if (keyEvent.getAction() != 0) {
                break Label_0029;
            }
            int n = 1;
            while (true) {
                if (n == 0) {
                    return this.onKeyUp(keyCode, keyEvent);
                }
                try {
                    return this.onKeyDown(keyCode, keyEvent);
                    n = 0;
                    continue;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                break;
            }
        }
        return this.onKeyUp(keyCode, keyEvent);
    }
    
    @Override
    public void installViewFactory() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //     4: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   android/view/LayoutInflater.getFactory:()Landroid/view/LayoutInflater$Factory;
        //    12: astore          4
        //    14: aload           4
        //    16: ifnonnull       30
        //    19: aload_1        
        //    20: aload_0        
        //    21: invokestatic    android/support/v4/view/LayoutInflaterCompat.setFactory:(Landroid/view/LayoutInflater;Landroid/support/v4/view/LayoutInflaterFactory;)V
        //    24: getstatic       android/support/v7/app/ActionBar.a:Z
        //    27: ifeq            53
        //    30: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //    33: bipush          10
        //    35: aaload         
        //    36: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //    39: bipush          9
        //    41: aaload         
        //    42: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    45: pop            
        //    46: return         
        //    47: astore_2       
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      14     47     50     Ljava/lang/IllegalStateException;
        //  19     30     50     53     Ljava/lang/IllegalStateException;
        //  30     46     50     53     Ljava/lang/IllegalStateException;
        //  48     50     50     53     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    @Override
    public void invalidateOptionsMenu() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            try {
                if (supportActionBar.invalidateOptionsMenu()) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        this.invalidatePanelMenu(0);
    }
    
    boolean onBackPressed() {
        while (true) {
            try {
                if (this.mActionMode != null) {
                    this.mActionMode.finish();
                    return true;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar == null) {
                return false;
            }
            try {
                if (!supportActionBar.collapseActionView()) {
                    return false;
                }
                return true;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplV7.mHasActionBar:Z
        //     4: ifeq            33
        //     7: aload_0        
        //     8: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecorInstalled:Z
        //    11: istore_3       
        //    12: iload_3        
        //    13: ifeq            33
        //    16: aload_0        
        //    17: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    20: astore          4
        //    22: aload           4
        //    24: ifnull          33
        //    27: aload           4
        //    29: aload_1        
        //    30: invokevirtual   android/support/v7/app/ActionBar.onConfigurationChanged:(Landroid/content/res/Configuration;)V
        //    33: return         
        //    34: astore_2       
        //    35: aload_2        
        //    36: athrow         
        //    37: astore          5
        //    39: aload           5
        //    41: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     34     37     Ljava/lang/IllegalStateException;
        //  27     33     37     42     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    @Override
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/support/v7/app/AppCompatDelegateImplBase.onCreate:(Landroid/os/Bundle;)V
        //     5: aload_0        
        //     6: aload_0        
        //     7: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindow:Landroid/view/Window;
        //    10: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    13: checkcast       Landroid/view/ViewGroup;
        //    16: putfield        android/support/v7/app/AppCompatDelegateImplV7.mWindowDecor:Landroid/view/ViewGroup;
        //    19: aload_0        
        //    20: getfield        android/support/v7/app/AppCompatDelegateImplV7.mOriginalWindowCallback:Landroid/view/Window$Callback;
        //    23: instanceof      Landroid/app/Activity;
        //    26: ifeq            72
        //    29: aload_0        
        //    30: getfield        android/support/v7/app/AppCompatDelegateImplV7.mOriginalWindowCallback:Landroid/view/Window$Callback;
        //    33: checkcast       Landroid/app/Activity;
        //    36: invokestatic    android/support/v4/app/NavUtils.getParentActivityName:(Landroid/app/Activity;)Ljava/lang/String;
        //    39: astore_3       
        //    40: aload_3        
        //    41: ifnull          72
        //    44: aload_0        
        //    45: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.peekSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    48: astore          4
        //    50: aload           4
        //    52: ifnonnull       66
        //    55: aload_0        
        //    56: iconst_1       
        //    57: putfield        android/support/v7/app/AppCompatDelegateImplV7.mEnableDefaultActionBarUp:Z
        //    60: getstatic       android/support/v7/app/ActionBar.a:Z
        //    63: ifeq            72
        //    66: aload           4
        //    68: iconst_1       
        //    69: invokevirtual   android/support/v7/app/ActionBar.setDefaultDisplayHomeAsUpEnabled:(Z)V
        //    72: return         
        //    73: astore_2       
        //    74: aload_2        
        //    75: athrow         
        //    76: astore          5
        //    78: aload           5
        //    80: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      40     73     76     Ljava/lang/IllegalStateException;
        //  55     66     76     81     Ljava/lang/IllegalStateException;
        //  66     72     76     81     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    @Override
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View callActivityOnCreateView = this.callActivityOnCreateView(view, s, context, set);
        if (callActivityOnCreateView != null) {
            return callActivityOnCreateView;
        }
        return this.createView(view, s, context, set);
    }
    
    boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        Label_0020: {
            switch (n) {
                default: {
                    break Label_0020;
                }
                case 82: {
                    Label_0050: {
                        break Label_0050;
                        try {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            boolean onKeyShortcut = false;
                            if (sdk_INT < 11) {
                                onKeyShortcut = this.onKeyShortcut(n, keyEvent);
                            }
                            return onKeyShortcut;
                            try {
                                this.onKeyDownPanel(0, keyEvent);
                                return true;
                            }
                            catch (IllegalStateException ex) {
                                throw ex;
                            }
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    boolean onKeyShortcut(final int n, final KeyEvent keyEvent) {
        final ActionBar supportActionBar = this.getSupportActionBar();
        Label_0029: {
            if (supportActionBar == null) {
                break Label_0029;
            }
            try {
                if (supportActionBar.onKeyShortcut(n, keyEvent)) {
                    return true;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        if (this.mPreparedPanel != null && this.performPanelShortcut(this.mPreparedPanel, keyEvent.getKeyCode(), keyEvent, 1)) {
            try {
                if (this.mPreparedPanel != null) {
                    return this.mPreparedPanel.isHandled = true;
                }
                return true;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        if (this.mPreparedPanel != null) {
            return false;
        }
        final AppCompatDelegateImplV7$PanelFeatureState panelState = this.getPanelState(0, true);
        this.preparePanel(panelState, keyEvent);
        final boolean performPanelShortcut = this.performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
        try {
            panelState.isPrepared = false;
            if (!performPanelShortcut) {
                return false;
            }
            return true;
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
    }
    
    boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        switch (n) {
            case 82: {
                try {
                    this.onKeyUpPanel(0, keyEvent);
                    return true;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            case 4: {
                final AppCompatDelegateImplV7$PanelFeatureState panelState = this.getPanelState(0, false);
                if (panelState != null) {
                    try {
                        if (panelState.isOpen) {
                            this.closePanel(panelState, true);
                            return true;
                        }
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (this.onBackPressed()) {
                        return true;
                    }
                    break;
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                break;
            }
        }
        return false;
    }
    
    @Override
    public boolean onMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final Window$Callback windowCallback = this.getWindowCallback();
        if (windowCallback != null) {
            AppCompatDelegateImplV7$PanelFeatureState menuPanel;
            try {
                if (this.isDestroyed()) {
                    return false;
                }
                menuPanel = this.findMenuPanel((Menu)menuBuilder.getRootMenu());
                if (menuPanel != null) {
                    final Window$Callback window$Callback = windowCallback;
                    final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState = menuPanel;
                    final int n = appCompatDelegateImplV7$PanelFeatureState.featureId;
                    final MenuItem menuItem2 = menuItem;
                    final boolean onMenuItemSelected = window$Callback.onMenuItemSelected(n, menuItem2);
                    return onMenuItemSelected;
                }
                return false;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final Window$Callback window$Callback = windowCallback;
                final AppCompatDelegateImplV7$PanelFeatureState appCompatDelegateImplV7$PanelFeatureState = menuPanel;
                final int n = appCompatDelegateImplV7$PanelFeatureState.featureId;
                final MenuItem menuItem2 = menuItem;
                final boolean onMenuItemSelected2;
                final boolean onMenuItemSelected = onMenuItemSelected2 = window$Callback.onMenuItemSelected(n, menuItem2);
                return onMenuItemSelected2;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    @Override
    public void onMenuModeChange(final MenuBuilder menuBuilder) {
        this.reopenMenu(menuBuilder, true);
    }
    
    @Override
    boolean onMenuOpened(final int n, final Menu menu) {
        if (n == 8) {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar == null) {
                return true;
            }
            try {
                supportActionBar.dispatchMenuVisibilityChanged(true);
                return true;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    @Override
    boolean onPanelClosed(final int n, final Menu menu) {
        if (n == 8) {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar == null) {
                return true;
            }
            try {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return true;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        if (n != 0) {
            return false;
        }
        final AppCompatDelegateImplV7$PanelFeatureState panelState = this.getPanelState(n, true);
        try {
            if (panelState.isOpen) {
                this.closePanel(panelState, false);
            }
            return false;
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void onPostCreate(final Bundle bundle) {
        this.ensureSubDecor();
    }
    
    @Override
    public void onPostResume() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        try {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onStop() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        try {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    void onSubDecorInstalled(final ViewGroup viewGroup) {
    }
    
    @Override
    void onTitleChanged(final CharSequence p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //     8: astore          8
        //    10: aload           8
        //    12: ifnull          29
        //    15: aload_0        
        //    16: getfield        android/support/v7/app/AppCompatDelegateImplV7.mDecorContentParent:Landroid/support/v7/internal/widget/DecorContentParent;
        //    19: aload_1        
        //    20: invokeinterface android/support/v7/internal/widget/DecorContentParent.setWindowTitle:(Ljava/lang/CharSequence;)V
        //    25: iload_2        
        //    26: ifeq            67
        //    29: aload_0        
        //    30: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    33: astore          9
        //    35: aload           9
        //    37: ifnull          52
        //    40: aload_0        
        //    41: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    44: aload_1        
        //    45: invokevirtual   android/support/v7/app/ActionBar.setWindowTitle:(Ljava/lang/CharSequence;)V
        //    48: iload_2        
        //    49: ifeq            67
        //    52: aload_0        
        //    53: getfield        android/support/v7/app/AppCompatDelegateImplV7.mTitleView:Landroid/widget/TextView;
        //    56: ifnull          67
        //    59: aload_0        
        //    60: getfield        android/support/v7/app/AppCompatDelegateImplV7.mTitleView:Landroid/widget/TextView;
        //    63: aload_1        
        //    64: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    67: return         
        //    68: astore_3       
        //    69: aload_3        
        //    70: athrow         
        //    71: astore          4
        //    73: aload           4
        //    75: athrow         
        //    76: astore          5
        //    78: aload           5
        //    80: athrow         
        //    81: astore          6
        //    83: aload           6
        //    85: athrow         
        //    86: astore          7
        //    88: aload           7
        //    90: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     68     71     Ljava/lang/IllegalStateException;
        //  15     25     71     76     Ljava/lang/IllegalStateException;
        //  29     35     76     81     Ljava/lang/IllegalStateException;
        //  40     48     81     86     Ljava/lang/IllegalStateException;
        //  52     67     86     91     Ljava/lang/IllegalStateException;
        //  69     71     71     76     Ljava/lang/IllegalStateException;
        //  73     76     76     81     Ljava/lang/IllegalStateException;
        //  78     81     81     86     Ljava/lang/IllegalStateException;
        //  83     86     86     91     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 47, Size: 47
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
    public boolean requestWindowFeature(final int n) {
        switch (n) {
            default: {
                return this.mWindow.requestFeature(n);
            }
            case 8: {
                try {
                    this.throwFeatureRequestIfSubDecorInstalled();
                    return this.mHasActionBar = true;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            case 9: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionBar = true;
            }
            case 10: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionMode = true;
            }
            case 2: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureProgress = true;
            }
            case 5: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureIndeterminateProgress = true;
            }
            case 1: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mWindowNoTitle = true;
            }
        }
    }
    
    @Override
    public void setContentView(final int n) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(n, viewGroup);
        this.mOriginalWindowCallback.onContentChanged();
    }
    
    @Override
    public void setContentView(final View view) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mOriginalWindowCallback.onContentChanged();
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }
    
    @Override
    public void setSupportActionBar(final Toolbar toolbar) {
        try {
            if (!(this.mOriginalWindowCallback instanceof Activity)) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final ActionBar supportActionBar = this.getSupportActionBar();
        try {
            if (supportActionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException(AppCompatDelegateImplV7.z[5]);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        final ToolbarActionBar supportActionBar2 = new ToolbarActionBar(toolbar, ((Activity)this.mContext).getTitle(), this.mWindow);
        this.setSupportActionBar(supportActionBar2);
        this.mWindow.setCallback(supportActionBar2.getWrappedWindowCallback());
        supportActionBar2.invalidateOptionsMenu();
    }
    
    @Override
    public ActionMode startSupportActionMode(final ActionMode$Callback p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       22
        //     4: new             Ljava/lang/IllegalArgumentException;
        //     7: dup            
        //     8: getstatic       android/support/v7/app/AppCompatDelegateImplV7.z:[Ljava/lang/String;
        //    11: iconst_0       
        //    12: aaload         
        //    13: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    16: athrow         
        //    17: astore          9
        //    19: aload           9
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    26: ifnull          36
        //    29: aload_0        
        //    30: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    33: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    36: new             Landroid/support/v7/app/AppCompatDelegateImplV7$ActionModeCallbackWrapper;
        //    39: dup            
        //    40: aload_0        
        //    41: aload_1        
        //    42: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$ActionModeCallbackWrapper.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;Landroid/support/v7/view/ActionMode$Callback;)V
        //    45: astore_3       
        //    46: aload_0        
        //    47: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    50: astore          4
        //    52: aload           4
        //    54: ifnull          98
        //    57: aload_0        
        //    58: aload           4
        //    60: aload_3        
        //    61: invokevirtual   android/support/v7/app/ActionBar.startActionMode:(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
        //    64: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    67: aload_0        
        //    68: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    71: astore          8
        //    73: aload           8
        //    75: ifnull          98
        //    78: aload_0        
        //    79: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatCallback:Landroid/support/v7/app/AppCompatCallback;
        //    82: ifnull          98
        //    85: aload_0        
        //    86: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatCallback:Landroid/support/v7/app/AppCompatCallback;
        //    89: aload_0        
        //    90: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    93: invokeinterface android/support/v7/app/AppCompatCallback.onSupportActionModeStarted:(Landroid/support/v7/view/ActionMode;)V
        //    98: aload_0        
        //    99: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   102: ifnonnull       114
        //   105: aload_0        
        //   106: aload_0        
        //   107: aload_3        
        //   108: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.startSupportActionModeFromWindow:(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
        //   111: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   114: aload_0        
        //   115: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   118: areturn        
        //   119: astore_2       
        //   120: aload_2        
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          7
        //   129: aload           7
        //   131: athrow         
        //   132: astore          5
        //   134: aload           5
        //   136: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      17     17     22     Ljava/lang/IllegalStateException;
        //  22     36     119    122    Ljava/lang/IllegalStateException;
        //  57     73     122    127    Ljava/lang/IllegalStateException;
        //  78     98     127    132    Ljava/lang/IllegalStateException;
        //  98     114    132    137    Ljava/lang/IllegalStateException;
        //  124    127    127    132    Ljava/lang/IllegalStateException;
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
    
    ActionMode startSupportActionModeFromWindow(final ActionMode$Callback p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //     8: ifnull          18
        //    11: aload_0        
        //    12: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //    15: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    18: new             Landroid/support/v7/app/AppCompatDelegateImplV7$ActionModeCallbackWrapper;
        //    21: dup            
        //    22: aload_0        
        //    23: aload_1        
        //    24: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$ActionModeCallbackWrapper.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;Landroid/support/v7/view/ActionMode$Callback;)V
        //    27: astore          4
        //    29: aload_0        
        //    30: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //    33: ifnonnull       309
        //    36: aload_0        
        //    37: getfield        android/support/v7/app/AppCompatDelegateImplV7.mIsFloating:Z
        //    40: istore          24
        //    42: iload           24
        //    44: ifeq            265
        //    47: new             Landroid/util/TypedValue;
        //    50: dup            
        //    51: invokespecial   android/util/TypedValue.<init>:()V
        //    54: astore          25
        //    56: aload_0        
        //    57: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    60: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //    63: astore          26
        //    65: aload           26
        //    67: getstatic       android/support/v7/appcompat/R$attr.actionBarTheme:I
        //    70: aload           25
        //    72: iconst_1       
        //    73: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //    76: pop            
        //    77: aload           25
        //    79: getfield        android/util/TypedValue.resourceId:I
        //    82: ifeq            143
        //    85: aload_0        
        //    86: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //    89: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    92: invokevirtual   android/content/res/Resources.newTheme:()Landroid/content/res/Resources$Theme;
        //    95: astore          33
        //    97: aload           33
        //    99: aload           26
        //   101: invokevirtual   android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
        //   104: aload           33
        //   106: aload           25
        //   108: getfield        android/util/TypedValue.resourceId:I
        //   111: iconst_1       
        //   112: invokevirtual   android/content/res/Resources$Theme.applyStyle:(IZ)V
        //   115: new             Landroid/support/v7/internal/view/ContextThemeWrapper;
        //   118: dup            
        //   119: aload_0        
        //   120: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   123: iconst_0       
        //   124: invokespecial   android/support/v7/internal/view/ContextThemeWrapper.<init>:(Landroid/content/Context;I)V
        //   127: astore          28
        //   129: aload           28
        //   131: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //   134: aload           33
        //   136: invokevirtual   android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
        //   139: iload_2        
        //   140: ifeq            149
        //   143: aload_0        
        //   144: getfield        android/support/v7/app/AppCompatDelegateImplV7.mContext:Landroid/content/Context;
        //   147: astore          28
        //   149: aload_0        
        //   150: new             Landroid/support/v7/internal/widget/ActionBarContextView;
        //   153: dup            
        //   154: aload           28
        //   156: invokespecial   android/support/v7/internal/widget/ActionBarContextView.<init>:(Landroid/content/Context;)V
        //   159: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   162: aload_0        
        //   163: new             Landroid/widget/PopupWindow;
        //   166: dup            
        //   167: aload           28
        //   169: aconst_null    
        //   170: getstatic       android/support/v7/appcompat/R$attr.actionModePopupWindowStyle:I
        //   173: invokespecial   android/widget/PopupWindow.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //   176: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   179: aload_0        
        //   180: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   183: aload_0        
        //   184: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   187: invokevirtual   android/widget/PopupWindow.setContentView:(Landroid/view/View;)V
        //   190: aload_0        
        //   191: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   194: iconst_m1      
        //   195: invokevirtual   android/widget/PopupWindow.setWidth:(I)V
        //   198: aload           28
        //   200: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //   203: getstatic       android/support/v7/appcompat/R$attr.actionBarSize:I
        //   206: aload           25
        //   208: iconst_1       
        //   209: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //   212: pop            
        //   213: aload           25
        //   215: getfield        android/util/TypedValue.data:I
        //   218: aload           28
        //   220: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   223: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   226: invokestatic    android/util/TypedValue.complexToDimensionPixelSize:(ILandroid/util/DisplayMetrics;)I
        //   229: istore          30
        //   231: aload_0        
        //   232: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   235: iload           30
        //   237: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.setContentHeight:(I)V
        //   240: aload_0        
        //   241: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   244: bipush          -2
        //   246: invokevirtual   android/widget/PopupWindow.setHeight:(I)V
        //   249: aload_0        
        //   250: new             Landroid/support/v7/app/AppCompatDelegateImplV7$4;
        //   253: dup            
        //   254: aload_0        
        //   255: invokespecial   android/support/v7/app/AppCompatDelegateImplV7$4.<init>:(Landroid/support/v7/app/AppCompatDelegateImplV7;)V
        //   258: putfield        android/support/v7/app/AppCompatDelegateImplV7.mShowActionModePopup:Ljava/lang/Runnable;
        //   261: iload_2        
        //   262: ifeq            309
        //   265: aload_0        
        //   266: getfield        android/support/v7/app/AppCompatDelegateImplV7.mSubDecor:Landroid/view/ViewGroup;
        //   269: getstatic       android/support/v7/appcompat/R$id.action_mode_bar_stub:I
        //   272: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   275: checkcast       Landroid/support/v7/internal/widget/ViewStubCompat;
        //   278: astore          31
        //   280: aload           31
        //   282: ifnull          309
        //   285: aload           31
        //   287: aload_0        
        //   288: invokevirtual   android/support/v7/app/AppCompatDelegateImplV7.getActionBarThemedContext:()Landroid/content/Context;
        //   291: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   294: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.setLayoutInflater:(Landroid/view/LayoutInflater;)V
        //   297: aload_0        
        //   298: aload           31
        //   300: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.inflate:()Landroid/view/View;
        //   303: checkcast       Landroid/support/v7/internal/widget/ActionBarContextView;
        //   306: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   309: aload_0        
        //   310: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   313: astore          8
        //   315: aload           8
        //   317: ifnull          488
        //   320: aload_0        
        //   321: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   324: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.killMode:()V
        //   327: aload_0        
        //   328: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   331: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getContext:()Landroid/content/Context;
        //   334: astore          12
        //   336: aload_0        
        //   337: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   340: astore          13
        //   342: aload_0        
        //   343: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   346: astore          14
        //   348: aload           14
        //   350: ifnonnull       547
        //   353: iconst_1       
        //   354: istore          15
        //   356: new             Landroid/support/v7/internal/view/StandaloneActionMode;
        //   359: dup            
        //   360: aload           12
        //   362: aload           13
        //   364: aload           4
        //   366: iload           15
        //   368: invokespecial   android/support/v7/internal/view/StandaloneActionMode.<init>:(Landroid/content/Context;Landroid/support/v7/internal/widget/ActionBarContextView;Landroid/support/v7/view/ActionMode$Callback;Z)V
        //   371: astore          16
        //   373: aload_1        
        //   374: aload           16
        //   376: aload           16
        //   378: invokevirtual   android/support/v7/view/ActionMode.getMenu:()Landroid/view/Menu;
        //   381: invokeinterface android/support/v7/view/ActionMode$Callback.onCreateActionMode:(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
        //   386: istore          19
        //   388: iload           19
        //   390: ifeq            483
        //   393: aload           16
        //   395: invokevirtual   android/support/v7/view/ActionMode.invalidate:()V
        //   398: aload_0        
        //   399: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   402: aload           16
        //   404: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.initForMode:(Landroid/support/v7/view/ActionMode;)V
        //   407: aload_0        
        //   408: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   411: iconst_0       
        //   412: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.setVisibility:(I)V
        //   415: aload_0        
        //   416: aload           16
        //   418: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   421: aload_0        
        //   422: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModePopup:Landroid/widget/PopupWindow;
        //   425: ifnull          443
        //   428: aload_0        
        //   429: getfield        android/support/v7/app/AppCompatDelegateImplV7.mWindow:Landroid/view/Window;
        //   432: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   435: aload_0        
        //   436: getfield        android/support/v7/app/AppCompatDelegateImplV7.mShowActionModePopup:Ljava/lang/Runnable;
        //   439: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   442: pop            
        //   443: aload_0        
        //   444: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   447: bipush          32
        //   449: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.sendAccessibilityEvent:(I)V
        //   452: aload_0        
        //   453: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   456: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
        //   459: astore          22
        //   461: aload           22
        //   463: ifnull          488
        //   466: aload_0        
        //   467: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionModeView:Landroid/support/v7/internal/widget/ActionBarContextView;
        //   470: invokevirtual   android/support/v7/internal/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
        //   473: checkcast       Landroid/view/View;
        //   476: invokestatic    android/support/v4/view/ViewCompat.requestApplyInsets:(Landroid/view/View;)V
        //   479: iload_2        
        //   480: ifeq            488
        //   483: aload_0        
        //   484: aconst_null    
        //   485: putfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   488: aload_0        
        //   489: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   492: astore          11
        //   494: aload           11
        //   496: ifnull          519
        //   499: aload_0        
        //   500: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatCallback:Landroid/support/v7/app/AppCompatCallback;
        //   503: ifnull          519
        //   506: aload_0        
        //   507: getfield        android/support/v7/app/AppCompatDelegateImplV7.mAppCompatCallback:Landroid/support/v7/app/AppCompatCallback;
        //   510: aload_0        
        //   511: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   514: invokeinterface android/support/v7/app/AppCompatCallback.onSupportActionModeStarted:(Landroid/support/v7/view/ActionMode;)V
        //   519: aload_0        
        //   520: getfield        android/support/v7/app/AppCompatDelegateImplV7.mActionMode:Landroid/support/v7/view/ActionMode;
        //   523: areturn        
        //   524: astore_3       
        //   525: aload_3        
        //   526: athrow         
        //   527: astore          5
        //   529: aload           5
        //   531: athrow         
        //   532: astore          32
        //   534: aload           32
        //   536: athrow         
        //   537: astore          6
        //   539: aload           6
        //   541: athrow         
        //   542: astore          7
        //   544: aload           7
        //   546: athrow         
        //   547: iconst_0       
        //   548: istore          15
        //   550: goto            356
        //   553: astore          17
        //   555: aload           17
        //   557: athrow         
        //   558: astore          18
        //   560: aload           18
        //   562: athrow         
        //   563: astore          21
        //   565: aload           21
        //   567: athrow         
        //   568: astore          20
        //   570: aload           20
        //   572: athrow         
        //   573: astore          9
        //   575: aload           9
        //   577: athrow         
        //   578: astore          10
        //   580: aload           10
        //   582: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      18     524    527    Ljava/lang/IllegalStateException;
        //  29     42     527    532    Ljava/lang/IllegalStateException;
        //  285    309    532    537    Ljava/lang/IllegalStateException;
        //  309    315    537    542    Ljava/lang/IllegalStateException;
        //  320    348    542    547    Ljava/lang/IllegalStateException;
        //  373    388    553    558    Ljava/lang/IllegalStateException;
        //  393    443    558    563    Ljava/lang/IllegalStateException;
        //  443    461    563    568    Ljava/lang/IllegalStateException;
        //  466    479    568    573    Ljava/lang/IllegalStateException;
        //  483    488    568    573    Ljava/lang/IllegalStateException;
        //  488    494    573    578    Ljava/lang/IllegalStateException;
        //  499    519    578    583    Ljava/lang/IllegalStateException;
        //  539    542    542    547    Ljava/lang/IllegalStateException;
        //  555    558    558    563    Ljava/lang/IllegalStateException;
        //  565    568    568    573    Ljava/lang/IllegalStateException;
        //  575    578    578    583    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 272, Size: 272
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
