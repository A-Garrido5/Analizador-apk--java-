// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.messaging.MessageService;
import java.util.concurrent.Callable;
import com.whatsapp.ha;
import android.util.Pair;
import com.whatsapp.protocol.cr;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.Log;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.p;
import java.util.Arrays;
import com.whatsapp.DialogToastActivity;
import android.text.TextUtils;
import com.whatsapp.adc;
import com.whatsapp.aol;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import com.whatsapp.proto.E2E$Message;
import com.whatsapp.App;
import java.util.Random;
import org.whispersystems.jobqueue.e;
import com.whatsapp.jobqueue.b;
import org.whispersystems.jobqueue.a;

public final class SendE2EMessageJob extends a implements b, e
{
    public static int g = 0;
    private static final Random random;
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App f;
    private final String groupParticipantHash;
    private final String[] groupParticipants;
    private transient com.whatsapp.jobqueue.a h;
    private final String id;
    private final String jid;
    private final E2E$Message message;
    private final String participant;
    private final int retryCount;
    private final String webAttribute;
    
    static {
        final String[] z2 = new String[35];
        String s = "\u0000u@\u0007\u001f\u0011dL\fO\u0012eJ\u000e\nE~F\f\u000b\fcDB\nWh\u0003\u000f\n\u0016~B\u0005\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0907:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'o';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = 'b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "^-D\u0010\u0000\u0010}s\u0003\u001d\u0011d@\u000b\u001f\u0004cW\u0011R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "^-Q\u0007\u001b\u0017t`\r\u001a\u000by\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^-J\u0006R";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "^-D\u0010\u0000\u0010}s\u0003\u001d\u0011d@\u000b\u001f\u0004cW*\u000e\u0016e\u001e";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "^-T\u0007\r$yW\u0010\u0006\u0007xW\u0007R";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "^-S\u0003\u001d\u0011d@\u000b\u001f\u0004cW_";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "^-I\u000b\u000bX";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0010cQ\u0007\f\njM\u000b\u0015\u0000i\u0003\u0001\u0006\u0015eF\u0010\u001b\u0000uWB\u0002\u0000~P\u0003\b\u0000-W\u001b\u001f\u00006\u0003\u0016\u0016\u0015h\u001e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-W\rO\u0004c\u0003\u0007\u0002\u0015yZB\u0003\f~W";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0017hW\u0010\u0016&bV\f\u001bEnB\f\u0001\ny\u0003\u0000\nEcF\u0005\u000e\u0011dU\u0007";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-J\u0004O\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-J\u0011O\u0016hW";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\fk\u0003\u0012\u000e\u0017yJ\u0001\u0006\u0015lM\u0016O\f~\u0003\u0011\n\u0011";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    s = "\bhP\u0011\u000e\u0002h\u0003\u000f\u001a\u0016y\u0003\f\u0000\u0011-A\u0007O\u000bxO\u000e";
                    n = 12;
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    array = z2;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\u0011b\u0003\u0003\u0001EhN\u0012\u001b\u001c-P\u0016\u001d\fcD";
                    n = 13;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\fi\u0003\u000f\u001a\u0016y\u0003\f\u0000\u0011-A\u0007O\u000bxO\u000e";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\fk\u0003\u0016\u0007\u0000-S\u0010\u0006\blQ\u001bO\u000fdGB\u0006\u0016-M\r\u001bEl\u0003\u0005\u001d\nxS";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-N\u0017\u001c\u0011-M\r\u001bEoFB\u001b\rh\u0003\u0007\u0002\u0015yZB\u001c\u0011\u007fJ\f\b";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-J\u0004O\u0011eFB\u001f\u0017dN\u0003\u001d\u001c-I\u000b\u000bEdPB\u0001\ny\u0003\u0003O\u0002\u007fL\u0017\u001f";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-@\u0003\u0001\u000bbWB\r\u0000-P\u0007\u001bEdEB\u001b\rh\u0003\u0012\u001d\f`B\u0010\u0016EgJ\u0006O\f~\u0003\f\u0000\u0011-BB\b\u0017bV\u0012";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u000fdGB\u0002\u0010~WB\u0001\ny\u0003\u0000\nEcV\u000e\u0003";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0006lM\f\u0000\u0011-V\u0011\nEjQ\r\u001a\u0015-F\f\f\u0017tS\u0016\u0006\nc\u0003\u0003\u0001\u0001-L\u000e\u000bElO\u000b\f\u0000-A\u0003\u001c\u0000-H\u0007\u0016E~J\u000f\u001a\tyB\f\n\nxP\u000e\u0016";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0006lM\f\u0000\u0011-V\u0011\nEhN\u0012\u001b\u001c-L\u000e\u000bElO\u000b\f\u0000-A\u0003\u001c\u0000-H\u0007\u0016";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-W\rO\u0004c\u0003\u0007\u0002\u0015yZB\u0003\f~W";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\fk\u0003\u0016\u0007\u0000-S\u0010\u0006\blQ\u001bO\u000fdGB\u0006\u0016-M\r\u001bEl\u0003\u0005\u001d\nxS";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\fk\u0003\u0012\u000e\u0017yJ\u0001\u0006\u0015lM\u0016O\f~\u0003\u0011\n\u0011";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0017hW\u0010\u0016&bV\f\u001bEnB\f\u0001\ny\u0003\u0000\nEcF\u0005\u000e\u0011dU\u0007";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-J\u0004O\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-J\u0011O\u0016hW";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011~\u0003\u0001\u000e\u000bcL\u0016O\u0007h\u0003\u0011\n\u0011-J\u0004O\u0011eFB\u001f\u0017dN\u0003\u001d\u001c-I\u000b\u000bEdPB\u0001\ny\u0003\u0003O\u0002\u007fL\u0017\u001f";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-N\u0017\u001c\u0011-M\r\u001bEoFB\u001b\rh\u0003\u0007\u0002\u0015yZB\u001c\u0011\u007fJ\f\b";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0015lQ\u0016\u0006\u0006dS\u0003\u0001\u0011-@\u0003\u0001\u000bbWB\r\u0000-P\u0007\u001bEdEB\u001b\rh\u0003\u0012\u001d\f`B\u0010\u0016EgJ\u0006O\f~\u0003\f\u0000\u0011-BB\b\u0017bV\u0012";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0002\u007fL\u0017\u001f5lQ\u0016\u0006\u0006dS\u0003\u0001\u0011EB\u0011\u0007EnB\f\u0001\ny\u0003\u0000\nE~F\u0016O\u0011b\u0003\u0003\u0001EhN\u0012\u001b\u001c-P\u0016\u001d\fcD";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0004oL\u0010\u001b\fcDB\nWh\u0003\u000f\n\u0016~B\u0005\nE~F\f\u000bEgL\u0000O\u0001xFB\u001b\n-K\u000b\b\r-Q\u0007\u001b\u0017t\u0003\u0001\u0000\u0010cW";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0017xM\f\u0006\u000bj\u0003\u0007]\u0000-N\u0007\u001c\u0016lD\u0007O\u0016hM\u0006O\u000fbA";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\bhP\u0011\u000e\u0002h";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    break Label_0907;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        random = new Random();
    }
    
    public SendE2EMessageJob(@NonNull final E2E$Message e2E$Message, @NonNull final String s, @NonNull final String s2, @Nullable final String participant, final int retryCount, @Nullable final String[] groupParticipants, @Nullable final String groupParticipantHash, @Nullable final String webAttribute, @Nullable final byte[] array) {
        final int g = SendE2EMessageJob.g;
        super(a(s2, participant, array));
        this.message = (E2E$Message)aol.a(e2E$Message);
        this.id = (String)aol.a((CharSequence)s);
        this.jid = (String)aol.a((CharSequence)s2);
        this.participant = participant;
        this.retryCount = retryCount;
        this.groupParticipants = groupParticipants;
        this.groupParticipantHash = groupParticipantHash;
        this.webAttribute = webAttribute;
        final boolean b = adc.b(s2);
        if (participant != null) {
            try {
                if (TextUtils.isEmpty((CharSequence)participant)) {
                    throw new IllegalArgumentException(SendE2EMessageJob.z[29] + this.a());
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)participant) && !b) {
                try {
                    throw new IllegalArgumentException(SendE2EMessageJob.z[30] + this.a());
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        if (retryCount < 0) {
            try {
                throw new IllegalArgumentException(SendE2EMessageJob.z[26] + this.a());
            }
            catch (IllegalArgumentException ex4) {
                throw ex4;
            }
        }
        if (groupParticipants != null) {
            try {
                if (groupParticipants.length == 0) {
                    throw new IllegalArgumentException(SendE2EMessageJob.z[23] + this.a());
                }
            }
            catch (IllegalArgumentException ex5) {
                throw ex5;
            }
        }
        if (groupParticipants != null && !b) {
            try {
                throw new IllegalArgumentException(SendE2EMessageJob.z[28] + this.a());
            }
            catch (IllegalArgumentException ex6) {
                throw ex6;
            }
        }
        if (groupParticipants != null && participant != null) {
            try {
                throw new IllegalArgumentException(SendE2EMessageJob.z[27] + this.a());
            }
            catch (IllegalArgumentException ex7) {
                throw ex7;
            }
        }
        if (groupParticipantHash != null) {
            try {
                if (TextUtils.isEmpty((CharSequence)groupParticipantHash)) {
                    throw new IllegalArgumentException(SendE2EMessageJob.z[31] + this.a());
                }
            }
            catch (IllegalArgumentException ex8) {
                throw ex8;
            }
        }
        if (groupParticipantHash != null && !b) {
            try {
                throw new IllegalArgumentException(SendE2EMessageJob.z[24] + this.a());
            }
            catch (IllegalArgumentException ex9) {
                throw ex9;
            }
        }
        if (groupParticipantHash != null && participant != null) {
            try {
                throw new IllegalArgumentException(SendE2EMessageJob.z[25] + this.a());
            }
            catch (IllegalArgumentException ex10) {
                throw ex10;
            }
        }
        if (g == 0) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    if (DialogToastActivity.h) {
                        final boolean h = false;
                        DialogToastActivity.h = h;
                        return;
                    }
                }
                catch (IllegalArgumentException ex11) {
                    throw ex11;
                }
                final boolean h = true;
                continue;
            }
        }
    }
    
    private static int a(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(SendE2EMessageJob.z[8] + n);
            }
            case 2: {
                return 0;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
        }
    }
    
    private String a() {
        return SendE2EMessageJob.z[3] + this.id + SendE2EMessageJob.z[7] + this.jid + SendE2EMessageJob.z[6] + this.participant + SendE2EMessageJob.z[2] + this.retryCount + SendE2EMessageJob.z[1] + Arrays.toString(this.groupParticipants) + SendE2EMessageJob.z[4] + this.groupParticipantHash + SendE2EMessageJob.z[5] + this.webAttribute;
    }
    
    static String a(final SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.jid;
    }
    
    private static p a(@NonNull final String p0, @Nullable final String p1, @Nullable final byte[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            75
        //    11: aload_0        
        //    12: astore          5
        //    14: invokestatic    org/whispersystems/jobqueue/p.h:()Lorg/whispersystems/jobqueue/g;
        //    17: aload           5
        //    19: invokevirtual   org/whispersystems/jobqueue/g.a:(Ljava/lang/String;)Lorg/whispersystems/jobqueue/g;
        //    22: invokevirtual   org/whispersystems/jobqueue/g.b:()Lorg/whispersystems/jobqueue/g;
        //    25: new             Lcom/whatsapp/jobqueue/requirement/ChatConnectionRequirement;
        //    28: dup            
        //    29: invokespecial   com/whatsapp/jobqueue/requirement/ChatConnectionRequirement.<init>:()V
        //    32: invokevirtual   org/whispersystems/jobqueue/g.a:(Lorg/whispersystems/jobqueue/requirements/e;)Lorg/whispersystems/jobqueue/g;
        //    35: astore          6
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokestatic    com/whatsapp/jobqueue/job/SendE2EMessageJob.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //    42: istore          7
        //    44: aload_2        
        //    45: ifnull          81
        //    48: aload_2        
        //    49: arraylength    
        //    50: ifne            81
        //    53: new             Ljava/lang/IllegalArgumentException;
        //    56: dup            
        //    57: getstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.z:[Ljava/lang/String;
        //    60: bipush          22
        //    62: aaload         
        //    63: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    66: athrow         
        //    67: astore          15
        //    69: aload           15
        //    71: athrow         
        //    72: astore_3       
        //    73: aload_3        
        //    74: athrow         
        //    75: aload_1        
        //    76: astore          5
        //    78: goto            14
        //    81: iload           7
        //    83: ifeq            109
        //    86: aload_2        
        //    87: ifnull          109
        //    90: new             Ljava/lang/IllegalArgumentException;
        //    93: dup            
        //    94: getstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.z:[Ljava/lang/String;
        //    97: bipush          21
        //    99: aaload         
        //   100: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   103: athrow         
        //   104: astore          14
        //   106: aload           14
        //   108: athrow         
        //   109: iload           7
        //   111: ifeq            138
        //   114: aload           6
        //   116: new             Lcom/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement;
        //   119: dup            
        //   120: aload_0        
        //   121: invokespecial   com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.<init>:(Ljava/lang/String;)V
        //   124: invokevirtual   org/whispersystems/jobqueue/g.a:(Lorg/whispersystems/jobqueue/requirements/e;)Lorg/whispersystems/jobqueue/g;
        //   127: pop            
        //   128: getstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.g:I
        //   131: istore          13
        //   133: iload           13
        //   135: ifeq            173
        //   138: aload           6
        //   140: new             Lcom/whatsapp/jobqueue/requirement/AxolotlSessionRequirement;
        //   143: dup            
        //   144: aload           5
        //   146: invokespecial   com/whatsapp/jobqueue/requirement/AxolotlSessionRequirement.<init>:(Ljava/lang/String;)V
        //   149: invokevirtual   org/whispersystems/jobqueue/g.a:(Lorg/whispersystems/jobqueue/requirements/e;)Lorg/whispersystems/jobqueue/g;
        //   152: pop            
        //   153: aload_2        
        //   154: ifnull          173
        //   157: aload           6
        //   159: new             Lcom/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement;
        //   162: dup            
        //   163: aload           5
        //   165: aload_2        
        //   166: invokespecial   com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.<init>:(Ljava/lang/String;[B)V
        //   169: invokevirtual   org/whispersystems/jobqueue/g.a:(Lorg/whispersystems/jobqueue/requirements/e;)Lorg/whispersystems/jobqueue/g;
        //   172: pop            
        //   173: aload           6
        //   175: invokevirtual   org/whispersystems/jobqueue/g.a:()Lorg/whispersystems/jobqueue/p;
        //   178: areturn        
        //   179: astore          11
        //   181: aload           11
        //   183: athrow         
        //   184: astore          8
        //   186: aload           8
        //   188: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      72     75     Ljava/lang/IllegalArgumentException;
        //  48     67     67     72     Ljava/lang/IllegalArgumentException;
        //  90     104    104    109    Ljava/lang/IllegalArgumentException;
        //  114    133    179    184    Ljava/lang/IllegalArgumentException;
        //  138    153    184    189    Ljava/lang/IllegalArgumentException;
        //  157    173    184    189    Ljava/lang/IllegalArgumentException;
        //  181    184    184    189    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean a(@NonNull final String s, @Nullable final String s2) {
        try {
            if (!adc.b(s)) {
                return false;
            }
            final String s3 = s2;
            final boolean b = TextUtils.isEmpty((CharSequence)s3);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final String s3 = s2;
            final boolean b = TextUtils.isEmpty((CharSequence)s3);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    static int b(final int n) {
        return a(n);
    }
    
    static String b(final SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.participant;
    }
    
    private boolean c() {
        return a(this.jid, this.participant);
    }
    
    static boolean c(final SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.c();
    }
    
    static App d(final SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (this.message == null) {
                throw new InvalidObjectException(SendE2EMessageJob.z[13] + this.a());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.id == null) {
                throw new InvalidObjectException(SendE2EMessageJob.z[15] + this.a());
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (this.jid == null) {
                throw new InvalidObjectException(SendE2EMessageJob.z[20] + this.a());
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        final boolean b = adc.b(this.jid);
        try {
            if (this.participant != null) {
                try {
                    if (TextUtils.isEmpty((CharSequence)this.participant)) {
                        throw new InvalidObjectException(SendE2EMessageJob.z[17] + this.a());
                    }
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
            }
        }
        catch (IllegalArgumentException ex5) {
            throw ex5;
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)this.participant) && !b) {
                try {
                    throw new InvalidObjectException(SendE2EMessageJob.z[19] + this.a());
                }
                catch (IllegalArgumentException ex6) {
                    throw ex6;
                }
            }
        }
        catch (IllegalArgumentException ex7) {
            throw ex7;
        }
        try {
            if (this.retryCount < 0) {
                throw new InvalidObjectException(SendE2EMessageJob.z[10] + this.a());
            }
        }
        catch (IllegalArgumentException ex8) {
            throw ex8;
        }
        try {
            if (this.groupParticipants != null) {
                try {
                    if (this.groupParticipants.length == 0) {
                        throw new InvalidObjectException(SendE2EMessageJob.z[9] + this.a());
                    }
                }
                catch (IllegalArgumentException ex9) {
                    throw ex9;
                }
            }
        }
        catch (IllegalArgumentException ex10) {
            throw ex10;
        }
        try {
            if (this.groupParticipants != null && !b) {
                try {
                    throw new InvalidObjectException(SendE2EMessageJob.z[18] + this.a());
                }
                catch (IllegalArgumentException ex11) {
                    throw ex11;
                }
            }
        }
        catch (IllegalArgumentException ex12) {
            throw ex12;
        }
        try {
            if (this.groupParticipants != null) {
                try {
                    if (this.participant != null) {
                        throw new InvalidObjectException(SendE2EMessageJob.z[11] + this.a());
                    }
                }
                catch (IllegalArgumentException ex13) {
                    throw ex13;
                }
            }
        }
        catch (IllegalArgumentException ex14) {
            throw ex14;
        }
        try {
            if (this.groupParticipantHash != null) {
                try {
                    if (TextUtils.isEmpty((CharSequence)this.groupParticipantHash)) {
                        throw new InvalidObjectException(SendE2EMessageJob.z[14] + this.a());
                    }
                }
                catch (IllegalArgumentException ex15) {
                    throw ex15;
                }
            }
        }
        catch (IllegalArgumentException ex16) {
            throw ex16;
        }
        try {
            if (this.groupParticipantHash != null && !b) {
                try {
                    throw new InvalidObjectException(SendE2EMessageJob.z[16] + this.a());
                }
                catch (IllegalArgumentException ex17) {
                    throw ex17;
                }
            }
        }
        catch (IllegalArgumentException ex18) {
            throw ex18;
        }
        try {
            if (this.groupParticipantHash != null) {
                try {
                    if (this.participant != null) {
                        throw new InvalidObjectException(SendE2EMessageJob.z[12] + this.a());
                    }
                }
                catch (IllegalArgumentException ex19) {
                    throw ex19;
                }
            }
        }
        catch (IllegalArgumentException ex20) {
            throw ex20;
        }
    }
    
    @Override
    public void a() {
        this.h.b();
    }
    
    @Override
    public void a(final Context context) {
        try {
            if (this.h == null) {
                this.h = new com.whatsapp.jobqueue.a(context);
            }
            this.h.c();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final App f) {
        this.f = f;
    }
    
    @Override
    public boolean a(final Exception ex) {
        Log.c(SendE2EMessageJob.z[0] + this.a(), ex);
        return true;
    }
    
    @Override
    public void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.g:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/jobqueue/job/SendE2EMessageJob.c:()Ljava/util/List;
        //     8: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    13: astore_2       
        //    14: aconst_null    
        //    15: astore_3       
        //    16: aconst_null    
        //    17: astore          4
        //    19: aload_2        
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            252
        //    28: aload_2        
        //    29: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    34: checkcast       Lorg/whispersystems/jobqueue/requirements/e;
        //    37: astore          8
        //    39: aload           8
        //    41: instanceof      Lcom/whatsapp/jobqueue/requirement/AxolotlSessionRequirement;
        //    44: ifeq            73
        //    47: aload           8
        //    49: checkcast       Lcom/whatsapp/jobqueue/requirement/AxolotlSessionRequirement;
        //    52: astore          17
        //    54: aload           17
        //    56: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlSessionRequirement.a:()Z
        //    59: ifne            69
        //    62: aload           17
        //    64: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlSessionRequirement.a:()Ljava/lang/String;
        //    67: astore          4
        //    69: iload_1        
        //    70: ifeq            242
        //    73: aload           8
        //    75: instanceof      Lcom/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement;
        //    78: istore          10
        //    80: iload           10
        //    82: ifeq            235
        //    85: aload           8
        //    87: checkcast       Lcom/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement;
        //    90: astore          15
        //    92: aload           15
        //    94: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.a:()Z
        //    97: ifne            228
        //   100: aload           15
        //   102: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.b:()Ljava/lang/String;
        //   105: astore          16
        //   107: aload           15
        //   109: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.a:()[B
        //   112: astore_3       
        //   113: aload           16
        //   115: astore          6
        //   117: iload_1        
        //   118: ifeq            272
        //   121: aload           8
        //   123: instanceof      Lcom/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement;
        //   126: istore          12
        //   128: iload           12
        //   130: ifeq            272
        //   133: aload           8
        //   135: checkcast       Lcom/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement;
        //   138: astore          13
        //   140: aload           13
        //   142: invokevirtual   com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.a:()Z
        //   145: ifne            272
        //   148: aload_0        
        //   149: getfield        com/whatsapp/jobqueue/job/SendE2EMessageJob.f:Lcom/whatsapp/App;
        //   152: getfield        com/whatsapp/App.aG:Lorg/whispersystems/jobqueue/v;
        //   155: new             Lcom/whatsapp/jobqueue/job/SendSenderKeyJob;
        //   158: dup            
        //   159: aload_0        
        //   160: getfield        com/whatsapp/jobqueue/job/SendE2EMessageJob.jid:Ljava/lang/String;
        //   163: aload_0        
        //   164: getfield        com/whatsapp/jobqueue/job/SendE2EMessageJob.id:Ljava/lang/String;
        //   167: iconst_0       
        //   168: invokespecial   com/whatsapp/jobqueue/job/SendSenderKeyJob.<init>:(Ljava/lang/String;Ljava/lang/String;I)V
        //   171: invokevirtual   org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/a;)V
        //   174: aload_3        
        //   175: astore          5
        //   177: iload_1        
        //   178: ifeq            262
        //   181: aload           6
        //   183: ifnull          207
        //   186: aload_0        
        //   187: getfield        com/whatsapp/jobqueue/job/SendE2EMessageJob.f:Lcom/whatsapp/App;
        //   190: getfield        com/whatsapp/App.aG:Lorg/whispersystems/jobqueue/v;
        //   193: new             Lcom/whatsapp/jobqueue/job/GetPreKeyJob;
        //   196: dup            
        //   197: aload           6
        //   199: aload           5
        //   201: invokespecial   com/whatsapp/jobqueue/job/GetPreKeyJob.<init>:(Ljava/lang/String;[B)V
        //   204: invokevirtual   org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/a;)V
        //   207: return         
        //   208: astore          9
        //   210: aload           9
        //   212: athrow         
        //   213: astore          11
        //   215: aload           11
        //   217: athrow         
        //   218: astore          14
        //   220: aload           14
        //   222: athrow         
        //   223: astore          7
        //   225: aload           7
        //   227: athrow         
        //   228: aload           4
        //   230: astore          6
        //   232: goto            117
        //   235: aload           4
        //   237: astore          6
        //   239: goto            121
        //   242: aload_3        
        //   243: astore          5
        //   245: aload           4
        //   247: astore          6
        //   249: goto            177
        //   252: aload_3        
        //   253: astore          5
        //   255: aload           4
        //   257: astore          6
        //   259: goto            181
        //   262: aload           5
        //   264: astore_3       
        //   265: aload           6
        //   267: astore          4
        //   269: goto            19
        //   272: aload_3        
        //   273: astore          5
        //   275: goto            177
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  73     80     208    213    Ljava/lang/IllegalArgumentException;
        //  121    128    213    218    Ljava/lang/IllegalArgumentException;
        //  140    174    218    223    Ljava/lang/IllegalArgumentException;
        //  186    207    223    228    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 127, Size: 127
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void l() {
        try {
            Log.i(SendE2EMessageJob.z[33] + this.a());
            if (this.retryCount > 4) {
                Log.w(SendE2EMessageJob.z[32] + this.a());
                this.h.b();
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final MessageService a = this.h.a();
        final byte[] a2 = this.message.a();
        final int n = 1 + SendE2EMessageJob.random.nextInt(255);
        final byte[] array = new byte[n + a2.length];
        System.arraycopy(a2, 0, array, 0, a2.length);
        Arrays.fill(array, a2.length, array.length, (byte)n);
        final c6 c6 = new c6(this.jid, true, this.id);
        final cr cr = new cr();
        cr.a = this.jid;
        cr.e = SendE2EMessageJob.z[34];
        cr.c = c6.c;
        cr.d = this.participant;
        final Pair pair = ha.a.submit((Callable<Pair>)new c(this, array)).get();
        a.a(cr, com.whatsapp.messaging.e.a(c6, 2, (int)pair.first, (byte[])pair.second, this.retryCount, this.participant, this.groupParticipants, this.groupParticipantHash, this.webAttribute)).get();
        this.h.b();
    }
}
