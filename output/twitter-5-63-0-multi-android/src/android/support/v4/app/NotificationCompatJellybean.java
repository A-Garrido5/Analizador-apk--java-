// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification$Builder;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.util.Log;
import android.app.Notification;
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
    static final String EXTRA_ACTION_EXTRAS = "android.support.actionExtras";
    static final String EXTRA_GROUP_KEY = "android.support.groupKey";
    static final String EXTRA_GROUP_SUMMARY = "android.support.isGroupSummary";
    static final String EXTRA_LOCAL_ONLY = "android.support.localOnly";
    static final String EXTRA_REMOTE_INPUTS = "android.support.remoteInputs";
    static final String EXTRA_SORT_KEY = "android.support.sortKey";
    static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Class sActionClass;
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;
    
    static {
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
        final Notification$InboxStyle setBigContentTitle = new Notification$InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(bigContentTitle);
        if (b) {
            setBigContentTitle.setSummaryText(summaryText);
        }
        final Iterator<CharSequence> iterator = list.iterator();
        while (iterator.hasNext()) {
            setBigContentTitle.addLine((CharSequence)iterator.next());
        }
    }
    
    public static SparseArray buildActionExtrasMap(final List list) {
        SparseArray sparseArray = null;
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, (Object)bundle);
            }
        }
        return sparseArray;
    }
    
    private static boolean ensureActionReflectionReadyLocked() {
        boolean b = true;
        if (NotificationCompatJellybean.sActionsAccessFailed) {
            return false;
        }
        while (true) {
            while (true) {
                try {
                    if (NotificationCompatJellybean.sActionsField == null) {
                        NotificationCompatJellybean.sActionClass = Class.forName("android.app.Notification$Action");
                        NotificationCompatJellybean.sActionIconField = NotificationCompatJellybean.sActionClass.getDeclaredField("icon");
                        NotificationCompatJellybean.sActionTitleField = NotificationCompatJellybean.sActionClass.getDeclaredField("title");
                        NotificationCompatJellybean.sActionIntentField = NotificationCompatJellybean.sActionClass.getDeclaredField("actionIntent");
                        (NotificationCompatJellybean.sActionsField = Notification.class.getDeclaredField("actions")).setAccessible(true);
                    }
                    if (!NotificationCompatJellybean.sActionsAccessFailed) {
                        return b;
                    }
                }
                catch (ClassNotFoundException ex) {
                    Log.e("NotificationCompat", "Unable to access notification actions", (Throwable)ex);
                    NotificationCompatJellybean.sActionsAccessFailed = b;
                    continue;
                }
                catch (NoSuchFieldException ex2) {
                    Log.e("NotificationCompat", "Unable to access notification actions", (Throwable)ex2);
                    NotificationCompatJellybean.sActionsAccessFailed = b;
                    continue;
                }
                break;
            }
            b = false;
            return b;
        }
    }
    
    public static NotificationCompatBase$Action getAction(final Notification notification, final int n, final NotificationCompatBase$Action$Factory notificationCompatBase$Action$Factory, final RemoteInputCompatBase$RemoteInput$Factory remoteInputCompatBase$RemoteInput$Factory) {
        while (true) {
            while (true) {
                synchronized (NotificationCompatJellybean.sActionsLock) {
                    try {
                        final Object o = getActionObjectsLocked(notification)[n];
                        final Bundle extras = getExtras(notification);
                        if (extras != null) {
                            final SparseArray sparseParcelableArray = extras.getSparseParcelableArray("android.support.actionExtras");
                            if (sparseParcelableArray != null) {
                                final Bundle bundle = (Bundle)sparseParcelableArray.get(n);
                                return readAction(notificationCompatBase$Action$Factory, remoteInputCompatBase$RemoteInput$Factory, NotificationCompatJellybean.sActionIconField.getInt(o), (CharSequence)NotificationCompatJellybean.sActionTitleField.get(o), (PendingIntent)NotificationCompatJellybean.sActionIntentField.get(o), bundle);
                            }
                        }
                    }
                    catch (IllegalAccessException ex) {
                        Log.e("NotificationCompat", "Unable to access notification actions", (Throwable)ex);
                        NotificationCompatJellybean.sActionsAccessFailed = true;
                        return null;
                    }
                }
                final Bundle bundle = null;
                continue;
            }
        }
    }
    
    public static int getActionCount(final Notification notification) {
        while (true) {
            synchronized (NotificationCompatJellybean.sActionsLock) {
                final Object[] actionObjectsLocked = getActionObjectsLocked(notification);
                if (actionObjectsLocked != null) {
                    return actionObjectsLocked.length;
                }
            }
            return 0;
        }
    }
    
    private static NotificationCompatBase$Action getActionFromBundle(final Bundle bundle, final NotificationCompatBase$Action$Factory notificationCompatBase$Action$Factory, final RemoteInputCompatBase$RemoteInput$Factory remoteInputCompatBase$RemoteInput$Factory) {
        return notificationCompatBase$Action$Factory.build(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "remoteInputs"), remoteInputCompatBase$RemoteInput$Factory));
    }
    
    private static Object[] getActionObjectsLocked(final Notification p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/NotificationCompatJellybean.sActionsLock:Ljava/lang/Object;
        //     3: astore_1       
        //     4: aload_1        
        //     5: monitorenter   
        //     6: invokestatic    android/support/v4/app/NotificationCompatJellybean.ensureActionReflectionReadyLocked:()Z
        //     9: ifne            16
        //    12: aload_1        
        //    13: monitorexit    
        //    14: aconst_null    
        //    15: areturn        
        //    16: getstatic       android/support/v4/app/NotificationCompatJellybean.sActionsField:Ljava/lang/reflect/Field;
        //    19: aload_0        
        //    20: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    23: checkcast       [Ljava/lang/Object;
        //    26: checkcast       [Ljava/lang/Object;
        //    29: astore          5
        //    31: aload_1        
        //    32: monitorexit    
        //    33: aload           5
        //    35: areturn        
        //    36: astore_2       
        //    37: aload_1        
        //    38: monitorexit    
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_3       
        //    42: ldc             "NotificationCompat"
        //    44: ldc             "Unable to access notification actions"
        //    46: aload_3        
        //    47: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    50: pop            
        //    51: iconst_1       
        //    52: putstatic       android/support/v4/app/NotificationCompatJellybean.sActionsAccessFailed:Z
        //    55: aload_1        
        //    56: monitorexit    
        //    57: aconst_null    
        //    58: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      14     36     41     Any
        //  16     31     41     59     Ljava/lang/IllegalAccessException;
        //  16     31     36     41     Any
        //  31     33     36     41     Any
        //  37     39     36     41     Any
        //  42     57     36     41     Any
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
    
    public static NotificationCompatBase$Action[] getActionsFromParcelableArrayList(final ArrayList list, final NotificationCompatBase$Action$Factory notificationCompatBase$Action$Factory, final RemoteInputCompatBase$RemoteInput$Factory remoteInputCompatBase$RemoteInput$Factory) {
        if (list == null) {
            return null;
        }
        final NotificationCompatBase$Action[] array = notificationCompatBase$Action$Factory.newArray(list.size());
        for (int i = 0; i < array.length; ++i) {
            array[i] = getActionFromBundle(list.get(i), notificationCompatBase$Action$Factory, remoteInputCompatBase$RemoteInput$Factory);
        }
        return array;
    }
    
    private static Bundle getBundleForAction(final NotificationCompatBase$Action notificationCompatBase$Action) {
        final Bundle bundle = new Bundle();
        bundle.putInt("icon", notificationCompatBase$Action.getIcon());
        bundle.putCharSequence("title", notificationCompatBase$Action.getTitle());
        bundle.putParcelable("actionIntent", (Parcelable)notificationCompatBase$Action.getActionIntent());
        bundle.putBundle("extras", notificationCompatBase$Action.getExtras());
        bundle.putParcelableArray("remoteInputs", (Parcelable[])RemoteInputCompatJellybean.toBundleArray(notificationCompatBase$Action.getRemoteInputs()));
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
        //    19: ifnonnull       72
        //    22: ldc             Landroid/app/Notification;.class
        //    24: ldc             "extras"
        //    26: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    29: astore          8
        //    31: ldc             Landroid/os/Bundle;.class
        //    33: aload           8
        //    35: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    38: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    41: ifne            61
        //    44: ldc             "NotificationCompat"
        //    46: ldc_w           "Notification.extras field is not of type Bundle"
        //    49: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    52: pop            
        //    53: iconst_1       
        //    54: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasFieldAccessFailed:Z
        //    57: aload_1        
        //    58: monitorexit    
        //    59: aconst_null    
        //    60: areturn        
        //    61: aload           8
        //    63: iconst_1       
        //    64: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    67: aload           8
        //    69: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //    72: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //    75: aload_0        
        //    76: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    79: checkcast       Landroid/os/Bundle;
        //    82: astore          7
        //    84: aload           7
        //    86: ifnonnull       107
        //    89: new             Landroid/os/Bundle;
        //    92: dup            
        //    93: invokespecial   android/os/Bundle.<init>:()V
        //    96: astore          7
        //    98: getstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasField:Ljava/lang/reflect/Field;
        //   101: aload_0        
        //   102: aload           7
        //   104: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   107: aload_1        
        //   108: monitorexit    
        //   109: aload           7
        //   111: areturn        
        //   112: astore_2       
        //   113: aload_1        
        //   114: monitorexit    
        //   115: aload_2        
        //   116: athrow         
        //   117: astore          5
        //   119: ldc             "NotificationCompat"
        //   121: ldc_w           "Unable to access notification extras"
        //   124: aload           5
        //   126: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   129: pop            
        //   130: iconst_1       
        //   131: putstatic       android/support/v4/app/NotificationCompatJellybean.sExtrasFieldAccessFailed:Z
        //   134: aload_1        
        //   135: monitorexit    
        //   136: aconst_null    
        //   137: areturn        
        //   138: astore_3       
        //   139: ldc             "NotificationCompat"
        //   141: ldc_w           "Unable to access notification extras"
        //   144: aload_3        
        //   145: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   148: pop            
        //   149: goto            130
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      14     112    117    Any
        //  16     57     117    130    Ljava/lang/IllegalAccessException;
        //  16     57     138    152    Ljava/lang/NoSuchFieldException;
        //  16     57     112    117    Any
        //  57     59     112    117    Any
        //  61     72     117    130    Ljava/lang/IllegalAccessException;
        //  61     72     138    152    Ljava/lang/NoSuchFieldException;
        //  61     72     112    117    Any
        //  72     84     117    130    Ljava/lang/IllegalAccessException;
        //  72     84     138    152    Ljava/lang/NoSuchFieldException;
        //  72     84     112    117    Any
        //  89     107    117    130    Ljava/lang/IllegalAccessException;
        //  89     107    138    152    Ljava/lang/NoSuchFieldException;
        //  89     107    112    117    Any
        //  107    109    112    117    Any
        //  113    115    112    117    Any
        //  119    130    112    117    Any
        //  130    136    112    117    Any
        //  139    149    112    117    Any
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
    
    public static String getGroup(final Notification notification) {
        return getExtras(notification).getString("android.support.groupKey");
    }
    
    public static boolean getLocalOnly(final Notification notification) {
        return getExtras(notification).getBoolean("android.support.localOnly");
    }
    
    public static ArrayList getParcelableArrayListForActions(final NotificationCompatBase$Action[] array) {
        ArrayList<Bundle> list;
        if (array == null) {
            list = null;
        }
        else {
            list = new ArrayList<Bundle>(array.length);
            for (int length = array.length, i = 0; i < length; ++i) {
                list.add(getBundleForAction(array[i]));
            }
        }
        return list;
    }
    
    public static String getSortKey(final Notification notification) {
        return getExtras(notification).getString("android.support.sortKey");
    }
    
    public static boolean isGroupSummary(final Notification notification) {
        return getExtras(notification).getBoolean("android.support.isGroupSummary");
    }
    
    public static NotificationCompatBase$Action readAction(final NotificationCompatBase$Action$Factory notificationCompatBase$Action$Factory, final RemoteInputCompatBase$RemoteInput$Factory remoteInputCompatBase$RemoteInput$Factory, final int n, final CharSequence charSequence, final PendingIntent pendingIntent, final Bundle bundle) {
        RemoteInputCompatBase$RemoteInput[] fromBundleArray = null;
        if (bundle != null) {
            fromBundleArray = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.remoteInputs"), remoteInputCompatBase$RemoteInput$Factory);
        }
        return notificationCompatBase$Action$Factory.build(n, charSequence, pendingIntent, bundle, fromBundleArray);
    }
    
    public static Bundle writeActionAndGetExtras(final Notification$Builder notification$Builder, final NotificationCompatBase$Action notificationCompatBase$Action) {
        notification$Builder.addAction(notificationCompatBase$Action.getIcon(), notificationCompatBase$Action.getTitle(), notificationCompatBase$Action.getActionIntent());
        final Bundle bundle = new Bundle(notificationCompatBase$Action.getExtras());
        if (notificationCompatBase$Action.getRemoteInputs() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", (Parcelable[])RemoteInputCompatJellybean.toBundleArray(notificationCompatBase$Action.getRemoteInputs()));
        }
        return bundle;
    }
}
