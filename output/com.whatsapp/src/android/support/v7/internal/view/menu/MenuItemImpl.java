// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.MenuItem$OnActionExpandListener;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.ViewDebug$CapturedViewProperty;
import android.support.v7.internal.widget.TintManager;
import android.view.MenuItem;
import android.content.ActivityNotFoundException;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.View;
import android.support.v4.view.ActionProvider;
import android.support.v4.internal.view.SupportMenuItem;

public final class MenuItemImpl implements SupportMenuItem
{
    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private static final String[] z;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private MenuItem$OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    private MenuBuilder mMenu;
    private ContextMenu$ContextMenuInfo mMenuInfo;
    private MenuItemCompat$OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    
    static {
        final String[] z2 = new String[6];
        String s = "m)UES\u000e.R\fC\u000e)X\u0016NX!O\u001b\u0007Z'\u001b\nF@,W\u0007\u0007G&O\u0007IZs\u001b\u000b@@'I\u000bII";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = 'b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c-U\u0017nZ-V+J^$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z R\u0011\u0007G;\u001b\fHZhH\u0017W^'I\u0016BJd\u001b\u0017TKhv\u0007I[\u0001O\u0007Jm'V\u0012FZfH\u0007So+O\u000bH@\u0018I\rQG,^\u0010\u000f\u0007";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "z R\u0011\u0007G;\u001b\fHZhH\u0017W^'I\u0016BJd\u001b\u0017TKhv\u0007I[\u0001O\u0007Jm'V\u0012FZfH\u0007Sa&z\u0001SG'U'_^)U\u0006kG;O\u0007IK:\u0013K";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "z R\u0011\u0007G;\u001b\fHZhH\u0017W^'I\u0016BJd\u001b\u0017TKhv\u0007I[\u0001O\u0007Jm'V\u0012FZf\\\u0007So+O\u000bH@\u0018I\rQG,^\u0010\u000f\u0007";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}\u0000t5xo\u001bd#dz\u0001t,xo\u0004l#~}d\u001b1oa\u001fd#tq\tx6na\u0006d+aq\u001at-j\u0002hZ\fC\u000e\u001bs-pq\th=fm\u001cr-iq\u0006~4b|hZ\u0010B\u000e%N\u0016RO$W\u001b\u0007K0X\u000eR]!M\u0007\t";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MenuItemImpl(final MenuBuilder mMenu, final int mGroup, final int mId, final int mCategoryOrder, final int mOrdering, final CharSequence mTitle, final int mShowAsAction) {
        this.mIconResId = 0;
        this.mFlags = 16;
        this.mShowAsAction = 0;
        this.mIsActionViewExpanded = false;
        this.mMenu = mMenu;
        this.mId = mId;
        this.mGroup = mGroup;
        this.mCategoryOrder = mCategoryOrder;
        this.mOrdering = mOrdering;
        this.mTitle = mTitle;
        this.mShowAsAction = mShowAsAction;
    }
    
    static MenuBuilder access$000(final MenuItemImpl menuItemImpl) {
        return menuItemImpl.mMenu;
    }
    
    @Override
    public boolean collapseActionView() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mShowAsAction:I
        //     4: istore_2       
        //     5: iload_2        
        //     6: bipush          8
        //     8: iand           
        //     9: ifne            17
        //    12: iconst_0       
        //    13: ireturn        
        //    14: astore_1       
        //    15: aload_1        
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //    21: astore          4
        //    23: aload           4
        //    25: ifnonnull       33
        //    28: iconst_1       
        //    29: ireturn        
        //    30: astore_3       
        //    31: aload_3        
        //    32: athrow         
        //    33: aload_0        
        //    34: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
        //    37: astore          7
        //    39: aload           7
        //    41: ifnull          57
        //    44: aload_0        
        //    45: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
        //    48: aload_0        
        //    49: invokeinterface android/support/v4/view/MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse:(Landroid/view/MenuItem;)Z
        //    54: ifeq            12
        //    57: aload_0        
        //    58: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    61: aload_0        
        //    62: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.collapseItemActionView:(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
        //    65: ireturn        
        //    66: astore          5
        //    68: aload           5
        //    70: athrow         
        //    71: astore          6
        //    73: aload           6
        //    75: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      14     17     Landroid/content/ActivityNotFoundException;
        //  17     23     30     33     Landroid/content/ActivityNotFoundException;
        //  33     39     66     71     Landroid/content/ActivityNotFoundException;
        //  44     57     71     76     Landroid/content/ActivityNotFoundException;
        //  57     66     71     76     Landroid/content/ActivityNotFoundException;
        //  68     71     71     76     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    public boolean expandActionView() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.hasCollapsibleActionView:()Z
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifne            14
        //     9: iconst_0       
        //    10: ireturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
        //    18: astore          5
        //    20: aload           5
        //    22: ifnull          38
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
        //    29: aload_0        
        //    30: invokeinterface android/support/v4/view/MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand:(Landroid/view/MenuItem;)Z
        //    35: ifeq            9
        //    38: aload_0        
        //    39: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    42: aload_0        
        //    43: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.expandItemActionView:(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
        //    46: ireturn        
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: astore          4
        //    52: aload           4
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      11     14     Landroid/content/ActivityNotFoundException;
        //  14     20     47     50     Landroid/content/ActivityNotFoundException;
        //  25     38     50     55     Landroid/content/ActivityNotFoundException;
        //  38     47     50     55     Landroid/content/ActivityNotFoundException;
        //  48     50     50     55     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException(MenuItemImpl.z[4]);
    }
    
    @Override
    public View getActionView() {
        try {
            if (this.mActionView != null) {
                return this.mActionView;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        try {
            if (this.mActionProvider != null) {
                return this.mActionView = this.mActionProvider.onCreateActionView((MenuItem)this);
            }
        }
        catch (ActivityNotFoundException ex2) {
            throw ex2;
        }
        return null;
    }
    
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }
    
    public int getGroupId() {
        return this.mGroup;
    }
    
    public Drawable getIcon() {
        try {
            if (this.mIconDrawable != null) {
                return this.mIconDrawable;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        if (this.mIconResId != 0) {
            final Drawable drawable = TintManager.getDrawable(this.mMenu.getContext(), this.mIconResId);
            this.mIconResId = 0;
            return this.mIconDrawable = drawable;
        }
        return null;
    }
    
    public Intent getIntent() {
        return this.mIntent;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }
    
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }
    
    public int getOrder() {
        return this.mCategoryOrder;
    }
    
    public int getOrdering() {
        return this.mOrdering;
    }
    
    char getShortcut() {
        try {
            if (this.mMenu.isQwertyMode()) {
                return this.mShortcutAlphabeticChar;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return this.mShortcutNumericChar;
    }
    
    String getShortcutLabel() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getShortcut:()C
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifne            16
        //    13: ldc             ""
        //    15: areturn        
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.sPrependShortcutLabel:Ljava/lang/String;
        //    23: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    26: astore_3       
        //    27: iload_2        
        //    28: lookupswitch {
        //                8: 87
        //               10: 75
        //               32: 99
        //          default: 64
        //        }
        //    64: aload_3        
        //    65: iload_2        
        //    66: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    69: pop            
        //    70: aload_3        
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: areturn        
        //    75: aload_3        
        //    76: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.sEnterShortcutLabel:Ljava/lang/String;
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: pop            
        //    83: iload_1        
        //    84: ifeq            70
        //    87: aload_3        
        //    88: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.sDeleteShortcutLabel:Ljava/lang/String;
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: pop            
        //    95: iload_1        
        //    96: ifeq            70
        //    99: aload_3        
        //   100: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.sSpaceShortcutLabel:Ljava/lang/String;
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: pop            
        //   107: iload_1        
        //   108: ifeq            70
        //   111: goto            64
        //   114: astore          9
        //   116: aload           9
        //   118: athrow         
        //   119: astore          7
        //   121: aload           7
        //   123: athrow         
        //   124: astore          4
        //   126: aload           4
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  64     70     124    129    Landroid/content/ActivityNotFoundException;
        //  75     83     114    119    Landroid/content/ActivityNotFoundException;
        //  87     95     119    124    Landroid/content/ActivityNotFoundException;
        //  99     107    124    129    Landroid/content/ActivityNotFoundException;
        //  116    119    119    124    Landroid/content/ActivityNotFoundException;
        //  121    124    124    129    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    public SubMenu getSubMenu() {
        return (SubMenu)this.mSubMenu;
    }
    
    @Override
    public ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }
    
    @ViewDebug$CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public CharSequence getTitleCondensed() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mTitleCondensed:Ljava/lang/CharSequence;
        //     4: ifnull          51
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mTitleCondensed:Ljava/lang/CharSequence;
        //    11: astore_2       
        //    12: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    15: istore          6
        //    17: iload           6
        //    19: bipush          18
        //    21: if_icmpge       46
        //    24: aload_2        
        //    25: ifnull          46
        //    28: aload_2        
        //    29: instanceof      Ljava/lang/String;
        //    32: ifne            46
        //    35: aload_2        
        //    36: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    41: astore          7
        //    43: aload           7
        //    45: astore_2       
        //    46: aload_2        
        //    47: areturn        
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: aload_0        
        //    52: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mTitle:Ljava/lang/CharSequence;
        //    55: astore_2       
        //    56: goto            12
        //    59: astore_3       
        //    60: aload_3        
        //    61: athrow         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      12     48     51     Landroid/content/ActivityNotFoundException;
        //  12     17     59     67     Landroid/content/ActivityNotFoundException;
        //  28     43     67     72     Landroid/content/ActivityNotFoundException;
        //  60     62     62     67     Landroid/content/ActivityNotFoundException;
        //  64     67     67     72     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
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
    
    CharSequence getTitleForItemView(final MenuView$ItemView menuView$ItemView) {
        if (menuView$ItemView != null) {
            try {
                if (menuView$ItemView.prefersCondensedTitle()) {
                    return this.getTitleCondensed();
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
        return this.getTitle();
    }
    
    public boolean hasCollapsibleActionView() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mShowAsAction:I
        //     4: istore          4
        //     6: iload           4
        //     8: bipush          8
        //    10: iand           
        //    11: istore          5
        //    13: iconst_0       
        //    14: istore          6
        //    16: iload           5
        //    18: ifeq            68
        //    21: aload_0        
        //    22: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //    25: astore          7
        //    27: aload           7
        //    29: ifnonnull       51
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    36: ifnull          51
        //    39: aload_0        
        //    40: aload_0        
        //    41: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    44: aload_0        
        //    45: invokevirtual   android/support/v4/view/ActionProvider.onCreateActionView:(Landroid/view/MenuItem;)Landroid/view/View;
        //    48: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //    51: aload_0        
        //    52: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //    55: astore          9
        //    57: iconst_0       
        //    58: istore          6
        //    60: aload           9
        //    62: ifnull          68
        //    65: iconst_1       
        //    66: istore          6
        //    68: iload           6
        //    70: ireturn        
        //    71: astore_1       
        //    72: aload_1        
        //    73: athrow         
        //    74: astore_2       
        //    75: aload_2        
        //    76: athrow         
        //    77: astore_3       
        //    78: aload_3        
        //    79: athrow         
        //    80: astore          8
        //    82: aload           8
        //    84: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      71     74     Landroid/content/ActivityNotFoundException;
        //  21     27     74     77     Landroid/content/ActivityNotFoundException;
        //  32     51     77     80     Landroid/content/ActivityNotFoundException;
        //  51     57     80     85     Landroid/content/ActivityNotFoundException;
        //  72     74     74     77     Landroid/content/ActivityNotFoundException;
        //  75     77     77     80     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 48, Size: 48
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
    
    public boolean hasSubMenu() {
        try {
            if (this.mSubMenu != null) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
        //     4: ifnull          32
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
        //    11: aload_0        
        //    12: invokeinterface android/view/MenuItem$OnMenuItemClickListener.onMenuItemClick:(Landroid/view/MenuItem;)Z
        //    17: istore          14
        //    19: iload           14
        //    21: ifeq            32
        //    24: iconst_1       
        //    25: ireturn        
        //    26: astore_1       
        //    27: aload_1        
        //    28: athrow         
        //    29: astore_2       
        //    30: aload_2        
        //    31: athrow         
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    36: aload_0        
        //    37: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    40: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getRootMenu:()Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    43: aload_0        
        //    44: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.dispatchMenuItemSelected:(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
        //    47: istore          4
        //    49: iload           4
        //    51: ifne            24
        //    54: aload_0        
        //    55: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mItemCallback:Ljava/lang/Runnable;
        //    58: ifnull          80
        //    61: aload_0        
        //    62: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mItemCallback:Ljava/lang/Runnable;
        //    65: invokeinterface java/lang/Runnable.run:()V
        //    70: iconst_1       
        //    71: ireturn        
        //    72: astore          5
        //    74: aload           5
        //    76: athrow         
        //    77: astore_3       
        //    78: aload_3        
        //    79: athrow         
        //    80: aload_0        
        //    81: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mIntent:Landroid/content/Intent;
        //    84: astore          7
        //    86: aload           7
        //    88: ifnull          125
        //    91: aload_0        
        //    92: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    95: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getContext:()Landroid/content/Context;
        //    98: aload_0        
        //    99: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mIntent:Landroid/content/Intent;
        //   102: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //   105: iconst_1       
        //   106: ireturn        
        //   107: astore          12
        //   109: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.z:[Ljava/lang/String;
        //   112: iconst_1       
        //   113: aaload         
        //   114: getstatic       android/support/v7/internal/view/menu/MenuItemImpl.z:[Ljava/lang/String;
        //   117: iconst_0       
        //   118: aaload         
        //   119: aload           12
        //   121: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   124: pop            
        //   125: aload_0        
        //   126: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //   129: astore          10
        //   131: aload           10
        //   133: ifnull          150
        //   136: aload_0        
        //   137: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //   140: invokevirtual   android/support/v4/view/ActionProvider.onPerformDefaultAction:()Z
        //   143: istore          11
        //   145: iload           11
        //   147: ifne            24
        //   150: iconst_0       
        //   151: ireturn        
        //   152: astore          6
        //   154: aload           6
        //   156: athrow         
        //   157: astore          8
        //   159: aload           8
        //   161: athrow         
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      19     26     32     Landroid/content/ActivityNotFoundException;
        //  27     29     29     32     Landroid/content/ActivityNotFoundException;
        //  32     49     77     80     Landroid/content/ActivityNotFoundException;
        //  54     70     72     77     Landroid/content/ActivityNotFoundException;
        //  80     86     152    157    Ljava/lang/IllegalArgumentException;
        //  91     105    107    125    Landroid/content/ActivityNotFoundException;
        //  91     105    152    157    Ljava/lang/IllegalArgumentException;
        //  125    131    157    162    Landroid/content/ActivityNotFoundException;
        //  136    145    162    167    Landroid/content/ActivityNotFoundException;
        //  159    162    162    167    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    public boolean isActionButton() {
        try {
            if ((this.mFlags & 0x20) == 0x20) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }
    
    public boolean isCheckable() {
        try {
            if ((this.mFlags & 0x1) == 0x1) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isChecked() {
        try {
            if ((this.mFlags & 0x2) == 0x2) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isEnabled() {
        try {
            if ((this.mFlags & 0x10) != 0x0) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isExclusiveCheckable() {
        try {
            if ((this.mFlags & 0x4) != 0x0) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isVisible() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          71
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    15: invokevirtual   android/support/v4/view/ActionProvider.overridesItemVisibility:()Z
        //    18: istore          8
        //    20: iload           8
        //    22: ifeq            71
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    29: istore          9
        //    31: iload           9
        //    33: bipush          8
        //    35: iand           
        //    36: ifne            69
        //    39: aload_0        
        //    40: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    43: invokevirtual   android/support/v4/view/ActionProvider.isVisible:()Z
        //    46: istore          10
        //    48: iload           10
        //    50: ifeq            69
        //    53: iconst_1       
        //    54: ireturn        
        //    55: astore_1       
        //    56: aload_1        
        //    57: athrow         
        //    58: astore_2       
        //    59: aload_2        
        //    60: athrow         
        //    61: astore_3       
        //    62: aload_3        
        //    63: athrow         
        //    64: astore          4
        //    66: aload           4
        //    68: athrow         
        //    69: iconst_0       
        //    70: ireturn        
        //    71: aload_0        
        //    72: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    75: istore          7
        //    77: iload           7
        //    79: bipush          8
        //    81: iand           
        //    82: ifeq            53
        //    85: iconst_0       
        //    86: ireturn        
        //    87: astore          6
        //    89: aload           6
        //    91: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      55     58     Landroid/content/ActivityNotFoundException;
        //  11     20     58     61     Landroid/content/ActivityNotFoundException;
        //  25     31     61     64     Landroid/content/ActivityNotFoundException;
        //  39     48     64     69     Landroid/content/ActivityNotFoundException;
        //  56     58     58     61     Landroid/content/ActivityNotFoundException;
        //  59     61     61     64     Landroid/content/ActivityNotFoundException;
        //  62     64     64     69     Landroid/content/ActivityNotFoundException;
        //  71     77     87     92     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 52, Size: 52
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
    
    public boolean requestsActionButton() {
        try {
            if ((this.mShowAsAction & 0x1) == 0x1) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean requiresActionButton() {
        try {
            if ((this.mShowAsAction & 0x2) == 0x2) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    public MenuItem setActionProvider(final android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException(MenuItemImpl.z[2]);
    }
    
    public SupportMenuItem setActionView(final int n) {
        final Context context = this.mMenu.getContext();
        this.setActionView(LayoutInflater.from(context).inflate(n, (ViewGroup)new LinearLayout(context), false));
        return this;
    }
    
    public SupportMenuItem setActionView(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //     5: aload_0        
        //     6: aconst_null    
        //     7: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    10: aload_1        
        //    11: ifnull          41
        //    14: aload_1        
        //    15: invokevirtual   android/view/View.getId:()I
        //    18: istore          5
        //    20: iload           5
        //    22: iconst_m1      
        //    23: if_icmpne       41
        //    26: aload_0        
        //    27: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mId:I
        //    30: ifle            41
        //    33: aload_1        
        //    34: aload_0        
        //    35: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mId:I
        //    38: invokevirtual   android/view/View.setId:(I)V
        //    41: aload_0        
        //    42: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    45: aload_0        
        //    46: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemActionRequestChanged:(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
        //    49: aload_0        
        //    50: areturn        
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      10     51     54     Landroid/content/ActivityNotFoundException;
        //  14     20     54     57     Landroid/content/ActivityNotFoundException;
        //  26     41     57     62     Landroid/content/ActivityNotFoundException;
        //  52     54     54     57     Landroid/content/ActivityNotFoundException;
        //  55     57     57     62     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    public MenuItem setActionView(final int actionView) {
        return (MenuItem)this.setActionView(actionView);
    }
    
    @Override
    public MenuItem setActionView(final View actionView) {
        return (MenuItem)this.setActionView(actionView);
    }
    
    public void setActionViewExpanded(final boolean mIsActionViewExpanded) {
        this.mIsActionViewExpanded = mIsActionViewExpanded;
        this.mMenu.onItemsChanged(false);
    }
    
    public MenuItem setAlphabeticShortcut(final char c) {
        try {
            if (this.mShortcutAlphabeticChar == c) {
                return (MenuItem)this;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     4: istore_2       
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     9: istore          4
        //    11: iload           4
        //    13: bipush          -2
        //    15: iand           
        //    16: istore          5
        //    18: iconst_0       
        //    19: istore          6
        //    21: iload_1        
        //    22: ifeq            28
        //    25: iconst_1       
        //    26: istore          6
        //    28: iload           6
        //    30: iload           5
        //    32: ior            
        //    33: istore          7
        //    35: aload_0        
        //    36: iload           7
        //    38: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    41: iload_2        
        //    42: aload_0        
        //    43: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    46: if_icmpeq       57
        //    49: aload_0        
        //    50: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    53: iconst_0       
        //    54: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemsChanged:(Z)V
        //    57: aload_0        
        //    58: areturn        
        //    59: astore_3       
        //    60: aload_3        
        //    61: athrow         
        //    62: astore          8
        //    64: aload           8
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      11     59     62     Landroid/content/ActivityNotFoundException;
        //  35     57     62     67     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    public MenuItem setChecked(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     4: istore          4
        //     6: iload           4
        //     8: iconst_4       
        //     9: iand           
        //    10: ifeq            27
        //    13: aload_0        
        //    14: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    17: aload_0        
        //    18: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.setExclusiveItemChecked:(Landroid/view/MenuItem;)V
        //    21: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //    24: ifeq            40
        //    27: aload_0        
        //    28: iload_1        
        //    29: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.setCheckedInt:(Z)V
        //    32: aload_0        
        //    33: areturn        
        //    34: astore_2       
        //    35: aload_2        
        //    36: athrow         
        //    37: astore_3       
        //    38: aload_3        
        //    39: athrow         
        //    40: aload_0        
        //    41: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      34     37     Landroid/content/ActivityNotFoundException;
        //  13     27     37     40     Landroid/content/ActivityNotFoundException;
        //  27     32     37     40     Landroid/content/ActivityNotFoundException;
        //  35     37     37     40     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    void setCheckedInt(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     4: istore_2       
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     9: istore          4
        //    11: iload           4
        //    13: bipush          -3
        //    15: iand           
        //    16: istore          5
        //    18: iconst_0       
        //    19: istore          6
        //    21: iload_1        
        //    22: ifeq            28
        //    25: iconst_2       
        //    26: istore          6
        //    28: iload           6
        //    30: iload           5
        //    32: ior            
        //    33: istore          7
        //    35: aload_0        
        //    36: iload           7
        //    38: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    41: iload_2        
        //    42: aload_0        
        //    43: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    46: if_icmpeq       57
        //    49: aload_0        
        //    50: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    53: iconst_0       
        //    54: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemsChanged:(Z)V
        //    57: return         
        //    58: astore_3       
        //    59: aload_3        
        //    60: athrow         
        //    61: astore          8
        //    63: aload           8
        //    65: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      11     58     61     Landroid/content/ActivityNotFoundException;
        //  35     57     61     66     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    public MenuItem setEnabled(final boolean b) {
        Label_0021: {
            if (!b) {
                break Label_0021;
            }
            try {
                this.mFlags |= 0x10;
                if (MenuBuilder.a != 0) {
                    this.mFlags &= 0xFFFFFFEF;
                }
                this.mMenu.onItemsChanged(false);
                return (MenuItem)this;
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    public void setExclusiveCheckable(final boolean b) {
        while (true) {
            while (true) {
                try {
                    final int n = this.mFlags & 0xFFFFFFFB;
                    if (b) {
                        final int n2 = 4;
                        this.mFlags = (n2 | n);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public MenuItem setIcon(final int mIconResId) {
        this.mIconDrawable = null;
        this.mIconResId = mIconResId;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable mIconDrawable) {
        this.mIconResId = 0;
        this.mIconDrawable = mIconDrawable;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent mIntent) {
        this.mIntent = mIntent;
        return (MenuItem)this;
    }
    
    public void setIsActionButton(final boolean b) {
        Label_0021: {
            if (!b) {
                break Label_0021;
            }
            try {
                this.mFlags |= 0x20;
                if (MenuBuilder.a != 0) {
                    this.mFlags &= 0xFFFFFFDF;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    void setMenuInfo(final ContextMenu$ContextMenuInfo mMenuInfo) {
        this.mMenuInfo = mMenuInfo;
    }
    
    public MenuItem setNumericShortcut(final char mShortcutNumericChar) {
        try {
            if (this.mShortcutNumericChar == mShortcutNumericChar) {
                return (MenuItem)this;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        this.mShortcutNumericChar = mShortcutNumericChar;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException(MenuItemImpl.z[3]);
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener mClickListener) {
        this.mClickListener = mClickListener;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char mShortcutNumericChar, final char c) {
        this.mShortcutNumericChar = mShortcutNumericChar;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    @Override
    public void setShowAsAction(final int mShowAsAction) {
        while (true) {
            switch (mShowAsAction & 0x3) {
                case 0:
                case 1:
                case 2: {
                    if (MenuBuilder.a == 0) {
                        this.mShowAsAction = mShowAsAction;
                        this.mMenu.onItemActionRequestChanged(this);
                        return;
                    }
                    break;
                }
            }
            try {
                throw new IllegalArgumentException(MenuItemImpl.z[5]);
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            continue;
        }
    }
    
    public SupportMenuItem setShowAsActionFlags(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
    
    @Override
    public MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        return (MenuItem)this.setShowAsActionFlags(showAsActionFlags);
    }
    
    void setSubMenu(final SubMenuBuilder mSubMenu) {
        (this.mSubMenu = mSubMenu).setHeaderTitle(this.getTitle());
    }
    
    @Override
    public SupportMenuItem setSupportActionProvider(final ActionProvider p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //     4: ifnull          15
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    11: aconst_null    
        //    12: invokevirtual   android/support/v4/view/ActionProvider.setVisibilityListener:(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionView:Landroid/view/View;
        //    20: aload_0        
        //    21: aload_1        
        //    22: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    25: aload_0        
        //    26: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    29: iconst_1       
        //    30: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemsChanged:(Z)V
        //    33: aload_0        
        //    34: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    37: ifnull          55
        //    40: aload_0        
        //    41: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mActionProvider:Landroid/support/v4/view/ActionProvider;
        //    44: new             Landroid/support/v7/internal/view/menu/MenuItemImpl$1;
        //    47: dup            
        //    48: aload_0        
        //    49: invokespecial   android/support/v7/internal/view/menu/MenuItemImpl$1.<init>:(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
        //    52: invokevirtual   android/support/v4/view/ActionProvider.setVisibilityListener:(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
        //    55: aload_0        
        //    56: areturn        
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: astore_3       
        //    61: aload_3        
        //    62: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      15     57     60     Landroid/content/ActivityNotFoundException;
        //  15     55     60     63     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0015:
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
    public SupportMenuItem setSupportOnActionExpandListener(final MenuItemCompat$OnActionExpandListener mOnActionExpandListener) {
        this.mOnActionExpandListener = mOnActionExpandListener;
        return this;
    }
    
    public MenuItem setTitle(final int n) {
        return this.setTitle(this.mMenu.getContext().getString(n));
    }
    
    public MenuItem setTitle(final CharSequence charSequence) {
        try {
            this.mTitle = charSequence;
            this.mMenu.onItemsChanged(false);
            if (this.mSubMenu != null) {
                this.mSubMenu.setHeaderTitle(charSequence);
            }
            return (MenuItem)this;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public MenuItem setTitleCondensed(final CharSequence mTitleCondensed) {
        this.mTitleCondensed = mTitleCondensed;
        if (mTitleCondensed == null) {
            final CharSequence mTitle = this.mTitle;
        }
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean visibleInt) {
        try {
            if (this.setVisibleInt(visibleInt)) {
                this.mMenu.onItemVisibleChanged(this);
            }
            return (MenuItem)this;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    boolean setVisibleInt(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     4: istore_2       
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //     9: istore          4
        //    11: iload           4
        //    13: bipush          -9
        //    15: iand           
        //    16: istore          5
        //    18: iload_1        
        //    19: ifeq            62
        //    22: iconst_0       
        //    23: istore          6
        //    25: iload           6
        //    27: iload           5
        //    29: ior            
        //    30: istore          7
        //    32: aload_0        
        //    33: iload           7
        //    35: putfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    38: aload_0        
        //    39: getfield        android/support/v7/internal/view/menu/MenuItemImpl.mFlags:I
        //    42: istore          9
        //    44: iconst_0       
        //    45: istore          10
        //    47: iload_2        
        //    48: iload           9
        //    50: if_icmpeq       56
        //    53: iconst_1       
        //    54: istore          10
        //    56: iload           10
        //    58: ireturn        
        //    59: astore_3       
        //    60: aload_3        
        //    61: athrow         
        //    62: bipush          8
        //    64: istore          6
        //    66: goto            25
        //    69: astore          8
        //    71: aload           8
        //    73: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      11     59     62     Landroid/content/ActivityNotFoundException;
        //  32     44     69     74     Landroid/content/ActivityNotFoundException;
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
    
    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }
    
    boolean shouldShowShortcut() {
        try {
            if (!this.mMenu.isShortcutsVisible()) {
                return false;
            }
            final MenuItemImpl menuItemImpl = this;
            final char c = menuItemImpl.getShortcut();
            if (c != '\0') {
                return true;
            }
            return false;
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        try {
            final MenuItemImpl menuItemImpl = this;
            final char c = menuItemImpl.getShortcut();
            if (c != '\0') {
                return true;
            }
        }
        catch (ActivityNotFoundException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean showsTextAsAction() {
        try {
            if ((this.mShowAsAction & 0x4) == 0x4) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.mTitle.toString();
    }
}
