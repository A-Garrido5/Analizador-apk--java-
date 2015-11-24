// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

public class LocalBroadcastManager
{
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock;
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions;
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers;
    
    static {
        mLock = new Object();
    }
    
    private LocalBroadcastManager(final Context mAppContext) {
        this.mReceivers = new HashMap<BroadcastReceiver, ArrayList<IntentFilter>>();
        this.mActions = new HashMap<String, ArrayList<ReceiverRecord>>();
        this.mPendingBroadcasts = new ArrayList<BroadcastRecord>();
        this.mAppContext = mAppContext;
        this.mHandler = new Handler(mAppContext.getMainLooper()) {
            public void handleMessage(final Message message) {
                switch (message.what) {
                    default: {
                        super.handleMessage(message);
                    }
                    case 1: {
                        LocalBroadcastManager.this.executePendingBroadcasts();
                    }
                }
            }
        };
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
                    final BroadcastRecord[] array = new BroadcastRecord[size];
                    this.mPendingBroadcasts.toArray(array);
                    this.mPendingBroadcasts.clear();
                    // monitorexit(this.mReceivers)
                    n = 0;
                    if (n >= array.length) {
                        continue Label_0050_Outer;
                    }
                    final BroadcastRecord broadcastRecord = array[n];
                    for (int i = 0; i < broadcastRecord.receivers.size(); ++i) {
                        ((ReceiverRecord)broadcastRecord.receivers.get(i)).receiver.onReceive(this.mAppContext, broadcastRecord.intent);
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
            final ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<IntentFilter> list = this.mReceivers.get(broadcastReceiver);
            if (list == null) {
                list = new ArrayList<IntentFilter>(1);
                this.mReceivers.put(broadcastReceiver, list);
            }
            list.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); ++i) {
                final String action = intentFilter.getAction(i);
                ArrayList<ReceiverRecord> list2 = this.mActions.get(action);
                if (list2 == null) {
                    list2 = new ArrayList<ReceiverRecord>(1);
                    this.mActions.put(action, list2);
                }
                list2.add(receiverRecord);
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
                ArrayList<ReceiverRecord> list;
                ReceiverRecord receiverRecord;
                ArrayList<ReceiverRecord> list2 = null;
                int n2 = 0;
                int match;
                String s;
                int i;
                Label_0439_Outer:Label_0477_Outer:
                while (true) {
                    Label_0317_Outer:Block_11_Outer:Block_13_Outer:Block_17_Outer:Label_0162_Outer:
                    while (true) {
                        Label_0500: {
                            while (true) {
                                Label_0494: {
                                    Label_0485: {
                                        synchronized (this.mReceivers) {
                                            action = intent.getAction();
                                            resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                                            data = intent.getData();
                                            scheme = intent.getScheme();
                                            categories = intent.getCategories();
                                            if ((0x8 & intent.getFlags()) == 0x0) {
                                                break Label_0500;
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
                                            break Label_0485;
                                            // iftrue(Label_0218:, n == 0)
                                            // iftrue(Label_0494:, n == 0)
                                            // iftrue(Label_0339:, match < 0)
                                            // iftrue(Label_0303:, n == 0)
                                            // iftrue(Label_0534:, n2 >= list.size())
                                            // iftrue(Label_0242:, !receiverRecord.broadcasting)
                                            while (true) {
                                                Label_0303: {
                                                    while (true) {
                                                    Block_16_Outer:
                                                        while (true) {
                                                            while (true) {
                                                            Block_15:
                                                                while (true) {
                                                                Block_12_Outer:
                                                                    while (true) {
                                                                        Log.v("LocalBroadcastManager", "  Filter's target already added");
                                                                        break Label_0494;
                                                                        while (true) {
                                                                            Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.filter);
                                                                            break Block_16_Outer;
                                                                            list2.add(receiverRecord);
                                                                            receiverRecord.broadcasting = true;
                                                                            break Label_0494;
                                                                            receiverRecord = list.get(n2);
                                                                            continue Label_0317_Outer;
                                                                        }
                                                                        Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                                                        break Label_0303;
                                                                        continue Block_12_Outer;
                                                                    }
                                                                    Label_0242: {
                                                                        match = receiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                                                    }
                                                                    break Block_15;
                                                                    list2 = new ArrayList<ReceiverRecord>();
                                                                    continue Block_11_Outer;
                                                                }
                                                                continue Block_13_Outer;
                                                            }
                                                            continue Block_16_Outer;
                                                        }
                                                        continue Block_17_Outer;
                                                    }
                                                }
                                                continue Label_0162_Outer;
                                            }
                                        }
                                        // iftrue(Label_0317:, list2 != null)
                                        Label_0339: {
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
                                        break Label_0494;
                                    }
                                    n2 = 0;
                                    list2 = null;
                                    continue Label_0439_Outer;
                                }
                                ++n2;
                                continue Label_0439_Outer;
                            }
                        }
                        n = 0;
                        continue Label_0439_Outer;
                    }
                    // iftrue(Label_0477:, this.mHandler.hasMessages(1))
                    // monitorexit(hashMap)
                    while (true) {
                        Block_4: {
                            while (true) {
                                this.mPendingBroadcasts.add(new BroadcastRecord(intent, list2));
                                break Block_4;
                                while (i < list2.size()) {
                                    list2.get(i).broadcasting = false;
                                    ++i;
                                }
                                continue Label_0477_Outer;
                            }
                            return true;
                        }
                        this.mHandler.sendEmptyMessage(1);
                        continue;
                    }
                }
                return false;
                Label_0534: {
                    if (list2 != null) {
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
        ArrayList<IntentFilter> list;
        String action;
        ArrayList<ReceiverRecord> list2;
        int n = 0;
        int n2 = 0;
        IntentFilter intentFilter;
        int n3 = 0;
        Block_8_Outer:Label_0053_Outer:Label_0028_Outer:
        while (true) {
        Label_0028:
            while (true) {
                Block_6_Outer:Label_0094_Outer:
                while (true) {
                    Label_0094:Block_4_Outer:
                    while (true) {
                        Label_0170: {
                            Label_0164: {
                                synchronized (this.mReceivers) {
                                    list = this.mReceivers.remove(broadcastReceiver);
                                    if (list == null) {
                                        return;
                                    }
                                    break Label_0164;
                                    // iftrue(Label_0176:, list2.size() > 0)
                                    while (true) {
                                        this.mActions.remove(action);
                                        break Label_0094;
                                        Label_0135: {
                                            continue Block_8_Outer;
                                        }
                                    }
                                    // iftrue(Label_0182:, n2 >= intentFilter.countActions())
                                    // iftrue(Label_0170:, (ReceiverRecord)list2.get(n).receiver != broadcastReceiver)
                                    // iftrue(Label_0135:, n >= list2.size())
                                    // iftrue(Label_0176:, list2 == null)
                                    while (true) {
                                        while (true) {
                                            Block_5: {
                                                while (true) {
                                                    while (true) {
                                                        list2.remove(n);
                                                        --n;
                                                        break Label_0170;
                                                        break Block_5;
                                                        n = 0;
                                                        break Label_0094;
                                                        continue Label_0053_Outer;
                                                    }
                                                    intentFilter = list.get(n3);
                                                    n2 = 0;
                                                    continue Block_6_Outer;
                                                    continue Block_4_Outer;
                                                }
                                                Label_0156: {
                                                    return;
                                                }
                                            }
                                            action = intentFilter.getAction(n2);
                                            list2 = this.mActions.get(action);
                                            continue Label_0094_Outer;
                                        }
                                        continue Label_0028_Outer;
                                    }
                                }
                                // iftrue(Label_0156:, n3 >= list.size())
                            }
                            n3 = 0;
                            continue Label_0028;
                        }
                        ++n;
                        continue Label_0094;
                    }
                    ++n2;
                    continue Label_0028_Outer;
                }
                Label_0182: {
                    ++n3;
                }
                continue Label_0028;
            }
        }
    }
    
    private static class BroadcastRecord
    {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;
        
        BroadcastRecord(final Intent intent, final ArrayList<ReceiverRecord> receivers) {
            this.intent = intent;
            this.receivers = receivers;
        }
    }
    
    private static class ReceiverRecord
    {
        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;
        
        ReceiverRecord(final IntentFilter filter, final BroadcastReceiver receiver) {
            this.filter = filter;
            this.receiver = receiver;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            sb.append("}");
            return sb.toString();
        }
    }
}
