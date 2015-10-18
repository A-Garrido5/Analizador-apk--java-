// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.content.res.Resources;
import android.support.v7.appcompat.R$dimen;
import android.support.v7.appcompat.R$attr;
import android.support.v7.appcompat.R$layout;
import android.view.ViewTreeObserver;
import android.support.v7.widget.ListPopupWindow;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;

public class MenuPopupHelper implements AdapterView$OnItemClickListener, View$OnKeyListener, ViewTreeObserver$OnGlobalLayoutListener, PopupWindow$OnDismissListener, MenuPresenter
{
    static final int ITEM_LAYOUT;
    private static final String z;
    private final MenuPopupHelper$MenuAdapter mAdapter;
    private View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    private int mDropDownGravity;
    boolean mForceShowIcon;
    private boolean mHasContentWidth;
    private final LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private final MenuBuilder mMenu;
    private final boolean mOverflowOnly;
    private ListPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter$Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;
    
    static {
        final char[] charArray = "3nOD\u0014\u0011{TA\f\u001bgQT6^h@_*\u0011\u007f\u0001S!^~RT ^|HE,\u0011~U\u0011%\u0010+@_'\u0016dS".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'D';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = '\u000b';
                    break;
                }
                case 2: {
                    c2 = '!';
                    break;
                }
                case 3: {
                    c2 = '1';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        ITEM_LAYOUT = R$layout.abc_popup_menu_item_layout;
    }
    
    public MenuPopupHelper(final Context context, final MenuBuilder menuBuilder, final View view) {
        this(context, menuBuilder, view, false, R$attr.popupMenuStyle);
    }
    
    public MenuPopupHelper(final Context context, final MenuBuilder menuBuilder, final View view, final boolean b, final int n) {
        this(context, menuBuilder, view, b, n, 0);
    }
    
    public MenuPopupHelper(final Context mContext, final MenuBuilder mMenu, final View mAnchorView, final boolean mOverflowOnly, final int mPopupStyleAttr, final int mPopupStyleRes) {
        this.mDropDownGravity = 0;
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
        this.mMenu = mMenu;
        this.mAdapter = new MenuPopupHelper$MenuAdapter(this, this.mMenu);
        this.mOverflowOnly = mOverflowOnly;
        this.mPopupStyleAttr = mPopupStyleAttr;
        this.mPopupStyleRes = mPopupStyleRes;
        final Resources resources = mContext.getResources();
        this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.mAnchorView = mAnchorView;
        mMenu.addMenuPresenter(this, mContext);
    }
    
    static boolean access$100(final MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mOverflowOnly;
    }
    
    static LayoutInflater access$200(final MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mInflater;
    }
    
    static MenuBuilder access$300(final MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mMenu;
    }
    
    private int measureContentWidth() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
        //    10: astore_3       
        //    11: iconst_0       
        //    12: iconst_0       
        //    13: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //    16: istore          4
        //    18: iconst_0       
        //    19: iconst_0       
        //    20: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //    23: istore          5
        //    25: aload_3        
        //    26: invokeinterface android/widget/ListAdapter.getCount:()I
        //    31: istore          6
        //    33: iconst_0       
        //    34: istore          7
        //    36: iconst_0       
        //    37: istore          8
        //    39: aconst_null    
        //    40: astore          9
        //    42: iload           7
        //    44: iload           6
        //    46: if_icmpge       137
        //    49: aload_3        
        //    50: iload           7
        //    52: invokeinterface android/widget/ListAdapter.getItemViewType:(I)I
        //    57: istore          10
        //    59: iload           10
        //    61: iload           8
        //    63: if_icmpeq       179
        //    66: aconst_null    
        //    67: astore          11
        //    69: aload_0        
        //    70: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mMeasureParent:Landroid/view/ViewGroup;
        //    73: ifnonnull       91
        //    76: aload_0        
        //    77: new             Landroid/widget/FrameLayout;
        //    80: dup            
        //    81: aload_0        
        //    82: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mContext:Landroid/content/Context;
        //    85: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;)V
        //    88: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mMeasureParent:Landroid/view/ViewGroup;
        //    91: aload_3        
        //    92: iload           7
        //    94: aload           11
        //    96: aload_0        
        //    97: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mMeasureParent:Landroid/view/ViewGroup;
        //   100: invokeinterface android/widget/ListAdapter.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
        //   105: astore          9
        //   107: aload           9
        //   109: iload           4
        //   111: iload           5
        //   113: invokevirtual   android/view/View.measure:(II)V
        //   116: aload           9
        //   118: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   121: istore          13
        //   123: iload           13
        //   125: aload_0        
        //   126: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopupMaxWidth:I
        //   129: if_icmplt       149
        //   132: aload_0        
        //   133: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopupMaxWidth:I
        //   136: istore_1       
        //   137: iload_1        
        //   138: ireturn        
        //   139: astore          12
        //   141: aload           12
        //   143: athrow         
        //   144: astore          14
        //   146: aload           14
        //   148: athrow         
        //   149: iload           13
        //   151: iload_1        
        //   152: if_icmple       158
        //   155: iload           13
        //   157: istore_1       
        //   158: iload           7
        //   160: iconst_1       
        //   161: iadd           
        //   162: istore          15
        //   164: iload_2        
        //   165: ifne            137
        //   168: iload           15
        //   170: istore          7
        //   172: iload           10
        //   174: istore          8
        //   176: goto            42
        //   179: iload           8
        //   181: istore          10
        //   183: aload           9
        //   185: astore          11
        //   187: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  69     91     139    144    Ljava/lang/IllegalStateException;
        //  123    137    144    149    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0137:
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
    
