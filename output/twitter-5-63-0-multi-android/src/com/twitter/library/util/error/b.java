// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.error;

import java.lang.reflect.Field;
import android.util.SparseIntArray;
import android.database.CursorWindow;
import java.io.File;
import android.graphics.Bitmap;
import com.twitter.library.client.al;
import java.util.Iterator;
import android.util.Pair;
import com.twitter.library.client.an;
import android.app.Service;
import java.util.Collection;
import java.util.List;
import com.twitter.library.media.util.m;
import java.util.ArrayList;
import com.twitter.library.client.aj;
import com.twitter.library.client.p;
import com.twitter.library.media.manager.h;
import java.util.Map;
import com.twitter.library.media.manager.q;
import android.app.Activity;
import com.twitter.util.c;
import android.os.Debug;
import com.twitter.library.client.ad;
import com.twitter.library.client.App;
import java.text.NumberFormat;
import java.util.Locale;
import com.twitter.errorreporter.a;

public class b extends a
{
    public b(final Throwable t) {
        final NumberFormat integerInstance = NumberFormat.getIntegerInstance(Locale.ENGLISH);
    Label_0857:
        while (true) {
            Service service = null;
            Object[] array2 = null;
            int n4 = 0;
            try {
                this.a("OutOfMemoryErrorLog.jvm_uptime", a(System.currentTimeMillis() - App.p()));
                this.a("OutOfMemoryErrorLog.foreground_time", a(ad.a().d()));
                final Runtime runtime = Runtime.getRuntime();
                this.a("OutOfMemoryErrorLog.dalvik_heap_max", integerInstance.format(runtime.maxMemory()));
                this.a("OutOfMemoryErrorLog.dalvik_heap_total", integerInstance.format(runtime.totalMemory()));
                this.a("OutOfMemoryErrorLog.dalvik_heap_used", integerInstance.format(runtime.totalMemory() - runtime.freeMemory()));
                this.a("OutOfMemoryErrorLog.dalvik_heap_free", integerInstance.format(runtime.freeMemory()));
                this.a("OutOfMemoryErrorLog.native_heap_total", integerInstance.format(Debug.getNativeHeapSize()));
                this.a("OutOfMemoryErrorLog.native_heap_used", integerInstance.format(Debug.getNativeHeapAllocatedSize()));
                this.a("OutOfMemoryErrorLog.native_heap_free", integerInstance.format(Debug.getNativeHeapFreeSize()));
                if (!c.a()) {
                    this.a("OutOfMemoryErrorLog.activity_count", a(Activity.class));
                    this.a("OutOfMemoryErrorLog.file_descriptor_count", b());
                    this.a("OutOfMemoryErrorLog.active_cursor_count", c());
                    final Pair d = d();
                    this.a("OutOfMemoryErrorLog.cursor_memory_kbs", d.first);
                    this.a("OutOfMemoryErrorLog.other_shared_memory_kbs", d.second);
                }
                final q a = q.a();
                if (a != null) {
                    for (final Map.Entry<String, V> entry : a.g().entrySet()) {
                        final String s = entry.getKey();
                        final Collection b = ((h)entry.getValue()).a().b();
                        this.a(String.format("OutOfMemoryErrorLog.%s_cache_bitmap_count", s), b.size());
                        this.a(String.format("OutOfMemoryErrorLog.%s_cache_bitmap_size", s), integerInstance.format(a(b)));
                    }
                }
                final Activity b2 = p.a().b();
                if (b2 != null) {
                    this.a("OutOfMemoryErrorLog.current_activity", b2.getClass().getSimpleName());
                }
                final aj a2 = aj.a();
                Label_0766: {
                    if (a2 == null) {
                        break Label_0766;
                    }
                    final al b3 = a2.b();
                    this.a("OutOfMemoryErrorLog.created_activity_count", b3.a());
                    final List b4 = b3.b();
                    this.a("OutOfMemoryErrorLog.active_activity_count", b4.size());
                    final ArrayList list = new ArrayList();
                    final Iterator<Activity> iterator2 = b4.iterator();
                    int n = 0;
                    while (iterator2.hasNext()) {
                        final Activity activity = iterator2.next();
                        m.a(activity, list);
                        final long a3 = a(list);
                        if (a3 > 1048576L) {
                            ++n;
                            this.a(String.format("OutOfMemoryErrorLog.activity_name_%d", n), activity.getClass().getSimpleName());
                            this.a(String.format("OutOfMemoryErrorLog.activity_bitmap_count_%d", n), list.size());
                            this.a(String.format("OutOfMemoryErrorLog.activity_bitmap_size_%d", n), integerInstance.format(a3));
                        }
                        final int n2 = n;
                        list.clear();
                        n = n2;
                    }
                    final List c = b3.c();
                    this.a("OutOfMemoryErrorLog.leaked_activity_count", c.size());
                    final Iterator<Activity> iterator3 = c.iterator();
                    int n3 = 0;
                Block_14_Outer:
                    while (true) {
                        if (!iterator3.hasNext()) {
                            break Label_0766;
                        }
                        final Activity activity2 = iterator3.next();
                        final Object[] array = { null };
                        ++n3;
                        try {
                            array[0] = n3;
                            this.a(String.format("OutOfMemoryErrorLog.leaked_activity_name_%d", array), activity2.getClass().getSimpleName());
                            continue Block_14_Outer;
                            // iftrue(Label_0379:, !iterator4.hasNext())
                            while (true) {
                                final Iterator<Service> iterator4;
                                service = iterator4.next();
                                array2 = new Object[] { null };
                                ++n4;
                                continue;
                            }
                            final an a4;
                            final al b5 = a4.b();
                            this.a("OutOfMemoryErrorLog.created_service_count", b5.a());
                            this.a("OutOfMemoryErrorLog.active_service_count", b5.b().size());
                            final List c2 = b5.c();
                            this.a("OutOfMemoryErrorLog.leaked_service_count", c2.size());
                            final Iterator<Service> iterator4 = c2.iterator();
                            n4 = 0;
                            continue Label_0857;
                            a4 = an.a();
                        }
                        // iftrue(Label_0379:, a4 == null)
                        catch (Throwable t2) {}
                        break;
                    }
                }
                Label_0379: {
                    this.a(t);
                }
                return;
            }
            catch (Throwable t3) {}
            array2[0] = n4;
            this.a(String.format("OutOfMemoryErrorLog.leaked_service_name_%d", array2), service.getClass().getSimpleName());
            continue Label_0857;
        }
    }
    
