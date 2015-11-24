// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import com.whatsapp.App;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.graphics.RectF;
import android.view.View;
import android.net.Uri;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import android.app.Activity;

public class CropImage extends Activity
{
    private static final String[] z;
    private boolean a;
    boolean b;
    private boolean c;
    private boolean d;
    private Bitmap$CompressFormat e;
    protected boolean f;
    public boolean g;
    private int h;
    private Bitmap i;
    private int j;
    private CropImageView k;
    private Matrix l;
    private int m;
    private int n;
    private int o;
    private Rect p;
    private int q;
    private int r;
    private Uri s;
    protected g t;
    private Matrix u;
    private int v;
    private int w;
    private boolean x;
    
    static {
        final String[] z2 = new String[62];
        String s = "pe0cc|y;v?ge0j";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'L';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|b+c9gO";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "pe0c%~v8vc|x2";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "|b+c9gN";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "}xr`<rt:";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "pe0cc|y<a)rc:<)}s";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "pe0c%~v8v";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "zy6g%r{\rv/g";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "ve-|>>x0~";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "]x\u007f`<rt:";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "~~1P>|g";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "u{6c\u001a";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "`t>\u007f)";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "p~-p vT-|<";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "ax+r8zx1";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "ve-|>>x0~";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "pe0cc|y<a)rc:";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "`t>\u007f)Fg\u0016u\u0002vr;v(";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "}x+>->~2r+v";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "~v'U%\u007fr\fz6v";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "pe0c\u000ejX*g<fc\fz6v";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "wv+r";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "|b+c9g";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "pe0c%~v8vcq~+~-cD+a)rz\u007fz?3y*\u007f ";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "zxrv>ax-";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "u{>g8vy\r|8rc6|\"";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "pe0c%~v8vc}x+>->~2r+v";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "|b+c9gQ0a!rc";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "pe0c%~v8vc}x+>->~2r+v";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "pe0c%~v8vc~v4v(vq>f g80|!";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "rd/v/gN";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "}x+>->~2r+v";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "~v'P>|g";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "u{6c\u0004";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "rd/v/gO";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "zxrv>ax-";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "}xr`<rt:";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "pe0c%~v8vcpv1}#g7,r:v-\u007f";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "ar<g";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "zxrv>ax-";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "ar<g";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "]x\u007f`<rt:";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "pe0c%~v8vc}x,c-pr";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "}xr`<rt:";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\\e6v\"gv+z#}";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "pe0c%~v8vcvo6ucpv1}#g7,r:v-\u007f";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "zy3z\"v:;r8r";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "pe0c%~v8vc|x2)l";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "ar+f>}:;r8r";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "wv+r";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "pe0c%~v8vcpv1}#gH-v?rz/\u007f))7";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "pe0c%~v8vcpv1}#gH-v?rz/\u007f))7";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "pe0c%~v8vcpv1}#g7<\u007f#`r\u007fw9a~1tlar,r!c{:)l";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "pe0c%~v8vc|x2)l";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "wv+r";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    break Label_1582;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public CropImage() {
        this.e = Bitmap$CompressFormat.JPEG;
        this.s = null;
        this.c = false;
        this.a = true;
        this.j = 1;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/wallpaper/CropImage.t:Lcom/whatsapp/wallpaper/g;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnonnull       17
        //    13: return         
        //    14: astore_2       
        //    15: aload_2        
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/wallpaper/CropImage.g:Z
        //    21: istore          5
        //    23: iload           5
        //    25: ifne            13
        //    28: aload_0        
        //    29: iconst_1       
        //    30: putfield        com/whatsapp/wallpaper/CropImage.g:Z
        //    33: new             Landroid/graphics/Paint;
        //    36: dup            
        //    37: invokespecial   android/graphics/Paint.<init>:()V
        //    40: astore          6
        //    42: aload           6
        //    44: iconst_1       
        //    45: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //    48: aload           6
        //    50: iconst_1       
        //    51: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //    54: aload           6
        //    56: iconst_1       
        //    57: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //    60: aload_0        
        //    61: getfield        com/whatsapp/wallpaper/CropImage.t:Lcom/whatsapp/wallpaper/g;
        //    64: invokevirtual   com/whatsapp/wallpaper/g.e:()Landroid/graphics/Rect;
        //    67: astore          7
        //    69: aload_0        
        //    70: getfield        com/whatsapp/wallpaper/CropImage.v:I
        //    73: ifeq            1131
        //    76: aload_0        
        //    77: getfield        com/whatsapp/wallpaper/CropImage.h:I
        //    80: istore          86
        //    82: iload           86
        //    84: ifeq            1131
        //    87: aload_0        
        //    88: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //    91: istore          87
        //    93: iload           87
        //    95: iconst_1       
        //    96: if_icmple       159
        //    99: aload           7
        //   101: aload           7
        //   103: getfield        android/graphics/Rect.left:I
        //   106: aload_0        
        //   107: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   110: imul           
        //   111: putfield        android/graphics/Rect.left:I
        //   114: aload           7
        //   116: aload           7
        //   118: getfield        android/graphics/Rect.right:I
        //   121: aload_0        
        //   122: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   125: imul           
        //   126: putfield        android/graphics/Rect.right:I
        //   129: aload           7
        //   131: aload           7
        //   133: getfield        android/graphics/Rect.top:I
        //   136: aload_0        
        //   137: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   140: imul           
        //   141: putfield        android/graphics/Rect.top:I
        //   144: aload           7
        //   146: aload           7
        //   148: getfield        android/graphics/Rect.bottom:I
        //   151: aload_0        
        //   152: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   155: imul           
        //   156: putfield        android/graphics/Rect.bottom:I
        //   159: aload_0        
        //   160: getfield        com/whatsapp/wallpaper/CropImage.v:I
        //   163: istore          88
        //   165: aload_0        
        //   166: getfield        com/whatsapp/wallpaper/CropImage.h:I
        //   169: istore          89
        //   171: aload_0        
        //   172: getfield        com/whatsapp/wallpaper/CropImage.a:Z
        //   175: ifne            212
        //   178: aload           7
        //   180: invokevirtual   android/graphics/Rect.width:()I
        //   183: istore          124
        //   185: aload_0        
        //   186: getfield        com/whatsapp/wallpaper/CropImage.v:I
        //   189: istore          125
        //   191: iload           124
        //   193: iload           125
        //   195: if_icmpge       212
        //   198: aload           7
        //   200: invokevirtual   android/graphics/Rect.width:()I
        //   203: istore          88
        //   205: aload           7
        //   207: invokevirtual   android/graphics/Rect.height:()I
        //   210: istore          89
        //   212: aload_0        
        //   213: getfield        com/whatsapp/wallpaper/CropImage.f:Z
        //   216: ifne            443
        //   219: iconst_1       
        //   220: istore          104
        //   222: aload           7
        //   224: invokevirtual   android/graphics/Rect.width:()I
        //   227: iconst_2       
        //   228: idiv           
        //   229: aload_0        
        //   230: getfield        com/whatsapp/wallpaper/CropImage.v:I
        //   233: if_icmpgt       250
        //   236: aload           7
        //   238: invokevirtual   android/graphics/Rect.height:()I
        //   241: iconst_2       
        //   242: idiv           
        //   243: aload_0        
        //   244: getfield        com/whatsapp/wallpaper/CropImage.h:I
        //   247: if_icmple       308
        //   250: iload           104
        //   252: iconst_2       
        //   253: imul           
        //   254: istore          104
        //   256: aload           7
        //   258: aload           7
        //   260: getfield        android/graphics/Rect.left:I
        //   263: iconst_2       
        //   264: idiv           
        //   265: putfield        android/graphics/Rect.left:I
        //   268: aload           7
        //   270: aload           7
        //   272: getfield        android/graphics/Rect.right:I
        //   275: iconst_2       
        //   276: idiv           
        //   277: putfield        android/graphics/Rect.right:I
        //   280: aload           7
        //   282: aload           7
        //   284: getfield        android/graphics/Rect.top:I
        //   287: iconst_2       
        //   288: idiv           
        //   289: putfield        android/graphics/Rect.top:I
        //   292: aload           7
        //   294: aload           7
        //   296: getfield        android/graphics/Rect.bottom:I
        //   299: iconst_2       
        //   300: idiv           
        //   301: putfield        android/graphics/Rect.bottom:I
        //   304: iload_1        
        //   305: ifeq            222
        //   308: iload           104
        //   310: istore          105
        //   312: aload_0        
        //   313: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   316: istore          107
        //   318: iload           107
        //   320: iconst_1       
        //   321: if_icmpgt       330
        //   324: iload           105
        //   326: iconst_1       
        //   327: if_icmple       443
        //   330: aload_0        
        //   331: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   334: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   337: iload           105
        //   339: istore          108
        //   341: iload           108
        //   343: aload_0        
        //   344: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //   347: iload           105
        //   349: invokestatic    java/lang/Math.max:(II)I
        //   352: if_icmpgt       443
        //   355: new             Landroid/graphics/BitmapFactory$Options;
        //   358: dup            
        //   359: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   362: astore          109
        //   364: aload           109
        //   366: iload           108
        //   368: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   371: aload           109
        //   373: iconst_1       
        //   374: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   377: aload           109
        //   379: iconst_0       
        //   380: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   383: aload           109
        //   385: iconst_0       
        //   386: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //   389: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   392: bipush          10
        //   394: if_icmplt       403
        //   397: aload           109
        //   399: iconst_1       
        //   400: putfield        android/graphics/BitmapFactory$Options.inPreferQualityOverSpeed:Z
        //   403: aconst_null    
        //   404: astore          111
        //   406: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   409: aload_0        
        //   410: invokevirtual   com/whatsapp/wallpaper/CropImage.getIntent:()Landroid/content/Intent;
        //   413: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   416: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   419: astore          111
        //   421: aload_0        
        //   422: aload           111
        //   424: aconst_null    
        //   425: aload           109
        //   427: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   430: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   433: aload           111
        //   435: ifnull          443
        //   438: aload           111
        //   440: invokevirtual   java/io/InputStream.close:()V
        //   443: aload_0        
        //   444: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   447: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   450: astore          91
        //   452: aload           91
        //   454: ifnonnull       462
        //   457: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   460: astore          91
        //   462: iload           88
        //   464: iload           89
        //   466: aload           91
        //   468: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   471: astore          20
        //   473: new             Landroid/graphics/Canvas;
        //   476: dup            
        //   477: aload           20
        //   479: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   482: astore          92
        //   484: new             Landroid/graphics/RectF;
        //   487: dup            
        //   488: fconst_0       
        //   489: fconst_0       
        //   490: iload           88
        //   492: i2f            
        //   493: iload           89
        //   495: i2f            
        //   496: invokespecial   android/graphics/RectF.<init>:(FFFF)V
        //   499: astore          93
        //   501: aload_0        
        //   502: getfield        com/whatsapp/wallpaper/CropImage.x:Z
        //   505: ifne            580
        //   508: aload           7
        //   510: invokevirtual   android/graphics/Rect.width:()I
        //   513: i2f            
        //   514: aload           93
        //   516: invokevirtual   android/graphics/RectF.width:()F
        //   519: fsub           
        //   520: f2i            
        //   521: iconst_2       
        //   522: idiv           
        //   523: istore          101
        //   525: aload           7
        //   527: invokevirtual   android/graphics/Rect.height:()I
        //   530: i2f            
        //   531: aload           93
        //   533: invokevirtual   android/graphics/RectF.height:()F
        //   536: fsub           
        //   537: f2i            
        //   538: iconst_2       
        //   539: idiv           
        //   540: istore          102
        //   542: aload           7
        //   544: iconst_0       
        //   545: iload           101
        //   547: invokestatic    java/lang/Math.max:(II)I
        //   550: iconst_0       
        //   551: iload           102
        //   553: invokestatic    java/lang/Math.max:(II)I
        //   556: invokevirtual   android/graphics/Rect.inset:(II)V
        //   559: aload           93
        //   561: iconst_0       
        //   562: iload           101
        //   564: ineg           
        //   565: invokestatic    java/lang/Math.max:(II)I
        //   568: i2f            
        //   569: iconst_0       
        //   570: iload           102
        //   572: ineg           
        //   573: invokestatic    java/lang/Math.max:(II)I
        //   576: i2f            
        //   577: invokevirtual   android/graphics/RectF.inset:(FF)V
        //   580: aload_0        
        //   581: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //   584: ifnull          698
        //   587: aload_0        
        //   588: getfield        com/whatsapp/wallpaper/CropImage.d:Z
        //   591: istore          95
        //   593: iload           95
        //   595: ifeq            698
        //   598: new             Landroid/graphics/Matrix;
        //   601: dup            
        //   602: invokespecial   android/graphics/Matrix.<init>:()V
        //   605: astore          96
        //   607: aload           96
        //   609: aload           93
        //   611: getfield        android/graphics/RectF.left:F
        //   614: aload           93
        //   616: getfield        android/graphics/RectF.right:F
        //   619: fadd           
        //   620: fneg           
        //   621: fconst_2       
        //   622: fdiv           
        //   623: aload           93
        //   625: getfield        android/graphics/RectF.top:F
        //   628: aload           93
        //   630: getfield        android/graphics/RectF.bottom:F
        //   633: fadd           
        //   634: fneg           
        //   635: fconst_2       
        //   636: fdiv           
        //   637: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //   640: pop            
        //   641: aload           96
        //   643: aload_0        
        //   644: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //   647: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //   650: pop            
        //   651: aload           96
        //   653: aload           93
        //   655: getfield        android/graphics/RectF.left:F
        //   658: aload           93
        //   660: getfield        android/graphics/RectF.right:F
        //   663: fadd           
        //   664: fconst_2       
        //   665: fdiv           
        //   666: aload           93
        //   668: getfield        android/graphics/RectF.top:F
        //   671: aload           93
        //   673: getfield        android/graphics/RectF.bottom:F
        //   676: fadd           
        //   677: fconst_2       
        //   678: fdiv           
        //   679: invokevirtual   android/graphics/Matrix.postTranslate:(FF)Z
        //   682: pop            
        //   683: aload           96
        //   685: aload           93
        //   687: invokevirtual   android/graphics/Matrix.mapRect:(Landroid/graphics/RectF;)Z
        //   690: pop            
        //   691: aload           92
        //   693: aload           96
        //   695: invokevirtual   android/graphics/Canvas.setMatrix:(Landroid/graphics/Matrix;)V
        //   698: aload           92
        //   700: aload_0        
        //   701: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   704: aload           7
        //   706: aload           93
        //   708: aload           6
        //   710: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
        //   713: aload_0        
        //   714: getfield        com/whatsapp/wallpaper/CropImage.k:Lcom/whatsapp/wallpaper/CropImageView;
        //   717: invokevirtual   com/whatsapp/wallpaper/CropImageView.a:()V
        //   720: aload_0        
        //   721: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   724: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   727: aload_0        
        //   728: invokevirtual   com/whatsapp/wallpaper/CropImage.getIntent:()Landroid/content/Intent;
        //   731: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   734: astore          40
        //   736: aload           40
        //   738: ifnull          2302
        //   741: aload           40
        //   743: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   746: bipush          61
        //   748: aaload         
        //   749: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   752: ifnonnull       773
        //   755: aload           40
        //   757: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   760: bipush          52
        //   762: aaload         
        //   763: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   766: istore          43
        //   768: iload           43
        //   770: ifeq            2302
        //   773: new             Landroid/os/Bundle;
        //   776: dup            
        //   777: invokespecial   android/os/Bundle.<init>:()V
        //   780: astore          42
        //   782: aload           42
        //   784: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   787: bipush          56
        //   789: aaload         
        //   790: aload           20
        //   792: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //   795: aload_0        
        //   796: iconst_m1      
        //   797: new             Landroid/content/Intent;
        //   800: dup            
        //   801: invokespecial   android/content/Intent.<init>:()V
        //   804: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   807: bipush          47
        //   809: aaload         
        //   810: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   813: aload           42
        //   815: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //   818: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   821: aload_0        
        //   822: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   825: return         
        //   826: astore          4
        //   828: aload           4
        //   830: athrow         
        //   831: astore          8
        //   833: aload           8
        //   835: athrow         
        //   836: astore          9
        //   838: aload           9
        //   840: athrow         
        //   841: astore          10
        //   843: aload           10
        //   845: athrow         
        //   846: astore          90
        //   848: aload           90
        //   850: athrow         
        //   851: astore          106
        //   853: aload           106
        //   855: athrow         
        //   856: astore          110
        //   858: aload           110
        //   860: athrow         
        //   861: astore          123
        //   863: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   866: bipush          53
        //   868: aaload         
        //   869: aload           123
        //   871: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   874: goto            443
        //   877: astore          117
        //   879: new             Ljava/lang/StringBuilder;
        //   882: dup            
        //   883: invokespecial   java/lang/StringBuilder.<init>:()V
        //   886: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   889: bipush          49
        //   891: aaload         
        //   892: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   895: iload           108
        //   897: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   900: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   903: aload           117
        //   905: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   908: aload_0        
        //   909: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   912: ifnull          941
        //   915: aload_0        
        //   916: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   919: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   922: istore          122
        //   924: iload           122
        //   926: ifne            941
        //   929: aload_0        
        //   930: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   933: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   936: aload_0        
        //   937: aconst_null    
        //   938: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   941: aload           111
        //   943: ifnull          951
        //   946: aload           111
        //   948: invokevirtual   java/io/InputStream.close:()V
        //   951: aload           7
        //   953: aload           7
        //   955: getfield        android/graphics/Rect.left:I
        //   958: iconst_2       
        //   959: idiv           
        //   960: putfield        android/graphics/Rect.left:I
        //   963: aload           7
        //   965: aload           7
        //   967: getfield        android/graphics/Rect.right:I
        //   970: iconst_2       
        //   971: idiv           
        //   972: putfield        android/graphics/Rect.right:I
        //   975: aload           7
        //   977: aload           7
        //   979: getfield        android/graphics/Rect.top:I
        //   982: iconst_2       
        //   983: idiv           
        //   984: putfield        android/graphics/Rect.top:I
        //   987: aload           7
        //   989: aload           7
        //   991: getfield        android/graphics/Rect.bottom:I
        //   994: iconst_2       
        //   995: idiv           
        //   996: putfield        android/graphics/Rect.bottom:I
        //   999: iload           108
        //  1001: iconst_2       
        //  1002: imul           
        //  1003: istore          108
        //  1005: iload_1        
        //  1006: ifeq            341
        //  1009: goto            443
        //  1012: astore          118
        //  1014: aload           118
        //  1016: athrow         
        //  1017: astore          119
        //  1019: aload           119
        //  1021: athrow         
        //  1022: astore          114
        //  1024: aload           111
        //  1026: ifnull          1034
        //  1029: aload           111
        //  1031: invokevirtual   java/io/InputStream.close:()V
        //  1034: aload           114
        //  1036: athrow         
        //  1037: astore          121
        //  1039: aload           121
        //  1041: athrow         
        //  1042: astore          120
        //  1044: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1047: bipush          59
        //  1049: aaload         
        //  1050: aload           120
        //  1052: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1055: goto            951
        //  1058: astore          112
        //  1060: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1063: bipush          57
        //  1065: aaload         
        //  1066: aload           112
        //  1068: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1071: aload           111
        //  1073: ifnull          443
        //  1076: aload           111
        //  1078: invokevirtual   java/io/InputStream.close:()V
        //  1081: goto            443
        //  1084: astore          113
        //  1086: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1089: bipush          48
        //  1091: aaload         
        //  1092: aload           113
        //  1094: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1097: goto            443
        //  1100: astore          116
        //  1102: aload           116
        //  1104: athrow         
        //  1105: astore          115
        //  1107: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1110: bipush          50
        //  1112: aaload         
        //  1113: aload           115
        //  1115: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1118: goto            1034
        //  1121: astore          103
        //  1123: aload           103
        //  1125: athrow         
        //  1126: astore          94
        //  1128: aload           94
        //  1130: athrow         
        //  1131: aload_0        
        //  1132: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1135: iconst_1       
        //  1136: if_icmple       1199
        //  1139: aload           7
        //  1141: aload           7
        //  1143: getfield        android/graphics/Rect.left:I
        //  1146: aload_0        
        //  1147: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1150: imul           
        //  1151: putfield        android/graphics/Rect.left:I
        //  1154: aload           7
        //  1156: aload           7
        //  1158: getfield        android/graphics/Rect.right:I
        //  1161: aload_0        
        //  1162: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1165: imul           
        //  1166: putfield        android/graphics/Rect.right:I
        //  1169: aload           7
        //  1171: aload           7
        //  1173: getfield        android/graphics/Rect.top:I
        //  1176: aload_0        
        //  1177: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1180: imul           
        //  1181: putfield        android/graphics/Rect.top:I
        //  1184: aload           7
        //  1186: aload           7
        //  1188: getfield        android/graphics/Rect.bottom:I
        //  1191: aload_0        
        //  1192: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1195: imul           
        //  1196: putfield        android/graphics/Rect.bottom:I
        //  1199: iconst_1       
        //  1200: istore          12
        //  1202: aload_0        
        //  1203: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1206: ifeq            1303
        //  1209: aload           7
        //  1211: invokevirtual   android/graphics/Rect.width:()I
        //  1214: iconst_2       
        //  1215: idiv           
        //  1216: istore          14
        //  1218: aload_0        
        //  1219: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1222: istore          15
        //  1224: iload           14
        //  1226: iload           15
        //  1228: if_icmpgt       1245
        //  1231: aload           7
        //  1233: invokevirtual   android/graphics/Rect.height:()I
        //  1236: iconst_2       
        //  1237: idiv           
        //  1238: aload_0        
        //  1239: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1242: if_icmple       1303
        //  1245: iload           12
        //  1247: iconst_2       
        //  1248: imul           
        //  1249: istore          12
        //  1251: aload           7
        //  1253: aload           7
        //  1255: getfield        android/graphics/Rect.left:I
        //  1258: iconst_2       
        //  1259: idiv           
        //  1260: putfield        android/graphics/Rect.left:I
        //  1263: aload           7
        //  1265: aload           7
        //  1267: getfield        android/graphics/Rect.right:I
        //  1270: iconst_2       
        //  1271: idiv           
        //  1272: putfield        android/graphics/Rect.right:I
        //  1275: aload           7
        //  1277: aload           7
        //  1279: getfield        android/graphics/Rect.top:I
        //  1282: iconst_2       
        //  1283: idiv           
        //  1284: putfield        android/graphics/Rect.top:I
        //  1287: aload           7
        //  1289: aload           7
        //  1291: getfield        android/graphics/Rect.bottom:I
        //  1294: iconst_2       
        //  1295: idiv           
        //  1296: putfield        android/graphics/Rect.bottom:I
        //  1299: iload_1        
        //  1300: ifeq            1209
        //  1303: aload_0        
        //  1304: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1307: istore          17
        //  1309: iload           17
        //  1311: iconst_1       
        //  1312: if_icmpgt       1321
        //  1315: iload           12
        //  1317: iconst_1       
        //  1318: if_icmple       2331
        //  1321: aload_0        
        //  1322: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1325: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  1328: iload           12
        //  1330: istore          18
        //  1332: aload_0        
        //  1333: getfield        com/whatsapp/wallpaper/CropImage.j:I
        //  1336: iload           12
        //  1338: invokestatic    java/lang/Math.max:(II)I
        //  1341: istore          19
        //  1343: aconst_null    
        //  1344: astore          20
        //  1346: iload           18
        //  1348: iload           19
        //  1350: if_icmpgt       1596
        //  1353: new             Landroid/graphics/BitmapFactory$Options;
        //  1356: dup            
        //  1357: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //  1360: astore          21
        //  1362: aload           21
        //  1364: iload           18
        //  1366: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //  1369: aload           21
        //  1371: iconst_1       
        //  1372: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //  1375: aload           21
        //  1377: iconst_0       
        //  1378: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //  1381: aload           21
        //  1383: iconst_0       
        //  1384: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //  1387: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1390: bipush          10
        //  1392: if_icmplt       1401
        //  1395: aload           21
        //  1397: iconst_1       
        //  1398: putfield        android/graphics/BitmapFactory$Options.inPreferQualityOverSpeed:Z
        //  1401: aconst_null    
        //  1402: astore          23
        //  1404: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  1407: aload_0        
        //  1408: invokevirtual   com/whatsapp/wallpaper/CropImage.getIntent:()Landroid/content/Intent;
        //  1411: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1414: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //  1417: astore          23
        //  1419: aload_0        
        //  1420: aload           23
        //  1422: aconst_null    
        //  1423: aload           21
        //  1425: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //  1428: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1431: aload           7
        //  1433: invokevirtual   android/graphics/Rect.width:()I
        //  1436: istore          66
        //  1438: aload           7
        //  1440: invokevirtual   android/graphics/Rect.height:()I
        //  1443: istore          67
        //  1445: iload           67
        //  1447: istore          68
        //  1449: aload_0        
        //  1450: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1453: ifeq            2320
        //  1456: aload_0        
        //  1457: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1460: istore          82
        //  1462: iload           66
        //  1464: iload           82
        //  1466: if_icmpgt       1482
        //  1469: aload_0        
        //  1470: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1473: istore          85
        //  1475: iload           68
        //  1477: iload           85
        //  1479: if_icmple       2320
        //  1482: iload           66
        //  1484: iload           68
        //  1486: if_icmple       1511
        //  1489: iload           68
        //  1491: aload_0        
        //  1492: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1495: imul           
        //  1496: iload           66
        //  1498: idiv           
        //  1499: istore          68
        //  1501: aload_0        
        //  1502: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1505: istore          66
        //  1507: iload_1        
        //  1508: ifeq            2320
        //  1511: iload           66
        //  1513: aload_0        
        //  1514: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1517: imul           
        //  1518: iload           68
        //  1520: idiv           
        //  1521: istore          83
        //  1523: aload_0        
        //  1524: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1527: istore          84
        //  1529: iload           83
        //  1531: istore          72
        //  1533: iload           84
        //  1535: istore          73
        //  1537: aload_0        
        //  1538: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1541: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //  1544: astore          74
        //  1546: aload           74
        //  1548: astore          75
        //  1550: aload_0        
        //  1551: getfield        com/whatsapp/wallpaper/CropImage.c:Z
        //  1554: istore          78
        //  1556: iload           78
        //  1558: ifne            1566
        //  1561: aload           75
        //  1563: ifnonnull       1571
        //  1566: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //  1569: astore          75
        //  1571: iload           72
        //  1573: iload           73
        //  1575: aload           75
        //  1577: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //  1580: astore          79
        //  1582: aload           79
        //  1584: astore          20
        //  1586: aload           23
        //  1588: ifnull          1596
        //  1591: aload           23
        //  1593: invokevirtual   java/io/InputStream.close:()V
        //  1596: aload           7
        //  1598: invokevirtual   android/graphics/Rect.width:()I
        //  1601: istore          29
        //  1603: aload           7
        //  1605: invokevirtual   android/graphics/Rect.height:()I
        //  1608: istore          30
        //  1610: aload_0        
        //  1611: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1614: istore          34
        //  1616: iload           34
        //  1618: ifeq            2309
        //  1621: aload_0        
        //  1622: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1625: istore          54
        //  1627: iload           29
        //  1629: iload           54
        //  1631: if_icmpgt       1647
        //  1634: aload_0        
        //  1635: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1638: istore          57
        //  1640: iload           30
        //  1642: iload           57
        //  1644: if_icmple       2309
        //  1647: iload           29
        //  1649: iload           30
        //  1651: if_icmple       1676
        //  1654: iload           30
        //  1656: aload_0        
        //  1657: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1660: imul           
        //  1661: iload           29
        //  1663: idiv           
        //  1664: istore          30
        //  1666: aload_0        
        //  1667: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1670: istore          29
        //  1672: iload_1        
        //  1673: ifeq            2309
        //  1676: iload           29
        //  1678: aload_0        
        //  1679: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1682: imul           
        //  1683: iload           30
        //  1685: idiv           
        //  1686: istore          55
        //  1688: aload_0        
        //  1689: getfield        com/whatsapp/wallpaper/CropImage.n:I
        //  1692: istore          56
        //  1694: iload           55
        //  1696: istore          35
        //  1698: iload           56
        //  1700: istore          36
        //  1702: aload           20
        //  1704: ifnonnull       1748
        //  1707: aload_0        
        //  1708: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1711: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //  1714: astore          50
        //  1716: aload_0        
        //  1717: getfield        com/whatsapp/wallpaper/CropImage.c:Z
        //  1720: istore          53
        //  1722: iload           53
        //  1724: ifne            1732
        //  1727: aload           50
        //  1729: ifnonnull       1737
        //  1732: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //  1735: astore          50
        //  1737: iload           35
        //  1739: iload           36
        //  1741: aload           50
        //  1743: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //  1746: astore          20
        //  1748: new             Landroid/graphics/Canvas;
        //  1751: dup            
        //  1752: aload           20
        //  1754: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //  1757: astore          37
        //  1759: new             Landroid/graphics/Rect;
        //  1762: dup            
        //  1763: iconst_0       
        //  1764: iconst_0       
        //  1765: iload           35
        //  1767: iload           36
        //  1769: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //  1772: astore          38
        //  1774: aload_0        
        //  1775: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //  1778: ifnull          1903
        //  1781: aload_0        
        //  1782: getfield        com/whatsapp/wallpaper/CropImage.d:Z
        //  1785: istore          44
        //  1787: iload           44
        //  1789: ifeq            1903
        //  1792: new             Landroid/graphics/Matrix;
        //  1795: dup            
        //  1796: invokespecial   android/graphics/Matrix.<init>:()V
        //  1799: astore          45
        //  1801: aload           45
        //  1803: aload           38
        //  1805: getfield        android/graphics/Rect.left:I
        //  1808: aload           38
        //  1810: getfield        android/graphics/Rect.right:I
        //  1813: iadd           
        //  1814: ineg           
        //  1815: iconst_2       
        //  1816: idiv           
        //  1817: i2f            
        //  1818: aload           38
        //  1820: getfield        android/graphics/Rect.top:I
        //  1823: aload           38
        //  1825: getfield        android/graphics/Rect.bottom:I
        //  1828: iadd           
        //  1829: ineg           
        //  1830: iconst_2       
        //  1831: idiv           
        //  1832: i2f            
        //  1833: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //  1836: pop            
        //  1837: aload           45
        //  1839: aload_0        
        //  1840: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //  1843: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //  1846: pop            
        //  1847: aload           45
        //  1849: aload           38
        //  1851: getfield        android/graphics/Rect.left:I
        //  1854: aload           38
        //  1856: getfield        android/graphics/Rect.right:I
        //  1859: iadd           
        //  1860: iconst_2       
        //  1861: idiv           
        //  1862: i2f            
        //  1863: aload           38
        //  1865: getfield        android/graphics/Rect.top:I
        //  1868: aload           38
        //  1870: getfield        android/graphics/Rect.bottom:I
        //  1873: iadd           
        //  1874: iconst_2       
        //  1875: idiv           
        //  1876: i2f            
        //  1877: invokevirtual   android/graphics/Matrix.postTranslate:(FF)Z
        //  1880: pop            
        //  1881: aload           45
        //  1883: new             Landroid/graphics/RectF;
        //  1886: dup            
        //  1887: aload           38
        //  1889: invokespecial   android/graphics/RectF.<init>:(Landroid/graphics/Rect;)V
        //  1892: invokevirtual   android/graphics/Matrix.mapRect:(Landroid/graphics/RectF;)Z
        //  1895: pop            
        //  1896: aload           37
        //  1898: aload           45
        //  1900: invokevirtual   android/graphics/Canvas.setMatrix:(Landroid/graphics/Matrix;)V
        //  1903: aload           37
        //  1905: aload_0        
        //  1906: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1909: aload           7
        //  1911: aload           38
        //  1913: aload           6
        //  1915: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
        //  1918: goto            713
        //  1921: astore          11
        //  1923: aload           11
        //  1925: athrow         
        //  1926: astore          13
        //  1928: aload           13
        //  1930: athrow         
        //  1931: astore          16
        //  1933: aload           16
        //  1935: athrow         
        //  1936: astore          22
        //  1938: aload           22
        //  1940: athrow         
        //  1941: astore          69
        //  1943: aload           69
        //  1945: athrow         
        //  1946: astore          70
        //  1948: aload           70
        //  1950: athrow         
        //  1951: astore          71
        //  1953: aload           71
        //  1955: athrow         
        //  1956: astore          58
        //  1958: new             Ljava/lang/StringBuilder;
        //  1961: dup            
        //  1962: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1965: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1968: bipush          60
        //  1970: aaload         
        //  1971: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1974: iload           18
        //  1976: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1979: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1982: aload           58
        //  1984: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1987: aload_0        
        //  1988: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1991: ifnull          2020
        //  1994: aload_0        
        //  1995: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1998: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //  2001: istore          65
        //  2003: iload           65
        //  2005: ifne            2020
        //  2008: aload_0        
        //  2009: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  2012: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  2015: aload_0        
        //  2016: aconst_null    
        //  2017: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  2020: iconst_0       
        //  2021: ifeq            2039
        //  2024: aconst_null    
        //  2025: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //  2028: istore          64
        //  2030: iload           64
        //  2032: ifne            2039
        //  2035: aconst_null    
        //  2036: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  2039: aload           23
        //  2041: ifnull          2049
        //  2044: aload           23
        //  2046: invokevirtual   java/io/InputStream.close:()V
        //  2049: aload           7
        //  2051: aload           7
        //  2053: getfield        android/graphics/Rect.left:I
        //  2056: iconst_2       
        //  2057: idiv           
        //  2058: putfield        android/graphics/Rect.left:I
        //  2061: aload           7
        //  2063: aload           7
        //  2065: getfield        android/graphics/Rect.right:I
        //  2068: iconst_2       
        //  2069: idiv           
        //  2070: putfield        android/graphics/Rect.right:I
        //  2073: aload           7
        //  2075: aload           7
        //  2077: getfield        android/graphics/Rect.top:I
        //  2080: iconst_2       
        //  2081: idiv           
        //  2082: putfield        android/graphics/Rect.top:I
        //  2085: aload           7
        //  2087: aload           7
        //  2089: getfield        android/graphics/Rect.bottom:I
        //  2092: iconst_2       
        //  2093: idiv           
        //  2094: putfield        android/graphics/Rect.bottom:I
        //  2097: iload           18
        //  2099: iconst_2       
        //  2100: imul           
        //  2101: istore          18
        //  2103: iload_1        
        //  2104: ifeq            1332
        //  2107: aconst_null    
        //  2108: astore          20
        //  2110: goto            1596
        //  2113: astore          76
        //  2115: aload           76
        //  2117: athrow         
        //  2118: astore          77
        //  2120: aload           77
        //  2122: athrow         
        //  2123: astore          27
        //  2125: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  2128: bipush          58
        //  2130: aaload         
        //  2131: aload           27
        //  2133: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2136: aconst_null    
        //  2137: astore          20
        //  2139: aload           23
        //  2141: ifnull          1596
        //  2144: aload           23
        //  2146: invokevirtual   java/io/InputStream.close:()V
        //  2149: aconst_null    
        //  2150: astore          20
        //  2152: goto            1596
        //  2155: astore          28
        //  2157: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  2160: bipush          51
        //  2162: aaload         
        //  2163: aload           28
        //  2165: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2168: aconst_null    
        //  2169: astore          20
        //  2171: goto            1596
        //  2174: astore          81
        //  2176: aload           81
        //  2178: athrow         
        //  2179: astore          80
        //  2181: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  2184: bipush          55
        //  2186: aaload         
        //  2187: aload           80
        //  2189: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2192: goto            1596
        //  2195: astore          59
        //  2197: aload           59
        //  2199: athrow         
        //  2200: astore          60
        //  2202: aload           60
        //  2204: athrow         
        //  2205: astore          24
        //  2207: aload           23
        //  2209: ifnull          2217
        //  2212: aload           23
        //  2214: invokevirtual   java/io/InputStream.close:()V
        //  2217: aload           24
        //  2219: athrow         
        //  2220: astore          63
        //  2222: aload           63
        //  2224: athrow         
        //  2225: astore          62
        //  2227: aload           62
        //  2229: athrow         
        //  2230: astore          61
        //  2232: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  2235: bipush          46
        //  2237: aaload         
        //  2238: aload           61
        //  2240: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2243: goto            2049
        //  2246: astore          26
        //  2248: aload           26
        //  2250: athrow         
        //  2251: astore          25
        //  2253: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  2256: bipush          54
        //  2258: aaload         
        //  2259: aload           25
        //  2261: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2264: goto            2217
        //  2267: astore          31
        //  2269: aload           31
        //  2271: athrow         
        //  2272: astore          32
        //  2274: aload           32
        //  2276: athrow         
        //  2277: astore          33
        //  2279: aload           33
        //  2281: athrow         
        //  2282: astore          51
        //  2284: aload           51
        //  2286: athrow         
        //  2287: astore          52
        //  2289: aload           52
        //  2291: athrow         
        //  2292: astore          39
        //  2294: aload           39
        //  2296: athrow         
        //  2297: astore          41
        //  2299: aload           41
        //  2301: athrow         
        //  2302: aload_0        
        //  2303: aload           20
        //  2305: invokespecial   com/whatsapp/wallpaper/CropImage.a:(Landroid/graphics/Bitmap;)V
        //  2308: return         
        //  2309: iload           29
        //  2311: istore          35
        //  2313: iload           30
        //  2315: istore          36
        //  2317: goto            1702
        //  2320: iload           66
        //  2322: istore          72
        //  2324: iload           68
        //  2326: istore          73
        //  2328: goto            1537
        //  2331: aconst_null    
        //  2332: astore          20
        //  2334: goto            1596
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  4      9      14     17     Ljava/io/IOException;
        //  17     23     826    831    Ljava/io/IOException;
        //  69     82     831    836    Ljava/io/IOException;
        //  87     93     836    841    Ljava/io/IOException;
        //  99     159    841    846    Ljava/io/IOException;
        //  171    191    846    851    Ljava/io/IOException;
        //  312    318    851    856    Ljava/io/IOException;
        //  364    403    856    861    Ljava/io/IOException;
        //  406    433    877    1058   Ljava/lang/OutOfMemoryError;
        //  406    433    1058   1100   Ljava/io/FileNotFoundException;
        //  406    433    1022   1121   Any
        //  438    443    861    877    Ljava/io/IOException;
        //  457    462    1121   1126   Ljava/io/IOException;
        //  580    593    1126   1131   Ljava/io/IOException;
        //  741    768    2297   2302   Ljava/io/IOException;
        //  833    836    836    841    Ljava/io/IOException;
        //  838    841    841    846    Ljava/io/IOException;
        //  879    924    1012   1017   Ljava/io/IOException;
        //  879    924    1022   1121   Any
        //  929    941    1017   1022   Ljava/io/IOException;
        //  929    941    1022   1121   Any
        //  946    951    1042   1058   Ljava/io/IOException;
        //  946    951    1037   1042   Ljava/lang/OutOfMemoryError;
        //  1014   1017   1017   1022   Ljava/io/IOException;
        //  1014   1017   1022   1121   Any
        //  1019   1022   1022   1121   Any
        //  1029   1034   1105   1121   Ljava/io/IOException;
        //  1029   1034   1100   1105   Ljava/lang/OutOfMemoryError;
        //  1060   1071   1022   1121   Any
        //  1076   1081   1084   1100   Ljava/io/IOException;
        //  1131   1199   1921   1926   Ljava/io/IOException;
        //  1202   1209   1926   1931   Ljava/io/IOException;
        //  1209   1224   1926   1931   Ljava/io/IOException;
        //  1303   1309   1931   1936   Ljava/io/IOException;
        //  1362   1401   1936   1941   Ljava/io/IOException;
        //  1404   1445   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1404   1445   2123   2174   Ljava/io/FileNotFoundException;
        //  1404   1445   2205   2267   Any
        //  1449   1462   1941   1946   Ljava/io/IOException;
        //  1449   1462   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1449   1462   2123   2174   Ljava/io/FileNotFoundException;
        //  1449   1462   2205   2267   Any
        //  1469   1475   1946   1956   Ljava/io/IOException;
        //  1469   1475   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1469   1475   2123   2174   Ljava/io/FileNotFoundException;
        //  1469   1475   2205   2267   Any
        //  1489   1507   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1489   1507   2123   2174   Ljava/io/FileNotFoundException;
        //  1489   1507   2205   2267   Any
        //  1511   1529   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1511   1529   2123   2174   Ljava/io/FileNotFoundException;
        //  1511   1529   2205   2267   Any
        //  1537   1546   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1537   1546   2123   2174   Ljava/io/FileNotFoundException;
        //  1537   1546   2205   2267   Any
        //  1550   1556   2113   2118   Ljava/io/IOException;
        //  1550   1556   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1550   1556   2123   2174   Ljava/io/FileNotFoundException;
        //  1550   1556   2205   2267   Any
        //  1566   1571   2118   2123   Ljava/io/IOException;
        //  1566   1571   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1566   1571   2123   2174   Ljava/io/FileNotFoundException;
        //  1566   1571   2205   2267   Any
        //  1571   1582   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1571   1582   2123   2174   Ljava/io/FileNotFoundException;
        //  1571   1582   2205   2267   Any
        //  1591   1596   2179   2195   Ljava/io/IOException;
        //  1591   1596   2174   2179   Ljava/lang/OutOfMemoryError;
        //  1610   1616   2267   2272   Ljava/io/IOException;
        //  1621   1627   2272   2277   Ljava/io/IOException;
        //  1634   1640   2277   2282   Ljava/io/IOException;
        //  1716   1722   2282   2287   Ljava/io/IOException;
        //  1732   1737   2287   2292   Ljava/io/IOException;
        //  1774   1787   2292   2297   Ljava/io/IOException;
        //  1943   1946   1946   1956   Ljava/io/IOException;
        //  1943   1946   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1943   1946   2123   2174   Ljava/io/FileNotFoundException;
        //  1943   1946   2205   2267   Any
        //  1948   1951   1951   1956   Ljava/io/IOException;
        //  1948   1951   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1948   1951   2123   2174   Ljava/io/FileNotFoundException;
        //  1948   1951   2205   2267   Any
        //  1953   1956   1956   2246   Ljava/lang/OutOfMemoryError;
        //  1953   1956   2123   2174   Ljava/io/FileNotFoundException;
        //  1953   1956   2205   2267   Any
        //  1958   2003   2195   2200   Ljava/io/IOException;
        //  1958   2003   2205   2267   Any
        //  2008   2020   2200   2205   Ljava/io/IOException;
        //  2008   2020   2205   2267   Any
        //  2024   2030   2220   2225   Ljava/io/IOException;
        //  2024   2030   2205   2267   Any
        //  2035   2039   2205   2267   Any
        //  2044   2049   2230   2246   Ljava/io/IOException;
        //  2044   2049   2225   2230   Ljava/lang/OutOfMemoryError;
        //  2115   2118   2118   2123   Ljava/io/IOException;
        //  2115   2118   1956   2246   Ljava/lang/OutOfMemoryError;
        //  2115   2118   2123   2174   Ljava/io/FileNotFoundException;
        //  2115   2118   2205   2267   Any
        //  2120   2123   1956   2246   Ljava/lang/OutOfMemoryError;
        //  2120   2123   2123   2174   Ljava/io/FileNotFoundException;
        //  2120   2123   2205   2267   Any
        //  2125   2136   2205   2267   Any
        //  2144   2149   2155   2174   Ljava/io/IOException;
        //  2197   2200   2200   2205   Ljava/io/IOException;
        //  2197   2200   2205   2267   Any
        //  2202   2205   2205   2267   Any
        //  2212   2217   2251   2267   Ljava/io/IOException;
        //  2212   2217   2246   2251   Ljava/lang/OutOfMemoryError;
        //  2222   2225   2205   2267   Any
        //  2269   2272   2272   2277   Ljava/io/IOException;
        //  2274   2277   2277   2282   Ljava/io/IOException;
        //  2284   2287   2287   2292   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1142, Size: 1142
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    private void a(final Bitmap p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //     8: ifnull          322
        //    11: new             Ljava/io/File;
        //    14: dup            
        //    15: aload_0        
        //    16: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //    19: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    22: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    25: astore_3       
        //    26: bipush          75
        //    28: istore          4
        //    30: aconst_null    
        //    31: astore          5
        //    33: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    36: aload_0        
        //    37: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //    40: invokevirtual   android/content/ContentResolver.openOutputStream:(Landroid/net/Uri;)Ljava/io/OutputStream;
        //    43: astore          5
        //    45: aload           5
        //    47: ifnull          63
        //    50: aload_1        
        //    51: aload_0        
        //    52: getfield        com/whatsapp/wallpaper/CropImage.e:Landroid/graphics/Bitmap$CompressFormat;
        //    55: iload           4
        //    57: aload           5
        //    59: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //    62: pop            
        //    63: iinc            4, -10
        //    66: aload           5
        //    68: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    71: aload_0        
        //    72: getfield        com/whatsapp/wallpaper/CropImage.r:I
        //    75: istore          35
        //    77: iload           35
        //    79: ifeq            602
        //    82: iload           4
        //    84: ifle            602
        //    87: aload_3        
        //    88: invokevirtual   java/io/File.exists:()Z
        //    91: istore          36
        //    93: iload           36
        //    95: ifeq            602
        //    98: aload_3        
        //    99: invokevirtual   java/io/File.length:()J
        //   102: lstore          37
        //   104: aload_0        
        //   105: getfield        com/whatsapp/wallpaper/CropImage.r:I
        //   108: istore          39
        //   110: lload           37
        //   112: iload           39
        //   114: i2l            
        //   115: lcmp           
        //   116: ifgt            30
        //   119: iconst_0       
        //   120: istore          11
        //   122: aload_3        
        //   123: invokevirtual   java/io/File.length:()J
        //   126: lconst_0       
        //   127: lcmp           
        //   128: ifne            177
        //   131: invokestatic    com/whatsapp/App.C:()J
        //   134: lstore          28
        //   136: lload           28
        //   138: lconst_0       
        //   139: lcmp           
        //   140: ifne            177
        //   143: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   146: bipush          42
        //   148: aaload         
        //   149: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   152: aload_0        
        //   153: iconst_0       
        //   154: new             Landroid/content/Intent;
        //   157: dup            
        //   158: invokespecial   android/content/Intent.<init>:()V
        //   161: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   164: bipush          43
        //   166: aaload         
        //   167: iconst_1       
        //   168: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   171: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   174: iconst_1       
        //   175: istore          11
        //   177: iload           11
        //   179: ifne            252
        //   182: aload_0        
        //   183: getfield        com/whatsapp/wallpaper/CropImage.d:Z
        //   186: istore          23
        //   188: iload           23
        //   190: ifne            252
        //   193: aload_0        
        //   194: getfield        com/whatsapp/wallpaper/CropImage.m:I
        //   197: istore          24
        //   199: iload           24
        //   201: iconst_1       
        //   202: if_icmpeq       252
        //   205: aload_0        
        //   206: getfield        com/whatsapp/wallpaper/CropImage.m:I
        //   209: istore          25
        //   211: iload           25
        //   213: ifeq            252
        //   216: new             Landroid/media/ExifInterface;
        //   219: dup            
        //   220: aload_3        
        //   221: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   224: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //   227: astore          26
        //   229: aload           26
        //   231: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   234: bipush          44
        //   236: aaload         
        //   237: aload_0        
        //   238: getfield        com/whatsapp/wallpaper/CropImage.m:I
        //   241: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   244: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   247: aload           26
        //   249: invokevirtual   android/media/ExifInterface.saveAttributes:()V
        //   252: iload           11
        //   254: ifne            318
        //   257: new             Landroid/content/Intent;
        //   260: dup            
        //   261: invokespecial   android/content/Intent.<init>:()V
        //   264: astore          13
        //   266: aload           13
        //   268: aload_0        
        //   269: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //   272: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   275: pop            
        //   276: new             Landroid/os/Bundle;
        //   279: dup            
        //   280: invokespecial   android/os/Bundle.<init>:()V
        //   283: astore          15
        //   285: aload           15
        //   287: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   290: bipush          38
        //   292: aaload         
        //   293: aload_0        
        //   294: getfield        com/whatsapp/wallpaper/CropImage.t:Lcom/whatsapp/wallpaper/g;
        //   297: invokevirtual   com/whatsapp/wallpaper/g.e:()Landroid/graphics/Rect;
        //   300: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //   303: aload           13
        //   305: aload           15
        //   307: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //   310: pop            
        //   311: aload_0        
        //   312: iconst_m1      
        //   313: aload           13
        //   315: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   318: iload_2        
        //   319: ifeq            373
        //   322: new             Landroid/os/Bundle;
        //   325: dup            
        //   326: invokespecial   android/os/Bundle.<init>:()V
        //   329: astore          17
        //   331: aload           17
        //   333: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   336: bipush          40
        //   338: aaload         
        //   339: aload_0        
        //   340: getfield        com/whatsapp/wallpaper/CropImage.t:Lcom/whatsapp/wallpaper/g;
        //   343: invokevirtual   com/whatsapp/wallpaper/g.e:()Landroid/graphics/Rect;
        //   346: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //   349: new             Landroid/content/Intent;
        //   352: dup            
        //   353: invokespecial   android/content/Intent.<init>:()V
        //   356: astore          18
        //   358: aload           18
        //   360: aload           17
        //   362: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //   365: pop            
        //   366: aload_0        
        //   367: iconst_m1      
        //   368: aload           18
        //   370: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   373: aload_1        
        //   374: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   377: aload_0        
        //   378: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   381: return         
        //   382: astore          7
        //   384: new             Ljava/lang/StringBuilder;
        //   387: dup            
        //   388: invokespecial   java/lang/StringBuilder.<init>:()V
        //   391: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   394: bipush          37
        //   396: aaload         
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: aload_0        
        //   401: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //   404: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   407: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   410: aload           7
        //   412: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   415: aload           7
        //   417: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   420: ifnull          470
        //   423: aload           7
        //   425: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   428: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   431: bipush          41
        //   433: aaload         
        //   434: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   437: istore          30
        //   439: iload           30
        //   441: ifeq            470
        //   444: aload_0        
        //   445: iconst_0       
        //   446: new             Landroid/content/Intent;
        //   449: dup            
        //   450: invokespecial   android/content/Intent.<init>:()V
        //   453: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   456: bipush          36
        //   458: aaload         
        //   459: iconst_1       
        //   460: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   463: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   466: iload_2        
        //   467: ifeq            492
        //   470: aload_0        
        //   471: iconst_0       
        //   472: new             Landroid/content/Intent;
        //   475: dup            
        //   476: invokespecial   android/content/Intent.<init>:()V
        //   479: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   482: bipush          39
        //   484: aaload         
        //   485: iconst_1       
        //   486: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   489: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   492: aload           5
        //   494: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   497: iconst_1       
        //   498: istore          11
        //   500: goto            122
        //   503: astore          8
        //   505: aload           8
        //   507: athrow         
        //   508: astore          9
        //   510: aload           9
        //   512: athrow         
        //   513: astore          10
        //   515: aload           10
        //   517: athrow         
        //   518: astore          6
        //   520: aload           5
        //   522: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   525: aload           6
        //   527: athrow         
        //   528: astore          32
        //   530: aload           32
        //   532: athrow         
        //   533: astore          33
        //   535: aload           33
        //   537: athrow         
        //   538: astore          34
        //   540: aload           34
        //   542: athrow         
        //   543: astore          12
        //   545: aload           12
        //   547: athrow         
        //   548: astore          20
        //   550: aload           20
        //   552: athrow         
        //   553: astore          21
        //   555: aload           21
        //   557: athrow         
        //   558: astore          22
        //   560: aload           22
        //   562: athrow         
        //   563: astore          27
        //   565: new             Ljava/lang/StringBuilder;
        //   568: dup            
        //   569: invokespecial   java/lang/StringBuilder.<init>:()V
        //   572: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   575: bipush          45
        //   577: aaload         
        //   578: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   581: aload_0        
        //   582: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //   585: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   588: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   591: aload           27
        //   593: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   596: iconst_1       
        //   597: istore          11
        //   599: goto            252
        //   602: iconst_0       
        //   603: istore          11
        //   605: goto            122
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  33     45     382    518    Ljava/io/IOException;
        //  33     45     518    528    Any
        //  50     63     382    518    Ljava/io/IOException;
        //  50     63     518    528    Any
        //  71     77     528    533    Ljava/io/IOException;
        //  87     93     533    538    Ljava/io/IOException;
        //  98     110    538    543    Ljava/io/IOException;
        //  122    136    543    548    Ljava/io/IOException;
        //  182    188    548    553    Ljava/io/IOException;
        //  193    199    553    558    Ljava/io/IOException;
        //  205    211    558    563    Ljava/io/IOException;
        //  216    252    563    602    Ljava/io/IOException;
        //  384    439    503    508    Ljava/io/IOException;
        //  384    439    518    528    Any
        //  444    466    508    513    Ljava/io/IOException;
        //  444    466    518    528    Any
        //  470    492    513    518    Ljava/io/IOException;
        //  470    492    518    528    Any
        //  505    508    508    513    Ljava/io/IOException;
        //  505    508    518    528    Any
        //  510    513    513    518    Ljava/io/IOException;
        //  510    513    518    528    Any
        //  515    518    518    528    Any
        //  530    533    533    538    Ljava/io/IOException;
        //  535    538    538    543    Ljava/io/IOException;
        //  550    553    553    558    Ljava/io/IOException;
        //  555    558    558    563    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 292, Size: 292
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    static void a(final CropImage cropImage) {
        cropImage.a();
    }
    
    private void b() {
        final boolean h = ImageViewTouchBase.h;
        final g t = new g((View)this.k);
        final int width = this.i.getWidth();
        final int height = this.i.getHeight();
        final Rect rect = new Rect(0, 0, width, height);
        int v = 4 * Math.min(width, height) / 5;
        int h2 = 0;
        Label_0118: {
            if (this.b) {
                if (this.v < v && this.h < v) {
                    h2 = v * this.h / this.v;
                    if (!h) {
                        break Label_0118;
                    }
                }
                v = this.v;
                h2 = this.h;
            }
            else {
                h2 = v;
            }
        }
        Label_0175: {
            if (this.w != 0 && this.o != 0) {
                if (this.w > this.o) {
                    h2 = v * this.o / this.w;
                    if (!h) {
                        break Label_0175;
                    }
                }
                v = h2 * this.w / this.o;
            }
        }
        if (h2 > height) {
            v /= h2 / height;
            h2 = height;
        }
        if (this.q > 0) {
            if (v < this.q / this.j) {
                v = this.q / this.j;
                if (this.w != 0 && this.o != 0) {
                    h2 = v * this.o / this.w;
                }
            }
            if (h2 < this.q / this.j) {
                h2 = this.q / this.j;
                if (this.w != 0 && this.o != 0) {
                    v = h2 * this.w / this.o;
                }
            }
        }
        final int n = (width - v) / 2;
        final int n2 = (height - h2) / 2;
        final RectF rectF = new RectF((float)n, (float)n2, (float)(v + n), (float)(h2 + n2));
        final Matrix matrix = new Matrix();
        matrix.preTranslate(-(rectF.left + rectF.right) / 2.0f, -(rectF.top + rectF.bottom) / 2.0f);
        matrix.postConcat(this.l);
        matrix.postConcat(this.u);
        matrix.postTranslate((rectF.left + rectF.right) / 2.0f, (rectF.top + rectF.bottom) / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2;
        if (this.p != null) {
            rectF2 = new RectF(this.p);
        }
        else {
            rectF2 = rectF;
        }
        final Matrix imageMatrix = this.k.getImageMatrix();
        final boolean c = this.c;
        final int w = this.w;
        boolean b = false;
        if (w != 0) {
            final int o = this.o;
            b = false;
            if (o != 0) {
                b = true;
            }
        }
        t.a(imageMatrix, rect, rectF2, c, b, this.b, this.q / this.j);
        this.k.a(t);
        this.t = t;
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //     7: bipush          16
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: aload_1        
        //    15: invokespecial   android/app/Activity.onCreate:(Landroid/os/Bundle;)V
        //    18: invokestatic    com/whatsapp/App.y:()V
        //    21: aload_0        
        //    22: iconst_1       
        //    23: invokevirtual   com/whatsapp/wallpaper/CropImage.requestWindowFeature:(I)Z
        //    26: pop            
        //    27: aload_0        
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/wallpaper/CropImage.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    32: ldc_w           2130903144
        //    35: aconst_null    
        //    36: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    39: invokevirtual   com/whatsapp/wallpaper/CropImage.setContentView:(Landroid/view/View;)V
        //    42: aload_0        
        //    43: aload_0        
        //    44: ldc_w           2131755082
        //    47: invokevirtual   com/whatsapp/wallpaper/CropImage.findViewById:(I)Landroid/view/View;
        //    50: checkcast       Lcom/whatsapp/wallpaper/CropImageView;
        //    53: putfield        com/whatsapp/wallpaper/CropImage.k:Lcom/whatsapp/wallpaper/CropImageView;
        //    56: aload_0        
        //    57: invokevirtual   com/whatsapp/wallpaper/CropImage.getIntent:()Landroid/content/Intent;
        //    60: astore          4
        //    62: aload           4
        //    64: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    67: astore          5
        //    69: aload           5
        //    71: ifnull          399
        //    74: aload           5
        //    76: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //    79: bipush          13
        //    81: aaload         
        //    82: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    85: astore          43
        //    87: aload           43
        //    89: ifnull          107
        //    92: aload_0        
        //    93: iconst_1       
        //    94: putfield        com/whatsapp/wallpaper/CropImage.c:Z
        //    97: aload_0        
        //    98: iconst_1       
        //    99: putfield        com/whatsapp/wallpaper/CropImage.w:I
        //   102: aload_0        
        //   103: iconst_1       
        //   104: putfield        com/whatsapp/wallpaper/CropImage.o:I
        //   107: aload_0        
        //   108: aload           5
        //   110: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   113: bipush          22
        //   115: aaload         
        //   116: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   119: checkcast       Landroid/net/Uri;
        //   122: putfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //   125: aload_0        
        //   126: getfield        com/whatsapp/wallpaper/CropImage.s:Landroid/net/Uri;
        //   129: ifnull          159
        //   132: aload           5
        //   134: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   137: bipush          27
        //   139: aaload         
        //   140: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   143: astore          49
        //   145: aload           49
        //   147: ifnull          159
        //   150: aload_0        
        //   151: aload           49
        //   153: invokestatic    android/graphics/Bitmap$CompressFormat.valueOf:(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;
        //   156: putfield        com/whatsapp/wallpaper/CropImage.e:Landroid/graphics/Bitmap$CompressFormat;
        //   159: aload_0        
        //   160: aload           5
        //   162: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   165: bipush          21
        //   167: aaload         
        //   168: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   171: checkcast       Landroid/graphics/Bitmap;
        //   174: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   177: aload_0        
        //   178: aload           5
        //   180: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   183: bipush          34
        //   185: aaload         
        //   186: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   189: putfield        com/whatsapp/wallpaper/CropImage.w:I
        //   192: aload_0        
        //   193: aload           5
        //   195: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   198: bipush          30
        //   200: aaload         
        //   201: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   204: putfield        com/whatsapp/wallpaper/CropImage.o:I
        //   207: aload_0        
        //   208: aload           5
        //   210: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   213: iconst_1       
        //   214: aaload         
        //   215: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   218: putfield        com/whatsapp/wallpaper/CropImage.v:I
        //   221: aload_0        
        //   222: aload           5
        //   224: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   227: iconst_3       
        //   228: aaload         
        //   229: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   232: putfield        com/whatsapp/wallpaper/CropImage.h:I
        //   235: aload_0        
        //   236: aload           5
        //   238: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   241: bipush          10
        //   243: aaload         
        //   244: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   247: putfield        com/whatsapp/wallpaper/CropImage.q:I
        //   250: aload_0        
        //   251: aload           5
        //   253: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   256: bipush          32
        //   258: aaload         
        //   259: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   262: putfield        com/whatsapp/wallpaper/CropImage.n:I
        //   265: aload_0        
        //   266: aload           5
        //   268: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   271: bipush          7
        //   273: aaload         
        //   274: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   277: checkcast       Landroid/graphics/Rect;
        //   280: putfield        com/whatsapp/wallpaper/CropImage.p:Landroid/graphics/Rect;
        //   283: aload_0        
        //   284: getfield        com/whatsapp/wallpaper/CropImage.k:Lcom/whatsapp/wallpaper/CropImageView;
        //   287: astore          45
        //   289: aload           5
        //   291: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   294: bipush          20
        //   296: aaload         
        //   297: iconst_1       
        //   298: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   301: istore          46
        //   303: aload_0        
        //   304: iload           46
        //   306: putfield        com/whatsapp/wallpaper/CropImage.b:Z
        //   309: aload           45
        //   311: iload           46
        //   313: putfield        com/whatsapp/wallpaper/CropImageView.n:Z
        //   316: aload_0        
        //   317: aload           5
        //   319: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   322: bipush          12
        //   324: aaload         
        //   325: iconst_1       
        //   326: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   329: putfield        com/whatsapp/wallpaper/CropImage.x:Z
        //   332: aload_0        
        //   333: aload           5
        //   335: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   338: bipush          17
        //   340: aaload         
        //   341: iconst_1       
        //   342: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   345: putfield        com/whatsapp/wallpaper/CropImage.a:Z
        //   348: aload_0        
        //   349: aload           5
        //   351: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   354: bipush          19
        //   356: aaload         
        //   357: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   360: putfield        com/whatsapp/wallpaper/CropImage.r:I
        //   363: aload_0        
        //   364: aload           5
        //   366: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   369: bipush          25
        //   371: aaload         
        //   372: iconst_1       
        //   373: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   376: putfield        com/whatsapp/wallpaper/CropImage.d:Z
        //   379: aload_0        
        //   380: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   383: astore          47
        //   385: aload           47
        //   387: ifnull          519
        //   390: iconst_1       
        //   391: istore          48
        //   393: aload_0        
        //   394: iload           48
        //   396: putfield        com/whatsapp/wallpaper/CropImage.f:Z
        //   399: aload_0        
        //   400: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   403: ifnonnull       844
        //   406: aload           4
        //   408: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   411: astore          24
        //   413: aload_0        
        //   414: aload           24
        //   416: invokestatic    com/whatsapp/util/br.c:(Landroid/net/Uri;)I
        //   419: putfield        com/whatsapp/wallpaper/CropImage.m:I
        //   422: aload_0        
        //   423: aload_0        
        //   424: getfield        com/whatsapp/wallpaper/CropImage.m:I
        //   427: invokestatic    com/whatsapp/util/br.a:(I)Landroid/graphics/Matrix;
        //   430: putfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //   433: aload_0        
        //   434: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //   437: ifnonnull       451
        //   440: aload_0        
        //   441: new             Landroid/graphics/Matrix;
        //   444: dup            
        //   445: invokespecial   android/graphics/Matrix.<init>:()V
        //   448: putfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //   451: aload           24
        //   453: invokestatic    com/whatsapp/util/br.f:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   456: astore          31
        //   458: aload           31
        //   460: ifnonnull       624
        //   463: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   466: bipush          23
        //   468: aaload         
        //   469: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   472: aload_0        
        //   473: iconst_0       
        //   474: new             Landroid/content/Intent;
        //   477: dup            
        //   478: invokespecial   android/content/Intent.<init>:()V
        //   481: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   484: bipush          35
        //   486: aaload         
        //   487: iconst_1       
        //   488: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   491: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   494: aload_0        
        //   495: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   498: return         
        //   499: astore          41
        //   501: aload           41
        //   503: athrow         
        //   504: astore          42
        //   506: aload           42
        //   508: athrow         
        //   509: astore          50
        //   511: aload           50
        //   513: athrow         
        //   514: astore          44
        //   516: aload           44
        //   518: athrow         
        //   519: iconst_0       
        //   520: istore          48
        //   522: goto            393
        //   525: astore          30
        //   527: aload           30
        //   529: athrow         
        //   530: astore          25
        //   532: aload           25
        //   534: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   537: ifnull          586
        //   540: aload           25
        //   542: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   545: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   548: bipush          9
        //   550: aaload         
        //   551: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   554: istore          29
        //   556: iload           29
        //   558: ifeq            586
        //   561: aload_0        
        //   562: iconst_0       
        //   563: new             Landroid/content/Intent;
        //   566: dup            
        //   567: invokespecial   android/content/Intent.<init>:()V
        //   570: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   573: iconst_4       
        //   574: aaload         
        //   575: iconst_1       
        //   576: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   579: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   582: iload_2        
        //   583: ifeq            608
        //   586: aload_0        
        //   587: iconst_0       
        //   588: new             Landroid/content/Intent;
        //   591: dup            
        //   592: invokespecial   android/content/Intent.<init>:()V
        //   595: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   598: bipush          24
        //   600: aaload         
        //   601: iconst_1       
        //   602: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   605: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   608: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   611: bipush          6
        //   613: aaload         
        //   614: aload           25
        //   616: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   619: aload_0        
        //   620: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   623: return         
        //   624: new             Landroid/graphics/BitmapFactory$Options;
        //   627: dup            
        //   628: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   631: astore          32
        //   633: aload           32
        //   635: iconst_1       
        //   636: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   639: aload           31
        //   641: aconst_null    
        //   642: aload           32
        //   644: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   647: pop            
        //   648: aload           31
        //   650: invokevirtual   java/io/InputStream.close:()V
        //   653: aload           32
        //   655: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   658: ifle            673
        //   661: aload           32
        //   663: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   666: istore          35
        //   668: iload           35
        //   670: ifgt            714
        //   673: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   676: bipush          28
        //   678: aaload         
        //   679: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   682: aload_0        
        //   683: iconst_0       
        //   684: new             Landroid/content/Intent;
        //   687: dup            
        //   688: invokespecial   android/content/Intent.<init>:()V
        //   691: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   694: bipush          18
        //   696: aaload         
        //   697: iconst_1       
        //   698: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   701: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   704: aload_0        
        //   705: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   708: return         
        //   709: astore          33
        //   711: aload           33
        //   713: athrow         
        //   714: aload           32
        //   716: iconst_1       
        //   717: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   720: aload           32
        //   722: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   725: aload           32
        //   727: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   730: invokestatic    java/lang/Math.max:(II)I
        //   733: istore          36
        //   735: aload_0        
        //   736: invokevirtual   com/whatsapp/wallpaper/CropImage.getWindowManager:()Landroid/view/WindowManager;
        //   739: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   744: invokevirtual   android/view/Display.getWidth:()I
        //   747: aload_0        
        //   748: invokevirtual   com/whatsapp/wallpaper/CropImage.getWindowManager:()Landroid/view/WindowManager;
        //   751: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   756: invokevirtual   android/view/Display.getHeight:()I
        //   759: invokestatic    java/lang/Math.max:(II)I
        //   762: istore          37
        //   764: iload           36
        //   766: iload           37
        //   768: if_icmple       793
        //   771: iload           36
        //   773: iconst_2       
        //   774: idiv           
        //   775: istore          36
        //   777: aload           32
        //   779: iconst_2       
        //   780: aload           32
        //   782: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   785: imul           
        //   786: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   789: iload_2        
        //   790: ifeq            764
        //   793: aload           32
        //   795: iconst_1       
        //   796: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   799: aload           32
        //   801: iconst_0       
        //   802: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   805: aload           32
        //   807: iconst_0       
        //   808: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //   811: aload_0        
        //   812: aload           32
        //   814: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   817: putfield        com/whatsapp/wallpaper/CropImage.j:I
        //   820: aload           24
        //   822: invokestatic    com/whatsapp/util/br.f:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   825: astore          38
        //   827: aload_0        
        //   828: aload           38
        //   830: aconst_null    
        //   831: aload           32
        //   833: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   836: putfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   839: aload           38
        //   841: invokevirtual   java/io/InputStream.close:()V
        //   844: aload_0        
        //   845: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   848: ifnull          879
        //   851: aload_0        
        //   852: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   855: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   858: istore          9
        //   860: iload           9
        //   862: ifeq            879
        //   865: aload_0        
        //   866: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //   869: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   872: istore          10
        //   874: iload           10
        //   876: ifne            997
        //   879: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   882: bipush          26
        //   884: aaload         
        //   885: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   888: aload_0        
        //   889: iconst_0       
        //   890: new             Landroid/content/Intent;
        //   893: dup            
        //   894: invokespecial   android/content/Intent.<init>:()V
        //   897: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   900: bipush          31
        //   902: aaload         
        //   903: iconst_1       
        //   904: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   907: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   910: aload_0        
        //   911: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   914: return         
        //   915: astore          8
        //   917: aload           8
        //   919: athrow         
        //   920: astore          40
        //   922: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   925: iconst_2       
        //   926: aaload         
        //   927: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   930: aload_0        
        //   931: iconst_0       
        //   932: new             Landroid/content/Intent;
        //   935: dup            
        //   936: invokespecial   android/content/Intent.<init>:()V
        //   939: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //   942: bipush          8
        //   944: aaload         
        //   945: iconst_1       
        //   946: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   949: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //   952: aload_0        
        //   953: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //   956: aload           38
        //   958: invokevirtual   java/io/InputStream.close:()V
        //   961: return         
        //   962: astore          39
        //   964: aload           38
        //   966: invokevirtual   java/io/InputStream.close:()V
        //   969: aload           39
        //   971: athrow         
        //   972: astore          26
        //   974: aload           26
        //   976: athrow         
        //   977: astore          27
        //   979: aload           27
        //   981: athrow         
        //   982: astore          28
        //   984: aload           28
        //   986: athrow         
        //   987: astore          6
        //   989: aload           6
        //   991: athrow         
        //   992: astore          7
        //   994: aload           7
        //   996: athrow         
        //   997: aload           4
        //   999: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1002: bipush          14
        //  1004: aaload         
        //  1005: iconst_0       
        //  1006: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1009: istore          11
        //  1011: aload           4
        //  1013: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1016: bipush          33
        //  1018: aaload         
        //  1019: iconst_0       
        //  1020: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1023: istore          12
        //  1025: aload           4
        //  1027: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1030: bipush          11
        //  1032: aaload         
        //  1033: iconst_0       
        //  1034: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1037: istore          13
        //  1039: aload_0        
        //  1040: new             Landroid/graphics/Matrix;
        //  1043: dup            
        //  1044: invokespecial   android/graphics/Matrix.<init>:()V
        //  1047: putfield        com/whatsapp/wallpaper/CropImage.u:Landroid/graphics/Matrix;
        //  1050: iload           11
        //  1052: ifeq            1066
        //  1055: aload_0        
        //  1056: getfield        com/whatsapp/wallpaper/CropImage.u:Landroid/graphics/Matrix;
        //  1059: iload           11
        //  1061: i2f            
        //  1062: invokevirtual   android/graphics/Matrix.postRotate:(F)Z
        //  1065: pop            
        //  1066: iload           12
        //  1068: ifeq            1140
        //  1071: new             Landroid/graphics/Matrix;
        //  1074: dup            
        //  1075: invokespecial   android/graphics/Matrix.<init>:()V
        //  1078: astore          16
        //  1080: aload           16
        //  1082: bipush          9
        //  1084: newarray        F
        //  1086: dup            
        //  1087: iconst_0       
        //  1088: ldc_w           -1.0
        //  1091: fastore        
        //  1092: dup            
        //  1093: iconst_1       
        //  1094: fconst_0       
        //  1095: fastore        
        //  1096: dup            
        //  1097: iconst_2       
        //  1098: fconst_0       
        //  1099: fastore        
        //  1100: dup            
        //  1101: iconst_3       
        //  1102: fconst_0       
        //  1103: fastore        
        //  1104: dup            
        //  1105: iconst_4       
        //  1106: fconst_1       
        //  1107: fastore        
        //  1108: dup            
        //  1109: iconst_5       
        //  1110: fconst_0       
        //  1111: fastore        
        //  1112: dup            
        //  1113: bipush          6
        //  1115: fconst_0       
        //  1116: fastore        
        //  1117: dup            
        //  1118: bipush          7
        //  1120: fconst_0       
        //  1121: fastore        
        //  1122: dup            
        //  1123: bipush          8
        //  1125: fconst_1       
        //  1126: fastore        
        //  1127: invokevirtual   android/graphics/Matrix.setValues:([F)V
        //  1130: aload_0        
        //  1131: getfield        com/whatsapp/wallpaper/CropImage.u:Landroid/graphics/Matrix;
        //  1134: aload           16
        //  1136: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //  1139: pop            
        //  1140: iload           13
        //  1142: ifeq            1214
        //  1145: new             Landroid/graphics/Matrix;
        //  1148: dup            
        //  1149: invokespecial   android/graphics/Matrix.<init>:()V
        //  1152: astore          18
        //  1154: aload           18
        //  1156: bipush          9
        //  1158: newarray        F
        //  1160: dup            
        //  1161: iconst_0       
        //  1162: fconst_1       
        //  1163: fastore        
        //  1164: dup            
        //  1165: iconst_1       
        //  1166: fconst_0       
        //  1167: fastore        
        //  1168: dup            
        //  1169: iconst_2       
        //  1170: fconst_0       
        //  1171: fastore        
        //  1172: dup            
        //  1173: iconst_3       
        //  1174: fconst_0       
        //  1175: fastore        
        //  1176: dup            
        //  1177: iconst_4       
        //  1178: ldc_w           -1.0
        //  1181: fastore        
        //  1182: dup            
        //  1183: iconst_5       
        //  1184: fconst_0       
        //  1185: fastore        
        //  1186: dup            
        //  1187: bipush          6
        //  1189: fconst_0       
        //  1190: fastore        
        //  1191: dup            
        //  1192: bipush          7
        //  1194: fconst_0       
        //  1195: fastore        
        //  1196: dup            
        //  1197: bipush          8
        //  1199: fconst_1       
        //  1200: fastore        
        //  1201: invokevirtual   android/graphics/Matrix.setValues:([F)V
        //  1204: aload_0        
        //  1205: getfield        com/whatsapp/wallpaper/CropImage.u:Landroid/graphics/Matrix;
        //  1208: aload           18
        //  1210: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //  1213: pop            
        //  1214: new             Lcom/whatsapp/wallpaper/r;
        //  1217: dup            
        //  1218: aload_0        
        //  1219: getfield        com/whatsapp/wallpaper/CropImage.i:Landroid/graphics/Bitmap;
        //  1222: invokespecial   com/whatsapp/wallpaper/r.<init>:(Landroid/graphics/Bitmap;)V
        //  1225: astore          20
        //  1227: new             Landroid/graphics/Matrix;
        //  1230: dup            
        //  1231: invokespecial   android/graphics/Matrix.<init>:()V
        //  1234: astore          21
        //  1236: aload           21
        //  1238: aload_0        
        //  1239: getfield        com/whatsapp/wallpaper/CropImage.l:Landroid/graphics/Matrix;
        //  1242: invokevirtual   android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
        //  1245: aload           21
        //  1247: aload_0        
        //  1248: getfield        com/whatsapp/wallpaper/CropImage.u:Landroid/graphics/Matrix;
        //  1251: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //  1254: pop            
        //  1255: aload           20
        //  1257: aload           21
        //  1259: invokevirtual   com/whatsapp/wallpaper/r.a:(Landroid/graphics/Matrix;)V
        //  1262: aload_0        
        //  1263: getfield        com/whatsapp/wallpaper/CropImage.k:Lcom/whatsapp/wallpaper/CropImageView;
        //  1266: aload           20
        //  1268: iconst_1       
        //  1269: invokevirtual   com/whatsapp/wallpaper/CropImageView.setImageRotateBitmapResetBase:(Lcom/whatsapp/wallpaper/r;Z)V
        //  1272: aload_0        
        //  1273: invokespecial   com/whatsapp/wallpaper/CropImage.b:()V
        //  1276: aload_0        
        //  1277: invokevirtual   com/whatsapp/wallpaper/CropImage.getWindow:()Landroid/view/Window;
        //  1280: sipush          1024
        //  1283: invokevirtual   android/view/Window.addFlags:(I)V
        //  1286: aload_0        
        //  1287: ldc_w           2131755547
        //  1290: invokevirtual   com/whatsapp/wallpaper/CropImage.findViewById:(I)Landroid/view/View;
        //  1293: new             Lcom/whatsapp/wallpaper/f;
        //  1296: dup            
        //  1297: aload_0        
        //  1298: invokespecial   com/whatsapp/wallpaper/f.<init>:(Lcom/whatsapp/wallpaper/CropImage;)V
        //  1301: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1304: aload_0        
        //  1305: ldc_w           2131755546
        //  1308: invokevirtual   com/whatsapp/wallpaper/CropImage.findViewById:(I)Landroid/view/View;
        //  1311: new             Lcom/whatsapp/wallpaper/i;
        //  1314: dup            
        //  1315: aload_0        
        //  1316: invokespecial   com/whatsapp/wallpaper/i.<init>:(Lcom/whatsapp/wallpaper/CropImage;)V
        //  1319: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1322: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1325: iconst_5       
        //  1326: aaload         
        //  1327: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1330: invokestatic    com/whatsapp/App.y:()V
        //  1333: return         
        //  1334: astore          14
        //  1336: aload           14
        //  1338: athrow         
        //  1339: astore          23
        //  1341: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1344: bipush          29
        //  1346: aaload         
        //  1347: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1350: aload_0        
        //  1351: iconst_0       
        //  1352: new             Landroid/content/Intent;
        //  1355: dup            
        //  1356: invokespecial   android/content/Intent.<init>:()V
        //  1359: getstatic       com/whatsapp/wallpaper/CropImage.z:[Ljava/lang/String;
        //  1362: bipush          15
        //  1364: aaload         
        //  1365: iconst_1       
        //  1366: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1369: invokevirtual   com/whatsapp/wallpaper/CropImage.setResult:(ILandroid/content/Intent;)V
        //  1372: aload_0        
        //  1373: invokevirtual   com/whatsapp/wallpaper/CropImage.finish:()V
        //  1376: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  74     87     499    504    Ljava/lang/OutOfMemoryError;
        //  92     107    504    509    Ljava/lang/OutOfMemoryError;
        //  150    159    509    514    Ljava/lang/OutOfMemoryError;
        //  159    385    514    519    Ljava/lang/OutOfMemoryError;
        //  413    451    525    530    Ljava/lang/OutOfMemoryError;
        //  413    451    530    987    Ljava/io/IOException;
        //  451    458    530    987    Ljava/io/IOException;
        //  463    498    530    987    Ljava/io/IOException;
        //  501    504    504    509    Ljava/lang/OutOfMemoryError;
        //  527    530    530    987    Ljava/io/IOException;
        //  532    556    972    977    Ljava/lang/OutOfMemoryError;
        //  561    582    977    982    Ljava/lang/OutOfMemoryError;
        //  586    608    982    987    Ljava/lang/OutOfMemoryError;
        //  624    633    530    987    Ljava/io/IOException;
        //  633    668    709    714    Ljava/lang/OutOfMemoryError;
        //  633    668    530    987    Ljava/io/IOException;
        //  673    708    530    987    Ljava/io/IOException;
        //  711    714    530    987    Ljava/io/IOException;
        //  714    764    530    987    Ljava/io/IOException;
        //  771    789    530    987    Ljava/io/IOException;
        //  793    827    530    987    Ljava/io/IOException;
        //  827    839    920    962    Ljava/lang/OutOfMemoryError;
        //  827    839    962    972    Any
        //  839    844    530    987    Ljava/io/IOException;
        //  844    860    987    992    Ljava/lang/OutOfMemoryError;
        //  865    874    992    997    Ljava/lang/OutOfMemoryError;
        //  879    914    915    920    Ljava/lang/OutOfMemoryError;
        //  922    956    962    972    Any
        //  956    961    530    987    Ljava/io/IOException;
        //  964    972    530    987    Ljava/io/IOException;
        //  974    977    977    982    Ljava/lang/OutOfMemoryError;
        //  979    982    982    987    Ljava/lang/OutOfMemoryError;
        //  989    992    992    997    Ljava/lang/OutOfMemoryError;
        //  994    997    915    920    Ljava/lang/OutOfMemoryError;
        //  1039   1050   1334   1339   Ljava/lang/OutOfMemoryError;
        //  1055   1066   1334   1339   Ljava/lang/OutOfMemoryError;
        //  1272   1276   1339   1377   Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 690, Size: 690
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
    
    protected void onDestroy() {
        super.onDestroy();
        if (this.i != null && !this.i.isRecycled()) {
            this.k.t = true;
            this.i.recycle();
            this.i = null;
        }
        Log.i(CropImage.z[0]);
        App.y();
    }
    
    protected void onPause() {
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
    }
}
