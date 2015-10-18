// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification;

class NotificationCompatSideChannelService$NotificationSideChannelStub extends INotificationSideChannel$Stub
{
    final NotificationCompatSideChannelService this$0;
    
    private NotificationCompatSideChannelService$NotificationSideChannelStub(final NotificationCompatSideChannelService this$0) {
        this.this$0 = this$0;
    }
    
    NotificationCompatSideChannelService$NotificationSideChannelStub(final NotificationCompatSideChannelService notificationCompatSideChannelService, final NotificationCompatSideChannelService$1 notificationCompatSideChannelService$1) {
        this(notificationCompatSideChannelService);
    }
    
    public void cancel(final String s, final int n, final String s2) {
        NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), s);
        final long clearCallingIdentity = clearCallingIdentity();
        try {
            this.this$0.cancel(s, n, s2);
        }
        finally {
            restoreCallingIdentity(clearCallingIdentity);
        }
    }
    
    public void cancelAll(final String s) {
        NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), s);
        final long clearCallingIdentity = clearCallingIdentity();
        try {
            this.this$0.cancelAll(s);
        }
        finally {
            restoreCallingIdentity(clearCallingIdentity);
        }
    }
    
    public void notify(final String s, final int n, final String s2, final Notification notification) {
        NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), s);
        final long clearCallingIdentity = clearCallingIdentity();
        try {
            this.this$0.notify(s, n, s2, notification);
        }
        finally {
            restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
