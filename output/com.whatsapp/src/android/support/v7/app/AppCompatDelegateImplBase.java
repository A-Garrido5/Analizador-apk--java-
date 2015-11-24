// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.Menu;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.internal.view.SupportMenuInflater;
import android.view.KeyEvent;
import android.view.Window;
import android.view.Window$Callback;
import android.view.MenuInflater;
import android.content.Context;

abstract class AppCompatDelegateImplBase extends AppCompatDelegate
{
    private static final String[] z;
    private ActionBar mActionBar;
    final AppCompatCallback mAppCompatCallback;
    final Context mContext;
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    final Window$Callback mOriginalWindowCallback;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private CharSequence mTitle;
    final Window mWindow;
    boolean mWindowNoTitle;
    
    static {
        final String[] z2 = new String[2];
        String s = "C[\u0002K)o[\u0013|fjJ\u0001('nY\u0017i\"{\u000b\u001bf5vJ\u001ed#f\u000b\u001b|5gG\u0014(/l_\u001d(2jNR_/lO\u001d\u007f";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
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
                    s = "[D\u0007((gN\u0016(2m\u000b\u0007{#\"JR\\.gF\u0017&\u0007r[1g+rJ\u0006(2jN\u001fmf*D\u0000(\"gX\u0011m(fJ\u001c|o\"\\\u001b|.\"_\u001aa5\"J\u0011|/tB\u0006qh";
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
    }
    
    AppCompatDelegateImplBase(final Context mContext, final Window mWindow, final AppCompatCallback mAppCompatCallback) {
        this.mContext = mContext;
        this.mWindow = mWindow;
        this.mAppCompatCallback = mAppCompatCallback;
        this.mOriginalWindowCallback = this.mWindow.getCallback();
        if (this.mOriginalWindowCallback instanceof AppCompatDelegateImplBase$AppCompatWindowCallback) {
            throw new IllegalStateException(AppCompatDelegateImplBase.z[0]);
        }
        this.mWindow.setCallback((Window$Callback)new AppCompatDelegateImplBase$AppCompatWindowCallback(this, this.mOriginalWindowCallback));
    }
    
    abstract ActionBar createSupportActionBar();
    
    abstract boolean dispatchKeyEvent(final KeyEvent p0);
    
    final Context getActionBarThemedContext() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        Context context = null;
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        }
        if (context == null) {
            context = this.mContext;
        }
        return context;
    }
    
    @Override
    public MenuInflater getMenuInflater() {
        try {
            if (this.mMenuInflater == null) {
                this.mMenuInflater = new SupportMenuInflater(this.getActionBarThemedContext());
            }
            return this.mMenuInflater;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public ActionBar getSupportActionBar() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplBase.mHasActionBar:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            24
        //     9: aload_0        
        //    10: getfield        android/support/v7/app/AppCompatDelegateImplBase.mActionBar:Landroid/support/v7/app/ActionBar;
        //    13: ifnonnull       24
        //    16: aload_0        
        //    17: aload_0        
        //    18: invokevirtual   android/support/v7/app/AppCompatDelegateImplBase.createSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    21: putfield        android/support/v7/app/AppCompatDelegateImplBase.mActionBar:Landroid/support/v7/app/ActionBar;
        //    24: aload_0        
        //    25: getfield        android/support/v7/app/AppCompatDelegateImplBase.mActionBar:Landroid/support/v7/app/ActionBar;
        //    28: areturn        
        //    29: astore_1       
        //    30: aload_1        
        //    31: athrow         
        //    32: astore_2       
        //    33: aload_2        
        //    34: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      29     32     Ljava/lang/IllegalStateException;
        //  9      24     32     35     Ljava/lang/IllegalStateException;
        //  30     32     32     35     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    final CharSequence getTitle() {
        try {
            if (this.mOriginalWindowCallback instanceof Activity) {
                return ((Activity)this.mOriginalWindowCallback).getTitle();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.mTitle;
    }
    
    final Window$Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }
    
    final boolean isDestroyed() {
        return this.mIsDestroyed;
    }
    
    @Override
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/app/AppCompatDelegateImplBase.mContext:Landroid/content/Context;
        //     4: getstatic       android/support/v7/appcompat/R$styleable.Theme:[I
        //     7: invokevirtual   android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
        //    10: astore_2       
        //    11: aload_2        
        //    12: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowActionBar:I
        //    15: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //    18: ifne            41
        //    21: aload_2        
        //    22: invokevirtual   android/content/res/TypedArray.recycle:()V
        //    25: new             Ljava/lang/IllegalStateException;
        //    28: dup            
        //    29: getstatic       android/support/v7/app/AppCompatDelegateImplBase.z:[Ljava/lang/String;
        //    32: iconst_1       
        //    33: aaload         
        //    34: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    37: athrow         
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: aload_2        
        //    42: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowActionBar:I
        //    45: iconst_0       
        //    46: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //    49: ifeq            57
        //    52: aload_0        
        //    53: iconst_1       
        //    54: putfield        android/support/v7/app/AppCompatDelegateImplBase.mHasActionBar:Z
        //    57: aload_2        
        //    58: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowActionBarOverlay:I
        //    61: iconst_0       
        //    62: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //    65: ifeq            73
        //    68: aload_0        
        //    69: iconst_1       
        //    70: putfield        android/support/v7/app/AppCompatDelegateImplBase.mOverlayActionBar:Z
        //    73: aload_2        
        //    74: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowActionModeOverlay:I
        //    77: iconst_0       
        //    78: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //    81: ifeq            89
        //    84: aload_0        
        //    85: iconst_1       
        //    86: putfield        android/support/v7/app/AppCompatDelegateImplBase.mOverlayActionMode:Z
        //    89: aload_0        
        //    90: aload_2        
        //    91: getstatic       android/support/v7/appcompat/R$styleable.Theme_android_windowIsFloating:I
        //    94: iconst_0       
        //    95: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //    98: putfield        android/support/v7/app/AppCompatDelegateImplBase.mIsFloating:Z
        //   101: aload_0        
        //   102: aload_2        
        //   103: getstatic       android/support/v7/appcompat/R$styleable.Theme_windowNoTitle:I
        //   106: iconst_0       
        //   107: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   110: putfield        android/support/v7/app/AppCompatDelegateImplBase.mWindowNoTitle:Z
        //   113: aload_2        
        //   114: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   117: return         
        //   118: astore          4
        //   120: aload           4
        //   122: athrow         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  11     38     38     41     Ljava/lang/IllegalStateException;
        //  41     57     118    123    Ljava/lang/IllegalStateException;
        //  57     73     123    128    Ljava/lang/IllegalStateException;
        //  73     89     128    133    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 69, Size: 69
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
    public final void onDestroy() {
        this.mIsDestroyed = true;
    }
    
    abstract boolean onKeyShortcut(final int p0, final KeyEvent p1);
    
    abstract boolean onMenuOpened(final int p0, final Menu p1);
    
    abstract boolean onPanelClosed(final int p0, final Menu p1);
    
    abstract void onTitleChanged(final CharSequence p0);
    
    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }
    
    final void setSupportActionBar(final ActionBar mActionBar) {
        this.mActionBar = mActionBar;
    }
    
    @Override
    public final void setTitle(final CharSequence mTitle) {
        this.onTitleChanged(this.mTitle = mTitle);
    }
}
