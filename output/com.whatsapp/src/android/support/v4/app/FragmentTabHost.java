// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import android.widget.TabHost$OnTabChangeListener;
import android.widget.TabHost;

public class FragmentTabHost extends TabHost implements TabHost$OnTabChangeListener
{
    private static final String[] z;
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private FragmentTabHost$TabInfo mLastTab;
    private TabHost$OnTabChangeListener mOnTabChangeListener;
    private final ArrayList mTabs;
    
    static {
        final String[] z2 = new String[2];
        String s = "@].\u0010mnI1\bm~M)\u0011=%\u0001}\u0010%l\\}\u0010,fM.D,-k2\n9hP)D,cL}\"?lO0\u0001#ye<\n,jM/";
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
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = ']';
                        break;
                    }
                    case 3: {
                        c2 = 'd';
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
                    s = "CG}\u0010,o\b6\n\"zF}\u0002\"\u007f\b)\u0005*-";
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
    
    public FragmentTabHost(final Context context) {
        super(context, (AttributeSet)null);
        this.mTabs = new ArrayList();
        this.initFragmentTabHost(context, null);
    }
    
    public FragmentTabHost(final Context context, final AttributeSet set) {
        super(context, set);
        this.mTabs = new ArrayList();
        this.initFragmentTabHost(context, set);
    }
    
    private FragmentTransaction doTabChanged(final String p0, final FragmentTransaction p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aconst_null    
        //     5: astore          4
        //     7: iconst_0       
        //     8: istore          5
        //    10: iload           5
        //    12: aload_0        
        //    13: getfield        android/support/v4/app/FragmentTabHost.mTabs:Ljava/util/ArrayList;
        //    16: invokevirtual   java/util/ArrayList.size:()I
        //    19: if_icmpge       62
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/FragmentTabHost.mTabs:Ljava/util/ArrayList;
        //    26: iload           5
        //    28: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    31: checkcast       Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //    34: astore          19
        //    36: aload           19
        //    38: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$200:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
        //    41: aload_1        
        //    42: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    45: ifeq            52
        //    48: aload           19
        //    50: astore          4
        //    52: iload           5
        //    54: iconst_1       
        //    55: iadd           
        //    56: istore          20
        //    58: iload_3        
        //    59: ifeq            269
        //    62: aload           4
        //    64: ifnonnull       102
        //    67: new             Ljava/lang/IllegalStateException;
        //    70: dup            
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: invokespecial   java/lang/StringBuilder.<init>:()V
        //    78: getstatic       android/support/v4/app/FragmentTabHost.z:[Ljava/lang/String;
        //    81: iconst_1       
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_1        
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    96: athrow         
        //    97: astore          18
        //    99: aload           18
        //   101: athrow         
        //   102: aload_0        
        //   103: getfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   106: astore          7
        //   108: aload           7
        //   110: aload           4
        //   112: if_acmpeq       242
        //   115: aload_2        
        //   116: ifnonnull       127
        //   119: aload_0        
        //   120: getfield        android/support/v4/app/FragmentTabHost.mFragmentManager:Landroid/support/v4/app/FragmentManager;
        //   123: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //   126: astore_2       
        //   127: aload_0        
        //   128: getfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   131: astore          10
        //   133: aload           10
        //   135: ifnull          160
        //   138: aload_0        
        //   139: getfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   142: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   145: ifnull          160
        //   148: aload_2        
        //   149: aload_0        
        //   150: getfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   153: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   156: invokevirtual   android/support/v4/app/FragmentTransaction.detach:(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
        //   159: pop            
        //   160: aload           4
        //   162: ifnull          236
        //   165: aload           4
        //   167: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   170: astore          13
        //   172: aload           13
        //   174: ifnonnull       226
        //   177: aload           4
        //   179: aload_0        
        //   180: getfield        android/support/v4/app/FragmentTabHost.mContext:Landroid/content/Context;
        //   183: aload           4
        //   185: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$300:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/Class;
        //   188: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   191: aload           4
        //   193: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$400:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/os/Bundle;
        //   196: invokestatic    android/support/v4/app/Fragment.instantiate:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
        //   199: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$102:(Landroid/support/v4/app/FragmentTabHost$TabInfo;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
        //   202: pop            
        //   203: aload_2        
        //   204: aload_0        
        //   205: getfield        android/support/v4/app/FragmentTabHost.mContainerId:I
        //   208: aload           4
        //   210: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   213: aload           4
        //   215: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$200:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
        //   218: invokevirtual   android/support/v4/app/FragmentTransaction.add:(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
        //   221: pop            
        //   222: iload_3        
        //   223: ifeq            236
        //   226: aload_2        
        //   227: aload           4
        //   229: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   232: invokevirtual   android/support/v4/app/FragmentTransaction.attach:(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
        //   235: pop            
        //   236: aload_0        
        //   237: aload           4
        //   239: putfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   242: aload_2        
        //   243: areturn        
        //   244: astore          6
        //   246: aload           6
        //   248: athrow         
        //   249: astore          8
        //   251: aload           8
        //   253: athrow         
        //   254: astore          9
        //   256: aload           9
        //   258: athrow         
        //   259: astore          11
        //   261: aload           11
        //   263: athrow         
        //   264: astore          12
        //   266: aload           12
        //   268: athrow         
        //   269: iload           20
        //   271: istore          5
        //   273: goto            10
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  67     97     97     102    Ljava/lang/IllegalStateException;
        //  102    108    244    249    Ljava/lang/IllegalStateException;
        //  127    133    249    254    Ljava/lang/IllegalStateException;
        //  138    160    254    259    Ljava/lang/IllegalStateException;
        //  165    172    259    264    Ljava/lang/IllegalStateException;
        //  177    222    264    269    Ljava/lang/IllegalStateException;
        //  226    236    264    269    Ljava/lang/IllegalStateException;
        //  251    254    254    259    Ljava/lang/IllegalStateException;
        //  261    264    264    269    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 133, Size: 133
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
    
    private void initFragmentTabHost(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842995 }, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener((TabHost$OnTabChangeListener)this);
    }
    
    protected void onAttachedToWindow() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   android/widget/TabHost.onAttachedToWindow:()V
        //     8: aload_0        
        //     9: invokevirtual   android/support/v4/app/FragmentTabHost.getCurrentTabTag:()Ljava/lang/String;
        //    12: astore_2       
        //    13: aconst_null    
        //    14: astore_3       
        //    15: iconst_0       
        //    16: istore          4
        //    18: iload           4
        //    20: aload_0        
        //    21: getfield        android/support/v4/app/FragmentTabHost.mTabs:Ljava/util/ArrayList;
        //    24: invokevirtual   java/util/ArrayList.size:()I
        //    27: if_icmpge       147
        //    30: aload_0        
        //    31: getfield        android/support/v4/app/FragmentTabHost.mTabs:Ljava/util/ArrayList;
        //    34: iload           4
        //    36: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    39: checkcast       Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //    42: astore          9
        //    44: aload           9
        //    46: aload_0        
        //    47: getfield        android/support/v4/app/FragmentTabHost.mFragmentManager:Landroid/support/v4/app/FragmentManager;
        //    50: aload           9
        //    52: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$200:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
        //    55: invokevirtual   android/support/v4/app/FragmentManager.findFragmentByTag:(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //    58: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$102:(Landroid/support/v4/app/FragmentTabHost$TabInfo;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
        //    61: pop            
        //    62: aload           9
        //    64: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //    67: astore          15
        //    69: aload           15
        //    71: ifnull          137
        //    74: aload           9
        //    76: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //    79: invokevirtual   android/support/v4/app/Fragment.isDetached:()Z
        //    82: istore          17
        //    84: iload           17
        //    86: ifne            137
        //    89: aload           9
        //    91: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$200:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
        //    94: aload_2        
        //    95: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    98: istore          18
        //   100: iload           18
        //   102: ifeq            115
        //   105: aload_0        
        //   106: aload           9
        //   108: putfield        android/support/v4/app/FragmentTabHost.mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
        //   111: iload_1        
        //   112: ifeq            137
        //   115: aload_3        
        //   116: ifnonnull       127
        //   119: aload_0        
        //   120: getfield        android/support/v4/app/FragmentTabHost.mFragmentManager:Landroid/support/v4/app/FragmentManager;
        //   123: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //   126: astore_3       
        //   127: aload_3        
        //   128: aload           9
        //   130: invokestatic    android/support/v4/app/FragmentTabHost$TabInfo.access$100:(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;
        //   133: invokevirtual   android/support/v4/app/FragmentTransaction.detach:(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
        //   136: pop            
        //   137: iload           4
        //   139: iconst_1       
        //   140: iadd           
        //   141: istore          16
        //   143: iload_1        
        //   144: ifeq            205
        //   147: aload_0        
        //   148: iconst_1       
        //   149: putfield        android/support/v4/app/FragmentTabHost.mAttached:Z
        //   152: aload_0        
        //   153: aload_2        
        //   154: aload_3        
        //   155: invokespecial   android/support/v4/app/FragmentTabHost.doTabChanged:(Ljava/lang/String;Landroid/support/v4/app/FragmentTransaction;)Landroid/support/v4/app/FragmentTransaction;
        //   158: astore          5
        //   160: aload           5
        //   162: ifnull          179
        //   165: aload           5
        //   167: invokevirtual   android/support/v4/app/FragmentTransaction.commit:()I
        //   170: pop            
        //   171: aload_0        
        //   172: getfield        android/support/v4/app/FragmentTabHost.mFragmentManager:Landroid/support/v4/app/FragmentManager;
        //   175: invokevirtual   android/support/v4/app/FragmentManager.executePendingTransactions:()Z
        //   178: pop            
        //   179: return         
        //   180: astore          10
        //   182: aload           10
        //   184: athrow         
        //   185: astore          11
        //   187: aload           11
        //   189: athrow         
        //   190: astore          12
        //   192: aload           12
        //   194: athrow         
        //   195: astore          13
        //   197: aload           13
        //   199: athrow         
        //   200: astore          6
        //   202: aload           6
        //   204: athrow         
        //   205: iload           16
        //   207: istore          4
        //   209: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  44     69     180    185    Ljava/lang/IllegalStateException;
        //  74     84     185    190    Ljava/lang/IllegalStateException;
        //  89     100    190    195    Ljava/lang/IllegalStateException;
        //  105    111    195    200    Ljava/lang/IllegalStateException;
        //  165    179    200    205    Ljava/lang/IllegalStateException;
        //  182    185    185    190    Ljava/lang/IllegalStateException;
        //  187    190    190    195    Ljava/lang/IllegalStateException;
        //  192    195    195    200    Ljava/lang/IllegalStateException;
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
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final FragmentTabHost$SavedState fragmentTabHost$SavedState = (FragmentTabHost$SavedState)parcelable;
        super.onRestoreInstanceState(fragmentTabHost$SavedState.getSuperState());
        this.setCurrentTabByTag(fragmentTabHost$SavedState.curTab);
    }
    
