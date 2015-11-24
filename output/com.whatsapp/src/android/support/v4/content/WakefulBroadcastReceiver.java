// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.os.PowerManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver
{
    private static final SparseArray mActiveWakeLocks;
    private static int mNextId;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "g:]`\bo0\u0017a\u0012v$V`\u0013(7V|\u0013c:M<\u0010g?\\~\be?Pv";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'g';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "H;\u0019s\u0004r=OwGq5RwGj;ZyGo0\u00191";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Q5Rw\u0001s8{`\bg0Zs\u0014r\u0006\\q\u0002o\"\\`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "g:]`\bo0\u0017a\u0012v$V`\u0013(7V|\u0013c:M<\u0010g?\\~\be?Pv";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "v;Nw\u0015";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "q5Rw]";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        mActiveWakeLocks = new SparseArray();
        WakefulBroadcastReceiver.mNextId = 1;
    }
    
    public static boolean completeWakefulIntent(final Intent intent) {
        final int intExtra = intent.getIntExtra(WakefulBroadcastReceiver.z[0], 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (WakefulBroadcastReceiver.mActiveWakeLocks) {
            final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)WakefulBroadcastReceiver.mActiveWakeLocks.get(intExtra);
            if (powerManager$WakeLock != null) {
                powerManager$WakeLock.release();
                WakefulBroadcastReceiver.mActiveWakeLocks.remove(intExtra);
                return true;
            }
            Log.w(WakefulBroadcastReceiver.z[2], WakefulBroadcastReceiver.z[1] + intExtra);
            return true;
        }
    }
    
    public static ComponentName startWakefulService(final Context context, final Intent intent) {
        synchronized (WakefulBroadcastReceiver.mActiveWakeLocks) {
            final int mNextId = WakefulBroadcastReceiver.mNextId;
            ++WakefulBroadcastReceiver.mNextId;
            if (WakefulBroadcastReceiver.mNextId <= 0) {
                WakefulBroadcastReceiver.mNextId = 1;
            }
            intent.putExtra(WakefulBroadcastReceiver.z[3], mNextId);
            final ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            final PowerManager$WakeLock wakeLock = ((PowerManager)context.getSystemService(WakefulBroadcastReceiver.z[4])).newWakeLock(1, WakefulBroadcastReceiver.z[5] + startService.flattenToShortString());
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(60000L);
            WakefulBroadcastReceiver.mActiveWakeLocks.put(mNextId, (Object)wakeLock);
            return startService;
        }
    }
}
