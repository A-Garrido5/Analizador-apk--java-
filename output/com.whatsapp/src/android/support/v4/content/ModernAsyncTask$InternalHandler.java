// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.os.Message;
import android.os.Handler;

class ModernAsyncTask$InternalHandler extends Handler
{
    private ModernAsyncTask$InternalHandler() {
    }
    
    ModernAsyncTask$InternalHandler(final ModernAsyncTask$1 modernAsyncTask$1) {
        this();
    }
    
    public void handleMessage(final Message message) {
        final ModernAsyncTask$AsyncTaskResult modernAsyncTask$AsyncTaskResult = (ModernAsyncTask$AsyncTaskResult)message.obj;
        Label_0056: {
            switch (message.what) {
                case 1: {
                    ModernAsyncTask.access$500(modernAsyncTask$AsyncTaskResult.mTask, modernAsyncTask$AsyncTaskResult.mData[0]);
                    if (ContextCompat.a) {
                        break Label_0056;
                    }
                    break;
                }
                case 2: {
                    modernAsyncTask$AsyncTaskResult.mTask.onProgressUpdate(modernAsyncTask$AsyncTaskResult.mData);
                }
            }
        }
    }
}
