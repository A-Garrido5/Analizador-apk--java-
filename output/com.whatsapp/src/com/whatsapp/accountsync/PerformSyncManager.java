// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.content.Intent;
import com.whatsapp.DialogToastActivity;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.text.TextUtils;
import com.whatsapp.util.bm;
import android.content.ContentProviderOperation$Builder;
import android.net.Uri;
import android.provider.ContactsContract$AggregationExceptions;
import android.os.Build$VERSION;
import android.content.ContentProviderOperation;
import android.provider.ContactsContract$RawContacts;
import android.provider.ContactsContract$Data;
import com.whatsapp.a_9;
import java.util.ArrayList;
import android.content.ContentResolver;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.BroadcastReceiver;

public class PerformSyncManager extends BroadcastReceiver
{
    public static boolean a;
    private static int b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[122];
        String s = "P\u0012\u0016\u0002";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_3082:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "@\u0001\u0017\u00066";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0010\u0011\bcM\f\u0006";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "@\u0001\u0017\u00067";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "I\t\u0010\u0014lJ\u0007C\u0015dS@\u0000\bkP\u0001\u0000\u0013v\u0004\u0001\u0007\u0003`@@";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "I\t\u000e\u0002q]\u0010\u0006";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00034";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "P\u0012\u0016\u0002";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00038\u001b@\")A\u0004\r\n\n`P\u0019\u0013\u00028\u001b";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0010\u0011\bcM\f\u0006";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "W\u0019\r\u00044";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "@\u0001\u0017\u00066";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "G\u0015\u0011\u0015`J\u0014<\u0003dP\u0001<\u0006fP\t\f\tZW\u0014\u0011\u000ekC?\u0015\u0002wW\t\f\t";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "T\u0005\u0011\u0001jV\r\u0010\u001ekGO\u0006\ta\u0004";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "E\u0003\u0000\bpJ\u0014<\u0013|T\u0005";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "@\u0001\u0017\u00064";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0016\f\u000eu\n\u0003\u0002\u000bi";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "W\u0014\u0002\u0015qM\u000e\u0004Gv]\u000e\u0000GjB@\u0011\u0006r\u0004\u0003\f\tqE\u0003\u0017\u0014%P\u000fC&k@\u0012\f\u000ea\u0004\u0003\f\tqE\u0003\u0017\u0014%G\u000f\r\u0013`J\u0014C\u0017wK\u0016\n\u0003`V";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0010\u0011\bcM\f\u0006";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00037";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00038\u001b@\")A\u0004\r\n\n`P\u0019\u0013\u00028\u001b";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "I\t\u000e\u0002q]\u0010\u0006";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0016\f\u000eu\n\u0003\u0002\u000bi";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "{\t\u0007Z:";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "{\t\u0007Z:";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "A\u0012\u0011\bw\u0004\u0004\u0006\u000b`P\t\r\u0000%V\u0001\u0014GfK\u000e\u0017\u0006fP\u0013C\u0003pV\t\r\u0000%W\u0019\r\u0004";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00038\u001b@\")A\u0004\r\n\n`P\u0019\u0013\u00028\u001b";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "@\u0001\u0017\u00064";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "T\u0005\u0011\u0001jV\r\u0010\u001ekGO\u0010\u0013dV\u0014";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "E\u0003\u0000\bpJ\u0014<\u0013|T\u0005";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    s = "B\t\r\u000evL\u0005\u0007GtQ\u0005\u0011\u001e%K\u0006C\u0004pV\u0012\u0006\tq\u0004\u0012\u0002\u0010%G\u000f\r\u0013dG\u0014\u0010";
                    n = 35;
                    n2 = 36;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    array = z2;
                    s = "A\u0012\u0011\bw\u0004\u0004\u0006\u000b`P\t\r\u0000%V\u0001\u0014GfK\u000e\u0017\u0006fP\u0013C\u0003pV\t\r\u0000%W\u0019\r\u0004";
                    n = 36;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "G\u000f\u000eIrL\u0001\u0017\u0014dT\u0010<\u0017wA\u0006\u0006\u0015`J\u0003\u0006\u0014";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0004\t\rG";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u0003";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "I\u0013";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "@\u0001\u0017\u00066";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "@\u0001\u0017\u00067";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "E\u0004\u0007\u000ekC@\u000e\u000evW\t\r\u0000%V\u0001\u0014GfK\u000e\u0017\u0006fP\u0013";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "G\u0015\u0011\u0015`J\u0014<\u0003dP\u0001<\u0006fP\t\f\tZW\u0014\u0011\u000ekC?\u0015\u0002wW\t\f\t";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "W\u000b\n\u0017uM\u000e\u0004GwE\u0017C\u0004jJ\u0014\u0002\u0004qW@\u0010\u001ekG@\u0017\b%e\u000e\u0007\u0015jM\u0004C\u0004jJ\u0014\u0002\u0004qW@\u0000\bkP\u0005\r\u0013%T\u0012\f\u0011l@\u0005\u0011GaQ\u0005C\u0013j\u0004\u000e\u0016\u000bi\u0004\u0001\u0000\u0004jQ\u000e\u0017";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "w\u0005\u0011\u0011`V \u0010IrL\u0001\u0017\u0014dT\u0010M\t`P";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "{\t\u0007";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u0003";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "P\u0019\u0013\u0002";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "I\t\u000e\u0002q]\u0010\u0006";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "I\t\u000e\u0002q]\u0010\u0006";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "@\u0001\u0017\u00067";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHkE\r\u0006";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00037";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "P\u0019\u0013\u0002";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "E\u0003\u0000\bpJ\u0014<\u0013|T\u0005";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "@\u0001\u0017\u00066";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00034";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u0003";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "@\u0001\u0017\u00064";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "@\u0001\u0017\u00064";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "P\u0012\u0016\u0002";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "I\t\u000e\u0002q]\u0010\u0006";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "@\u0001\u0017\u00066";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "@\u0001\u0017\u00067";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0016\f\u000eu\n\u0003\u0002\u000bi";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0010\u0011\bcM\f\u0006";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "@\u0001\u0017\u00064";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "W\u0019\r\u00044";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u0003";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u0003";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "\u0004H";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "\r@\u0017\b%E\u000e\u0007\u0015jM\u0004C\u0004jJ\u0014\u0002\u0004qW@\u0013\u0015jR\t\u0007\u0002w";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "V\u0005\u0000\bw@\t\r\u0000%V\u0001\u0014GfK\u000e\u0017\u0006fP@\n\tcK\u0012\u000e\u0006qM\u000f\rGqK@\u0002\taV\u000f\n\u0003%G\u000f\r\u0013dG\u0014\u0010GfK\u000e\u0017\u0002kP@\u0013\u0015jR\t\u0007\u0002w\u0004\u0006\f\u0015%";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "\u0004H";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "A\u0012\u0011\bw\u0004\u0017\u000b\u000eiA@\u0014\u0015lP\t\r\u0000%G\u000f\r\u0013dG\u0014C";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "A\u0012\u0011\bw\u0004\u0017\u000b\u000eiA@\u0014\u0015lP\t\r\u0000%P\u000fC\u0006k@\u0012\f\u000ea\u0004\u0003\f\tqE\u0003\u0017\u0014%T\u0012\f\u0011l@\u0005\u0011";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "\u0004\u0003\f\tqE\u0003\u0017\u0014";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "V\u0005\u0000\bw@\t\r\u0000%V\u0001\u0014GfK\u000e\u0017\u0006fP\u0013C\u000ekB\u000f\u0011\ndP\t\f\t%P\u000fC\u0006k@\u0012\f\u000ea\u0004\u0003\f\tqE\u0003\u0017\u0014%G\u000f\r\u0013`J\u0014C\u0017wK\u0016\n\u0003`V";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "B\t\r\u000evL\u0005\u0007GwA\u0003\f\u0015aM\u000e\u0004GwE\u0017C\u0004jJ\u0014\u0002\u0004qW@\n\tcK\u0012\u000e\u0006qM\u000f\rGqK@\u0002\taV\u000f\n\u0003%G\u000f\r\u0013dG\u0014\u0010GfK\u000e\u0017\u0002kP@\u0013\u0015jR\t\u0007\u0002w";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "M\u000e\u0015\u0006iM\u0004C\u0004jJ\u0014\u0002\u0004qW@\u0005\bpJ\u0004C\u0003pV\t\r\u0000%E\u000e\u0007\u0015jM\u0004C\u0004jJ\u0014\u0002\u0004qW@\u0010\u001ekG[C\u0015`I\u000f\u0015\u000ekC@";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "A\u0012\u0011\bw\u0004\u0017\u000b\u000eiA@\u0014\u0015lP\t\r\u0000%P\u000fC\u0006k@\u0012\f\u000ea\u0004\u0003\f\tqE\u0003\u0017\u0014%T\u0012\f\u0011l@\u0005\u0011";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "{\t\u0007";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "P\u0012\u0016\u0002";
                    n = 89;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 90;
                    array = z2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "P\u0012\u0016\u0002";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00038\u001b@\u0002\ta\u0004\r\n\n`P\u0019\u0013\u00028\u001b";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "A\u0012\u0011\bw\u0004\u0015\u0013\u0003dP\t\r\u0000%G\u000f\r\u0013dG\u0014C\u0003dP\u0001C\u0006fP\t\f\t%W\u0014\u0011\u000ekC\u0013";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "@\u0001\u0017\u00066";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0010\u0011\bcM\f\u0006";
                    n = 95;
                    n2 = 96;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    array = z2;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 96;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "R\u000e\u0007IdJ\u0004\u0011\bl@N\u0000\u0012wW\u000f\u0011IlP\u0005\u000eHsJ\u0004M\u0004jIN\u0014\u000fdP\u0013\u0002\u0017u\n\u0016\f\u000eu\n\u0003\u0002\u000bi";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "@\u0001\u0017\u00066";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "W\u0019\r\u00044";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "E\u0003\u0000\bpJ\u0014<\u0013|T\u0005";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "V\u0001\u00148fK\u000e\u0017\u0006fP?\n\u00038\u001b@\u0002\ta\u0004\r\n\n`P\u0019\u0013\u00028\u001b";
                    n = 103;
                    array = z2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "G\u000f\u000eIrL\u0001\u0017\u0014dT\u0010";
                    n = 104;
                    array = z2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 105;
                    array = z2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 106;
                    array = z2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "P\u0012\u0016\u0002";
                    n = 107;
                    array = z2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "E\u0003\u0000\bpJ\u0014<\u0013|T\u0005";
                    n = 108;
                    array = z2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "G\u000f\u000eIrL\u0001\u0017\u0014dT\u0010";
                    n = 109;
                    array = z2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005";
                    n = 110;
                    array = z2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "E\u0003\u0000\bpJ\u0014<\tdI\u0005CZ%\u001b@\")A\u0004\u0001\u0000\u0004jQ\u000e\u00178q]\u0010\u0006G8\u0004_";
                    n = 111;
                    array = z2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "G\u000f\u000eIrL\u0001\u0017\u0014dT\u0010";
                    n = 112;
                    array = z2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "G\u0001\u000f\u000b`V?\n\u0014ZW\u0019\r\u0004d@\u0001\u0013\u0013`V";
                    n = 113;
                    array = z2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "T\u0005\u0011\u0001jV\r\u0010\u001ekGO\u0000\u000b`E\u0012\u0010\u001ekG\u0004\u0002\u0013d\u000b\u0004\u0006\u000b`P\u0005";
                    n = 114;
                    array = z2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "T\u0005\u0011\u0001jV\rN\u0014|J\u0003N\ndJ\u0001\u0004\u0002w\u000b\u0007\u0006\u0013(K\u0012N\u0004wA\u0001\u0017\u0002(E\u0003\u0000\bpJ\u0014C\u0001dM\f\u0006\u0003%P\u000fC\u0006a@@\u0002\u0004fK\u0015\r\u0013";
                    n = 115;
                    array = z2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "T\u0005\u0011\u0001jV\rN\u0014|J\u0003N\ndJ\u0001\u0004\u0002w\u000b\u0007\u0006\u0013(K\u0012N\u0004wA\u0001\u0017\u0002(E\u0003\u0000\bpJ\u0014C\tpH\fC\rl@";
                    n = 116;
                    array = z2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "G\u000f\u000eIrL\u0001\u0017\u0014dT\u0010";
                    n = 117;
                    array = z2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "G\u000f\u000eIdJ\u0004\u0011\bl@N\u0000\bkP\u0001\u0000\u0013v";
                    n = 118;
                    array = z2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "T\u0005\u0011\u0001jV\r<\u0014|J\u0003<\ndJ\u0001\u0004\u0002w\u000b\u0013\u001a\tf{\u0001\u000f\u0015`E\u0004\u001a8`J\u0004\u0006\u0003";
                    n = 119;
                    array = z2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "T\u0005\u0011\u0001jV\r<\u0014|J\u0003<\ndJ\u0001\u0004\u0002w\u000b\u0013\u001a\tf{\u0001\u000f\u0015`E\u0004\u001a8lJ?\u0013\u0015jC\u0012\u0006\u0014v";
                    n = 120;
                    array = z2;
                    continue;
                }
                case 120: {
                    break Label_3082;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PerformSyncManager.b = 1;
    }
    
    private static Account a(final Context context, final AccountManager accountManager) {
        try {
            if (App.au() == null) {
                Log.e(PerformSyncManager.z[117]);
                return null;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        final Account account = new Account(context.getString(2131231990), PerformSyncManager.z[118]);
        try {
            Label_0071: {
                if (!accountManager.addAccountExplicitly(account, (String)null, (Bundle)null)) {
                    break Label_0071;
                }
                try {
                    ContentResolver.setIsSyncable(account, PerformSyncManager.z[119], 1);
                    if (PerformSyncManager.a) {
                        Log.e(PerformSyncManager.z[116]);
                        return null;
                    }
                    return account;
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
        }
        catch (SecurityException ex3) {
            throw ex3;
        }
        return account;
    }
    
    private static void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //     2: monitorenter   
        //     3: invokestatic    com/whatsapp/contact/f.b:()Z
        //     6: ifne            18
        //     9: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    12: bipush          121
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    18: aload_0        
        //    19: aload_0        
        //    20: invokestatic    com/whatsapp/accountsync/PerformSyncManager.c:(Landroid/content/Context;)Landroid/accounts/Account;
        //    23: invokestatic    com/whatsapp/accountsync/PerformSyncManager.a:(Landroid/content/Context;Landroid/accounts/Account;)V
        //    26: invokestatic    com/whatsapp/contact/f.d:()Z
        //    29: ifne            41
        //    32: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    35: bipush          120
        //    37: aaload         
        //    38: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    41: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //    43: monitorexit    
        //    44: return         
        //    45: astore_2       
        //    46: aload_2        
        //    47: athrow         
        //    48: astore_1       
        //    49: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //    51: monitorexit    
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    59: goto            26
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      18     45     48     Ljava/lang/SecurityException;
        //  3      18     48     54     Any
        //  18     26     54     62     Ljava/lang/SecurityException;
        //  18     26     48     54     Any
        //  26     41     62     67     Ljava/lang/SecurityException;
        //  26     41     48     54     Any
        //  46     48     48     54     Any
        //  55     59     48     54     Any
        //  64     67     48     54     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    
    private static void a(final Context p0, final Account p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/accountsync/PerformSyncManager.a:Z
        //     6: istore_3       
        //     7: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    10: bipush          34
        //    12: aaload         
        //    13: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    16: invokestatic    java/lang/System.currentTimeMillis:()J
        //    19: lstore          4
        //    21: aload_0        
        //    22: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    25: astore          6
        //    27: aload_1        
        //    28: ifnonnull       55
        //    31: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    34: bipush          46
        //    36: aaload         
        //    37: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    40: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //    42: monitorexit    
        //    43: return         
        //    44: astore          109
        //    46: aload           109
        //    48: athrow         
        //    49: astore_2       
        //    50: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //    52: monitorexit    
        //    53: aload_2        
        //    54: athrow         
        //    55: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //    58: iconst_1       
        //    59: invokevirtual   com/whatsapp/m7.a:(Z)V
        //    62: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    65: invokevirtual   com/whatsapp/wc.f:()Ljava/util/ArrayList;
        //    68: astore          7
        //    70: aload           7
        //    72: ifnull          87
        //    75: aload           7
        //    77: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    80: istore          10
        //    82: iload           10
        //    84: ifeq            107
        //    87: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //    90: iconst_0       
        //    91: invokevirtual   com/whatsapp/m7.a:(Z)V
        //    94: goto            40
        //    97: astore          8
        //    99: aload           8
        //   101: athrow         
        //   102: astore          9
        //   104: aload           9
        //   106: athrow         
        //   107: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //   110: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   113: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   116: bipush          22
        //   118: aaload         
        //   119: aload_1        
        //   120: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   123: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   126: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   129: bipush          35
        //   131: aaload         
        //   132: aload_1        
        //   133: getfield        android/accounts/Account.type:Ljava/lang/String;
        //   136: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   139: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   142: astore          11
        //   144: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //   147: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   150: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   153: bipush          10
        //   155: aaload         
        //   156: aload_1        
        //   157: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   160: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   163: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   166: bipush          17
        //   168: aaload         
        //   169: aload_1        
        //   170: getfield        android/accounts/Account.type:Ljava/lang/String;
        //   173: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   176: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   179: bipush          32
        //   181: aaload         
        //   182: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   185: bipush          8
        //   187: aaload         
        //   188: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   191: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   194: astore          12
        //   196: new             Ljava/util/HashMap;
        //   199: dup            
        //   200: invokespecial   java/util/HashMap.<init>:()V
        //   203: astore          13
        //   205: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   208: bipush          20
        //   210: aaload         
        //   211: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   214: iconst_2       
        //   215: anewarray       Ljava/lang/String;
        //   218: astore          14
        //   220: aload           14
        //   222: iconst_0       
        //   223: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   226: bipush          48
        //   228: aaload         
        //   229: aastore        
        //   230: aload           14
        //   232: iconst_1       
        //   233: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   236: bipush          12
        //   238: aaload         
        //   239: aastore        
        //   240: aload           6
        //   242: aload           11
        //   244: aload           14
        //   246: aconst_null    
        //   247: aconst_null    
        //   248: aconst_null    
        //   249: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   252: astore          15
        //   254: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   257: bipush          36
        //   259: aaload         
        //   260: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   263: aload           15
        //   265: ifnull          370
        //   268: aload           15
        //   270: invokeinterface android/database/Cursor.moveToNext:()Z
        //   275: istore          101
        //   277: iload           101
        //   279: ifeq            363
        //   282: aload           15
        //   284: iconst_0       
        //   285: invokeinterface android/database/Cursor.getLong:(I)J
        //   290: lstore          102
        //   292: aload           15
        //   294: iconst_1       
        //   295: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   300: astore          104
        //   302: new             Lcom/whatsapp/accountsync/g;
        //   305: dup            
        //   306: lload           102
        //   308: aload           104
        //   310: invokespecial   com/whatsapp/accountsync/g.<init>:(JLjava/lang/String;)V
        //   313: astore          105
        //   315: aload           13
        //   317: aload           104
        //   319: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   322: checkcast       Ljava/util/ArrayList;
        //   325: astore          106
        //   327: aload           106
        //   329: ifnonnull       351
        //   332: new             Ljava/util/ArrayList;
        //   335: dup            
        //   336: invokespecial   java/util/ArrayList.<init>:()V
        //   339: astore          106
        //   341: aload           13
        //   343: aload           104
        //   345: aload           106
        //   347: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   350: pop            
        //   351: aload           106
        //   353: aload           105
        //   355: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   358: pop            
        //   359: iload_3        
        //   360: ifeq            268
        //   363: aload           15
        //   365: invokeinterface android/database/Cursor.close:()V
        //   370: new             Ljava/util/ArrayList;
        //   373: dup            
        //   374: invokespecial   java/util/ArrayList.<init>:()V
        //   377: astore          17
        //   379: aload           13
        //   381: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   384: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   389: astore          18
        //   391: aload           18
        //   393: invokeinterface java/util/Iterator.hasNext:()Z
        //   398: ifeq            518
        //   401: aload           18
        //   403: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   408: checkcast       Ljava/util/ArrayList;
        //   411: astore          92
        //   413: aload           92
        //   415: invokevirtual   java/util/ArrayList.size:()I
        //   418: istore          93
        //   420: iload           93
        //   422: iconst_1       
        //   423: if_icmple       1953
        //   426: iconst_0       
        //   427: istore          94
        //   429: iload           94
        //   431: iload           93
        //   433: iconst_1       
        //   434: isub           
        //   435: if_icmpge       1953
        //   438: aload           92
        //   440: iload           94
        //   442: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   445: checkcast       Lcom/whatsapp/accountsync/g;
        //   448: astore          95
        //   450: aload           12
        //   452: invokestatic    android/content/ContentProviderOperation.newDelete:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   455: iconst_1       
        //   456: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //   459: astore          96
        //   461: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   464: bipush          27
        //   466: aaload         
        //   467: astore          97
        //   469: iconst_1       
        //   470: anewarray       Ljava/lang/String;
        //   473: astore          98
        //   475: aload           98
        //   477: iconst_0       
        //   478: aload           95
        //   480: getfield        com/whatsapp/accountsync/g.a:J
        //   483: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   486: aastore        
        //   487: aload           17
        //   489: aload           96
        //   491: aload           97
        //   493: aload           98
        //   495: invokevirtual   android/content/ContentProviderOperation$Builder.withSelection:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
        //   498: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   501: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   504: pop            
        //   505: iload           94
        //   507: iconst_1       
        //   508: iadd           
        //   509: istore          100
        //   511: iload_3        
        //   512: ifeq            1946
        //   515: goto            1953
        //   518: aload           17
        //   520: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   523: istore          19
        //   525: iload           19
        //   527: ifne            548
        //   530: aload           6
        //   532: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   535: iconst_3       
        //   536: aaload         
        //   537: aload           17
        //   539: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //   542: pop            
        //   543: aload           17
        //   545: invokevirtual   java/util/ArrayList.clear:()V
        //   548: new             Ljava/util/ArrayList;
        //   551: dup            
        //   552: invokespecial   java/util/ArrayList.<init>:()V
        //   555: astore          20
        //   557: new             Ljava/util/HashSet;
        //   560: dup            
        //   561: invokespecial   java/util/HashSet.<init>:()V
        //   564: astore          21
        //   566: new             Ljava/util/HashSet;
        //   569: dup            
        //   570: invokespecial   java/util/HashSet.<init>:()V
        //   573: astore          22
        //   575: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   578: bipush          44
        //   580: aaload         
        //   581: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   584: aload           7
        //   586: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   589: astore          23
        //   591: aload           23
        //   593: invokeinterface java/util/Iterator.hasNext:()Z
        //   598: ifeq            1568
        //   601: aload           23
        //   603: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   608: checkcast       Lcom/whatsapp/a_9;
        //   611: astore          30
        //   613: aload           30
        //   615: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   618: ifnull          1829
        //   621: aload           30
        //   623: getfield        com/whatsapp/a_9.b:Z
        //   626: istore          85
        //   628: iload           85
        //   630: ifeq            1829
        //   633: aload           30
        //   635: invokevirtual   com/whatsapp/a_9.m:()Z
        //   638: istore          86
        //   640: iload           86
        //   642: ifne            1829
        //   645: aload           30
        //   647: invokevirtual   com/whatsapp/a_9.k:()Z
        //   650: istore          87
        //   652: iload           87
        //   654: ifne            1829
        //   657: aload           30
        //   659: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   662: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   665: bipush          47
        //   667: aaload         
        //   668: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   671: istore          88
        //   673: iload           88
        //   675: ifne            1829
        //   678: iconst_1       
        //   679: istore          36
        //   681: iload           36
        //   683: ifeq            715
        //   686: aload           13
        //   688: aload           30
        //   690: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   693: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   696: istore          83
        //   698: iload           83
        //   700: ifne            715
        //   703: aload           20
        //   705: aload           30
        //   707: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   710: pop            
        //   711: iload_3        
        //   712: ifeq            1960
        //   715: iload           36
        //   717: ifne            840
        //   720: aload           13
        //   722: aload           30
        //   724: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   727: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   730: istore          73
        //   732: iload           73
        //   734: ifeq            840
        //   737: aload           13
        //   739: aload           30
        //   741: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   744: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   747: checkcast       Ljava/util/ArrayList;
        //   750: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   753: astore          74
        //   755: aload           74
        //   757: invokeinterface java/util/Iterator.hasNext:()Z
        //   762: ifeq            836
        //   765: aload           74
        //   767: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   772: checkcast       Lcom/whatsapp/accountsync/g;
        //   775: astore          75
        //   777: aload           12
        //   779: invokestatic    android/content/ContentProviderOperation.newDelete:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   782: iconst_1       
        //   783: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //   786: astore          76
        //   788: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   791: bipush          28
        //   793: aaload         
        //   794: astore          77
        //   796: iconst_1       
        //   797: anewarray       Ljava/lang/String;
        //   800: astore          78
        //   802: aload           78
        //   804: iconst_0       
        //   805: aload           75
        //   807: getfield        com/whatsapp/accountsync/g.a:J
        //   810: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   813: aastore        
        //   814: aload           17
        //   816: aload           76
        //   818: aload           77
        //   820: aload           78
        //   822: invokevirtual   android/content/ContentProviderOperation$Builder.withSelection:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
        //   825: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   828: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   831: pop            
        //   832: iload_3        
        //   833: ifeq            755
        //   836: iload_3        
        //   837: ifeq            1960
        //   840: aload           13
        //   842: aload           30
        //   844: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   847: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   850: istore          38
        //   852: iload           38
        //   854: ifeq            1960
        //   857: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //   860: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   863: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   866: bipush          29
        //   868: aaload         
        //   869: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   872: iconst_0       
        //   873: aaload         
        //   874: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   877: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   880: astore          39
        //   882: aload           13
        //   884: aload           30
        //   886: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   889: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   892: checkcast       Ljava/util/List;
        //   895: astore          40
        //   897: aload           40
        //   899: iconst_m1      
        //   900: aload           40
        //   902: invokeinterface java/util/List.size:()I
        //   907: iadd           
        //   908: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   913: checkcast       Lcom/whatsapp/accountsync/g;
        //   916: astore          41
        //   918: aload           30
        //   920: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   923: ifnull          1865
        //   926: aload           30
        //   928: invokevirtual   com/whatsapp/a_9.v:()J
        //   931: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   934: astore          71
        //   936: aload           71
        //   938: astore          43
        //   940: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   943: istore          46
        //   945: iload           46
        //   947: bipush          11
        //   949: if_icmplt       1017
        //   952: aload           43
        //   954: ifnull          1017
        //   957: aload           17
        //   959: getstatic       android/provider/ContactsContract$AggregationExceptions.CONTENT_URI:Landroid/net/Uri;
        //   962: invokestatic    android/content/ContentProviderOperation.newUpdate:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   965: iconst_1       
        //   966: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //   969: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   972: bipush          7
        //   974: aaload         
        //   975: aload           41
        //   977: getfield        com/whatsapp/accountsync/g.a:J
        //   980: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   983: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   986: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   989: bipush          23
        //   991: aaload         
        //   992: aload           43
        //   994: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   997: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1000: bipush          50
        //  1002: aaload         
        //  1003: iconst_1       
        //  1004: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1007: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1010: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1013: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1016: pop            
        //  1017: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1020: bipush          9
        //  1022: aaload         
        //  1023: astore          47
        //  1025: iconst_2       
        //  1026: anewarray       Ljava/lang/String;
        //  1029: astore          48
        //  1031: aload           48
        //  1033: iconst_0       
        //  1034: aload           41
        //  1036: getfield        com/whatsapp/accountsync/g.a:J
        //  1039: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  1042: aastore        
        //  1043: aload           48
        //  1045: iconst_1       
        //  1046: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1049: bipush          11
        //  1051: aaload         
        //  1052: aastore        
        //  1053: aload           6
        //  1055: aload           39
        //  1057: aconst_null    
        //  1058: aload           47
        //  1060: aload           48
        //  1062: aconst_null    
        //  1063: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  1066: astore          49
        //  1068: aload           30
        //  1070: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1073: iconst_0       
        //  1074: aload           30
        //  1076: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1079: bipush          64
        //  1081: invokevirtual   java/lang/String.indexOf:(I)I
        //  1084: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1087: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1090: astore          50
        //  1092: aload           49
        //  1094: ifnull          1258
        //  1097: aload           49
        //  1099: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1104: ifne            1251
        //  1107: aload           21
        //  1109: aload           41
        //  1111: getfield        com/whatsapp/accountsync/g.a:J
        //  1114: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1117: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1122: istore          67
        //  1124: iload           67
        //  1126: ifne            1251
        //  1129: aload           17
        //  1131: aload           39
        //  1133: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1136: iconst_1       
        //  1137: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //  1140: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1143: bipush          40
        //  1145: aaload         
        //  1146: aload           41
        //  1148: getfield        com/whatsapp/accountsync/g.a:J
        //  1151: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1154: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1157: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1160: bipush          25
        //  1162: aaload         
        //  1163: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1166: bipush          21
        //  1168: aaload         
        //  1169: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1172: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1175: bipush          18
        //  1177: aaload         
        //  1178: aload           30
        //  1180: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1183: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1186: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1189: iconst_4       
        //  1190: aaload         
        //  1191: aload_0        
        //  1192: ldc_w           2131230784
        //  1195: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1198: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1201: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1204: iconst_1       
        //  1205: aaload         
        //  1206: aload_0        
        //  1207: ldc_w           2131230783
        //  1210: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1213: iconst_1       
        //  1214: anewarray       Ljava/lang/Object;
        //  1217: dup            
        //  1218: iconst_0       
        //  1219: aload           50
        //  1221: aastore        
        //  1222: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1225: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1228: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1231: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1234: pop            
        //  1235: aload           21
        //  1237: aload           41
        //  1239: getfield        com/whatsapp/accountsync/g.a:J
        //  1242: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1245: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1250: pop            
        //  1251: aload           49
        //  1253: invokeinterface android/database/Cursor.close:()V
        //  1258: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1261: bipush          31
        //  1263: aaload         
        //  1264: astore          51
        //  1266: iconst_2       
        //  1267: anewarray       Ljava/lang/String;
        //  1270: astore          52
        //  1272: aload           52
        //  1274: iconst_0       
        //  1275: aload           41
        //  1277: getfield        com/whatsapp/accountsync/g.a:J
        //  1280: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  1283: aastore        
        //  1284: aload           52
        //  1286: iconst_1       
        //  1287: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1290: bipush          26
        //  1292: aaload         
        //  1293: aastore        
        //  1294: aload           6
        //  1296: aload           39
        //  1298: aconst_null    
        //  1299: aload           51
        //  1301: aload           52
        //  1303: aconst_null    
        //  1304: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  1307: astore          53
        //  1309: aload           53
        //  1311: ifnull          1960
        //  1314: aload           53
        //  1316: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1321: ifne            1558
        //  1324: aload           22
        //  1326: aload           41
        //  1328: getfield        com/whatsapp/accountsync/g.a:J
        //  1331: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1334: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1339: istore          57
        //  1341: iload           57
        //  1343: ifne            1558
        //  1346: aload           17
        //  1348: aload           39
        //  1350: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1353: iconst_1       
        //  1354: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //  1357: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1360: bipush          49
        //  1362: aaload         
        //  1363: aload           41
        //  1365: getfield        com/whatsapp/accountsync/g.a:J
        //  1368: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1371: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1374: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1377: bipush          6
        //  1379: aaload         
        //  1380: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1383: bipush          19
        //  1385: aaload         
        //  1386: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1389: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1392: bipush          33
        //  1394: aaload         
        //  1395: aload           30
        //  1397: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1400: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1403: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1406: bipush          43
        //  1408: aaload         
        //  1409: aload_0        
        //  1410: ldc_w           2131230784
        //  1413: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1416: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1419: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1422: bipush          13
        //  1424: aaload         
        //  1425: aload_0        
        //  1426: ldc_w           2131230785
        //  1429: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1432: iconst_1       
        //  1433: anewarray       Ljava/lang/Object;
        //  1436: dup            
        //  1437: iconst_0       
        //  1438: aload           50
        //  1440: aastore        
        //  1441: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1444: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1447: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1450: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1453: pop            
        //  1454: aload           39
        //  1456: invokestatic    android/content/ContentProviderOperation.newUpdate:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1459: astore          59
        //  1461: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1464: bipush          24
        //  1466: aaload         
        //  1467: astore          60
        //  1469: iconst_2       
        //  1470: anewarray       Ljava/lang/String;
        //  1473: astore          61
        //  1475: aload           61
        //  1477: iconst_0       
        //  1478: aload           41
        //  1480: getfield        com/whatsapp/accountsync/g.a:J
        //  1483: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  1486: aastore        
        //  1487: aload           61
        //  1489: iconst_1       
        //  1490: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1493: iconst_2       
        //  1494: aaload         
        //  1495: aastore        
        //  1496: aload           17
        //  1498: aload           59
        //  1500: aload           60
        //  1502: aload           61
        //  1504: invokevirtual   android/content/ContentProviderOperation$Builder.withSelection:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
        //  1507: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1510: bipush          42
        //  1512: aaload         
        //  1513: aload_0        
        //  1514: ldc_w           2131230783
        //  1517: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //  1520: iconst_1       
        //  1521: anewarray       Ljava/lang/Object;
        //  1524: dup            
        //  1525: iconst_0       
        //  1526: aload           50
        //  1528: aastore        
        //  1529: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1532: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1535: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1538: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1541: pop            
        //  1542: aload           22
        //  1544: aload           41
        //  1546: getfield        com/whatsapp/accountsync/g.a:J
        //  1549: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1552: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1557: pop            
        //  1558: aload           53
        //  1560: invokeinterface android/database/Cursor.close:()V
        //  1565: goto            1960
        //  1568: aload           17
        //  1570: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1573: istore          24
        //  1575: iload           24
        //  1577: ifne            1594
        //  1580: aload           6
        //  1582: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1585: bipush          15
        //  1587: aaload         
        //  1588: aload           17
        //  1590: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //  1593: pop            
        //  1594: aload_0        
        //  1595: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1598: bipush          38
        //  1600: aaload         
        //  1601: iconst_0       
        //  1602: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //  1605: astore          25
        //  1607: aload           25
        //  1609: ifnull          1664
        //  1612: aload           25
        //  1614: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1617: bipush          14
        //  1619: aaload         
        //  1620: iconst_0       
        //  1621: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //  1626: getstatic       com/whatsapp/accountsync/PerformSyncManager.b:I
        //  1629: if_icmpeq       1664
        //  1632: aload_0        
        //  1633: aload_1        
        //  1634: invokestatic    com/whatsapp/accountsync/PerformSyncManager.b:(Landroid/content/Context;Landroid/accounts/Account;)V
        //  1637: aload           25
        //  1639: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  1644: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1647: bipush          45
        //  1649: aaload         
        //  1650: getstatic       com/whatsapp/accountsync/PerformSyncManager.b:I
        //  1653: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //  1658: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //  1663: pop            
        //  1664: aload_0        
        //  1665: aload_1        
        //  1666: aload           20
        //  1668: invokestatic    com/whatsapp/accountsync/PerformSyncManager.a:(Landroid/content/Context;Landroid/accounts/Account;Ljava/util/ArrayList;)V
        //  1671: new             Ljava/lang/StringBuilder;
        //  1674: dup            
        //  1675: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1678: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1681: iconst_5       
        //  1682: aaload         
        //  1683: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1686: aload           20
        //  1688: invokevirtual   java/util/ArrayList.size:()I
        //  1691: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1694: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1697: bipush          39
        //  1699: aaload         
        //  1700: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1703: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1706: lload           4
        //  1708: lsub           
        //  1709: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1712: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1715: bipush          41
        //  1717: aaload         
        //  1718: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1721: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1724: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1727: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //  1730: iconst_0       
        //  1731: invokevirtual   com/whatsapp/m7.a:(Z)V
        //  1734: new             Ljava/lang/StringBuilder;
        //  1737: dup            
        //  1738: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1741: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1744: bipush          16
        //  1746: aaload         
        //  1747: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1750: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1753: lload           4
        //  1755: lsub           
        //  1756: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1759: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1762: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1765: goto            40
        //  1768: astore          16
        //  1770: aload           16
        //  1772: athrow         
        //  1773: astore          90
        //  1775: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1778: bipush          30
        //  1780: aaload         
        //  1781: aload           90
        //  1783: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1786: aload           17
        //  1788: invokevirtual   java/util/ArrayList.clear:()V
        //  1791: goto            548
        //  1794: astore          89
        //  1796: aload           17
        //  1798: invokevirtual   java/util/ArrayList.clear:()V
        //  1801: aload           89
        //  1803: athrow         
        //  1804: astore          31
        //  1806: aload           31
        //  1808: athrow         
        //  1809: astore          32
        //  1811: aload           32
        //  1813: athrow         
        //  1814: astore          33
        //  1816: aload           33
        //  1818: athrow         
        //  1819: astore          34
        //  1821: aload           34
        //  1823: athrow         
        //  1824: astore          35
        //  1826: aload           35
        //  1828: athrow         
        //  1829: iconst_0       
        //  1830: istore          36
        //  1832: goto            681
        //  1835: astore          80
        //  1837: aload           80
        //  1839: athrow         
        //  1840: astore          81
        //  1842: aload           81
        //  1844: athrow         
        //  1845: astore          82
        //  1847: aload           82
        //  1849: athrow         
        //  1850: astore          72
        //  1852: aload           72
        //  1854: athrow         
        //  1855: astore          37
        //  1857: aload           37
        //  1859: athrow         
        //  1860: astore          42
        //  1862: aload           42
        //  1864: athrow         
        //  1865: aconst_null    
        //  1866: astore          43
        //  1868: goto            940
        //  1871: astore          44
        //  1873: aload           44
        //  1875: athrow         
        //  1876: astore          45
        //  1878: aload           45
        //  1880: athrow         
        //  1881: astore          65
        //  1883: aload           65
        //  1885: athrow         
        //  1886: astore          66
        //  1888: aload           66
        //  1890: athrow         
        //  1891: astore          64
        //  1893: aload           49
        //  1895: invokeinterface android/database/Cursor.close:()V
        //  1900: aload           64
        //  1902: athrow         
        //  1903: astore          55
        //  1905: aload           55
        //  1907: athrow         
        //  1908: astore          56
        //  1910: aload           56
        //  1912: athrow         
        //  1913: astore          54
        //  1915: aload           53
        //  1917: invokeinterface android/database/Cursor.close:()V
        //  1922: aload           54
        //  1924: athrow         
        //  1925: astore          28
        //  1927: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //  1930: bipush          37
        //  1932: aaload         
        //  1933: aload           28
        //  1935: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1938: goto            1594
        //  1941: astore          26
        //  1943: aload           26
        //  1945: athrow         
        //  1946: iload           100
        //  1948: istore          94
        //  1950: goto            429
        //  1953: iload_3        
        //  1954: ifeq            391
        //  1957: goto            518
        //  1960: iload_3        
        //  1961: ifeq            591
        //  1964: goto            1568
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      27     49     55     Any
        //  31     40     44     49     Ljava/lang/Exception;
        //  31     40     49     55     Any
        //  46     49     49     55     Any
        //  55     70     49     55     Any
        //  75     82     102    107    Ljava/lang/Exception;
        //  75     82     49     55     Any
        //  87     94     97     102    Ljava/lang/Exception;
        //  87     94     49     55     Any
        //  99     102    49     55     Any
        //  104    107    97     102    Ljava/lang/Exception;
        //  104    107    49     55     Any
        //  107    254    49     55     Any
        //  254    263    1768   1773   Ljava/lang/Exception;
        //  254    263    49     55     Any
        //  268    277    1768   1773   Ljava/lang/Exception;
        //  268    277    49     55     Any
        //  282    327    49     55     Any
        //  332    351    49     55     Any
        //  351    359    49     55     Any
        //  363    370    49     55     Any
        //  370    391    49     55     Any
        //  391    420    49     55     Any
        //  438    505    49     55     Any
        //  518    525    49     55     Any
        //  530    543    1773   1794   Ljava/lang/Exception;
        //  530    543    1794   1804   Any
        //  543    548    49     55     Any
        //  548    591    49     55     Any
        //  591    613    49     55     Any
        //  613    628    1804   1809   Ljava/lang/Exception;
        //  613    628    49     55     Any
        //  633    640    1809   1814   Ljava/lang/Exception;
        //  633    640    49     55     Any
        //  645    652    1814   1819   Ljava/lang/Exception;
        //  645    652    49     55     Any
        //  657    673    1819   1829   Ljava/lang/Exception;
        //  657    673    49     55     Any
        //  686    698    1835   1840   Ljava/lang/Exception;
        //  686    698    49     55     Any
        //  703    711    1840   1850   Ljava/lang/Exception;
        //  703    711    49     55     Any
        //  720    732    1850   1855   Ljava/lang/Exception;
        //  720    732    49     55     Any
        //  737    755    49     55     Any
        //  755    832    49     55     Any
        //  840    852    1855   1860   Ljava/lang/Exception;
        //  840    852    49     55     Any
        //  857    918    49     55     Any
        //  918    936    1860   1865   Ljava/lang/Exception;
        //  918    936    49     55     Any
        //  940    945    1871   1876   Ljava/lang/Exception;
        //  940    945    49     55     Any
        //  957    1017   1876   1881   Ljava/lang/Exception;
        //  957    1017   49     55     Any
        //  1017   1092   49     55     Any
        //  1097   1124   1881   1886   Ljava/lang/Exception;
        //  1097   1124   1891   1903   Any
        //  1129   1251   1886   1891   Ljava/lang/Exception;
        //  1129   1251   1891   1903   Any
        //  1251   1258   49     55     Any
        //  1258   1309   49     55     Any
        //  1314   1341   1903   1908   Ljava/lang/Exception;
        //  1314   1341   1913   1925   Any
        //  1346   1558   1908   1913   Ljava/lang/Exception;
        //  1346   1558   1913   1925   Any
        //  1558   1565   49     55     Any
        //  1568   1575   49     55     Any
        //  1580   1594   1925   1941   Ljava/lang/Exception;
        //  1580   1594   49     55     Any
        //  1594   1607   49     55     Any
        //  1612   1664   1941   1946   Ljava/lang/Exception;
        //  1612   1664   49     55     Any
        //  1664   1765   49     55     Any
        //  1770   1773   49     55     Any
        //  1775   1786   1794   1804   Any
        //  1786   1791   49     55     Any
        //  1796   1804   49     55     Any
        //  1806   1809   1809   1814   Ljava/lang/Exception;
        //  1806   1809   49     55     Any
        //  1811   1814   1814   1819   Ljava/lang/Exception;
        //  1811   1814   49     55     Any
        //  1816   1819   1819   1829   Ljava/lang/Exception;
        //  1816   1819   49     55     Any
        //  1821   1824   1824   1829   Ljava/lang/Exception;
        //  1821   1824   49     55     Any
        //  1826   1829   49     55     Any
        //  1837   1840   1840   1850   Ljava/lang/Exception;
        //  1837   1840   49     55     Any
        //  1842   1845   1845   1850   Ljava/lang/Exception;
        //  1842   1845   49     55     Any
        //  1847   1850   1850   1855   Ljava/lang/Exception;
        //  1847   1850   49     55     Any
        //  1852   1855   49     55     Any
        //  1857   1860   49     55     Any
        //  1862   1865   49     55     Any
        //  1873   1876   1876   1881   Ljava/lang/Exception;
        //  1873   1876   49     55     Any
        //  1878   1881   49     55     Any
        //  1883   1886   1886   1891   Ljava/lang/Exception;
        //  1883   1886   1891   1903   Any
        //  1888   1891   1891   1903   Any
        //  1893   1903   49     55     Any
        //  1905   1908   1908   1913   Ljava/lang/Exception;
        //  1905   1908   1913   1925   Any
        //  1910   1913   1913   1925   Any
        //  1915   1925   49     55     Any
        //  1927   1938   49     55     Any
        //  1943   1946   49     55     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 887, Size: 887
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
    
    private static void a(final Context context, final Account account, final String s, final String s2) {
        Log.i(PerformSyncManager.z[78] + s + PerformSyncManager.z[75] + s2 + ')');
        final ArrayList list = new ArrayList();
        final ContentResolver contentResolver = context.getContentResolver();
        a(context, list, account, s, s2, null);
        try {
            contentResolver.applyBatch(PerformSyncManager.z[76], list);
        }
        catch (Exception ex) {
            Log.b(PerformSyncManager.z[80] + s + PerformSyncManager.z[79] + s2 + PerformSyncManager.z[77], ex);
        }
    }
    
    private static void a(final Context p0, final Account p1, final ArrayList p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/accountsync/PerformSyncManager.a:Z
        //     3: istore_3       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore          4
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore          5
        //    22: aload_0        
        //    23: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    26: astore          6
        //    28: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    31: bipush          83
        //    33: aaload         
        //    34: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    37: aload_2        
        //    38: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    41: astore          7
        //    43: aload           7
        //    45: invokeinterface java/util/Iterator.hasNext:()Z
        //    50: ifeq            188
        //    53: aload           7
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: checkcast       Lcom/whatsapp/a_9;
        //    63: astore          11
        //    65: aload           4
        //    67: invokevirtual   java/util/ArrayList.size:()I
        //    70: sipush          200
        //    73: if_icmpgt       99
        //    76: getstatic       com/whatsapp/App.aV:I
        //    79: istore          22
        //    81: iconst_3       
        //    82: iload           22
        //    84: if_icmpne       118
        //    87: aload           4
        //    89: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    92: istore          23
        //    94: iload           23
        //    96: ifne            118
        //    99: aload           6
        //   101: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   104: bipush          88
        //   106: aaload         
        //   107: aload           4
        //   109: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //   112: pop            
        //   113: aload           4
        //   115: invokevirtual   java/util/ArrayList.clear:()V
        //   118: aload           11
        //   120: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   123: bipush          64
        //   125: invokevirtual   java/lang/String.indexOf:(I)I
        //   128: ifgt            143
        //   131: aload           5
        //   133: aload           11
        //   135: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: iload_3        
        //   140: ifeq            43
        //   143: aload           11
        //   145: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   148: ifnull          326
        //   151: aload           11
        //   153: invokevirtual   com/whatsapp/a_9.v:()J
        //   156: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   159: astore          19
        //   161: aload           19
        //   163: astore          18
        //   165: aload_0        
        //   166: aload           4
        //   168: aload_1        
        //   169: aload           11
        //   171: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   174: aload           11
        //   176: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   179: aload           18
        //   181: invokestatic    com/whatsapp/accountsync/PerformSyncManager.a:(Landroid/content/Context;Ljava/util/ArrayList;Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
        //   184: iload_3        
        //   185: ifeq            43
        //   188: aload           4
        //   190: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   193: ifne            210
        //   196: aload           6
        //   198: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   201: bipush          87
        //   203: aaload         
        //   204: aload           4
        //   206: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //   209: pop            
        //   210: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   213: bipush          84
        //   215: aaload         
        //   216: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   219: aload           5
        //   221: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   224: ifne            274
        //   227: new             Ljava/lang/StringBuilder;
        //   230: dup            
        //   231: invokespecial   java/lang/StringBuilder.<init>:()V
        //   234: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   237: bipush          85
        //   239: aaload         
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: aload           5
        //   245: invokevirtual   java/util/ArrayList.size:()I
        //   248: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   251: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   254: bipush          82
        //   256: aaload         
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   263: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   266: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   269: aload           5
        //   271: invokevirtual   com/whatsapp/wc.a:(Ljava/util/ArrayList;)V
        //   274: return         
        //   275: astore          12
        //   277: aload           12
        //   279: athrow         
        //   280: astore          13
        //   282: aload           13
        //   284: athrow         
        //   285: astore          15
        //   287: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   290: bipush          86
        //   292: aaload         
        //   293: aload           15
        //   295: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   298: aload           4
        //   300: invokevirtual   java/util/ArrayList.clear:()V
        //   303: goto            118
        //   306: astore          14
        //   308: aload           4
        //   310: invokevirtual   java/util/ArrayList.clear:()V
        //   313: aload           14
        //   315: athrow         
        //   316: astore          16
        //   318: aload           16
        //   320: athrow         
        //   321: astore          17
        //   323: aload           17
        //   325: athrow         
        //   326: aconst_null    
        //   327: astore          18
        //   329: goto            165
        //   332: astore          9
        //   334: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   337: bipush          81
        //   339: aaload         
        //   340: aload           9
        //   342: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   345: goto            210
        //   348: astore          8
        //   350: aload           8
        //   352: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  65     81     275    280    Ljava/lang/Exception;
        //  87     94     280    285    Ljava/lang/Exception;
        //  99     113    285    306    Ljava/lang/Exception;
        //  99     113    306    316    Any
        //  118    139    316    321    Ljava/lang/Exception;
        //  143    161    321    326    Ljava/lang/Exception;
        //  196    210    332    348    Ljava/lang/Exception;
        //  210    274    348    353    Ljava/lang/Exception;
        //  277    280    280    285    Ljava/lang/Exception;
        //  287    298    306    316    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 157, Size: 157
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
    
    public static void a(final Context context, final a_9 a_9) {
        synchronized (PerformSyncManager.class) {
            App.aL.a(true);
            a(context, c(context), a_9.t, a_9.u);
            App.aL.a(false);
        }
    }
    
    private static void a(final Context context, final ArrayList list, final Account account, final String s, final String s2, final Long n) {
        final Uri build = ContactsContract$Data.CONTENT_URI.buildUpon().appendQueryParameter(PerformSyncManager.z[55], PerformSyncManager.z[64]).build();
        final int size = list.size();
        final String a = a_9.a(s2.substring(0, s2.indexOf(64)));
        try {
            list.add(ContentProviderOperation.newInsert(ContactsContract$RawContacts.CONTENT_URI).withValue(PerformSyncManager.z[67], (Object)account.name).withValue(PerformSyncManager.z[58], (Object)account.type).withValue(PerformSyncManager.z[72], (Object)s2).withYieldAllowed(true).build());
            list.add(ContentProviderOperation.newInsert(build).withValueBackReference(PerformSyncManager.z[61], size).withValue(PerformSyncManager.z[51], (Object)PerformSyncManager.z[54]).withValue(PerformSyncManager.z[62], (Object)s).build());
            list.add(ContentProviderOperation.newInsert(build).withValueBackReference(PerformSyncManager.z[73], size).withValue(PerformSyncManager.z[52], (Object)PerformSyncManager.z[70]).withValue(PerformSyncManager.z[71], (Object)s2).withValue(PerformSyncManager.z[53], (Object)context.getString(2131230784)).withValue(PerformSyncManager.z[66], (Object)String.format(context.getString(2131230783), a)).build());
            list.add(ContentProviderOperation.newInsert(build).withValueBackReference(PerformSyncManager.z[74], size).withValue(PerformSyncManager.z[65], (Object)PerformSyncManager.z[69]).withValue(PerformSyncManager.z[63], (Object)s2).withValue(PerformSyncManager.z[68], (Object)context.getString(2131230784)).withValue(PerformSyncManager.z[59], (Object)String.format(context.getString(2131230785), a)).build());
            if (Build$VERSION.SDK_INT >= 11 && n != null) {
                final ArrayList<ContentProviderOperation> list2 = (ArrayList<ContentProviderOperation>)list;
                final Uri uri = ContactsContract$AggregationExceptions.CONTENT_URI;
                final ContentProviderOperation$Builder contentProviderOperation$Builder = ContentProviderOperation.newUpdate(uri);
                final String[] array = PerformSyncManager.z;
                final int n2 = 60;
                final String s3 = array[n2];
                final Long n3 = n;
                final ContentProviderOperation$Builder contentProviderOperation$Builder2 = contentProviderOperation$Builder.withValue(s3, (Object)n3);
                final String[] array2 = PerformSyncManager.z;
                final int n4 = 56;
                final String s4 = array2[n4];
                final int n5 = size;
                final ContentProviderOperation$Builder contentProviderOperation$Builder3 = contentProviderOperation$Builder2.withValueBackReference(s4, n5);
                final String[] array3 = PerformSyncManager.z;
                final int n6 = 57;
                final String s5 = array3[n6];
                final int n7 = 1;
                final Integer n8 = n7;
                final ContentProviderOperation$Builder contentProviderOperation$Builder4 = contentProviderOperation$Builder3.withValue(s5, (Object)n8);
                final ContentProviderOperation contentProviderOperation = contentProviderOperation$Builder4.build();
                list2.add(contentProviderOperation);
            }
            return;
        }
        catch (SecurityException ex) {
            throw ex;
        }
        try {
            final ArrayList<ContentProviderOperation> list2 = (ArrayList<ContentProviderOperation>)list;
            final Uri uri = ContactsContract$AggregationExceptions.CONTENT_URI;
            final ContentProviderOperation$Builder contentProviderOperation$Builder = ContentProviderOperation.newUpdate(uri);
            final String[] array = PerformSyncManager.z;
            final int n2 = 60;
            final String s3 = array[n2];
            final Long n3 = n;
            final ContentProviderOperation$Builder contentProviderOperation$Builder2 = contentProviderOperation$Builder.withValue(s3, (Object)n3);
            final String[] array2 = PerformSyncManager.z;
            final int n4 = 56;
            final String s4 = array2[n4];
            final int n5 = size;
            final ContentProviderOperation$Builder contentProviderOperation$Builder3 = contentProviderOperation$Builder2.withValueBackReference(s4, n5);
            final String[] array3 = PerformSyncManager.z;
            final int n6 = 57;
            final String s5 = array3[n6];
            final int n7 = 1;
            final Integer n8 = n7;
            final ContentProviderOperation$Builder contentProviderOperation$Builder4 = contentProviderOperation$Builder3.withValue(s5, (Object)n8);
            final ContentProviderOperation contentProviderOperation = contentProviderOperation$Builder4.build();
            list2.add(contentProviderOperation);
        }
        catch (SecurityException ex2) {
            throw ex2;
        }
    }
    
    public static void b(final Context context) {
        bm.a(new a(context));
    }
    
    private static void b(final Context p0, final Account p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/accountsync/PerformSyncManager.a:Z
        //     6: istore_3       
        //     7: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //    10: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //    13: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    16: bipush          103
        //    18: aaload         
        //    19: aload_1        
        //    20: getfield        android/accounts/Account.name:Ljava/lang/String;
        //    23: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    26: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    29: bipush          102
        //    31: aaload         
        //    32: aload_1        
        //    33: getfield        android/accounts/Account.type:Ljava/lang/String;
        //    36: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    39: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    42: bipush          91
        //    44: aaload         
        //    45: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    48: bipush          90
        //    50: aaload         
        //    51: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    54: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    57: astore          4
        //    59: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //    62: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //    65: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    68: bipush          98
        //    70: aaload         
        //    71: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //    74: bipush          92
        //    76: aaload         
        //    77: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    80: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    83: astore          5
        //    85: new             Ljava/util/ArrayList;
        //    88: dup            
        //    89: invokespecial   java/util/ArrayList.<init>:()V
        //    92: astore          6
        //    94: aload_0        
        //    95: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    98: astore          7
        //   100: iconst_2       
        //   101: anewarray       Ljava/lang/String;
        //   104: astore          8
        //   106: aload           8
        //   108: iconst_0       
        //   109: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   112: bipush          89
        //   114: aaload         
        //   115: aastore        
        //   116: aload           8
        //   118: iconst_1       
        //   119: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   122: bipush          101
        //   124: aaload         
        //   125: aastore        
        //   126: aload           7
        //   128: aload           4
        //   130: aload           8
        //   132: aconst_null    
        //   133: aconst_null    
        //   134: aconst_null    
        //   135: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   138: astore          9
        //   140: aload           9
        //   142: ifnull          221
        //   145: aload           9
        //   147: invokeinterface android/database/Cursor.moveToNext:()Z
        //   152: ifeq            214
        //   155: aload           9
        //   157: iconst_1       
        //   158: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   163: astore          27
        //   165: aload           27
        //   167: ifnull          210
        //   170: aload           27
        //   172: bipush          64
        //   174: invokevirtual   java/lang/String.indexOf:(I)I
        //   177: istore          30
        //   179: iload           30
        //   181: iconst_m1      
        //   182: if_icmpeq       210
        //   185: aload           6
        //   187: new             Lcom/whatsapp/accountsync/g;
        //   190: dup            
        //   191: aload           9
        //   193: iconst_0       
        //   194: invokeinterface android/database/Cursor.getLong:(I)J
        //   199: aload           27
        //   201: invokespecial   com/whatsapp/accountsync/g.<init>:(JLjava/lang/String;)V
        //   204: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   209: pop            
        //   210: iload_3        
        //   211: ifeq            145
        //   214: aload           9
        //   216: invokeinterface android/database/Cursor.close:()V
        //   221: new             Ljava/util/ArrayList;
        //   224: dup            
        //   225: invokespecial   java/util/ArrayList.<init>:()V
        //   228: astore          10
        //   230: aload           6
        //   232: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   237: astore          11
        //   239: aload           11
        //   241: invokeinterface java/util/Iterator.hasNext:()Z
        //   246: ifeq            469
        //   249: aload           11
        //   251: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   256: checkcast       Lcom/whatsapp/accountsync/g;
        //   259: astore          15
        //   261: aload           15
        //   263: getfield        com/whatsapp/accountsync/g.b:Ljava/lang/String;
        //   266: iconst_0       
        //   267: aload           15
        //   269: getfield        com/whatsapp/accountsync/g.b:Ljava/lang/String;
        //   272: bipush          64
        //   274: invokevirtual   java/lang/String.indexOf:(I)I
        //   277: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   280: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //   283: astore          16
        //   285: aload           15
        //   287: getfield        com/whatsapp/accountsync/g.a:J
        //   290: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   293: astore          17
        //   295: aload           5
        //   297: invokestatic    android/content/ContentProviderOperation.newUpdate:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   300: astore          18
        //   302: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   305: bipush          93
        //   307: aaload         
        //   308: astore          19
        //   310: iconst_2       
        //   311: anewarray       Ljava/lang/String;
        //   314: astore          20
        //   316: aload           20
        //   318: iconst_0       
        //   319: aload           17
        //   321: aastore        
        //   322: aload           20
        //   324: iconst_1       
        //   325: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   328: bipush          96
        //   330: aaload         
        //   331: aastore        
        //   332: aload           10
        //   334: aload           18
        //   336: aload           19
        //   338: aload           20
        //   340: invokevirtual   android/content/ContentProviderOperation$Builder.withSelection:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
        //   343: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   346: bipush          95
        //   348: aaload         
        //   349: aload_0        
        //   350: ldc_w           2131230783
        //   353: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   356: iconst_1       
        //   357: anewarray       Ljava/lang/Object;
        //   360: dup            
        //   361: iconst_0       
        //   362: aload           16
        //   364: aastore        
        //   365: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   368: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   371: iconst_1       
        //   372: invokevirtual   android/content/ContentProviderOperation$Builder.withYieldAllowed:(Z)Landroid/content/ContentProviderOperation$Builder;
        //   375: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   378: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   381: pop            
        //   382: aload           5
        //   384: invokestatic    android/content/ContentProviderOperation.newUpdate:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   387: astore          22
        //   389: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   392: bipush          104
        //   394: aaload         
        //   395: astore          23
        //   397: iconst_2       
        //   398: anewarray       Ljava/lang/String;
        //   401: astore          24
        //   403: aload           24
        //   405: iconst_0       
        //   406: aload           17
        //   408: aastore        
        //   409: aload           24
        //   411: iconst_1       
        //   412: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   415: bipush          99
        //   417: aaload         
        //   418: aastore        
        //   419: aload           10
        //   421: aload           22
        //   423: aload           23
        //   425: aload           24
        //   427: invokevirtual   android/content/ContentProviderOperation$Builder.withSelection:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
        //   430: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   433: bipush          100
        //   435: aaload         
        //   436: aload_0        
        //   437: ldc_w           2131230785
        //   440: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   443: iconst_1       
        //   444: anewarray       Ljava/lang/Object;
        //   447: dup            
        //   448: iconst_0       
        //   449: aload           16
        //   451: aastore        
        //   452: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   455: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   458: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   461: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   464: pop            
        //   465: iload_3        
        //   466: ifeq            239
        //   469: aload           10
        //   471: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   474: istore          12
        //   476: iload           12
        //   478: ifne            497
        //   481: aload_0        
        //   482: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   485: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   488: bipush          97
        //   490: aaload         
        //   491: aload           10
        //   493: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //   496: pop            
        //   497: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //   499: monitorexit    
        //   500: return         
        //   501: astore          28
        //   503: aload           28
        //   505: athrow         
        //   506: astore          29
        //   508: aload           29
        //   510: athrow         
        //   511: astore          26
        //   513: aload           9
        //   515: invokeinterface android/database/Cursor.close:()V
        //   520: aload           26
        //   522: athrow         
        //   523: astore_2       
        //   524: ldc             Lcom/whatsapp/accountsync/PerformSyncManager;.class
        //   526: monitorexit    
        //   527: aload_2        
        //   528: athrow         
        //   529: astore          13
        //   531: getstatic       com/whatsapp/accountsync/PerformSyncManager.z:[Ljava/lang/String;
        //   534: bipush          94
        //   536: aaload         
        //   537: aload           13
        //   539: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   542: goto            497
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      140    523    529    Any
        //  145    165    511    523    Any
        //  170    179    501    506    Ljava/lang/Exception;
        //  170    179    511    523    Any
        //  185    210    506    511    Ljava/lang/Exception;
        //  185    210    511    523    Any
        //  214    221    523    529    Any
        //  221    239    523    529    Any
        //  239    465    523    529    Any
        //  469    476    523    529    Any
        //  481    497    529    545    Ljava/lang/Exception;
        //  481    497    523    529    Any
        //  503    506    506    511    Ljava/lang/Exception;
        //  503    506    511    523    Any
        //  508    511    511    523    Any
        //  513    523    523    529    Any
        //  531    542    523    529    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0210:
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
    
    private static Account c(final Context context) {
        final AccountManager value = AccountManager.get(context);
        final Account[] accountsByType = value.getAccountsByType(PerformSyncManager.z[105]);
        Account account = null;
        Label_0078: {
            Account account2;
            if (accountsByType.length == 0) {
                account = a(context, value);
                account2 = null;
                if (account != null) {
                    break Label_0078;
                }
            }
            else {
                account = accountsByType[0];
                if (TextUtils.equals((CharSequence)context.getString(2131231990), (CharSequence)account.name)) {
                    break Label_0078;
                }
                value.removeAccount(account, (AccountManagerCallback)null, (Handler)null);
                account = a(context, value);
                account2 = null;
                if (account != null) {
                    break Label_0078;
                }
            }
            return account2;
        }
        Account account2 = account;
        try {
            if (!ContentResolver.getSyncAutomatically(account2, PerformSyncManager.z[106])) {
                ContentResolver.setSyncAutomatically(account2, PerformSyncManager.z[107], true);
                return account2;
            }
            return account2;
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public static void d(final Context context) {
        while (true) {
            while (true) {
                Label_0164: {
                    synchronized (PerformSyncManager.class) {
                        final boolean a = PerformSyncManager.a;
                        final ContentResolver contentResolver = context.getContentResolver();
                        final Uri build = ContactsContract$RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(PerformSyncManager.z[111], context.getString(2131231990)).appendQueryParameter(PerformSyncManager.z[109], PerformSyncManager.z[110]).appendQueryParameter(PerformSyncManager.z[114], PerformSyncManager.z[108]).build();
                        try {
                            Log.i(PerformSyncManager.z[115]);
                            contentResolver.delete(build, PerformSyncManager.z[112], new String[] { context.getString(2131231990), PerformSyncManager.z[113] });
                            if (DialogToastActivity.h) {
                                final boolean a2 = false;
                                if (!a) {
                                    break Label_0164;
                                }
                                PerformSyncManager.a = a2;
                            }
                            return;
                        }
                        catch (SecurityException ex) {
                            try {
                                throw ex;
                            }
                            catch (SecurityException ex2) {
                                throw ex2;
                            }
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
    
    static void e(final Context context) {
        a(context);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        b(context);
    }
}
