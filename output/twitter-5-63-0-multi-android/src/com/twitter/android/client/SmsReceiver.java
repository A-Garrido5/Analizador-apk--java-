// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Bundle;
import android.content.Intent;
import java.util.regex.Matcher;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import android.telephony.SmsMessage;
import android.content.Context;
import java.util.regex.Pattern;
import android.content.BroadcastReceiver;

public class SmsReceiver extends BroadcastReceiver
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("\\b(\\d{6})\\b");
    }
    
    private void a(final Context context, final SmsMessage smsMessage) {
        if (smsMessage == null) {
            return;
        }
    Label_0045_Outer:
        while (true) {
            while (true) {
            Label_0117:
                while (true) {
                    try {
                        final String messageBody = smsMessage.getMessageBody();
                        if (messageBody != null) {
                            final Matcher matcher = SmsReceiver.a.matcher(messageBody);
                            if (!matcher.find()) {
                                break Label_0117;
                            }
                            final String group = matcher.group(1);
                            if (!TextUtils.isEmpty((CharSequence)group)) {
                                ScribeService.a(context, ((TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { "app:sms_receiver:confirmation_sms::success" })).c(2));
                                c.a(context).a(group);
                            }
                        }
                        return;
                    }
                    catch (NullPointerException ex) {
                        ErrorReporter.a(ex);
                        final String messageBody = null;
                        continue Label_0045_Outer;
                    }
                    break;
                }
                final String group = null;
                continue;
            }
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            final Object[] array = (Object[])extras.get("pdus");
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a(context, SmsMessage.createFromPdu((byte[])array[i]));
            }
        }
    }
}
