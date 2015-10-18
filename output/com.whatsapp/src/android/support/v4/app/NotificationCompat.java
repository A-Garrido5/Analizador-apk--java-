// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.Notification;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Build$VERSION;

public class NotificationCompat
{
    private static final NotificationCompat$NotificationCompatImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            IMPL = new NotificationCompat$NotificationCompatImplApi21();
            return;
        }
        if (Build$VERSION.SDK_INT >= 20) {
            IMPL = new NotificationCompat$NotificationCompatImplApi20();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            IMPL = new NotificationCompat$NotificationCompatImplKitKat();
            return;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            IMPL = new NotificationCompat$NotificationCompatImplJellybean();
            return;
        }
        if (Build$VERSION.SDK_INT >= 14) {
            IMPL = new NotificationCompat$NotificationCompatImplIceCreamSandwich();
            return;
        }
        if (Build$VERSION.SDK_INT >= 11) {
            IMPL = new NotificationCompat$NotificationCompatImplHoneycomb();
            return;
        }
        if (Build$VERSION.SDK_INT >= 9) {
            IMPL = new NotificationCompat$NotificationCompatImplGingerbread();
            return;
        }
        IMPL = new NotificationCompat$NotificationCompatImplBase();
    }
    
    static void access$000(final NotificationBuilderWithActions notificationBuilderWithActions, final ArrayList list) {
        addActionsToBuilder(notificationBuilderWithActions, list);
    }
    
    static void access$100(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, final NotificationCompat$Style notificationCompat$Style) {
        addStyleToBuilderJellybean(notificationBuilderWithBuilderAccessor, notificationCompat$Style);
    }
    
    static NotificationCompat$NotificationCompatImpl access$200() {
        return NotificationCompat.IMPL;
    }
    
    private static void addActionsToBuilder(final NotificationBuilderWithActions notificationBuilderWithActions, final ArrayList list) {
        final int a = Fragment.a;
        final Iterator<NotificationCompat$Action> iterator = list.iterator();
        while (iterator.hasNext()) {
            notificationBuilderWithActions.addAction(iterator.next());
            if (a != 0) {
                break;
            }
        }
    }
    
    private static void addStyleToBuilderJellybean(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, final NotificationCompat$Style notificationCompat$Style) {
        final int a = Fragment.a;
        if (notificationCompat$Style != null) {
            if (notificationCompat$Style instanceof NotificationCompat$BigTextStyle) {
                final NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = (NotificationCompat$BigTextStyle)notificationCompat$Style;
                NotificationCompatJellybean.addBigTextStyle(notificationBuilderWithBuilderAccessor, notificationCompat$BigTextStyle.mBigContentTitle, notificationCompat$BigTextStyle.mSummaryTextSet, notificationCompat$BigTextStyle.mSummaryText, notificationCompat$BigTextStyle.mBigText);
                if (a == 0) {
                    return;
                }
            }
            if (notificationCompat$Style instanceof NotificationCompat$InboxStyle) {
                final NotificationCompat$InboxStyle notificationCompat$InboxStyle = (NotificationCompat$InboxStyle)notificationCompat$Style;
                NotificationCompatJellybean.addInboxStyle(notificationBuilderWithBuilderAccessor, notificationCompat$InboxStyle.mBigContentTitle, notificationCompat$InboxStyle.mSummaryTextSet, notificationCompat$InboxStyle.mSummaryText, notificationCompat$InboxStyle.mTexts);
                if (a == 0) {
                    return;
                }
            }
            if (notificationCompat$Style instanceof NotificationCompat$BigPictureStyle) {
                final NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle = (NotificationCompat$BigPictureStyle)notificationCompat$Style;
                NotificationCompatJellybean.addBigPictureStyle(notificationBuilderWithBuilderAccessor, notificationCompat$BigPictureStyle.mBigContentTitle, notificationCompat$BigPictureStyle.mSummaryTextSet, notificationCompat$BigPictureStyle.mSummaryText, notificationCompat$BigPictureStyle.mPicture, notificationCompat$BigPictureStyle.mBigLargeIcon, notificationCompat$BigPictureStyle.mBigLargeIconSet);
            }
        }
    }
    
    public static Bundle getExtras(final Notification notification) {
        return NotificationCompat.IMPL.getExtras(notification);
    }
}
