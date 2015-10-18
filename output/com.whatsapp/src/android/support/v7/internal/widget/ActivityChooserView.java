// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View$MeasureSpec;
import android.view.ViewTreeObserver;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R$dimen;
import android.view.View$OnTouchListener;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.support.v7.appcompat.R$id;
import android.support.v7.appcompat.R$layout;
import android.view.LayoutInflater;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow$OnDismissListener;
import android.database.DataSetObserver;
import android.support.v7.widget.ListPopupWindow;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ViewGroup;

public class ActivityChooserView extends ViewGroup implements ActivityChooserModel$ActivityChooserModelClient
{
    private static final String z;
    private final LinearLayoutCompat mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserView$ActivityChooserViewAdapter mAdapter;
    private final ActivityChooserView$Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private PopupWindow$OnDismissListener mOnDismissListener;
    private final ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;
    
    static {
        final char[] charArray = "5xplN\u000fvpe@\u001fr<&\u000f?~4(V\u0014bpkN\u0017{p+\\\u001ec\u0014i[\u001aZ?lJ\u0017(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '/';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = 'P';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ActivityChooserView(final Context context) {
        this(context, null);
    }
    
    public ActivityChooserView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActivityChooserView(final Context context, final AttributeSet set, final int n) {
        final int a = AdapterViewCompat.a;
        super(context, set, n);
        this.mModelDataSetOberver = new ActivityChooserView$1(this);
        this.mOnGlobalLayoutListener = (ViewTreeObserver$OnGlobalLayoutListener)new ActivityChooserView$2(this);
        this.mInitialActivityCount = 4;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, R$styleable.ActivityChooserView, n, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(R$styleable.ActivityChooserView_initialActivityCount, 4);
        final Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(this.getContext()).inflate(R$layout.abc_activity_chooser_view, (ViewGroup)this, true);
        this.mCallbacks = new ActivityChooserView$Callbacks(this, null);
        this.mActivityChooserContent = (LinearLayoutCompat)this.findViewById(R$id.activity_chooser_view_content);
        this.mActivityChooserContentBackground = this.mActivityChooserContent.getBackground();
        (this.mDefaultActivityButton = (FrameLayout)this.findViewById(R$id.default_activity_button)).setOnClickListener((View$OnClickListener)this.mCallbacks);
        this.mDefaultActivityButton.setOnLongClickListener((View$OnLongClickListener)this.mCallbacks);
        this.mDefaultActivityButtonImage = (ImageView)this.mDefaultActivityButton.findViewById(R$id.image);
        final FrameLayout mExpandActivityOverflowButton = (FrameLayout)this.findViewById(R$id.expand_activities_button);
        mExpandActivityOverflowButton.setOnClickListener((View$OnClickListener)this.mCallbacks);
        mExpandActivityOverflowButton.setOnTouchListener((View$OnTouchListener)new ActivityChooserView$3(this, (View)mExpandActivityOverflowButton));
        this.mExpandActivityOverflowButton = mExpandActivityOverflowButton;
        (this.mExpandActivityOverflowButtonImage = (ImageView)mExpandActivityOverflowButton.findViewById(R$id.image)).setImageDrawable(drawable);
        (this.mAdapter = new ActivityChooserView$ActivityChooserViewAdapter(this, null)).registerDataSetObserver((DataSetObserver)new ActivityChooserView$4(this));
        final Resources resources = context.getResources();
        try {
            this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
            if (AppCompatActivity.b) {
                AdapterViewCompat.a = a + 1;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    static ActivityChooserView$ActivityChooserViewAdapter access$000(final ActivityChooserView activityChooserView) {
        return activityChooserView.mAdapter;
    }
    
    static ListPopupWindow access$100(final ActivityChooserView activityChooserView) {
        return activityChooserView.getListPopupWindow();
    }
    
    static PopupWindow$OnDismissListener access$1000(final ActivityChooserView activityChooserView) {
        return activityChooserView.mOnDismissListener;
    }
    
    static void access$400(final ActivityChooserView activityChooserView) {
        activityChooserView.updateAppearance();
    }
    
    static void access$500(final ActivityChooserView activityChooserView, final int n) {
        activityChooserView.showPopupUnchecked(n);
    }
    
    static boolean access$600(final ActivityChooserView activityChooserView) {
        return activityChooserView.mIsSelectingDefaultActivity;
    }
    
    static boolean access$602(final ActivityChooserView activityChooserView, final boolean mIsSelectingDefaultActivity) {
        return activityChooserView.mIsSelectingDefaultActivity = mIsSelectingDefaultActivity;
    }
    
    static FrameLayout access$700(final ActivityChooserView activityChooserView) {
        return activityChooserView.mDefaultActivityButton;
    }
    
    static FrameLayout access$800(final ActivityChooserView activityChooserView) {
        return activityChooserView.mExpandActivityOverflowButton;
    }
    
    static int access$900(final ActivityChooserView activityChooserView) {
        return activityChooserView.mInitialActivityCount;
    }
    
    private ListPopupWindow getListPopupWindow() {
        try {
            if (this.mListPopupWindow == null) {
                (this.mListPopupWindow = new ListPopupWindow(this.getContext())).setAdapter((ListAdapter)this.mAdapter);
                this.mListPopupWindow.setAnchorView((View)this);
                this.mListPopupWindow.setModal(true);
                this.mListPopupWindow.setOnItemClickListener((AdapterView$OnItemClickListener)this.mCallbacks);
                this.mListPopupWindow.setOnDismissListener((PopupWindow$OnDismissListener)this.mCallbacks);
            }
            return this.mListPopupWindow;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void showPopupUnchecked(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    10: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    13: ifnonnull       32
        //    16: new             Ljava/lang/IllegalStateException;
        //    19: dup            
        //    20: getstatic       android/support/v7/internal/widget/ActivityChooserView.z:Ljava/lang/String;
        //    23: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    26: athrow         
        //    27: astore          4
        //    29: aload           4
        //    31: athrow         
        //    32: aload_0        
        //    33: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    36: aload_0        
        //    37: getfield        android/support/v7/internal/widget/ActivityChooserView.mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
        //    40: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    43: aload_0        
        //    44: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButton:Landroid/widget/FrameLayout;
        //    47: invokevirtual   android/widget/FrameLayout.getVisibility:()I
        //    50: istore          6
        //    52: iload           6
        //    54: ifne            251
        //    57: iload_2        
        //    58: istore          7
        //    60: aload_0        
        //    61: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    64: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getActivityCount:()I
        //    67: istore          8
        //    69: iload           7
        //    71: ifeq            257
        //    74: iload_1        
        //    75: ldc_w           2147483647
        //    78: if_icmpeq       111
        //    81: iload           8
        //    83: iload_2        
        //    84: iload_1        
        //    85: iadd           
        //    86: if_icmple       111
        //    89: aload_0        
        //    90: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    93: iconst_1       
        //    94: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView:(Z)V
        //    97: aload_0        
        //    98: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   101: iload_1        
        //   102: iconst_1       
        //   103: isub           
        //   104: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount:(I)V
        //   107: iload_3        
        //   108: ifeq            127
        //   111: aload_0        
        //   112: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   115: iconst_0       
        //   116: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView:(Z)V
        //   119: aload_0        
        //   120: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   123: iload_1        
        //   124: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount:(I)V
        //   127: aload_0        
        //   128: invokespecial   android/support/v7/internal/widget/ActivityChooserView.getListPopupWindow:()Landroid/support/v7/widget/ListPopupWindow;
        //   131: astore          10
        //   133: aload           10
        //   135: invokevirtual   android/support/v7/widget/ListPopupWindow.isShowing:()Z
        //   138: istore          15
        //   140: iload           15
        //   142: ifne            245
        //   145: aload_0        
        //   146: getfield        android/support/v7/internal/widget/ActivityChooserView.mIsSelectingDefaultActivity:Z
        //   149: istore          16
        //   151: iload           16
        //   153: ifne            161
        //   156: iload           7
        //   158: ifne            175
        //   161: aload_0        
        //   162: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   165: iconst_1       
        //   166: iload           7
        //   168: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity:(ZZ)V
        //   171: iload_3        
        //   172: ifeq            184
        //   175: aload_0        
        //   176: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   179: iconst_0       
        //   180: iconst_0       
        //   181: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity:(ZZ)V
        //   184: aload_0        
        //   185: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //   188: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.measureContentWidth:()I
        //   191: aload_0        
        //   192: getfield        android/support/v7/internal/widget/ActivityChooserView.mListPopupMaxWidth:I
        //   195: invokestatic    java/lang/Math.min:(II)I
        //   198: istore          17
        //   200: aload           10
        //   202: iload           17
        //   204: invokevirtual   android/support/v7/widget/ListPopupWindow.setContentWidth:(I)V
        //   207: aload           10
        //   209: invokevirtual   android/support/v7/widget/ListPopupWindow.show:()V
        //   212: aload_0        
        //   213: getfield        android/support/v7/internal/widget/ActivityChooserView.mProvider:Landroid/support/v4/view/ActionProvider;
        //   216: ifnull          227
        //   219: aload_0        
        //   220: getfield        android/support/v7/internal/widget/ActivityChooserView.mProvider:Landroid/support/v4/view/ActionProvider;
        //   223: iconst_1       
        //   224: invokevirtual   android/support/v4/view/ActionProvider.subUiVisibilityChanged:(Z)V
        //   227: aload           10
        //   229: invokevirtual   android/support/v7/widget/ListPopupWindow.getListView:()Landroid/widget/ListView;
        //   232: aload_0        
        //   233: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //   236: getstatic       android/support/v7/appcompat/R$string.abc_activitychooserview_choose_application:I
        //   239: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   242: invokevirtual   android/widget/ListView.setContentDescription:(Ljava/lang/CharSequence;)V
        //   245: return         
        //   246: astore          5
        //   248: aload           5
        //   250: athrow         
        //   251: iconst_0       
        //   252: istore          7
        //   254: goto            60
        //   257: iconst_0       
        //   258: istore_2       
        //   259: goto            74
        //   262: astore          9
        //   264: aload           9
        //   266: athrow         
        //   267: astore          11
        //   269: aload           11
        //   271: athrow         
        //   272: astore          12
        //   274: aload           12
        //   276: athrow         
        //   277: astore          13
        //   279: aload           13
        //   281: athrow         
        //   282: astore          14
        //   284: aload           14
        //   286: athrow         
        //   287: astore          18
        //   289: aload           18
        //   291: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      27     27     32     Ljava/lang/IllegalStateException;
        //  32     52     246    251    Ljava/lang/IllegalStateException;
        //  89     107    262    267    Ljava/lang/IllegalStateException;
        //  111    127    262    267    Ljava/lang/IllegalStateException;
        //  133    140    267    272    Ljava/lang/IllegalStateException;
        //  145    151    272    282    Ljava/lang/IllegalStateException;
        //  161    171    282    287    Ljava/lang/IllegalStateException;
        //  175    184    282    287    Ljava/lang/IllegalStateException;
        //  200    227    287    292    Ljava/lang/IllegalStateException;
        //  269    272    272    282    Ljava/lang/IllegalStateException;
        //  274    277    277    282    Ljava/lang/IllegalStateException;
        //  279    282    282    287    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 144, Size: 144
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
    
    private void updateAppearance() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //     8: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getCount:()I
        //    11: istore          4
        //    13: iload           4
        //    15: ifle            30
        //    18: aload_0        
        //    19: getfield        android/support/v7/internal/widget/ActivityChooserView.mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
        //    22: iconst_1       
        //    23: invokevirtual   android/widget/FrameLayout.setEnabled:(Z)V
        //    26: iload_1        
        //    27: ifeq            38
        //    30: aload_0        
        //    31: getfield        android/support/v7/internal/widget/ActivityChooserView.mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
        //    34: iconst_0       
        //    35: invokevirtual   android/widget/FrameLayout.setEnabled:(Z)V
        //    38: aload_0        
        //    39: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    42: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getActivityCount:()I
        //    45: istore          5
        //    47: aload_0        
        //    48: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    51: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getHistorySize:()I
        //    54: istore          6
        //    56: iload           5
        //    58: iconst_1       
        //    59: if_icmpeq       73
        //    62: iload           5
        //    64: iconst_1       
        //    65: if_icmple       164
        //    68: iload           6
        //    70: ifle            164
        //    73: aload_0        
        //    74: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButton:Landroid/widget/FrameLayout;
        //    77: iconst_0       
        //    78: invokevirtual   android/widget/FrameLayout.setVisibility:(I)V
        //    81: aload_0        
        //    82: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //    85: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity:()Landroid/content/pm/ResolveInfo;
        //    88: astore          7
        //    90: aload_0        
        //    91: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //    94: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    97: astore          8
        //    99: aload_0        
        //   100: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButtonImage:Landroid/widget/ImageView;
        //   103: aload           7
        //   105: aload           8
        //   107: invokevirtual   android/content/pm/ResolveInfo.loadIcon:(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
        //   110: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   113: aload_0        
        //   114: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActionButtonContentDescription:I
        //   117: ifeq            160
        //   120: aload           7
        //   122: aload           8
        //   124: invokevirtual   android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
        //   127: astore          13
        //   129: aload_0        
        //   130: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getContext:()Landroid/content/Context;
        //   133: aload_0        
        //   134: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActionButtonContentDescription:I
        //   137: iconst_1       
        //   138: anewarray       Ljava/lang/Object;
        //   141: dup            
        //   142: iconst_0       
        //   143: aload           13
        //   145: aastore        
        //   146: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   149: astore          14
        //   151: aload_0        
        //   152: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButton:Landroid/widget/FrameLayout;
        //   155: aload           14
        //   157: invokevirtual   android/widget/FrameLayout.setContentDescription:(Ljava/lang/CharSequence;)V
        //   160: iload_1        
        //   161: ifeq            173
        //   164: aload_0        
        //   165: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButton:Landroid/widget/FrameLayout;
        //   168: bipush          8
        //   170: invokevirtual   android/widget/FrameLayout.setVisibility:(I)V
        //   173: aload_0        
        //   174: getfield        android/support/v7/internal/widget/ActivityChooserView.mDefaultActivityButton:Landroid/widget/FrameLayout;
        //   177: invokevirtual   android/widget/FrameLayout.getVisibility:()I
        //   180: istore          11
        //   182: iload           11
        //   184: ifne            202
        //   187: aload_0        
        //   188: getfield        android/support/v7/internal/widget/ActivityChooserView.mActivityChooserContent:Landroid/support/v7/widget/LinearLayoutCompat;
        //   191: aload_0        
        //   192: getfield        android/support/v7/internal/widget/ActivityChooserView.mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;
        //   195: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   198: iload_1        
        //   199: ifeq            210
        //   202: aload_0        
        //   203: getfield        android/support/v7/internal/widget/ActivityChooserView.mActivityChooserContent:Landroid/support/v7/widget/LinearLayoutCompat;
        //   206: aconst_null    
        //   207: invokevirtual   android/support/v7/widget/LinearLayoutCompat.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   210: return         
        //   211: astore_2       
        //   212: aload_2        
        //   213: athrow         
        //   214: astore_3       
        //   215: aload_3        
        //   216: athrow         
        //   217: astore          12
        //   219: aload           12
        //   221: athrow         
        //   222: astore          9
        //   224: aload           9
        //   226: athrow         
        //   227: astore          10
        //   229: aload           10
        //   231: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      13     211    214    Ljava/lang/IllegalStateException;
        //  18     26     214    217    Ljava/lang/IllegalStateException;
        //  30     38     214    217    Ljava/lang/IllegalStateException;
        //  164    173    217    222    Ljava/lang/IllegalStateException;
        //  173    182    222    227    Ljava/lang/IllegalStateException;
        //  187    198    227    232    Ljava/lang/IllegalStateException;
        //  202    210    227    232    Ljava/lang/IllegalStateException;
        //  212    214    214    217    Ljava/lang/IllegalStateException;
        //  224    227    227    232    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    public boolean dismissPopup() {
        if (!this.isShowingPopup()) {
            return true;
        }
        this.getListPopupWindow().dismiss();
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        try {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
            return true;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean isShowingPopup() {
        return this.getListPopupWindow().isShowing();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        Label_0024: {
            if (dataModel == null) {
                break Label_0024;
            }
            try {
                dataModel.registerObserver((Object)this.mModelDataSetOberver);
                this.mIsAttachedToWindow = true;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    protected void onDetachedFromWindow() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   android/view/ViewGroup.onDetachedFromWindow:()V
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/widget/ActivityChooserView.mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
        //     8: invokevirtual   android/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter.getDataModel:()Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          24
        //    16: aload_1        
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/widget/ActivityChooserView.mModelDataSetOberver:Landroid/database/DataSetObserver;
        //    21: invokevirtual   android/support/v7/internal/widget/ActivityChooserModel.unregisterObserver:(Ljava/lang/Object;)V
        //    24: aload_0        
        //    25: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    28: astore_2       
        //    29: aload_2        
        //    30: invokevirtual   android/view/ViewTreeObserver.isAlive:()Z
        //    33: ifeq            44
        //    36: aload_2        
        //    37: aload_0        
        //    38: getfield        android/support/v7/internal/widget/ActivityChooserView.mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
        //    41: invokevirtual   android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    44: aload_0        
        //    45: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.isShowingPopup:()Z
        //    48: ifeq            56
        //    51: aload_0        
        //    52: invokevirtual   android/support/v7/internal/widget/ActivityChooserView.dismissPopup:()Z
        //    55: pop            
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        android/support/v7/internal/widget/ActivityChooserView.mIsAttachedToWindow:Z
        //    61: return         
        //    62: astore          6
        //    64: aload           6
        //    66: athrow         
        //    67: astore_3       
        //    68: aload_3        
        //    69: athrow         
        //    70: astore          4
        //    72: aload           4
        //    74: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     24     62     67     Ljava/lang/IllegalStateException;
        //  29     44     67     70     Ljava/lang/IllegalStateException;
        //  44     56     70     75     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
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
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        try {
            this.mActivityChooserContent.layout(0, 0, n3 - n, n4 - n2);
            if (!this.isShowingPopup()) {
                this.dismissPopup();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    protected void onMeasure(final int n, int measureSpec) {
        final LinearLayoutCompat mActivityChooserContent = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(measureSpec), 1073741824);
        }
        this.measureChild((View)mActivityChooserContent, n, measureSpec);
        this.setMeasuredDimension(((View)mActivityChooserContent).getMeasuredWidth(), ((View)mActivityChooserContent).getMeasuredHeight());
    }
    
    public boolean showPopup() {
        Label_0027: {
            try {
                final boolean showingPopup = this.isShowingPopup();
                final boolean b = false;
                if (showingPopup) {
                    return b;
                }
                final ActivityChooserView activityChooserView = this;
                final boolean b2 = activityChooserView.mIsAttachedToWindow;
                if (!b2) {
                    return false;
                }
                break Label_0027;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final ActivityChooserView activityChooserView = this;
                final boolean b2 = activityChooserView.mIsAttachedToWindow;
                if (!b2) {
                    return false;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        this.mIsSelectingDefaultActivity = false;
        this.showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }
}
