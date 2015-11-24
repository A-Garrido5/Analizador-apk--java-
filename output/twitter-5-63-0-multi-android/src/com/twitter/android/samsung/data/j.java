// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import android.net.Uri$Builder;
import android.content.ContentResolver;
import com.twitter.library.provider.ao;
import com.twitter.android.samsung.single.i;
import com.twitter.android.samsung.single.n;
import java.io.FileInputStream;
import java.io.File;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.android.samsung.model.g;
import java.util.Iterator;
import com.twitter.library.api.bp;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.provider.ad;
import com.twitter.android.samsung.model.a;
import android.database.Cursor;
import org.json.JSONArray;
import org.json.JSONException;
import com.twitter.android.samsung.model.b;
import android.content.Context;
import com.twitter.android.samsung.model.h;
import com.twitter.android.samsung.model.WidgetViewModel$ModelType;
import com.twitter.android.samsung.model.WidgetViewModel;
import java.util.ArrayList;
import java.util.List;
import android.util.SparseArray;

@Deprecated
public class j
{
    private static SparseArray a;
    private static SparseArray b;
    private static int c;
    
    static {
        j.a = new SparseArray();
        j.b = new SparseArray();
        j.c = -1;
    }
    
    public static List a() {
        final ArrayList<WidgetViewModel> list = new ArrayList<WidgetViewModel>();
        list.add(h.a(WidgetViewModel$ModelType.c));
        return list;
    }
    
