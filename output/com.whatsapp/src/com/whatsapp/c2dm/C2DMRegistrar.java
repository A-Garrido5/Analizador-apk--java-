// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.c2dm;

import com.whatsapp.App;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.content.Context;
import java.util.Random;
import android.app.IntentService;

public class C2DMRegistrar extends IntentService
{
    private static final String b;
    public static int c;
    private static final String e;
    private static final String[] z;
    private final Random a;
    private final a d;
    
    static {
        final String[] z2 = new String[33];
        String s = "C;\u001b'ua\u001f?{sa\n3l(j\u001d!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0857:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0007';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "C;\u001b'ua\u001f?{sa\n3l(!\u000bviwt.3ztm\u001785\"`";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW3zuk\ny-t";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "W=\u0004^NG=\tFHP'\u0017^FM4\u0017JKA";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW3zuk\ny-t";
                    n = 3;
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "v\u001d0zbw\u0010";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW$mav\u001d%`";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "g\u0017;&`k\u00171db*\u00198luk\u00112&d6\u001c;&nj\f3fs**\u0013ONW,\u0004ISM7\u0018";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "v\u001d0zbw\u0010";
                    n2 = 8;
                    array = z2;
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "c\u001b;";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW$mvq\u001d%|";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW!inp\u00118o";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW%mdq\n?|~A\u00005mwp\u00119f";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "e\u00147zj";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "w\u001d8lbv";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "g\u0017;&`k\u00171db*\u00198luk\u00112&`i\u000b";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW4ido\u00170n'!\u001c;{";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "C;\u001b'ua\t#mtp\n3onw\f$ism\u00178";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "6Ae121Lb9?7L";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "g\u0017;&`k\u00171db*\u00198luk\u00112&d6\u001c;&nj\f3fs**\u0013ONW,\u0013Z";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "e\b&";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "g\u0017;&`k\u00171db*\u00198luk\u00112&d6\u001c;&nj\f3fs**\u0013ONW,\u0004ISM7\u0018";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "C;\u001b'ua\u001e$mtl";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "v\u001d1atp\n7|nk\u0016\tac";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "g\u0017;&`k\u00171db*\u00198luk\u00112&d6\u001c;&nj\f3fs**\u0013ONW,\u0004ISM7\u0018";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "v\u001d1atp\n7|nk\u0016\tac";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW%|fv\fv{fr\u001d25\"wX%mur\u001d$5\"wX7xwR\u001d${nk\u0016k-c$\u000b7~b`9&xQa\n%ahjEsl";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "C;\u001b'hj07fch\u001d\u001ffsa\u0016\"(nj\f3fs9P8}khQv";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "v\u001d1atp\n7|nk\u0016\tac";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "C;\u001b'ua\u001f?{sv\u0019\"ahjW#flj\u0017!fNj\f3fs>Xs{";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "v\u001d0zbw\u0010";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "C;\u001b'hj07fch\u001d\u001ffsa\u0016\"'ek\u001f#{=$]%";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "a\n$gu";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    break Label_0857;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        e = C2DMRegistrar.class.getCanonicalName();
        final StringBuilder append = new StringBuilder().append(C2DMRegistrar.e);
        final char[] charArray2 = "*+\u0002IUP".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '\u0007';
                    break;
                }
                case 0: {
                    c4 = '\u0004';
                    break;
                }
                case 1: {
                    c4 = 'x';
                    break;
                }
                case 2: {
                    c4 = 'V';
                    break;
                }
                case 3: {
                    c4 = '\b';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        b = append.append(new String(charArray2).intern()).toString();
    }
    
    public C2DMRegistrar() {
        super(C2DMRegistrar.e);
        this.a = new Random();
        this.d = new a((Context)this);
    }
    
    private void a() {
        Log.i(C2DMRegistrar.z[22]);
        this.a(false);
    }
    
    public static void a(final Context context) {
        Log.i(C2DMRegistrar.z[6]);
        final Intent intent = new Intent(C2DMRegistrar.z[7]);
        intent.putExtra(C2DMRegistrar.z[5], C2DMRegistrar.z[8]);
        a(context, intent);
    }
    
    static void a(final Context context, final Intent intent) {
        intent.setClassName(context, C2DMRegistrar.e);
        context.startService(intent);
    }
    
    public static void a(final Context context, final String s) {
        final Intent intent = new Intent(C2DMRegistrar.b);
        Label_0027: {
            if (s == null) {
                break Label_0027;
            }
            try {
                intent.putExtra(C2DMRegistrar.z[23], s);
                a(context, intent);
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //     4: iconst_3       
        //     5: aaload         
        //     6: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     9: istore          4
        //    11: iload           4
        //    13: ifeq            51
        //    16: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    19: iconst_4       
        //    20: aaload         
        //    21: aconst_null    
        //    22: iconst_1       
        //    23: anewarray       Ljava/lang/Object;
        //    26: dup            
        //    27: iconst_0       
        //    28: aload_1        
        //    29: aastore        
        //    30: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    33: aload_0        
        //    34: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    37: invokevirtual   com/whatsapp/c2dm/a.d:()V
        //    40: aload_0        
        //    41: iconst_1       
        //    42: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.a:(Z)V
        //    45: getstatic       com/whatsapp/c2dm/C2DMRegistrar.c:I
        //    48: ifeq            89
        //    51: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    54: iconst_2       
        //    55: aaload         
        //    56: aconst_null    
        //    57: iconst_1       
        //    58: anewarray       Ljava/lang/Object;
        //    61: dup            
        //    62: iconst_0       
        //    63: aload_1        
        //    64: aastore        
        //    65: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    72: invokevirtual   com/whatsapp/c2dm/a.e:()V
        //    75: aload_0        
        //    76: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    79: invokevirtual   com/whatsapp/c2dm/a.c:()V
        //    82: return         
        //    83: astore_2       
        //    84: aload_2        
        //    85: athrow         
        //    86: astore_3       
        //    87: aload_3        
        //    88: athrow         
        //    89: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      11     83     86     Ljava/lang/SecurityException;
        //  16     51     86     89     Ljava/lang/SecurityException;
        //  51     82     86     89     Ljava/lang/SecurityException;
        //  84     86     86     89     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/c2dm/C2DMRegistrar.c:I
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //     7: bipush          17
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: new             Landroid/content/Intent;
        //    16: dup            
        //    17: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    20: bipush          19
        //    22: aaload         
        //    23: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    26: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    29: bipush          15
        //    31: aaload         
        //    32: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //    35: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    38: bipush          20
        //    40: aaload         
        //    41: aload_0        
        //    42: iconst_0       
        //    43: new             Landroid/content/Intent;
        //    46: dup            
        //    47: invokespecial   android/content/Intent.<init>:()V
        //    50: iconst_0       
        //    51: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //    54: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //    57: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    60: bipush          14
        //    62: aaload         
        //    63: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    66: bipush          18
        //    68: aaload         
        //    69: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    72: astore_3       
        //    73: aload_0        
        //    74: iconst_0       
        //    75: aload_3        
        //    76: ldc             536870912
        //    78: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //    81: astore          4
        //    83: iload_1        
        //    84: ifne            107
        //    87: aload           4
        //    89: ifnull          107
        //    92: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    95: bipush          11
        //    97: aaload         
        //    98: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   101: return         
        //   102: astore          15
        //   104: aload           15
        //   106: athrow         
        //   107: aload_0        
        //   108: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.b:()J
        //   111: lstore          5
        //   113: lload           5
        //   115: lconst_0       
        //   116: lcmp           
        //   117: ifle            219
        //   120: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   123: bipush          16
        //   125: aaload         
        //   126: astore          9
        //   128: iconst_1       
        //   129: anewarray       Ljava/lang/Object;
        //   132: astore          10
        //   134: aload           10
        //   136: iconst_0       
        //   137: lload           5
        //   139: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   142: aastore        
        //   143: aload           9
        //   145: aconst_null    
        //   146: aload           10
        //   148: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   151: aload_0        
        //   152: iconst_0       
        //   153: aload_3        
        //   154: iconst_0       
        //   155: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   158: astore          11
        //   160: aload_0        
        //   161: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   164: bipush          13
        //   166: aaload         
        //   167: invokevirtual   com/whatsapp/c2dm/C2DMRegistrar.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   170: checkcast       Landroid/app/AlarmManager;
        //   173: astore          12
        //   175: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   178: bipush          19
        //   180: if_icmplt       201
        //   183: aload           12
        //   185: iconst_3       
        //   186: lload           5
        //   188: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   191: ladd           
        //   192: aload           11
        //   194: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //   197: iload_2        
        //   198: ifeq            215
        //   201: aload           12
        //   203: iconst_3       
        //   204: lload           5
        //   206: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   209: ladd           
        //   210: aload           11
        //   212: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   215: iload_2        
        //   216: ifeq            101
        //   219: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   222: bipush          10
        //   224: aaload         
        //   225: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   228: aload_0        
        //   229: aload_3        
        //   230: invokevirtual   com/whatsapp/c2dm/C2DMRegistrar.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   233: pop            
        //   234: return         
        //   235: astore          7
        //   237: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   240: bipush          12
        //   242: aaload         
        //   243: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   246: return         
        //   247: astore          13
        //   249: aload           13
        //   251: athrow         
        //   252: astore          14
        //   254: aload           14
        //   256: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  92     101    102    107    Ljava/lang/SecurityException;
        //  175    197    247    252    Ljava/lang/SecurityException;
        //  201    215    252    257    Ljava/lang/SecurityException;
        //  228    234    235    247    Ljava/lang/SecurityException;
        //  249    252    252    257    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0201:
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
    
    private long b() {
        final int f = this.d.f();
        if (f == 0) {
            return 0L;
        }
        return (long)((0.5 + this.a.nextDouble()) * (15000L * (1L << Math.min(f - 1, 10))));
    }
    
    private void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //     4: invokevirtual   com/whatsapp/c2dm/a.a:()I
        //     7: istore_2       
        //     8: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    11: iconst_1       
        //    12: aaload         
        //    13: astore          4
        //    15: iconst_2       
        //    16: anewarray       Ljava/lang/Object;
        //    19: astore          5
        //    21: aload           5
        //    23: iconst_0       
        //    24: aload_1        
        //    25: aastore        
        //    26: aload           5
        //    28: iconst_1       
        //    29: iload_2        
        //    30: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    33: aastore        
        //    34: aload           4
        //    36: aconst_null    
        //    37: aload           5
        //    39: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    46: invokevirtual   com/whatsapp/c2dm/a.g:()V
        //    49: aload_0        
        //    50: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    53: invokevirtual   com/whatsapp/c2dm/a.j:()Ljava/lang/String;
        //    56: ifnonnull       72
        //    59: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    62: iconst_0       
        //    63: aaload         
        //    64: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: iconst_0       
        //    69: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;I)V
        //    72: aload_0        
        //    73: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    76: aload_1        
        //    77: invokevirtual   com/whatsapp/c2dm/a.a:(Ljava/lang/String;)V
        //    80: iload_2        
        //    81: ifle            92
        //    84: aload_0        
        //    85: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //    88: iload_2        
        //    89: invokevirtual   com/whatsapp/c2dm/a.a:(I)V
        //    92: aload_0        
        //    93: aload_1        
        //    94: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.c:(Ljava/lang/String;)V
        //    97: return         
        //    98: astore_3       
        //    99: aload_3        
        //   100: athrow         
        //   101: astore          6
        //   103: aload           6
        //   105: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  8      72     98     101    Ljava/lang/SecurityException;
        //  72     80     101    106    Ljava/lang/SecurityException;
        //  84     92     101    106    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
    
    public static boolean b(final Context context) {
        return new a(context).h();
    }
    
    private void c(final String s) {
        App.b(s, C2DMRegistrar.z[9]);
    }
    
    public void onHandleIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/c2dm/C2DMRegistrar.c:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnonnull       21
        //     8: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    11: bipush          27
        //    13: aaload         
        //    14: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    17: iload_2        
        //    18: ifeq            308
        //    21: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    24: bipush          24
        //    26: aaload         
        //    27: aload_1        
        //    28: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    31: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    34: istore          4
        //    36: iload           4
        //    38: ifeq            142
        //    41: aload_1        
        //    42: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    45: bipush          32
        //    47: aaload         
        //    48: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    51: astore          19
        //    53: aload_1        
        //    54: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    57: bipush          30
        //    59: aaload         
        //    60: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    63: astore          20
        //    65: aload_1        
        //    66: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //    69: bipush          28
        //    71: aaload         
        //    72: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    75: astore          21
        //    77: aload           19
        //    79: ifnull          92
        //    82: aload_0        
        //    83: aload           19
        //    85: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.a:(Ljava/lang/String;)V
        //    88: iload_2        
        //    89: ifeq            138
        //    92: aload           20
        //    94: ifnull          105
        //    97: aload_0        
        //    98: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.a:()V
        //   101: iload_2        
        //   102: ifeq            138
        //   105: aload           21
        //   107: ifnull          120
        //   110: aload_0        
        //   111: aload           21
        //   113: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.b:(Ljava/lang/String;)V
        //   116: iload_2        
        //   117: ifeq            138
        //   120: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   123: bipush          29
        //   125: aaload         
        //   126: aconst_null    
        //   127: iconst_1       
        //   128: anewarray       Ljava/lang/Object;
        //   131: dup            
        //   132: iconst_0       
        //   133: aload_1        
        //   134: aastore        
        //   135: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   138: iload_2        
        //   139: ifeq            308
        //   142: getstatic       com/whatsapp/c2dm/C2DMRegistrar.b:Ljava/lang/String;
        //   145: aload_1        
        //   146: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   149: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   152: istore          6
        //   154: iload           6
        //   156: ifeq            290
        //   159: aload_1        
        //   160: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   163: bipush          25
        //   165: aaload         
        //   166: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   169: astore          8
        //   171: aload_0        
        //   172: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //   175: invokevirtual   com/whatsapp/c2dm/a.j:()Ljava/lang/String;
        //   178: astore          9
        //   180: aload_0        
        //   181: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //   184: invokevirtual   com/whatsapp/c2dm/a.a:()I
        //   187: istore          10
        //   189: aload_0        
        //   190: getfield        com/whatsapp/c2dm/C2DMRegistrar.d:Lcom/whatsapp/c2dm/a;
        //   193: invokevirtual   com/whatsapp/c2dm/a.i:()I
        //   196: istore          11
        //   198: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   201: bipush          26
        //   203: aaload         
        //   204: astore          16
        //   206: iconst_4       
        //   207: anewarray       Ljava/lang/Object;
        //   210: astore          17
        //   212: aload           17
        //   214: iconst_0       
        //   215: aload           9
        //   217: aastore        
        //   218: aload           17
        //   220: iconst_1       
        //   221: aload           8
        //   223: aastore        
        //   224: aload           17
        //   226: iconst_2       
        //   227: iload           10
        //   229: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   232: aastore        
        //   233: aload           17
        //   235: iconst_3       
        //   236: iload           11
        //   238: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   241: aastore        
        //   242: aload           16
        //   244: aconst_null    
        //   245: aload           17
        //   247: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   250: aload           9
        //   252: ifnull          281
        //   255: aload           8
        //   257: ifnull          281
        //   260: aload           8
        //   262: aload           9
        //   264: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   267: istore          18
        //   269: iload           18
        //   271: ifeq            281
        //   274: iload           10
        //   276: iload           11
        //   278: if_icmpeq       286
        //   281: aload_0        
        //   282: iconst_0       
        //   283: invokespecial   com/whatsapp/c2dm/C2DMRegistrar.a:(Z)V
        //   286: iload_2        
        //   287: ifeq            308
        //   290: getstatic       com/whatsapp/c2dm/C2DMRegistrar.z:[Ljava/lang/String;
        //   293: bipush          31
        //   295: aaload         
        //   296: aconst_null    
        //   297: iconst_1       
        //   298: anewarray       Ljava/lang/Object;
        //   301: dup            
        //   302: iconst_0       
        //   303: aload_1        
        //   304: aastore        
        //   305: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   308: return         
        //   309: astore_3       
        //   310: aload_3        
        //   311: athrow         
        //   312: astore          25
        //   314: aload           25
        //   316: athrow         
        //   317: astore          26
        //   319: aload           26
        //   321: athrow         
        //   322: astore          23
        //   324: aload           23
        //   326: athrow         
        //   327: astore          24
        //   329: aload           24
        //   331: athrow         
        //   332: astore          22
        //   334: aload           22
        //   336: athrow         
        //   337: astore          5
        //   339: aload           5
        //   341: athrow         
        //   342: astore          12
        //   344: aload           12
        //   346: athrow         
        //   347: astore          13
        //   349: aload           13
        //   351: athrow         
        //   352: astore          14
        //   354: aload           14
        //   356: athrow         
        //   357: astore          15
        //   359: aload           15
        //   361: athrow         
        //   362: astore          7
        //   364: aload           7
        //   366: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  8      17     309    312    Ljava/lang/SecurityException;
        //  21     36     309    312    Ljava/lang/SecurityException;
        //  82     88     312    322    Ljava/lang/SecurityException;
        //  97     101    322    332    Ljava/lang/SecurityException;
        //  110    116    332    337    Ljava/lang/SecurityException;
        //  120    138    332    337    Ljava/lang/SecurityException;
        //  142    154    337    342    Ljava/lang/SecurityException;
        //  198    250    342    352    Ljava/lang/SecurityException;
        //  260    269    352    357    Ljava/lang/SecurityException;
        //  281    286    357    362    Ljava/lang/SecurityException;
        //  290    308    362    367    Ljava/lang/SecurityException;
        //  314    317    317    322    Ljava/lang/SecurityException;
        //  319    322    322    332    Ljava/lang/SecurityException;
        //  324    327    327    332    Ljava/lang/SecurityException;
        //  329    332    332    337    Ljava/lang/SecurityException;
        //  344    347    347    352    Ljava/lang/SecurityException;
        //  349    352    352    357    Ljava/lang/SecurityException;
        //  354    357    357    362    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
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
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        while (true) {
            Label_0046: {
                if (intent == null) {
                    break Label_0046;
                }
                try {
                    if (C2DMRegistrar.z[21].equals(intent.getAction())) {
                        final boolean intentRedelivery = true;
                        this.setIntentRedelivery(intentRedelivery);
                        return super.onStartCommand(intent, n, n2);
                    }
                }
                catch (SecurityException ex) {
                    throw ex;
                }
            }
            final boolean intentRedelivery = false;
            continue;
        }
    }
}
