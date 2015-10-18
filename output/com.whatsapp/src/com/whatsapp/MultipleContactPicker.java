// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ListView;
import com.whatsapp.util.Log;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.os.Bundle;
import android.app.Activity;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.view.MotionEvent;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.ArrayList;
import android.view.View;
import java.util.Set;

public class MultipleContactPicker extends DialogToastListActivity implements aws
{
    private static final String[] F;
    private Set A;
    private View B;
    private a9q C;
    private ArrayList D;
    private EditText E;
    private boolean q;
    private int r;
    private int s;
    private ArrayList t;
    private boolean u;
    private InputMethodManager v;
    private ImageButton w;
    private tv x;
    private ArrayList y;
    private final TextWatcher z;
    
    static {
        final String[] f = new String[9];
        String s = "\u0012\u0013VS\u007f\u000f\n_Dy\u0011\u0012[Db\u000f\u000fYLs\rI^Be\u000b\u0014U^";
        int n = -1;
        String[] array = f;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\t\u0017Jw\u000b\u0005RBe";
                    n2 = 1;
                    array = f;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0013\u000fWNb";
                    n2 = 2;
                    array = f;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0013\u000fWNb \u0011[Ux\u0016\b]xd\u001a\u0015URd\u001c\u0003eTb\r";
                    n2 = 3;
                    array = f;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0012\u0013VS\u007f\u000f\n_Dy\u0011\u0012[Db\u000f\u000fYLs\rIYUs\u001e\u0012_";
                    n2 = 4;
                    array = f;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = f;
                    s = "\f\u0003VBu\u000b\u0003^";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0016\bJRb \u000b_S~\u0010\u0002";
                    n = 5;
                    array = f;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000b\u000fNKs";
                    n = 6;
                    array = f;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0011\t\u0017Jw\u000b\u0005RBe";
                    n = 7;
                    array = f;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        F = f;
    }
    
    public MultipleContactPicker() {
        this.q = true;
        this.D = new ArrayList();
        this.t = new ArrayList();
        this.A = new HashSet();
        this.C = new a9q();
        this.z = (TextWatcher)new a2t(this);
    }
    
    static a9q a(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.C;
    }
    
    static void a(final MultipleContactPicker multipleContactPicker, final int n) {
        multipleContactPicker.d(n);
    }
    
    static void a(final MultipleContactPicker multipleContactPicker, final ArrayList list) {
        multipleContactPicker.a(list);
    }
    
    private void a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //     8: astore_3       
        //     9: aload_3        
        //    10: monitorenter   
        //    11: aload_0        
        //    12: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //    15: invokevirtual   java/util/ArrayList.clear:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    22: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    25: astore          5
        //    27: aload           5
        //    29: invokeinterface java/util/Iterator.hasNext:()Z
        //    34: ifeq            84
        //    37: aload           5
        //    39: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    44: checkcast       Lcom/whatsapp/a_9;
        //    47: astore          8
        //    49: aload           8
        //    51: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    54: ifnull          80
        //    57: aload           8
        //    59: aload_1        
        //    60: invokevirtual   com/whatsapp/a_9.a:(Ljava/util/ArrayList;)Z
        //    63: istore          11
        //    65: iload           11
        //    67: ifeq            80
        //    70: aload_0        
        //    71: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //    74: aload           8
        //    76: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    79: pop            
        //    80: iload_2        
        //    81: ifeq            27
        //    84: aload_0        
        //    85: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //    88: invokevirtual   java/util/ArrayList.size:()I
        //    91: ifne            118
        //    94: new             Lcom/whatsapp/a_9;
        //    97: dup            
        //    98: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //   101: iconst_1       
        //   102: aaload         
        //   103: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   106: astore          6
        //   108: aload_0        
        //   109: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //   112: aload           6
        //   114: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   117: pop            
        //   118: aload_3        
        //   119: monitorexit    
        //   120: aload_0        
        //   121: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //   124: new             Lcom/whatsapp/mg;
        //   127: dup            
        //   128: aload_0        
        //   129: invokevirtual   com/whatsapp/MultipleContactPicker.getApplicationContext:()Landroid/content/Context;
        //   132: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   135: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   138: aload_0        
        //   139: getfield        com/whatsapp/MultipleContactPicker.x:Lcom/whatsapp/tv;
        //   142: invokevirtual   com/whatsapp/tv.notifyDataSetChanged:()V
        //   145: return         
        //   146: astore          9
        //   148: aload           9
        //   150: athrow         
        //   151: astore          10
        //   153: aload           10
        //   155: athrow         
        //   156: astore          4
        //   158: aload_3        
        //   159: monitorexit    
        //   160: aload           4
        //   162: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     27     156    163    Any
        //  27     49     156    163    Any
        //  49     65     146    151    Ljava/lang/IllegalArgumentException;
        //  49     65     156    163    Any
        //  70     80     151    156    Ljava/lang/IllegalArgumentException;
        //  70     80     156    163    Any
        //  84     118    156    163    Any
        //  118    120    156    163    Any
        //  148    151    151    156    Ljava/lang/IllegalArgumentException;
        //  148    151    156    163    Any
        //  153    156    156    163    Any
        //  158    160    156    163    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
    
    static boolean a(final MultipleContactPicker multipleContactPicker, final boolean u) {
        return multipleContactPicker.u = u;
    }
    
    static boolean a(final a_9 a_9) {
        return b(a_9);
    }
    
    static ArrayList b(final MultipleContactPicker multipleContactPicker, final ArrayList y) {
        return multipleContactPicker.y = y;
    }
    
    static boolean b(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.q;
    }
    
    private static boolean b(final a_9 a_9) {
        return MultipleContactPicker.F[8].equals(a_9.u);
    }
    
    static void c(final MultipleContactPicker multipleContactPicker) {
        multipleContactPicker.f();
    }
    
    static tv d(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.x;
    }
    
    private void d(final int n) {
        this.getSupportActionBar().setSubtitle(String.format(App.C.a(2131296286, n), n));
    }
    
    static EditText e(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.E;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //     8: astore_2       
        //     9: aload_2        
        //    10: monitorenter   
        //    11: new             Ljava/util/ArrayList;
        //    14: dup            
        //    15: invokespecial   java/util/ArrayList.<init>:()V
        //    18: astore_3       
        //    19: aload_0        
        //    20: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    23: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    26: astore          5
        //    28: aload           5
        //    30: invokeinterface java/util/Iterator.hasNext:()Z
        //    35: ifeq            78
        //    38: aload           5
        //    40: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    45: checkcast       Lcom/whatsapp/a_9;
        //    48: astore          16
        //    50: aload           16
        //    52: ifnull          74
        //    55: aload           16
        //    57: getfield        com/whatsapp/a_9.g:Z
        //    60: istore          19
        //    62: iload           19
        //    64: ifeq            74
        //    67: aload_3        
        //    68: aload           16
        //    70: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: iload_1        
        //    75: ifeq            28
        //    78: aload_0        
        //    79: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    82: invokevirtual   java/util/ArrayList.clear:()V
        //    85: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    88: aload_0        
        //    89: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    92: invokevirtual   com/whatsapp/wc.e:(Ljava/util/ArrayList;)V
        //    95: aload_0        
        //    96: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    99: invokevirtual   java/util/ArrayList.size:()I
        //   102: bipush          20
        //   104: if_icmpge       125
        //   107: aload_0        
        //   108: getfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   111: ldc             2131755616
        //   113: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   116: bipush          8
        //   118: invokevirtual   android/view/View.setVisibility:(I)V
        //   121: iload_1        
        //   122: ifeq            138
        //   125: aload_0        
        //   126: getfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   129: ldc             2131755616
        //   131: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   134: iconst_0       
        //   135: invokevirtual   android/view/View.setVisibility:(I)V
        //   138: new             Lcom/whatsapp/mg;
        //   141: dup            
        //   142: aload_0        
        //   143: invokevirtual   com/whatsapp/MultipleContactPicker.getApplicationContext:()Landroid/content/Context;
        //   146: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   149: astore          8
        //   151: aload_3        
        //   152: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   155: astore          9
        //   157: aload           9
        //   159: invokeinterface java/util/Iterator.hasNext:()Z
        //   164: ifeq            254
        //   167: aload           9
        //   169: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   174: checkcast       Lcom/whatsapp/a_9;
        //   177: astore          10
        //   179: aload_0        
        //   180: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //   183: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   186: astore          11
        //   188: aload           11
        //   190: invokeinterface java/util/Iterator.hasNext:()Z
        //   195: ifeq            250
        //   198: aload           11
        //   200: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   205: checkcast       Lcom/whatsapp/a_9;
        //   208: astore          12
        //   210: aload           10
        //   212: ifnull          246
        //   215: aload           12
        //   217: ifnull          246
        //   220: aload           8
        //   222: aload           10
        //   224: aload           12
        //   226: invokevirtual   com/whatsapp/mg.a:(Lcom/whatsapp/a_9;Lcom/whatsapp/a_9;)I
        //   229: istore          15
        //   231: iload           15
        //   233: ifne            246
        //   236: aload           12
        //   238: iconst_1       
        //   239: putfield        com/whatsapp/a_9.g:Z
        //   242: iload_1        
        //   243: ifeq            188
        //   246: iload_1        
        //   247: ifeq            188
        //   250: iload_1        
        //   251: ifeq            157
        //   254: aload_0        
        //   255: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //   258: new             Lcom/whatsapp/mg;
        //   261: dup            
        //   262: aload_0        
        //   263: invokevirtual   com/whatsapp/MultipleContactPicker.getApplicationContext:()Landroid/content/Context;
        //   266: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   269: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   272: aload_0        
        //   273: invokespecial   com/whatsapp/MultipleContactPicker.f:()V
        //   276: aload_2        
        //   277: monitorexit    
        //   278: return         
        //   279: astore          17
        //   281: aload           17
        //   283: athrow         
        //   284: astore          18
        //   286: aload           18
        //   288: athrow         
        //   289: astore          4
        //   291: aload_2        
        //   292: monitorexit    
        //   293: aload           4
        //   295: athrow         
        //   296: astore          6
        //   298: aload           6
        //   300: athrow         
        //   301: astore          7
        //   303: aload           7
        //   305: athrow         
        //   306: astore          13
        //   308: aload           13
        //   310: athrow         
        //   311: astore          14
        //   313: aload           14
        //   315: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     28     289    296    Any
        //  28     50     289    296    Any
        //  55     62     279    284    Ljava/lang/IllegalArgumentException;
        //  55     62     289    296    Any
        //  67     74     284    289    Ljava/lang/IllegalArgumentException;
        //  67     74     289    296    Any
        //  78     121    296    301    Ljava/lang/IllegalArgumentException;
        //  78     121    289    296    Any
        //  125    138    301    306    Ljava/lang/IllegalArgumentException;
        //  125    138    289    296    Any
        //  138    157    289    296    Any
        //  157    188    289    296    Any
        //  188    210    289    296    Any
        //  220    231    306    311    Ljava/lang/IllegalArgumentException;
        //  220    231    289    296    Any
        //  236    242    311    316    Ljava/lang/IllegalArgumentException;
        //  236    242    289    296    Any
        //  254    278    289    296    Any
        //  281    284    284    289    Ljava/lang/IllegalArgumentException;
        //  281    284    289    296    Any
        //  286    289    289    296    Any
        //  291    293    289    296    Any
        //  298    301    301    306    Ljava/lang/IllegalArgumentException;
        //  298    301    289    296    Any
        //  303    306    289    296    Any
        //  308    311    311    316    Ljava/lang/IllegalArgumentException;
        //  308    311    289    296    Any
        //  313    316    289    296    Any
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
    
    static ArrayList f(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.y;
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //     8: ifnull          18
        //    11: aload_0        
        //    12: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //    15: invokevirtual   java/util/ArrayList.clear:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //    22: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    25: astore_3       
        //    26: aload_3        
        //    27: invokeinterface java/util/Iterator.hasNext:()Z
        //    32: ifeq            60
        //    35: aload_3        
        //    36: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    41: checkcast       Lcom/whatsapp/a_9;
        //    44: astore          5
        //    46: aload_0        
        //    47: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //    50: aload           5
        //    52: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    55: pop            
        //    56: iload_1        
        //    57: ifeq            26
        //    60: aload_0        
        //    61: getfield        com/whatsapp/MultipleContactPicker.x:Lcom/whatsapp/tv;
        //    64: ifnull          74
        //    67: aload_0        
        //    68: getfield        com/whatsapp/MultipleContactPicker.x:Lcom/whatsapp/tv;
        //    71: invokevirtual   com/whatsapp/tv.notifyDataSetChanged:()V
        //    74: return         
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      18     75     78     Ljava/lang/IllegalArgumentException;
        //  60     74     78     83     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    
    static int g(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.s;
    }
    
    static ImageButton h(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.w;
    }
    
    static Set i(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.A;
    }
    
    static ArrayList j(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.D;
    }
    
    static int k(final MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.r;
    }
    
    @Override
    public void a() {
        this.e();
        this.x.notifyDataSetChanged();
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
        this.x.notifyDataSetChanged();
    }
    
    @Override
    public void b(final String s) {
        if (adc.b(s)) {
            return;
        }
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rq rq = new rq(e);
        try {
            if (a_9.a(this.D, rq)) {
                this.x.notifyDataSetChanged();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void c(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final q4 q4 = new q4(e);
        try {
            if (a_9.a(this.D, q4)) {
                this.x.notifyDataSetChanged();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rw rw = new rw(e);
        try {
            if (a_9.a(this.D, rw)) {
                this.x.notifyDataSetChanged();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    @Override
    public void onBackPressed() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/MultipleContactPicker.u:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            34
        //     9: aload_0        
        //    10: invokespecial   com/whatsapp/MultipleContactPicker.f:()V
        //    13: aload_0        
        //    14: iconst_0       
        //    15: putfield        com/whatsapp/MultipleContactPicker.u:Z
        //    18: aload_0        
        //    19: getfield        com/whatsapp/MultipleContactPicker.E:Landroid/widget/EditText;
        //    22: ldc_w           ""
        //    25: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    28: getstatic       com/whatsapp/App.I:Z
        //    31: ifeq            45
        //    34: aload_0        
        //    35: invokespecial   com/whatsapp/DialogToastListActivity.onBackPressed:()V
        //    38: return         
        //    39: astore_1       
        //    40: aload_1        
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      39     42     Ljava/lang/IllegalArgumentException;
        //  9      34     42     45     Ljava/lang/IllegalArgumentException;
        //  34     38     42     45     Ljava/lang/IllegalArgumentException;
        //  40     42     42     45     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        final a_9 a_9 = (a_9)this.c().getItemAtPosition(((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).position);
        try {
            switch (menuItem.getItemId()) {
                default: {
                    return super.onContextItemSelected(menuItem);
                }
                case 0: {
                    App.a(this, false, a_9.u);
                    return true;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //     7: iconst_4       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   com/whatsapp/DialogToastListActivity.onCreate:(Landroid/os/Bundle;)V
        //    17: aload_0        
        //    18: invokevirtual   com/whatsapp/MultipleContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    21: iconst_1       
        //    22: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    25: aload_0        
        //    26: invokevirtual   com/whatsapp/MultipleContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    29: iconst_1       
        //    30: invokevirtual   android/support/v7/app/ActionBar.setDisplayShowCustomEnabled:(Z)V
        //    33: aload_0        
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/MultipleContactPicker.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    38: ldc_w           2130903191
        //    41: aconst_null    
        //    42: iconst_0       
        //    43: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    46: invokevirtual   com/whatsapp/MultipleContactPicker.setContentView:(Landroid/view/View;)V
        //    49: aload_0        
        //    50: aload_0        
        //    51: invokevirtual   com/whatsapp/MultipleContactPicker.getIntent:()Landroid/content/Intent;
        //    54: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //    57: iconst_2       
        //    58: aaload         
        //    59: iconst_m1      
        //    60: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    63: putfield        com/whatsapp/MultipleContactPicker.s:I
        //    66: aload_0        
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/MultipleContactPicker.getIntent:()Landroid/content/Intent;
        //    71: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //    74: iconst_3       
        //    75: aaload         
        //    76: ldc_w           2131231231
        //    79: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    82: putfield        com/whatsapp/MultipleContactPicker.r:I
        //    85: aload_0        
        //    86: aload_0        
        //    87: invokevirtual   com/whatsapp/MultipleContactPicker.getIntent:()Landroid/content/Intent;
        //    90: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //    93: bipush          7
        //    95: aaload         
        //    96: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    99: invokevirtual   com/whatsapp/MultipleContactPicker.setTitle:(Ljava/lang/CharSequence;)V
        //   102: aload_0        
        //   103: invokevirtual   com/whatsapp/MultipleContactPicker.c:()Landroid/widget/ListView;
        //   106: astore_3       
        //   107: aload_3        
        //   108: new             Lcom/whatsapp/util/m;
        //   111: dup            
        //   112: aload_0        
        //   113: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   116: ldc_w           2130837753
        //   119: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   122: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   125: invokevirtual   android/widget/ListView.setDivider:(Landroid/graphics/drawable/Drawable;)V
        //   128: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   131: bipush          11
        //   133: if_icmplt       148
        //   136: aload_3        
        //   137: iconst_1       
        //   138: invokevirtual   android/widget/ListView.setFastScrollAlwaysVisible:(Z)V
        //   141: aload_3        
        //   142: ldc_w           33554432
        //   145: invokevirtual   android/widget/ListView.setScrollBarStyle:(I)V
        //   148: aload_0        
        //   149: aload_0        
        //   150: invokevirtual   com/whatsapp/MultipleContactPicker.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   153: ldc_w           2130903194
        //   156: aload_3        
        //   157: iconst_0       
        //   158: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   161: putfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   164: aload_3        
        //   165: aload_0        
        //   166: getfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   169: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;)V
        //   172: aload_0        
        //   173: aload_0        
        //   174: getfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   177: ldc_w           2131755681
        //   180: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   183: checkcast       Landroid/widget/EditText;
        //   186: putfield        com/whatsapp/MultipleContactPicker.E:Landroid/widget/EditText;
        //   189: aload_0        
        //   190: getfield        com/whatsapp/MultipleContactPicker.E:Landroid/widget/EditText;
        //   193: aload_0        
        //   194: getfield        com/whatsapp/MultipleContactPicker.z:Landroid/text/TextWatcher;
        //   197: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   200: aload_0        
        //   201: getfield        com/whatsapp/MultipleContactPicker.E:Landroid/widget/EditText;
        //   204: invokestatic    com/whatsapp/alm.a:(Landroid/widget/TextView;)V
        //   207: aload_0        
        //   208: getfield        com/whatsapp/MultipleContactPicker.E:Landroid/widget/EditText;
        //   211: aload_0        
        //   212: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   215: ldc_w           2131361822
        //   218: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   221: aload_0        
        //   222: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   225: ldc_w           2131361822
        //   228: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   231: invokestatic    com/whatsapp/alm.a:(Landroid/view/View;II)V
        //   234: aload_0        
        //   235: aload_0        
        //   236: getfield        com/whatsapp/MultipleContactPicker.B:Landroid/view/View;
        //   239: ldc_w           2131755682
        //   242: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   245: checkcast       Landroid/widget/ImageButton;
        //   248: putfield        com/whatsapp/MultipleContactPicker.w:Landroid/widget/ImageButton;
        //   251: aload_0        
        //   252: getfield        com/whatsapp/MultipleContactPicker.w:Landroid/widget/ImageButton;
        //   255: new             Lcom/whatsapp/tf;
        //   258: dup            
        //   259: aload_0        
        //   260: invokespecial   com/whatsapp/tf.<init>:(Lcom/whatsapp/MultipleContactPicker;)V
        //   263: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   266: aload_0        
        //   267: aload_0        
        //   268: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //   271: bipush          6
        //   273: aaload         
        //   274: invokevirtual   com/whatsapp/MultipleContactPicker.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   277: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //   280: putfield        com/whatsapp/MultipleContactPicker.v:Landroid/view/inputmethod/InputMethodManager;
        //   283: aload_0        
        //   284: invokespecial   com/whatsapp/MultipleContactPicker.e:()V
        //   287: aload_0        
        //   288: new             Ljava/util/HashSet;
        //   291: dup            
        //   292: invokespecial   java/util/HashSet.<init>:()V
        //   295: putfield        com/whatsapp/MultipleContactPicker.A:Ljava/util/Set;
        //   298: aload_0        
        //   299: invokevirtual   com/whatsapp/MultipleContactPicker.getIntent:()Landroid/content/Intent;
        //   302: getstatic       com/whatsapp/MultipleContactPicker.F:[Ljava/lang/String;
        //   305: iconst_5       
        //   306: aaload         
        //   307: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   310: astore          5
        //   312: aload           5
        //   314: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   317: ifne            399
        //   320: aload           5
        //   322: ldc_w           ","
        //   325: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   328: astore          14
        //   330: aload_0        
        //   331: getfield        com/whatsapp/MultipleContactPicker.D:Ljava/util/ArrayList;
        //   334: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   337: astore          15
        //   339: aload           15
        //   341: invokeinterface java/util/Iterator.hasNext:()Z
        //   346: ifeq            399
        //   349: aload           15
        //   351: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   356: checkcast       Lcom/whatsapp/a_9;
        //   359: astore          16
        //   361: aload           14
        //   363: aload           16
        //   365: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   368: invokestatic    com/whatsapp/util/ax.a:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   371: ifeq            395
        //   374: aload           16
        //   376: iconst_1       
        //   377: putfield        com/whatsapp/a_9.g:Z
        //   380: aload_0        
        //   381: getfield        com/whatsapp/MultipleContactPicker.A:Ljava/util/Set;
        //   384: aload           16
        //   386: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   389: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   394: pop            
        //   395: iload_2        
        //   396: ifeq            339
        //   399: aload_3        
        //   400: aload_0        
        //   401: ldc_w           2131755407
        //   404: invokevirtual   com/whatsapp/MultipleContactPicker.findViewById:(I)Landroid/view/View;
        //   407: invokevirtual   android/widget/ListView.setEmptyView:(Landroid/view/View;)V
        //   410: aload_3        
        //   411: iconst_1       
        //   412: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //   415: aload_3        
        //   416: iconst_1       
        //   417: invokevirtual   android/widget/ListView.setScrollbarFadingEnabled:(Z)V
        //   420: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   423: istore          10
        //   425: iload           10
        //   427: bipush          11
        //   429: if_icmplt       512
        //   432: getstatic       com/whatsapp/App.W:Z
        //   435: istore          13
        //   437: iload           13
        //   439: ifeq            477
        //   442: aload_3        
        //   443: iconst_1       
        //   444: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   447: aload_3        
        //   448: aload_0        
        //   449: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   452: ldc_w           2131361808
        //   455: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   458: iconst_0       
        //   459: aload_0        
        //   460: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   463: ldc_w           2131361807
        //   466: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   469: iconst_0       
        //   470: invokevirtual   android/widget/ListView.setPadding:(IIII)V
        //   473: iload_2        
        //   474: ifeq            519
        //   477: aload_3        
        //   478: iconst_2       
        //   479: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   482: aload_3        
        //   483: aload_0        
        //   484: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   487: ldc_w           2131361807
        //   490: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   493: iconst_0       
        //   494: aload_0        
        //   495: invokevirtual   com/whatsapp/MultipleContactPicker.getResources:()Landroid/content/res/Resources;
        //   498: ldc_w           2131361808
        //   501: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   504: iconst_0       
        //   505: invokevirtual   android/widget/ListView.setPadding:(IIII)V
        //   508: iload_2        
        //   509: ifeq            519
        //   512: aload_3        
        //   513: ldc_w           2130839068
        //   516: invokevirtual   android/widget/ListView.setSelector:(I)V
        //   519: aload_3        
        //   520: new             Lcom/whatsapp/hi;
        //   523: dup            
        //   524: aload_0        
        //   525: invokespecial   com/whatsapp/hi.<init>:(Lcom/whatsapp/MultipleContactPicker;)V
        //   528: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   531: aload_0        
        //   532: aload_0        
        //   533: getfield        com/whatsapp/MultipleContactPicker.A:Ljava/util/Set;
        //   536: invokeinterface java/util/Set.size:()I
        //   541: invokespecial   com/whatsapp/MultipleContactPicker.d:(I)V
        //   544: aload_0        
        //   545: new             Lcom/whatsapp/tv;
        //   548: dup            
        //   549: aload_0        
        //   550: aload_0        
        //   551: ldc_w           2130903192
        //   554: aload_0        
        //   555: getfield        com/whatsapp/MultipleContactPicker.t:Ljava/util/ArrayList;
        //   558: invokespecial   com/whatsapp/tv.<init>:(Lcom/whatsapp/MultipleContactPicker;Landroid/content/Context;ILjava/util/List;)V
        //   561: putfield        com/whatsapp/MultipleContactPicker.x:Lcom/whatsapp/tv;
        //   564: aload_0        
        //   565: aload_0        
        //   566: getfield        com/whatsapp/MultipleContactPicker.x:Lcom/whatsapp/tv;
        //   569: invokevirtual   com/whatsapp/MultipleContactPicker.a:(Landroid/widget/ListAdapter;)V
        //   572: aload_0        
        //   573: aload_0        
        //   574: invokevirtual   com/whatsapp/MultipleContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   577: aload_0        
        //   578: ldc_w           2131231038
        //   581: invokevirtual   com/whatsapp/MultipleContactPicker.getString:(I)Ljava/lang/String;
        //   584: new             Lcom/whatsapp/aaa;
        //   587: dup            
        //   588: aload_0        
        //   589: invokespecial   com/whatsapp/aaa.<init>:(Lcom/whatsapp/MultipleContactPicker;)V
        //   592: invokestatic    com/whatsapp/a81.a:(Landroid/app/Activity;Landroid/support/v7/app/ActionBar;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
        //   595: pop            
        //   596: new             Lcom/whatsapp/xj;
        //   599: dup            
        //   600: aload_0        
        //   601: invokespecial   com/whatsapp/xj.<init>:(Lcom/whatsapp/MultipleContactPicker;)V
        //   604: astore          12
        //   606: aload_0        
        //   607: ldc_w           2131755568
        //   610: invokevirtual   com/whatsapp/MultipleContactPicker.findViewById:(I)Landroid/view/View;
        //   613: aload           12
        //   615: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   618: aload_0        
        //   619: aload_3        
        //   620: invokevirtual   com/whatsapp/MultipleContactPicker.registerForContextMenu:(Landroid/view/View;)V
        //   623: return         
        //   624: astore          4
        //   626: aload           4
        //   628: athrow         
        //   629: astore          17
        //   631: aload           17
        //   633: athrow         
        //   634: astore          6
        //   636: aload           6
        //   638: athrow         
        //   639: astore          7
        //   641: aload           7
        //   643: athrow         
        //   644: astore          8
        //   646: aload           8
        //   648: athrow         
        //   649: astore          9
        //   651: aload           9
        //   653: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  107    148    624    629    Ljava/lang/IllegalArgumentException;
        //  361    395    629    634    Ljava/lang/IllegalArgumentException;
        //  399    425    634    639    Ljava/lang/IllegalArgumentException;
        //  432    437    639    644    Ljava/lang/IllegalArgumentException;
        //  442    473    644    649    Ljava/lang/IllegalArgumentException;
        //  477    508    649    654    Ljava/lang/IllegalArgumentException;
        //  512    519    649    654    Ljava/lang/IllegalArgumentException;
        //  636    639    639    644    Ljava/lang/IllegalArgumentException;
        //  641    644    644    649    Ljava/lang/IllegalArgumentException;
        //  646    649    649    654    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 306, Size: 306
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
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final a_9 a_9 = (a_9)this.c().getItemAtPosition(((AdapterView$AdapterContextMenuInfo)contextMenu$ContextMenuInfo).position);
        if (a_9 != null) {
            try {
                if (b(a_9)) {
                    return;
                }
                final a_9 a_10 = a_9;
                final String s = a_10.u;
                final boolean p3 = App.p(s);
                final boolean p4 = p3;
                if (p4) {
                    final MultipleContactPicker multipleContactPicker = this;
                    final ContextMenu contextMenu2 = contextMenu;
                    final View view2 = view;
                    final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo2 = contextMenu$ContextMenuInfo;
                    multipleContactPicker.onCreateContextMenu(contextMenu2, view2, contextMenu$ContextMenuInfo2);
                    final MultipleContactPicker multipleContactPicker2 = this;
                    final int n = 2131230843;
                    final String s2 = multipleContactPicker2.getString(n);
                    final int n2 = 1;
                    final Object[] array = new Object[n2];
                    final Object[] array3;
                    final Object[] array2 = array3 = array;
                    final int n3 = 0;
                    final a_9 a_11 = a_9;
                    final String s3 = a_11.t;
                    array3[n3] = s3;
                    final ContextMenu contextMenu3 = contextMenu;
                    final int n4 = 0;
                    final int n5 = 0;
                    final int n6 = 0;
                    final String s4 = s2;
                    final Object[] array4 = array2;
                    final String s5 = String.format(s4, array4);
                    contextMenu3.add(n4, n5, n6, (CharSequence)s5);
                }
                return;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final a_9 a_10 = a_9;
                final String s = a_10.u;
                final boolean p4;
                final boolean p3 = p4 = App.p(s);
                if (p4) {
                    final MultipleContactPicker multipleContactPicker = this;
                    final ContextMenu contextMenu2 = contextMenu;
                    final View view2 = view;
                    final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo2 = contextMenu$ContextMenuInfo;
                    multipleContactPicker.onCreateContextMenu(contextMenu2, view2, contextMenu$ContextMenuInfo2);
                    final MultipleContactPicker multipleContactPicker2 = this;
                    final int n = 2131230843;
                    final String s2 = multipleContactPicker2.getString(n);
                    final int n2 = 1;
                    final Object[] array = new Object[n2];
                    final Object[] array3;
                    final Object[] array2 = array3 = array;
                    final int n3 = 0;
                    final a_9 a_11 = a_9;
                    final String s3 = a_11.t;
                    array3[n3] = s3;
                    final ContextMenu contextMenu3 = contextMenu;
                    final int n4 = 0;
                    final int n5 = 0;
                    final int n6 = 0;
                    final String s4 = s2;
                    final Object[] array4 = array2;
                    final String s5 = String.format(s4, array4);
                    contextMenu3.add(n4, n5, n6, (CharSequence)s5);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    public void onDestroy() {
        Log.i(MultipleContactPicker.F[0]);
        super.onDestroy();
        this.D.clear();
        this.t.clear();
        this.C.a();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332: {
                    this.finish();
                    return true;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return true;
    }
    
    public void onPause() {
        super.onPause();
        App.a((aws)this);
    }
    
    public void onResume() {
        super.onResume();
        App.b((aws)this);
        this.x.notifyDataSetChanged();
    }
    
    public boolean onSearchRequested() {
        try {
            if (this.u) {
                return false;
            }
            final MultipleContactPicker multipleContactPicker = this;
            final ArrayList list = multipleContactPicker.D;
            final int n = list.size();
            if (n > 0) {
                final MultipleContactPicker multipleContactPicker2 = this;
                final int n2 = 2131755616;
                final View view = multipleContactPicker2.findViewById(n2);
                final int n3 = 0;
                view.setVisibility(n3);
                final MultipleContactPicker multipleContactPicker3 = this;
                final InputMethodManager inputMethodManager = multipleContactPicker3.v;
                final int n4 = 0;
                final int n5 = 0;
                inputMethodManager.toggleSoftInput(n4, n5);
                final MultipleContactPicker multipleContactPicker4 = this;
                final EditText editText = multipleContactPicker4.E;
                editText.requestFocus();
                final MultipleContactPicker multipleContactPicker5 = this;
                final EditText editText2 = multipleContactPicker5.E;
                final String s = "";
                editText2.setText((CharSequence)s);
                final MultipleContactPicker multipleContactPicker6 = this;
                final ListView listView = multipleContactPicker6.c();
                final MultipleContactPicker multipleContactPicker7 = this;
                final ii ii = new ii(multipleContactPicker7);
                listView.post((Runnable)ii);
                return false;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final MultipleContactPicker multipleContactPicker = this;
            final ArrayList list = multipleContactPicker.D;
            final int n = list.size();
            if (n > 0) {
                final MultipleContactPicker multipleContactPicker2 = this;
                final int n2 = 2131755616;
                final View view = multipleContactPicker2.findViewById(n2);
                final int n3 = 0;
                view.setVisibility(n3);
                final MultipleContactPicker multipleContactPicker3 = this;
                final InputMethodManager inputMethodManager = multipleContactPicker3.v;
                final int n4 = 0;
                final int n5 = 0;
                inputMethodManager.toggleSoftInput(n4, n5);
                final MultipleContactPicker multipleContactPicker4 = this;
                final EditText editText = multipleContactPicker4.E;
                editText.requestFocus();
                final MultipleContactPicker multipleContactPicker5 = this;
                final EditText editText2 = multipleContactPicker5.E;
                final String s = "";
                editText2.setText((CharSequence)s);
                final MultipleContactPicker multipleContactPicker6 = this;
                final ListView listView = multipleContactPicker6.c();
                final MultipleContactPicker multipleContactPicker7 = this;
                final ii ii = new ii(multipleContactPicker7);
                listView.post((Runnable)ii);
                return false;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
}
