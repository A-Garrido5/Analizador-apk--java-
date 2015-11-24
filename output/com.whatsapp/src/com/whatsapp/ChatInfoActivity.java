// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.Window;
import android.transition.Fade;
import android.transition.Transition;
import android.os.Bundle;
import java.util.ArrayList;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.util.b8;
import android.os.Build$VERSION;
import android.support.v7.graphics.Palette$PaletteAsyncListener;
import android.support.v7.graphics.Palette;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.content.Context;

public class ChatInfoActivity extends DialogToastListActivity
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0012\"\u0002\u0013\u000b\u001d*\u0002/\n\u0003*\u001e\u0003\u0017\u0005\"\u001f\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '~';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = 'K';
                    break;
                }
                case 2: {
                    c2 = 'p';
                    break;
                }
                case 3: {
                    c2 = 'p';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected static int a(final Context p0, final String p1, final atr p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: bipush          12
        //    10: invokespecial   java/util/ArrayList.<init>:(I)V
        //    13: astore          4
        //    15: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    18: aload_1        
        //    19: invokevirtual   com/whatsapp/vy.z:(Ljava/lang/String;)Landroid/database/Cursor;
        //    22: astore          5
        //    24: aload           5
        //    26: ifnull          307
        //    29: iconst_0       
        //    30: istore          9
        //    32: iconst_0       
        //    33: istore          10
        //    35: aload           5
        //    37: invokeinterface android/database/Cursor.moveToNext:()Z
        //    42: ifeq            296
        //    45: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    48: aload           5
        //    50: aload_1        
        //    51: invokevirtual   com/whatsapp/vy.a:(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //    54: astore          15
        //    56: aload           15
        //    58: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    61: ifnull          182
        //    64: aload           15
        //    66: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    69: checkcast       Lcom/whatsapp/MediaData;
        //    72: astore          16
        //    74: aload           15
        //    76: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    79: getfield        com/whatsapp/protocol/c6.b:Z
        //    82: ifne            97
        //    85: aload           16
        //    87: getfield        com/whatsapp/MediaData.transferred:Z
        //    90: istore          26
        //    92: iload           26
        //    94: ifeq            182
        //    97: aload           16
        //    99: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   102: astore          19
        //   104: aload           19
        //   106: ifnull          182
        //   109: new             Ljava/io/File;
        //   112: dup            
        //   113: aload           16
        //   115: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   118: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   121: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //   124: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   127: astore          20
        //   129: aload           20
        //   131: invokevirtual   java/io/File.exists:()Z
        //   134: istore          23
        //   136: iload           23
        //   138: ifeq            182
        //   141: iinc            10, 1
        //   144: iload           9
        //   146: ifne            182
        //   149: aload           4
        //   151: aload           15
        //   153: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   156: pop            
        //   157: aload           4
        //   159: invokevirtual   java/util/ArrayList.size:()I
        //   162: istore          25
        //   164: iload           25
        //   166: bipush          12
        //   168: if_icmpne       182
        //   171: iconst_1       
        //   172: istore          9
        //   174: aload_2        
        //   175: aload           4
        //   177: invokeinterface com/whatsapp/atr.a:(Ljava/util/ArrayList;)V
        //   182: iload           9
        //   184: istore          6
        //   186: iload           10
        //   188: istore          7
        //   190: iload_3        
        //   191: ifeq            285
        //   194: aload           5
        //   196: ifnull          206
        //   199: aload           5
        //   201: invokeinterface android/database/Cursor.close:()V
        //   206: iload           6
        //   208: ifne            219
        //   211: aload_2        
        //   212: aload           4
        //   214: invokeinterface com/whatsapp/atr.a:(Ljava/util/ArrayList;)V
        //   219: iload           7
        //   221: ireturn        
        //   222: astore          17
        //   224: aload           17
        //   226: athrow         
        //   227: astore          18
        //   229: aload           18
        //   231: athrow         
        //   232: astore          13
        //   234: aload_0        
        //   235: ldc             2131231077
        //   237: invokestatic    com/whatsapp/util/bq.a:(Landroid/content/Context;I)V
        //   240: aload           13
        //   242: athrow         
        //   243: astore          11
        //   245: aload           5
        //   247: ifnull          257
        //   250: aload           5
        //   252: invokeinterface android/database/Cursor.close:()V
        //   257: aload           11
        //   259: athrow         
        //   260: astore          21
        //   262: aload           21
        //   264: athrow         
        //   265: astore          22
        //   267: aload           22
        //   269: athrow         
        //   270: astore          14
        //   272: aload           14
        //   274: athrow         
        //   275: astore          12
        //   277: aload           12
        //   279: athrow         
        //   280: astore          8
        //   282: aload           8
        //   284: athrow         
        //   285: iload           7
        //   287: istore          10
        //   289: iload           6
        //   291: istore          9
        //   293: goto            35
        //   296: iload           9
        //   298: istore          6
        //   300: iload           10
        //   302: istore          7
        //   304: goto            194
        //   307: iconst_0       
        //   308: istore          6
        //   310: iconst_0       
        //   311: istore          7
        //   313: goto            206
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                           
        //  -----  -----  -----  -----  -----------------------------------------------
        //  35     74     232    243    Landroid/database/sqlite/SQLiteDiskIOException;
        //  35     74     243    260    Any
        //  74     92     222    227    Landroid/database/sqlite/SQLiteDiskIOException;
        //  74     92     243    260    Any
        //  97     104    227    232    Landroid/database/sqlite/SQLiteDiskIOException;
        //  97     104    243    260    Any
        //  109    129    232    243    Landroid/database/sqlite/SQLiteDiskIOException;
        //  109    129    243    260    Any
        //  129    136    260    265    Landroid/database/sqlite/SQLiteDiskIOException;
        //  129    136    243    260    Any
        //  149    164    265    270    Landroid/database/sqlite/SQLiteDiskIOException;
        //  149    164    243    260    Any
        //  174    182    232    243    Landroid/database/sqlite/SQLiteDiskIOException;
        //  174    182    243    260    Any
        //  199    206    270    275    Landroid/database/sqlite/SQLiteDiskIOException;
        //  211    219    280    285    Landroid/database/sqlite/SQLiteDiskIOException;
        //  224    227    227    232    Landroid/database/sqlite/SQLiteDiskIOException;
        //  224    227    243    260    Any
        //  229    232    232    243    Landroid/database/sqlite/SQLiteDiskIOException;
        //  229    232    243    260    Any
        //  234    243    243    260    Any
        //  250    257    275    280    Landroid/database/sqlite/SQLiteDiskIOException;
        //  262    265    265    270    Landroid/database/sqlite/SQLiteDiskIOException;
        //  262    265    243    260    Any
        //  267    270    232    243    Landroid/database/sqlite/SQLiteDiskIOException;
        //  267    270    243    260    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 143, Size: 143
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
    
    void a(final Bitmap imageBitmap, final int imageResource, final int n) {
        final ChatInfoLayout chatInfoLayout = (ChatInfoLayout)this.findViewById(2131755262);
        chatInfoLayout.findViewById(2131755358).setVisibility(8);
        final ImageView imageView = (ImageView)chatInfoLayout.findViewById(2131755367);
        Label_0070: {
            if (imageBitmap == null) {
                break Label_0070;
            }
            try {
                Palette.generateAsync(imageBitmap, new a5(this, chatInfoLayout));
                imageView.setImageBitmap(imageBitmap);
                if (App.I) {
                    imageView.setImageResource(imageResource);
                    final int color = this.getResources().getColor(n);
                    chatInfoLayout.setColor(color);
                    this.findViewById(2131755368).setBackgroundColor(0);
                    this.findViewById(2131755369).setBackgroundColor(0);
                    if (Build$VERSION.SDK_INT >= 21) {
                        final float[] array = new float[3];
                        b8.a(color, array);
                        array[2] = 8.0f * array[2] / 10.0f;
                        this.getWindow().setStatusBarColor(b8.a(array));
                    }
                }
            }
            catch (SQLiteDiskIOException ex) {
                throw ex;
            }
        }
    }
    
    protected void a(final ArrayList p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: ldc             2131755384
        //     7: invokevirtual   com/whatsapp/ChatInfoActivity.findViewById:(I)Landroid/view/View;
        //    10: astore          4
        //    12: aload_1        
        //    13: ifnull          23
        //    16: aload_1        
        //    17: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    20: ifeq            34
        //    23: aload           4
        //    25: bipush          8
        //    27: invokevirtual   android/view/View.setVisibility:(I)V
        //    30: iload_3        
        //    31: ifeq            484
        //    34: aload           4
        //    36: iconst_0       
        //    37: invokevirtual   android/view/View.setVisibility:(I)V
        //    40: aload_0        
        //    41: ldc             2131755389
        //    43: invokevirtual   com/whatsapp/ChatInfoActivity.findViewById:(I)Landroid/view/View;
        //    46: checkcast       Landroid/view/ViewGroup;
        //    49: astore          6
        //    51: aload           6
        //    53: invokevirtual   android/view/ViewGroup.removeAllViews:()V
        //    56: aload_0        
        //    57: invokevirtual   com/whatsapp/ChatInfoActivity.getResources:()Landroid/content/res/Resources;
        //    60: ldc             2131361936
        //    62: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    65: istore          7
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/ChatInfoActivity.getResources:()Landroid/content/res/Resources;
        //    71: ldc             2131361935
        //    73: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    76: istore          8
        //    78: aload_0        
        //    79: invokevirtual   com/whatsapp/ChatInfoActivity.getResources:()Landroid/content/res/Resources;
        //    82: ldc             2131361934
        //    84: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    87: i2f            
        //    88: fstore          9
        //    90: new             Landroid/widget/ImageView;
        //    93: dup            
        //    94: aload_0        
        //    95: invokespecial   android/widget/ImageView.<init>:(Landroid/content/Context;)V
        //    98: astore          10
        //   100: aload           10
        //   102: ldc             2130839068
        //   104: invokevirtual   android/widget/ImageView.setBackgroundResource:(I)V
        //   107: aload           10
        //   109: new             Landroid/view/ViewGroup$LayoutParams;
        //   112: dup            
        //   113: iload           7
        //   115: iload           8
        //   117: iadd           
        //   118: iload           7
        //   120: iload           8
        //   122: iadd           
        //   123: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   126: invokevirtual   android/widget/ImageView.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   129: aload           10
        //   131: iload           8
        //   133: iload           8
        //   135: iload           8
        //   137: iload           8
        //   139: invokevirtual   android/widget/ImageView.setPadding:(IIII)V
        //   142: aload           10
        //   144: new             Lcom/whatsapp/hl;
        //   147: dup            
        //   148: aload_0        
        //   149: aload_2        
        //   150: invokespecial   com/whatsapp/hl.<init>:(Lcom/whatsapp/ChatInfoActivity;Ljava/lang/String;)V
        //   153: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   156: aload           10
        //   158: new             Lcom/whatsapp/util/m;
        //   161: dup            
        //   162: aload_0        
        //   163: invokevirtual   com/whatsapp/ChatInfoActivity.getResources:()Landroid/content/res/Resources;
        //   166: ldc             2130838704
        //   168: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   171: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   174: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   177: aload           10
        //   179: getstatic       android/widget/ImageView$ScaleType.CENTER:Landroid/widget/ImageView$ScaleType;
        //   182: invokevirtual   android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   185: aload_1        
        //   186: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   189: astore          11
        //   191: aload           11
        //   193: invokeinterface java/util/Iterator.hasNext:()Z
        //   198: ifeq            427
        //   201: aload           11
        //   203: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   208: checkcast       Lcom/whatsapp/protocol/bi;
        //   211: astore          14
        //   213: new             Lcom/whatsapp/ThumbnailTextButton;
        //   216: dup            
        //   217: aload_0        
        //   218: invokespecial   com/whatsapp/ThumbnailTextButton.<init>:(Landroid/content/Context;)V
        //   221: astore          15
        //   223: aload           15
        //   225: getstatic       android/widget/ImageView$ScaleType.CENTER_CROP:Landroid/widget/ImageView$ScaleType;
        //   228: invokevirtual   com/whatsapp/ThumbnailTextButton.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   231: aload           15
        //   233: new             Landroid/view/ViewGroup$LayoutParams;
        //   236: dup            
        //   237: iload           7
        //   239: iload           8
        //   241: iadd           
        //   242: iload           7
        //   244: iload           8
        //   246: iadd           
        //   247: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //   250: invokevirtual   com/whatsapp/ThumbnailTextButton.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   253: aload           15
        //   255: iload           8
        //   257: iload           8
        //   259: iload           8
        //   261: iload           8
        //   263: invokevirtual   com/whatsapp/ThumbnailTextButton.setPadding:(IIII)V
        //   266: aload           15
        //   268: fload           9
        //   270: invokevirtual   com/whatsapp/ThumbnailTextButton.setRadius:(F)V
        //   273: aload           15
        //   275: iload           7
        //   277: bipush          6
        //   279: idiv           
        //   280: i2f            
        //   281: invokevirtual   com/whatsapp/ThumbnailTextButton.setTextSize:(F)V
        //   284: aload           15
        //   286: iconst_5       
        //   287: invokevirtual   com/whatsapp/ThumbnailTextButton.setTextGravity:(I)V
        //   290: aload           14
        //   292: getfield        com/whatsapp/protocol/bi.I:B
        //   295: istore          18
        //   297: iload           18
        //   299: iconst_3       
        //   300: if_icmpeq       312
        //   303: aload           14
        //   305: getfield        com/whatsapp/protocol/bi.I:B
        //   308: iconst_2       
        //   309: if_icmpne       383
        //   312: aload           14
        //   314: getfield        com/whatsapp/protocol/bi.D:I
        //   317: istore          19
        //   319: iload           19
        //   321: ifeq            339
        //   324: aload           14
        //   326: getfield        com/whatsapp/protocol/bi.D:I
        //   329: i2l            
        //   330: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   333: astore          20
        //   335: iload_3        
        //   336: ifeq            352
        //   339: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   342: aload           14
        //   344: getfield        com/whatsapp/protocol/bi.L:J
        //   347: invokestatic    android/text/format/Formatter.formatShortFileSize:(Landroid/content/Context;J)Ljava/lang/String;
        //   350: astore          20
        //   352: aload           15
        //   354: aload           20
        //   356: invokevirtual   com/whatsapp/ThumbnailTextButton.setText:(Ljava/lang/CharSequence;)V
        //   359: aload           14
        //   361: getfield        com/whatsapp/protocol/bi.I:B
        //   364: iconst_3       
        //   365: if_icmpne       383
        //   368: aload           15
        //   370: aload_0        
        //   371: invokevirtual   com/whatsapp/ChatInfoActivity.getResources:()Landroid/content/res/Resources;
        //   374: ldc_w           2130838902
        //   377: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   380: invokevirtual   com/whatsapp/ThumbnailTextButton.setIcon:(Landroid/graphics/drawable/Drawable;)V
        //   383: aload           15
        //   385: new             Lcom/whatsapp/v2;
        //   388: dup            
        //   389: aload_0        
        //   390: aload           14
        //   392: aload_2        
        //   393: invokespecial   com/whatsapp/v2.<init>:(Lcom/whatsapp/ChatInfoActivity;Lcom/whatsapp/protocol/bi;Ljava/lang/String;)V
        //   396: invokevirtual   com/whatsapp/ThumbnailTextButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   399: aload           14
        //   401: aload           15
        //   403: new             Lcom/whatsapp/mv;
        //   406: dup            
        //   407: aload_0        
        //   408: iload           7
        //   410: invokespecial   com/whatsapp/mv.<init>:(Lcom/whatsapp/ChatInfoActivity;I)V
        //   413: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //   416: aload           6
        //   418: aload           15
        //   420: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //   423: iload_3        
        //   424: ifeq            191
        //   427: aload_1        
        //   428: invokevirtual   java/util/ArrayList.size:()I
        //   431: bipush          12
        //   433: if_icmplt       443
        //   436: aload           6
        //   438: aload           10
        //   440: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //   443: aload           6
        //   445: invokestatic    com/whatsapp/alm.a:(Landroid/view/View;)V
        //   448: invokestatic    com/whatsapp/App.ak:()Z
        //   451: ifne            484
        //   454: aload_0        
        //   455: ldc_w           2131755388
        //   458: invokevirtual   com/whatsapp/ChatInfoActivity.findViewById:(I)Landroid/view/View;
        //   461: checkcast       Landroid/widget/HorizontalScrollView;
        //   464: astore          13
        //   466: aload           13
        //   468: invokevirtual   android/widget/HorizontalScrollView.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   471: new             Lcom/whatsapp/aq3;
        //   474: dup            
        //   475: aload_0        
        //   476: aload           13
        //   478: invokespecial   com/whatsapp/aq3.<init>:(Lcom/whatsapp/ChatInfoActivity;Landroid/widget/HorizontalScrollView;)V
        //   481: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   484: return         
        //   485: astore          5
        //   487: aload           5
        //   489: athrow         
        //   490: astore          16
        //   492: aload           16
        //   494: athrow         
        //   495: astore          17
        //   497: aload           17
        //   499: athrow         
        //   500: astore          21
        //   502: aload           21
        //   504: athrow         
        //   505: astore          12
        //   507: aload           12
        //   509: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                           
        //  -----  -----  -----  -----  -----------------------------------------------
        //  16     23     485    490    Landroid/database/sqlite/SQLiteDiskIOException;
        //  23     30     485    490    Landroid/database/sqlite/SQLiteDiskIOException;
        //  223    297    490    495    Landroid/database/sqlite/SQLiteDiskIOException;
        //  303    312    495    500    Landroid/database/sqlite/SQLiteDiskIOException;
        //  312    319    495    500    Landroid/database/sqlite/SQLiteDiskIOException;
        //  352    383    500    505    Landroid/database/sqlite/SQLiteDiskIOException;
        //  427    443    505    510    Landroid/database/sqlite/SQLiteDiskIOException;
        //  492    495    495    500    Landroid/database/sqlite/SQLiteDiskIOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 234, Size: 234
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
    
    public void onCreate(final Bundle bundle) {
        final Window window = this.getWindow();
        try {
            window.requestFeature(13);
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.getIntent().getBooleanExtra(ChatInfoActivity.z, false)) {
                    window.requestFeature(12);
                    final ae sharedElementEnterTransition = new ae();
                    sharedElementEnterTransition.addTarget(this.getString(2131232142));
                    window.setSharedElementEnterTransition((Transition)sharedElementEnterTransition);
                }
                final Fade fade = new Fade();
                ((Transition)fade).excludeTarget(16908335, true);
                ((Transition)fade).excludeTarget(16908336, true);
                window.setExitTransition((Transition)fade);
                window.setEnterTransition((Transition)fade);
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
            }
            this.supportRequestWindowFeature(5);
            super.onCreate(bundle);
        }
        catch (SQLiteDiskIOException ex) {
            throw ex;
        }
    }
}
