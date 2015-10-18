// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.hardware.Camera$Size;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.hardware.Camera$AutoFocusCallback;
import android.view.SurfaceHolder$Callback;
import android.view.SurfaceView;

public class QrCodeView extends SurfaceView implements SurfaceHolder$Callback
{
    private static final String[] z;
    final Camera$AutoFocusCallback a;
    private SurfaceHolder b;
    private Camera c;
    private Camera$Size d;
    private j e;
    
    static {
        final String[] z2 = new String[34];
        String s = "_+$DAYv!YK^:3@A\\8rHV\\6 \rWZ6\"]M@>rNEC< L\u0004^+7[MK.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0882:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = 'Y';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = '-';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_+$DAYv!YK^:3@A\\8rHV\\6 \rVK57LWK0<J\u0004M8?HVO";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "_+$DAYv!YK^:3@A\\8";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Y0<IKY";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000e? BJZc";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u000b]<&IM])>L]A+;HJZ8&DK@y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004],\"]K\\-7I\u0004H53^L\u0014";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "A?4";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "B8<IWM8\"H";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004],\"]K\\-7I\u0004H53^L\u00147'AH";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004M8?HVOy;^\u0004@,>A";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "O,&B";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000e) HRG<%\u0017";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\\6&LPG6<";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004J0!]HO h";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "A+;HJZ8&DK@";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "C81_K";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004],\"]K\\-7I\u0004H61XW\u0014";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "K==K";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004],\"]K\\-7I\u0004H61XW\u00147'AH";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "A?4";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "_+$DAYv4LHB;3NO],\"]K\\-7IT\\<$DAY*;WA]";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "^6 YVO0&";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "O,&B";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000e:3@A\\8h";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "C81_K";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "K==K";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "_+$DAYv!YE\\-\"_AX07Z\u0004A)&DIO5r]VK/;HS\u000e*;WA\u0014";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "_+$DAYv!YE\\-1LIK+3\rA\\+=_\u0004A)7CM@>rNEC< L";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "_+$DAYv!YE\\-1LIK+3\rA\\+=_\u0004\\<1BJ@<1YM@>rNEC< L";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "_+$DAYv!XVH81HGF8<JAJy";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "_+$DAYv!XVH81HGF8<JAJcrCK\u000e*'_BO:7";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "_+$DAYv!XVH81HGF8<JAJcrHV\\6 \rWK-&DJIy\"_AX07Z\u0004J0!]HO ";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "_+$DAYv!XVH81HGF8<JAJcrCK\u000e:3@A\\8";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    break Label_0882;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public QrCodeView(final Context context) {
        this(context, null);
    }
    
    public QrCodeView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public QrCodeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = (Camera$AutoFocusCallback)new o(this);
        (this.b = this.getHolder()).addCallback((SurfaceHolder$Callback)this);
        this.b.setType(3);
    }
    
    static Camera a(final QrCodeView qrCodeView, final Camera c) {
        return qrCodeView.c = c;
    }
    
    static void a(final QrCodeView qrCodeView) {
        qrCodeView.d();
    }
    
    static SurfaceHolder b(final QrCodeView qrCodeView) {
        return qrCodeView.b;
    }
    
    static void c(final QrCodeView qrCodeView) {
        qrCodeView.e();
    }
    
    static Camera d(final QrCodeView qrCodeView) {
        return qrCodeView.c;
    }
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //     3: iconst_2       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    12: ifnull          34
        //    15: aload_0        
        //    16: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    19: invokevirtual   android/hardware/Camera.stopPreview:()V
        //    22: aload_0        
        //    23: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    26: invokevirtual   android/hardware/Camera.release:()V
        //    29: aload_0        
        //    30: aconst_null    
        //    31: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    34: return         
        //    35: astore_1       
        //    36: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //    39: iconst_0       
        //    40: aaload         
        //    41: aload_1        
        //    42: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    45: goto            22
        //    48: astore_2       
        //    49: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //    52: iconst_1       
        //    53: aaload         
        //    54: aload_2        
        //    55: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    58: goto            29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  15     22     35     48     Ljava/lang/Exception;
        //  22     29     48     61     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    private void e() {
        try {
            if (this.e != null) {
                this.e.a();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    static void e(final QrCodeView qrCodeView) {
        qrCodeView.f();
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/qrcode/QrCodeActivity.r:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //     8: ifnonnull       111
        //    11: aload_0        
        //    12: invokestatic    android/hardware/Camera.open:()Landroid/hardware/Camera;
        //    15: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    18: aload_0        
        //    19: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    22: ifnonnull       45
        //    25: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    28: istore          11
        //    30: iload           11
        //    32: bipush          9
        //    34: if_icmplt       45
        //    37: aload_0        
        //    38: iconst_0       
        //    39: invokestatic    android/hardware/Camera.open:(I)Landroid/hardware/Camera;
        //    42: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    49: new             Lcom/whatsapp/qrcode/f;
        //    52: dup            
        //    53: aload_0        
        //    54: invokespecial   com/whatsapp/qrcode/f.<init>:(Lcom/whatsapp/qrcode/QrCodeView;)V
        //    57: invokevirtual   android/hardware/Camera.setErrorCallback:(Landroid/hardware/Camera$ErrorCallback;)V
        //    60: return         
        //    61: astore          7
        //    63: aload           7
        //    65: athrow         
        //    66: astore          8
        //    68: aload           8
        //    70: athrow         
        //    71: astore          9
        //    73: aload_0        
        //    74: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    77: ifnull          87
        //    80: aload_0        
        //    81: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    84: invokevirtual   android/hardware/Camera.release:()V
        //    87: aload_0        
        //    88: aconst_null    
        //    89: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    92: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //    95: bipush          28
        //    97: aaload         
        //    98: aload           9
        //   100: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   103: aload_0        
        //   104: invokespecial   com/whatsapp/qrcode/QrCodeView.e:()V
        //   107: iload_1        
        //   108: ifeq            60
        //   111: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   114: istore          4
        //   116: iload           4
        //   118: bipush          8
        //   120: if_icmplt       164
        //   123: aload_0        
        //   124: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   127: invokevirtual   android/hardware/Camera.reconnect:()V
        //   130: return         
        //   131: astore          6
        //   133: aload_0        
        //   134: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   137: invokevirtual   android/hardware/Camera.release:()V
        //   140: aload_0        
        //   141: aconst_null    
        //   142: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   145: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   148: bipush          29
        //   150: aaload         
        //   151: aload           6
        //   153: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   156: aload_0        
        //   157: invokespecial   com/whatsapp/qrcode/QrCodeView.e:()V
        //   160: iload_1        
        //   161: ifeq            60
        //   164: aload_0        
        //   165: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   168: invokevirtual   android/hardware/Camera.release:()V
        //   171: aload_0        
        //   172: aconst_null    
        //   173: putfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   176: aload_0        
        //   177: invokespecial   com/whatsapp/qrcode/QrCodeView.f:()V
        //   180: return         
        //   181: astore          5
        //   183: aload           5
        //   185: athrow         
        //   186: astore          10
        //   188: aload           10
        //   190: athrow         
        //   191: astore_3       
        //   192: aload_3        
        //   193: athrow         
        //   194: astore_2       
        //   195: aload_2        
        //   196: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     30     61     66     Ljava/lang/Exception;
        //  37     45     66     71     Ljava/lang/Exception;
        //  45     60     71     111    Ljava/lang/Exception;
        //  63     66     66     71     Ljava/lang/Exception;
        //  68     71     71     111    Ljava/lang/Exception;
        //  73     87     186    191    Ljava/lang/Exception;
        //  87     107    191    194    Ljava/lang/Exception;
        //  111    116    191    194    Ljava/lang/Exception;
        //  111    116    194    197    Ljava/lang/RuntimeException;
        //  123    130    131    164    Ljava/io/IOException;
        //  123    130    194    197    Ljava/lang/RuntimeException;
        //  133    160    181    186    Ljava/lang/Exception;
        //  164    180    181    186    Ljava/lang/Exception;
        //  192    194    194    197    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
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
    
    public Camera$Size a() {
        return this.d;
    }
    
    protected void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/qrcode/QrCodeActivity.r:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/qrcode/QrCodeView.getWidth:()I
        //     8: istore_2       
        //     9: aload_0        
        //    10: invokevirtual   com/whatsapp/qrcode/QrCodeView.getHeight:()I
        //    13: istore_3       
        //    14: aload_0        
        //    15: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    18: ifnonnull       40
        //    21: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //    24: bipush          10
        //    26: aaload         
        //    27: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    30: aload_0        
        //    31: invokespecial   com/whatsapp/qrcode/QrCodeView.e:()V
        //    34: return         
        //    35: astore          4
        //    37: aload           4
        //    39: athrow         
        //    40: aload_0        
        //    41: invokevirtual   com/whatsapp/qrcode/QrCodeView.getContext:()Landroid/content/Context;
        //    44: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //    47: iconst_3       
        //    48: aaload         
        //    49: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    52: checkcast       Landroid/view/WindowManager;
        //    55: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    60: astore          5
        //    62: aload           5
        //    64: invokevirtual   android/view/Display.getOrientation:()I
        //    67: istore          6
        //    69: iload           6
        //    71: ifeq            80
        //    74: iload           6
        //    76: iconst_2       
        //    77: if_icmpne       845
        //    80: iconst_1       
        //    81: istore          7
        //    83: aload_0        
        //    84: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //    87: invokevirtual   android/hardware/Camera.getParameters:()Landroid/hardware/Camera$Parameters;
        //    90: astore          8
        //    92: aload           8
        //    94: invokevirtual   android/hardware/Camera$Parameters.getSupportedPreviewSizes:()Ljava/util/List;
        //    97: astore          9
        //    99: aload           9
        //   101: ifnonnull       1058
        //   104: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   107: bipush          21
        //   109: aaload         
        //   110: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   113: new             Ljava/util/ArrayList;
        //   116: dup            
        //   117: invokespecial   java/util/ArrayList.<init>:()V
        //   120: astore          44
        //   122: aload_0        
        //   123: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   126: astore          45
        //   128: aload           45
        //   130: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   133: pop            
        //   134: aload           44
        //   136: new             Landroid/hardware/Camera$Size;
        //   139: dup            
        //   140: aload           45
        //   142: sipush          640
        //   145: sipush          480
        //   148: invokespecial   android/hardware/Camera$Size.<init>:(Landroid/hardware/Camera;II)V
        //   151: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   156: pop            
        //   157: aload           44
        //   159: astore          10
        //   161: iload           7
        //   163: ifeq            851
        //   166: iload_3        
        //   167: istore          11
        //   169: iload           7
        //   171: ifeq            857
        //   174: aload_0        
        //   175: aload           10
        //   177: iload           11
        //   179: iload_2        
        //   180: invokestatic    com/whatsapp/camera/CameraView.a:(Ljava/util/List;II)Landroid/hardware/Camera$Size;
        //   183: putfield        com/whatsapp/qrcode/QrCodeView.d:Landroid/hardware/Camera$Size;
        //   186: new             Ljava/lang/StringBuilder;
        //   189: dup            
        //   190: invokespecial   java/lang/StringBuilder.<init>:()V
        //   193: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   196: bipush          27
        //   198: aaload         
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: aload_0        
        //   203: getfield        com/whatsapp/qrcode/QrCodeView.d:Landroid/hardware/Camera$Size;
        //   206: getfield        android/hardware/Camera$Size.width:I
        //   209: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   212: ldc_w           "x"
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: aload_0        
        //   219: getfield        com/whatsapp/qrcode/QrCodeView.d:Landroid/hardware/Camera$Size;
        //   222: getfield        android/hardware/Camera$Size.height:I
        //   225: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   228: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   231: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   234: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   237: istore          12
        //   239: iconst_0       
        //   240: istore          13
        //   242: iload           12
        //   244: bipush          9
        //   246: if_icmplt       291
        //   249: new             Landroid/hardware/Camera$CameraInfo;
        //   252: dup            
        //   253: invokespecial   android/hardware/Camera$CameraInfo.<init>:()V
        //   256: astore          14
        //   258: iconst_0       
        //   259: aload           14
        //   261: invokestatic    android/hardware/Camera.getCameraInfo:(ILandroid/hardware/Camera$CameraInfo;)V
        //   264: aload           14
        //   266: getfield        android/hardware/Camera$CameraInfo.facing:I
        //   269: istore          16
        //   271: iload           16
        //   273: iconst_1       
        //   274: if_icmpne       867
        //   277: iconst_1       
        //   278: istore          13
        //   280: aload           14
        //   282: getfield        android/hardware/Camera$CameraInfo.orientation:I
        //   285: istore          17
        //   287: iload_1        
        //   288: ifeq            1047
        //   291: iload           6
        //   293: ifeq            302
        //   296: iload           6
        //   298: iconst_2       
        //   299: if_icmpne       320
        //   302: aload           5
        //   304: invokevirtual   android/view/Display.getWidth:()I
        //   307: istore          42
        //   309: aload           5
        //   311: invokevirtual   android/view/Display.getHeight:()I
        //   314: istore          43
        //   316: iload_1        
        //   317: ifeq            334
        //   320: aload           5
        //   322: invokevirtual   android/view/Display.getHeight:()I
        //   325: istore          42
        //   327: aload           5
        //   329: invokevirtual   android/view/Display.getWidth:()I
        //   332: istore          43
        //   334: iload           42
        //   336: iload           43
        //   338: if_icmple       348
        //   341: iconst_0       
        //   342: istore          17
        //   344: iload_1        
        //   345: ifeq            1047
        //   348: bipush          90
        //   350: istore          18
        //   352: iload           13
        //   354: istore          19
        //   356: iconst_0       
        //   357: istore          20
        //   359: iload           6
        //   361: tableswitch {
        //                0: 873
        //                1: 880
        //                2: 888
        //                3: 897
        //          default: 392
        //        }
        //   392: iload           20
        //   394: istore          21
        //   396: iload           19
        //   398: ifeq            424
        //   401: sipush          360
        //   404: iload           18
        //   406: iload           21
        //   408: iadd           
        //   409: sipush          360
        //   412: irem           
        //   413: isub           
        //   414: sipush          360
        //   417: irem           
        //   418: istore          22
        //   420: iload_1        
        //   421: ifeq            439
        //   424: sipush          360
        //   427: iload           18
        //   429: iload           21
        //   431: isub           
        //   432: iadd           
        //   433: sipush          360
        //   436: irem           
        //   437: istore          22
        //   439: new             Ljava/lang/StringBuilder;
        //   442: dup            
        //   443: invokespecial   java/lang/StringBuilder.<init>:()V
        //   446: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   449: bipush          14
        //   451: aaload         
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: iload           21
        //   457: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   460: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   463: bipush          24
        //   465: aaload         
        //   466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   469: iload           18
        //   471: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   474: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   477: bipush          12
        //   479: aaload         
        //   480: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   483: iload           22
        //   485: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   488: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   491: iconst_4       
        //   492: aaload         
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: iload           19
        //   498: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   501: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   504: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   507: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   510: bipush          8
        //   512: if_icmplt       940
        //   515: aload_0        
        //   516: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   519: iload           22
        //   521: invokevirtual   android/hardware/Camera.setDisplayOrientation:(I)V
        //   524: aload           8
        //   526: aload_0        
        //   527: getfield        com/whatsapp/qrcode/QrCodeView.d:Landroid/hardware/Camera$Size;
        //   530: getfield        android/hardware/Camera$Size.width:I
        //   533: aload_0        
        //   534: getfield        com/whatsapp/qrcode/QrCodeView.d:Landroid/hardware/Camera$Size;
        //   537: getfield        android/hardware/Camera$Size.height:I
        //   540: invokevirtual   android/hardware/Camera$Parameters.setPreviewSize:(II)V
        //   543: aload           8
        //   545: invokevirtual   android/hardware/Camera$Parameters.getSupportedFocusModes:()Ljava/util/List;
        //   548: astore          26
        //   550: aload           26
        //   552: ifnull          695
        //   555: new             Ljava/lang/StringBuilder;
        //   558: dup            
        //   559: invokespecial   java/lang/StringBuilder.<init>:()V
        //   562: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   565: bipush          17
        //   567: aaload         
        //   568: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   571: aload           26
        //   573: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //   578: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   581: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   584: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   587: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   590: aload           26
        //   592: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   595: bipush          11
        //   597: aaload         
        //   598: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   603: istore          37
        //   605: iload           37
        //   607: ifeq            625
        //   610: aload           8
        //   612: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   615: bipush          23
        //   617: aaload         
        //   618: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //   621: iload_1        
        //   622: ifeq            704
        //   625: aload           26
        //   627: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   630: bipush          16
        //   632: aaload         
        //   633: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   638: istore          38
        //   640: iload           38
        //   642: ifeq            660
        //   645: aload           8
        //   647: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   650: bipush          25
        //   652: aaload         
        //   653: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //   656: iload_1        
        //   657: ifeq            704
        //   660: aload           26
        //   662: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   665: bipush          26
        //   667: aaload         
        //   668: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   673: istore          39
        //   675: iload           39
        //   677: ifeq            704
        //   680: aload           8
        //   682: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   685: bipush          18
        //   687: aaload         
        //   688: invokevirtual   android/hardware/Camera$Parameters.setFocusMode:(Ljava/lang/String;)V
        //   691: iload_1        
        //   692: ifeq            704
        //   695: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   698: bipush          19
        //   700: aaload         
        //   701: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   704: aload           8
        //   706: invokevirtual   android/hardware/Camera$Parameters.getSupportedFlashModes:()Ljava/util/List;
        //   709: astore          28
        //   711: aload           28
        //   713: ifnull          755
        //   716: new             Ljava/lang/StringBuilder;
        //   719: dup            
        //   720: invokespecial   java/lang/StringBuilder.<init>:()V
        //   723: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   726: bipush          6
        //   728: aaload         
        //   729: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   732: aload           28
        //   734: invokeinterface java/util/List.toArray:()[Ljava/lang/Object;
        //   739: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   742: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   745: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   748: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   751: iload_1        
        //   752: ifeq            764
        //   755: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   758: bipush          9
        //   760: aaload         
        //   761: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   764: aload           28
        //   766: ifnull          796
        //   769: aload           28
        //   771: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   774: bipush          20
        //   776: aaload         
        //   777: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   782: ifeq            796
        //   785: aload           8
        //   787: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   790: bipush          7
        //   792: aaload         
        //   793: invokevirtual   android/hardware/Camera$Parameters.setFlashMode:(Ljava/lang/String;)V
        //   796: aload_0        
        //   797: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   800: aload           8
        //   802: invokevirtual   android/hardware/Camera.setParameters:(Landroid/hardware/Camera$Parameters;)V
        //   805: aload_0        
        //   806: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   809: invokevirtual   android/hardware/Camera.startPreview:()V
        //   812: aload_0        
        //   813: getfield        com/whatsapp/qrcode/QrCodeView.c:Landroid/hardware/Camera;
        //   816: aload_0        
        //   817: getfield        com/whatsapp/qrcode/QrCodeView.a:Landroid/hardware/Camera$AutoFocusCallback;
        //   820: invokevirtual   android/hardware/Camera.autoFocus:(Landroid/hardware/Camera$AutoFocusCallback;)V
        //   823: aload_0        
        //   824: getfield        com/whatsapp/qrcode/QrCodeView.e:Lcom/whatsapp/qrcode/j;
        //   827: ifnull          34
        //   830: aload_0        
        //   831: getfield        com/whatsapp/qrcode/QrCodeView.e:Lcom/whatsapp/qrcode/j;
        //   834: invokeinterface com/whatsapp/qrcode/j.b:()V
        //   839: return         
        //   840: astore          30
        //   842: aload           30
        //   844: athrow         
        //   845: iconst_0       
        //   846: istore          7
        //   848: goto            83
        //   851: iload_2        
        //   852: istore          11
        //   854: goto            169
        //   857: iload_3        
        //   858: istore_2       
        //   859: goto            174
        //   862: astore          15
        //   864: aload           15
        //   866: athrow         
        //   867: iconst_0       
        //   868: istore          13
        //   870: goto            280
        //   873: iconst_0       
        //   874: istore          20
        //   876: iload_1        
        //   877: ifeq            392
        //   880: bipush          90
        //   882: istore          20
        //   884: iload_1        
        //   885: ifeq            392
        //   888: sipush          180
        //   891: istore          20
        //   893: iload_1        
        //   894: ifeq            392
        //   897: sipush          270
        //   900: istore          21
        //   902: goto            396
        //   905: astore          40
        //   907: new             Ljava/lang/StringBuilder;
        //   910: dup            
        //   911: invokespecial   java/lang/StringBuilder.<init>:()V
        //   914: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   917: iconst_5       
        //   918: aaload         
        //   919: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   922: aload           40
        //   924: invokevirtual   java/lang/RuntimeException.toString:()Ljava/lang/String;
        //   927: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   930: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   933: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   936: iload_1        
        //   937: ifeq            524
        //   940: aload           8
        //   942: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   945: bipush          13
        //   947: aaload         
        //   948: iload           22
        //   950: invokevirtual   android/hardware/Camera$Parameters.set:(Ljava/lang/String;I)V
        //   953: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   956: bipush          15
        //   958: aaload         
        //   959: astore          24
        //   961: iload           7
        //   963: ifeq            996
        //   966: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   969: bipush          22
        //   971: aaload         
        //   972: astore          25
        //   974: aload           8
        //   976: aload           24
        //   978: aload           25
        //   980: invokevirtual   android/hardware/Camera$Parameters.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   983: goto            524
        //   986: astore          41
        //   988: aload           41
        //   990: athrow         
        //   991: astore          23
        //   993: aload           23
        //   995: athrow         
        //   996: getstatic       com/whatsapp/qrcode/QrCodeView.z:[Ljava/lang/String;
        //   999: bipush          8
        //  1001: aaload         
        //  1002: astore          25
        //  1004: goto            974
        //  1007: astore          32
        //  1009: aload           32
        //  1011: athrow         
        //  1012: astore          33
        //  1014: aload           33
        //  1016: athrow         
        //  1017: astore          34
        //  1019: aload           34
        //  1021: athrow         
        //  1022: astore          35
        //  1024: aload           35
        //  1026: athrow         
        //  1027: astore          36
        //  1029: aload           36
        //  1031: athrow         
        //  1032: astore          27
        //  1034: aload           27
        //  1036: athrow         
        //  1037: astore          29
        //  1039: aload           29
        //  1041: athrow         
        //  1042: astore          31
        //  1044: aload           31
        //  1046: athrow         
        //  1047: iload           17
        //  1049: istore          18
        //  1051: iload           13
        //  1053: istore          19
        //  1055: goto            356
        //  1058: aload           9
        //  1060: astore          10
        //  1062: goto            161
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  14     34     35     40     Ljava/lang/RuntimeException;
        //  258    271    862    867    Ljava/lang/RuntimeException;
        //  515    524    905    991    Ljava/lang/RuntimeException;
        //  555    605    1007   1012   Ljava/lang/RuntimeException;
        //  610    621    1012   1017   Ljava/lang/RuntimeException;
        //  625    640    1017   1022   Ljava/lang/RuntimeException;
        //  645    656    1022   1027   Ljava/lang/RuntimeException;
        //  660    675    1027   1032   Ljava/lang/RuntimeException;
        //  680    691    1032   1037   Ljava/lang/RuntimeException;
        //  695    704    1032   1037   Ljava/lang/RuntimeException;
        //  716    751    1037   1042   Ljava/lang/RuntimeException;
        //  755    764    1037   1042   Ljava/lang/RuntimeException;
        //  769    796    1042   1047   Ljava/lang/RuntimeException;
        //  796    839    840    845    Ljava/lang/RuntimeException;
        //  907    936    986    991    Ljava/lang/RuntimeException;
        //  940    961    991    996    Ljava/lang/RuntimeException;
        //  966    974    991    996    Ljava/lang/RuntimeException;
        //  988    991    991    996    Ljava/lang/RuntimeException;
        //  1009   1012   1012   1017   Ljava/lang/RuntimeException;
        //  1014   1017   1017   1022   Ljava/lang/RuntimeException;
        //  1019   1022   1022   1027   Ljava/lang/RuntimeException;
        //  1024   1027   1027   1032   Ljava/lang/RuntimeException;
        //  1029   1032   1032   1037   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 469, Size: 469
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
    
    public Camera c() {
        return this.c;
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public void setCameraCallback(final j e) {
        this.e = e;
    }
    
    public void surfaceChanged(final SurfaceHolder previewDisplay, final int n, final int n2, final int n3) {
        try {
            if (this.c == null) {
                Log.e(QrCodeView.z[33]);
                this.e();
                return;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (this.b.getSurface() == null) {
                Log.e(QrCodeView.z[31]);
                this.e();
                return;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        try {
            try {
                if (!previewDisplay.isCreating()) {
                    this.c.stopPreview();
                }
                try {
                    this.c.setPreviewDisplay(previewDisplay);
                    this.b();
                }
                catch (RuntimeException ex3) {
                    this.c.release();
                    this.c = null;
                    Log.b(QrCodeView.z[30], ex3);
                    this.e();
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        catch (IOException ex5) {
            this.c.release();
            this.c = null;
            Log.b(QrCodeView.z[32], ex5);
            this.e();
        }
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.f();
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.d();
    }
}
