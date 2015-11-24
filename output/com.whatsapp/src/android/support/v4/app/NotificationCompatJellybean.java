// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification$Builder;
import android.app.Notification;
import android.os.Parcelable;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import java.util.Iterator;
import android.app.Notification$InboxStyle;
import java.util.ArrayList;
import android.app.Notification$BigTextStyle;
import android.app.Notification$BigPictureStyle;
import android.graphics.Bitmap;
import java.lang.reflect.Field;

class NotificationCompatJellybean
{
    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[13];
        String s = "6S:^a!\u007f9A`0E";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "!N#Ct7";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "-U8_";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "0_#]p";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "%U#Xz*\u007f9Ep*B";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\nY#Xs-U6E|+XyTm0D6B5\"_2]qd_$\u0011{+Bw^sdB.Apdt\"_q(S";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\nY#Xs-U6E|+X\u0014^x4W#";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0011X6Sy!\u0016#^5%U4Tf7\u00169^a-P>Rt0_8_5!N#Ct7";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0011X6Sy!\u0016#^5%U4Tf7\u00169^a-P>Rt0_8_5!N#Ct7";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "!N#Ct7";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\nY#Xs-U6E|+X\u0014^x4W#";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\nY#Xs-U6E|+X\u0014^x4W#";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "%X3Cz-RyB`4F8CajD2\\z0S\u001e_e1B$";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        sExtrasLock = new Object();
        sActionsLock = new Object();
    }
    
    public static void addBigPictureStyle(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, final CharSequence bigContentTitle, final boolean b, final CharSequence summaryText, final Bitmap bitmap, final Bitmap bitmap2, final boolean b2) {
        final Notification$BigPictureStyle bigPicture = new Notification$BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(bigContentTitle).bigPicture(bitmap);
        if (b2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (b) {
            bigPicture.setSummaryText(summaryText);
        }
    }
    
    public static void addBigTextStyle(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, final CharSequence bigContentTitle, final boolean b, final CharSequence summaryText, final CharSequence charSequence) {
        final Notification$BigTextStyle bigText = new Notification$BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(bigContentTitle).bigText(charSequence);
        if (b) {
            bigText.setSummaryText(summaryText);
        }
    }
    
    public static void addInboxStyle(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, final CharSequence bigContentTitle, final boolean b, final CharSequence summaryText, final ArrayList list) {
        final int a = NotificationCompatBase$Action.a;
        final Notification$InboxStyle setBigContentTitle = new Notification$InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(bigContentTitle);
        if (b) {
            setBigContentTitle.setSummaryText(summaryText);
        }
        final Iterator<CharSequence> iterator = list.iterator();
        while (iterator.hasNext()) {
            setBigContentTitle.addLine((CharSequence)iterator.next());
            if (a != 0) {
                break;
            }
        }
    }
    
    public static SparseArray buildActionExtrasMap(final List list) {
        final int a = NotificationCompatBase$Action.a;
        SparseArray sparseArray = null;
        int n;
        for (int size = list.size(), i = 0; i < size; i = n) {
            final Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, (Object)bundle);
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        return sparseArray;
    }
    
    private static Bundle getBundleForAction(final NotificationCompatBase$Action notificationCompatBase$Action) {
        final Bundle bundle = new Bundle();
        bundle.putInt(NotificationCompatJellybean.z[2], notificationCompatBase$Action.getIcon());
        bundle.putCharSequence(NotificationCompatJellybean.z[3], notificationCompatBase$Action.getTitle());
        bundle.putParcelable(NotificationCompatJellybean.z[4], (Parcelable)notificationCompatBase$Action.getActionIntent());
        bundle.putBundle(NotificationCompatJellybean.z[1], notificationCompatBase$Action.getExtras());
        bundle.putParcelableArray(NotificationCompatJellybean.z[0], (Parcelable[])RemoteInputCompatJellybean.toBundleArray(notificationCompatBase$Action.getRemoteInputs()));
        return bundle;
    }
    
    public static Bundle getExtras(final Notification p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasLock:Ljava/lang/Object;
        //     3: astore_1       
        //     4: aload_1        
        //     5: monitorenter   
        //     6: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasFieldAccessFailed:Z
        //     9: ifeq            16
        //    12: aload_1        
        //    13: monitorexit    
        //    14: aconst_null    
        //    15: areturn        
        //    16: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //    19: ifnonnull       82
        //    22: ldc             Landroid/app/Notification;.class
        //    24: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //    27: bipush          9
        //    29: aaload         
        //    30: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    33: astore          8
        //    35: ldc             Landroid/os/Bundle;.class
        //    37: aload           8
        //    39: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    42: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    45: ifne            71
        //    48: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //    51: bipush          10
        //    53: aaload         
        //    54: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //    57: iconst_5       
        //    58: aaload         
        //    59: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    62: pop            
        //    63: iconst_1       
        //    64: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasFieldAccessFailed:Z
        //    67: aload_1        
        //    68: monitorexit    
        //    69: aconst_null    
        //    70: areturn        
        //    71: aload           8
        //    73: iconst_1       
        //    74: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    77: aload           8
        //    79: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //    82: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //    85: aload_0        
        //    86: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    89: checkcast       Landroid/os/Bundle;
        //    92: astore          7
        //    94: aload           7
        //    96: ifnonnull       117
        //    99: new             Landroid/os/Bundle;
        //   102: dup            
        //   103: invokespecial   android/os/Bundle.<init>:()V
        //   106: astore          7
        //   108: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //   111: aload_0        
        //   112: aload           7
        //   114: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   117: aload_1        
        //   118: monitorexit    
        //   119: aload           7
        //   121: areturn        
        //   122: astore_2       
        //   123: aload_1        
        //   124: monitorexit    
        //   125: aload_2        
        //   126: athrow         
        //   127: astore          5
        //   129: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //   132: bipush          6
        //   134: aaload         
        //   135: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //   138: bipush          7
        //   140: aaload         
        //   141: aload           5
        //   143: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   146: pop            
        //   147: iconst_1       
        //   148: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasFieldAccessFailed:Z
        //   151: aload_1        
        //   152: monitorexit    
        //   153: aconst_null    
        //   154: areturn        
        //   155: astore_3       
        //   156: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //   159: bipush          11
        //   161: aaload         
        //   162: getstatic       android/support/v4/app/NotificationCompatJellybean.z:[Ljava/lang/String;
        //   165: bipush          8
        //   167: aaload         
        //   168: aload_3        
        //   169: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   172: pop            
        //   173: goto            147
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      14     122    127    Any
        //  16     67     127    147    Ljava/lang/IllegalAccessException;
        //  16     67     155    176    Ljava/lang/NoSuchFieldException;
        //  16     67     122    127    Any
        //  67     69     122    127    Any
        //  71     82     127    147    Ljava/lang/IllegalAccessException;
        //  71     82     155    176    Ljava/lang/NoSuchFieldException;
        //  71     82     122    127    Any
        //  82     94     127    147    Ljava/lang/IllegalAccessException;
        //  82     94     155    176    Ljava/lang/NoSuchFieldException;
        //  82     94     122    127    Any
        //  99     117    127    147    Ljava/lang/IllegalAccessException;
        //  99     117    155    176    Ljava/lang/NoSuchFieldException;
        //  99     117    122    127    Any
        //  117    119    122    127    Any
        //  123    125    122    127    Any
        //  129    147    122    127    Any
        //  147    153    122    127    Any
        //  156    173    122    127    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    
    public static ArrayList getParcelableArrayListForActions(final NotificationCompatBase$Action[] array) {
        final int a = NotificationCompatBase$Action.a;
        ArrayList<Bundle> list;
        if (array == null) {
            list = null;
        }
        else {
            list = new ArrayList<Bundle>(array.length);
            final int length = array.length;
            int i = 0;
            while (i < length) {
                list.add(getBundleForAction(array[i]));
                ++i;
                if (a != 0) {
                    return list;
                }
            }
        }
        return list;
    }
    
    public static Bundle writeActionAndGetExtras(final Notification$Builder notification$Builder, final NotificationCompatBase$Action notificationCompatBase$Action) {
        notification$Builder.addAction(notificationCompatBase$Action.getIcon(), notificationCompatBase$Action.getTitle(), notificationCompatBase$Action.getActionIntent());
        final Bundle bundle = new Bundle(notificationCompatBase$Action.getExtras());
        if (notificationCompatBase$Action.getRemoteInputs() != null) {
            bundle.putParcelableArray(NotificationCompatJellybean.z[12], (Parcelable[])RemoteInputCompatJellybean.toBundleArray(notificationCompatBase$Action.getRemoteInputs()));
        }
        return bundle;
    }
}
