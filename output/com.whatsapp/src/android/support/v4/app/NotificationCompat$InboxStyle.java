// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.ArrayList;

public class NotificationCompat$InboxStyle extends NotificationCompat$Style
{
    ArrayList mTexts;
    
    public NotificationCompat$InboxStyle() {
        this.mTexts = new ArrayList();
    }
    
    public NotificationCompat$InboxStyle addLine(final CharSequence charSequence) {
        this.mTexts.add(NotificationCompat$Builder.limitCharSequenceLength(charSequence));
        return this;
    }
    
    public NotificationCompat$InboxStyle setSummaryText(final CharSequence charSequence) {
        this.mSummaryText = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
        this.mSummaryTextSet = true;
        return this;
    }
}