    protected Parcelable onSaveInstanceState() {
        final FragmentTabHost$SavedState fragmentTabHost$SavedState = new FragmentTabHost$SavedState(super.onSaveInstanceState());
        fragmentTabHost$SavedState.curTab = this.getCurrentTabTag();
        return (Parcelable)fragmentTabHost$SavedState;
    }
    
    public void onTabChanged(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/FragmentTabHost.mAttached:Z
        //     4: ifeq            23
        //     7: aload_0        
        //     8: aload_1        
        //     9: aconst_null    
        //    10: invokespecial   android/support/v4/app/FragmentTabHost.doTabChanged:(Ljava/lang/String;Landroid/support/v4/app/FragmentTransaction;)Landroid/support/v4/app/FragmentTransaction;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ifnull          23
        //    18: aload_3        
        //    19: invokevirtual   android/support/v4/app/FragmentTransaction.commit:()I
        //    22: pop            
        //    23: aload_0        
        //    24: getfield        android/support/v4/app/FragmentTabHost.mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
        //    27: ifnull          40
        //    30: aload_0        
        //    31: getfield        android/support/v4/app/FragmentTabHost.mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
        //    34: aload_1        
        //    35: invokeinterface android/widget/TabHost$OnTabChangeListener.onTabChanged:(Ljava/lang/String;)V
        //    40: return         
        //    41: astore          4
        //    43: aload           4
        //    45: athrow         
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     23     41     46     Ljava/lang/IllegalStateException;
        //  23     40     46     49     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    public void setOnTabChangedListener(final TabHost$OnTabChangeListener mOnTabChangeListener) {
        this.mOnTabChangeListener = mOnTabChangeListener;
    }
    
    @Deprecated
    public void setup() {
        throw new IllegalStateException(FragmentTabHost.z[0]);
    }
}
