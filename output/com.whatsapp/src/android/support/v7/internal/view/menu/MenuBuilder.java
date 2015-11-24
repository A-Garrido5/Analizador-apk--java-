// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.util.SparseArray;
import android.support.v4.view.MenuItemCompat;
import android.os.Bundle;
import java.util.List;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.content.res.Resources;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Context;
import java.util.ArrayList;
import android.support.v4.internal.view.SupportMenu;

public class MenuBuilder implements SupportMenu
{
    public static int a;
    private static final int[] sCategoryToOrder;
    private static final String[] z;
    private ArrayList mActionItems;
    private MenuBuilder$Callback mCallback;
    private final Context mContext;
    private ContextMenu$ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;
    
    static {
        final String[] z2 = new String[4];
        String s = "$(yyW,\"'f]+3'n@5'so]!'~\u007fQ*(kb]2";
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
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = 'E';
                        break;
                    }
                    case 1: {
                        c2 = 'F';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "$(yyW,\"'f]+3'n@5'so]!'~\u007fQ*(kb]2";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*4ynJe\"rnKe(r\u007f\u0018&)s\u007fY,(=j\u00183'qb\\e%|\u007f]\")or\u0016";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "$(yyW,\"'f]+3'j[1/reN,#jxL$2xx";
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
        sCategoryToOrder = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public MenuBuilder(final Context mContext) {
        final int a = MenuBuilder.a;
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = new ArrayList();
        this.mPresenters = new CopyOnWriteArrayList();
        this.mContext = mContext;
        this.mResources = mContext.getResources();
        this.mItems = new ArrayList();
        this.mVisibleItems = new ArrayList();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList();
        this.mNonActionItems = new ArrayList();
        this.setShortcutsVisibleInner(this.mIsActionItemsStale = true);
        if (AppCompatActivity.b) {
            MenuBuilder.a = a + 1;
        }
    }
    
    private MenuItem addInternal(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int ordering = getOrdering(n3);
        final MenuItemImpl newMenuItem = this.createNewMenuItem(n, n2, n3, ordering, charSequence, this.mDefaultShowAsAction);
        try {
            if (this.mCurrentMenuInfo != null) {
                newMenuItem.setMenuInfo(this.mCurrentMenuInfo);
            }
            this.mItems.add(findInsertIndex(this.mItems, ordering), newMenuItem);
            this.onItemsChanged(true);
            return (MenuItem)newMenuItem;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private MenuItemImpl createNewMenuItem(final int n, final int n2, final int n3, final int n4, final CharSequence charSequence, final int n5) {
        return new MenuItemImpl(this, n, n2, n3, n4, charSequence, n5);
    }
    
    private void dispatchPresenterUpdate(final boolean b) {
        final int a = MenuBuilder.a;
        try {
            if (this.mPresenters.isEmpty()) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.stopDispatchingItemsChanged();
        final Iterator<WeakReference<MenuPresenter>> iterator = (Iterator<WeakReference<MenuPresenter>>)this.mPresenters.iterator();
        while (true) {
            Label_0098: {
                if (!iterator.hasNext()) {
                    break Label_0098;
                }
                final WeakReference<MenuPresenter> weakReference = iterator.next();
                final MenuPresenter menuPresenter = weakReference.get();
                Label_0086: {
                    if (menuPresenter != null) {
                        break Label_0086;
                    }
                    try {
                        this.mPresenters.remove(weakReference);
                        if (a != 0) {
                            menuPresenter.updateMenuView(b);
                        }
                        if (a != 0) {
                            this.startDispatchingItemsChanged();
                            return;
                        }
                        continue;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    private boolean dispatchSubMenuSelected(final SubMenuBuilder subMenuBuilder, final MenuPresenter menuPresenter) {
        boolean b;
        while (true) {
            final int a = MenuBuilder.a;
            try {
                final boolean empty = this.mPresenters.isEmpty();
                final boolean onSubMenuSelected = false;
                if (empty) {
                    return onSubMenuSelected;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            boolean onSubMenuSelected2 = false;
            if (menuPresenter != null) {
                onSubMenuSelected2 = menuPresenter.onSubMenuSelected(subMenuBuilder);
            }
            final Iterator<WeakReference<MenuPresenter>> iterator = this.mPresenters.iterator();
            b = onSubMenuSelected2;
            while (iterator.hasNext()) {
                final WeakReference<MenuPresenter> weakReference = iterator.next();
                final MenuPresenter menuPresenter2 = weakReference.get();
                Label_0109: {
                    if (menuPresenter2 != null) {
                        break Label_0109;
                    }
                    while (true) {
                        while (true) {
                            try {
                                this.mPresenters.remove(weakReference);
                                if (a != 0) {
                                    if (!b) {
                                        final boolean onSubMenuSelected = menuPresenter2.onSubMenuSelected(subMenuBuilder);
                                        if (a == 0) {
                                            b = onSubMenuSelected;
                                            break;
                                        }
                                        return onSubMenuSelected;
                                    }
                                }
                            }
                            catch (IllegalArgumentException ex2) {
                                throw ex2;
                            }
                            final boolean onSubMenuSelected = b;
                            continue;
                        }
                    }
                }
            }
            break;
        }
        return b;
    }
    
    private static int findInsertIndex(final ArrayList list, final int n) {
        final int a = MenuBuilder.a;
        int n2;
        for (int i = -1 + list.size(); i >= 0; i = n2) {
            final MenuItemImpl menuItemImpl = list.get(i);
            try {
                if (menuItemImpl.getOrdering() <= n) {
                    return i + 1;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n2 = i - 1;
            if (a != 0) {
                break;
            }
        }
        return 0;
    }
    
    private static int getOrdering(final int n) {
        final int n2 = (0xFFFF0000 & n) >> 16;
        while (true) {
            if (n2 >= 0) {
                try {
                    if (n2 >= MenuBuilder.sCategoryToOrder.length) {
                        throw new IllegalArgumentException(MenuBuilder.z[2]);
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return MenuBuilder.sCategoryToOrder[n2] << 16 | (0xFFFF & n);
            }
            continue;
        }
    }
    
    private void removeItemAtInt(final int n, final boolean b) {
        if (n < 0) {
            return;
        }
        while (true) {
            try {
                if (n >= this.mItems.size()) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                this.mItems.remove(n);
                if (b) {
                    this.onItemsChanged(true);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    private void setHeaderInternal(final int p0, final CharSequence p1, final int p2, final Drawable p3, final View p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore          6
        //     5: aload_0        
        //     6: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getResources:()Landroid/content/res/Resources;
        //     9: astore          7
        //    11: aload           5
        //    13: ifnull          37
        //    16: aload_0        
        //    17: aload           5
        //    19: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderView:Landroid/view/View;
        //    22: aload_0        
        //    23: aconst_null    
        //    24: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderTitle:Ljava/lang/CharSequence;
        //    27: aload_0        
        //    28: aconst_null    
        //    29: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderIcon:Landroid/graphics/drawable/Drawable;
        //    32: iload           6
        //    34: ifeq            102
        //    37: iload_1        
        //    38: ifle            56
        //    41: aload_0        
        //    42: aload           7
        //    44: iload_1        
        //    45: invokevirtual   android/content/res/Resources.getText:(I)Ljava/lang/CharSequence;
        //    48: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderTitle:Ljava/lang/CharSequence;
        //    51: iload           6
        //    53: ifeq            65
        //    56: aload_2        
        //    57: ifnull          65
        //    60: aload_0        
        //    61: aload_2        
        //    62: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderTitle:Ljava/lang/CharSequence;
        //    65: iload_3        
        //    66: ifle            86
        //    69: aload_0        
        //    70: aload_0        
        //    71: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getContext:()Landroid/content/Context;
        //    74: iload_3        
        //    75: invokestatic    android/support/v4/content/ContextCompat.getDrawable:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //    78: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderIcon:Landroid/graphics/drawable/Drawable;
        //    81: iload           6
        //    83: ifeq            97
        //    86: aload           4
        //    88: ifnull          97
        //    91: aload_0        
        //    92: aload           4
        //    94: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderIcon:Landroid/graphics/drawable/Drawable;
        //    97: aload_0        
        //    98: aconst_null    
        //    99: putfield        android/support/v7/internal/view/menu/MenuBuilder.mHeaderView:Landroid/view/View;
        //   102: aload_0        
        //   103: iconst_0       
        //   104: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemsChanged:(Z)V
        //   107: return         
        //   108: astore          12
        //   110: aload           12
        //   112: athrow         
        //   113: astore          13
        //   115: aload           13
        //   117: athrow         
        //   118: astore          11
        //   120: aload           11
        //   122: athrow         
        //   123: astore          10
        //   125: aload           10
        //   127: athrow         
        //   128: astore          9
        //   130: aload           9
        //   132: athrow         
        //   133: astore          8
        //   135: aload           8
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  16     32     108    118    Ljava/lang/IllegalArgumentException;
        //  41     51     118    123    Ljava/lang/IllegalArgumentException;
        //  60     65     123    128    Ljava/lang/IllegalArgumentException;
        //  69     81     128    133    Ljava/lang/IllegalArgumentException;
        //  91     97     133    138    Ljava/lang/IllegalArgumentException;
        //  110    113    113    118    Ljava/lang/IllegalArgumentException;
        //  115    118    118    123    Ljava/lang/IllegalArgumentException;
        //  120    123    123    128    Ljava/lang/IllegalArgumentException;
        //  130    133    133    138    Ljava/lang/IllegalArgumentException;
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
    
    private void setShortcutsVisibleInner(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: iload_1        
        //     3: ifeq            55
        //     6: aload_0        
        //     7: getfield        android/support/v7/internal/view/menu/MenuBuilder.mResources:Landroid/content/res/Resources;
        //    10: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //    13: getfield        android/content/res/Configuration.keyboard:I
        //    16: istore          5
        //    18: iload           5
        //    20: iload_2        
        //    21: if_icmpeq       55
        //    24: aload_0        
        //    25: getfield        android/support/v7/internal/view/menu/MenuBuilder.mResources:Landroid/content/res/Resources;
        //    28: getstatic       android/support/v7/appcompat/R$bool.abc_config_showMenuShortcutsWhenKeyboardPresent:I
        //    31: invokevirtual   android/content/res/Resources.getBoolean:(I)Z
        //    34: istore          6
        //    36: iload           6
        //    38: ifeq            55
        //    41: aload_0        
        //    42: iload_2        
        //    43: putfield        android/support/v7/internal/view/menu/MenuBuilder.mShortcutsVisible:Z
        //    46: return         
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: astore          4
        //    52: aload           4
        //    54: athrow         
        //    55: iconst_0       
        //    56: istore_2       
        //    57: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      18     47     50     Ljava/lang/IllegalArgumentException;
        //  24     36     50     55     Ljava/lang/IllegalArgumentException;
        //  48     50     50     55     Ljava/lang/IllegalArgumentException;
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
    
    public MenuItem add(final int n) {
        return this.addInternal(0, 0, 0, this.mResources.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.addInternal(n, n2, n3, this.mResources.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.addInternal(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.addInternal(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int p0, final int p1, final int p2, final ComponentName p3, final Intent[] p4, final Intent p5, final int p6, final MenuItem[] p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore          9
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuBuilder.mContext:Landroid/content/Context;
        //     9: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    12: astore          10
        //    14: aload           10
        //    16: aload           4
        //    18: aload           5
        //    20: aload           6
        //    22: iconst_0       
        //    23: invokevirtual   android/content/pm/PackageManager.queryIntentActivityOptions:(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
        //    26: astore          11
        //    28: aload           11
        //    30: ifnull          218
        //    33: aload           11
        //    35: invokeinterface java/util/List.size:()I
        //    40: istore          25
        //    42: iload           25
        //    44: istore          12
        //    46: iload           7
        //    48: iconst_1       
        //    49: iand           
        //    50: ifne            58
        //    53: aload_0        
        //    54: iload_1        
        //    55: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.removeGroup:(I)V
        //    58: iconst_0       
        //    59: istore          13
        //    61: iload           13
        //    63: iload           12
        //    65: if_icmpge       210
        //    68: aload           11
        //    70: iload           13
        //    72: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    77: checkcast       Landroid/content/pm/ResolveInfo;
        //    80: astore          14
        //    82: aload           14
        //    84: getfield        android/content/pm/ResolveInfo.specificIndex:I
        //    87: istore          16
        //    89: iload           16
        //    91: ifge            234
        //    94: aload           6
        //    96: astore          17
        //    98: new             Landroid/content/Intent;
        //   101: dup            
        //   102: aload           17
        //   104: invokespecial   android/content/Intent.<init>:(Landroid/content/Intent;)V
        //   107: astore          18
        //   109: aload           18
        //   111: new             Landroid/content/ComponentName;
        //   114: dup            
        //   115: aload           14
        //   117: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   120: getfield        android/content/pm/ActivityInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   123: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //   126: aload           14
        //   128: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   131: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //   134: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   137: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   140: pop            
        //   141: aload_0        
        //   142: iload_1        
        //   143: iload_2        
        //   144: iload_3        
        //   145: aload           14
        //   147: aload           10
        //   149: invokevirtual   android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
        //   152: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   155: aload           14
        //   157: aload           10
        //   159: invokevirtual   android/content/pm/ResolveInfo.loadIcon:(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
        //   162: invokeinterface android/view/MenuItem.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
        //   167: aload           18
        //   169: invokeinterface android/view/MenuItem.setIntent:(Landroid/content/Intent;)Landroid/view/MenuItem;
        //   174: astore          20
        //   176: aload           8
        //   178: ifnull          199
        //   181: aload           14
        //   183: getfield        android/content/pm/ResolveInfo.specificIndex:I
        //   186: iflt            199
        //   189: aload           8
        //   191: aload           14
        //   193: getfield        android/content/pm/ResolveInfo.specificIndex:I
        //   196: aload           20
        //   198: aastore        
        //   199: iload           13
        //   201: iconst_1       
        //   202: iadd           
        //   203: istore          21
        //   205: iload           9
        //   207: ifeq            252
        //   210: iload           12
        //   212: ireturn        
        //   213: astore          24
        //   215: aload           24
        //   217: athrow         
        //   218: iconst_0       
        //   219: istore          12
        //   221: goto            46
        //   224: astore          23
        //   226: aload           23
        //   228: athrow         
        //   229: astore          15
        //   231: aload           15
        //   233: athrow         
        //   234: aload           5
        //   236: aload           14
        //   238: getfield        android/content/pm/ResolveInfo.specificIndex:I
        //   241: aaload         
        //   242: astore          17
        //   244: goto            98
        //   247: astore          22
        //   249: aload           22
        //   251: athrow         
        //   252: iload           21
        //   254: istore          13
        //   256: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  33     42     213    218    Ljava/lang/IllegalArgumentException;
        //  53     58     224    229    Ljava/lang/IllegalArgumentException;
        //  82     89     229    234    Ljava/lang/IllegalArgumentException;
        //  181    199    247    252    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 119, Size: 119
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
    
    public void addMenuPresenter(final MenuPresenter menuPresenter) {
        this.addMenuPresenter(menuPresenter, this.mContext);
    }
    
    public void addMenuPresenter(final MenuPresenter menuPresenter, final Context context) {
        this.mPresenters.add(new WeakReference<MenuPresenter>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.mResources.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.mResources.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final MenuItemImpl menuItemImpl = (MenuItemImpl)this.addInternal(n, n2, n3, charSequence);
        final SubMenuBuilder subMenu = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenu);
        return (SubMenu)subMenu;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public void changeMenuMode() {
        try {
            if (this.mCallback != null) {
                this.mCallback.onMenuModeChange(this);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void clear() {
        try {
            if (this.mExpandedItem != null) {
                this.collapseItemActionView(this.mExpandedItem);
            }
            this.mItems.clear();
            this.onItemsChanged(true);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        this.onItemsChanged(false);
    }
    
    public void close() {
        this.close(true);
    }
    
    public final void close(final boolean b) {
        final int a = MenuBuilder.a;
        try {
            if (this.mIsClosing) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.mIsClosing = true;
        final Iterator<WeakReference<MenuPresenter>> iterator = (Iterator<WeakReference<MenuPresenter>>)this.mPresenters.iterator();
        while (true) {
            Label_0097: {
                if (!iterator.hasNext()) {
                    break Label_0097;
                }
                final WeakReference<MenuPresenter> weakReference = iterator.next();
                final MenuPresenter menuPresenter = weakReference.get();
                Label_0084: {
                    if (menuPresenter != null) {
                        break Label_0084;
                    }
                    try {
                        this.mPresenters.remove(weakReference);
                        if (a != 0) {
                            menuPresenter.onCloseMenu(this, b);
                        }
                        if (a != 0) {
                            this.mIsClosing = false;
                            return;
                        }
                        continue;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    public boolean collapseItemActionView(final MenuItemImpl menuItemImpl) {
        final int a = MenuBuilder.a;
        boolean collapseItemActionView = false;
        Label_0039: {
            try {
                final boolean empty = this.mPresenters.isEmpty();
                collapseItemActionView = false;
                if (empty) {
                    return collapseItemActionView;
                }
                final MenuBuilder menuBuilder = this;
                final MenuItemImpl menuItemImpl2 = menuBuilder.mExpandedItem;
                final MenuItemImpl menuItemImpl3 = menuItemImpl;
                if (menuItemImpl2 != menuItemImpl3) {
                    return false;
                }
                break Label_0039;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final MenuBuilder menuBuilder = this;
                final MenuItemImpl menuItemImpl2 = menuBuilder.mExpandedItem;
                final MenuItemImpl menuItemImpl3 = menuItemImpl;
                if (menuItemImpl2 != menuItemImpl3) {
                    return false;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        this.stopDispatchingItemsChanged();
        final Iterator iterator = this.mPresenters.iterator();
        boolean b2 = false;
    Label_0178:
        while (true) {
            Label_0130: {
                if (!iterator.hasNext()) {
                    collapseItemActionView = b2;
                    break Label_0130;
                }
                final WeakReference<MenuPresenter> weakReference = iterator.next();
                final MenuPresenter menuPresenter = weakReference.get();
                Label_0106: {
                    if (menuPresenter != null) {
                        break Label_0106;
                    }
                    while (true) {
                    Label_0157:
                        while (true) {
                            Label_0164: {
                                try {
                                    this.mPresenters.remove(weakReference);
                                    if (a == 0) {
                                        break Label_0164;
                                    }
                                    collapseItemActionView = menuPresenter.collapseItemActionView(this, menuItemImpl);
                                    if (!collapseItemActionView || a != 0) {
                                        if (a == 0) {
                                            break Label_0157;
                                        }
                                    }
                                    try {
                                        this.startDispatchingItemsChanged();
                                        if (collapseItemActionView) {
                                            this.mExpandedItem = null;
                                            return collapseItemActionView;
                                        }
                                        break Label_0178;
                                    }
                                    catch (IllegalArgumentException ex3) {
                                        throw ex3;
                                    }
                                }
                                catch (IllegalArgumentException ex4) {
                                    throw ex4;
                                }
                                break Label_0157;
                            }
                            collapseItemActionView = b2;
                            continue;
                        }
                        b2 = collapseItemActionView;
                        break;
                    }
                }
            }
        }
        return collapseItemActionView;
    }
    
    boolean dispatchMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        try {
            if (this.mCallback == null) {
                return false;
            }
            final MenuBuilder menuBuilder2 = this;
            final MenuBuilder$Callback menuBuilder$Callback = menuBuilder2.mCallback;
            final MenuBuilder menuBuilder3 = menuBuilder;
            final MenuItem menuItem2 = menuItem;
            final boolean b = menuBuilder$Callback.onMenuItemSelected(menuBuilder3, menuItem2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final MenuBuilder menuBuilder2 = this;
            final MenuBuilder$Callback menuBuilder$Callback = menuBuilder2.mCallback;
            final MenuBuilder menuBuilder3 = menuBuilder;
            final MenuItem menuItem2 = menuItem;
            final boolean b = menuBuilder$Callback.onMenuItemSelected(menuBuilder3, menuItem2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean expandItemActionView(final MenuItemImpl mExpandedItem) {
        while (true) {
            final int a = MenuBuilder.a;
            boolean expandItemActionView;
            try {
                final boolean empty = this.mPresenters.isEmpty();
                expandItemActionView = false;
                if (empty) {
                    return expandItemActionView;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            this.stopDispatchingItemsChanged();
            final Iterator<WeakReference<MenuPresenter>> iterator = (Iterator<WeakReference<MenuPresenter>>)this.mPresenters.iterator();
            boolean b = false;
            while (true) {
                Label_0118: {
                    if (!iterator.hasNext()) {
                        expandItemActionView = b;
                        break Label_0118;
                    }
                    final WeakReference<MenuPresenter> weakReference = iterator.next();
                    final MenuPresenter menuPresenter = weakReference.get();
                    Label_0094: {
                        if (menuPresenter != null) {
                            break Label_0094;
                        }
                        while (true) {
                            while (true) {
                                Label_0152: {
                                    try {
                                        this.mPresenters.remove(weakReference);
                                        if (a == 0) {
                                            break Label_0152;
                                        }
                                        expandItemActionView = menuPresenter.expandItemActionView(this, mExpandedItem);
                                        if (!expandItemActionView || a != 0) {
                                            if (a == 0) {
                                                break;
                                            }
                                        }
                                        try {
                                            this.startDispatchingItemsChanged();
                                            if (expandItemActionView) {
                                                this.mExpandedItem = mExpandedItem;
                                                return expandItemActionView;
                                            }
                                            return expandItemActionView;
                                        }
                                        catch (IllegalArgumentException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    catch (IllegalArgumentException ex3) {
                                        throw ex3;
                                    }
                                    break;
                                }
                                expandItemActionView = b;
                                continue;
                            }
                        }
                    }
                }
                b = expandItemActionView;
            }
        }
    }
    
    public int findGroupIndex(final int n) {
        return this.findGroupIndex(n, 0);
    }
    
    public int findGroupIndex(final int n, int n2) {
        final int a = MenuBuilder.a;
        final int size = this.size();
        if (n2 < 0) {
            n2 = 0;
        }
        int i = n2;
        while (i < size) {
            final MenuItemImpl menuItemImpl = this.mItems.get(i);
            try {
                if (menuItemImpl.getGroupId() == n) {
                    return i;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return -1;
    }
    
    public MenuItem findItem(final int n) {
        final int a = MenuBuilder.a;
        int n2;
        for (int size = this.size(), i = 0; i < size; i = n2) {
            while (true) {
                Object item = this.mItems.get(i);
                try {
                    if (((MenuItemImpl)item).getItemId() == n) {
                        return (MenuItem)item;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                if (!((MenuItemImpl)item).hasSubMenu()) {
                    break;
                }
                item = ((MenuItemImpl)item).getSubMenu().findItem(n);
                if (item == null) {
                    break;
                }
                return (MenuItem)item;
            }
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    public int findItemIndex(final int n) {
        final int a = MenuBuilder.a;
        final int size = this.size();
        int i = 0;
        while (i < size) {
            final MenuItemImpl menuItemImpl = this.mItems.get(i);
            try {
                if (menuItemImpl.getItemId() == n) {
                    return i;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return -1;
    }
    
    MenuItemImpl findItemWithShortcutForKey(final int p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/view/menu/MenuBuilder.mTempShortcutItemList:Ljava/util/ArrayList;
        //     8: astore          4
        //    10: aload           4
        //    12: invokevirtual   java/util/ArrayList.clear:()V
        //    15: aload_0        
        //    16: aload           4
        //    18: iload_1        
        //    19: aload_2        
        //    20: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.findItemsWithShortcutForKey:(Ljava/util/List;ILandroid/view/KeyEvent;)V
        //    23: aload           4
        //    25: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    28: istore          6
        //    30: iload           6
        //    32: ifeq            46
        //    35: aconst_null    
        //    36: astore          13
        //    38: aload           13
        //    40: areturn        
        //    41: astore          5
        //    43: aload           5
        //    45: athrow         
        //    46: aload_2        
        //    47: invokevirtual   android/view/KeyEvent.getMetaState:()I
        //    50: istore          7
        //    52: new             Landroid/view/KeyCharacterMap$KeyData;
        //    55: dup            
        //    56: invokespecial   android/view/KeyCharacterMap$KeyData.<init>:()V
        //    59: astore          8
        //    61: aload_2        
        //    62: aload           8
        //    64: invokevirtual   android/view/KeyEvent.getKeyData:(Landroid/view/KeyCharacterMap$KeyData;)Z
        //    67: pop            
        //    68: aload           4
        //    70: invokevirtual   java/util/ArrayList.size:()I
        //    73: istore          10
        //    75: iload           10
        //    77: iconst_1       
        //    78: if_icmpne       100
        //    81: aload           4
        //    83: iconst_0       
        //    84: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    87: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //    90: astore          28
        //    92: aload           28
        //    94: areturn        
        //    95: astore          27
        //    97: aload           27
        //    99: athrow         
        //   100: aload_0        
        //   101: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.isQwertyMode:()Z
        //   104: istore          11
        //   106: iconst_0       
        //   107: istore          12
        //   109: iload           12
        //   111: iload           10
        //   113: if_icmpge       218
        //   116: aload           4
        //   118: iload           12
        //   120: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   123: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   126: astore          13
        //   128: iload           11
        //   130: ifeq            225
        //   133: aload           13
        //   135: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getAlphabeticShortcut:()C
        //   138: istore          26
        //   140: iload           26
        //   142: istore          14
        //   144: aload           8
        //   146: getfield        android/view/KeyCharacterMap$KeyData.meta:[C
        //   149: iconst_0       
        //   150: caload         
        //   151: istore          22
        //   153: iload           14
        //   155: iload           22
        //   157: if_icmpne       167
        //   160: iload           7
        //   162: iconst_2       
        //   163: iand           
        //   164: ifeq            38
        //   167: aload           8
        //   169: getfield        android/view/KeyCharacterMap$KeyData.meta:[C
        //   172: iconst_2       
        //   173: caload         
        //   174: istore          23
        //   176: iload           14
        //   178: iload           23
        //   180: if_icmpne       190
        //   183: iload           7
        //   185: iconst_2       
        //   186: iand           
        //   187: ifne            38
        //   190: iload           11
        //   192: ifeq            208
        //   195: iload           14
        //   197: bipush          8
        //   199: if_icmpne       208
        //   202: iload_1        
        //   203: bipush          67
        //   205: if_icmpeq       38
        //   208: iload           12
        //   210: iconst_1       
        //   211: iadd           
        //   212: istore          24
        //   214: iload_3        
        //   215: ifeq            270
        //   218: aconst_null    
        //   219: areturn        
        //   220: astore          25
        //   222: aload           25
        //   224: athrow         
        //   225: aload           13
        //   227: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getNumericShortcut:()C
        //   230: istore          14
        //   232: goto            144
        //   235: astore          15
        //   237: aload           15
        //   239: athrow         
        //   240: astore          16
        //   242: aload           16
        //   244: athrow         
        //   245: astore          17
        //   247: aload           17
        //   249: athrow         
        //   250: astore          18
        //   252: aload           18
        //   254: athrow         
        //   255: astore          19
        //   257: aload           19
        //   259: athrow         
        //   260: astore          20
        //   262: aload           20
        //   264: athrow         
        //   265: astore          21
        //   267: aload           21
        //   269: athrow         
        //   270: iload           24
        //   272: istore          12
        //   274: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  10     30     41     46     Ljava/lang/IllegalArgumentException;
        //  81     92     95     100    Ljava/lang/IllegalArgumentException;
        //  133    140    220    225    Ljava/lang/IllegalArgumentException;
        //  144    153    235    245    Ljava/lang/IllegalArgumentException;
        //  167    176    245    270    Ljava/lang/IllegalArgumentException;
        //  237    240    240    245    Ljava/lang/IllegalArgumentException;
        //  242    245    245    270    Ljava/lang/IllegalArgumentException;
        //  247    250    250    270    Ljava/lang/IllegalArgumentException;
        //  252    255    255    270    Ljava/lang/IllegalArgumentException;
        //  257    260    260    270    Ljava/lang/IllegalArgumentException;
        //  262    265    265    270    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 142, Size: 142
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
    
    void findItemsWithShortcutForKey(final List p0, final int p1, final KeyEvent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.isQwertyMode:()Z
        //     9: istore          5
        //    11: aload_3        
        //    12: invokevirtual   android/view/KeyEvent.getMetaState:()I
        //    15: istore          6
        //    17: new             Landroid/view/KeyCharacterMap$KeyData;
        //    20: dup            
        //    21: invokespecial   android/view/KeyCharacterMap$KeyData.<init>:()V
        //    24: astore          7
        //    26: aload_3        
        //    27: aload           7
        //    29: invokevirtual   android/view/KeyEvent.getKeyData:(Landroid/view/KeyCharacterMap$KeyData;)Z
        //    32: ifne            42
        //    35: iload_2        
        //    36: bipush          67
        //    38: if_icmpeq       42
        //    41: return         
        //    42: aload_0        
        //    43: getfield        android/support/v7/internal/view/menu/MenuBuilder.mItems:Ljava/util/ArrayList;
        //    46: invokevirtual   java/util/ArrayList.size:()I
        //    49: istore          8
        //    51: iconst_0       
        //    52: istore          9
        //    54: iload           9
        //    56: iload           8
        //    58: if_icmpge       41
        //    61: aload_0        
        //    62: getfield        android/support/v7/internal/view/menu/MenuBuilder.mItems:Ljava/util/ArrayList;
        //    65: iload           9
        //    67: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    70: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //    73: astore          10
        //    75: aload           10
        //    77: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.hasSubMenu:()Z
        //    80: ifeq            97
        //    83: aload           10
        //    85: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getSubMenu:()Landroid/view/SubMenu;
        //    88: checkcast       Landroid/support/v7/internal/view/menu/MenuBuilder;
        //    91: aload_1        
        //    92: iload_2        
        //    93: aload_3        
        //    94: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.findItemsWithShortcutForKey:(Ljava/util/List;ILandroid/view/KeyEvent;)V
        //    97: iload           5
        //    99: ifeq            220
        //   102: aload           10
        //   104: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getAlphabeticShortcut:()C
        //   107: istore          24
        //   109: iload           24
        //   111: istore          12
        //   113: iload           6
        //   115: iconst_5       
        //   116: iand           
        //   117: ifne            192
        //   120: iload           12
        //   122: ifeq            192
        //   125: aload           7
        //   127: getfield        android/view/KeyCharacterMap$KeyData.meta:[C
        //   130: iconst_0       
        //   131: caload         
        //   132: istore          20
        //   134: iload           12
        //   136: iload           20
        //   138: if_icmpeq       175
        //   141: aload           7
        //   143: getfield        android/view/KeyCharacterMap$KeyData.meta:[C
        //   146: iconst_2       
        //   147: caload         
        //   148: istore          22
        //   150: iload           12
        //   152: iload           22
        //   154: if_icmpeq       175
        //   157: iload           5
        //   159: ifeq            192
        //   162: iload           12
        //   164: bipush          8
        //   166: if_icmpne       192
        //   169: iload_2        
        //   170: bipush          67
        //   172: if_icmpne       192
        //   175: aload           10
        //   177: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.isEnabled:()Z
        //   180: ifeq            192
        //   183: aload_1        
        //   184: aload           10
        //   186: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   191: pop            
        //   192: iload           9
        //   194: iconst_1       
        //   195: iadd           
        //   196: istore          13
        //   198: iload           4
        //   200: ifne            41
        //   203: iload           13
        //   205: istore          9
        //   207: goto            54
        //   210: astore          11
        //   212: aload           11
        //   214: athrow         
        //   215: astore          23
        //   217: aload           23
        //   219: athrow         
        //   220: aload           10
        //   222: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getNumericShortcut:()C
        //   225: istore          12
        //   227: goto            113
        //   230: astore          14
        //   232: aload           14
        //   234: athrow         
        //   235: astore          15
        //   237: aload           15
        //   239: athrow         
        //   240: astore          16
        //   242: aload           16
        //   244: athrow         
        //   245: astore          17
        //   247: aload           17
        //   249: athrow         
        //   250: astore          18
        //   252: aload           18
        //   254: athrow         
        //   255: astore          19
        //   257: aload           19
        //   259: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  75     97     210    215    Ljava/lang/IllegalArgumentException;
        //  102    109    215    220    Ljava/lang/IllegalArgumentException;
        //  125    134    230    235    Ljava/lang/IllegalArgumentException;
        //  141    150    235    255    Ljava/lang/IllegalArgumentException;
        //  175    192    255    260    Ljava/lang/IllegalArgumentException;
        //  232    235    235    255    Ljava/lang/IllegalArgumentException;
        //  237    240    240    255    Ljava/lang/IllegalArgumentException;
        //  242    245    245    255    Ljava/lang/IllegalArgumentException;
        //  247    250    250    255    Ljava/lang/IllegalArgumentException;
        //  252    255    255    260    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 126, Size: 126
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
    
    public void flagActionItems() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getVisibleItems:()Ljava/util/ArrayList;
        //     8: astore_2       
        //     9: aload_0        
        //    10: getfield        android/support/v7/internal/view/menu/MenuBuilder.mIsActionItemsStale:Z
        //    13: istore          4
        //    15: iload           4
        //    17: ifne            24
        //    20: return         
        //    21: astore_3       
        //    22: aload_3        
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        android/support/v7/internal/view/menu/MenuBuilder.mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    28: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
        //    31: astore          5
        //    33: iconst_0       
        //    34: istore          6
        //    36: aload           5
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            266
        //    46: aload           5
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/ref/WeakReference;
        //    56: astore          18
        //    58: aload           18
        //    60: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //    63: checkcast       Landroid/support/v7/internal/view/menu/MenuPresenter;
        //    66: astore          19
        //    68: aload           19
        //    70: ifnonnull       87
        //    73: aload_0        
        //    74: getfield        android/support/v7/internal/view/menu/MenuBuilder.mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    77: aload           18
        //    79: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: iload_1        
        //    84: ifeq            259
        //    87: iload           6
        //    89: aload           19
        //    91: invokeinterface android/support/v7/internal/view/menu/MenuPresenter.flagActionItems:()Z
        //    96: ior            
        //    97: istore          7
        //    99: iload_1        
        //   100: ifeq            252
        //   103: iload           7
        //   105: ifeq            216
        //   108: aload_0        
        //   109: getfield        android/support/v7/internal/view/menu/MenuBuilder.mActionItems:Ljava/util/ArrayList;
        //   112: invokevirtual   java/util/ArrayList.clear:()V
        //   115: aload_0        
        //   116: getfield        android/support/v7/internal/view/menu/MenuBuilder.mNonActionItems:Ljava/util/ArrayList;
        //   119: invokevirtual   java/util/ArrayList.clear:()V
        //   122: aload_2        
        //   123: invokevirtual   java/util/ArrayList.size:()I
        //   126: istore          9
        //   128: iconst_0       
        //   129: istore          10
        //   131: iload           10
        //   133: iload           9
        //   135: if_icmpge       195
        //   138: aload_2        
        //   139: iload           10
        //   141: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   144: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   147: astore          11
        //   149: aload           11
        //   151: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.isActionButton:()Z
        //   154: istore          14
        //   156: iload           14
        //   158: ifeq            175
        //   161: aload_0        
        //   162: getfield        android/support/v7/internal/view/menu/MenuBuilder.mActionItems:Ljava/util/ArrayList;
        //   165: aload           11
        //   167: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   170: pop            
        //   171: iload_1        
        //   172: ifeq            185
        //   175: aload_0        
        //   176: getfield        android/support/v7/internal/view/menu/MenuBuilder.mNonActionItems:Ljava/util/ArrayList;
        //   179: aload           11
        //   181: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   184: pop            
        //   185: iload           10
        //   187: iconst_1       
        //   188: iadd           
        //   189: istore          16
        //   191: iload_1        
        //   192: ifeq            245
        //   195: aload_0        
        //   196: iconst_0       
        //   197: putfield        android/support/v7/internal/view/menu/MenuBuilder.mIsActionItemsStale:Z
        //   200: return         
        //   201: astore          20
        //   203: aload           20
        //   205: athrow         
        //   206: astore          12
        //   208: aload           12
        //   210: athrow         
        //   211: astore          13
        //   213: aload           13
        //   215: athrow         
        //   216: aload_0        
        //   217: getfield        android/support/v7/internal/view/menu/MenuBuilder.mActionItems:Ljava/util/ArrayList;
        //   220: invokevirtual   java/util/ArrayList.clear:()V
        //   223: aload_0        
        //   224: getfield        android/support/v7/internal/view/menu/MenuBuilder.mNonActionItems:Ljava/util/ArrayList;
        //   227: invokevirtual   java/util/ArrayList.clear:()V
        //   230: aload_0        
        //   231: getfield        android/support/v7/internal/view/menu/MenuBuilder.mNonActionItems:Ljava/util/ArrayList;
        //   234: aload_0        
        //   235: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getVisibleItems:()Ljava/util/ArrayList;
        //   238: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   241: pop            
        //   242: goto            195
        //   245: iload           16
        //   247: istore          10
        //   249: goto            131
        //   252: iload           7
        //   254: istore          6
        //   256: goto            36
        //   259: iload           6
        //   261: istore          7
        //   263: goto            99
        //   266: iload           6
        //   268: istore          7
        //   270: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     21     24     Ljava/lang/IllegalArgumentException;
        //  73     83     201    206    Ljava/lang/IllegalArgumentException;
        //  149    156    206    211    Ljava/lang/IllegalArgumentException;
        //  161    171    211    216    Ljava/lang/IllegalArgumentException;
        //  175    185    211    216    Ljava/lang/IllegalArgumentException;
        //  208    211    211    216    Ljava/lang/IllegalArgumentException;
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
    
    public ArrayList getActionItems() {
        this.flagActionItems();
        return this.mActionItems;
    }
    
    protected String getActionViewStatesKey() {
        return MenuBuilder.z[3];
    }
    
    public Context getContext() {
        return this.mContext;
    }
    
    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }
    
    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }
    
    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }
    
    public View getHeaderView() {
        return this.mHeaderView;
    }
    
    public MenuItem getItem(final int n) {
        return this.mItems.get(n);
    }
    
    public ArrayList getNonActionItems() {
        this.flagActionItems();
        return this.mNonActionItems;
    }
    
    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }
    
    Resources getResources() {
        return this.mResources;
    }
    
    public MenuBuilder getRootMenu() {
        return this;
    }
    
    public ArrayList getVisibleItems() {
        final int a = MenuBuilder.a;
        try {
            if (!this.mIsVisibleItemsStale) {
                return this.mVisibleItems;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.mVisibleItems.clear();
        final int size = this.mItems.size();
        int n = 0;
        while (true) {
            int n2 = 0;
            Label_0089: {
                if (n >= size) {
                    break Label_0089;
                }
                final MenuItemImpl menuItemImpl = this.mItems.get(n);
                try {
                    if (menuItemImpl.isVisible()) {
                        this.mVisibleItems.add(menuItemImpl);
                    }
                    n2 = n + 1;
                    if (a != 0) {
                        this.mIsVisibleItemsStale = false;
                        this.mIsActionItemsStale = true;
                        return this.mVisibleItems;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            n = n2;
        }
    }
    
    public boolean hasVisibleItems() {
        final int a = MenuBuilder.a;
        int n;
        for (int size = this.size(), i = 0; i < size; i = n) {
            final MenuItemImpl menuItemImpl = this.mItems.get(i);
            try {
                if (menuItemImpl.isVisible()) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        return false;
    }
    
    boolean isQwertyMode() {
        return this.mQwertyMode;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        try {
            if (this.findItemWithShortcutForKey(n, keyEvent) != null) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }
    
    void onItemActionRequestChanged(final MenuItemImpl menuItemImpl) {
        this.onItemsChanged(this.mIsActionItemsStale = true);
    }
    
    void onItemVisibleChanged(final MenuItemImpl menuItemImpl) {
        this.onItemsChanged(this.mIsVisibleItemsStale = true);
    }
    
    public void onItemsChanged(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuBuilder.mPreventDispatchingItemsChanged:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            36
        //    11: iload_1        
        //    12: ifeq            25
        //    15: aload_0        
        //    16: iconst_1       
        //    17: putfield        android/support/v7/internal/view/menu/MenuBuilder.mIsVisibleItemsStale:Z
        //    20: aload_0        
        //    21: iconst_1       
        //    22: putfield        android/support/v7/internal/view/menu/MenuBuilder.mIsActionItemsStale:Z
        //    25: aload_0        
        //    26: iload_1        
        //    27: invokespecial   android/support/v7/internal/view/menu/MenuBuilder.dispatchPresenterUpdate:(Z)V
        //    30: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //    33: ifeq            41
        //    36: aload_0        
        //    37: iconst_1       
        //    38: putfield        android/support/v7/internal/view/menu/MenuBuilder.mItemsChangedWhileDispatchPrevented:Z
        //    41: return         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: astore_3       
        //    46: aload_3        
        //    47: athrow         
        //    48: astore          5
        //    50: aload           5
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      42     45     Ljava/lang/IllegalArgumentException;
        //  15     25     45     48     Ljava/lang/IllegalArgumentException;
        //  25     36     48     53     Ljava/lang/IllegalArgumentException;
        //  36     41     48     53     Ljava/lang/IllegalArgumentException;
        //  43     45     45     48     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 31, Size: 31
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
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.performItemAction(this.findItem(n), n2);
    }
    
    public boolean performItemAction(final MenuItem menuItem, final int n) {
        return this.performItemAction(menuItem, null, n);
    }
    
    public boolean performItemAction(final MenuItem p0, final MenuPresenter p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore          4
        //     5: aload_1        
        //     6: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //     9: astore          5
        //    11: aload           5
        //    13: ifnull          28
        //    16: aload           5
        //    18: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.isEnabled:()Z
        //    21: istore          8
        //    23: iload           8
        //    25: ifne            39
        //    28: iconst_0       
        //    29: istore          6
        //    31: iload           6
        //    33: ireturn        
        //    34: astore          7
        //    36: aload           7
        //    38: athrow         
        //    39: aload           5
        //    41: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.invoke:()Z
        //    44: istore          9
        //    46: aload           5
        //    48: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getSupportActionProvider:()Landroid/support/v4/view/ActionProvider;
        //    51: astore          10
        //    53: iconst_0       
        //    54: istore          11
        //    56: aload           10
        //    58: ifnull          79
        //    61: aload           10
        //    63: invokevirtual   android/support/v4/view/ActionProvider.hasSubMenu:()Z
        //    66: istore          22
        //    68: iconst_0       
        //    69: istore          11
        //    71: iload           22
        //    73: ifeq            79
        //    76: iconst_1       
        //    77: istore          11
        //    79: aload           5
        //    81: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.hasCollapsibleActionView:()Z
        //    84: ifeq            116
        //    87: iload           9
        //    89: aload           5
        //    91: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.expandActionView:()Z
        //    94: ior            
        //    95: istore          6
        //    97: iload           6
        //    99: ifeq            31
        //   102: aload_0        
        //   103: iconst_1       
        //   104: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.close:(Z)V
        //   107: iload           4
        //   109: ifeq            31
        //   112: iload           6
        //   114: istore          9
        //   116: aload           5
        //   118: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.hasSubMenu:()Z
        //   121: istore          15
        //   123: iload           15
        //   125: ifne            133
        //   128: iload           11
        //   130: ifeq            268
        //   133: aload_0        
        //   134: iconst_0       
        //   135: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.close:(Z)V
        //   138: aload           5
        //   140: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.hasSubMenu:()Z
        //   143: ifne            165
        //   146: aload           5
        //   148: new             Landroid/support/v7/internal/view/menu/SubMenuBuilder;
        //   151: dup            
        //   152: aload_0        
        //   153: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getContext:()Landroid/content/Context;
        //   156: aload_0        
        //   157: aload           5
        //   159: invokespecial   android/support/v7/internal/view/menu/SubMenuBuilder.<init>:(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
        //   162: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.setSubMenu:(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
        //   165: aload           5
        //   167: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getSubMenu:()Landroid/view/SubMenu;
        //   170: checkcast       Landroid/support/v7/internal/view/menu/SubMenuBuilder;
        //   173: astore          16
        //   175: iload           11
        //   177: ifeq            187
        //   180: aload           10
        //   182: aload           16
        //   184: invokevirtual   android/support/v4/view/ActionProvider.onPrepareSubMenu:(Landroid/view/SubMenu;)V
        //   187: iload           9
        //   189: aload_0        
        //   190: aload           16
        //   192: aload_2        
        //   193: invokespecial   android/support/v7/internal/view/menu/MenuBuilder.dispatchSubMenuSelected:(Landroid/support/v7/internal/view/menu/SubMenuBuilder;Landroid/support/v7/internal/view/menu/MenuPresenter;)Z
        //   196: ior            
        //   197: istore          6
        //   199: iload           6
        //   201: ifne            209
        //   204: aload_0        
        //   205: iconst_1       
        //   206: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.close:(Z)V
        //   209: iload           4
        //   211: ifeq            31
        //   214: iload_3        
        //   215: iconst_1       
        //   216: iand           
        //   217: ifne            31
        //   220: aload_0        
        //   221: iconst_1       
        //   222: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.close:(Z)V
        //   225: iload           6
        //   227: ireturn        
        //   228: astore          17
        //   230: aload           17
        //   232: athrow         
        //   233: astore          21
        //   235: aload           21
        //   237: athrow         
        //   238: astore          20
        //   240: aload           20
        //   242: athrow         
        //   243: astore          12
        //   245: aload           12
        //   247: athrow         
        //   248: astore          13
        //   250: aload           13
        //   252: athrow         
        //   253: astore          14
        //   255: aload           14
        //   257: athrow         
        //   258: astore          19
        //   260: aload           19
        //   262: athrow         
        //   263: astore          18
        //   265: aload           18
        //   267: athrow         
        //   268: iload           9
        //   270: istore          6
        //   272: goto            214
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  16     23     34     39     Ljava/lang/IllegalArgumentException;
        //  61     68     233    238    Ljava/lang/IllegalArgumentException;
        //  102    107    238    243    Ljava/lang/IllegalArgumentException;
        //  116    123    243    253    Ljava/lang/IllegalArgumentException;
        //  133    165    253    258    Ljava/lang/IllegalArgumentException;
        //  180    187    258    263    Ljava/lang/IllegalArgumentException;
        //  204    209    263    268    Ljava/lang/IllegalArgumentException;
        //  220    225    228    233    Ljava/lang/IllegalArgumentException;
        //  240    243    243    253    Ljava/lang/IllegalArgumentException;
        //  245    248    248    253    Ljava/lang/IllegalArgumentException;
        //  250    253    253    258    Ljava/lang/IllegalArgumentException;
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
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final MenuItemImpl itemWithShortcutForKey = this.findItemWithShortcutForKey(n, keyEvent);
        boolean performItemAction = false;
        if (itemWithShortcutForKey != null) {
            performItemAction = this.performItemAction((MenuItem)itemWithShortcutForKey, n2);
        }
        if ((n2 & 0x2) == 0x0) {
            return performItemAction;
        }
        try {
            this.close(true);
            return performItemAction;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void removeGroup(final int n) {
        int n2 = 0;
        final int a = MenuBuilder.a;
        final int groupIndex = this.findGroupIndex(n);
        if (groupIndex < 0) {
            return;
        }
        final int n3 = this.mItems.size() - groupIndex;
        while (true) {
            final int n4 = n2 + 1;
            Label_0071: {
                if (n2 >= n3) {
                    break Label_0071;
                }
                try {
                    if (((MenuItemImpl)this.mItems.get(groupIndex)).getGroupId() == n) {
                        this.removeItemAtInt(groupIndex, false);
                        if (a == 0) {
                            break Label_0071;
                        }
                    }
                    this.onItemsChanged(true);
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n2 = n4;
            continue;
        }
    }
    
    public void removeItem(final int n) {
        this.removeItemAtInt(this.findItemIndex(n), true);
    }
    
    public void removeMenuPresenter(final MenuPresenter menuPresenter) {
        final int a = MenuBuilder.a;
        final Iterator iterator = this.mPresenters.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return;
            }
            final WeakReference<MenuPresenter> weakReference = iterator.next();
            final MenuPresenter menuPresenter2 = weakReference.get();
            Label_0063: {
                if (menuPresenter2 != null) {
                    if (menuPresenter2 != menuPresenter) {
                        break Label_0063;
                    }
                }
                try {
                    this.mPresenters.remove(weakReference);
                    if (a != 0) {
                        return;
                    }
                    continue;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public void restoreActionViewStates(final Bundle bundle) {
        final int a = MenuBuilder.a;
        if (bundle != null) {
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.getActionViewStatesKey());
            final int size = this.size();
            int n = 0;
            while (true) {
                int n2 = 0;
                Label_0103: {
                    if (n >= size) {
                        break Label_0103;
                    }
                    final MenuItem item = this.getItem(n);
                    final View actionView = MenuItemCompat.getActionView(item);
                    Label_0069: {
                        if (actionView == null) {
                            break Label_0069;
                        }
                        try {
                            if (actionView.getId() != -1) {
                                actionView.restoreHierarchyState(sparseParcelableArray);
                            }
                            if (item.hasSubMenu()) {
                                ((SubMenuBuilder)item.getSubMenu()).restoreActionViewStates(bundle);
                            }
                            n2 = n + 1;
                            if (a != 0) {
                                final int int1 = bundle.getInt(MenuBuilder.z[1]);
                                if (int1 <= 0) {
                                    break;
                                }
                                final MenuItem item2 = this.findItem(int1);
                                if (item2 == null) {
                                    break;
                                }
                                try {
                                    MenuItemCompat.expandActionView(item2);
                                    return;
                                }
                                catch (IllegalArgumentException ex) {
                                    throw ex;
                                }
                            }
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                }
                n = n2;
            }
        }
    }
    
    public void saveActionViewStates(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.size:()I
        //     8: istore_3       
        //     9: iconst_0       
        //    10: istore          4
        //    12: aconst_null    
        //    13: astore          5
        //    15: iload           4
        //    17: iload_3        
        //    18: if_icmpge       175
        //    21: aload_0        
        //    22: iload           4
        //    24: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getItem:(I)Landroid/view/MenuItem;
        //    27: astore          8
        //    29: aload           8
        //    31: invokestatic    android/support/v4/view/MenuItemCompat.getActionView:(Landroid/view/MenuItem;)Landroid/view/View;
        //    34: astore          9
        //    36: aload           9
        //    38: ifnull          168
        //    41: aload           9
        //    43: invokevirtual   android/view/View.getId:()I
        //    46: istore          12
        //    48: iload           12
        //    50: iconst_m1      
        //    51: if_icmpeq       168
        //    54: aload           5
        //    56: ifnonnull       68
        //    59: new             Landroid/util/SparseArray;
        //    62: dup            
        //    63: invokespecial   android/util/SparseArray.<init>:()V
        //    66: astore          5
        //    68: aload           9
        //    70: aload           5
        //    72: invokevirtual   android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
        //    75: aload           8
        //    77: invokestatic    android/support/v4/view/MenuItemCompat.isActionViewExpanded:(Landroid/view/MenuItem;)Z
        //    80: ifeq            168
        //    83: aload_1        
        //    84: getstatic       android/support/v7/internal/view/menu/MenuBuilder.z:[Ljava/lang/String;
        //    87: iconst_0       
        //    88: aaload         
        //    89: aload           8
        //    91: invokeinterface android/view/MenuItem.getItemId:()I
        //    96: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    99: aload           5
        //   101: astore          6
        //   103: aload           8
        //   105: invokeinterface android/view/MenuItem.hasSubMenu:()Z
        //   110: ifeq            127
        //   113: aload           8
        //   115: invokeinterface android/view/MenuItem.getSubMenu:()Landroid/view/SubMenu;
        //   120: checkcast       Landroid/support/v7/internal/view/menu/SubMenuBuilder;
        //   123: aload_1        
        //   124: invokevirtual   android/support/v7/internal/view/menu/SubMenuBuilder.saveActionViewStates:(Landroid/os/Bundle;)V
        //   127: iload           4
        //   129: iconst_1       
        //   130: iadd           
        //   131: istore          10
        //   133: iload_2        
        //   134: ifeq            182
        //   137: aload           6
        //   139: ifnull          152
        //   142: aload_1        
        //   143: aload_0        
        //   144: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.getActionViewStatesKey:()Ljava/lang/String;
        //   147: aload           6
        //   149: invokevirtual   android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
        //   152: return         
        //   153: astore          11
        //   155: aload           11
        //   157: athrow         
        //   158: astore          13
        //   160: aload           13
        //   162: athrow         
        //   163: astore          7
        //   165: aload           7
        //   167: athrow         
        //   168: aload           5
        //   170: astore          6
        //   172: goto            103
        //   175: aload           5
        //   177: astore          6
        //   179: goto            137
        //   182: iload           10
        //   184: istore          4
        //   186: aload           6
        //   188: astore          5
        //   190: goto            15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  41     48     153    158    Ljava/lang/IllegalArgumentException;
        //  68     99     158    163    Ljava/lang/IllegalArgumentException;
        //  142    152    163    168    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
    
    public void setCallback(final MenuBuilder$Callback mCallback) {
        this.mCallback = mCallback;
    }
    
    public MenuBuilder setDefaultShowAsAction(final int mDefaultShowAsAction) {
        this.mDefaultShowAsAction = mDefaultShowAsAction;
        return this;
    }
    
    void setExclusiveItemChecked(final MenuItem menuItem) {
        final int a = MenuBuilder.a;
        final int groupId = menuItem.getGroupId();
        int n;
        for (int size = this.mItems.size(), i = 0; i < size; i = n) {
            final MenuItemImpl menuItemImpl = this.mItems.get(i);
            Label_0078: {
                try {
                    if (menuItemImpl.getGroupId() != groupId) {
                        break Label_0078;
                    }
                    final MenuItemImpl menuItemImpl2 = menuItemImpl;
                    final boolean b = menuItemImpl2.isExclusiveCheckable();
                    if (!b) {
                        break Label_0078;
                    }
                    break Label_0078;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    final MenuItemImpl menuItemImpl2 = menuItemImpl;
                    final boolean b = menuItemImpl2.isExclusiveCheckable();
                    if (!b) {
                        break Label_0078;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                while (true) {
                    while (true) {
                        try {
                            if (!menuItemImpl.isCheckable()) {
                                break;
                            }
                            if (menuItemImpl == menuItem) {
                                final boolean checkedInt = true;
                                menuItemImpl.setCheckedInt(checkedInt);
                                break;
                            }
                        }
                        catch (IllegalArgumentException ex3) {
                            throw ex3;
                        }
                        final boolean checkedInt = false;
                        continue;
                    }
                }
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean exclusiveCheckable) {
        final int a = MenuBuilder.a;
        final int size = this.mItems.size();
        int n2 = 0;
        while (true) {
            if (n2 >= size) {
                return;
            }
            final MenuItemImpl menuItemImpl = this.mItems.get(n2);
            int n3;
            try {
                if (menuItemImpl.getGroupId() == n) {
                    menuItemImpl.setExclusiveCheckable(exclusiveCheckable);
                    menuItemImpl.setCheckable(checkable);
                }
                n3 = n2 + 1;
                if (a != 0) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n2 = n3;
        }
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        final int a = MenuBuilder.a;
        final int size = this.mItems.size();
        int n2 = 0;
        while (true) {
            if (n2 >= size) {
                return;
            }
            final MenuItemImpl menuItemImpl = this.mItems.get(n2);
            int n3;
            try {
                if (menuItemImpl.getGroupId() == n) {
                    menuItemImpl.setEnabled(enabled);
                }
                n3 = n2 + 1;
                if (a != 0) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            n2 = n3;
        }
    }
    
    public void setGroupVisible(final int p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/view/menu/MenuBuilder.mItems:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.size:()I
        //    11: istore          4
        //    13: iconst_0       
        //    14: istore          5
        //    16: iconst_0       
        //    17: istore          6
        //    19: iload           5
        //    21: iload           4
        //    23: if_icmpge       114
        //    26: aload_0        
        //    27: getfield        android/support/v7/internal/view/menu/MenuBuilder.mItems:Ljava/util/ArrayList;
        //    30: iload           5
        //    32: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    35: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //    38: astore          9
        //    40: aload           9
        //    42: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.getGroupId:()I
        //    45: iload_1        
        //    46: if_icmpne       107
        //    49: aload           9
        //    51: iload_2        
        //    52: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.setVisibleInt:(Z)Z
        //    55: istore          12
        //    57: iload           12
        //    59: ifeq            107
        //    62: iconst_1       
        //    63: istore          7
        //    65: iload           5
        //    67: iconst_1       
        //    68: iadd           
        //    69: istore          11
        //    71: iload_3        
        //    72: ifeq            96
        //    75: iload           7
        //    77: ifeq            85
        //    80: aload_0        
        //    81: iconst_1       
        //    82: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.onItemsChanged:(Z)V
        //    85: return         
        //    86: astore          10
        //    88: aload           10
        //    90: athrow         
        //    91: astore          8
        //    93: aload           8
        //    95: athrow         
        //    96: iload           11
        //    98: istore          5
        //   100: iload           7
        //   102: istore          6
        //   104: goto            19
        //   107: iload           6
        //   109: istore          7
        //   111: goto            65
        //   114: iload           6
        //   116: istore          7
        //   118: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  40     57     86     91     Ljava/lang/IllegalArgumentException;
        //  80     85     91     96     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    protected MenuBuilder setHeaderIconInt(final Drawable drawable) {
        this.setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }
    
    protected MenuBuilder setHeaderTitleInt(final CharSequence charSequence) {
        this.setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }
    
    protected MenuBuilder setHeaderViewInt(final View view) {
        this.setHeaderInternal(0, null, 0, null, view);
        return this;
    }
    
    public void setQwertyMode(final boolean mQwertyMode) {
        this.mQwertyMode = mQwertyMode;
        this.onItemsChanged(false);
    }
    
    public int size() {
        return this.mItems.size();
    }
    
    public void startDispatchingItemsChanged() {
        try {
            this.mPreventDispatchingItemsChanged = false;
            if (this.mItemsChangedWhileDispatchPrevented) {
                this.mItemsChangedWhileDispatchPrevented = false;
                this.onItemsChanged(true);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void stopDispatchingItemsChanged() {
        try {
            if (!this.mPreventDispatchingItemsChanged) {
                this.mPreventDispatchingItemsChanged = true;
                this.mItemsChangedWhileDispatchPrevented = false;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
