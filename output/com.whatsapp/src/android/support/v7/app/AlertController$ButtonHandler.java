// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.content.DialogInterface$OnClickListener;
import android.os.Message;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.os.Handler;

final class AlertController$ButtonHandler extends Handler
{
    private WeakReference mDialog;
    
    public AlertController$ButtonHandler(final DialogInterface dialogInterface) {
        this.mDialog = new WeakReference((T)dialogInterface);
    }
    
    public void handleMessage(final Message message) {
        Label_0073: {
            switch (message.what) {
                case -3:
                case -2:
                case -1: {
                    ((DialogInterface$OnClickListener)message.obj).onClick((DialogInterface)this.mDialog.get(), message.what);
                    if (ActionBar.a) {
                        break Label_0073;
                    }
                    break;
                }
                case 1: {
                    ((DialogInterface)message.obj).dismiss();
                }
            }
        }
    }
}
