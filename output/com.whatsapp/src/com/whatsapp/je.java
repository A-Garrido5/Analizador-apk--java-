// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class je implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final VoipActivity$ReplyWithMessageDialogFragment a;
    final String[] b;
    
    static {
        final String[] z2 = new String[4];
        String s = "1w\u007fMx6s";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0001';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",\u007fD";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5~AKd\u0019{S^";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = ".wSfr.wR\\";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    je(final VoipActivity$ReplyWithMessageDialogFragment a, final String[] b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final VoipActivity voipActivity = (VoipActivity)this.a.getActivity();
        final Intent intent = new Intent((Context)this.a.getActivity(), (Class)Conversation.class);
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            intent.putExtra(je.z[1], peerJid);
        }
        intent.addFlags(335544320);
        if (n != -1 + this.b.length) {
            intent.putExtra(je.z[0], (byte)0);
            intent.putExtra(je.z[2], this.b[n]);
            intent.putExtra(je.z[3], true);
            Conversation.aB = true;
        }
        this.a.getActivity().startActivity(intent);
        VoipActivity.d(voipActivity);
    }
}
