// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Editable;
import android.telephony.PhoneNumberUtils;
import com.google.e6;
import java.util.Locale;
import com.google.a9;
import android.text.TextWatcher;

public class ahr implements TextWatcher
{
    private int a;
    private boolean b;
    private a9 c;
    private boolean d;
    
    public ahr() {
        this(Locale.getDefault().getCountry());
    }
    
    public ahr(final String s) {
        this.d = false;
        if (s == null) {
            throw new IllegalArgumentException();
        }
        this.c = e6.a().i(s);
    }
    
    private String a(final char c, final boolean b) {
        if (b) {
            try {
                return this.c.a(c);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return this.c.b(c);
    }
    
    private String a(final CharSequence charSequence, final int n) {
        final boolean i = App.I;
        final int n2 = n - 1;
        String a = null;
        this.c.d();
        final int length = charSequence.length();
        int n3 = 0;
        boolean b = false;
        char c = '\0';
        while (true) {
            char c2 = '\0';
            String s = null;
            Label_0116: {
                if (n3 >= length) {
                    final boolean b2 = b;
                    final String a2 = a;
                    c2 = c;
                    break Label_0116;
                }
                while (true) {
                    final char char1 = charSequence.charAt(n3);
                    while (true) {
                        try {
                            if (PhoneNumberUtils.isNonSeparator(char1)) {
                                if (c != '\0') {
                                    a = this.a(c, b);
                                    b = false;
                                }
                                s = a;
                                c2 = char1;
                                if (n3 == n2) {
                                    b = true;
                                }
                                ++n3;
                                if (i) {
                                    final boolean b2 = b;
                                    String a2 = s;
                                    if (c2 != '\0') {
                                        a2 = this.a(c2, b2);
                                    }
                                    return a2;
                                }
                                break;
                            }
                        }
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                        final char c3 = c;
                        s = a;
                        c2 = c3;
                        continue;
                    }
                }
            }
            final char c4 = c2;
            a = s;
            c = c4;
        }
    }
    
    private void a() {
        this.b = true;
        this.c.d();
    }
    
    private boolean a(final CharSequence charSequence, final int n, final int n2) {
        final boolean i = App.I;
        int j = n;
        while (j < n + n2) {
            final char char1 = charSequence.charAt(j);
            try {
                if (!PhoneNumberUtils.isNonSeparator(char1)) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            ++j;
            if (i) {
                break;
            }
        }
        return false;
    }
    
    public void afterTextChanged(final Editable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ahr.b:Z
        //     8: istore          6
        //    10: iload           6
        //    12: ifeq            56
        //    15: aload_1        
        //    16: invokeinterface android/text/Editable.length:()I
        //    21: istore          13
        //    23: iload           13
        //    25: ifeq            51
        //    28: aload_0        
        //    29: iload_2        
        //    30: putfield        com/whatsapp/ahr.b:Z
        //    33: aload_0        
        //    34: monitorexit    
        //    35: return         
        //    36: astore          4
        //    38: aload           4
        //    40: athrow         
        //    41: astore          5
        //    43: aload           5
        //    45: athrow         
        //    46: astore_3       
        //    47: aload_0        
        //    48: monitorexit    
        //    49: aload_3        
        //    50: athrow         
        //    51: iconst_0       
        //    52: istore_2       
        //    53: goto            28
        //    56: aload_0        
        //    57: getfield        com/whatsapp/ahr.d:Z
        //    60: istore          8
        //    62: iload           8
        //    64: ifne            33
        //    67: aload_0        
        //    68: aload_1        
        //    69: aload_1        
        //    70: invokestatic    android/text/Selection.getSelectionEnd:(Ljava/lang/CharSequence;)I
        //    73: invokespecial   com/whatsapp/ahr.a:(Ljava/lang/CharSequence;I)Ljava/lang/String;
        //    76: astore          9
        //    78: aload           9
        //    80: ifnull          33
        //    83: aload_0        
        //    84: getfield        com/whatsapp/ahr.c:Lcom/google/a9;
        //    87: invokevirtual   com/google/a9.i:()I
        //    90: istore          10
        //    92: aload_0        
        //    93: iconst_1       
        //    94: putfield        com/whatsapp/ahr.d:Z
        //    97: aload_1        
        //    98: iconst_0       
        //    99: aload_1        
        //   100: invokeinterface android/text/Editable.length:()I
        //   105: aload           9
        //   107: iconst_0       
        //   108: aload           9
        //   110: invokevirtual   java/lang/String.length:()I
        //   113: invokeinterface android/text/Editable.replace:(IILjava/lang/CharSequence;II)Landroid/text/Editable;
        //   118: pop            
        //   119: aload           9
        //   121: aload_1        
        //   122: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   125: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   128: ifeq            137
        //   131: aload_1        
        //   132: iload           10
        //   134: invokestatic    android/text/Selection.setSelection:(Landroid/text/Spannable;I)V
        //   137: aload_0        
        //   138: iconst_0       
        //   139: putfield        com/whatsapp/ahr.d:Z
        //   142: goto            33
        //   145: astore          7
        //   147: aload           7
        //   149: athrow         
        //   150: astore          11
        //   152: aload           11
        //   154: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     36     41     Ljava/lang/IllegalArgumentException;
        //  4      10     46     51     Any
        //  15     23     41     46     Ljava/lang/IllegalArgumentException;
        //  15     23     46     51     Any
        //  28     33     46     51     Any
        //  38     41     41     46     Ljava/lang/IllegalArgumentException;
        //  38     41     46     51     Any
        //  43     46     46     51     Any
        //  56     62     145    150    Ljava/lang/IllegalArgumentException;
        //  56     62     46     51     Any
        //  67     78     46     51     Any
        //  83     92     46     51     Any
        //  92     137    150    155    Ljava/lang/IllegalArgumentException;
        //  92     137    46     51     Any
        //  137    142    46     51     Any
        //  147    150    46     51     Any
        //  152    155    46     51     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    public void beforeTextChanged(final CharSequence p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        com/whatsapp/ahr.d:Z
        //     9: istore          8
        //    11: iload           8
        //    13: ifne            180
        //    16: aload_0        
        //    17: getfield        com/whatsapp/ahr.b:Z
        //    20: ifeq            34
        //    23: return         
        //    24: astore          6
        //    26: aload           6
        //    28: athrow         
        //    29: astore          7
        //    31: aload           7
        //    33: athrow         
        //    34: iload_3        
        //    35: ifne            62
        //    38: aload_1        
        //    39: invokeinterface java/lang/CharSequence.length:()I
        //    44: istore          21
        //    46: iload           21
        //    48: iload_2        
        //    49: if_icmpne       62
        //    52: aload_0        
        //    53: iconst_1       
        //    54: putfield        com/whatsapp/ahr.a:I
        //    57: iload           5
        //    59: ifeq            180
        //    62: iload           4
        //    64: ifne            101
        //    67: iload_2        
        //    68: iload_3        
        //    69: iadd           
        //    70: istore          12
        //    72: aload_1        
        //    73: invokeinterface java/lang/CharSequence.length:()I
        //    78: istore          17
        //    80: iload           12
        //    82: iload           17
        //    84: if_icmpne       101
        //    87: iload_3        
        //    88: ifle            101
        //    91: aload_0        
        //    92: iconst_0       
        //    93: putfield        com/whatsapp/ahr.a:I
        //    96: iload           5
        //    98: ifeq            180
        //   101: iload_3        
        //   102: ifle            129
        //   105: aload_0        
        //   106: aload_1        
        //   107: iload_2        
        //   108: iload_3        
        //   109: invokespecial   com/whatsapp/ahr.a:(Ljava/lang/CharSequence;II)Z
        //   112: istore          11
        //   114: iload           11
        //   116: ifne            129
        //   119: aload_0        
        //   120: iconst_2       
        //   121: putfield        com/whatsapp/ahr.a:I
        //   124: iload           5
        //   126: ifeq            180
        //   129: aload_0        
        //   130: iconst_3       
        //   131: putfield        com/whatsapp/ahr.a:I
        //   134: return         
        //   135: astore          9
        //   137: aload           9
        //   139: athrow         
        //   140: astore          18
        //   142: aload           18
        //   144: athrow         
        //   145: astore          19
        //   147: aload           19
        //   149: athrow         
        //   150: astore          20
        //   152: aload           20
        //   154: athrow         
        //   155: astore          13
        //   157: aload           13
        //   159: athrow         
        //   160: astore          14
        //   162: aload           14
        //   164: athrow         
        //   165: astore          15
        //   167: aload           15
        //   169: athrow         
        //   170: astore          16
        //   172: aload           16
        //   174: athrow         
        //   175: astore          10
        //   177: aload           10
        //   179: athrow         
        //   180: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      11     24     29     Ljava/lang/IllegalArgumentException;
        //  16     23     29     34     Ljava/lang/IllegalArgumentException;
        //  26     29     29     34     Ljava/lang/IllegalArgumentException;
        //  38     46     140    145    Ljava/lang/IllegalArgumentException;
        //  52     57     145    155    Ljava/lang/IllegalArgumentException;
        //  72     80     155    165    Ljava/lang/IllegalArgumentException;
        //  91     96     165    175    Ljava/lang/IllegalArgumentException;
        //  105    114    175    180    Ljava/lang/IllegalArgumentException;
        //  119    124    135    140    Ljava/lang/IllegalArgumentException;
        //  129    134    135    140    Ljava/lang/IllegalArgumentException;
        //  142    145    145    155    Ljava/lang/IllegalArgumentException;
        //  147    150    150    155    Ljava/lang/IllegalArgumentException;
        //  152    155    155    165    Ljava/lang/IllegalArgumentException;
        //  157    160    160    165    Ljava/lang/IllegalArgumentException;
        //  162    165    165    175    Ljava/lang/IllegalArgumentException;
        //  167    170    170    175    Ljava/lang/IllegalArgumentException;
        //  172    175    175    180    Ljava/lang/IllegalArgumentException;
        //  177    180    135    140    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    public void onTextChanged(final CharSequence p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ahr.d:Z
        //     4: istore          7
        //     6: iload           7
        //     8: ifne            161
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ahr.b:Z
        //    15: ifeq            29
        //    18: return         
        //    19: astore          5
        //    21: aload           5
        //    23: athrow         
        //    24: astore          6
        //    26: aload           6
        //    28: athrow         
        //    29: aload_0        
        //    30: getfield        com/whatsapp/ahr.a:I
        //    33: istore          11
        //    35: iload           11
        //    37: iconst_3       
        //    38: if_icmpne       62
        //    41: iload           4
        //    43: ifle            62
        //    46: aload_0        
        //    47: aload_1        
        //    48: iload_2        
        //    49: iload           4
        //    51: invokespecial   com/whatsapp/ahr.a:(Ljava/lang/CharSequence;II)Z
        //    54: ifne            62
        //    57: aload_0        
        //    58: iconst_2       
        //    59: putfield        com/whatsapp/ahr.a:I
        //    62: aload_0        
        //    63: getfield        com/whatsapp/ahr.a:I
        //    66: istore          17
        //    68: iload           17
        //    70: iconst_1       
        //    71: if_icmpne       108
        //    74: iload           4
        //    76: ifle            108
        //    79: aload_0        
        //    80: aload_1        
        //    81: iload_2        
        //    82: iload           4
        //    84: invokespecial   com/whatsapp/ahr.a:(Ljava/lang/CharSequence;II)Z
        //    87: istore          18
        //    89: iload           18
        //    91: ifeq            108
        //    94: aload_0        
        //    95: invokespecial   com/whatsapp/ahr.a:()V
        //    98: getstatic       com/whatsapp/App.I:Z
        //   101: istore          19
        //   103: iload           19
        //   105: ifeq            161
        //   108: aload_0        
        //   109: getfield        com/whatsapp/ahr.a:I
        //   112: iconst_3       
        //   113: if_icmpne       161
        //   116: aload_0        
        //   117: invokespecial   com/whatsapp/ahr.a:()V
        //   120: return         
        //   121: astore          16
        //   123: aload           16
        //   125: athrow         
        //   126: astore          8
        //   128: aload           8
        //   130: athrow         
        //   131: astore          9
        //   133: aload           9
        //   135: athrow         
        //   136: astore          10
        //   138: aload           10
        //   140: athrow         
        //   141: astore          12
        //   143: aload           12
        //   145: athrow         
        //   146: astore          13
        //   148: aload           13
        //   150: athrow         
        //   151: astore          14
        //   153: aload           14
        //   155: athrow         
        //   156: astore          15
        //   158: aload           15
        //   160: athrow         
        //   161: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      19     24     Ljava/lang/IllegalArgumentException;
        //  11     18     24     29     Ljava/lang/IllegalArgumentException;
        //  21     24     24     29     Ljava/lang/IllegalArgumentException;
        //  29     35     126    136    Ljava/lang/IllegalArgumentException;
        //  46     62     136    141    Ljava/lang/IllegalArgumentException;
        //  62     68     141    151    Ljava/lang/IllegalArgumentException;
        //  79     89     151    156    Ljava/lang/IllegalArgumentException;
        //  94     103    156    161    Ljava/lang/IllegalArgumentException;
        //  108    120    121    126    Ljava/lang/IllegalArgumentException;
        //  128    131    131    136    Ljava/lang/IllegalArgumentException;
        //  133    136    136    141    Ljava/lang/IllegalArgumentException;
        //  143    146    146    151    Ljava/lang/IllegalArgumentException;
        //  148    151    151    156    Ljava/lang/IllegalArgumentException;
        //  153    156    156    161    Ljava/lang/IllegalArgumentException;
        //  158    161    121    126    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
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
