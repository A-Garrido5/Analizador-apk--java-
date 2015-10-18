// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Message;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.Iterator;
import android.util.Log;
import android.content.Intent;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import android.os.HandlerThread;
import android.os.Handler;
import android.content.Context;
import java.util.Set;
import android.content.ServiceConnection;
import android.os.Handler$Callback;

class NotificationManagerCompat$SideChannelManager implements Handler$Callback, ServiceConnection
{
    private static final String[] z;
    private Set mCachedEnabledPackages;
    private final Context mContext;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private final Map mRecordMap;
    
    static {
        final String[] z2 = new String[42];
        String s = "kXc\"uhVy\b|HGv?";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1082:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '7';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = 'K';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "pYv)\u007f@\u0017c$3G^y/3QX7'zVCr%vW\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "DYs9|LS98fUGx9g\u000bu^\u0005WzyX\u001fZc~T\nGlxY\u0014@lsR\u0014PmvY\u0005Vi";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "\u0005Fb.f@S7?rV\\d";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "wRz$g@ro(vUC~$}\u0005Tx&~PY~(rQ^y,3R^c#3";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "uEx(vVD~%t\u0005Tx&cJYr%g\u0005";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\t\u0017";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "wRz$g@\u0017d.aS^t.3MVdkwLRsq3";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "vRy/zKP7?rV\\7";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0005Zd";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0005Er?aLRd";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "b^a\"}B\u0017b;3JY7/vI^a.aLYpk";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0005Vq?vW\u0017";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "\u0005Cv8xV\u0017c$3";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "vT\u007f.wP[~%t\u0005Er?a\\\u0017q$a\u0005";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "kXc\"uLTv?zJYZ*}DPr9PJZg*g";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "a^d(|KYr(g@S7-aJZ78vWA~(v\u0005";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "fXy%vFCr/3QX78vWA~(v\u0005";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "DYs9|LS98fUGx9g\u000bu^\u0005WzyX\u001fZc~T\nGlxY\u0014@lsR\u0014PmvY\u0005Vi";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "wRz$eLYpk\u007fLDc.}@E79vFXe/3CXek";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "uRe&zVD~$}\u0005Ge.`@Yck|K\u0017t$~UXy.}Q\u0017";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 36;
                    n2 = 37;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    array = z2;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 37;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "kXc\"uhVy\b|HGv?";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "dSs\"}B\u0017{\"`QRy.a\u0005Er(|WS7-|W\u0017";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\t\u0017y$g\u0005Vs/zKP7'zVCr%vW\u0017e.pJEse";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    break Label_1082;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public NotificationManagerCompat$SideChannelManager(final Context mContext) {
        this.mRecordMap = new HashMap();
        this.mCachedEnabledPackages = new HashSet();
        this.mContext = mContext;
        (this.mHandlerThread = new HandlerThread(NotificationManagerCompat$SideChannelManager.z[25])).start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper(), (Handler$Callback)this);
    }
    
    private boolean ensureServiceBound(final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord) {
        if (notificationManagerCompat$SideChannelManager$ListenerRecord.bound) {
            return true;
        }
        notificationManagerCompat$SideChannelManager$ListenerRecord.bound = this.mContext.bindService(new Intent(NotificationManagerCompat$SideChannelManager.z[2]).setComponent(notificationManagerCompat$SideChannelManager$ListenerRecord.componentName), (ServiceConnection)this, NotificationManagerCompat.access$000());
        if (notificationManagerCompat$SideChannelManager$ListenerRecord.bound) {
            notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount = 0;
            if (Fragment.a == 0) {
                return notificationManagerCompat$SideChannelManager$ListenerRecord.bound;
            }
        }
        Log.w(NotificationManagerCompat$SideChannelManager.z[0], NotificationManagerCompat$SideChannelManager.z[1] + notificationManagerCompat$SideChannelManager$ListenerRecord.componentName);
        this.mContext.unbindService((ServiceConnection)this);
        return notificationManagerCompat$SideChannelManager$ListenerRecord.bound;
    }
    
    private void ensureServiceUnbound(final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord) {
        if (notificationManagerCompat$SideChannelManager$ListenerRecord.bound) {
            this.mContext.unbindService((ServiceConnection)this);
            notificationManagerCompat$SideChannelManager$ListenerRecord.bound = false;
        }
        notificationManagerCompat$SideChannelManager$ListenerRecord.service = null;
    }
    
