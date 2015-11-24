// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Message;
import android.os.Handler;

class FragmentActivity$1 extends Handler
{
    final FragmentActivity this$0;
    
    FragmentActivity$1(final FragmentActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void handleMessage(final Message message) {
        final int a = Fragment.a;
        Label_0060: {
            switch (message.what) {
                case 1: {
                    if (!this.this$0.mStopped) {
                        return;
                    }
                    this.this$0.doReallyStop(false);
                    if (a != 0) {
                        break Label_0060;
                    }
                    return;
                }
                case 2: {
                    this.this$0.onResumeFragments();
                    this.this$0.mFragments.execPendingActions();
                    if (a != 0) {
                        break;
                    }
                    return;
                }
            }
        }
        super.handleMessage(message);
    }
}