    private static long a(final Class clazz) {
        try {
            return (long)Debug.class.getMethod("countInstancesOfClass", Class.class).invoke(null, clazz);
        }
        catch (Throwable t) {
            return 0L;
        }
    }
    
    private static long a(final Collection collection) {
        final Iterator<Bitmap> iterator = collection.iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            n += m.b(iterator.next());
        }
        return n;
    }
    
    private static String a(final long n) {
        return String.format("%d:%02d:%02d.%03d", n / 3600000L, n / 60000L % 60L, n / 1000L % 60L, n % 1000L);
    }
    
    private static int b() {
        try {
            return new File("/proc/self/fd").listFiles().length;
        }
        catch (Throwable t) {
            return 0;
        }
    }
    
    private static int c() {
        try {
            final Field declaredField = CursorWindow.class.getDeclaredField("sWindowToPidMap");
            declaredField.setAccessible(true);
            return ((SparseIntArray)declaredField.get(null)).size();
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private static Pair d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/os/Debug$MemoryInfo;
        //     3: dup            
        //     4: invokespecial   android/os/Debug$MemoryInfo.<init>:()V
        //     7: astore_0       
        //     8: aload_0        
        //     9: invokestatic    android/os/Debug.getMemoryInfo:(Landroid/os/Debug$MemoryInfo;)V
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: astore          4
        //    18: aload           4
        //    20: iconst_0       
        //    21: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    24: aastore        
        //    25: ldc_w           Landroid/os/Debug$MemoryInfo;.class
        //    28: ldc_w           "getOtherPss"
        //    31: aload           4
        //    33: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    36: astore          5
        //    38: iconst_1       
        //    39: anewarray       Ljava/lang/Class;
        //    42: astore          6
        //    44: aload           6
        //    46: iconst_0       
        //    47: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    50: aastore        
        //    51: ldc_w           Landroid/os/Debug$MemoryInfo;.class
        //    54: ldc_w           "getOtherLabel"
        //    57: aload           6
        //    59: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    62: astore          7
        //    64: iconst_0       
        //    65: istore          8
        //    67: iconst_0       
        //    68: istore_2       
        //    69: iconst_0       
        //    70: istore_3       
        //    71: iload           8
        //    73: iconst_5       
        //    74: if_icmpge       261
        //    77: iconst_1       
        //    78: anewarray       Ljava/lang/Object;
        //    81: astore          10
        //    83: aload           10
        //    85: iconst_0       
        //    86: iload           8
        //    88: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    91: aastore        
        //    92: aload           7
        //    94: aload_0        
        //    95: aload           10
        //    97: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   100: checkcast       Ljava/lang/String;
        //   103: astore          11
        //   105: aload           11
        //   107: invokevirtual   java/lang/String.hashCode:()I
        //   110: lookupswitch {
        //          1970305983: 153
        //          2029715318: 136
        //          default: 278
        //        }
        //   136: aload           11
        //   138: ldc_w           "Cursor"
        //   141: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   144: ifeq            278
        //   147: iconst_0       
        //   148: istore          12
        //   150: goto            281
        //   153: aload           11
        //   155: ldc_w           "Ashmem"
        //   158: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   161: ifeq            278
        //   164: iconst_1       
        //   165: istore          12
        //   167: goto            281
        //   170: iconst_1       
        //   171: anewarray       Ljava/lang/Object;
        //   174: astore          17
        //   176: aload           17
        //   178: iconst_0       
        //   179: iload           8
        //   181: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   184: aastore        
        //   185: aload           5
        //   187: aload_0        
        //   188: aload           17
        //   190: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   193: checkcast       Ljava/lang/Integer;
        //   196: invokevirtual   java/lang/Integer.intValue:()I
        //   199: istore          18
        //   201: iload_2        
        //   202: istore          19
        //   204: iload           18
        //   206: istore          16
        //   208: iload           19
        //   210: istore          15
        //   212: goto            310
        //   215: iconst_1       
        //   216: anewarray       Ljava/lang/Object;
        //   219: astore          13
        //   221: aload           13
        //   223: iconst_0       
        //   224: iload           8
        //   226: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   229: aastore        
        //   230: aload           5
        //   232: aload_0        
        //   233: aload           13
        //   235: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   238: checkcast       Ljava/lang/Integer;
        //   241: invokevirtual   java/lang/Integer.intValue:()I
        //   244: istore          14
        //   246: iload           14
        //   248: istore          15
        //   250: iload_3        
        //   251: istore          16
        //   253: goto            310
        //   256: astore_1       
        //   257: iconst_0       
        //   258: istore_2       
        //   259: iconst_0       
        //   260: istore_3       
        //   261: iload_3        
        //   262: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   265: iload_2        
        //   266: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   269: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   272: areturn        
        //   273: astore          9
        //   275: goto            261
        //   278: iconst_m1      
        //   279: istore          12
        //   281: iload           12
        //   283: tableswitch {
        //                0: 170
        //                1: 215
        //          default: 304
        //        }
        //   304: iload_2        
        //   305: istore          15
        //   307: iload_3        
        //   308: istore          16
        //   310: iinc            8, 1
        //   313: iload           16
        //   315: istore_3       
        //   316: iload           15
        //   318: istore_2       
        //   319: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      64     256    261    Ljava/lang/Throwable;
        //  77     136    273    278    Ljava/lang/Throwable;
        //  136    147    273    278    Ljava/lang/Throwable;
        //  153    164    273    278    Ljava/lang/Throwable;
        //  170    201    273    278    Ljava/lang/Throwable;
        //  215    246    273    278    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0136:
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
