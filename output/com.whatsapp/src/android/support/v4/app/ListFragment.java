// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;

public class ListFragment extends Fragment
{
    private static final String[] z;
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    private final Handler mHandler;
    ListView mList;
    View mListContainer;
    boolean mListShown;
    private final AdapterView$OnItemClickListener mOnClickListener;
    View mProgressContainer;
    private final Runnable mRequestFocus;
    TextView mStandardEmptyView;
    
    static {
        final String[] z2 = new String[4];
        String s = "\fl\u001f(\u0005oo\u0014/\u0004<h\u0015/\u0006&y\u0019/\u0010on\u0004|\u0005 `Ql\u001e!y\u0014a\u0005o{\u0018j\u0006";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\fb\u001f{\u0014!yQy\u0018*zQa\u001e;-\bj\u0005on\u0003j\u0010;h\u0015";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0016b\u0004}Q,b\u001f{\u0014!yQb\u0004<yQg\u00109hQnQ\u0003d\u0002{'&h\u0006/\u0006'b\u0002jQ&iQn\u0005;\u007f\u0018m\u0004;hQf\u0002o*\u0010a\u0015=b\u0018k_\u001d#\u0018k_#d\u0002{V";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\fb\u001f{\u0014!yQg\u0010<-\u0007f\u00148-\u0006f\u0005'-\u0018kQ.y\u0005}\u0018-x\u0005jQhl\u001fk\u0003 d\u0015!#ad\u0015!\u001d&~\u0005(Q;e\u0010{Q&~Qa\u001e;-\u0010/=&~\u0005Y\u0018*zQl\u001d.~\u0002";
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
    }
    
    public ListFragment() {
        this.mHandler = new Handler();
        this.mRequestFocus = new ListFragment$1(this);
        this.mOnClickListener = (AdapterView$OnItemClickListener)new ListFragment$2(this);
    }
    
    private void ensureList() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnull          17
        //    13: return         
        //    14: astore_2       
        //    15: aload_2        
        //    16: athrow         
        //    17: aload_0        
        //    18: invokevirtual   android/support/v4/app/ListFragment.getView:()Landroid/view/View;
        //    21: astore          4
        //    23: aload           4
        //    25: ifnonnull       46
        //    28: new             Ljava/lang/IllegalStateException;
        //    31: dup            
        //    32: getstatic       android/support/v4/app/ListFragment.z:[Ljava/lang/String;
        //    35: iconst_1       
        //    36: aaload         
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: astore          23
        //    43: aload           23
        //    45: athrow         
        //    46: aload           4
        //    48: instanceof      Landroid/widget/ListView;
        //    51: istore          9
        //    53: iload           9
        //    55: ifeq            71
        //    58: aload_0        
        //    59: aload           4
        //    61: checkcast       Landroid/widget/ListView;
        //    64: putfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //    67: iload_1        
        //    68: ifeq            288
        //    71: aload_0        
        //    72: aload           4
        //    74: ldc             16711681
        //    76: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    79: checkcast       Landroid/widget/TextView;
        //    82: putfield        android/support/v4/app/ListFragment.mStandardEmptyView:Landroid/widget/TextView;
        //    85: aload_0        
        //    86: getfield        android/support/v4/app/ListFragment.mStandardEmptyView:Landroid/widget/TextView;
        //    89: astore          10
        //    91: aload           10
        //    93: ifnonnull       111
        //    96: aload_0        
        //    97: aload           4
        //    99: ldc             16908292
        //   101: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   104: putfield        android/support/v4/app/ListFragment.mEmptyView:Landroid/view/View;
        //   107: iload_1        
        //   108: ifeq            120
        //   111: aload_0        
        //   112: getfield        android/support/v4/app/ListFragment.mStandardEmptyView:Landroid/widget/TextView;
        //   115: bipush          8
        //   117: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   120: aload_0        
        //   121: aload           4
        //   123: ldc             16711682
        //   125: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   128: putfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   131: aload_0        
        //   132: aload           4
        //   134: ldc             16711683
        //   136: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   139: putfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   142: aload           4
        //   144: ldc             16908298
        //   146: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   149: astore          11
        //   151: aload           11
        //   153: instanceof      Landroid/widget/ListView;
        //   156: istore          14
        //   158: iload           14
        //   160: ifne            224
        //   163: aload           11
        //   165: ifnonnull       211
        //   168: new             Ljava/lang/RuntimeException;
        //   171: dup            
        //   172: getstatic       android/support/v4/app/ListFragment.z:[Ljava/lang/String;
        //   175: iconst_2       
        //   176: aaload         
        //   177: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   180: athrow         
        //   181: astore          13
        //   183: aload           13
        //   185: athrow         
        //   186: astore          5
        //   188: aload           5
        //   190: athrow         
        //   191: astore          6
        //   193: aload           6
        //   195: athrow         
        //   196: astore          7
        //   198: aload           7
        //   200: athrow         
        //   201: astore          8
        //   203: aload           8
        //   205: athrow         
        //   206: astore          12
        //   208: aload           12
        //   210: athrow         
        //   211: new             Ljava/lang/RuntimeException;
        //   214: dup            
        //   215: getstatic       android/support/v4/app/ListFragment.z:[Ljava/lang/String;
        //   218: iconst_3       
        //   219: aaload         
        //   220: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   223: athrow         
        //   224: aload_0        
        //   225: aload           11
        //   227: checkcast       Landroid/widget/ListView;
        //   230: putfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //   233: aload_0        
        //   234: getfield        android/support/v4/app/ListFragment.mEmptyView:Landroid/view/View;
        //   237: astore          18
        //   239: aload           18
        //   241: ifnull          259
        //   244: aload_0        
        //   245: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //   248: aload_0        
        //   249: getfield        android/support/v4/app/ListFragment.mEmptyView:Landroid/view/View;
        //   252: invokevirtual   android/widget/ListView.setEmptyView:(Landroid/view/View;)V
        //   255: iload_1        
        //   256: ifeq            288
        //   259: aload_0        
        //   260: getfield        android/support/v4/app/ListFragment.mEmptyText:Ljava/lang/CharSequence;
        //   263: ifnull          288
        //   266: aload_0        
        //   267: getfield        android/support/v4/app/ListFragment.mStandardEmptyView:Landroid/widget/TextView;
        //   270: aload_0        
        //   271: getfield        android/support/v4/app/ListFragment.mEmptyText:Ljava/lang/CharSequence;
        //   274: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   277: aload_0        
        //   278: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //   281: aload_0        
        //   282: getfield        android/support/v4/app/ListFragment.mStandardEmptyView:Landroid/widget/TextView;
        //   285: invokevirtual   android/widget/ListView.setEmptyView:(Landroid/view/View;)V
        //   288: aload_0        
        //   289: iconst_1       
        //   290: putfield        android/support/v4/app/ListFragment.mListShown:Z
        //   293: aload_0        
        //   294: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //   297: aload_0        
        //   298: getfield        android/support/v4/app/ListFragment.mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;
        //   301: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   304: aload_0        
        //   305: getfield        android/support/v4/app/ListFragment.mAdapter:Landroid/widget/ListAdapter;
        //   308: ifnull          332
        //   311: aload_0        
        //   312: getfield        android/support/v4/app/ListFragment.mAdapter:Landroid/widget/ListAdapter;
        //   315: astore          21
        //   317: aload_0        
        //   318: aconst_null    
        //   319: putfield        android/support/v4/app/ListFragment.mAdapter:Landroid/widget/ListAdapter;
        //   322: aload_0        
        //   323: aload           21
        //   325: invokevirtual   android/support/v4/app/ListFragment.setListAdapter:(Landroid/widget/ListAdapter;)V
        //   328: iload_1        
        //   329: ifeq            345
        //   332: aload_0        
        //   333: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   336: ifnull          345
        //   339: aload_0        
        //   340: iconst_0       
        //   341: iconst_0       
        //   342: invokespecial   android/support/v4/app/ListFragment.setListShown:(ZZ)V
        //   345: aload_0        
        //   346: getfield        android/support/v4/app/ListFragment.mHandler:Landroid/os/Handler;
        //   349: aload_0        
        //   350: getfield        android/support/v4/app/ListFragment.mRequestFocus:Ljava/lang/Runnable;
        //   353: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   356: pop            
        //   357: return         
        //   358: astore          15
        //   360: aload           15
        //   362: athrow         
        //   363: astore          16
        //   365: aload           16
        //   367: athrow         
        //   368: astore          17
        //   370: aload           17
        //   372: athrow         
        //   373: astore          22
        //   375: aload           22
        //   377: athrow         
        //   378: astore          19
        //   380: aload           19
        //   382: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      9      14     17     Ljava/lang/IllegalStateException;
        //  28     41     41     46     Ljava/lang/IllegalStateException;
        //  46     53     186    191    Ljava/lang/IllegalStateException;
        //  58     67     191    196    Ljava/lang/IllegalStateException;
        //  71     91     196    201    Ljava/lang/IllegalStateException;
        //  96     107    201    206    Ljava/lang/IllegalStateException;
        //  111    120    201    206    Ljava/lang/IllegalStateException;
        //  151    158    206    211    Ljava/lang/IllegalStateException;
        //  168    181    181    186    Ljava/lang/IllegalStateException;
        //  188    191    191    196    Ljava/lang/IllegalStateException;
        //  193    196    196    201    Ljava/lang/IllegalStateException;
        //  198    201    201    206    Ljava/lang/IllegalStateException;
        //  208    211    181    186    Ljava/lang/IllegalStateException;
        //  224    239    358    363    Ljava/lang/IllegalStateException;
        //  244    255    363    368    Ljava/lang/IllegalStateException;
        //  259    288    368    373    Ljava/lang/IllegalStateException;
        //  317    328    373    378    Ljava/lang/IllegalStateException;
        //  332    345    378    383    Ljava/lang/IllegalStateException;
        //  360    363    363    368    Ljava/lang/IllegalStateException;
        //  365    368    368    373    Ljava/lang/IllegalStateException;
        //  375    378    378    383    Ljava/lang/IllegalStateException;
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
    
    private void setListShown(final boolean p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   android/support/v4/app/ListFragment.ensureList:()V
        //     8: aload_0        
        //     9: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //    12: ifnonnull       33
        //    15: new             Ljava/lang/IllegalStateException;
        //    18: dup            
        //    19: getstatic       android/support/v4/app/ListFragment.z:[Ljava/lang/String;
        //    22: iconst_0       
        //    23: aaload         
        //    24: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    27: athrow         
        //    28: astore          4
        //    30: aload           4
        //    32: athrow         
        //    33: aload_0        
        //    34: getfield        android/support/v4/app/ListFragment.mListShown:Z
        //    37: istore          6
        //    39: iload           6
        //    41: iload_1        
        //    42: if_icmpne       51
        //    45: return         
        //    46: astore          5
        //    48: aload           5
        //    50: athrow         
        //    51: aload_0        
        //    52: iload_1        
        //    53: putfield        android/support/v4/app/ListFragment.mListShown:Z
        //    56: iload_1        
        //    57: ifeq            135
        //    60: iload_2        
        //    61: ifeq            100
        //    64: aload_0        
        //    65: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //    68: aload_0        
        //    69: invokevirtual   android/support/v4/app/ListFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    72: ldc             17432577
        //    74: invokestatic    android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
        //    77: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    80: aload_0        
        //    81: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //    84: aload_0        
        //    85: invokevirtual   android/support/v4/app/ListFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    88: ldc             17432576
        //    90: invokestatic    android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
        //    93: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    96: iload_3        
        //    97: ifeq            114
        //   100: aload_0        
        //   101: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   104: invokevirtual   android/view/View.clearAnimation:()V
        //   107: aload_0        
        //   108: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   111: invokevirtual   android/view/View.clearAnimation:()V
        //   114: aload_0        
        //   115: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   118: bipush          8
        //   120: invokevirtual   android/view/View.setVisibility:(I)V
        //   123: aload_0        
        //   124: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   127: iconst_0       
        //   128: invokevirtual   android/view/View.setVisibility:(I)V
        //   131: iload_3        
        //   132: ifeq            45
        //   135: iload_2        
        //   136: ifeq            175
        //   139: aload_0        
        //   140: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   143: aload_0        
        //   144: invokevirtual   android/support/v4/app/ListFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   147: ldc             17432576
        //   149: invokestatic    android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
        //   152: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   155: aload_0        
        //   156: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   159: aload_0        
        //   160: invokevirtual   android/support/v4/app/ListFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   163: ldc             17432577
        //   165: invokestatic    android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
        //   168: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   171: iload_3        
        //   172: ifeq            189
        //   175: aload_0        
        //   176: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   179: invokevirtual   android/view/View.clearAnimation:()V
        //   182: aload_0        
        //   183: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   186: invokevirtual   android/view/View.clearAnimation:()V
        //   189: aload_0        
        //   190: getfield        android/support/v4/app/ListFragment.mProgressContainer:Landroid/view/View;
        //   193: iconst_0       
        //   194: invokevirtual   android/view/View.setVisibility:(I)V
        //   197: aload_0        
        //   198: getfield        android/support/v4/app/ListFragment.mListContainer:Landroid/view/View;
        //   201: bipush          8
        //   203: invokevirtual   android/view/View.setVisibility:(I)V
        //   206: return         
        //   207: astore          7
        //   209: aload           7
        //   211: athrow         
        //   212: astore          8
        //   214: aload           8
        //   216: athrow         
        //   217: astore          9
        //   219: aload           9
        //   221: athrow         
        //   222: astore          11
        //   224: aload           11
        //   226: athrow         
        //   227: astore          12
        //   229: aload           12
        //   231: athrow         
        //   232: astore          10
        //   234: aload           10
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      28     28     33     Ljava/lang/IllegalStateException;
        //  33     39     46     51     Ljava/lang/IllegalStateException;
        //  51     56     207    217    Ljava/lang/IllegalStateException;
        //  64     96     217    222    Ljava/lang/IllegalStateException;
        //  100    114    217    222    Ljava/lang/IllegalStateException;
        //  114    131    222    232    Ljava/lang/IllegalStateException;
        //  139    171    232    237    Ljava/lang/IllegalStateException;
        //  175    189    232    237    Ljava/lang/IllegalStateException;
        //  209    212    212    217    Ljava/lang/IllegalStateException;
        //  214    217    217    222    Ljava/lang/IllegalStateException;
        //  224    227    227    232    Ljava/lang/IllegalStateException;
        //  229    232    232    237    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 117, Size: 117
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
    
    public ListView getListView() {
        this.ensureList();
        return this.mList;
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final int a = Fragment.a;
        final FragmentActivity activity = this.getActivity();
        final FrameLayout frameLayout = new FrameLayout((Context)activity);
        final LinearLayout linearLayout = new LinearLayout((Context)activity);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView((View)new ProgressBar((Context)activity, (AttributeSet)null, 16842874), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final FrameLayout frameLayout2 = new FrameLayout((Context)activity);
        frameLayout2.setId(16711683);
        final TextView textView = new TextView((Context)this.getActivity());
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView((View)textView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final ListView listView = new ListView((Context)this.getActivity());
        try {
            listView.setId(16908298);
            listView.setDrawSelectorOnTop(false);
            frameLayout2.addView((View)listView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            frameLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            if (FragmentActivity.a != 0) {
                Fragment.a = a + 1;
            }
            return (View)frameLayout;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }
    
    public void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ensureList();
    }
    
    public void setListAdapter(final ListAdapter p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/ListFragment.mAdapter:Landroid/widget/ListAdapter;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          83
        //     9: iconst_1       
        //    10: istore          4
        //    12: aload_0        
        //    13: aload_1        
        //    14: putfield        android/support/v4/app/ListFragment.mAdapter:Landroid/widget/ListAdapter;
        //    17: aload_0        
        //    18: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //    21: astore          9
        //    23: aload           9
        //    25: ifnull          79
        //    28: aload_0        
        //    29: getfield        android/support/v4/app/ListFragment.mList:Landroid/widget/ListView;
        //    32: aload_1        
        //    33: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //    36: aload_0        
        //    37: getfield        android/support/v4/app/ListFragment.mListShown:Z
        //    40: istore          10
        //    42: iload           10
        //    44: ifne            79
        //    47: iload           4
        //    49: ifne            79
        //    52: aload_0        
        //    53: invokevirtual   android/support/v4/app/ListFragment.getView:()Landroid/view/View;
        //    56: invokevirtual   android/view/View.getWindowToken:()Landroid/os/IBinder;
        //    59: astore          11
        //    61: iconst_0       
        //    62: istore          12
        //    64: aload           11
        //    66: ifnull          72
        //    69: iconst_1       
        //    70: istore          12
        //    72: aload_0        
        //    73: iconst_1       
        //    74: iload           12
        //    76: invokespecial   android/support/v4/app/ListFragment.setListShown:(ZZ)V
        //    79: return         
        //    80: astore_2       
        //    81: aload_2        
        //    82: athrow         
        //    83: iconst_0       
        //    84: istore          4
        //    86: goto            12
        //    89: astore          5
        //    91: aload           5
        //    93: athrow         
        //    94: astore          6
        //    96: aload           6
        //    98: athrow         
        //    99: astore          7
        //   101: aload           7
        //   103: athrow         
        //   104: astore          8
        //   106: aload           8
        //   108: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      80     83     Ljava/lang/IllegalStateException;
        //  12     23     89     94     Ljava/lang/IllegalStateException;
        //  28     42     94     104    Ljava/lang/IllegalStateException;
        //  52     61     104    109    Ljava/lang/IllegalStateException;
        //  91     94     94     104    Ljava/lang/IllegalStateException;
        //  96     99     99     104    Ljava/lang/IllegalStateException;
        //  101    104    104    109    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
