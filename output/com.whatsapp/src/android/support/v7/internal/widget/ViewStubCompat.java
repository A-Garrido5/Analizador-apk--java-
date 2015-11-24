// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import android.view.View;

public final class ViewStubCompat extends View
{
    private static final String[] z;
    private ViewStubCompat$OnInflateListener mInflateListener;
    private int mInflatedId;
    private WeakReference mInflatedViewRef;
    private LayoutInflater mInflater;
    private int mLayoutResource;
    
    static {
        final String[] z2 = new String[3];
        String s = "d\n3\u0001\u001fd\u0006%>\u001a~\u001b>w\u0015v\u0003+2\u00127\u0000)w\u0003yB52\u0010r\u001d\"9\u0015r\u000bg!\u001fr\u0018";
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
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = '\u0017';
                        break;
                    }
                    case 1: {
                        c2 = 'o';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = 'W';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "A\u0006\" %c\u001a%w\u001bb\u001c3w\u001ev\u0019\"w\u00177\u0019&;\u001fsO+6\u000fx\u001a3\u0005\u0013d\u00002%\u0015r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "A\u0006\" %c\u001a%w\u001bb\u001c3w\u001ev\u0019\"w\u00177\u0001(9[y\u001a+;VA\u0006\" 1e\u00002'Va\u0006\" &v\u001d\"9\u0002";
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
    
    public ViewStubCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewStubCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mLayoutResource = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, R$styleable.ViewStubCompat, n, 0);
        this.mInflatedId = obtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_inflatedId, -1);
        this.mLayoutResource = obtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_layout, 0);
        this.setId(obtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    protected void dispatchDraw(final Canvas canvas) {
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public View inflate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.getParent:()Landroid/view/ViewParent;
        //     8: astore_2       
        //     9: aload_2        
        //    10: ifnull          209
        //    13: aload_2        
        //    14: instanceof      Landroid/view/ViewGroup;
        //    17: ifeq            209
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/widget/ViewStubCompat.mLayoutResource:I
        //    24: istore          4
        //    26: iload           4
        //    28: ifeq            196
        //    31: aload_2        
        //    32: checkcast       Landroid/view/ViewGroup;
        //    35: astore          5
        //    37: aload_0        
        //    38: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflater:Landroid/view/LayoutInflater;
        //    41: ifnull          54
        //    44: aload_0        
        //    45: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflater:Landroid/view/LayoutInflater;
        //    48: astore          6
        //    50: iload_1        
        //    51: ifeq            63
        //    54: aload_0        
        //    55: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.getContext:()Landroid/content/Context;
        //    58: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    61: astore          6
        //    63: aload           6
        //    65: aload_0        
        //    66: getfield        android/support/v7/internal/widget/ViewStubCompat.mLayoutResource:I
        //    69: aload           5
        //    71: iconst_0       
        //    72: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    75: astore          7
        //    77: aload_0        
        //    78: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflatedId:I
        //    81: iconst_m1      
        //    82: if_icmpeq       94
        //    85: aload           7
        //    87: aload_0        
        //    88: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflatedId:I
        //    91: invokevirtual   android/view/View.setId:(I)V
        //    94: aload           5
        //    96: aload_0        
        //    97: invokevirtual   android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
        //   100: istore          9
        //   102: aload           5
        //   104: aload_0        
        //   105: invokevirtual   android/view/ViewGroup.removeViewInLayout:(Landroid/view/View;)V
        //   108: aload_0        
        //   109: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   112: astore          10
        //   114: aload           10
        //   116: ifnull          134
        //   119: aload           5
        //   121: aload           7
        //   123: iload           9
        //   125: aload           10
        //   127: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
        //   130: iload_1        
        //   131: ifeq            143
        //   134: aload           5
        //   136: aload           7
        //   138: iload           9
        //   140: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;I)V
        //   143: aload_0        
        //   144: new             Ljava/lang/ref/WeakReference;
        //   147: dup            
        //   148: aload           7
        //   150: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   153: putfield        android/support/v7/internal/widget/ViewStubCompat.mInflatedViewRef:Ljava/lang/ref/WeakReference;
        //   156: aload_0        
        //   157: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflateListener:Landroid/support/v7/internal/widget/ViewStubCompat$OnInflateListener;
        //   160: ifnull          175
        //   163: aload_0        
        //   164: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflateListener:Landroid/support/v7/internal/widget/ViewStubCompat$OnInflateListener;
        //   167: aload_0        
        //   168: aload           7
        //   170: invokeinterface android/support/v7/internal/widget/ViewStubCompat$OnInflateListener.onInflate:(Landroid/support/v7/internal/widget/ViewStubCompat;Landroid/view/View;)V
        //   175: aload           7
        //   177: areturn        
        //   178: astore_3       
        //   179: aload_3        
        //   180: athrow         
        //   181: astore          8
        //   183: aload           8
        //   185: athrow         
        //   186: astore          11
        //   188: aload           11
        //   190: athrow         
        //   191: astore          12
        //   193: aload           12
        //   195: athrow         
        //   196: new             Ljava/lang/IllegalArgumentException;
        //   199: dup            
        //   200: getstatic       android/support/v7/internal/widget/ViewStubCompat.z:[Ljava/lang/String;
        //   203: iconst_1       
        //   204: aaload         
        //   205: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   208: athrow         
        //   209: new             Ljava/lang/IllegalStateException;
        //   212: dup            
        //   213: getstatic       android/support/v7/internal/widget/ViewStubCompat.z:[Ljava/lang/String;
        //   216: iconst_2       
        //   217: aaload         
        //   218: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   221: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     26     178    181    Ljava/lang/IllegalStateException;
        //  77     94     181    186    Ljava/lang/IllegalStateException;
        //  119    130    186    191    Ljava/lang/IllegalStateException;
        //  134    143    186    191    Ljava/lang/IllegalStateException;
        //  143    175    191    196    Ljava/lang/IllegalStateException;
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
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setLayoutInflater(final LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }
    
    public void setVisibility(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflatedViewRef:Ljava/lang/ref/WeakReference;
        //     8: ifnull          60
        //    11: aload_0        
        //    12: getfield        android/support/v7/internal/widget/ViewStubCompat.mInflatedViewRef:Ljava/lang/ref/WeakReference;
        //    15: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //    18: checkcast       Landroid/view/View;
        //    21: astore          6
        //    23: aload           6
        //    25: ifnull          38
        //    28: aload           6
        //    30: iload_1        
        //    31: invokevirtual   android/view/View.setVisibility:(I)V
        //    34: iload_2        
        //    35: ifeq            56
        //    38: new             Ljava/lang/IllegalStateException;
        //    41: dup            
        //    42: getstatic       android/support/v7/internal/widget/ViewStubCompat.z:[Ljava/lang/String;
        //    45: iconst_0       
        //    46: aaload         
        //    47: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    50: athrow         
        //    51: astore          7
        //    53: aload           7
        //    55: athrow         
        //    56: iload_2        
        //    57: ifeq            88
        //    60: aload_0        
        //    61: iload_1        
        //    62: invokespecial   android/view/View.setVisibility:(I)V
        //    65: iload_1        
        //    66: ifeq            74
        //    69: iload_1        
        //    70: iconst_4       
        //    71: if_icmpne       88
        //    74: aload_0        
        //    75: invokevirtual   android/support/v7/internal/widget/ViewStubCompat.inflate:()Landroid/view/View;
        //    78: pop            
        //    79: return         
        //    80: astore_3       
        //    81: aload_3        
        //    82: athrow         
        //    83: astore          4
        //    85: aload           4
        //    87: athrow         
        //    88: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  28     34     51     56     Ljava/lang/IllegalStateException;
        //  38     51     51     56     Ljava/lang/IllegalStateException;
        //  60     65     80     83     Ljava/lang/IllegalStateException;
        //  74     79     83     88     Ljava/lang/IllegalStateException;
        //  81     83     83     88     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
}
