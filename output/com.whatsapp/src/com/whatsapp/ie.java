// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Messenger;
import android.net.Uri;
import java.util.Hashtable;
import com.whatsapp.adm.ADMMessageHandler;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.contact.l;
import android.content.Context;
import com.whatsapp.contact.f;
import java.util.Vector;
import com.whatsapp.protocol.cr;
import java.util.Iterator;
import java.util.Set;
import com.whatsapp.util.ax;
import org.whispersystems.jobqueue.a;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.proto.E2E$Message;
import java.util.Collection;
import com.whatsapp.protocol.c6;
import java.util.EnumSet;
import com.whatsapp.util.bm;
import android.text.TextUtils;
import de.greenrobot.event.m;
import com.whatsapp.messaging.bo;
import com.whatsapp.messaging.ag;
import android.os.Bundle;
import android.os.AsyncTask;
import org.whispersystems.d;
import org.whispersystems.bH;
import org.whispersystems.aq;
import org.whispersystems.y;
import org.whispersystems.aH;
import android.util.Pair;
import org.whispersystems.aA;
import org.whispersystems.au;
import org.whispersystems.aW;
import com.whatsapp.fieldstats.e;
import com.whatsapp.util.Log;
import org.whispersystems.W;
import org.whispersystems.a5;
import org.whispersystems.a4;
import org.whispersystems.M;
import org.whispersystems.i;
import org.whispersystems.aK;
import com.whatsapp.protocol.bi;
import org.whispersystems.F;
import org.whispersystems.V;
import com.whatsapp.fieldstats.b0;
import com.whatsapp.messaging.a3;

final class ie implements a3
{
    private static final String[] z;
    private final App a;
    
