// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.App;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import android.net.Uri;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import java.io.File;

final class a7
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "LiH";
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
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = '}';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "fI\u000f\u0016Rd\u0000\b\u000bMm\u0002\u001a\u001aP,@\u0019J";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "+\u0007W";
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
    
    static long a(final File p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   java/io/File.exists:()Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifne            24
        //    15: lconst_0       
        //    16: lstore          14
        //    18: lload           14
        //    20: lreturn        
        //    21: astore_3       
        //    22: aload_3        
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   java/io/File.isDirectory:()Z
        //    28: istore          8
        //    30: iload           8
        //    32: ifne            71
        //    35: iload_1        
        //    36: ifne            52
        //    39: aload_0        
        //    40: invokevirtual   java/io/File.length:()J
        //    43: lstore          32
        //    45: lload           32
        //    47: lconst_0       
        //    48: lcmp           
        //    49: ifle            69
        //    52: lconst_1       
        //    53: lreturn        
        //    54: astore          5
        //    56: aload           5
        //    58: athrow         
        //    59: astore          6
        //    61: aload           6
        //    63: athrow         
        //    64: astore          7
        //    66: aload           7
        //    68: athrow         
        //    69: lconst_0       
        //    70: lreturn        
        //    71: new             Ljava/util/LinkedList;
        //    74: dup            
        //    75: invokespecial   java/util/LinkedList.<init>:()V
        //    78: astore          9
        //    80: aload           9
        //    82: aload_0        
        //    83: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //    88: pop            
        //    89: lconst_0       
        //    90: lstore          11
        //    92: aload           9
        //    94: invokeinterface java/util/Queue.peek:()Ljava/lang/Object;
        //    99: ifnull          287
        //   102: aload           9
        //   104: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //   109: checkcast       Ljava/io/File;
        //   112: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   115: astore          13
        //   117: aload           13
        //   119: ifnull          280
        //   122: aload           13
        //   124: arraylength    
        //   125: istore          16
        //   127: iconst_0       
        //   128: istore          17
        //   130: iload           17
        //   132: iload           16
        //   134: if_icmpge       280
        //   137: aload           13
        //   139: iload           17
        //   141: aaload         
        //   142: astore          18
        //   144: aload           18
        //   146: invokevirtual   java/io/File.exists:()Z
        //   149: istore          24
        //   151: iload           24
        //   153: ifeq            273
        //   156: aload           18
        //   158: invokevirtual   java/io/File.isDirectory:()Z
        //   161: istore          26
        //   163: iload           26
        //   165: ifeq            182
        //   168: aload           9
        //   170: aload           18
        //   172: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //   177: pop            
        //   178: iload_2        
        //   179: ifeq            273
        //   182: iload_1        
        //   183: ifne            200
        //   186: aload           18
        //   188: invokevirtual   java/io/File.length:()J
        //   191: lstore          29
        //   193: lload           29
        //   195: lconst_0       
        //   196: lcmp           
        //   197: ifle            256
        //   200: lconst_1       
        //   201: lstore          27
        //   203: lload           11
        //   205: lload           27
        //   207: ladd           
        //   208: lstore          14
        //   210: iload           17
        //   212: iconst_1       
        //   213: iadd           
        //   214: istore          25
        //   216: iload_2        
        //   217: ifeq            262
        //   220: iload_2        
        //   221: ifne            18
        //   224: lload           14
        //   226: lstore          11
        //   228: goto            92
        //   231: astore          19
        //   233: aload           19
        //   235: athrow         
        //   236: astore          20
        //   238: aload           20
        //   240: athrow         
        //   241: astore          21
        //   243: aload           21
        //   245: athrow         
        //   246: astore          22
        //   248: aload           22
        //   250: athrow         
        //   251: astore          23
        //   253: aload           23
        //   255: athrow         
        //   256: lconst_0       
        //   257: lstore          27
        //   259: goto            203
        //   262: iload           25
        //   264: istore          17
        //   266: lload           14
        //   268: lstore          11
        //   270: goto            130
        //   273: lload           11
        //   275: lstore          14
        //   277: goto            210
        //   280: lload           11
        //   282: lstore          14
        //   284: goto            220
        //   287: lload           11
        //   289: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      10     21     24     Ljava/lang/RuntimeException;
        //  24     30     54     64     Ljava/lang/RuntimeException;
        //  39     45     64     69     Ljava/lang/RuntimeException;
        //  56     59     59     64     Ljava/lang/RuntimeException;
        //  61     64     64     69     Ljava/lang/RuntimeException;
        //  144    151    231    236    Ljava/lang/RuntimeException;
        //  156    163    236    241    Ljava/lang/RuntimeException;
        //  168    178    241    251    Ljava/lang/RuntimeException;
        //  186    193    251    256    Ljava/lang/RuntimeException;
        //  233    236    236    241    Ljava/lang/RuntimeException;
        //  238    241    241    251    Ljava/lang/RuntimeException;
        //  243    246    246    251    Ljava/lang/RuntimeException;
        //  248    251    251    256    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 146, Size: 146
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
    
    static Dialog a(final int n, final Activity activity, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener, final boolean b) {
        final e e = new e(n, activity, n2);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        Label_0169: {
            Label_0130: {
                try {
                    alertDialog$Builder.setCancelable(false);
                    alertDialog$Builder.setNegativeButton(2131230874, (DialogInterface$OnClickListener)new aa(dialogInterface$OnCancelListener));
                    switch (n) {
                        default: {
                            return GooglePlayServicesUtil.getErrorDialog(n, activity, n2, dialogInterface$OnCancelListener);
                        }
                        case 0: {
                            return null;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            break Label_0130;
                        }
                        case 3: {
                            break Label_0169;
                        }
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                int message;
                if (b) {
                    message = 2131232074;
                }
                else {
                    message = 2131232075;
                }
                return alertDialog$Builder.setTitle(2131232077).setMessage(message).setPositiveButton(2131232076, (DialogInterface$OnClickListener)e).create();
            }
            int message2;
            if (b) {
                message2 = 2131232083;
            }
            else {
                message2 = 2131232084;
            }
            return alertDialog$Builder.setTitle(2131232085).setMessage(message2).setPositiveButton(2131232082, (DialogInterface$OnClickListener)e).create();
        }
        int message3;
        if (b) {
            message3 = 2131232078;
        }
        else {
            message3 = 2131232079;
        }
        return alertDialog$Builder.setTitle(2131232081).setMessage(message3).setPositiveButton(2131232080, (DialogInterface$OnClickListener)e).create();
    }
    
    static String a(final File file) {
        return a(file, file.length());
    }
    
    static String a(final File p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     5: istore          4
        //     7: getstatic       com/whatsapp/gdrive/a7.z:[Ljava/lang/String;
        //    10: iconst_0       
        //    11: aaload         
        //    12: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //    15: astore          6
        //    17: aload_0        
        //    18: invokevirtual   java/io/File.exists:()Z
        //    21: istore          8
        //    23: iload           8
        //    25: ifne            47
        //    28: aconst_null    
        //    29: areturn        
        //    30: astore          5
        //    32: new             Ljava/lang/RuntimeException;
        //    35: dup            
        //    36: aload           5
        //    38: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //    41: athrow         
        //    42: astore          7
        //    44: aload           7
        //    46: athrow         
        //    47: aload_0        
        //    48: invokevirtual   java/io/File.length:()J
        //    51: lstore          10
        //    53: lload_1        
        //    54: lload           10
        //    56: lcmp           
        //    57: ifgt            28
        //    60: sipush          4096
        //    63: newarray        B
        //    65: astore          12
        //    67: aload           6
        //    69: invokevirtual   java/security/MessageDigest.reset:()V
        //    72: lconst_0       
        //    73: lstore          13
        //    75: new             Ljava/io/BufferedInputStream;
        //    78: dup            
        //    79: new             Ljava/io/FileInputStream;
        //    82: dup            
        //    83: aload_0        
        //    84: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    87: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    90: astore          15
        //    92: iload_3        
        //    93: iconst_m1      
        //    94: if_icmpeq       175
        //    97: aload           15
        //    99: aload           12
        //   101: iconst_0       
        //   102: aload           12
        //   104: arraylength    
        //   105: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   108: istore          19
        //   110: iload           19
        //   112: istore_3       
        //   113: iload_3        
        //   114: ifle            92
        //   117: lload           13
        //   119: iload_3        
        //   120: i2l            
        //   121: ladd           
        //   122: lload_1        
        //   123: lcmp           
        //   124: ifge            141
        //   127: aload           6
        //   129: aload           12
        //   131: iconst_0       
        //   132: iload_3        
        //   133: invokevirtual   java/security/MessageDigest.update:([BII)V
        //   136: iload           4
        //   138: ifeq            163
        //   141: lload_1        
        //   142: lload           13
        //   144: lsub           
        //   145: l2i            
        //   146: istore          20
        //   148: aload           6
        //   150: aload           12
        //   152: iconst_0       
        //   153: iload           20
        //   155: invokevirtual   java/security/MessageDigest.update:([BII)V
        //   158: iload           4
        //   160: ifeq            175
        //   163: lload           13
        //   165: iload_3        
        //   166: i2l            
        //   167: ladd           
        //   168: lstore          13
        //   170: iload           4
        //   172: ifeq            92
        //   175: aload           6
        //   177: invokevirtual   java/security/MessageDigest.digest:()[B
        //   180: invokestatic    com/whatsapp/al5.b:([B)Ljava/lang/String;
        //   183: astore          18
        //   185: aload           15
        //   187: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   190: aload           18
        //   192: areturn        
        //   193: astore          9
        //   195: aload           9
        //   197: athrow         
        //   198: astore          22
        //   200: aload           22
        //   202: athrow         
        //   203: astore          21
        //   205: aload           21
        //   207: athrow         
        //   208: astore          17
        //   210: getstatic       com/whatsapp/gdrive/a7.z:[Ljava/lang/String;
        //   213: iconst_1       
        //   214: aaload         
        //   215: aload           17
        //   217: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   220: aload           15
        //   222: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   225: aconst_null    
        //   226: areturn        
        //   227: astore          23
        //   229: aconst_null    
        //   230: astore          15
        //   232: aload           23
        //   234: astore          16
        //   236: aload           15
        //   238: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   241: aload           16
        //   243: athrow         
        //   244: astore          16
        //   246: goto            236
        //   249: astore          17
        //   251: aconst_null    
        //   252: astore          15
        //   254: goto            210
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  7      17     30     42     Ljava/security/NoSuchAlgorithmException;
        //  17     23     42     47     Ljava/security/NoSuchAlgorithmException;
        //  47     53     193    198    Ljava/security/NoSuchAlgorithmException;
        //  75     92     249    257    Ljava/io/IOException;
        //  75     92     227    236    Any
        //  97     110    208    210    Ljava/io/IOException;
        //  97     110    244    249    Any
        //  127    136    198    203    Ljava/security/NoSuchAlgorithmException;
        //  127    136    208    210    Ljava/io/IOException;
        //  127    136    244    249    Any
        //  148    158    203    208    Ljava/security/NoSuchAlgorithmException;
        //  148    158    208    210    Ljava/io/IOException;
        //  148    158    244    249    Any
        //  175    185    208    210    Ljava/io/IOException;
        //  175    185    244    249    Any
        //  200    203    203    208    Ljava/security/NoSuchAlgorithmException;
        //  200    203    208    210    Ljava/io/IOException;
        //  200    203    244    249    Any
        //  205    208    208    210    Ljava/io/IOException;
        //  205    208    244    249    Any
        //  210    220    244    249    Any
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
    
    static String a(String s) {
        if (s == null) {
            s = null;
        }
        else {
            final int index = s.indexOf("@");
            if (index > 1) {
                try {
                    return s.charAt(0) + a7.z[2] + s.substring(index - 1);
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
        }
        return s;
    }
    
    static String a(final String s, final String s2, final String s3) {
        return Uri.parse(s).buildUpon().appendQueryParameter(s2, s3).build().toString();
    }
    
    static void a(final HttpResponse httpResponse) {
        final int f = GoogleDriveService.F;
        final Header[] allHeaders = httpResponse.getAllHeaders();
        final int length = allHeaders.length;
        int i = 0;
        while (i < length) {
            final Header header = allHeaders[i];
            ++i;
            if (f != 0) {
                break;
            }
        }
    }
    
    static void a(final HttpRequestBase httpRequestBase) {
        final int f = GoogleDriveService.F;
        final Header[] allHeaders = httpRequestBase.getAllHeaders();
        final int length = allHeaders.length;
        int i = 0;
        while (i < length) {
            final Header header = allHeaders[i];
            ++i;
            if (f != 0) {
                break;
            }
        }
    }
    
    static long b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lconst_0       
        //     1: lstore_1       
        //     2: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: invokevirtual   java/io/File.exists:()Z
        //    10: istore          5
        //    12: iload           5
        //    14: ifne            24
        //    17: lload_1        
        //    18: lreturn        
        //    19: astore          4
        //    21: aload           4
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   java/io/File.isDirectory:()Z
        //    28: ifne            45
        //    31: aload_0        
        //    32: invokevirtual   java/io/File.length:()J
        //    35: lstore          19
        //    37: lload           19
        //    39: lreturn        
        //    40: astore          6
        //    42: aload           6
        //    44: athrow         
        //    45: new             Ljava/util/LinkedList;
        //    48: dup            
        //    49: invokespecial   java/util/LinkedList.<init>:()V
        //    52: astore          7
        //    54: aload           7
        //    56: aload_0        
        //    57: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //    62: pop            
        //    63: lload_1        
        //    64: lstore          9
        //    66: aload           7
        //    68: invokeinterface java/util/Queue.peek:()Ljava/lang/Object;
        //    73: ifnull          192
        //    76: aload           7
        //    78: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //    83: checkcast       Ljava/io/File;
        //    86: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    89: astore          11
        //    91: aload           11
        //    93: ifnull          186
        //    96: aload           11
        //    98: arraylength    
        //    99: istore          12
        //   101: lload           9
        //   103: lstore_1       
        //   104: iconst_0       
        //   105: istore          13
        //   107: iload           13
        //   109: iload           12
        //   111: if_icmpge       170
        //   114: aload           11
        //   116: iload           13
        //   118: aaload         
        //   119: astore          14
        //   121: aload           14
        //   123: invokevirtual   java/io/File.exists:()Z
        //   126: istore          17
        //   128: iload           17
        //   130: ifeq            163
        //   133: aload           14
        //   135: invokevirtual   java/io/File.isDirectory:()Z
        //   138: ifeq            155
        //   141: aload           7
        //   143: aload           14
        //   145: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //   150: pop            
        //   151: iload_3        
        //   152: ifeq            163
        //   155: lload_1        
        //   156: aload           14
        //   158: invokevirtual   java/io/File.length:()J
        //   161: ladd           
        //   162: lstore_1       
        //   163: iinc            13, 1
        //   166: iload_3        
        //   167: ifeq            107
        //   170: iload_3        
        //   171: ifeq            63
        //   174: lload_1        
        //   175: lreturn        
        //   176: astore          15
        //   178: aload           15
        //   180: athrow         
        //   181: astore          16
        //   183: aload           16
        //   185: athrow         
        //   186: lload           9
        //   188: lstore_1       
        //   189: goto            170
        //   192: lload           9
        //   194: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  6      12     19     24     Ljava/lang/RuntimeException;
        //  24     37     40     45     Ljava/lang/RuntimeException;
        //  121    128    176    181    Ljava/lang/RuntimeException;
        //  133    151    181    186    Ljava/lang/RuntimeException;
        //  178    181    181    186    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0155:
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
    
    static String b(final String s) {
        return s.replace(App.M.getAbsolutePath() + "/", "");
    }
    
    static String c(final String s) {
        String absolutePath = new File(App.M.getAbsolutePath(), s).getAbsolutePath();
        try {
            if (!absolutePath.startsWith(App.M.getAbsolutePath())) {
                absolutePath = null;
            }
            return absolutePath;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
}
