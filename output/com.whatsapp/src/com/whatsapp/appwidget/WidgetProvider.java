// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import com.whatsapp.util.Log;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.appwidget.AppWidgetManager;
import com.whatsapp.Main;
import android.app.PendingIntent;
import com.whatsapp.Conversation;
import android.net.Uri;
import android.content.Intent;
import com.whatsapp.App;
import android.os.HandlerThread;
import android.widget.RemoteViews;
import android.content.Context;
import java.util.ArrayList;
import android.os.Handler;
import android.appwidget.AppWidgetProvider;

public class WidgetProvider extends AppWidgetProvider
{
    private static Runnable a;
    private static Handler b;
    public static int d;
    private static ArrayList e;
    private static final String[] z;
    private a c;
    
    static {
        final String[] z2 = new String[11];
        String s = "c\u0005PjYh\u0014wWFu";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '\u0010';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "q\u0010TiUt\u0007AJut";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "q\u000e@LSy\u0004\nWRd\u0005JJ\u0012q\u0003PWS~NrwyG";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "q\u0010TiUt\u0007AJqy\u000esWXd\b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "g\t@YYd\u0010VQJy\u0004AL\u0013\u007f\u000eENLg\t@YYd\u000fTJU\u007f\u000eW]Tq\u000eC[X0";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "q\u0010TiUt\u0007AJqy\u000el[Uw\bP";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "q\u0010TiUt\u0007AJut\u0013";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "g\t@YYd\u0010VQJy\u0004AL\u0013w\u0005P\u007fL`7MZ[u\u0014mZO0\u0006EWPu\u0004";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "q\u000e@LSy\u0004\n_L`\u0017MZ[u\u0014\n__d\tKP\u0012Q0tiuT'ajcE0`\u007fhU";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "g\t@YYd\u0010VQJy\u0004AL\u0013e\u0010@_Hu@";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "e\u0010@_Hu?SWXw\u0005P";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static RemoteViews a(final Context context, final int n, final int n2, final int n3) {
        return b(context, n, n2, n3);
    }
    
    public static ArrayList a() {
        return WidgetProvider.e;
    }
    
    static ArrayList a(final ArrayList e) {
        return WidgetProvider.e = e;
    }
    
    public static void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //     4: ldc             2131492867
        //     6: invokevirtual   android/content/res/Resources.getBoolean:(I)Z
        //     9: ifeq            98
        //    12: aload_0        
        //    13: invokestatic    android/appwidget/AppWidgetManager.getInstance:(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;
        //    16: astore          6
        //    18: aload           6
        //    20: new             Landroid/content/ComponentName;
        //    23: dup            
        //    24: aload_0        
        //    25: ldc             Lcom/whatsapp/appwidget/WidgetProvider;.class
        //    27: invokespecial   android/content/ComponentName.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    30: invokevirtual   android/appwidget/AppWidgetManager.getAppWidgetIds:(Landroid/content/ComponentName;)[I
        //    33: astore          14
        //    35: aload           14
        //    37: astore          8
        //    39: aload           8
        //    41: ifnull          98
        //    44: aload           8
        //    46: arraylength    
        //    47: istore          10
        //    49: iload           10
        //    51: ifle            98
        //    54: new             Landroid/content/Intent;
        //    57: dup            
        //    58: aload_0        
        //    59: ldc             Lcom/whatsapp/appwidget/WidgetProvider;.class
        //    61: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    64: astore          11
        //    66: aload           11
        //    68: getstatic       com/whatsapp/appwidget/WidgetProvider.z:[Ljava/lang/String;
        //    71: bipush          8
        //    73: aaload         
        //    74: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //    77: pop            
        //    78: aload           11
        //    80: getstatic       com/whatsapp/appwidget/WidgetProvider.z:[Ljava/lang/String;
        //    83: bipush          6
        //    85: aaload         
        //    86: aload           8
        //    88: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[I)Landroid/content/Intent;
        //    91: pop            
        //    92: aload_0        
        //    93: aload           11
        //    95: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //    98: aload_0        
        //    99: invokestatic    com/whatsapp/notification/ao.a:(Landroid/content/Context;)Lcom/whatsapp/notification/ao;
        //   102: astore_1       
        //   103: aload_1        
        //   104: invokestatic    com/whatsapp/notification/ao.a:(Lcom/whatsapp/notification/ao;)Z
        //   107: istore          4
        //   109: iload           4
        //   111: ifeq            151
        //   114: getstatic       com/whatsapp/appwidget/WidgetProvider.a:Ljava/lang/Runnable;
        //   117: ifnonnull       132
        //   120: new             Lcom/whatsapp/appwidget/g;
        //   123: dup            
        //   124: aload_1        
        //   125: aconst_null    
        //   126: invokespecial   com/whatsapp/appwidget/g.<init>:(Lcom/whatsapp/notification/ao;Lcom/whatsapp/appwidget/c;)V
        //   129: putstatic       com/whatsapp/appwidget/WidgetProvider.a:Ljava/lang/Runnable;
        //   132: invokestatic    com/whatsapp/appwidget/WidgetProvider.b:()Landroid/os/Handler;
        //   135: getstatic       com/whatsapp/appwidget/WidgetProvider.a:Ljava/lang/Runnable;
        //   138: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   141: invokestatic    com/whatsapp/appwidget/WidgetProvider.b:()Landroid/os/Handler;
        //   144: getstatic       com/whatsapp/appwidget/WidgetProvider.a:Ljava/lang/Runnable;
        //   147: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   150: pop            
        //   151: return         
        //   152: astore          7
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/whatsapp/appwidget/WidgetProvider.z:[Ljava/lang/String;
        //   164: bipush          7
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload           7
        //   172: invokevirtual   java/lang/RuntimeException.toString:()Ljava/lang/String;
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   181: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   184: aconst_null    
        //   185: astore          8
        //   187: goto            39
        //   190: astore          9
        //   192: aload           9
        //   194: athrow         
        //   195: astore_2       
        //   196: aload_2        
        //   197: athrow         
        //   198: astore_3       
        //   199: aload_3        
        //   200: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  18     35     152    190    Ljava/lang/RuntimeException;
        //  44     49     190    195    Ljava/lang/RuntimeException;
        //  103    109    195    198    Ljava/lang/RuntimeException;
        //  114    132    198    201    Ljava/lang/RuntimeException;
        //  196    198    198    201    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    private static boolean a(final int n, final int n2) {
        return n > 100 && n2 > 100;
    }
    
    private static Handler b() {
        if (WidgetProvider.b == null) {
            final HandlerThread handlerThread = new HandlerThread(WidgetProvider.z[10], 10);
            handlerThread.start();
            WidgetProvider.b = new Handler(handlerThread.getLooper());
        }
        return WidgetProvider.b;
    }
    
    private static RemoteViews b(final Context context, final int n, final int n2, final int n3) {
        final int d = WidgetProvider.d;
        while (true) {
            if (a(n2, n3)) {
                final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903244);
                String s = "";
                try {
                    Label_0125: {
                        if (WidgetProvider.e != null) {
                            if (WidgetProvider.e.size() > 0) {
                                s = String.format(App.C.a(2131296301, WidgetProvider.e.size()), WidgetProvider.e.size());
                                remoteViews.setViewVisibility(2131755837, 0);
                                if (d == 0) {
                                    break Label_0125;
                                }
                            }
                            s = context.getString(2131231427);
                            remoteViews.setViewVisibility(2131755837, 8);
                        }
                    }
                    remoteViews.setTextViewText(2131755837, (CharSequence)s);
                    final Intent intent = new Intent(context, (Class)WidgetService.class);
                    intent.putExtra(WidgetProvider.z[1], n);
                    intent.setData(Uri.parse(intent.toUri(1)));
                    remoteViews.setRemoteAdapter(n, 2131755838, intent);
                    final Intent intent2 = new Intent(context, (Class)Conversation.class);
                    intent2.setAction(WidgetProvider.z[2]);
                    remoteViews.setPendingIntentTemplate(2131755838, PendingIntent.getActivity(context, 0, intent2, 134217728));
                    remoteViews.setOnClickPendingIntent(2131755280, PendingIntent.getActivity(context, 0, new Intent(context, Main.h()), 134217728));
                    remoteViews.setEmptyView(2131755838, 2131755839);
                    if (d != 0) {
                        final RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), 2130903246);
                        if (WidgetProvider.e != null) {
                            final int size = WidgetProvider.e.size();
                            remoteViews2.setTextViewText(2131755318, (CharSequence)Integer.toString(size));
                            float n4 = 30.0f;
                            Label_0348: {
                                if (n2 < 100) {
                                    if (size > 99) {
                                        n4 = 14.0f;
                                        if (d == 0) {
                                            break Label_0348;
                                        }
                                    }
                                    if (size > 9) {
                                        n4 = 20.0f;
                                    }
                                }
                            }
                            remoteViews2.setFloat(2131755318, WidgetProvider.z[0], n4);
                        }
                        remoteViews2.setOnClickPendingIntent(2131755280, PendingIntent.getActivity(context, 0, new Intent(context, Main.h()), 134217728));
                        return remoteViews2;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return remoteViews;
            }
            continue;
        }
    }
    
    static boolean b(final int n, final int n2) {
        return a(n, n2);
    }
    
    public void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int n, final Bundle bundle) {
        int n2 = Integer.MAX_VALUE;
        if (Build$VERSION.SDK_INT < 16) {
            return;
        }
    Label_0093:
        while (true) {
            if (bundle == null) {
                final int int1 = n2;
                break Label_0093;
            }
            while (true) {
                final int int2 = bundle.getInt(WidgetProvider.z[3]);
                int int1 = bundle.getInt(WidgetProvider.z[5]);
                try {
                    Log.i(WidgetProvider.z[4] + int2 + "x" + int1);
                    if (int2 == 0 || int1 == 0) {
                        int1 = n2;
                        appWidgetManager.updateAppWidget(n, b(context, n, n2, int1));
                        return;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                n2 = int2;
                continue Label_0093;
            }
            break;
        }
    }
    
    public void onUpdate(final Context p0, final AppWidgetManager p1, final int[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/appwidget/WidgetProvider.d:I
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/appwidget/WidgetProvider.z:[Ljava/lang/String;
        //    15: bipush          9
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_3        
        //    22: arraylength    
        //    23: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    32: aload_0        
        //    33: getfield        com/whatsapp/appwidget/WidgetProvider.c:Lcom/whatsapp/appwidget/a;
        //    36: ifnull          56
        //    39: aload_0        
        //    40: getfield        com/whatsapp/appwidget/WidgetProvider.c:Lcom/whatsapp/appwidget/a;
        //    43: invokevirtual   com/whatsapp/appwidget/a.b:()V
        //    46: invokestatic    com/whatsapp/appwidget/WidgetProvider.b:()Landroid/os/Handler;
        //    49: aload_0        
        //    50: getfield        com/whatsapp/appwidget/WidgetProvider.c:Lcom/whatsapp/appwidget/a;
        //    53: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    56: aload_0        
        //    57: new             Lcom/whatsapp/appwidget/a;
        //    60: dup            
        //    61: aload_1        
        //    62: aload_2        
        //    63: aload_3        
        //    64: invokespecial   com/whatsapp/appwidget/a.<init>:(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
        //    67: putfield        com/whatsapp/appwidget/WidgetProvider.c:Lcom/whatsapp/appwidget/a;
        //    70: invokestatic    com/whatsapp/appwidget/WidgetProvider.b:()Landroid/os/Handler;
        //    73: aload_0        
        //    74: getfield        com/whatsapp/appwidget/WidgetProvider.c:Lcom/whatsapp/appwidget/a;
        //    77: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    80: pop            
        //    81: aload_0        
        //    82: aload_1        
        //    83: aload_2        
        //    84: aload_3        
        //    85: invokespecial   android/appwidget/AppWidgetProvider.onUpdate:(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
        //    88: iload           4
        //    90: ifeq            111
        //    93: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    96: istore          9
        //    98: iload           9
        //   100: ifeq            127
        //   103: iconst_0       
        //   104: istore          10
        //   106: iload           10
        //   108: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   111: return         
        //   112: astore          5
        //   114: aload           5
        //   116: athrow         
        //   117: astore          6
        //   119: aload           6
        //   121: athrow         
        //   122: astore          7
        //   124: aload           7
        //   126: athrow         
        //   127: iconst_1       
        //   128: istore          10
        //   130: goto            106
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      56     112    117    Ljava/lang/RuntimeException;
        //  56     88     117    122    Ljava/lang/RuntimeException;
        //  93     98     122    127    Ljava/lang/RuntimeException;
        //  119    122    122    127    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
