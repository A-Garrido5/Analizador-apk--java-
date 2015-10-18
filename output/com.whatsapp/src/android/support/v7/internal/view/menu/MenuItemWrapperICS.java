// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.MenuItem$OnMenuItemClickListener;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.support.v4.internal.view.SupportMenuItem;
import android.content.Context;
import java.lang.reflect.Method;
import android.annotation.TargetApi;
import android.view.MenuItem;

@TargetApi(14)
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem
{
    private static final String[] z;
    private Method mSetExclusiveCheckableMethod;
    
    static {
        final String[] z2 = new String[3];
        String s = "Xqk\u001ff=tq\u0019xx#z\u0011xqjw\u00174nfm5l~ol\u0003}kfZ\u0018q~hx\u0012xx";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "nfm5l~ol\u0003}kfZ\u0018q~hx\u0012xx";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Pfw\u0005]ift'f|si\u0015f";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MenuItemWrapperICS(final Context context, final SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }
    
    public boolean collapseActionView() {
        return ((SupportMenuItem)this.mWrappedObject).collapseActionView();
    }
    
    MenuItemWrapperICS$ActionProviderWrapper createActionProviderWrapper(final ActionProvider actionProvider) {
        return new MenuItemWrapperICS$ActionProviderWrapper(this, this.mContext, actionProvider);
    }
    
    public boolean expandActionView() {
        return ((SupportMenuItem)this.mWrappedObject).expandActionView();
    }
    
    public ActionProvider getActionProvider() {
        final android.support.v4.view.ActionProvider supportActionProvider = ((SupportMenuItem)this.mWrappedObject).getSupportActionProvider();
        if (supportActionProvider instanceof MenuItemWrapperICS$ActionProviderWrapper) {
            return ((MenuItemWrapperICS$ActionProviderWrapper)supportActionProvider).mInner;
        }
        return null;
    }
    
    public View getActionView() {
        View view = ((SupportMenuItem)this.mWrappedObject).getActionView();
        if (view instanceof MenuItemWrapperICS$CollapsibleActionViewWrapper) {
            view = ((MenuItemWrapperICS$CollapsibleActionViewWrapper)view).getWrappedView();
        }
        return view;
    }
    
    public char getAlphabeticShortcut() {
        return ((SupportMenuItem)this.mWrappedObject).getAlphabeticShortcut();
    }
    
    public int getGroupId() {
        return ((SupportMenuItem)this.mWrappedObject).getGroupId();
    }
    
    public Drawable getIcon() {
        return ((SupportMenuItem)this.mWrappedObject).getIcon();
    }
    
    public Intent getIntent() {
        return ((SupportMenuItem)this.mWrappedObject).getIntent();
    }
    
    public int getItemId() {
        return ((SupportMenuItem)this.mWrappedObject).getItemId();
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return ((SupportMenuItem)this.mWrappedObject).getMenuInfo();
    }
    
    public char getNumericShortcut() {
        return ((SupportMenuItem)this.mWrappedObject).getNumericShortcut();
    }
    
    public int getOrder() {
        return ((SupportMenuItem)this.mWrappedObject).getOrder();
    }
    
    public SubMenu getSubMenu() {
        return this.getSubMenuWrapper(((SupportMenuItem)this.mWrappedObject).getSubMenu());
    }
    
    public CharSequence getTitle() {
        return ((SupportMenuItem)this.mWrappedObject).getTitle();
    }
    
    public CharSequence getTitleCondensed() {
        return ((SupportMenuItem)this.mWrappedObject).getTitleCondensed();
    }
    
    public boolean hasSubMenu() {
        return ((SupportMenuItem)this.mWrappedObject).hasSubMenu();
    }
    
    public boolean isActionViewExpanded() {
        return ((SupportMenuItem)this.mWrappedObject).isActionViewExpanded();
    }
    
    public boolean isCheckable() {
        return ((SupportMenuItem)this.mWrappedObject).isCheckable();
    }
    
    public boolean isChecked() {
        return ((SupportMenuItem)this.mWrappedObject).isChecked();
    }
    
    public boolean isEnabled() {
        return ((SupportMenuItem)this.mWrappedObject).isEnabled();
    }
    
    public boolean isVisible() {
        return ((SupportMenuItem)this.mWrappedObject).isVisible();
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        final SupportMenuItem supportMenuItem = (SupportMenuItem)this.mWrappedObject;
        MenuItemWrapperICS$ActionProviderWrapper actionProviderWrapper;
        if (actionProvider != null) {
            actionProviderWrapper = this.createActionProviderWrapper(actionProvider);
        }
        else {
            actionProviderWrapper = null;
        }
        supportMenuItem.setSupportActionProvider(actionProviderWrapper);
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final int actionView) {
        ((SupportMenuItem)this.mWrappedObject).setActionView(actionView);
        final View actionView2 = ((SupportMenuItem)this.mWrappedObject).getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            ((SupportMenuItem)this.mWrappedObject).setActionView((View)new MenuItemWrapperICS$CollapsibleActionViewWrapper(actionView2));
        }
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(View actionView) {
        if (actionView instanceof CollapsibleActionView) {
            actionView = (View)new MenuItemWrapperICS$CollapsibleActionViewWrapper(actionView);
        }
        ((SupportMenuItem)this.mWrappedObject).setActionView(actionView);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        ((SupportMenuItem)this.mWrappedObject).setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        ((SupportMenuItem)this.mWrappedObject).setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean checked) {
        ((SupportMenuItem)this.mWrappedObject).setChecked(checked);
        return (MenuItem)this;
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        ((SupportMenuItem)this.mWrappedObject).setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public void setExclusiveCheckable(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/internal/view/menu/MenuItemWrapperICS.mSetExclusiveCheckableMethod:Ljava/lang/reflect/Method;
        //     4: ifnonnull       52
        //     7: aload_0        
        //     8: getfield        android/support/v7/internal/view/menu/MenuItemWrapperICS.mWrappedObject:Ljava/lang/Object;
        //    11: checkcast       Landroid/support/v4/internal/view/SupportMenuItem;
        //    14: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    17: astore          9
        //    19: getstatic       android/support/v7/internal/view/menu/MenuItemWrapperICS.z:[Ljava/lang/String;
        //    22: iconst_1       
        //    23: aaload         
        //    24: astore          10
        //    26: iconst_1       
        //    27: anewarray       Ljava/lang/Class;
        //    30: astore          11
        //    32: aload           11
        //    34: iconst_0       
        //    35: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    38: aastore        
        //    39: aload_0        
        //    40: aload           9
        //    42: aload           10
        //    44: aload           11
        //    46: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    49: putfield        android/support/v7/internal/view/menu/MenuItemWrapperICS.mSetExclusiveCheckableMethod:Ljava/lang/reflect/Method;
        //    52: aload_0        
        //    53: getfield        android/support/v7/internal/view/menu/MenuItemWrapperICS.mSetExclusiveCheckableMethod:Ljava/lang/reflect/Method;
        //    56: astore          5
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/view/menu/MenuItemWrapperICS.mWrappedObject:Ljava/lang/Object;
        //    62: astore          6
        //    64: iconst_1       
        //    65: anewarray       Ljava/lang/Object;
        //    68: astore          7
        //    70: aload           7
        //    72: iconst_0       
        //    73: iload_1        
        //    74: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    77: aastore        
        //    78: aload           5
        //    80: aload           6
        //    82: aload           7
        //    84: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    87: pop            
        //    88: return         
        //    89: astore_2       
        //    90: aload_2        
        //    91: athrow         
        //    92: astore_3       
        //    93: getstatic       android/support/v7/internal/view/menu/MenuItemWrapperICS.z:[Ljava/lang/String;
        //    96: iconst_2       
        //    97: aaload         
        //    98: getstatic       android/support/v7/internal/view/menu/MenuItemWrapperICS.z:[Ljava/lang/String;
        //   101: iconst_0       
        //   102: aaload         
        //   103: aload_3        
        //   104: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   107: pop            
        //   108: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      52     89     92     Ljava/lang/Exception;
        //  52     88     92     109    Ljava/lang/Exception;
        //  90     92     92     109    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    public MenuItem setIcon(final int icon) {
        ((SupportMenuItem)this.mWrappedObject).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable icon) {
        ((SupportMenuItem)this.mWrappedObject).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent intent) {
        ((SupportMenuItem)this.mWrappedObject).setIntent(intent);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericShortcut) {
        ((SupportMenuItem)this.mWrappedObject).setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final SupportMenuItem supportMenuItem = (SupportMenuItem)this.mWrappedObject;
        MenuItemWrapperICS$OnActionExpandListenerWrapper supportOnActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            supportOnActionExpandListener = new MenuItemWrapperICS$OnActionExpandListenerWrapper(this, menuItem$OnActionExpandListener);
        }
        else {
            supportOnActionExpandListener = null;
        }
        supportMenuItem.setSupportOnActionExpandListener(supportOnActionExpandListener);
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final SupportMenuItem supportMenuItem = (SupportMenuItem)this.mWrappedObject;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new MenuItemWrapperICS$OnMenuItemClickListenerWrapper(this, menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        supportMenuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char c2) {
        ((SupportMenuItem)this.mWrappedObject).setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int showAsAction) {
        ((SupportMenuItem)this.mWrappedObject).setShowAsAction(showAsAction);
    }
    
    public MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        ((SupportMenuItem)this.mWrappedObject).setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        ((SupportMenuItem)this.mWrappedObject).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence title) {
        ((SupportMenuItem)this.mWrappedObject).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        ((SupportMenuItem)this.mWrappedObject).setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean visible) {
        return ((SupportMenuItem)this.mWrappedObject).setVisible(visible);
    }
}
