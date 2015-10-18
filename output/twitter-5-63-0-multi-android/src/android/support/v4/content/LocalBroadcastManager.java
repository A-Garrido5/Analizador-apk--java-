// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Context;
import java.util.HashMap;

public class LocalBroadcastManager
{
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock;
    private final HashMap mActions;
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList mPendingBroadcasts;
    private final HashMap mReceivers;
    
    static {
        mLock = new Object();
    }
    
    private LocalBroadcastManager(final Context mAppContext) {
        this.mReceivers = new HashMap();
        this.mActions = new HashMap();
        this.mPendingBroadcasts = new ArrayList();
        this.mAppContext = mAppContext;
        this.mHandler = new LocalBroadcastManager$1(this, mAppContext.getMainLooper());
    }
    
    private void executePendingBroadcasts() {
    Label_0050_Outer:
        while (true) {
            while (true) {
                int n;
                synchronized (this.mReceivers) {
                    final int size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    final LocalBroadcastManager$BroadcastRecord[] array = new LocalBroadcastManager$BroadcastRecord[size];
                    this.mPendingBroadcasts.toArray(array);
                    this.mPendingBroadcasts.clear();
                    // monitorexit(this.mReceivers)
                    n = 0;
                    if (n >= array.length) {
                        continue Label_0050_Outer;
                    }
                    final LocalBroadcastManager$BroadcastRecord localBroadcastManager$BroadcastRecord = array[n];
                    for (int i = 0; i < localBroadcastManager$BroadcastRecord.receivers.size(); ++i) {
                        ((LocalBroadcastManager$ReceiverRecord)localBroadcastManager$BroadcastRecord.receivers.get(i)).receiver.onReceive(this.mAppContext, localBroadcastManager$BroadcastRecord.intent);
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    public static LocalBroadcastManager getInstance(final Context context) {
        synchronized (LocalBroadcastManager.mLock) {
            if (LocalBroadcastManager.mInstance == null) {
                LocalBroadcastManager.mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            return LocalBroadcastManager.mInstance;
        }
    }
    
    public void registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            final LocalBroadcastManager$ReceiverRecord localBroadcastManager$ReceiverRecord = new LocalBroadcastManager$ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<IntentFilter> list = this.mReceivers.get(broadcastReceiver);
            if (list == null) {
                list = new ArrayList<IntentFilter>(1);
                this.mReceivers.put(broadcastReceiver, list);
            }
            list.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); ++i) {
                final String action = intentFilter.getAction(i);
                ArrayList<?> list2 = this.mActions.get(action);
                if (list2 == null) {
                    list2 = new ArrayList<Object>(1);
                    this.mActions.put(action, list2);
                }
                list2.add(localBroadcastManager$ReceiverRecord);
            }
        }
    }
    
    public boolean sendBroadcast(final Intent intent) {
        // monitorexit(hashMap)
        while (true) {
            while (true) {
                String action;
                String resolveTypeIfNeeded;
                Uri data;
                String scheme;
                Set categories;
                int n;
                ArrayList<LocalBroadcastManager$ReceiverRecord> list;
                LocalBroadcastManager$ReceiverRecord localBroadcastManager$ReceiverRecord;
                int match;
                ArrayList<LocalBroadcastManager$ReceiverRecord> list2;
                int n2;
                ArrayList<LocalBroadcastManager$ReceiverRecord> list3 = null;
                String s;
                int i;
                Label_0505_Outer:Block_4_Outer:
                while (true) {
                Label_0505:
                    while (true) {
                        Block_17_Outer:Label_0321_Outer:
                        while (true) {
                            Label_0515: {
                                while (true) {
                                Label_0321:
                                    while (true) {
                                        synchronized (this.mReceivers) {
                                            action = intent.getAction();
                                            resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                                            data = intent.getData();
                                            scheme = intent.getScheme();
                                            categories = intent.getCategories();
                                            if ((0x8 & intent.getFlags()) == 0x0) {
                                                break Label_0515;
                                            }
                                            n = 1;
                                            if (n != 0) {
                                                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                                            }
                                            list = this.mActions.get(intent.getAction());
                                            if (list == null) {
                                                break;
                                            }
                                            if (n != 0) {
                                                Log.v("LocalBroadcastManager", "Action list: " + list);
                                            }
                                            break Label_0321;
                                            Label_0246: {
                                                match = localBroadcastManager$ReceiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                            }
                                            // iftrue(Label_0343:, match < 0)
                                            // iftrue(Label_0556:, n2 >= list.size())
                                            // iftrue(Label_0218:, n == 0)
                                            // iftrue(Label_0307:, n == 0)
                                            // iftrue(Label_0489:, list3 != null)
                                            // iftrue(Label_0521:, n == 0)
                                            // iftrue(Label_0246:, !localBroadcastManager$ReceiverRecord.broadcasting)
                                        Block_14:
                                            while (true) {
                                                Block_12: {
                                                    while (true) {
                                                        Label_0307: {
                                                            while (true) {
                                                                Block_15: {
                                                                    break Block_15;
                                                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                                                    break Label_0307;
                                                                    list2 = new ArrayList<LocalBroadcastManager$ReceiverRecord>();
                                                                    break Label_0321;
                                                                    localBroadcastManager$ReceiverRecord = list.get(n2);
                                                                    break Block_12;
                                                                }
                                                                continue Block_17_Outer;
                                                            }
                                                            list2.add(localBroadcastManager$ReceiverRecord);
                                                            localBroadcastManager$ReceiverRecord.broadcasting = true;
                                                            break Label_0505;
                                                        }
                                                        continue Label_0321_Outer;
                                                    }
                                                    break Block_14;
                                                }
                                                Log.v("LocalBroadcastManager", "Matching against filter " + localBroadcastManager$ReceiverRecord.filter);
                                                Label_0218:
                                                continue Block_4_Outer;
                                            }
                                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                                            list2 = list3;
                                            break Label_0505;
                                        }
                                        Label_0343: {
                                            if (n != 0) {
                                                switch (match) {
                                                    default: {
                                                        s = "unknown reason";
                                                        break;
                                                    }
                                                    case -3: {
                                                        s = "action";
                                                        break;
                                                    }
                                                    case -4: {
                                                        s = "category";
                                                        break;
                                                    }
                                                    case -2: {
                                                        s = "data";
                                                        break;
                                                    }
                                                    case -1: {
                                                        s = "type";
                                                        break;
                                                    }
                                                }
                                                Log.v("LocalBroadcastManager", "  Filter did not match: " + s);
                                            }
                                        }
                                        break Block_17_Outer;
                                        Label_0489:
                                        list2 = list3;
                                        continue Label_0321;
                                    }
                                    list3 = null;
                                    n2 = 0;
                                    continue Label_0505_Outer;
                                    ++n2;
                                    list3 = list2;
                                    continue Label_0505_Outer;
                                }
                            }
                            n = 0;
                            continue Label_0505_Outer;
                        }
                        list2 = list3;
                        continue Label_0505;
                    }
                    while (true) {
                        this.mHandler.sendEmptyMessage(1);
                        Label_0443: {
                            Label_0481: {
                                break Label_0481;
                                while (i < list3.size()) {
                                    list3.get(i).broadcasting = false;
                                    ++i;
                                }
                                break Label_0443;
                            }
                            return true;
                        }
                        this.mPendingBroadcasts.add(new LocalBroadcastManager$BroadcastRecord(intent, list3));
                        continue;
                    }
                }
                // monitorexit(hashMap)
                // iftrue(Label_0481:, this.mHandler.hasMessages(1))
                return false;
                Label_0556: {
                    if (list3 != null) {
                        i = 0;
                        continue;
                    }
                }
                break;
            }
            continue;
        }
    }
    
    public void sendBroadcastSync(final Intent intent) {
        if (this.sendBroadcast(intent)) {
            this.executePendingBroadcasts();
        }
    }
    
    public void unregisterReceiver(final BroadcastReceiver broadcastReceiver) {
    Label_0028_Outer:
        while (true) {
        Label_0094_Outer:
            while (true) {
                int n2 = 0;
            Label_0053:
                while (true) {
                    ArrayList<IntentFilter> list;
                    IntentFilter intentFilter;
                    int n = 0;
                    String action;
                    ArrayList<LocalBroadcastManager$ReceiverRecord> list2;
                    int n3;
                    int n4 = 0;
                    Label_0094:Block_8_Outer:Block_7_Outer:
                    while (true) {
                        Label_0180: {
                            Label_0174: {
                                synchronized (this.mReceivers) {
                                    list = this.mReceivers.remove(broadcastReceiver);
                                    if (list == null) {
                                        return;
                                    }
                                    break Label_0174;
                                    // iftrue(Label_0189:, list2 == null)
                                    // iftrue(Label_0159:, n2 >= list.size())
                                    // iftrue(Label_0195:, n >= intentFilter.countActions())
                                    // iftrue(Label_0189:, list2.size() > 0)
                                    // iftrue(Label_0167:, (LocalBroadcastManager$ReceiverRecord)list2.get(n3).receiver != broadcastReceiver)
                                    // iftrue(Label_0138:, n3 >= list2.size())
                                    Block_4: {
                                        while (true) {
                                            action = intentFilter.getAction(n);
                                            list2 = this.mActions.get(action);
                                            Block_6: {
                                                break Block_6;
                                                break Block_4;
                                            }
                                            n3 = 0;
                                            break Label_0094;
                                            Label_0159: {
                                                return;
                                            }
                                            continue Label_0028_Outer;
                                        }
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    this.mActions.remove(action);
                                                    break Label_0094;
                                                    list2.remove(n3);
                                                    n4 = n3 - 1;
                                                    break Label_0180;
                                                    Label_0138: {
                                                        continue Block_8_Outer;
                                                    }
                                                }
                                                continue Block_7_Outer;
                                            }
                                            continue;
                                        }
                                    }
                                    intentFilter = list.get(n2);
                                    n = 0;
                                    continue Label_0053;
                                }
                                Label_0167: {
                                    n4 = n3;
                                }
                                break Label_0180;
                            }
                            n2 = 0;
                            continue Label_0094_Outer;
                        }
                        n3 = n4 + 1;
                        continue Label_0094;
                    }
                    ++n;
                    continue Label_0053;
                }
                Label_0195: {
                    ++n2;
                }
                continue Label_0094_Outer;
            }
        }
    }
}
