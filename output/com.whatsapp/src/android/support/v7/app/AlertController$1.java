// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.os.Message;
import android.view.View;
import android.view.View$OnClickListener;

class AlertController$1 implements View$OnClickListener
{
    final AlertController this$0;
    
    AlertController$1(final AlertController this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final boolean a = ActionBar.a;
        Message message = null;
        Label_0114: {
            if (view == AlertController.access$000(this.this$0) && AlertController.access$100(this.this$0) != null) {
                message = Message.obtain(AlertController.access$100(this.this$0));
                if (!a) {
                    break Label_0114;
                }
            }
            if (view == AlertController.access$200(this.this$0) && AlertController.access$300(this.this$0) != null) {
                message = Message.obtain(AlertController.access$300(this.this$0));
                if (!a) {
                    break Label_0114;
                }
            }
            if (view == AlertController.access$400(this.this$0) && AlertController.access$500(this.this$0) != null) {
                message = Message.obtain(AlertController.access$500(this.this$0));
                if (!a) {
                    break Label_0114;
                }
            }
            message = null;
        }
        if (message != null) {
            message.sendToTarget();
        }
        AlertController.access$700(this.this$0).obtainMessage(1, (Object)AlertController.access$600(this.this$0)).sendToTarget();
    }
}