    private static List a(final Context context) {
        synchronized (j.class) {
            try {
                final ArrayList<b> list = new ArrayList<b>();
                final JSONArray b = b(context);
                List<b> list2 = null;
                if (b != null) {
                    for (int i = 0; i < b.length(); ++i) {
                        list.add(com.twitter.android.samsung.model.b.a(b.getJSONObject(i)));
                    }
                    list2 = list;
                }
                return list2;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    public static List a(final Context context, final int n) {
        synchronized (j.class) {
            return (List)j.b.get(n);
        }
    }
    
    private static List a(final Cursor cursor) {
        final ArrayList<a> list = new ArrayList<a>();
        int n2;
        for (int n = 0; cursor.moveToNext() && n < 20; n = n2) {
            final a a = (a)h.a(WidgetViewModel$ModelType.d);
            final Tweet a2 = new ad(cursor).a();
            final MediaEntity q = a2.Q();
            if (q != null && q.mediaUrl != null) {
                a.a(a2);
                list.add(a);
                n2 = n + 1;
            }
            else {
                n2 = n;
            }
        }
        return list;
    }
    
    private static List a(final List list) {
        final ArrayList<WidgetViewModel> list2 = new ArrayList<WidgetViewModel>();
        for (int i = 0; i < list.size(); ++i) {
            if (i == 2) {
                list2.add(h.a(WidgetViewModel$ModelType.a));
            }
            if (i > 2 && (i - 2) % 7 == 0) {
                list2.add(h.a(WidgetViewModel$ModelType.a));
            }
            list2.add(list.get(i));
        }
        return list2;
    }
    
    public static void a(final int n) {
        synchronized (j.class) {
            j.b.remove(n);
            j.a.put(n, (Object)0L);
        }
    }
    
    public static void a(final Context context, final List list) {
        final JSONArray jsonArray;
        synchronized (j.class) {
            final ArrayList<b> list2 = new ArrayList<b>();
            jsonArray = new JSONArray();
            for (final bp bp : list) {
                if (a(bp)) {
                    final b b = (b)h.a(WidgetViewModel$ModelType.e);
                    b.a(bp);
                    list2.add(b);
                    jsonArray.put((Object)b.f());
                }
            }
        }
        a(context, jsonArray);
    }
    // monitorexit(j.class)
    
    private static void a(final Context p0, final JSONArray p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/twitter/android/samsung/data/j;.class
        //     2: monitorenter   
        //     3: aload_1        
        //     4: invokevirtual   org/json/JSONArray.toString:()Ljava/lang/String;
        //     7: astore_3       
        //     8: new             Ljava/io/File;
        //    11: dup            
        //    12: aload_0        
        //    13: invokevirtual   android/content/Context.getCacheDir:()Ljava/io/File;
        //    16: ldc             "loggedOutExperienceStore.txt"
        //    18: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    21: astore          4
        //    23: aload           4
        //    25: invokevirtual   java/io/File.delete:()Z
        //    28: pop            
        //    29: new             Ljava/io/FileOutputStream;
        //    32: dup            
        //    33: aload           4
        //    35: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    38: astore          6
        //    40: aload           6
        //    42: aload_3        
        //    43: invokevirtual   java/lang/String.getBytes:()[B
        //    46: invokevirtual   java/io/FileOutputStream.write:([B)V
        //    49: aload           6
        //    51: invokevirtual   java/io/FileOutputStream.close:()V
        //    54: ldc             Lcom/twitter/android/samsung/data/j;.class
        //    56: monitorexit    
        //    57: return         
        //    58: astore_2       
        //    59: ldc             Lcom/twitter/android/samsung/data/j;.class
        //    61: monitorexit    
        //    62: aload_2        
        //    63: athrow         
        //    64: astore          7
        //    66: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      29     58     64     Any
        //  29     54     64     69     Ljava/lang/Exception;
        //  29     54     58     64     Any
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
    
    private static boolean a(final Context context, final String s) {
        return g.a(context, s) != null;
    }
    
    private static boolean a(final bp bp) {
        return bp.c().c.media.a(MediaEntity$Type.b);
    }
    
    private static JSONArray b(final Context context) {
        synchronized (j.class) {
            final File file = new File(context.getCacheDir(), "loggedOutExperienceStore.txt");
            FileInputStream fileInputStream = null;
            StringBuilder sb = null;
            Label_0079: {
                JSONArray jsonArray;
                try {
                    fileInputStream = new FileInputStream(file);
                    sb = new StringBuilder();
                    final byte[] array = new byte[1024];
                    while (fileInputStream.read(array) != -1) {
                        sb.append(new String(array));
                    }
                    break Label_0079;
                }
                catch (Exception ex) {
                    jsonArray = null;
                }
                return jsonArray;
            }
            fileInputStream.close();
            return new JSONArray(sb.toString());
        }
    }
    
    public static boolean b(final Context p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/twitter/android/samsung/data/j;.class
        //     2: monitorenter   
        //     3: getstatic       com/twitter/android/samsung/data/j.b:Landroid/util/SparseArray;
        //     6: iload_1        
        //     7: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //    10: astore_3       
        //    11: iconst_0       
        //    12: istore          4
        //    14: aload_3        
        //    15: ifnull          24
        //    18: ldc             Lcom/twitter/android/samsung/data/j;.class
        //    20: monitorexit    
        //    21: iload           4
        //    23: ireturn        
        //    24: aload_0        
        //    25: iload_1        
        //    26: invokestatic    com/twitter/android/samsung/single/i.g:(Landroid/content/Context;I)Z
        //    29: ifeq            255
        //    32: aload_0        
        //    33: iload_1        
        //    34: invokestatic    com/twitter/android/samsung/data/j.f:(Landroid/content/Context;I)Landroid/database/Cursor;
        //    37: astore          10
        //    39: aload           10
        //    41: ifnull          180
        //    44: aload           10
        //    46: invokeinterface android/database/Cursor.getCount:()I
        //    51: ifle            180
        //    54: aload           10
        //    56: invokeinterface android/database/Cursor.getCount:()I
        //    61: istore          12
        //    63: aload           10
        //    65: invokestatic    com/twitter/android/samsung/data/j.a:(Landroid/database/Cursor;)Ljava/util/List;
        //    68: astore          13
        //    70: aload           13
        //    72: invokeinterface java/util/List.size:()I
        //    77: iconst_5       
        //    78: if_icmpge       136
        //    81: getstatic       com/twitter/android/samsung/data/j.c:I
        //    84: iload           12
        //    86: if_icmpeq       136
        //    89: aload_0        
        //    90: invokestatic    com/twitter/android/samsung/single/n.c:(Landroid/content/Context;)Z
        //    93: ifeq            136
        //    96: iload           12
        //    98: putstatic       com/twitter/android/samsung/data/j.c:I
        //   101: aload_0        
        //   102: iload_1        
        //   103: getstatic       com/twitter/android/samsung/data/WidgetDataUpdateService$FetchType.a:Lcom/twitter/android/samsung/data/WidgetDataUpdateService$FetchType;
        //   106: invokestatic    com/twitter/android/samsung/data/WidgetDataUpdateService.a:(Landroid/content/Context;ILcom/twitter/android/samsung/data/WidgetDataUpdateService$FetchType;)V
        //   109: iconst_0       
        //   110: istore          4
        //   112: aload           10
        //   114: ifnull          18
        //   117: aload           10
        //   119: invokeinterface android/database/Cursor.close:()V
        //   124: iconst_0       
        //   125: istore          4
        //   127: goto            18
        //   130: astore_2       
        //   131: ldc             Lcom/twitter/android/samsung/data/j;.class
        //   133: monitorexit    
        //   134: aload_2        
        //   135: athrow         
        //   136: iconst_m1      
        //   137: putstatic       com/twitter/android/samsung/data/j.c:I
        //   140: getstatic       com/twitter/android/samsung/data/j.b:Landroid/util/SparseArray;
        //   143: iload_1        
        //   144: aload           13
        //   146: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   149: getstatic       com/twitter/android/samsung/data/j.a:Landroid/util/SparseArray;
        //   152: iload_1        
        //   153: invokestatic    java/lang/System.currentTimeMillis:()J
        //   156: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   159: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   162: aload           10
        //   164: ifnull          174
        //   167: aload           10
        //   169: invokeinterface android/database/Cursor.close:()V
        //   174: iconst_1       
        //   175: istore          4
        //   177: goto            18
        //   180: aload_0        
        //   181: invokestatic    com/twitter/android/samsung/single/n.c:(Landroid/content/Context;)Z
        //   184: ifeq            215
        //   187: aload_0        
        //   188: iload_1        
        //   189: getstatic       com/twitter/android/samsung/data/WidgetDataUpdateService$FetchType.b:Lcom/twitter/android/samsung/data/WidgetDataUpdateService$FetchType;
        //   192: invokestatic    com/twitter/android/samsung/data/WidgetDataUpdateService.a:(Landroid/content/Context;ILcom/twitter/android/samsung/data/WidgetDataUpdateService$FetchType;)V
        //   195: goto            109
        //   198: astore          11
        //   200: aload           10
        //   202: ifnull          212
        //   205: aload           10
        //   207: invokeinterface android/database/Cursor.close:()V
        //   212: aload           11
        //   214: athrow         
        //   215: getstatic       com/twitter/android/samsung/data/j.b:Landroid/util/SparseArray;
        //   218: iload_1        
        //   219: aload_0        
        //   220: iload_1        
        //   221: invokestatic    com/twitter/android/samsung/data/j.c:(Landroid/content/Context;I)Ljava/util/List;
        //   224: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   227: getstatic       com/twitter/android/samsung/data/j.a:Landroid/util/SparseArray;
        //   230: iload_1        
        //   231: invokestatic    java/lang/System.currentTimeMillis:()J
        //   234: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   237: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   240: aload           10
        //   242: ifnull          394
        //   245: aload           10
        //   247: invokeinterface android/database/Cursor.close:()V
        //   252: goto            394
        //   255: aload_0        
        //   256: iload_1        
        //   257: invokestatic    com/twitter/android/samsung/data/j.e:(Landroid/content/Context;I)Ljava/util/List;
        //   260: astore          5
        //   262: aload_0        
        //   263: getstatic       com/twitter/android/samsung/data/WidgetDataUpdateService$RequestType.a:Lcom/twitter/android/samsung/data/WidgetDataUpdateService$RequestType;
        //   266: invokestatic    com/twitter/android/samsung/single/i.b:(Landroid/content/Context;Lcom/twitter/android/samsung/data/WidgetDataUpdateService$RequestType;)Z
        //   269: istore          6
        //   271: aload           5
        //   273: ifnull          314
        //   276: aload           5
        //   278: invokeinterface java/util/List.size:()I
        //   283: ifle            314
        //   286: getstatic       com/twitter/android/samsung/data/j.b:Landroid/util/SparseArray;
        //   289: iload_1        
        //   290: aload           5
        //   292: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   295: getstatic       com/twitter/android/samsung/data/j.a:Landroid/util/SparseArray;
        //   298: iload_1        
        //   299: invokestatic    java/lang/System.currentTimeMillis:()J
        //   302: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   305: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   308: iconst_1       
        //   309: istore          4
        //   311: goto            18
        //   314: iload           6
        //   316: ifne            336
        //   319: aload_0        
        //   320: invokestatic    com/twitter/android/samsung/single/n.c:(Landroid/content/Context;)Z
        //   323: ifeq            336
        //   326: aload_0        
        //   327: invokestatic    com/twitter/android/samsung/data/WidgetDataUpdateService.a:(Landroid/content/Context;)V
        //   330: iconst_0       
        //   331: istore          4
        //   333: goto            18
        //   336: getstatic       com/twitter/android/samsung/data/j.b:Landroid/util/SparseArray;
        //   339: astore          7
        //   341: iload           6
        //   343: ifne            380
        //   346: aload_0        
        //   347: iload_1        
        //   348: invokestatic    com/twitter/android/samsung/data/j.c:(Landroid/content/Context;I)Ljava/util/List;
        //   351: astore          8
        //   353: aload           7
        //   355: iload_1        
        //   356: aload           8
        //   358: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   361: getstatic       com/twitter/android/samsung/data/j.a:Landroid/util/SparseArray;
        //   364: iload_1        
        //   365: invokestatic    java/lang/System.currentTimeMillis:()J
        //   368: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   371: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //   374: iconst_1       
        //   375: istore          4
        //   377: goto            18
        //   380: aload_0        
        //   381: iload_1        
        //   382: invokestatic    com/twitter/android/samsung/data/j.d:(Landroid/content/Context;I)Ljava/util/List;
        //   385: astore          9
        //   387: aload           9
        //   389: astore          8
        //   391: goto            353
        //   394: iconst_1       
        //   395: istore          4
        //   397: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      11     130    136    Any
        //  24     39     130    136    Any
        //  44     109    198    215    Any
        //  117    124    130    136    Any
        //  136    162    198    215    Any
        //  167    174    130    136    Any
        //  180    195    198    215    Any
        //  205    212    130    136    Any
        //  212    215    130    136    Any
        //  215    240    198    215    Any
        //  245    252    130    136    Any
        //  255    271    130    136    Any
        //  276    308    130    136    Any
        //  319    330    130    136    Any
        //  336    341    130    136    Any
        //  346    353    130    136    Any
        //  353    374    130    136    Any
        //  380    387    130    136    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
    
    public static List c(final Context context, final int n) {
        final ArrayList<WidgetViewModel> list = new ArrayList<WidgetViewModel>();
        list.add(h.a(WidgetViewModel$ModelType.c));
        list.add(h.a(WidgetViewModel$ModelType.b));
        return list;
    }
    
    public static List d(final Context context, final int n) {
        final ArrayList<WidgetViewModel> list = new ArrayList<WidgetViewModel>();
        list.add(h.a(WidgetViewModel$ModelType.f));
        return list;
    }
    
    private static List e(final Context context, final int n) {
        synchronized (j.class) {
            List list = a(context);
            if (list != null && !n.d(context, n)) {
                list = a(list);
            }
            return list;
        }
    }
    
    private static Cursor f(final Context context, final int n) {
        final boolean a = a(context, i.a(context, n));
        Cursor query = null;
        if (a) {
            final long longValue = i.b(context, n);
            final ContentResolver contentResolver = context.getContentResolver();
            final Uri$Builder buildUpon = ao.a.buildUpon();
            buildUpon.appendQueryParameter("ownerId", Long.toString(longValue));
            buildUpon.appendQueryParameter("newer", Long.toString(System.currentTimeMillis() - 86400000L));
            query = contentResolver.query(buildUpon.build(), (String[])null, (String)null, (String[])null, (String)null);
        }
        return query;
    }
}
