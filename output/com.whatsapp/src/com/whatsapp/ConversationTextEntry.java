// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.provider.Settings$Secure;
import android.text.TextUtils;
import android.text.TextUtils$TruncateAt;
import android.graphics.Paint$Align;
import android.graphics.Canvas;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.Editable$Factory;
import android.support.v7.widget.AppCompatEditText;

public class ConversationTextEntry extends AppCompatEditText
{
    private static boolean c;
    private static final Editable$Factory d;
    private static final String[] z;
    private String a;
    private float b;
    private String e;
    private float f;
    private TextPaint g;
    private int h;
    
    static {
        final String[] z2 = new String[2];
        String s = "2h\u0017?M%dTpK5u\u0015xA\u007fo\u000erL<bU?m\u0005D3\\`\u0002b\bgL2b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0015:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0116_Outer:
                while (true) {
                    Label_0188: {
                        if (length > n3) {
                            break Label_0188;
                        }
                        final String intern = new String(charArray).intern();
                        final char[] charArray2;
                        final int length2;
                        int n4 = 0;
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "5b\u001cpP=s%xK!r\u000eNH4s\u0012~A";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0015;
                            }
                            case 0: {
                                array[n2] = intern;
                                z = z2;
                                ConversationTextEntry.c = false;
                                charArray2 = "!u\u0015r@\"t.~v$w\n~W%B\u0017~O8".toCharArray();
                                length2 = charArray2.length;
                                n4 = 0;
                                break;
                            }
                        }
                    Label_0177_Outer:
                        while (true) {
                            Label_0277: {
                                if (length2 > n4) {
                                    break Label_0277;
                                }
                                final String intern2 = new String(charArray2).intern();
                            Label_0324_Outer:
                                while (true) {
                                    try {
                                        Layout.class.getDeclaredMethod(intern2, CharSequence.class, Integer.TYPE, Integer.TYPE);
                                        ConversationTextEntry.c = true;
                                        d = new py();
                                        return;
                                        Label_0228: {
                                            final char c = '%';
                                        }
                                        // switch([Lcom.strobel.decompiler.ast.Label;@59c36073, n4 % 5)
                                        // switch([Lcom.strobel.decompiler.ast.Label;@6a90deb1, n3 % 5)
                                    Label_0324:
                                        while (true) {
                                            char c2;
                                            char c4;
                                            while (true) {
                                                break Label_0232;
                                                Label_0341:
                                                c2 = 'Q';
                                                break Label_0324;
                                                Label_0348:
                                                c2 = '\u0007';
                                                break Label_0324;
                                                char c = '\0';
                                                final char c3;
                                                charArray[n3] = (char)(c ^ c3);
                                                ++n3;
                                                continue Label_0116_Outer;
                                                Label_0249:
                                                c = 'Q';
                                                continue Label_0324_Outer;
                                                c4 = charArray2[n4];
                                                c3 = charArray[n3];
                                                Label_0362:
                                                c2 = '\u0011';
                                                break Label_0324;
                                                Label_0256:
                                                c = '\u0007';
                                                continue Label_0324_Outer;
                                                Label_0355:
                                                c2 = 'z';
                                                break Label_0324;
                                                Label_0270:
                                                c = '\u0011';
                                                continue Label_0324_Outer;
                                                Label_0263:
                                                c = 'z';
                                                continue Label_0324_Outer;
                                            }
                                            charArray2[n4] = (char)(c2 ^ c4);
                                            ++n4;
                                            continue Label_0177_Outer;
                                            Label_0320:
                                            c2 = '%';
                                            continue Label_0324;
                                        }
                                    }
                                    catch (NoSuchMethodException ex) {
                                        continue;
                                    }
                                    catch (SecurityException ex2) {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
            break;
        }
    }
    
    public ConversationTextEntry(final Context context) {
        super(context);
        Label_0019: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0019;
            }
            try {
                if (ConversationTextEntry.c) {
                    this.setEditableFactory(ConversationTextEntry.d);
                }
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    public ConversationTextEntry(final Context context, final AttributeSet set) {
        super(context, set);
        Label_0020: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0020;
            }
            try {
                if (ConversationTextEntry.c) {
                    this.setEditableFactory(ConversationTextEntry.d);
                }
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    public ConversationTextEntry(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        Label_0021: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0021;
            }
            try {
                if (ConversationTextEntry.c) {
                    this.setEditableFactory(ConversationTextEntry.d);
                }
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/support/v7/widget/AppCompatEditText.onCreateInputConnection:(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
        //     5: astore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/ConversationTextEntry.h:I
        //    10: ifeq            75
        //    13: sipush          255
        //    16: aload_1        
        //    17: getfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    20: iand           
        //    21: istore_3       
        //    22: iload_3        
        //    23: aload_0        
        //    24: getfield        com/whatsapp/ConversationTextEntry.h:I
        //    27: iand           
        //    28: ifeq            54
        //    31: aload_1        
        //    32: iload_3        
        //    33: aload_1        
        //    34: getfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    37: ixor           
        //    38: putfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    41: aload_1        
        //    42: aload_1        
        //    43: getfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    46: aload_0        
        //    47: getfield        com/whatsapp/ConversationTextEntry.h:I
        //    50: ior            
        //    51: putfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    54: ldc             1073741824
        //    56: aload_1        
        //    57: getfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    60: iand           
        //    61: ifeq            75
        //    64: aload_1        
        //    65: ldc             -1073741825
        //    67: aload_1        
        //    68: getfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    71: iand           
        //    72: putfield        android/view/inputmethod/EditorInfo.imeOptions:I
        //    75: aload_2        
        //    76: areturn        
        //    77: astore          4
        //    79: aload           4
        //    81: athrow         
        //    82: astore          5
        //    84: aload           5
        //    86: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  22     54     77     82     Ljava/lang/SecurityException;
        //  54     75     82     87     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    protected void onDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/support/v7/widget/AppCompatEditText.onDraw:(Landroid/graphics/Canvas;)V
        //     5: aload_0        
        //     6: getfield        com/whatsapp/ConversationTextEntry.e:Ljava/lang/String;
        //     9: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    12: istore          6
        //    14: iload           6
        //    16: ifne            118
        //    19: aload_0        
        //    20: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    23: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    26: istore          7
        //    28: iload           7
        //    30: ifeq            118
        //    33: invokestatic    com/whatsapp/App.ak:()Z
        //    36: istore          8
        //    38: iload           8
        //    40: ifeq            76
        //    43: aload_1        
        //    44: aload_0        
        //    45: getfield        com/whatsapp/ConversationTextEntry.e:Ljava/lang/String;
        //    48: aload_0        
        //    49: invokevirtual   com/whatsapp/ConversationTextEntry.getPaddingLeft:()I
        //    52: i2f            
        //    53: aload_0        
        //    54: invokevirtual   com/whatsapp/ConversationTextEntry.getPaddingTop:()I
        //    57: i2f            
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ConversationTextEntry.f:F
        //    62: fsub           
        //    63: aload_0        
        //    64: getfield        com/whatsapp/ConversationTextEntry.g:Landroid/text/TextPaint;
        //    67: invokevirtual   android/graphics/Canvas.drawText:(Ljava/lang/String;FFLandroid/graphics/Paint;)V
        //    70: getstatic       com/whatsapp/App.I:Z
        //    73: ifeq            118
        //    76: aload_0        
        //    77: getfield        com/whatsapp/ConversationTextEntry.g:Landroid/text/TextPaint;
        //    80: getstatic       android/graphics/Paint$Align.RIGHT:Landroid/graphics/Paint$Align;
        //    83: invokevirtual   android/text/TextPaint.setTextAlign:(Landroid/graphics/Paint$Align;)V
        //    86: aload_1        
        //    87: aload_0        
        //    88: getfield        com/whatsapp/ConversationTextEntry.e:Ljava/lang/String;
        //    91: aload_0        
        //    92: invokevirtual   com/whatsapp/ConversationTextEntry.getWidth:()I
        //    95: aload_0        
        //    96: invokevirtual   com/whatsapp/ConversationTextEntry.getPaddingRight:()I
        //    99: isub           
        //   100: i2f            
        //   101: aload_0        
        //   102: invokevirtual   com/whatsapp/ConversationTextEntry.getPaddingTop:()I
        //   105: i2f            
        //   106: aload_0        
        //   107: getfield        com/whatsapp/ConversationTextEntry.f:F
        //   110: fsub           
        //   111: aload_0        
        //   112: getfield        com/whatsapp/ConversationTextEntry.g:Landroid/text/TextPaint;
        //   115: invokevirtual   android/graphics/Canvas.drawText:(Ljava/lang/String;FFLandroid/graphics/Paint;)V
        //   118: return         
        //   119: astore_2       
        //   120: aload_2        
        //   121: athrow         
        //   122: astore_3       
        //   123: aload_3        
        //   124: athrow         
        //   125: astore          4
        //   127: aload           4
        //   129: athrow         
        //   130: astore          5
        //   132: aload           5
        //   134: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      14     119    122    Ljava/lang/SecurityException;
        //  19     28     122    125    Ljava/lang/SecurityException;
        //  33     38     125    130    Ljava/lang/SecurityException;
        //  43     76     130    135    Ljava/lang/SecurityException;
        //  76     118    130    135    Ljava/lang/SecurityException;
        //  120    122    122    125    Ljava/lang/SecurityException;
        //  123    125    125    130    Ljava/lang/SecurityException;
        //  127    130    130    135    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 71, Size: 71
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
        super.onMeasure(n, n2);
        if (this.a == null) {
            return;
        }
        final int n3 = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
        try {
            if (this.g == null) {
                (this.g = new TextPaint(1)).setColor(this.getHintTextColors().getDefaultColor());
                this.g.setTextSize(this.getTextSize());
                this.g.setTextAlign(Paint$Align.LEFT);
            }
            this.e = TextUtils.ellipsize((CharSequence)this.a, this.g, (float)n3, TextUtils$TruncateAt.END).toString();
            this.f = this.g.getFontMetrics().top;
            this.b = this.g.measureText(this.e);
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public void setHint(final String a) {
        this.a = a;
        this.e = null;
        this.requestLayout();
    }
    
    public void setInputEnterAction(final int h) {
        this.h = h;
        this.setRawInputType(180225);
        int imeOptions = 4;
        if (h == 0) {
            imeOptions = 1073741828;
        }
        try {
            if (Build$VERSION.SDK_INT >= 14 && ConversationTextEntry.z[0].equals(Settings$Secure.getString(App.i, ConversationTextEntry.z[1]))) {
                imeOptions |= 0x10000000;
            }
            this.setImeOptions(imeOptions);
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public void setInputEnterDone(final boolean b) {
        int inputEnterAction;
        if (b) {
            inputEnterAction = 6;
        }
        else {
            inputEnterAction = 0;
        }
        this.setInputEnterAction(inputEnterAction);
    }
    
    public void setInputEnterSend(final boolean b) {
        int inputEnterAction;
        if (b) {
            inputEnterAction = 4;
        }
        else {
            inputEnterAction = 0;
        }
        this.setInputEnterAction(inputEnterAction);
    }
}