    private void handleQueueTask(final NotificationManagerCompat$Task notificationManagerCompat$Task) {
        final int a = Fragment.a;
        this.updateListenerMap();
        for (final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord : this.mRecordMap.values()) {
            notificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue.add(notificationManagerCompat$Task);
            this.processListenerQueue(notificationManagerCompat$SideChannelManager$ListenerRecord);
            if (a != 0) {
                break;
            }
        }
    }
    
    private void handleRetryListenerQueue(final ComponentName componentName) {
        final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord = this.mRecordMap.get(componentName);
        if (notificationManagerCompat$SideChannelManager$ListenerRecord != null) {
            this.processListenerQueue(notificationManagerCompat$SideChannelManager$ListenerRecord);
        }
    }
    
    private void handleServiceConnected(final ComponentName componentName, final IBinder binder) {
        final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord = this.mRecordMap.get(componentName);
        if (notificationManagerCompat$SideChannelManager$ListenerRecord != null) {
            notificationManagerCompat$SideChannelManager$ListenerRecord.service = INotificationSideChannel$Stub.asInterface(binder);
            notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount = 0;
            this.processListenerQueue(notificationManagerCompat$SideChannelManager$ListenerRecord);
        }
    }
    
    private void handleServiceDisconnected(final ComponentName componentName) {
        final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord = this.mRecordMap.get(componentName);
        if (notificationManagerCompat$SideChannelManager$ListenerRecord != null) {
            this.ensureServiceUnbound(notificationManagerCompat$SideChannelManager$ListenerRecord);
        }
    }
    
