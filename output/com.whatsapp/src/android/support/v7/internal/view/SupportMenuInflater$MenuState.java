// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.SubMenu;
import android.view.MenuItem;
import android.util.Log;
import android.view.Menu;
import android.support.v4.view.ActionProvider;

class SupportMenuInflater$MenuState
{
    private static final String[] z;
    private int groupCategory;
    private int groupCheckable;
    private boolean groupEnabled;
    private int groupId;
    private int groupOrder;
    private boolean groupVisible;
    private ActionProvider itemActionProvider;
    private String itemActionProviderClassName;
    private String itemActionViewClassName;
    private int itemActionViewLayout;
    private boolean itemAdded;
    private char itemAlphabeticShortcut;
    private int itemCategoryOrder;
    private int itemCheckable;
    private boolean itemChecked;
    private boolean itemEnabled;
    private int itemIconResId;
    private int itemId;
    private String itemListenerMethodName;
    private char itemNumericShortcut;
    private int itemShowAsAction;
    private CharSequence itemTitle;
    private CharSequence itemTitleCondensed;
    private boolean itemVisible;
    private Menu menu;
    final SupportMenuInflater this$0;
    
    static {
        final String[] z2 = new String[7];
        String s = "~'l\u001dS_&Q\bRX\u001br\u000bPL&y\u001f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "d5r\u0002ND<{M]Y&n\u0004^X&yM\u001bD&y\u0000}N&u\u0002R{;y\u001apL+s\u0018H\n|<,_Y;s\u0003\u001c[;y\u001a\u001cL>n\b]I+<\u001eLH1u\u000bUH62";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "y:yM]C6n\u0002UIhs\u0003\u007fA;\u007f\u0006\u001cL&h\u001fUO'h\b\u001cN3r\u0003SYr~\b\u001cX!y\t\u001cZ;h\u0005UCr}MNH!h\u001fUN&y\t\u001cN=r\u0019YU&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "~'l\u001dS_&Q\bRX\u001br\u000bPL&y\u001f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "n3r\u0003SYru\u0003OY3r\u0019UL&yM_A3o\u001e\u0006\r";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "d5r\u0002ND<{M]Y&n\u0004^X&yM\u001bL1h\u0004SC\u0002n\u0002JD6y\u001f\u007fA3o\u001e\u001b\u0003r]\u000eHD=rMJD7kM]A y\fXTro\u001dYN;z\u0004YI|";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "~'l\u001dS_&Q\bRX\u001br\u000bPL&y\u001f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public SupportMenuInflater$MenuState(final SupportMenuInflater this$0, final Menu menu) {
        this.this$0 = this$0;
        this.menu = menu;
        this.resetGroup();
    }
    
    static ActionProvider access$000(final SupportMenuInflater$MenuState supportMenuInflater$MenuState) {
        return supportMenuInflater$MenuState.itemActionProvider;
    }
    
    private char getShortcut(final String s) {
        if (s == null) {
            return '\0';
        }
        return s.charAt(0);
    }
    
    private Object newInstance(final String s, final Class[] array, final Object[] array2) {
        try {
            return SupportMenuInflater.access$100(this.this$0).getClassLoader().loadClass(s).getConstructor((Class<?>[])array).newInstance(array2);
        }
        catch (Exception ex) {
            Log.w(SupportMenuInflater$MenuState.z[3], SupportMenuInflater$MenuState.z[4] + s, (Throwable)ex);
            return null;
        }
    }
    
    private void setItem(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/WindowCallbackWrapper.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: aload_0        
        //     6: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemChecked:Z
        //     9: invokeinterface android/view/MenuItem.setChecked:(Z)Landroid/view/MenuItem;
        //    14: aload_0        
        //    15: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemVisible:Z
        //    18: invokeinterface android/view/MenuItem.setVisible:(Z)Landroid/view/MenuItem;
        //    23: aload_0        
        //    24: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemEnabled:Z
        //    27: invokeinterface android/view/MenuItem.setEnabled:(Z)Landroid/view/MenuItem;
        //    32: astore          4
        //    34: aload_0        
        //    35: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemCheckable:I
        //    38: istore          5
        //    40: iload           5
        //    42: iconst_1       
        //    43: if_icmplt       155
        //    46: iconst_1       
        //    47: istore          6
        //    49: aload           4
        //    51: iload           6
        //    53: invokeinterface android/view/MenuItem.setCheckable:(Z)Landroid/view/MenuItem;
        //    58: aload_0        
        //    59: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemTitleCondensed:Ljava/lang/CharSequence;
        //    62: invokeinterface android/view/MenuItem.setTitleCondensed:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
        //    67: aload_0        
        //    68: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemIconResId:I
        //    71: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //    76: aload_0        
        //    77: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemAlphabeticShortcut:C
        //    80: invokeinterface android/view/MenuItem.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
        //    85: aload_0        
        //    86: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemNumericShortcut:C
        //    89: invokeinterface android/view/MenuItem.setNumericShortcut:(C)Landroid/view/MenuItem;
        //    94: pop            
        //    95: aload_0        
        //    96: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemShowAsAction:I
        //    99: iflt            110
        //   102: aload_1        
        //   103: aload_0        
        //   104: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemShowAsAction:I
        //   107: invokestatic    android/support/v4/view/MenuItemCompat.setShowAsAction:(Landroid/view/MenuItem;I)V
        //   110: aload_0        
        //   111: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemListenerMethodName:Ljava/lang/String;
        //   114: astore          11
        //   116: aload           11
        //   118: ifnull          196
        //   121: aload_0        
        //   122: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
        //   125: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$100:(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
        //   128: invokevirtual   android/content/Context.isRestricted:()Z
        //   131: ifeq            171
        //   134: new             Ljava/lang/IllegalStateException;
        //   137: dup            
        //   138: getstatic       android/support/v7/internal/view/SupportMenuInflater$MenuState.z:[Ljava/lang/String;
        //   141: iconst_2       
        //   142: aaload         
        //   143: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   146: athrow         
        //   147: astore          10
        //   149: aload           10
        //   151: athrow         
        //   152: astore_3       
        //   153: aload_3        
        //   154: athrow         
        //   155: iconst_0       
        //   156: istore          6
        //   158: goto            49
        //   161: astore          7
        //   163: aload           7
        //   165: athrow         
        //   166: astore          9
        //   168: aload           9
        //   170: athrow         
        //   171: aload_1        
        //   172: new             Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
        //   175: dup            
        //   176: aload_0        
        //   177: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
        //   180: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$400:(Landroid/support/v7/internal/view/SupportMenuInflater;)Ljava/lang/Object;
        //   183: aload_0        
        //   184: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemListenerMethodName:Ljava/lang/String;
        //   187: invokespecial   android/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener.<init>:(Ljava/lang/Object;Ljava/lang/String;)V
        //   190: invokeinterface android/view/MenuItem.setOnMenuItemClickListener:(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
        //   195: pop            
        //   196: aload_1        
        //   197: instanceof      Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   200: ifeq            208
        //   203: aload_1        
        //   204: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   207: pop            
        //   208: aload_0        
        //   209: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemCheckable:I
        //   212: istore          17
        //   214: iload           17
        //   216: iconst_2       
        //   217: if_icmplt       258
        //   220: aload_1        
        //   221: instanceof      Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   224: istore          27
        //   226: iload           27
        //   228: ifeq            243
        //   231: aload_1        
        //   232: checkcast       Landroid/support/v7/internal/view/menu/MenuItemImpl;
        //   235: iconst_1       
        //   236: invokevirtual   android/support/v7/internal/view/menu/MenuItemImpl.setExclusiveCheckable:(Z)V
        //   239: iload_2        
        //   240: ifeq            258
        //   243: aload_1        
        //   244: instanceof      Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
        //   247: ifeq            258
        //   250: aload_1        
        //   251: checkcast       Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
        //   254: iconst_1       
        //   255: invokevirtual   android/support/v7/internal/view/menu/MenuItemWrapperICS.setExclusiveCheckable:(Z)V
        //   258: aload_0        
        //   259: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewClassName:Ljava/lang/String;
        //   262: ifnull          394
        //   265: aload_1        
        //   266: aload_0        
        //   267: aload_0        
        //   268: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewClassName:Ljava/lang/String;
        //   271: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$500:()[Ljava/lang/Class;
        //   274: aload_0        
        //   275: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
        //   278: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$600:(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
        //   281: invokespecial   android/support/v7/internal/view/SupportMenuInflater$MenuState.newInstance:(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
        //   284: checkcast       Landroid/view/View;
        //   287: invokestatic    android/support/v4/view/MenuItemCompat.setActionView:(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;
        //   290: pop            
        //   291: iconst_1       
        //   292: istore          18
        //   294: aload_0        
        //   295: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewLayout:I
        //   298: istore          20
        //   300: iload           20
        //   302: ifle            337
        //   305: iload           18
        //   307: ifne            323
        //   310: aload_1        
        //   311: aload_0        
        //   312: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewLayout:I
        //   315: invokestatic    android/support/v4/view/MenuItemCompat.setActionView:(Landroid/view/MenuItem;I)Landroid/view/MenuItem;
        //   318: pop            
        //   319: iload_2        
        //   320: ifeq            337
        //   323: getstatic       android/support/v7/internal/view/SupportMenuInflater$MenuState.z:[Ljava/lang/String;
        //   326: iconst_0       
        //   327: aaload         
        //   328: getstatic       android/support/v7/internal/view/SupportMenuInflater$MenuState.z:[Ljava/lang/String;
        //   331: iconst_1       
        //   332: aaload         
        //   333: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   336: pop            
        //   337: aload_0        
        //   338: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProvider:Landroid/support/v4/view/ActionProvider;
        //   341: ifnull          353
        //   344: aload_1        
        //   345: aload_0        
        //   346: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProvider:Landroid/support/v4/view/ActionProvider;
        //   349: invokestatic    android/support/v4/view/MenuItemCompat.setActionProvider:(Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;
        //   352: pop            
        //   353: return         
        //   354: astore          12
        //   356: aload           12
        //   358: athrow         
        //   359: astore          13
        //   361: aload           13
        //   363: athrow         
        //   364: astore          14
        //   366: aload           14
        //   368: athrow         
        //   369: astore          15
        //   371: aload           15
        //   373: athrow         
        //   374: astore          16
        //   376: aload           16
        //   378: athrow         
        //   379: astore          19
        //   381: aload           19
        //   383: athrow         
        //   384: astore          23
        //   386: aload           23
        //   388: athrow         
        //   389: astore          21
        //   391: aload           21
        //   393: athrow         
        //   394: iconst_0       
        //   395: istore          18
        //   397: goto            294
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      40     152    155    Ljava/lang/IllegalStateException;
        //  49     110    161    166    Ljava/lang/IllegalStateException;
        //  110    116    166    171    Ljava/lang/IllegalStateException;
        //  121    147    147    152    Ljava/lang/IllegalStateException;
        //  168    171    147    152    Ljava/lang/IllegalStateException;
        //  196    208    354    359    Ljava/lang/IllegalStateException;
        //  208    214    359    364    Ljava/lang/IllegalStateException;
        //  220    226    364    369    Ljava/lang/IllegalStateException;
        //  231    239    369    374    Ljava/lang/IllegalStateException;
        //  243    258    374    379    Ljava/lang/IllegalStateException;
        //  294    300    379    384    Ljava/lang/IllegalStateException;
        //  323    337    384    389    Ljava/lang/IllegalStateException;
        //  337    353    389    394    Ljava/lang/IllegalStateException;
        //  361    364    364    369    Ljava/lang/IllegalStateException;
        //  366    369    369    374    Ljava/lang/IllegalStateException;
        //  371    374    374    379    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 192, Size: 192
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
    
    public void addItem() {
        this.itemAdded = true;
        this.setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
    }
    
    public SubMenu addSubMenuItem() {
        this.itemAdded = true;
        final SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
        this.setItem(addSubMenu.getItem());
        return addSubMenu;
    }
    
    public boolean hasAddedItem() {
        return this.itemAdded;
    }
    
    public void readGroup(final AttributeSet set) {
        final int a = WindowCallbackWrapper.a;
        final TypedArray obtainStyledAttributes = SupportMenuInflater.access$100(this.this$0).obtainStyledAttributes(set, R$styleable.MenuGroup);
        try {
            this.groupId = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
            this.groupCategory = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
            this.groupOrder = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
            this.groupCheckable = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
            this.groupVisible = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
            this.groupEnabled = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
            if (AppCompatActivity.b) {
                WindowCallbackWrapper.a = a + 1;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void readItem(final AttributeSet p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v7/internal/view/WindowCallbackWrapper.a:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
        //    10: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$100:(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
        //    13: aload_1        
        //    14: getstatic       android/support/v7/appcompat/R$styleable.MenuItem:[I
        //    17: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //    20: astore          4
        //    22: aload_0        
        //    23: aload           4
        //    25: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_id:I
        //    28: iconst_0       
        //    29: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //    32: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemId:I
        //    35: aload           4
        //    37: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_menuCategory:I
        //    40: aload_0        
        //    41: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.groupCategory:I
        //    44: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //    47: istore          5
        //    49: aload           4
        //    51: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_orderInCategory:I
        //    54: aload_0        
        //    55: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.groupOrder:I
        //    58: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //    61: istore          6
        //    63: iload           5
        //    65: ldc_w           -65536
        //    68: iand           
        //    69: iload           6
        //    71: ldc_w           65535
        //    74: iand           
        //    75: ior            
        //    76: istore          7
        //    78: aload_0        
        //    79: iload           7
        //    81: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemCategoryOrder:I
        //    84: aload_0        
        //    85: aload           4
        //    87: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_title:I
        //    90: invokevirtual   android/content/res/TypedArray.getText:(I)Ljava/lang/CharSequence;
        //    93: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemTitle:Ljava/lang/CharSequence;
        //    96: aload_0        
        //    97: aload           4
        //    99: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_titleCondensed:I
        //   102: invokevirtual   android/content/res/TypedArray.getText:(I)Ljava/lang/CharSequence;
        //   105: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemTitleCondensed:Ljava/lang/CharSequence;
        //   108: aload_0        
        //   109: aload           4
        //   111: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_icon:I
        //   114: iconst_0       
        //   115: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   118: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemIconResId:I
        //   121: aload_0        
        //   122: aload_0        
        //   123: aload           4
        //   125: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_alphabeticShortcut:I
        //   128: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   131: invokespecial   android/support/v7/internal/view/SupportMenuInflater$MenuState.getShortcut:(Ljava/lang/String;)C
        //   134: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemAlphabeticShortcut:C
        //   137: aload_0        
        //   138: aload_0        
        //   139: aload           4
        //   141: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_numericShortcut:I
        //   144: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   147: invokespecial   android/support/v7/internal/view/SupportMenuInflater$MenuState.getShortcut:(Ljava/lang/String;)C
        //   150: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemNumericShortcut:C
        //   153: aload           4
        //   155: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_checkable:I
        //   158: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   161: istore          10
        //   163: iload           10
        //   165: ifeq            215
        //   168: aload           4
        //   170: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_checkable:I
        //   173: iconst_0       
        //   174: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   177: istore          20
        //   179: iload           20
        //   181: ifeq            441
        //   184: iload_2        
        //   185: istore          21
        //   187: aload_0        
        //   188: iload           21
        //   190: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemCheckable:I
        //   193: iload_3        
        //   194: ifeq            223
        //   197: getstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   200: istore          24
        //   202: iload           24
        //   204: ifeq            457
        //   207: iconst_0       
        //   208: istore          25
        //   210: iload           25
        //   212: putstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   215: aload_0        
        //   216: aload_0        
        //   217: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.groupCheckable:I
        //   220: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemCheckable:I
        //   223: aload_0        
        //   224: aload           4
        //   226: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_checked:I
        //   229: iconst_0       
        //   230: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   233: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemChecked:Z
        //   236: aload_0        
        //   237: aload           4
        //   239: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_visible:I
        //   242: aload_0        
        //   243: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.groupVisible:Z
        //   246: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   249: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemVisible:Z
        //   252: aload_0        
        //   253: aload           4
        //   255: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_enabled:I
        //   258: aload_0        
        //   259: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.groupEnabled:Z
        //   262: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   265: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemEnabled:Z
        //   268: aload_0        
        //   269: aload           4
        //   271: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_showAsAction:I
        //   274: iconst_m1      
        //   275: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   278: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemShowAsAction:I
        //   281: aload_0        
        //   282: aload           4
        //   284: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_android_onClick:I
        //   287: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   290: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemListenerMethodName:Ljava/lang/String;
        //   293: aload_0        
        //   294: aload           4
        //   296: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_actionLayout:I
        //   299: iconst_0       
        //   300: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   303: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewLayout:I
        //   306: aload_0        
        //   307: aload           4
        //   309: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_actionViewClass:I
        //   312: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   315: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewClassName:Ljava/lang/String;
        //   318: aload_0        
        //   319: aload           4
        //   321: getstatic       android/support/v7/appcompat/R$styleable.MenuItem_actionProviderClass:I
        //   324: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   327: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProviderClassName:Ljava/lang/String;
        //   330: aload_0        
        //   331: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProviderClassName:Ljava/lang/String;
        //   334: astore          12
        //   336: aload           12
        //   338: ifnull          468
        //   341: iload_2        
        //   342: ifeq            396
        //   345: aload_0        
        //   346: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewLayout:I
        //   349: istore          18
        //   351: iload           18
        //   353: ifne            396
        //   356: aload_0        
        //   357: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionViewClassName:Ljava/lang/String;
        //   360: astore          19
        //   362: aload           19
        //   364: ifnonnull       396
        //   367: aload_0        
        //   368: aload_0        
        //   369: aload_0        
        //   370: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProviderClassName:Ljava/lang/String;
        //   373: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$200:()[Ljava/lang/Class;
        //   376: aload_0        
        //   377: getfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
        //   380: invokestatic    android/support/v7/internal/view/SupportMenuInflater.access$300:(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
        //   383: invokespecial   android/support/v7/internal/view/SupportMenuInflater$MenuState.newInstance:(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
        //   386: checkcast       Landroid/support/v4/view/ActionProvider;
        //   389: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProvider:Landroid/support/v4/view/ActionProvider;
        //   392: iload_3        
        //   393: ifeq            420
        //   396: iload_2        
        //   397: ifeq            415
        //   400: getstatic       android/support/v7/internal/view/SupportMenuInflater$MenuState.z:[Ljava/lang/String;
        //   403: bipush          6
        //   405: aaload         
        //   406: getstatic       android/support/v7/internal/view/SupportMenuInflater$MenuState.z:[Ljava/lang/String;
        //   409: iconst_5       
        //   410: aaload         
        //   411: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   414: pop            
        //   415: aload_0        
        //   416: aconst_null    
        //   417: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemActionProvider:Landroid/support/v4/view/ActionProvider;
        //   420: aload           4
        //   422: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   425: aload_0        
        //   426: iconst_0       
        //   427: putfield        android/support/v7/internal/view/SupportMenuInflater$MenuState.itemAdded:Z
        //   430: return         
        //   431: astore          8
        //   433: aload           8
        //   435: athrow         
        //   436: astore          9
        //   438: aload           9
        //   440: athrow         
        //   441: iconst_0       
        //   442: istore          21
        //   444: goto            187
        //   447: astore          22
        //   449: aload           22
        //   451: athrow         
        //   452: astore          23
        //   454: aload           23
        //   456: athrow         
        //   457: iload_2        
        //   458: istore          25
        //   460: goto            210
        //   463: astore          11
        //   465: aload           11
        //   467: athrow         
        //   468: iconst_0       
        //   469: istore_2       
        //   470: goto            341
        //   473: astore          15
        //   475: aload           15
        //   477: athrow         
        //   478: astore          16
        //   480: aload           16
        //   482: athrow         
        //   483: astore          17
        //   485: aload           17
        //   487: athrow         
        //   488: astore          13
        //   490: aload           13
        //   492: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  78     163    431    436    Ljava/lang/IllegalStateException;
        //  168    179    436    441    Ljava/lang/IllegalStateException;
        //  187    193    447    452    Ljava/lang/IllegalStateException;
        //  197    202    452    457    Ljava/lang/IllegalStateException;
        //  223    336    463    468    Ljava/lang/IllegalStateException;
        //  345    351    473    478    Ljava/lang/IllegalStateException;
        //  356    362    478    483    Ljava/lang/IllegalStateException;
        //  367    392    483    488    Ljava/lang/IllegalStateException;
        //  400    415    488    493    Ljava/lang/IllegalStateException;
        //  433    436    436    441    Ljava/lang/IllegalStateException;
        //  449    452    452    457    Ljava/lang/IllegalStateException;
        //  475    478    478    483    Ljava/lang/IllegalStateException;
        //  480    483    483    488    Ljava/lang/IllegalStateException;
        //  485    488    488    493    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 234, Size: 234
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
    
    public void resetGroup() {
        this.groupId = 0;
        this.groupCategory = 0;
        this.groupOrder = 0;
        this.groupCheckable = 0;
        this.groupVisible = true;
        this.groupEnabled = true;
    }
}
