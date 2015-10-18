// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.IBinder;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.twitter.media.NativeCrashHandler;
import java.io.File;
import com.twitter.library.util.af;
import android.os.Messenger;
import android.app.Service;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Message;
import android.content.Context;
import android.os.Handler;

class b extends Handler
{
    private Context a;
    
    public b(final Context a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final Message obtain = Message.obtain((Handler)null, message.what, message.arg1, message.arg2, (Object)null);
        Bundle data;
        MediaServiceTask mediaServiceTask;
        Bundle data2;
        Bundle data3;
        Block_2_Outer:Label_0129_Outer:
        while (true) {
            while (true) {
                switch (message.what) {
                    default: {
                        break Label_0044;
                    }
                    case 1: {
                        Label_0053: {
                            break Label_0053;
                            try {
                                message.replyTo.send(obtain);
                                return;
                                // iftrue(Label_0044:, MediaService.a() == null)
                                // iftrue(Label_0044:, data == null)
                            Block_3:
                                while (true) {
                                    try {
                                        data.setClassLoader(this.getClass().getClassLoader());
                                        mediaServiceTask = (MediaServiceTask)data.getParcelable("parcel");
                                        mediaServiceTask.a(this.a);
                                        data2 = new Bundle();
                                        data2.putParcelable("parcel", (Parcelable)mediaServiceTask);
                                        obtain.setData(data2);
                                    }
                                    catch (Exception ex) {}
                                    continue Block_2_Outer;
                                    break Block_3;
                                    data = message.getData();
                                    continue Label_0129_Outer;
                                }
                                data3 = new Bundle();
                                data3.putString("crash", MediaService.a);
                                obtain.setData(data3);
                                continue Block_2_Outer;
                            }
                            catch (Exception ex2) {
                                return;
                            }
                        }
                        break;
                    }
                    case 2: {
                        continue;
                    }
                }
                break;
            }
            break;
        }
    }
}