    static {
        final String[] z2 = new String[75];
        String s = "wOGVS{OGVYs\\AVDpY[\u0010Es`T\u0016FfSR\rN9[R\u001fNdMR\u001d\u0006f^^\u001d\u0006pPETMdVR\u0017Oe\u001f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1907:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '+';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = 'y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "6SV\n_,";
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    s = "wOGVS{OGVYs\\AVCwQS\u0015NIJY\u0018]wV[\u0018IzZ\u0017";
                    n = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "q\\Z";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "w[Z";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "wGX\u0015DbS";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010Z\nLeKX\u000bN9LC\u0018H}\u001f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010E\u001c_dF\u0018M\u000b";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010Z\nLeKX\u000bN9VYT[\u007fOR";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "{ZD\nJqZ\u0017\u000bNbMND\u001f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u001f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "'\n\u0002L\u001b&\u000f\u0006K\u001a$\u007fDW\\~^C\nJfO\u0019\u0017Nb";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "6PE\u0010L\u007fQV\u0015Go\u001fD\u001cEb\u001fV\r\u000b";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "6YX\u000b\u000b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "wGX\u0015DbS\u0017\u001aY\u007fK^\u001aJzVC\u0000\u000bsIR\u0017_,\u001f\u001f\nNx[R\u000b\u00026Y^\u0017Jz\u001fE\u001c_dF\u0017\u001fJ\u007fSR\u001d";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "6H^\rC6";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "wGX\u0015DbS\u0017\u001eDb\u001fE\u001c_dF\u0017\u000bNgJR\n_6";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "wGX\u0015DbS\u0017\n@\u007fOG\u0010Eq\u001fE\u001c_dF\u0017\u001fDd\u001f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "wGX\u0015DbS\u0017\u001eDb\u001fVYXsMA\u001cY6O[\u0018BxKR\u0001_6MR\u001aN\u007fOC";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "wOGVS{OGVYs\\AVCwQS\u0015NI^A\u0018Bz^U\u0015N6";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "uPY\rJuKD";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018LsZE\u000bDd\u0010G\u0011JeWZ\u0010X{^C\u001aC6YX\fEr\u001fZ\u0018_uW\u0017\u001fDd\u001fP\u000bDcO\u0017\tJdK^\u001aBf^Y\rX6YX\u000b\u000b";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018LsZE\u000bDd\u0010G\u0011JeWZ\u0010X{^C\u001aC6JY\u0018IzZ\u0017\rD6Y^\u0017O6RR\nXwXRY";
                    n = 21;
                    n2 = 22;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    array = z2;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018LsZE\u000bDd\u0010G\u0011JeWZ\u0010X{^C\u001aC6^[\u0015\u000b{ZZ\u001bNdL\u0017\u001aJf^U\u0015N6PQYYs\\R\u0010]\u007fQPYNx\\E\u0000[bZSYLdPB\t\u000b{ZD\nJqZ\u001bYXsQS\u0010Eq\u001fT\u0015BsQCY\u001a;\u000e\u0017\u001c\u0019s\u001fQ\u0018EyJC";
                    n = 22;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "6^CY[~^D\u0011\u000b";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018LsZE\u000bDd\u0010U\u0016^x\\RY^x^U\u0015N6KXYM\u007fQSYFsLD\u0018Ls\u001f";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018LsZE\u000bDd\u0010G\u0011JeWZ\u0010X{^C\u001aC6JY\u0018IzZ\u0017\rD6\\X\u0014[cKRYLdPB\t\u000bf^E\rBuVG\u0018EbL\u0017\u001fDd\u001f";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "6^CY[~^D\u0011\u000b";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "u^G\u0018I\u007fS^\rR6QX\rBpVT\u0018_\u007fPYC\u000b";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "qMX\f[e";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "wOGVDx[^\u000b_o\u0010G\u000bN`ZY\r\u0006r]\u001a\u0018HuZD\n\u0004eT^\t";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "~^Y\u001dGspY=BdKNU\u000bu^[\u0015\u000byQd\u001cErxR\rldPB\tX";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "-\u001fE\u001cH\u007fO^\u001cEb|X\fEb\u0002";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "-\u001fG\u0018YbVT\u0010[wQCD";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "wQS\u000bD\u007f[\u0019\u000bNePB\u000bHs\u0005\u0018VHyR\u0019\u000eCwKD\u0018[f\u0010\u0005H\u0018'\u000e\u0001L\u001a.\b";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "{ZD\nJqZ\u0017\u000bNuZ^\u000fNr\u001fU\u0000\u000beZE\u000fNd\u001f^\u001eEyMR\u001d\u00106TR\u0000\u0016";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "-\u001fC\u0010FsLC\u0018Ff\u0002";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "wOGVDx\\_\u0018EqZY\fFtZE\u0018HuPB\u0017_\u007fQQ\u0016\u0004eT^\t";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "6O[\u0018Rs[h\u0013Br\u0005";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\u0014NeLV\u001eN{VD\nBxX";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0017";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "6RR\u001dBw`D\u0010Qs\u0005\u0017";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\u000eYyQP\rRfZ";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    s = "tMX\u0018Ou^D\r";
                    n = 42;
                    n2 = 43;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    array = z2;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\n@\u007fOE\u001c^fSX\u0018O6QR\r\\yM\\C";
                    n = 43;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "6RR\u001dBw\u0005";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\u001fBzZZ\u0010XeVY\u001e";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\u001bJrRR\u001dBw[V\rJ6";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "6PE\u0010L\u007fQ\r";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "wOGVS{OGVYs\\AVFsLD\u0018Ls\u0010D\u001cY`ZE\u001cYdPE\u001fDdKV\u000bLsK\u0018\u001fBzZE\u001c[z^T\u001cO6";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "wOGVS{OGVYs\\AVCwQS\u0015NIOE\u0016M\u007fSR&[~PC\u0016tzPD\r\u0004|VSY";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "fVT\r^dZ";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "9YV\u0010Gs[";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "wGX\u0015DbS";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "wOGVS{OGVYs\\AVLsK\u001a\u001a@9Y^\u0015N6VDYEcS[";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    s = "wOGVS{OGVYs\\AVDxO@\nNb\u001fR\u000bYyM";
                    n = 54;
                    n2 = 55;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    array = z2;
                    s = "{LP&Br";
                    n = 55;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "f^D\n\\yMS";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "wOGVS{OGVYs\\AVDxO@\nNb\u001f]\u0018ItZEC";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "u^G\u0018I\u007fS^\rR6ZE\u000bDd\u001fE\u001cXfPY\nN,\u001f";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "wGX\u0015DbS\u0017\u001eDb\u001fVYXsMA\u001cY6MR\u0013NuK\u0017\u001fDd\u001fE\u001c_dF\u0017\u000bNgJR\n_6";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "6H^\rC6";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "6PE\u0010L\u007fQV\u0015Go\u001fD\u001cEb\u001fV\r\u000b";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    s = "6YX\u000b\u000b";
                    n = 62;
                    n2 = 63;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    array = z2;
                    s = "XPC:Jz\\B\u0015JbZS";
                    n = 63;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "wOGVS{OGVYs\\AVCwQS\u0015NIJY\n^tLT\u000bBtZ";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "fVT\r^dZ";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "fVT\r^dZ";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "wGX\u0015DbS";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "wGX\u0015DbS";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "wGX\u0015DbS";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "wOGVS{OGVYs\\AVHzVR\u0017_UPY\u001fBqzE\u000bDd\u0010";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "u^G\u0018I\u007fS^\rR6MR\u0018O6ZE\u000bDd\u0005\u0017";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "6ZO\tBd^C\u0010Dx`S\u0018_s\u0002";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "wOGVDx\u0012V\u001aHyJY\r\u0006uWV\u0017Ls\u001fC\u0000[s\u0002";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    break Label_1907;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ie(final App a) {
        this.a = a;
    }
    
    static App a(final ie ie) {
        return ie.a;
    }
    
    private void a(final b0 b0, final V v, final F f, final bi bi) {
        try {
            new aK(this.a.a2, this.a.a2, this.a.a2.g(), this.a.a2, v).a(new W(bi.f()), f);
        }
        catch (aW aw) {
            Log.c(ie.z[69], aw);
            bi.a(true);
            b0.e = 0.0;
            b0.c = (double)e.PRE_KEY_MESSAGE_MISSING_PRE_KEY.getCode();
        }
        catch (au au) {
            Log.c(ie.z[70], au);
            b0.e = 0.0;
            b0.c = (double)e.UNTRUSTED_IDENTITY.getCode();
        }
        catch (aA aa) {
            Log.c(ie.z[68], aa);
            bi.a(true);
            b0.e = 0.0;
            b0.c = (double)e.PRE_KEY_MESSAGE_INVALID_KEY.getCode();
        }
    }
    
    private void a(final h6 ai, final int k, final long ar, final String s, final String s2) {
        final boolean i = App.I;
        if (!App.aD) {
            if (App.E || 1000L * ar < System.currentTimeMillis()) {
                if (h6.GIFT_RECEIVED == ai) {
                    App.bb.add(Pair.create((Object)s, (Object)s2));
                }
                App.a(ai, k, ar);
                if (!i) {
                    return;
                }
            }
            App.ar = ar;
            App.k = k;
            App.aI = ai;
            App.aD = true;
            if (h6.GIFT_RECEIVED != ai) {
                return;
            }
            App.bb.add(Pair.create((Object)s, (Object)s2));
            if (!i) {
                return;
            }
        }
        if (h6.GIFT_RECEIVED == ai) {
            App.bb.add(Pair.create((Object)s, (Object)s2));
        }
    }
    
    static void a(final ie ie, final b0 b0, final V v, final F f, final bi bi) {
        ie.b(b0, v, f, bi);
    }
    
    private boolean a(final bi bi) {
        return bi.I == 1 || bi.I == 2 || bi.I == 3;
    }
    
    private void b(final b0 b0, final V v, final F f, final bi bi) {
        try {
            new aK(this.a.a2, this.a.a2, this.a.a2.g(), this.a.a2, v).a(new aH(bi.f()), f);
        }
        catch (y y) {
            Log.c(ie.z[53], y);
            bi.a(true);
            b0.e = 0.0;
            b0.c = (double)e.NO_SESSION_AVAILABLE.getCode();
        }
    }
    
    static void b(final ie ie, final b0 b0, final V v, final F f, final bi bi) {
        ie.a(b0, v, f, bi);
    }
    
    private void c(final b0 b0, final V v, final F f, final bi bi) {
        try {
            new bH(this.a.a2.h(), new aq(bi.a.a, v)).a(bi.f(), f);
        }
        catch (y y) {
            Log.c(ie.z[5], y);
            bi.a(true);
            b0.e = 0.0;
            b0.c = (double)e.NO_SESSION_AVAILABLE.getCode();
        }
    }
    
    static void c(final ie ie, final b0 b0, final V v, final F f, final bi bi) {
        ie.c(b0, v, f, bi);
    }
    
    private void c(final String s, final int n) {
        final a_9 e = App.S.e(s);
        if (e != null && (e.v != n || e.q != n)) {
            if (n == -1) {
                App.s(s);
                if (!App.I) {
                    return;
                }
            }
            App.b(new adh(this, e, n));
        }
    }
    
    @Override
    public void a() {
        DeleteAccountConfirmation.g();
    }
    
    @Override
    public void a(final int n) {
        App.ak.o();
        if (App.c(App.j()) != 0) {
            final arz a = arz.a();
            a.a(false);
            a8s.a(new nv(this, a), new Void[0]);
        }
        if (App.aD) {
            h6 h6;
            if (App.bb.size() > 0) {
                h6 = com.whatsapp.h6.GIFT_RECEIVED;
            }
            else {
                h6 = App.aI;
            }
            App.a(h6, App.k, App.ar);
        }
        if (App.B.size() > 0) {
            Log.i(ie.z[0] + App.B.size());
            ade.a(App.B);
            App.B.clear();
        }
        App.E = true;
    }
    
    @Override
    public void a(final int n, final long n2) {
        final boolean i = App.I;
        Label_0084: {
            switch (n) {
                case 1: {
                    this.a(h6.PAYMENT_COMPLETED, n, n2, null, null);
                    if (i) {
                        break Label_0084;
                    }
                    return;
                }
                case 0: {
                    this.a(h6.WHATSAPP_INITIATED, n, n2, null, null);
                    if (i) {
                        break;
                    }
                    return;
                }
            }
        }
        Log.e(ie.z[74] + n + ie.z[73] + n2);
    }
    
    @Override
    public void a(final int n, final byte[] array, final String s, final byte[] array2, final byte[] array3, final Runnable runnable) {
        Label_0037: {
            if (s != null && array2 != null) {
                App.ak.a(n, array, s, array2, array3);
                if (!App.I) {
                    break Label_0037;
                }
            }
            Log.w(ie.z[54]);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    @Override
    public void a(final long n, final long n2) {
        if (n2 > n && n > 0L && n2 > 0L) {
            App.ai.sendEmptyMessageDelayed(0, n2 - n);
            if (!App.I) {
                return;
            }
        }
        App.ai.sendEmptyMessage(0);
    }
    
    @Override
    public void a(final Bundle bundle) {
        boolean b = true;
        final String string = bundle.getString(ie.z[56]);
        final byte[] byteArray = bundle.getByteArray(ie.z[57]);
        Log.b(App.aX != null && b);
        if (App.aX.jabber_id == null) {
            b = false;
        }
        Log.b(b);
        Log.i(ie.z[58] + App.aX.jabber_id);
        if (al5.c(byteArray, App.aX.jabber_id)) {
            App.a(App.aX.jabber_id, byteArray);
            App.h(string);
            if (!App.I) {
                return;
            }
        }
        Log.e(ie.z[55]);
    }
    
    @Override
    public void a(final _2 2) {
        if (2.a == -1) {
            App.s(2.b);
            if (!App.I) {
                return;
            }
        }
        App.b(new xc(this, App.S.e(2.b), 2));
    }
    
    @Override
    public void a(final ag ag) {
        if (ag.a != null) {
            this.a(h6.EXTENSION_REQUESTED, ag.a.a, ag.a.b, null, null);
        }
    }
    
    @Override
    public void a(final bo bo) {
        App.X.a(bo.a);
        if (bo.b != null) {
            this.a(h6.PAYMENT_COMPLETED, bo.b.a, bo.b.b, null, null);
        }
    }
    
    @Override
    public void a(final bi bi) {
        final boolean i = App.I;
        final String a = bi.a.a;
        final a_9 a2 = z8.a(a);
        Log.i(ie.z[10] + bi.a.c + ' ' + bi.u + ' ' + System.currentTimeMillis() + ' ' + bi.y);
        if (ie.z[11].equals(a)) {
            bi.u = System.currentTimeMillis();
        }
        App.g(bi);
        final a8p a8p = (a8p)m.b().a(a8p.class);
        Label_0252: {
            if (this.a(bi) && bi.e) {
                App.ak.b(bi);
                if (!i) {
                    break Label_0252;
                }
            }
            if (bi.I != 0 || bi.f() == null || TextUtils.isEmpty((CharSequence)a)) {
                final v1 p = Conversation.p();
                if (p.a() && !a8p.a() && p.b().I.equals(a) && a2.l == 0) {
                    bi.c = 13;
                }
                App.ak.g(bi);
                if (!i) {
                    break Label_0252;
                }
            }
            ha.a.execute(new a9v(this, bi, a8p, a2));
        }
        arz.a().a(bi.b != null);
        if (!a2.b) {
            a2.b = true;
            bm.a(new y9(this, a2));
        }
        if (a2.m() && !adc.f(a2.u)) {
            adc.d(a2.u, App.S.e().u);
            App.a(a2.u, 0, 2);
        }
        if (bi.I == 5 && !bi.a()) {
            ((MediaData)bi.N).transferring = true;
            a8s.a(new b3(this, bi), new Void[0]);
        }
        if (bi.b != null && bi.b == 4) {
            Log.i(ie.z[6] + App.ak.x());
            App.ak.g(ie.z[8]);
            Log.i(ie.z[7] + bi.a.c);
            if (App.aS == 1) {
                App.a(ie.z[9], false, f8.CRASH, null);
            }
        }
        aam.d(bi);
        atd.a(bi);
    }
    
    @Override
    public void a(final c6 c6) {
        gj.a(c6);
    }
    
    @Override
    public void a(c6 c6, final String s) {
        final boolean i = App.I;
        Log.i(ie.z[40] + c6.c + ie.z[38] + s);
        if (c6.a.endsWith(ie.z[43]) && s != null) {
            c6 = new c6(s, c6.b, c6.c);
        }
        this.a.m.remove(c6);
        final bi a = App.ak.a(c6);
        if (a != null) {
            if (a.I == 1 || a.I == 3 || a.I == 2) {
                final Object n = a.N;
                MediaData mediaData = null;
                if (n != null) {
                    final boolean b = a.N instanceof MediaData;
                    mediaData = null;
                    if (b) {
                        mediaData = new MediaData((MediaData)a.N);
                    }
                }
                Label_0476: {
                    if (mediaData != null && mediaData.file != null) {
                        if (mediaData.file.exists()) {
                            if (mediaData.fileSize == 0L || mediaData.fileSize == mediaData.file.length()) {
                                final int j = App.j();
                                Label_0387: {
                                    if (App.a(j, a) || (a.I == 1 && j != 0 && j != 3)) {
                                        mediaData.uploader = new at(this, a, 0L, true);
                                        mediaData.autodownloadRetryEnabled = true;
                                        mediaData.uploader.g();
                                        if (!i) {
                                            break Label_0387;
                                        }
                                    }
                                    Log.i(ie.z[44] + j + ie.z[45] + a.I + ie.z[48] + a.E + ie.z[41] + a.L);
                                }
                                if (!i) {
                                    break Label_0476;
                                }
                            }
                            Log.i(ie.z[49] + mediaData.fileSize + mediaData.file.length());
                            if (!i) {
                                break Label_0476;
                            }
                        }
                        Log.i(ie.z[46]);
                        if (!i) {
                            break Label_0476;
                        }
                    }
                    Log.e(ie.z[47] + mediaData);
                }
                if (!i) {
                    return;
                }
            }
            Log.e(ie.z[42]);
            if (!i) {
                return;
            }
        }
        Log.i(ie.z[39]);
    }
    
    @Override
    public void a(final c6 c6, final String s, int n, final long n2) {
        int n3 = 5;
        if (n == n3 || n == 13 || n == 8) {
            if (n != 13 || App.x(c6.a)) {
                n3 = n;
            }
            App.ak.a(c6, s, n3, n2);
            this.a.a(c6);
            if (!App.I) {
                return;
            }
            n = n3;
        }
        App.ak.b(c6, n);
    }
    
    @Override
    public void a(final c6 c6, final String s, final int n, final String s2) {
        final boolean i = App.I;
        this.a.m.remove(c6);
        final boolean b = adc.b(c6.a);
        if (b && n == 401) {
            App.ak.g(adc.c(c6.a));
            final bi a = App.ak.a(c6);
            Label_0113: {
                if (a != null) {
                    a.c = 7;
                    App.ak.a(a);
                    if (!i) {
                        break Label_0113;
                    }
                }
                Log.w(ie.z[25] + c6);
            }
            if (!adc.f(c6.a)) {
                adc.a(c6.a, App.S.e().u);
                App.av.sendEmptyMessage(0);
            }
            if (!i) {
                return;
            }
        }
        if (b && n == 409) {
            App.c(c6.a);
            final bi a2 = App.ak.a(c6);
            if (a2 != null) {
                final Set f = App.ak.f(c6.a, a2.Q);
                Label_0480: {
                    if (f != null) {
                        Log.i(ie.z[21] + c6 + ie.z[24] + a2.Q);
                        final boolean a3 = App.S.a(f, o7.ALLOW);
                        Label_0432: {
                            if (a2.I == 0 && a3) {
                                Log.i(ie.z[23]);
                                final E2E$Message build = E2E$Message.newBuilder().setConversation(a2.c()).build();
                                final Iterator<String> iterator = f.iterator();
                                while (iterator.hasNext()) {
                                    App.aq.aG.a(new SendE2EMessageJob(build, a2.a.c, a2.a.a, iterator.next(), 0, null, null, null, null));
                                    if (i) {
                                        break;
                                    }
                                }
                                if (!i) {
                                    break Label_0432;
                                }
                            }
                            a2.c = 0;
                            a2.l = (String[])ax.a(f, new String[f.size()]);
                            App.ak.e(a2);
                            App.ak.b(a2, -1);
                            App.az();
                        }
                        if (!i) {
                            break Label_0480;
                        }
                    }
                    Log.w(ie.z[26] + c6 + ie.z[27] + a2.Q);
                }
                if (!i) {
                    return;
                }
            }
            Log.w(ie.z[22] + c6);
        }
    }
    
    @Override
    public void a(final c6 c6, final byte[] array, final int n, final long n2) {
        final int a = org.whispersystems.m.a(array);
        Log.i(ie.z[60] + n + ie.z[63] + c6 + ie.z[61] + a + ie.z[62] + n2);
        ha.a.execute(new wx(this, n, c6, n2, a));
    }
    
    @Override
    public void a(final cr cr) {
        App.b(cr);
    }
    
    @Override
    public void a(final cr cr, final c6 c6) {
        Log.i(ie.z[18]);
        ha.a.execute(new m2(this, c6, cr));
    }
    
    @Override
    public void a(final cr cr, final c6 c6, final byte[] array, final int n, final long n2) {
        final int a = org.whispersystems.m.a(array);
        Log.i(ie.z[16] + n + ie.z[13] + c6 + ie.z[15] + a + ie.z[12] + n2);
        if (n > 4) {
            Log.w(ie.z[17] + c6);
            App.b(cr);
            if (App.aS == 1) {
                App.a(ie.z[14], false, f8.CRASH, null);
            }
            return;
        }
        ha.a.execute(new fz(this, cr, c6, n, a));
    }
    
    @Override
    public void a(final cr cr, final Vector vector) {
        Log.i(ie.z[28] + cr);
        bm.a(new a1(this, vector, cr));
    }
    
    @Override
    public void a(final Exception ex) {
        Log.w(ie.z[72] + ex);
    }
    
    @Override
    public void a(final Integer n, final String[] array) {
        App.X.a(n, array);
    }
    
    @Override
    public void a(final Integer n, final String[] array, final String[] array2) {
        f.a(n, array, array2);
    }
    
    @Override
    public void a(final String s) {
        f.a(s);
    }
    
    @Override
    public void a(final String s, final int n) {
        App.c(s, n);
    }
    
    @Override
    public void a(final String s, final int n, final int n2, final long n3) {
        f.a((Context)this.a, s, n, n2, n3);
    }
    
    @Override
    public void a(final String s, final int n, final l[] array) {
        f.a(s, n, array);
    }
    
    @Override
    public void a(final String s, final long n, final String s2) {
        f.a(s, n, s2);
    }
    
    @Override
    public void a(final String s, final String s2) {
        final boolean i = App.I;
        if (ie.z[3].equals(s)) {
            C2DMRegistrar.a((Context)this.a, s2);
            if (!i) {
                return;
            }
        }
        if (ie.z[4].equals(s)) {
            if (!App.Q()) {
                return;
            }
            new ADMMessageHandler((Context)this.a).b(s2);
            if (!i) {
                return;
            }
        }
        if (s == null) {
            C2DMRegistrar.a((Context)this.a, s2);
            if (App.Q()) {
                new ADMMessageHandler((Context)this.a).b(s2);
            }
        }
    }
    
    @Override
    public void a(final String s, final String s2, final int n) {
        App.s.a(s, s2, n);
        App.u(s);
    }
    
    @Override
    public void a(final String s, final String s2, final int n, final long n2) {
        this.a(h6.GIFT_RECEIVED, n, n2, s, s2);
    }
    
    @Override
    public void a(final String s, final String s2, final long n) {
        f.a((Context)this.a, s, s2, n);
    }
    
    @Override
    public void a(final String s, final String s2, final long n, final String s3) {
        App.b(new c8(this, s2, n, s3, s));
    }
    
    @Override
    public void a(final String s, final String s2, final String s3) {
        App.c(s, s2, s3, false);
    }
    
    @Override
    public void a(final String s, final String s2, final String t, final int n, final int n2) {
        final boolean i = App.I;
        final a_9 e = App.S.e(s2);
        if (t == null || !t.startsWith(App.au())) {
            this.c(s2, n);
        }
        if (e.m()) {
            bi bi2 = null;
            Label_0086: {
                if (s != null) {
                    final bi bi = new bi(new c6(s2, true, s));
                    if (!i) {
                        bi2 = bi;
                        break Label_0086;
                    }
                }
                bi2 = new bi(s2, (byte[])null, null);
            }
            String string;
            if (n == -1) {
                string = null;
            }
            else {
                string = Integer.toString(n);
            }
            bi2.b(string);
            bi2.c = 6;
            bi2.L = 6L;
            bi2.t = t;
            bi2.u = 1000L * n2;
            final bi c = App.ak.C(s2);
            Label_0220: {
                if (c == null || c.c != 6 || c.L != 6L || !t.equals(c.t) || bi2.a() != c.a()) {
                    App.ak.g(bi2);
                    if (!i) {
                        break Label_0220;
                    }
                }
                App.b(s, s2, ie.z[66]);
            }
            if (!i) {
                return;
            }
        }
        App.b(s, s2, ie.z[67]);
    }
    
    @Override
    public void a(final String s, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        al5.a(s, array, array2, array3, array4, null);
    }
    
    @Override
    public void a(final Hashtable hashtable) {
        bm.a(new aly(this, hashtable));
    }
    
    @Override
    public void a(final boolean b) {
        if (b) {
            App.ak.E();
        }
    }
    
    @Override
    public void a(final String[] array, final String s) {
        if (App.E) {
            App.B.add(Pair.create((Object)array, (Object)s));
            ade.a(App.B);
            App.B.clear();
            if (!App.I) {
                return;
            }
        }
        App.B.add(Pair.create((Object)array, (Object)s));
    }
    
    @Override
    public void b() {
        App.k();
    }
    
    @Override
    public void b(final int n) {
        Log.e(ie.z[71] + n);
    }
    
    @Override
    public void b(final int n, final long n2) {
        final long a = ChangeNumber.a((Context)this.a);
        if (a > 0L) {
            ade.a(h6.WHATSAPP_INITIATED, a, true);
            ade.a(h6.WHATSAPP_INITIATED, 1000L * n2, false);
            ChangeNumber.b((Context)this.a);
            ade.a(n);
            ade.b(n);
            if (!App.I) {
                return;
            }
        }
        Log.i(ie.z[37]);
    }
    
    @Override
    public void b(final Bundle bundle) {
    }
    
    @Override
    public void b(final c6 c6, final String s, final int n, final long n2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            Log.i(ie.z[35] + c6 + ie.z[33] + s + ie.z[32] + n + ie.z[36] + n2);
        }
        else {
            this.a.m.remove(c6);
            final boolean a = App.ak.a(c6, n, n2);
            final a8p a8p = (a8p)m.b().a(a8p.class);
            final v1 p4 = Conversation.p();
            if (p4.a() && !a8p.a() && p4.b().I.equals(c6.a) && a && Conversation.M) {
                App.a(Uri.parse(ie.z[34]));
            }
        }
    }
    
    @Override
    public void b(final cr cr) {
        Log.i(a8q.a((Context)App.aq, "", null, null, true, -1L, -1L, ie.z[64]));
        App.a((Context)this.a, false, true, false, false, f8.CRASH, null);
        App.b(cr);
    }
    
    @Override
    public void b(final String s) {
        f.c(s);
    }
    
    @Override
    public void b(final String s, final int n) {
        this.c(s, n);
    }
    
    @Override
    public void b(final String s, final String s2) {
        App.b(new a_p(this, s2, s));
    }
    
    @Override
    public void b(final String s, final String s2, final long n) {
        Log.i(ie.z[2] + s + ' ' + s2 + ie.z[1] + n);
        z8.a(s);
        final String a = App.s.a(s, n);
        App.s.a(s, true);
        if (a != null) {
            App.u(a);
        }
        App.u(s);
    }
    
    @Override
    public void b(final String s, final String s2, final String s3) {
        final a_9 d = App.S.d(s3);
        if (d != null) {
            App.b(new uf(this, d));
            if (!App.s.c(s3)) {
                App.s.a(s3, 0L);
                App.u(s3);
            }
            final v1 p3 = Conversation.p();
            if (p3.a() && App.au != 3 && d.u.equals(p3.b().I)) {
                App.c(d);
            }
            App.a(d.u, d.s, new Messenger(App.aF));
            App.a(new String[] { d.u });
        }
        App.b(s2, s, ie.z[20]);
    }
    
    @Override
    public void b(final Hashtable hashtable) {
        Label_0063: {
            if (!App.j) {
                break Label_0063;
            }
            if (!hashtable.containsKey(ie.z[29])) {
                return;
            }
            Log.i(ie.z[31]);
            synchronized (App.ab) {
                adc.a = true;
                if (!adc.e) {
                    bm.a(new re(this));
                }
                // monitorexit(App.ab)
                if (App.I) {
                    Log.i(ie.z[30]);
                }
            }
        }
    }
    
    @Override
    public void c() {
        if (!App.as.isEmpty()) {
            App.a(App.as.values());
        }
    }
    
    @Override
    public void c(final int n) {
        Log.w(ie.z[59] + n);
    }
    
    @Override
    public void c(final String s) {
        App.as.put(s, s);
    }
    
    @Override
    public void c(final String s, final String s2) {
        Log.i(ie.z[19] + s + ' ' + s2);
        final a_9 a = z8.a(s);
        final boolean c = App.s.c(s);
        App.s.a(s);
        App.s.a(s, true);
        if (!c) {
            App.ay.removeMessages(2, (Object)App.r(a.u));
        }
        App.u(s);
    }
    
    @Override
    public void c(final String s, final String s2, final String s3) {
        App.c(s, s2, s3, true);
    }
    
    @Override
    public void c(final Hashtable hashtable) {
        SettingsPrivacy.a(hashtable);
    }
    
    @Override
    public void d(final String s, final String s2) {
        Log.i(ie.z[65] + s + ' ' + s2);
        App.s.a(z8.a(s).u, false);
        App.u(s);
    }
    
    @Override
    public void e(final String s, final String s2) {
        App.s.b(s, s2);
        App.u(s);
    }
    
    @Override
    public void f(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: iconst_0       
        //     3: istore          4
        //     5: getstatic       com/whatsapp/App.I:Z
        //     8: istore          5
        //    10: aload_1        
        //    11: aload_2        
        //    12: getstatic       com/whatsapp/ie.z:[Ljava/lang/String;
        //    15: bipush          51
        //    17: aaload         
        //    18: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    21: aload_2        
        //    22: invokestatic    com/whatsapp/_r.a:(Ljava/lang/String;)Z
        //    25: ifne            259
        //    28: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    31: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    34: astore          6
        //    36: aload           6
        //    38: ifnull          259
        //    41: aload_2        
        //    42: aload           6
        //    44: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    47: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    50: istore          8
        //    52: iload           8
        //    54: ifeq            259
        //    57: aload           6
        //    59: invokevirtual   com/whatsapp/a_9.b:()Ljava/io/File;
        //    62: astore          9
        //    64: aload           6
        //    66: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //    69: astore          10
        //    71: aload           9
        //    73: invokevirtual   java/io/File.exists:()Z
        //    76: ifeq            259
        //    79: aload           10
        //    81: invokevirtual   java/io/File.exists:()Z
        //    84: istore          12
        //    86: iload           12
        //    88: ifeq            259
        //    91: new             Ljava/io/FileInputStream;
        //    94: dup            
        //    95: aload           10
        //    97: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   100: astore          13
        //   102: aload           10
        //   104: invokevirtual   java/io/File.length:()J
        //   107: l2i            
        //   108: newarray        B
        //   110: astore          21
        //   112: iconst_0       
        //   113: istore          22
        //   115: iload           22
        //   117: aload           21
        //   119: arraylength    
        //   120: if_icmpge       154
        //   123: aload           13
        //   125: aload           21
        //   127: iload           22
        //   129: aload           21
        //   131: arraylength    
        //   132: iload           22
        //   134: isub           
        //   135: invokevirtual   java/io/FileInputStream.read:([BII)I
        //   138: istore          29
        //   140: iload           29
        //   142: iconst_m1      
        //   143: if_icmpne       430
        //   146: iload           5
        //   148: ifeq            154
        //   151: goto            430
        //   154: new             Ljava/io/FileInputStream;
        //   157: dup            
        //   158: aload           9
        //   160: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   163: astore          23
        //   165: aload           9
        //   167: invokevirtual   java/io/File.length:()J
        //   170: l2i            
        //   171: newarray        B
        //   173: astore          24
        //   175: iload           4
        //   177: aload           24
        //   179: arraylength    
        //   180: if_icmpge       214
        //   183: aload           23
        //   185: aload           24
        //   187: iload           4
        //   189: aload           24
        //   191: arraylength    
        //   192: iload           4
        //   194: isub           
        //   195: invokevirtual   java/io/FileInputStream.read:([BII)I
        //   198: istore          28
        //   200: iload           28
        //   202: iconst_m1      
        //   203: if_icmpne       445
        //   206: iload           5
        //   208: ifeq            214
        //   211: goto            445
        //   214: new             Lcom/whatsapp/_r;
        //   217: dup            
        //   218: aload_2        
        //   219: aload           24
        //   221: aload           21
        //   223: invokespecial   com/whatsapp/_r.<init>:(Ljava/lang/String;[B[B)V
        //   226: astore          25
        //   228: aload           25
        //   230: iconst_1       
        //   231: putfield        com/whatsapp/_r.k:Z
        //   234: aload           25
        //   236: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/_r;)V
        //   239: aload           13
        //   241: ifnull          249
        //   244: aload           13
        //   246: invokevirtual   java/io/FileInputStream.close:()V
        //   249: aload           23
        //   251: ifnull          259
        //   254: aload           23
        //   256: invokevirtual   java/io/FileInputStream.close:()V
        //   259: return         
        //   260: astore          7
        //   262: aload           7
        //   264: athrow         
        //   265: astore          11
        //   267: aload           11
        //   269: athrow         
        //   270: astore          14
        //   272: aconst_null    
        //   273: astore          15
        //   275: new             Ljava/lang/StringBuilder;
        //   278: dup            
        //   279: invokespecial   java/lang/StringBuilder.<init>:()V
        //   282: getstatic       com/whatsapp/ie.z:[Ljava/lang/String;
        //   285: bipush          50
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: aload_2        
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: getstatic       com/whatsapp/ie.z:[Ljava/lang/String;
        //   298: bipush          52
        //   300: aaload         
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: aload           14
        //   309: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   312: aload           15
        //   314: ifnull          322
        //   317: aload           15
        //   319: invokevirtual   java/io/FileInputStream.close:()V
        //   322: aload_3        
        //   323: ifnull          259
        //   326: aload_3        
        //   327: invokevirtual   java/io/FileInputStream.close:()V
        //   330: return         
        //   331: astore          19
        //   333: return         
        //   334: astore          16
        //   336: aconst_null    
        //   337: astore          13
        //   339: aload           13
        //   341: ifnull          349
        //   344: aload           13
        //   346: invokevirtual   java/io/FileInputStream.close:()V
        //   349: aload_3        
        //   350: ifnull          357
        //   353: aload_3        
        //   354: invokevirtual   java/io/FileInputStream.close:()V
        //   357: aload           16
        //   359: athrow         
        //   360: astore          27
        //   362: goto            249
        //   365: astore          26
        //   367: return         
        //   368: astore          20
        //   370: goto            322
        //   373: astore          18
        //   375: goto            349
        //   378: astore          17
        //   380: goto            357
        //   383: astore          16
        //   385: aconst_null    
        //   386: astore_3       
        //   387: goto            339
        //   390: astore          16
        //   392: aload           23
        //   394: astore_3       
        //   395: goto            339
        //   398: astore          16
        //   400: aload           15
        //   402: astore          13
        //   404: goto            339
        //   407: astore          14
        //   409: aload           13
        //   411: astore          15
        //   413: aconst_null    
        //   414: astore_3       
        //   415: goto            275
        //   418: astore          14
        //   420: aload           23
        //   422: astore_3       
        //   423: aload           13
        //   425: astore          15
        //   427: goto            275
        //   430: iload           22
        //   432: iload           29
        //   434: iadd           
        //   435: istore          22
        //   437: iload           5
        //   439: ifeq            115
        //   442: goto            154
        //   445: iload           4
        //   447: iload           28
        //   449: iadd           
        //   450: istore          4
        //   452: iload           5
        //   454: ifeq            175
        //   457: goto            214
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  41     52     260    265    Ljava/io/IOException;
        //  71     86     265    270    Ljava/io/IOException;
        //  91     102    270    275    Ljava/io/IOException;
        //  91     102    334    339    Any
        //  102    112    407    418    Ljava/io/IOException;
        //  102    112    383    390    Any
        //  115    140    407    418    Ljava/io/IOException;
        //  115    140    383    390    Any
        //  154    165    407    418    Ljava/io/IOException;
        //  154    165    383    390    Any
        //  165    175    418    430    Ljava/io/IOException;
        //  165    175    390    398    Any
        //  175    200    418    430    Ljava/io/IOException;
        //  175    200    390    398    Any
        //  214    239    418    430    Ljava/io/IOException;
        //  214    239    390    398    Any
        //  244    249    360    365    Ljava/io/IOException;
        //  254    259    365    368    Ljava/io/IOException;
        //  275    312    398    407    Any
        //  317    322    368    373    Ljava/io/IOException;
        //  326    330    331    334    Ljava/io/IOException;
        //  344    349    373    378    Ljava/io/IOException;
        //  353    357    378    383    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 219, Size: 219
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
}