    private void processListenerQueue(final NotificationManagerCompat$SideChannelManager$ListenerRecord p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_2       
        //     4: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //     7: bipush          10
        //     9: aaload         
        //    10: iconst_3       
        //    11: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    14: ifeq            80
        //    17: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //    20: bipush          8
        //    22: aaload         
        //    23: new             Ljava/lang/StringBuilder;
        //    26: dup            
        //    27: invokespecial   java/lang/StringBuilder.<init>:()V
        //    30: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //    33: bipush          9
        //    35: aaload         
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: aload_1        
        //    40: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName:Landroid/content/ComponentName;
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    46: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //    49: bipush          11
        //    51: aaload         
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_1        
        //    56: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue:Ljava/util/LinkedList;
        //    59: invokevirtual   java/util/LinkedList.size:()I
        //    62: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    65: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //    68: iconst_3       
        //    69: aaload         
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    79: pop            
        //    80: aload_1        
        //    81: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue:Ljava/util/LinkedList;
        //    84: invokevirtual   java/util/LinkedList.isEmpty:()Z
        //    87: istore          5
        //    89: iload           5
        //    91: ifeq            103
        //    94: return         
        //    95: astore_3       
        //    96: aload_3        
        //    97: athrow         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //   103: aload_0        
        //   104: aload_1        
        //   105: invokespecial   android/support/v4/app/NotificationManagerCompat$SideChannelManager.ensureServiceBound:(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)Z
        //   108: ifeq            122
        //   111: aload_1        
        //   112: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.service:Landroid/support/v4/app/INotificationSideChannel;
        //   115: astore          8
        //   117: aload           8
        //   119: ifnonnull       138
        //   122: aload_0        
        //   123: aload_1        
        //   124: invokespecial   android/support/v4/app/NotificationManagerCompat$SideChannelManager.scheduleListenerRetry:(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
        //   127: return         
        //   128: astore          7
        //   130: aload           7
        //   132: athrow         
        //   133: astore          6
        //   135: aload           6
        //   137: athrow         
        //   138: aload_1        
        //   139: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue:Ljava/util/LinkedList;
        //   142: invokevirtual   java/util/LinkedList.peek:()Ljava/lang/Object;
        //   145: checkcast       Landroid/support/v4/app/NotificationManagerCompat$Task;
        //   148: astore          9
        //   150: aload           9
        //   152: ifnonnull       159
        //   155: iload_2        
        //   156: ifeq            228
        //   159: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   162: iconst_5       
        //   163: aaload         
        //   164: iconst_3       
        //   165: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   168: ifeq            205
        //   171: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   174: bipush          13
        //   176: aaload         
        //   177: new             Ljava/lang/StringBuilder;
        //   180: dup            
        //   181: invokespecial   java/lang/StringBuilder.<init>:()V
        //   184: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   187: bipush          15
        //   189: aaload         
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: aload           9
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   198: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   201: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   204: pop            
        //   205: aload           9
        //   207: aload_1        
        //   208: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.service:Landroid/support/v4/app/INotificationSideChannel;
        //   211: invokeinterface android/support/v4/app/NotificationManagerCompat$Task.send:(Landroid/support/v4/app/INotificationSideChannel;)V
        //   216: aload_1        
        //   217: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue:Ljava/util/LinkedList;
        //   220: invokevirtual   java/util/LinkedList.remove:()Ljava/lang/Object;
        //   223: pop            
        //   224: iload_2        
        //   225: ifeq            138
        //   228: aload_1        
        //   229: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue:Ljava/util/LinkedList;
        //   232: invokevirtual   java/util/LinkedList.isEmpty:()Z
        //   235: ifne            94
        //   238: aload_0        
        //   239: aload_1        
        //   240: invokespecial   android/support/v4/app/NotificationManagerCompat$SideChannelManager.scheduleListenerRetry:(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
        //   243: return         
        //   244: astore          13
        //   246: aload           13
        //   248: athrow         
        //   249: astore          14
        //   251: aload           14
        //   253: athrow         
        //   254: astore          15
        //   256: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   259: bipush          14
        //   261: aaload         
        //   262: iconst_3       
        //   263: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   266: ifeq            228
        //   269: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   272: bipush          7
        //   274: aaload         
        //   275: new             Ljava/lang/StringBuilder;
        //   278: dup            
        //   279: invokespecial   java/lang/StringBuilder.<init>:()V
        //   282: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   285: bipush          12
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: aload_1        
        //   292: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName:Landroid/content/ComponentName;
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   301: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   304: pop            
        //   305: goto            228
        //   308: astore          16
        //   310: aload           16
        //   312: athrow         
        //   313: astore          10
        //   315: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   318: iconst_4       
        //   319: aaload         
        //   320: new             Ljava/lang/StringBuilder;
        //   323: dup            
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: getstatic       android/support/v4/app/NotificationManagerCompat$SideChannelManager.z:[Ljava/lang/String;
        //   330: bipush          6
        //   332: aaload         
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: aload_1        
        //   337: getfield        android/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName:Landroid/content/ComponentName;
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   343: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   346: aload           10
        //   348: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   351: pop            
        //   352: iload_2        
        //   353: ifeq            228
        //   356: goto            224
        //   359: astore          11
        //   361: aload           11
        //   363: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      80     95     98     Landroid/os/DeadObjectException;
        //  80     89     98     103    Landroid/os/DeadObjectException;
        //  103    117    133    138    Landroid/os/DeadObjectException;
        //  122    127    128    133    Landroid/os/DeadObjectException;
        //  135    138    128    133    Landroid/os/DeadObjectException;
        //  159    205    249    254    Landroid/os/DeadObjectException;
        //  159    205    313    364    Landroid/os/RemoteException;
        //  205    224    254    313    Landroid/os/DeadObjectException;
        //  205    224    313    364    Landroid/os/RemoteException;
        //  228    243    244    249    Landroid/os/DeadObjectException;
        //  251    254    254    313    Landroid/os/DeadObjectException;
        //  251    254    313    364    Landroid/os/RemoteException;
        //  256    305    308    313    Landroid/os/DeadObjectException;
        //  315    352    359    364    Landroid/os/DeadObjectException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
    
    private void scheduleListenerRetry(final NotificationManagerCompat$SideChannelManager$ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord) {
        if (this.mHandler.hasMessages(3, (Object)notificationManagerCompat$SideChannelManager$ListenerRecord.componentName)) {
            return;
        }
        ++notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount;
        if (notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount > 6) {
            Log.w(NotificationManagerCompat$SideChannelManager.z[22], NotificationManagerCompat$SideChannelManager.z[19] + notificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue.size() + NotificationManagerCompat$SideChannelManager.z[23] + notificationManagerCompat$SideChannelManager$ListenerRecord.componentName + NotificationManagerCompat$SideChannelManager.z[21] + notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount + NotificationManagerCompat$SideChannelManager.z[18]);
            notificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue.clear();
            return;
        }
        final int n = 1000 * (1 << -1 + notificationManagerCompat$SideChannelManager$ListenerRecord.retryCount);
        if (Log.isLoggable(NotificationManagerCompat$SideChannelManager.z[20], 3)) {
            Log.d(NotificationManagerCompat$SideChannelManager.z[16], NotificationManagerCompat$SideChannelManager.z[24] + n + NotificationManagerCompat$SideChannelManager.z[17]);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, (Object)notificationManagerCompat$SideChannelManager$ListenerRecord.componentName), (long)n);
    }
    
    private void updateListenerMap() {
        final int a = Fragment.a;
        final Set enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
        if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
            this.mCachedEnabledPackages = enabledListenerPackages;
            final List queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat$SideChannelManager.z[32]), 4);
            final HashSet<ComponentName> set = new HashSet<ComponentName>();
            for (final ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName) || a != 0) {
                    final ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat$SideChannelManager.z[36], NotificationManagerCompat$SideChannelManager.z[34] + componentName + NotificationManagerCompat$SideChannelManager.z[41]);
                        if (a == 0) {
                            continue;
                        }
                    }
                    set.add(componentName);
                    if (a != 0) {
                        break;
                    }
                    continue;
                }
            }
            for (final ComponentName componentName2 : set) {
                if (!this.mRecordMap.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat$SideChannelManager.z[35], 3)) {
                        Log.d(NotificationManagerCompat$SideChannelManager.z[39], NotificationManagerCompat$SideChannelManager.z[40] + componentName2);
                    }
                    this.mRecordMap.put(componentName2, new NotificationManagerCompat$SideChannelManager$ListenerRecord(componentName2));
                }
                if (a != 0) {
                    break;
                }
            }
            final Iterator<Map.Entry<Object, V>> iterator3 = this.mRecordMap.entrySet().iterator();
            while (iterator3.hasNext()) {
                final Map.Entry<Object, V> entry = iterator3.next();
                if (!set.contains(entry.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat$SideChannelManager.z[37], 3)) {
                        Log.d(NotificationManagerCompat$SideChannelManager.z[38], NotificationManagerCompat$SideChannelManager.z[33] + entry.getKey());
                    }
                    this.ensureServiceUnbound((NotificationManagerCompat$SideChannelManager$ListenerRecord)entry.getValue());
                    iterator3.remove();
                }
                if (a != 0) {
                    return;
                }
            }
        }
    }
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                this.handleQueueTask((NotificationManagerCompat$Task)message.obj);
                return true;
            }
            case 1: {
                final NotificationManagerCompat$ServiceConnectedEvent notificationManagerCompat$ServiceConnectedEvent = (NotificationManagerCompat$ServiceConnectedEvent)message.obj;
                this.handleServiceConnected(notificationManagerCompat$ServiceConnectedEvent.componentName, notificationManagerCompat$ServiceConnectedEvent.iBinder);
                return true;
            }
            case 2: {
                this.handleServiceDisconnected((ComponentName)message.obj);
                return true;
            }
            case 3: {
                this.handleRetryListenerQueue((ComponentName)message.obj);
                return true;
            }
        }
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (Log.isLoggable(NotificationManagerCompat$SideChannelManager.z[29], 3)) {
            Log.d(NotificationManagerCompat$SideChannelManager.z[31], NotificationManagerCompat$SideChannelManager.z[30] + componentName);
        }
        this.mHandler.obtainMessage(1, (Object)new NotificationManagerCompat$ServiceConnectedEvent(componentName, binder)).sendToTarget();
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        if (Log.isLoggable(NotificationManagerCompat$SideChannelManager.z[27], 3)) {
            Log.d(NotificationManagerCompat$SideChannelManager.z[26], NotificationManagerCompat$SideChannelManager.z[28] + componentName);
        }
        this.mHandler.obtainMessage(2, (Object)componentName).sendToTarget();
    }
    
    public void queueTask(final NotificationManagerCompat$Task notificationManagerCompat$Task) {
        this.mHandler.obtainMessage(0, (Object)notificationManagerCompat$Task).sendToTarget();
    }
}
