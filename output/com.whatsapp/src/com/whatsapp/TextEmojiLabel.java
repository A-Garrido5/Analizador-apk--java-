// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Spannable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.Log;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.content.Context;
import android.text.Layout;
import android.widget.TextView$BufferType;
import android.text.Spannable$Factory;
import android.widget.TextView;

public class TextEmojiLabel extends TextView
{
    private static final Spannable$Factory b;
    private static boolean c;
    private static final String[] z;
    private int a;
    private TextView$BufferType d;
    private CharSequence e;
    private aav f;
    
    static {
        final String[] z2 = new String[13];
        String s = "?\u0017";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0386_Outer:
                while (true) {
                    Label_0458: {
                        if (length > n3) {
                            break Label_0458;
                        }
                        final String intern = new String(charArray).intern();
                        final char[] charArray2;
                        final int length2;
                        int n4 = 0;
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "#O";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                s = "{\nb-\u001bb\u0000p0\u0012n\r\u007f5Qb\n{*\u000b}\n+y";
                                n2 = 2;
                                array = z2;
                                n = 1;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                s = "c\u0006t<!l\u0000o7\n5O";
                                n2 = 3;
                                array = z2;
                                n = 2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                s = "c\u0006t<^";
                                n2 = 4;
                                array = z2;
                                n = 3;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                array = z2;
                                s = "b\n{*\u000b}\n~.\u0017k\u001brc^";
                                n = 4;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "{\nb-D/";
                                n = 5;
                                array = z2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                s = "&U:";
                                n = 6;
                                array = z2;
                                continue Label_0016;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "/G";
                                n = 7;
                                array = z2;
                                continue Label_0016;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "c\u0006t<^";
                                n = 8;
                                array = z2;
                                continue Label_0016;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "/G";
                                n = 9;
                                array = z2;
                                continue Label_0016;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "{\nb-\u001bb\u0000p0\u0012n\r\u007f5Qb\n{*\u000b}\n:";
                                n = 10;
                                array = z2;
                                continue Label_0016;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "{\nb-\u001bb\u0000p0\u0012n\r\u007f5Qb\n{*\u000b}\n:";
                                n = 11;
                                array = z2;
                                continue Label_0016;
                            }
                            case 11: {
                                array[n2] = intern;
                                z = z2;
                                TextEmojiLabel.c = false;
                                charArray2 = "\u007f\u001du:\u001b|\u001cN6-z\u001fj6\f{*w6\u0014f".toCharArray();
                                length2 = charArray2.length;
                                n4 = 0;
                                break;
                            }
                        }
                    Label_0447_Outer:
                        while (true) {
                            Label_0549: {
                                if (length2 > n4) {
                                    break Label_0549;
                                }
                                final String intern2 = new String(charArray2).intern();
                                while (true) {
                                    try {
                                        Layout.class.getDeclaredMethod(intern2, CharSequence.class, Integer.TYPE, Integer.TYPE);
                                        TextEmojiLabel.c = true;
                                        b = new kw();
                                        return;
                                        Label_0627: {
                                            final char c = '\u001a';
                                        }
                                        while (true) {
                                            break Label_0596;
                                            Label_0592:
                                            char c = '~';
                                            break Label_0596;
                                            Label_0535:
                                            char c2 = '\u001a';
                                            Label_0504: {
                                                break Label_0504;
                                                Label_0500:
                                                c2 = '~';
                                                break Label_0504;
                                                final char c3 = charArray2[n4];
                                                Label_0613:
                                                c = '\u000f';
                                                break Label_0596;
                                                Label_0521:
                                                c2 = '\u000f';
                                                break Label_0504;
                                                Label_0634:
                                                c = 'Y';
                                                break Label_0596;
                                                Label_0542:
                                                c2 = 'Y';
                                                break Label_0504;
                                                Label_0528:
                                                c2 = 'o';
                                                break Label_0504;
                                                charArray2[n4] = (char)(c ^ c3);
                                                ++n4;
                                                continue Label_0447_Outer;
                                            }
                                            final char c4;
                                            charArray[n3] = (char)(c2 ^ c4);
                                            ++n3;
                                            continue Label_0386_Outer;
                                            c4 = charArray[n3];
                                            Label_0620:
                                            c = 'o';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@70cea89b, n4 % 5)
                                    // switch([Lcom.strobel.decompiler.ast.Label;@fc12b33, n3 % 5)
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
    
    public TextEmojiLabel(final Context context) {
        super(context);
        Label_0019: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0019;
            }
            try {
                if (TextEmojiLabel.c) {
                    this.setSpannableFactory(TextEmojiLabel.b);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
    }
    
    public TextEmojiLabel(final Context context, final AttributeSet set) {
        super(context, set);
        Label_0020: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0020;
            }
            try {
                if (TextEmojiLabel.c) {
                    this.setSpannableFactory(TextEmojiLabel.b);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
    }
    
    public TextEmojiLabel(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        Label_0021: {
            if (Build$VERSION.SDK_INT >= 11) {
                break Label_0021;
            }
            try {
                if (TextEmojiLabel.c) {
                    this.setSpannableFactory(TextEmojiLabel.b);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
    }
    
    private String a(final CharSequence charSequence) {
        final boolean i = App.I;
        String string = "";
        int j = 0;
        while (j < charSequence.length()) {
            string = string + TextEmojiLabel.z[0] + Integer.toHexString(charSequence.charAt(j)) + TextEmojiLabel.z[1];
            ++j;
            if (i) {
                break;
            }
        }
        return string;
    }
    
    private void a() {
        final boolean i = App.I;
        Log.e(TextEmojiLabel.z[5] + this.getMeasuredWidth());
        final CharSequence text = this.getText();
        Log.e(TextEmojiLabel.z[6] + this.a(text));
        final Layout layout = this.getLayout();
        Log.e(TextEmojiLabel.z[3] + layout.getLineCount());
        int n = 0;
        while (true) {
            if (n >= layout.getLineCount()) {
                return;
            }
            final int lineStart = layout.getLineStart(n);
            int n2 = 0;
            Label_0153: {
                if (n == -1 + layout.getLineCount()) {
                    n2 = text.length();
                    if (!i) {
                        break Label_0153;
                    }
                }
                n2 = layout.getLineStart(n + 1);
            }
            Label_0241: {
                if (lineStart > n2) {
                    break Label_0241;
                }
                try {
                    Log.e(TextEmojiLabel.z[9] + n + TextEmojiLabel.z[8] + lineStart + "-" + n2 + TextEmojiLabel.z[7] + this.a(text.subSequence(lineStart, n2)));
                    if (i) {
                        Log.e(TextEmojiLabel.z[4] + n + TextEmojiLabel.z[10] + lineStart + "-" + n2 + ")");
                    }
                    ++n;
                    if (i) {
                        return;
                    }
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @SuppressLint({ "WrongCall" })
    private void a(final int n, final int n2) {
        final boolean i = App.I;
        final SpannableStringBuilder e = new SpannableStringBuilder(this.e);
        int n3 = e.nextSpanTransition(0, e.length(), (Class)MetricAffectingSpan.class);
        while (n3 >= 0 && n3 < e.length()) {
            e.insert(n3, (CharSequence)" ");
            n3 = e.nextSpanTransition(n3 + 1, e.length(), (Class)MetricAffectingSpan.class);
            if (i) {
                break;
            }
        }
        try {
            super.setText(this.e = (CharSequence)e);
            super.onMeasure(n, n2);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            Log.e(TextEmojiLabel.z[2] + ex.toString());
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.e);
            final int index = TextUtils.indexOf((CharSequence)spannableStringBuilder, '\n', 0);
            Object replace = spannableStringBuilder;
            int j = index;
            while (j >= 0) {
                replace = ((SpannableStringBuilder)replace).replace(j, j + 1, (CharSequence)" ");
                j = TextUtils.indexOf((CharSequence)replace, '\n', j + 1);
                if (i) {
                    break;
                }
            }
            super.setText(this.e = (CharSequence)replace);
            super.onMeasure(n, n2);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        try {
            super.onDraw(canvas);
        }
        catch (Exception ex) {
            Log.b(ex);
            this.a();
            throw new RuntimeException(ex);
        }
    }
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore          5
        //     5: iload           5
        //     7: bipush          16
        //     9: if_icmpeq       24
        //    12: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    15: istore          16
        //    17: iload           16
        //    19: bipush          17
        //    21: if_icmpne       227
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: invokespecial   android/widget/TextView.onMeasure:(II)V
        //    30: aload_0        
        //    31: invokevirtual   com/whatsapp/TextEmojiLabel.getMeasuredWidth:()I
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/TextEmojiLabel.getPaddingLeft:()I
        //    38: isub           
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/TextEmojiLabel.getPaddingRight:()I
        //    43: isub           
        //    44: istore          8
        //    46: aload_0        
        //    47: getfield        com/whatsapp/TextEmojiLabel.a:I
        //    50: istore          11
        //    52: iload           11
        //    54: iload           8
        //    56: if_icmpeq       133
        //    59: aload_0        
        //    60: getfield        com/whatsapp/TextEmojiLabel.e:Ljava/lang/CharSequence;
        //    63: instanceof      Landroid/text/Spanned;
        //    66: ifeq            133
        //    69: aload_0        
        //    70: invokevirtual   com/whatsapp/TextEmojiLabel.getEllipsize:()Landroid/text/TextUtils$TruncateAt;
        //    73: astore          12
        //    75: aload           12
        //    77: ifnull          133
        //    80: aload_0        
        //    81: iload           8
        //    83: putfield        com/whatsapp/TextEmojiLabel.a:I
        //    86: aload_0        
        //    87: getfield        com/whatsapp/TextEmojiLabel.e:Ljava/lang/CharSequence;
        //    90: aload_0        
        //    91: invokevirtual   com/whatsapp/TextEmojiLabel.getPaint:()Landroid/text/TextPaint;
        //    94: iload           8
        //    96: i2f            
        //    97: aload_0        
        //    98: invokevirtual   com/whatsapp/TextEmojiLabel.getEllipsize:()Landroid/text/TextUtils$TruncateAt;
        //   101: invokestatic    android/text/TextUtils.ellipsize:(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
        //   104: astore          13
        //   106: aload           13
        //   108: ifnull          133
        //   111: aload           13
        //   113: aload_0        
        //   114: invokevirtual   com/whatsapp/TextEmojiLabel.getText:()Ljava/lang/CharSequence;
        //   117: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   120: ifne            133
        //   123: aload_0        
        //   124: aload           13
        //   126: aload_0        
        //   127: getfield        com/whatsapp/TextEmojiLabel.d:Landroid/widget/TextView$BufferType;
        //   130: invokespecial   android/widget/TextView.setText:(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
        //   133: return         
        //   134: astore_3       
        //   135: aload_3        
        //   136: athrow         
        //   137: astore          4
        //   139: aload           4
        //   141: athrow         
        //   142: astore          15
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: getstatic       com/whatsapp/TextEmojiLabel.z:[Ljava/lang/String;
        //   154: bipush          12
        //   156: aaload         
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: aload           15
        //   162: invokevirtual   java/lang/ArrayIndexOutOfBoundsException.toString:()Ljava/lang/String;
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   171: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   174: aload_0        
        //   175: iload_1        
        //   176: iload_2        
        //   177: invokespecial   com/whatsapp/TextEmojiLabel.a:(II)V
        //   180: goto            30
        //   183: astore          6
        //   185: new             Ljava/lang/StringBuilder;
        //   188: dup            
        //   189: invokespecial   java/lang/StringBuilder.<init>:()V
        //   192: getstatic       com/whatsapp/TextEmojiLabel.z:[Ljava/lang/String;
        //   195: bipush          11
        //   197: aaload         
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload           6
        //   203: invokevirtual   java/lang/IndexOutOfBoundsException.toString:()Ljava/lang/String;
        //   206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   209: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   212: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   215: aload_0        
        //   216: iload_1        
        //   217: iload_2        
        //   218: invokespecial   com/whatsapp/TextEmojiLabel.a:(II)V
        //   221: getstatic       com/whatsapp/App.I:Z
        //   224: ifeq            30
        //   227: aload_0        
        //   228: iload_1        
        //   229: iload_2        
        //   230: invokespecial   android/widget/TextView.onMeasure:(II)V
        //   233: goto            30
        //   236: astore          7
        //   238: aload           7
        //   240: athrow         
        //   241: astore          9
        //   243: aload           9
        //   245: athrow         
        //   246: astore          10
        //   248: aload           10
        //   250: athrow         
        //   251: astore          14
        //   253: aload           14
        //   255: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      5      134    137    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  12     17     134    137    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  12     17     137    142    Ljava/lang/SecurityException;
        //  24     30     142    183    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  24     30     183    227    Ljava/lang/IndexOutOfBoundsException;
        //  24     30     137    142    Ljava/lang/SecurityException;
        //  46     52     241    246    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  59     75     246    251    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  111    133    251    256    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  135    137    137    142    Ljava/lang/SecurityException;
        //  185    227    236    241    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  227    233    236    241    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  243    246    246    251    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 124, Size: 124
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
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f != null) {
            final CharSequence text = this.getText();
            try {
                if (text instanceof Spannable && this.getLayout() != null) {
                    return onTouchEvent | this.f.onTouchEvent(this, (Spannable)text, motionEvent);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        return onTouchEvent;
    }
    
    public void setLinkHandler(final aav f) {
        this.f = f;
    }
    
    public void setText(final CharSequence p0, final TextView$BufferType p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/TextEmojiLabel.c:Z
        //     7: istore          5
        //     9: iload           5
        //    11: ifeq            117
        //    14: aload_1        
        //    15: ifnull          117
        //    18: aconst_null    
        //    19: astore          13
        //    21: iconst_0       
        //    22: istore          14
        //    24: iload           14
        //    26: aload_1        
        //    27: invokeinterface java/lang/CharSequence.length:()I
        //    32: if_icmpge       109
        //    35: aload_1        
        //    36: iload           14
        //    38: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    43: istore          15
        //    45: iload           15
        //    47: ldc_w           55296
        //    50: if_icmplt       91
        //    53: iload           15
        //    55: ldc_w           57343
        //    58: if_icmpgt       91
        //    61: aload           13
        //    63: ifnonnull       76
        //    66: new             Landroid/text/SpannableStringBuilder;
        //    69: dup            
        //    70: aload_1        
        //    71: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //    74: astore          13
        //    76: aload           13
        //    78: iload           14
        //    80: iload           14
        //    82: iconst_1       
        //    83: iadd           
        //    84: ldc_w           "\u25a1"
        //    87: invokevirtual   android/text/SpannableStringBuilder.replace:(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //    90: pop            
        //    91: aload           13
        //    93: astore          16
        //    95: iload           14
        //    97: iconst_1       
        //    98: iadd           
        //    99: istore          17
        //   101: iload_3        
        //   102: ifeq            209
        //   105: aload           16
        //   107: astore          13
        //   109: aload           13
        //   111: ifnull          117
        //   114: aload           13
        //   116: astore_1       
        //   117: aload_0        
        //   118: aload_1        
        //   119: putfield        com/whatsapp/TextEmojiLabel.e:Ljava/lang/CharSequence;
        //   122: aload_0        
        //   123: aload_2        
        //   124: putfield        com/whatsapp/TextEmojiLabel.d:Landroid/widget/TextView$BufferType;
        //   127: aload_0        
        //   128: iconst_0       
        //   129: putfield        com/whatsapp/TextEmojiLabel.a:I
        //   132: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   135: istore          10
        //   137: iload           10
        //   139: bipush          11
        //   141: if_icmpge       154
        //   144: getstatic       com/whatsapp/TextEmojiLabel.c:Z
        //   147: istore          12
        //   149: iload           12
        //   151: ifeq            177
        //   154: aload_1        
        //   155: instanceof      Landroid/text/Spanned;
        //   158: istore          11
        //   160: iload           11
        //   162: ifeq            177
        //   165: aload_0        
        //   166: aload_1        
        //   167: getstatic       android/widget/TextView$BufferType.SPANNABLE:Landroid/widget/TextView$BufferType;
        //   170: invokespecial   android/widget/TextView.setText:(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
        //   173: iload_3        
        //   174: ifeq            183
        //   177: aload_0        
        //   178: aload_1        
        //   179: aload_2        
        //   180: invokespecial   android/widget/TextView.setText:(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
        //   183: return         
        //   184: astore          4
        //   186: aload           4
        //   188: athrow         
        //   189: astore          6
        //   191: aload           6
        //   193: athrow         
        //   194: astore          7
        //   196: aload           7
        //   198: athrow         
        //   199: astore          8
        //   201: aload           8
        //   203: athrow         
        //   204: astore          9
        //   206: aload           9
        //   208: athrow         
        //   209: iload           17
        //   211: istore          14
        //   213: aload           16
        //   215: astore          13
        //   217: goto            24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  4      9      184    189    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  117    137    189    194    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  144    149    194    199    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  154    160    199    204    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  165    173    204    209    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  177    183    204    209    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  191    194    194    199    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  196    199    199    204    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  201    204    204    209    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
