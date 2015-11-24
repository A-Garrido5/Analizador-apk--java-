// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.content.DialogInterface$OnClickListener;
import android.view.KeyEvent;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.content.Context;
import android.os.Message;
import android.widget.Button;
import android.view.View$OnClickListener;
import android.widget.ListAdapter;

class AlertController
{
    private static final String z;
    private ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final View$OnClickListener mButtonHandler;
    private Button mButtonNegative;
    private Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    private Button mButtonNeutral;
    private Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    private Button mButtonPositive;
    private Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private int mCheckedItem;
    private final Context mContext;
    private View mCustomTitleView;
    private final AppCompatDialog mDialog;
    private Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    private int mListItemLayout;
    private int mListLayout;
    private ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    private int mMultiChoiceItemLayout;
    private ScrollView mScrollView;
    private int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;
    
    static {
        final char[] charArray = "\n^_[\u001b&\u000bO@\u0011;\u000bE@\u0000hNSF\u0007<".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 't';
                    break;
                }
                case 0: {
                    c2 = 'H';
                    break;
                }
                case 1: {
                    c2 = '+';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = '/';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public AlertController(final Context p0, final AppCompatDialog p1, final Window p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: iconst_0       
        //    11: putfield        android/support/v7/app/AlertController.mViewSpacingSpecified:Z
        //    14: aload_0        
        //    15: iconst_0       
        //    16: putfield        android/support/v7/app/AlertController.mIconId:I
        //    19: aload_0        
        //    20: iconst_m1      
        //    21: putfield        android/support/v7/app/AlertController.mCheckedItem:I
        //    24: aload_0        
        //    25: iconst_0       
        //    26: putfield        android/support/v7/app/AlertController.mButtonPanelLayoutHint:I
        //    29: aload_0        
        //    30: new             Landroid/support/v7/app/AlertController$1;
        //    33: dup            
        //    34: aload_0        
        //    35: invokespecial   android/support/v7/app/AlertController$1.<init>:(Landroid/support/v7/app/AlertController;)V
        //    38: putfield        android/support/v7/app/AlertController.mButtonHandler:Landroid/view/View$OnClickListener;
        //    41: aload_0        
        //    42: aload_1        
        //    43: putfield        android/support/v7/app/AlertController.mContext:Landroid/content/Context;
        //    46: aload_0        
        //    47: aload_2        
        //    48: putfield        android/support/v7/app/AlertController.mDialog:Landroid/support/v7/app/AppCompatDialog;
        //    51: aload_0        
        //    52: aload_3        
        //    53: putfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    56: aload_0        
        //    57: new             Landroid/support/v7/app/AlertController$ButtonHandler;
        //    60: dup            
        //    61: aload_2        
        //    62: invokespecial   android/support/v7/app/AlertController$ButtonHandler.<init>:(Landroid/content/DialogInterface;)V
        //    65: putfield        android/support/v7/app/AlertController.mHandler:Landroid/os/Handler;
        //    68: aload_1        
        //    69: aconst_null    
        //    70: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog:[I
        //    73: getstatic       android/support/v7/appcompat/R$attr.alertDialogStyle:I
        //    76: iconst_0       
        //    77: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
        //    80: astore          5
        //    82: aload_0        
        //    83: aload           5
        //    85: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_android_layout:I
        //    88: iconst_0       
        //    89: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //    92: putfield        android/support/v7/app/AlertController.mAlertDialogLayout:I
        //    95: aload_0        
        //    96: aload           5
        //    98: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_buttonPanelSideLayout:I
        //   101: iconst_0       
        //   102: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   105: putfield        android/support/v7/app/AlertController.mButtonPanelSideLayout:I
        //   108: aload_0        
        //   109: aload           5
        //   111: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_listLayout:I
        //   114: iconst_0       
        //   115: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   118: putfield        android/support/v7/app/AlertController.mListLayout:I
        //   121: aload_0        
        //   122: aload           5
        //   124: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_multiChoiceItemLayout:I
        //   127: iconst_0       
        //   128: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   131: putfield        android/support/v7/app/AlertController.mMultiChoiceItemLayout:I
        //   134: aload_0        
        //   135: aload           5
        //   137: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_singleChoiceItemLayout:I
        //   140: iconst_0       
        //   141: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   144: putfield        android/support/v7/app/AlertController.mSingleChoiceItemLayout:I
        //   147: aload_0        
        //   148: aload           5
        //   150: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog_listItemLayout:I
        //   153: iconst_0       
        //   154: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   157: putfield        android/support/v7/app/AlertController.mListItemLayout:I
        //   160: aload           5
        //   162: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   165: iload           4
        //   167: ifeq            188
        //   170: getstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   173: istore          8
        //   175: iconst_0       
        //   176: istore          9
        //   178: iload           8
        //   180: ifeq            199
        //   183: iload           9
        //   185: putstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   188: return         
        //   189: astore          6
        //   191: aload           6
        //   193: athrow         
        //   194: astore          7
        //   196: aload           7
        //   198: athrow         
        //   199: iconst_1       
        //   200: istore          9
        //   202: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  82     165    189    194    Ljava/lang/IllegalArgumentException;
        //  170    175    194    199    Ljava/lang/IllegalArgumentException;
        //  191    194    194    199    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0183:
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
    
    static Button access$000(final AlertController alertController) {
        return alertController.mButtonPositive;
    }
    
    static Message access$100(final AlertController alertController) {
        return alertController.mButtonPositiveMessage;
    }
    
    static int access$1000(final AlertController alertController) {
        return alertController.mSingleChoiceItemLayout;
    }
    
    static int access$1100(final AlertController alertController) {
        return alertController.mListItemLayout;
    }
    
    static ListAdapter access$1202(final AlertController alertController, final ListAdapter mAdapter) {
        return alertController.mAdapter = mAdapter;
    }
    
    static int access$1302(final AlertController alertController, final int mCheckedItem) {
        return alertController.mCheckedItem = mCheckedItem;
    }
    
    static ListView access$1402(final AlertController alertController, final ListView mListView) {
        return alertController.mListView = mListView;
    }
    
    static Button access$200(final AlertController alertController) {
        return alertController.mButtonNegative;
    }
    
    static Message access$300(final AlertController alertController) {
        return alertController.mButtonNegativeMessage;
    }
    
    static Button access$400(final AlertController alertController) {
        return alertController.mButtonNeutral;
    }
    
    static Message access$500(final AlertController alertController) {
        return alertController.mButtonNeutralMessage;
    }
    
    static AppCompatDialog access$600(final AlertController alertController) {
        return alertController.mDialog;
    }
    
    static Handler access$700(final AlertController alertController) {
        return alertController.mHandler;
    }
    
    static int access$800(final AlertController alertController) {
        return alertController.mListLayout;
    }
    
    static int access$900(final AlertController alertController) {
        return alertController.mMultiChoiceItemLayout;
    }
    
    static boolean canTextInput(final View view) {
        try {
            if (view.onCheckIsTextEditor()) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (!(view instanceof ViewGroup)) {
                return false;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            --i;
            if (canTextInput(viewGroup.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    private void centerButton(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private int selectContentView() {
        try {
            if (this.mButtonPanelSideLayout == 0) {
                return this.mAlertDialogLayout;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.mButtonPanelLayoutHint == 1) {
                return this.mButtonPanelSideLayout;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return this.mAlertDialogLayout;
    }
    
    private boolean setupButtons() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //     9: ldc_w           16908313
        //    12: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    15: checkcast       Landroid/widget/Button;
        //    18: putfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //    21: aload_0        
        //    22: getfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //    25: aload_0        
        //    26: getfield        android/support/v7/app/AlertController.mButtonHandler:Landroid/view/View$OnClickListener;
        //    29: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    32: aload_0        
        //    33: getfield        android/support/v7/app/AlertController.mButtonPositiveText:Ljava/lang/CharSequence;
        //    36: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    39: ifeq            55
        //    42: aload_0        
        //    43: getfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //    46: bipush          8
        //    48: invokevirtual   android/widget/Button.setVisibility:(I)V
        //    51: iload_1        
        //    52: ifeq            347
        //    55: aload_0        
        //    56: getfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //    59: aload_0        
        //    60: getfield        android/support/v7/app/AlertController.mButtonPositiveText:Ljava/lang/CharSequence;
        //    63: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //    66: aload_0        
        //    67: getfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //    70: iconst_0       
        //    71: invokevirtual   android/widget/Button.setVisibility:(I)V
        //    74: iconst_1       
        //    75: istore_3       
        //    76: aload_0        
        //    77: aload_0        
        //    78: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    81: ldc_w           16908314
        //    84: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    87: checkcast       Landroid/widget/Button;
        //    90: putfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //    93: aload_0        
        //    94: getfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //    97: aload_0        
        //    98: getfield        android/support/v7/app/AlertController.mButtonHandler:Landroid/view/View$OnClickListener;
        //   101: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   104: aload_0        
        //   105: getfield        android/support/v7/app/AlertController.mButtonNegativeText:Ljava/lang/CharSequence;
        //   108: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   111: ifeq            127
        //   114: aload_0        
        //   115: getfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //   118: bipush          8
        //   120: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   123: iload_1        
        //   124: ifeq            150
        //   127: aload_0        
        //   128: getfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //   131: aload_0        
        //   132: getfield        android/support/v7/app/AlertController.mButtonNegativeText:Ljava/lang/CharSequence;
        //   135: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   138: aload_0        
        //   139: getfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //   142: iconst_0       
        //   143: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   146: iload_3        
        //   147: iconst_2       
        //   148: ior            
        //   149: istore_3       
        //   150: aload_0        
        //   151: aload_0        
        //   152: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   155: ldc_w           16908315
        //   158: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   161: checkcast       Landroid/widget/Button;
        //   164: putfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   167: aload_0        
        //   168: getfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   171: aload_0        
        //   172: getfield        android/support/v7/app/AlertController.mButtonHandler:Landroid/view/View$OnClickListener;
        //   175: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   178: aload_0        
        //   179: getfield        android/support/v7/app/AlertController.mButtonNeutralText:Ljava/lang/CharSequence;
        //   182: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   185: ifeq            201
        //   188: aload_0        
        //   189: getfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   192: bipush          8
        //   194: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   197: iload_1        
        //   198: ifeq            341
        //   201: aload_0        
        //   202: getfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   205: aload_0        
        //   206: getfield        android/support/v7/app/AlertController.mButtonNeutralText:Ljava/lang/CharSequence;
        //   209: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   212: aload_0        
        //   213: getfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   216: iconst_0       
        //   217: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   220: iload_3        
        //   221: iconst_4       
        //   222: ior            
        //   223: istore          6
        //   225: aload_0        
        //   226: getfield        android/support/v7/app/AlertController.mContext:Landroid/content/Context;
        //   229: invokestatic    android/support/v7/app/AlertController.shouldCenterSingleButton:(Landroid/content/Context;)Z
        //   232: istore          13
        //   234: iload           13
        //   236: ifeq            289
        //   239: iload           6
        //   241: iconst_1       
        //   242: if_icmpne       257
        //   245: aload_0        
        //   246: aload_0        
        //   247: getfield        android/support/v7/app/AlertController.mButtonPositive:Landroid/widget/Button;
        //   250: invokespecial   android/support/v7/app/AlertController.centerButton:(Landroid/widget/Button;)V
        //   253: iload_1        
        //   254: ifeq            289
        //   257: iload           6
        //   259: iconst_2       
        //   260: if_icmpne       275
        //   263: aload_0        
        //   264: aload_0        
        //   265: getfield        android/support/v7/app/AlertController.mButtonNegative:Landroid/widget/Button;
        //   268: invokespecial   android/support/v7/app/AlertController.centerButton:(Landroid/widget/Button;)V
        //   271: iload_1        
        //   272: ifeq            289
        //   275: iload           6
        //   277: iconst_4       
        //   278: if_icmpne       289
        //   281: aload_0        
        //   282: aload_0        
        //   283: getfield        android/support/v7/app/AlertController.mButtonNeutral:Landroid/widget/Button;
        //   286: invokespecial   android/support/v7/app/AlertController.centerButton:(Landroid/widget/Button;)V
        //   289: iload           6
        //   291: ifeq            339
        //   294: iconst_1       
        //   295: ireturn        
        //   296: astore_2       
        //   297: aload_2        
        //   298: athrow         
        //   299: astore          4
        //   301: aload           4
        //   303: athrow         
        //   304: astore          5
        //   306: aload           5
        //   308: athrow         
        //   309: astore          7
        //   311: aload           7
        //   313: athrow         
        //   314: astore          8
        //   316: aload           8
        //   318: athrow         
        //   319: astore          9
        //   321: aload           9
        //   323: athrow         
        //   324: astore          10
        //   326: aload           10
        //   328: athrow         
        //   329: astore          11
        //   331: aload           11
        //   333: athrow         
        //   334: astore          12
        //   336: aload           12
        //   338: athrow         
        //   339: iconst_0       
        //   340: ireturn        
        //   341: iload_3        
        //   342: istore          6
        //   344: goto            225
        //   347: iconst_0       
        //   348: istore_3       
        //   349: goto            76
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      51     296    299    Ljava/lang/IllegalArgumentException;
        //  76     123    299    304    Ljava/lang/IllegalArgumentException;
        //  150    197    304    309    Ljava/lang/IllegalArgumentException;
        //  225    234    309    319    Ljava/lang/IllegalArgumentException;
        //  245    253    319    329    Ljava/lang/IllegalArgumentException;
        //  263    271    329    334    Ljava/lang/IllegalArgumentException;
        //  281    289    334    339    Ljava/lang/IllegalArgumentException;
        //  311    314    314    319    Ljava/lang/IllegalArgumentException;
        //  316    319    319    329    Ljava/lang/IllegalArgumentException;
        //  321    324    324    329    Ljava/lang/IllegalArgumentException;
        //  326    329    329    334    Ljava/lang/IllegalArgumentException;
        //  331    334    334    339    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
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
    
    private void setupContent(final ViewGroup p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //     9: getstatic       android/support/v7/appcompat/R$id.scrollView:I
        //    12: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    15: checkcast       Landroid/widget/ScrollView;
        //    18: putfield        android/support/v7/app/AlertController.mScrollView:Landroid/widget/ScrollView;
        //    21: aload_0        
        //    22: getfield        android/support/v7/app/AlertController.mScrollView:Landroid/widget/ScrollView;
        //    25: iconst_0       
        //    26: invokevirtual   android/widget/ScrollView.setFocusable:(Z)V
        //    29: aload_0        
        //    30: aload_0        
        //    31: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    34: ldc_w           16908299
        //    37: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    40: checkcast       Landroid/widget/TextView;
        //    43: putfield        android/support/v7/app/AlertController.mMessageView:Landroid/widget/TextView;
        //    46: aload_0        
        //    47: getfield        android/support/v7/app/AlertController.mMessageView:Landroid/widget/TextView;
        //    50: astore          4
        //    52: aload           4
        //    54: ifnonnull       61
        //    57: return         
        //    58: astore_3       
        //    59: aload_3        
        //    60: athrow         
        //    61: aload_0        
        //    62: getfield        android/support/v7/app/AlertController.mMessage:Ljava/lang/CharSequence;
        //    65: astore          7
        //    67: aload           7
        //    69: ifnull          87
        //    72: aload_0        
        //    73: getfield        android/support/v7/app/AlertController.mMessageView:Landroid/widget/TextView;
        //    76: aload_0        
        //    77: getfield        android/support/v7/app/AlertController.mMessage:Ljava/lang/CharSequence;
        //    80: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    83: iload_2        
        //    84: ifeq            57
        //    87: aload_0        
        //    88: getfield        android/support/v7/app/AlertController.mMessageView:Landroid/widget/TextView;
        //    91: bipush          8
        //    93: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    96: aload_0        
        //    97: getfield        android/support/v7/app/AlertController.mScrollView:Landroid/widget/ScrollView;
        //   100: aload_0        
        //   101: getfield        android/support/v7/app/AlertController.mMessageView:Landroid/widget/TextView;
        //   104: invokevirtual   android/widget/ScrollView.removeView:(Landroid/view/View;)V
        //   107: aload_0        
        //   108: getfield        android/support/v7/app/AlertController.mListView:Landroid/widget/ListView;
        //   111: astore          8
        //   113: aload           8
        //   115: ifnull          172
        //   118: aload_0        
        //   119: getfield        android/support/v7/app/AlertController.mScrollView:Landroid/widget/ScrollView;
        //   122: invokevirtual   android/widget/ScrollView.getParent:()Landroid/view/ViewParent;
        //   125: checkcast       Landroid/view/ViewGroup;
        //   128: astore          10
        //   130: aload           10
        //   132: aload_0        
        //   133: getfield        android/support/v7/app/AlertController.mScrollView:Landroid/widget/ScrollView;
        //   136: invokevirtual   android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
        //   139: istore          11
        //   141: aload           10
        //   143: iload           11
        //   145: invokevirtual   android/view/ViewGroup.removeViewAt:(I)V
        //   148: aload           10
        //   150: aload_0        
        //   151: getfield        android/support/v7/app/AlertController.mListView:Landroid/widget/ListView;
        //   154: iload           11
        //   156: new             Landroid/view/ViewGroup$LayoutParams;
        //   159: dup            
        //   160: iconst_m1      
        //   161: iconst_m1      
        //   162: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   165: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
        //   168: iload_2        
        //   169: ifeq            57
        //   172: aload_1        
        //   173: bipush          8
        //   175: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   178: return         
        //   179: astore          9
        //   181: aload           9
        //   183: athrow         
        //   184: astore          5
        //   186: aload           5
        //   188: athrow         
        //   189: astore          6
        //   191: aload           6
        //   193: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      52     58     61     Ljava/lang/IllegalArgumentException;
        //  61     67     184    189    Ljava/lang/IllegalArgumentException;
        //  72     83     189    194    Ljava/lang/IllegalArgumentException;
        //  87     113    189    194    Ljava/lang/IllegalArgumentException;
        //  141    168    179    184    Ljava/lang/IllegalArgumentException;
        //  172    178    179    184    Ljava/lang/IllegalArgumentException;
        //  186    189    189    194    Ljava/lang/IllegalArgumentException;
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
    
    private boolean setupTitle(final ViewGroup p0) {
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
        //     7: getfield        android/support/v7/app/AlertController.mCustomTitleView:Landroid/view/View;
        //    10: ifnull          59
        //    13: new             Landroid/view/ViewGroup$LayoutParams;
        //    16: dup            
        //    17: iconst_m1      
        //    18: bipush          -2
        //    20: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //    23: astore          4
        //    25: aload_1        
        //    26: aload_0        
        //    27: getfield        android/support/v7/app/AlertController.mCustomTitleView:Landroid/view/View;
        //    30: iconst_0       
        //    31: aload           4
        //    33: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
        //    36: aload_0        
        //    37: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    40: getstatic       android/support/v7/appcompat/R$id.title_template:I
        //    43: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    46: astore          5
        //    48: aload           5
        //    50: bipush          8
        //    52: invokevirtual   android/view/View.setVisibility:(I)V
        //    55: iload_3        
        //    56: ifeq            258
        //    59: aload_0        
        //    60: aload_0        
        //    61: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    64: ldc_w           16908294
        //    67: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    70: checkcast       Landroid/widget/ImageView;
        //    73: putfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    76: aload_0        
        //    77: getfield        android/support/v7/app/AlertController.mTitle:Ljava/lang/CharSequence;
        //    80: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    83: istore          8
        //    85: iload           8
        //    87: ifne            270
        //    90: iload_2        
        //    91: istore          9
        //    93: iload           9
        //    95: ifeq            226
        //    98: aload_0        
        //    99: aload_0        
        //   100: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   103: getstatic       android/support/v7/appcompat/R$id.alertTitle:I
        //   106: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   109: checkcast       Landroid/widget/TextView;
        //   112: putfield        android/support/v7/app/AlertController.mTitleView:Landroid/widget/TextView;
        //   115: aload_0        
        //   116: getfield        android/support/v7/app/AlertController.mTitleView:Landroid/widget/TextView;
        //   119: aload_0        
        //   120: getfield        android/support/v7/app/AlertController.mTitle:Ljava/lang/CharSequence;
        //   123: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   126: aload_0        
        //   127: getfield        android/support/v7/app/AlertController.mIconId:I
        //   130: istore          14
        //   132: iload           14
        //   134: ifeq            152
        //   137: aload_0        
        //   138: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   141: aload_0        
        //   142: getfield        android/support/v7/app/AlertController.mIconId:I
        //   145: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   148: iload_3        
        //   149: ifeq            258
        //   152: aload_0        
        //   153: getfield        android/support/v7/app/AlertController.mIcon:Landroid/graphics/drawable/Drawable;
        //   156: astore          15
        //   158: aload           15
        //   160: ifnull          178
        //   163: aload_0        
        //   164: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   167: aload_0        
        //   168: getfield        android/support/v7/app/AlertController.mIcon:Landroid/graphics/drawable/Drawable;
        //   171: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   174: iload_3        
        //   175: ifeq            258
        //   178: aload_0        
        //   179: getfield        android/support/v7/app/AlertController.mTitleView:Landroid/widget/TextView;
        //   182: aload_0        
        //   183: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   186: invokevirtual   android/widget/ImageView.getPaddingLeft:()I
        //   189: aload_0        
        //   190: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   193: invokevirtual   android/widget/ImageView.getPaddingTop:()I
        //   196: aload_0        
        //   197: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   200: invokevirtual   android/widget/ImageView.getPaddingRight:()I
        //   203: aload_0        
        //   204: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   207: invokevirtual   android/widget/ImageView.getPaddingBottom:()I
        //   210: invokevirtual   android/widget/TextView.setPadding:(IIII)V
        //   213: aload_0        
        //   214: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   217: bipush          8
        //   219: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   222: iload_3        
        //   223: ifeq            258
        //   226: aload_0        
        //   227: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   230: getstatic       android/support/v7/appcompat/R$id.title_template:I
        //   233: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   236: bipush          8
        //   238: invokevirtual   android/view/View.setVisibility:(I)V
        //   241: aload_0        
        //   242: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //   245: bipush          8
        //   247: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   250: aload_1        
        //   251: bipush          8
        //   253: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   256: iconst_0       
        //   257: istore_2       
        //   258: iload_2        
        //   259: ireturn        
        //   260: astore          6
        //   262: aload           6
        //   264: athrow         
        //   265: astore          7
        //   267: aload           7
        //   269: athrow         
        //   270: iconst_0       
        //   271: istore          9
        //   273: goto            93
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
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  48     55     260    265    Ljava/lang/IllegalArgumentException;
        //  59     85     265    270    Ljava/lang/IllegalArgumentException;
        //  98     132    276    281    Ljava/lang/IllegalArgumentException;
        //  137    148    281    286    Ljava/lang/IllegalArgumentException;
        //  152    158    286    291    Ljava/lang/IllegalArgumentException;
        //  163    174    291    296    Ljava/lang/IllegalArgumentException;
        //  178    222    291    296    Ljava/lang/IllegalArgumentException;
        //  262    265    265    270    Ljava/lang/IllegalArgumentException;
        //  278    281    281    286    Ljava/lang/IllegalArgumentException;
        //  283    286    286    291    Ljava/lang/IllegalArgumentException;
        //  288    291    291    296    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
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
    
    private void setupView() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       android/support/v7/app/ActionBar.a:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: aload_0        
        //     8: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    11: getstatic       android/support/v7/appcompat/R$id.contentPanel:I
        //    14: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    17: checkcast       Landroid/view/ViewGroup;
        //    20: invokespecial   android/support/v7/app/AlertController.setupContent:(Landroid/view/ViewGroup;)V
        //    23: aload_0        
        //    24: invokespecial   android/support/v7/app/AlertController.setupButtons:()Z
        //    27: istore_3       
        //    28: aload_0        
        //    29: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    32: getstatic       android/support/v7/appcompat/R$id.topPanel:I
        //    35: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    38: checkcast       Landroid/view/ViewGroup;
        //    41: astore          4
        //    43: aload_0        
        //    44: getfield        android/support/v7/app/AlertController.mContext:Landroid/content/Context;
        //    47: aconst_null    
        //    48: getstatic       android/support/v7/appcompat/R$styleable.AlertDialog:[I
        //    51: getstatic       android/support/v7/appcompat/R$attr.alertDialogStyle:I
        //    54: iconst_0       
        //    55: invokestatic    android/support/v7/internal/widget/TintTypedArray.obtainStyledAttributes:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/TintTypedArray;
        //    58: astore          5
        //    60: aload_0        
        //    61: aload           4
        //    63: invokespecial   android/support/v7/app/AlertController.setupTitle:(Landroid/view/ViewGroup;)Z
        //    66: pop            
        //    67: aload_0        
        //    68: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    71: getstatic       android/support/v7/appcompat/R$id.buttonPanel:I
        //    74: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //    77: astore          7
        //    79: iload_3        
        //    80: ifne            113
        //    83: aload           7
        //    85: bipush          8
        //    87: invokevirtual   android/view/View.setVisibility:(I)V
        //    90: aload_0        
        //    91: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //    94: getstatic       android/support/v7/appcompat/R$id.textSpacerNoButtons:I
        //    97: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   100: astore          22
        //   102: aload           22
        //   104: ifnull          113
        //   107: aload           22
        //   109: iconst_0       
        //   110: invokevirtual   android/view/View.setVisibility:(I)V
        //   113: aload_0        
        //   114: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   117: getstatic       android/support/v7/appcompat/R$id.customPanel:I
        //   120: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   123: checkcast       Landroid/widget/FrameLayout;
        //   126: astore          8
        //   128: aload_0        
        //   129: getfield        android/support/v7/app/AlertController.mView:Landroid/view/View;
        //   132: ifnull          145
        //   135: aload_0        
        //   136: getfield        android/support/v7/app/AlertController.mView:Landroid/view/View;
        //   139: astore          11
        //   141: iload_2        
        //   142: ifeq            182
        //   145: aload_0        
        //   146: getfield        android/support/v7/app/AlertController.mViewLayoutResId:I
        //   149: istore          10
        //   151: iload           10
        //   153: ifeq            179
        //   156: aload_0        
        //   157: getfield        android/support/v7/app/AlertController.mContext:Landroid/content/Context;
        //   160: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   163: aload_0        
        //   164: getfield        android/support/v7/app/AlertController.mViewLayoutResId:I
        //   167: aload           8
        //   169: iconst_0       
        //   170: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   173: astore          11
        //   175: iload_2        
        //   176: ifeq            182
        //   179: aconst_null    
        //   180: astore          11
        //   182: aload           11
        //   184: ifnull          379
        //   187: iload_1        
        //   188: ifeq            199
        //   191: aload           11
        //   193: invokestatic    android/support/v7/app/AlertController.canTextInput:(Landroid/view/View;)Z
        //   196: ifne            212
        //   199: aload_0        
        //   200: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   203: ldc_w           131072
        //   206: ldc_w           131072
        //   209: invokevirtual   android/view/Window.setFlags:(II)V
        //   212: iload_1        
        //   213: ifeq            298
        //   216: aload_0        
        //   217: getfield        android/support/v7/app/AlertController.mWindow:Landroid/view/Window;
        //   220: getstatic       android/support/v7/appcompat/R$id.custom:I
        //   223: invokevirtual   android/view/Window.findViewById:(I)Landroid/view/View;
        //   226: checkcast       Landroid/widget/FrameLayout;
        //   229: astore          19
        //   231: aload           19
        //   233: aload           11
        //   235: new             Landroid/view/ViewGroup$LayoutParams;
        //   238: dup            
        //   239: iconst_m1      
        //   240: iconst_m1      
        //   241: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   244: invokevirtual   android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
        //   247: aload_0        
        //   248: getfield        android/support/v7/app/AlertController.mViewSpacingSpecified:Z
        //   251: ifeq            275
        //   254: aload           19
        //   256: aload_0        
        //   257: getfield        android/support/v7/app/AlertController.mViewSpacingLeft:I
        //   260: aload_0        
        //   261: getfield        android/support/v7/app/AlertController.mViewSpacingTop:I
        //   264: aload_0        
        //   265: getfield        android/support/v7/app/AlertController.mViewSpacingRight:I
        //   268: aload_0        
        //   269: getfield        android/support/v7/app/AlertController.mViewSpacingBottom:I
        //   272: invokevirtual   android/widget/FrameLayout.setPadding:(IIII)V
        //   275: aload_0        
        //   276: getfield        android/support/v7/app/AlertController.mListView:Landroid/widget/ListView;
        //   279: ifnull          294
        //   282: aload           8
        //   284: invokevirtual   android/widget/FrameLayout.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   287: checkcast       Landroid/widget/LinearLayout$LayoutParams;
        //   290: fconst_0       
        //   291: putfield        android/widget/LinearLayout$LayoutParams.weight:F
        //   294: iload_2        
        //   295: ifeq            305
        //   298: aload           8
        //   300: bipush          8
        //   302: invokevirtual   android/widget/FrameLayout.setVisibility:(I)V
        //   305: aload_0        
        //   306: getfield        android/support/v7/app/AlertController.mListView:Landroid/widget/ListView;
        //   309: astore          14
        //   311: aload           14
        //   313: ifnull          363
        //   316: aload_0        
        //   317: getfield        android/support/v7/app/AlertController.mAdapter:Landroid/widget/ListAdapter;
        //   320: astore          16
        //   322: aload           16
        //   324: ifnull          363
        //   327: aload           14
        //   329: aload_0        
        //   330: getfield        android/support/v7/app/AlertController.mAdapter:Landroid/widget/ListAdapter;
        //   333: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   336: aload_0        
        //   337: getfield        android/support/v7/app/AlertController.mCheckedItem:I
        //   340: istore          17
        //   342: iload           17
        //   344: iconst_m1      
        //   345: if_icmple       363
        //   348: aload           14
        //   350: iload           17
        //   352: iconst_1       
        //   353: invokevirtual   android/widget/ListView.setItemChecked:(IZ)V
        //   356: aload           14
        //   358: iload           17
        //   360: invokevirtual   android/widget/ListView.setSelection:(I)V
        //   363: aload           5
        //   365: invokevirtual   android/support/v7/internal/widget/TintTypedArray.recycle:()V
        //   368: return         
        //   369: astore          23
        //   371: aload           23
        //   373: athrow         
        //   374: astore          9
        //   376: aload           9
        //   378: athrow         
        //   379: iconst_0       
        //   380: istore_1       
        //   381: goto            187
        //   384: astore          12
        //   386: aload           12
        //   388: athrow         
        //   389: astore          20
        //   391: aload           20
        //   393: athrow         
        //   394: astore          21
        //   396: aload           21
        //   398: athrow         
        //   399: astore          13
        //   401: aload           13
        //   403: athrow         
        //   404: astore          15
        //   406: aload           15
        //   408: athrow         
        //   409: astore          18
        //   411: aload           18
        //   413: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  107    113    369    374    Ljava/lang/IllegalArgumentException;
        //  145    151    374    379    Ljava/lang/IllegalArgumentException;
        //  191    199    384    389    Ljava/lang/IllegalArgumentException;
        //  199    212    384    389    Ljava/lang/IllegalArgumentException;
        //  231    275    389    394    Ljava/lang/IllegalArgumentException;
        //  275    294    394    399    Ljava/lang/IllegalArgumentException;
        //  298    305    399    404    Ljava/lang/IllegalArgumentException;
        //  316    322    404    409    Ljava/lang/IllegalArgumentException;
        //  348    363    409    414    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 195, Size: 195
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
    
    private static boolean shouldCenterSingleButton(final Context context) {
        final TypedValue typedValue = new TypedValue();
        try {
            context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
            if (typedValue.data != 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public Button getButton(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case -1: {
                try {
                    return this.mButtonPositive;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case -2: {
                return this.mButtonNegative;
            }
            case -3: {
                return this.mButtonNeutral;
            }
        }
    }
    
    public int getIconAttributeResId(final int n) {
        final TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(n, typedValue, true);
        return typedValue.resourceId;
    }
    
    public void installContent() {
        this.mDialog.supportRequestWindowFeature(1);
        this.mDialog.setContentView(this.selectContentView());
        this.setupView();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        try {
            if (this.mScrollView == null) {
                return false;
            }
            final AlertController alertController = this;
            final ScrollView scrollView = alertController.mScrollView;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = scrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final AlertController alertController = this;
            final ScrollView scrollView = alertController.mScrollView;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = scrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        try {
            if (this.mScrollView == null) {
                return false;
            }
            final AlertController alertController = this;
            final ScrollView scrollView = alertController.mScrollView;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = scrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final AlertController alertController = this;
            final ScrollView scrollView = alertController.mScrollView;
            final KeyEvent keyEvent2 = keyEvent;
            final boolean b = scrollView.executeKeyEvent(keyEvent2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void setButton(final int p0, final CharSequence p1, final DialogInterface$OnClickListener p2, final Message p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/app/ActionBar.a:Z
        //     3: istore          5
        //     5: aload           4
        //     7: ifnonnull       25
        //    10: aload_3        
        //    11: ifnull          25
        //    14: aload_0        
        //    15: getfield        android/support/v7/app/AlertController.mHandler:Landroid/os/Handler;
        //    18: iload_1        
        //    19: aload_3        
        //    20: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //    23: astore          4
        //    25: iload_1        
        //    26: tableswitch {
        //               -6: 100
        //               -5: 84
        //               -4: 68
        //          default: 52
        //        }
        //    52: new             Ljava/lang/IllegalArgumentException;
        //    55: dup            
        //    56: getstatic       android/support/v7/app/AlertController.z:Ljava/lang/String;
        //    59: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    62: athrow         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: aload_0        
        //    69: aload_2        
        //    70: putfield        android/support/v7/app/AlertController.mButtonPositiveText:Ljava/lang/CharSequence;
        //    73: aload_0        
        //    74: aload           4
        //    76: putfield        android/support/v7/app/AlertController.mButtonPositiveMessage:Landroid/os/Message;
        //    79: iload           5
        //    81: ifeq            116
        //    84: aload_0        
        //    85: aload_2        
        //    86: putfield        android/support/v7/app/AlertController.mButtonNegativeText:Ljava/lang/CharSequence;
        //    89: aload_0        
        //    90: aload           4
        //    92: putfield        android/support/v7/app/AlertController.mButtonNegativeMessage:Landroid/os/Message;
        //    95: iload           5
        //    97: ifeq            116
        //   100: aload_0        
        //   101: aload_2        
        //   102: putfield        android/support/v7/app/AlertController.mButtonNeutralText:Ljava/lang/CharSequence;
        //   105: aload_0        
        //   106: aload           4
        //   108: putfield        android/support/v7/app/AlertController.mButtonNeutralMessage:Landroid/os/Message;
        //   111: iload           5
        //   113: ifne            52
        //   116: return         
        //   117: astore          8
        //   119: aload           8
        //   121: athrow         
        //   122: astore          7
        //   124: aload           7
        //   126: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  52     63     63     68     Ljava/lang/IllegalArgumentException;
        //  68     79     117    122    Ljava/lang/IllegalArgumentException;
        //  84     95     122    127    Ljava/lang/IllegalArgumentException;
        //  100    111    63     68     Ljava/lang/IllegalArgumentException;
        //  119    122    122    127    Ljava/lang/IllegalArgumentException;
        //  124    127    63     68     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0084:
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
    
    public void setCustomTitle(final View mCustomTitleView) {
        this.mCustomTitleView = mCustomTitleView;
    }
    
    public void setIcon(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aconst_null    
        //     2: putfield        android/support/v7/app/AlertController.mIcon:Landroid/graphics/drawable/Drawable;
        //     5: aload_0        
        //     6: iload_1        
        //     7: putfield        android/support/v7/app/AlertController.mIconId:I
        //    10: aload_0        
        //    11: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    14: astore          5
        //    16: aload           5
        //    18: ifnull          51
        //    21: iload_1        
        //    22: ifeq            42
        //    25: aload_0        
        //    26: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    29: aload_0        
        //    30: getfield        android/support/v7/app/AlertController.mIconId:I
        //    33: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //    36: getstatic       android/support/v7/app/ActionBar.a:Z
        //    39: ifeq            51
        //    42: aload_0        
        //    43: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    46: bipush          8
        //    48: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    51: return         
        //    52: astore_2       
        //    53: aload_2        
        //    54: athrow         
        //    55: astore_3       
        //    56: aload_3        
        //    57: athrow         
        //    58: astore          4
        //    60: aload           4
        //    62: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      16     52     58     Ljava/lang/IllegalArgumentException;
        //  25     42     58     63     Ljava/lang/IllegalArgumentException;
        //  42     51     58     63     Ljava/lang/IllegalArgumentException;
        //  53     55     55     58     Ljava/lang/IllegalArgumentException;
        //  56     58     58     63     Ljava/lang/IllegalArgumentException;
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
    
    public void setIcon(final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: putfield        android/support/v7/app/AlertController.mIcon:Landroid/graphics/drawable/Drawable;
        //     5: aload_0        
        //     6: iconst_0       
        //     7: putfield        android/support/v7/app/AlertController.mIconId:I
        //    10: aload_0        
        //    11: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    14: astore          5
        //    16: aload           5
        //    18: ifnull          48
        //    21: aload_1        
        //    22: ifnull          39
        //    25: aload_0        
        //    26: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    29: aload_1        
        //    30: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    33: getstatic       android/support/v7/app/ActionBar.a:Z
        //    36: ifeq            48
        //    39: aload_0        
        //    40: getfield        android/support/v7/app/AlertController.mIconView:Landroid/widget/ImageView;
        //    43: bipush          8
        //    45: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    48: return         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    52: astore_3       
        //    53: aload_3        
        //    54: athrow         
        //    55: astore          4
        //    57: aload           4
        //    59: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      16     49     55     Ljava/lang/IllegalArgumentException;
        //  25     39     55     60     Ljava/lang/IllegalArgumentException;
        //  39     48     55     60     Ljava/lang/IllegalArgumentException;
        //  50     52     52     55     Ljava/lang/IllegalArgumentException;
        //  53     55     55     60     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public void setMessage(final CharSequence charSequence) {
        try {
            this.mMessage = charSequence;
            if (this.mMessageView != null) {
                this.mMessageView.setText(charSequence);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void setTitle(final CharSequence charSequence) {
        try {
            this.mTitle = charSequence;
            if (this.mTitleView != null) {
                this.mTitleView.setText(charSequence);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void setView(final int mViewLayoutResId) {
        this.mView = null;
        this.mViewLayoutResId = mViewLayoutResId;
        this.mViewSpacingSpecified = false;
    }
    
    public void setView(final View mView) {
        this.mView = mView;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }
    
    public void setView(final View mView, final int mViewSpacingLeft, final int mViewSpacingTop, final int mViewSpacingRight, final int mViewSpacingBottom) {
        this.mView = mView;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = mViewSpacingLeft;
        this.mViewSpacingTop = mViewSpacingTop;
        this.mViewSpacingRight = mViewSpacingRight;
        this.mViewSpacingBottom = mViewSpacingBottom;
    }
}
