// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import android.content.Intent;
import java.io.IOException;
import java.io.File;
import com.twitter.android.bh;
import java.io.BufferedOutputStream;
import java.util.HashMap;
import android.app.IntentService;

public class MetricsLoggerService extends IntentService
{
    private static final HashMap a;
    private static String b;
    private BufferedOutputStream c;
    
    static {
        (a = new HashMap()).put("write", 1);
        MetricsLoggerService.a.put("begin", 2);
        MetricsLoggerService.a.put("end", 3);
        MetricsLoggerService.b = "/sdcard/twitter-metrics";
    }
    
    public MetricsLoggerService() {
        super("MetricsLogger");
        if (bh.a != null) {
            MetricsLoggerService.b = "/sdcard/" + bh.a;
        }
    }
    
    public void onCreate() {
        super.onCreate();
        try {
            final File file = new File(MetricsLoggerService.b);
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch (IOException ex) {}
    }
    
    public void onDestroy() {
        while (true) {
            try {
                this.c.close();
                super.onDestroy();
            }
            catch (IOException ex) {
                ex.printStackTrace();
                continue;
            }
            break;
        }
    }
    
    protected void onHandleIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //     4: astore_2       
        //     5: getstatic       com/twitter/android/metrics/MetricsLoggerService.a:Ljava/util/HashMap;
        //     8: aload_2        
        //     9: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Ljava/lang/Integer;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       80
        //    20: iconst_0       
        //    21: istore          4
        //    23: aload_0        
        //    24: new             Ljava/io/BufferedOutputStream;
        //    27: dup            
        //    28: new             Ljava/io/FileOutputStream;
        //    31: dup            
        //    32: getstatic       com/twitter/android/metrics/MetricsLoggerService.b:Ljava/lang/String;
        //    35: iconst_1       
        //    36: invokespecial   java/io/FileOutputStream.<init>:(Ljava/lang/String;Z)V
        //    39: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    42: putfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //    45: iload           4
        //    47: tableswitch {
        //                2: 120
        //                3: 100
        //                4: 239
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //    76: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    79: return         
        //    80: aload_3        
        //    81: invokevirtual   java/lang/Integer.intValue:()I
        //    84: istore          4
        //    86: goto            23
        //    89: astore          5
        //    91: ldc             "MetricsLogger"
        //    93: ldc             "symlink '/sdcard' doesn't exist"
        //    95: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    98: pop            
        //    99: return         
        //   100: aload_0        
        //   101: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //   104: ldc             "\n["
        //   106: invokevirtual   java/lang/String.getBytes:()[B
        //   109: invokevirtual   java/io/BufferedOutputStream.write:([B)V
        //   112: goto            72
        //   115: astore          17
        //   117: goto            72
        //   120: aconst_null    
        //   121: astore          10
        //   123: new             Ljava/io/File;
        //   126: dup            
        //   127: getstatic       com/twitter/android/metrics/MetricsLoggerService.b:Ljava/lang/String;
        //   130: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   133: astore          11
        //   135: new             Ljava/io/RandomAccessFile;
        //   138: dup            
        //   139: aload           11
        //   141: ldc             "r"
        //   143: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   146: astore          12
        //   148: aload           11
        //   150: invokevirtual   java/io/File.length:()J
        //   153: lconst_0       
        //   154: lcmp           
        //   155: ifle            192
        //   158: aload           12
        //   160: aload           11
        //   162: invokevirtual   java/io/File.length:()J
        //   165: lconst_1       
        //   166: lsub           
        //   167: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   170: bipush          91
        //   172: aload           12
        //   174: invokevirtual   java/io/RandomAccessFile.readByte:()B
        //   177: if_icmpeq       192
        //   180: aload_0        
        //   181: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //   184: ldc             ","
        //   186: invokevirtual   java/lang/String.getBytes:()[B
        //   189: invokevirtual   java/io/BufferedOutputStream.write:([B)V
        //   192: aload           12
        //   194: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   197: aload_1        
        //   198: ldc             "log"
        //   200: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   203: checkcast       Lcom/twitter/library/scribe/performance/PerformanceScribeLog;
        //   206: aload_0        
        //   207: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //   210: invokevirtual   com/twitter/library/scribe/performance/PerformanceScribeLog.a:(Ljava/io/OutputStream;)V
        //   213: goto            72
        //   216: astore          16
        //   218: aconst_null    
        //   219: astore          12
        //   221: aload           12
        //   223: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   226: goto            197
        //   229: astore          15
        //   231: aload           10
        //   233: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   236: aload           15
        //   238: athrow         
        //   239: aload_0        
        //   240: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //   243: ldc             "]"
        //   245: invokevirtual   java/lang/String.getBytes:()[B
        //   248: invokevirtual   java/io/BufferedOutputStream.write:([B)V
        //   251: aload_0        
        //   252: getfield        com/twitter/android/metrics/MetricsLoggerService.c:Ljava/io/BufferedOutputStream;
        //   255: invokevirtual   java/io/BufferedOutputStream.flush:()V
        //   258: new             Landroid/content/Intent;
        //   261: dup            
        //   262: ldc             "write_finished"
        //   264: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   267: astore          8
        //   269: aload_0        
        //   270: invokevirtual   com/twitter/android/metrics/MetricsLoggerService.getApplicationContext:()Landroid/content/Context;
        //   273: invokestatic    android/support/v4/content/LocalBroadcastManager.getInstance:(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
        //   276: aload           8
        //   278: invokevirtual   android/support/v4/content/LocalBroadcastManager.sendBroadcast:(Landroid/content/Intent;)Z
        //   281: pop            
        //   282: goto            72
        //   285: astore          7
        //   287: goto            258
        //   290: astore          14
        //   292: aload           12
        //   294: astore          10
        //   296: aload           14
        //   298: astore          15
        //   300: goto            231
        //   303: astore          13
        //   305: goto            221
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     45     89     100    Ljava/io/IOException;
        //  100    112    115    120    Ljava/io/IOException;
        //  123    148    216    221    Ljava/io/IOException;
        //  123    148    229    231    Any
        //  148    192    303    308    Ljava/io/IOException;
        //  148    192    290    303    Any
        //  239    258    285    290    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0192:
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