    public boolean collapseItemActionView(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
        return false;
    }
    
    public void dismiss() {
        try {
            if (this.isShowing()) {
                this.mPopup.dismiss();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean expandItemActionView(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
        return false;
    }
    
    public boolean flagActionItems() {
        return false;
    }
    
    public ListPopupWindow getPopup() {
        return this.mPopup;
    }
    
    public void initForMenu(final Context context, final MenuBuilder menuBuilder) {
    }
    
    public boolean isShowing() {
        try {
            if (this.mPopup == null) {
                return false;
            }
            final MenuPopupHelper menuPopupHelper = this;
            final ListPopupWindow listPopupWindow = menuPopupHelper.mPopup;
            final boolean b = listPopupWindow.isShowing();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final MenuPopupHelper menuPopupHelper = this;
            final ListPopupWindow listPopupWindow = menuPopupHelper.mPopup;
            final boolean b = listPopupWindow.isShowing();
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
        while (true) {
            try {
                if (menuBuilder != this.mMenu) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                this.dismiss();
                if (this.mPresenterCallback != null) {
                    this.mPresenterCallback.onCloseMenu(menuBuilder, b);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    public void onDismiss() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aconst_null    
        //     2: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
        //     9: invokevirtual   android/support/v7/internal/view/menu/MenuBuilder.close:()V
        //    12: aload_0        
        //    13: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnull          55
        //    21: aload_0        
        //    22: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    25: invokevirtual   android/view/ViewTreeObserver.isAlive:()Z
        //    28: ifne            42
        //    31: aload_0        
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAnchorView:Landroid/view/View;
        //    36: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    39: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    42: aload_0        
        //    43: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    46: aload_0        
        //    47: invokevirtual   android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    50: aload_0        
        //    51: aconst_null    
        //    52: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    55: return         
        //    56: astore_1       
        //    57: aload_1        
        //    58: athrow         
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      17     56     59     Ljava/lang/IllegalStateException;
        //  21     42     59     62     Ljava/lang/IllegalStateException;
        //  57     59     59     62     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public void onGlobalLayout() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.isShowing:()Z
        //     4: ifeq            55
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAnchorView:Landroid/view/View;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          27
        //    16: aload_1        
        //    17: invokevirtual   android/view/View.isShown:()Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifne            41
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.dismiss:()V
        //    31: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //    34: istore          4
        //    36: iload           4
        //    38: ifeq            55
        //    41: aload_0        
        //    42: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.isShowing:()Z
        //    45: ifeq            55
        //    48: aload_0        
        //    49: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    52: invokevirtual   android/support/v7/widget/ListPopupWindow.show:()V
        //    55: return         
        //    56: astore          5
        //    58: aload           5
        //    60: athrow         
        //    61: astore_2       
        //    62: aload_2        
        //    63: athrow         
        //    64: astore_3       
        //    65: aload_3        
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     22     56     61     Ljava/lang/IllegalStateException;
        //  27     36     61     64     Ljava/lang/IllegalStateException;
        //  41     55     64     67     Ljava/lang/IllegalStateException;
        //  58     61     61     64     Ljava/lang/IllegalStateException;
        //  62     64     64     67     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
        final MenuPopupHelper$MenuAdapter mAdapter = this.mAdapter;
        MenuPopupHelper$MenuAdapter.access$000(mAdapter).performItemAction((MenuItem)mAdapter.getItem(n), 0);
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        try {
            if (keyEvent.getAction() == 1 && n == 82) {
                final MenuPopupHelper menuPopupHelper = this;
                menuPopupHelper.dismiss();
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final MenuPopupHelper menuPopupHelper = this;
            menuPopupHelper.dismiss();
            return true;
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean onSubMenuSelected(final SubMenuBuilder p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   android/support/v7/internal/view/menu/SubMenuBuilder.hasVisibleItems:()Z
        //     8: ifeq            153
        //    11: new             Landroid/support/v7/internal/view/menu/MenuPopupHelper;
        //    14: dup            
        //    15: aload_0        
        //    16: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mContext:Landroid/content/Context;
        //    19: aload_1        
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAnchorView:Landroid/view/View;
        //    24: invokespecial   android/support/v7/internal/view/menu/MenuPopupHelper.<init>:(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V
        //    27: astore_3       
        //    28: aload_3        
        //    29: aload_0        
        //    30: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
        //    33: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.setCallback:(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
        //    36: aload_1        
        //    37: invokevirtual   android/support/v7/internal/view/menu/SubMenuBuilder.size:()I
        //    40: istore          4
        //    42: iconst_0       
        //    43: istore          5
        //    45: iconst_0       
        //    46: istore          6
        //    48: iload           5
        //    50: iload           4
        //    52: if_icmpge       101
        //    55: aload_1        
        //    56: iload           5
        //    58: invokevirtual   android/support/v7/internal/view/menu/SubMenuBuilder.getItem:(I)Landroid/view/MenuItem;
        //    61: astore          11
        //    63: aload           11
        //    65: invokeinterface android/view/MenuItem.isVisible:()Z
        //    70: ifeq            94
        //    73: aload           11
        //    75: invokeinterface android/view/MenuItem.getIcon:()Landroid/graphics/drawable/Drawable;
        //    80: astore          13
        //    82: aload           13
        //    84: ifnull          94
        //    87: iload_2        
        //    88: ifeq            155
        //    91: iconst_1       
        //    92: istore          6
        //    94: iinc            5, 1
        //    97: iload_2        
        //    98: ifeq            48
        //   101: aload_3        
        //   102: iload           6
        //   104: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.setForceShowIcon:(Z)V
        //   107: aload_3        
        //   108: invokevirtual   android/support/v7/internal/view/menu/MenuPopupHelper.tryShow:()Z
        //   111: istore          9
        //   113: iload           9
        //   115: ifeq            153
        //   118: aload_0        
        //   119: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
        //   122: ifnull          136
        //   125: aload_0        
        //   126: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
        //   129: aload_1        
        //   130: invokeinterface android/support/v7/internal/view/menu/MenuPresenter$Callback.onOpenSubMenu:(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
        //   135: pop            
        //   136: iconst_1       
        //   137: ireturn        
        //   138: astore          12
        //   140: aload           12
        //   142: athrow         
        //   143: astore          7
        //   145: aload           7
        //   147: athrow         
        //   148: astore          8
        //   150: aload           8
        //   152: athrow         
        //   153: iconst_0       
        //   154: ireturn        
        //   155: iconst_1       
        //   156: istore          6
        //   158: goto            101
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  63     82     138    143    Ljava/lang/IllegalStateException;
        //  101    113    143    148    Ljava/lang/IllegalStateException;
        //  118    136    148    153    Ljava/lang/IllegalStateException;
        //  145    148    148    153    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
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
    
    public void setAnchorView(final View mAnchorView) {
        this.mAnchorView = mAnchorView;
    }
    
    public void setCallback(final MenuPresenter$Callback mPresenterCallback) {
        this.mPresenterCallback = mPresenterCallback;
    }
    
    public void setForceShowIcon(final boolean mForceShowIcon) {
        this.mForceShowIcon = mForceShowIcon;
    }
    
    public void setGravity(final int mDropDownGravity) {
        this.mDropDownGravity = mDropDownGravity;
    }
    
    public void show() {
        try {
            if (!this.tryShow()) {
                throw new IllegalStateException(MenuPopupHelper.z);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean tryShow() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: new             Landroid/support/v7/widget/ListPopupWindow;
        //     4: dup            
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mContext:Landroid/content/Context;
        //     9: aconst_null    
        //    10: aload_0        
        //    11: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopupStyleAttr:I
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopupStyleRes:I
        //    18: invokespecial   android/support/v7/widget/ListPopupWindow.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;II)V
        //    21: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    24: aload_0        
        //    25: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    28: aload_0        
        //    29: invokevirtual   android/support/v7/widget/ListPopupWindow.setOnDismissListener:(Landroid/widget/PopupWindow$OnDismissListener;)V
        //    32: aload_0        
        //    33: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    36: aload_0        
        //    37: invokevirtual   android/support/v7/widget/ListPopupWindow.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //    40: aload_0        
        //    41: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    44: aload_0        
        //    45: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
        //    48: invokevirtual   android/support/v7/widget/ListPopupWindow.setAdapter:(Landroid/widget/ListAdapter;)V
        //    51: aload_0        
        //    52: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //    55: iconst_1       
        //    56: invokevirtual   android/support/v7/widget/ListPopupWindow.setModal:(Z)V
        //    59: aload_0        
        //    60: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mAnchorView:Landroid/view/View;
        //    63: astore_1       
        //    64: aload_1        
        //    65: ifnull          130
        //    68: aload_0        
        //    69: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    72: astore_3       
        //    73: aload_3        
        //    74: ifnonnull       135
        //    77: iconst_1       
        //    78: istore          4
        //    80: aload_0        
        //    81: aload_1        
        //    82: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    85: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    88: iload           4
        //    90: ifeq            101
        //    93: aload_0        
        //    94: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mTreeObserver:Landroid/view/ViewTreeObserver;
        //    97: aload_0        
        //    98: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   101: aload_0        
        //   102: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   105: aload_1        
        //   106: invokevirtual   android/support/v7/widget/ListPopupWindow.setAnchorView:(Landroid/view/View;)V
        //   109: aload_0        
        //   110: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   113: aload_0        
        //   114: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mDropDownGravity:I
        //   117: invokevirtual   android/support/v7/widget/ListPopupWindow.setDropDownGravity:(I)V
        //   120: getstatic       android/support/v7/internal/view/menu/MenuBuilder.a:I
        //   123: istore          7
        //   125: iload           7
        //   127: ifeq            151
        //   130: iconst_0       
        //   131: ireturn        
        //   132: astore_2       
        //   133: aload_2        
        //   134: athrow         
        //   135: iconst_0       
        //   136: istore          4
        //   138: goto            80
        //   141: astore          5
        //   143: aload           5
        //   145: athrow         
        //   146: astore          6
        //   148: aload           6
        //   150: athrow         
        //   151: aload_0        
        //   152: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mHasContentWidth:Z
        //   155: ifne            171
        //   158: aload_0        
        //   159: aload_0        
        //   160: invokespecial   android/support/v7/internal/view/menu/MenuPopupHelper.measureContentWidth:()I
        //   163: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mContentWidth:I
        //   166: aload_0        
        //   167: iconst_1       
        //   168: putfield        android/support/v7/internal/view/menu/MenuPopupHelper.mHasContentWidth:Z
        //   171: aload_0        
        //   172: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   175: aload_0        
        //   176: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mContentWidth:I
        //   179: invokevirtual   android/support/v7/widget/ListPopupWindow.setContentWidth:(I)V
        //   182: aload_0        
        //   183: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   186: iconst_2       
        //   187: invokevirtual   android/support/v7/widget/ListPopupWindow.setInputMethodMode:(I)V
        //   190: aload_0        
        //   191: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   194: invokevirtual   android/support/v7/widget/ListPopupWindow.show:()V
        //   197: aload_0        
        //   198: getfield        android/support/v7/internal/view/menu/MenuPopupHelper.mPopup:Landroid/support/v7/widget/ListPopupWindow;
        //   201: invokevirtual   android/support/v7/widget/ListPopupWindow.getListView:()Landroid/widget/ListView;
        //   204: aload_0        
        //   205: invokevirtual   android/widget/ListView.setOnKeyListener:(Landroid/view/View$OnKeyListener;)V
        //   208: iconst_1       
        //   209: ireturn        
        //   210: astore          8
        //   212: aload           8
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  68     73     132    135    Ljava/lang/IllegalStateException;
        //  80     88     141    146    Ljava/lang/IllegalStateException;
        //  93     101    141    146    Ljava/lang/IllegalStateException;
        //  101    125    146    151    Ljava/lang/IllegalStateException;
        //  151    171    210    215    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 110, Size: 110
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
    
    public void updateMenuView(final boolean b) {
        try {
            this.mHasContentWidth = false;
            if (this.mAdapter != null) {
                this.mAdapter.notifyDataSetChanged();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
}
