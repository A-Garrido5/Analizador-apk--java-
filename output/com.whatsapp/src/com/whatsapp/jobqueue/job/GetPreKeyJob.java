// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.messaging.MessageService;
import org.whispersystems.at;
import java.util.Arrays;
import com.whatsapp.ha;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import com.whatsapp.a_9;
import com.whatsapp.adc;
import com.whatsapp.aol;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import org.whispersystems.jobqueue.p;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import com.whatsapp.App;
import org.whispersystems.jobqueue.e;
import com.whatsapp.jobqueue.b;
import org.whispersystems.jobqueue.a;

public final class GetPreKeyJob extends a implements b, e
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient com.whatsapp.jobqueue.a f;
    private transient App g;
    private final String jid;
    private final byte[] oldAliceBaseKey;
    
    static {
        final String[] z2 = new String[11];
        String s = "V\u001d)X%I\u00079X&S\u0000m\u001a-\u001c\u0011 \b<E";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'H';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 'x';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "S\u0018)9$U\u0017(:)O\u0011\u0006\u001d1\u001c\u00198\u000b<\u001c\u0011$\f Y\u0006m\u001a-\u001c\u001a8\u0014$\u001c\u001b?X&S\u001a`\u001d%L\u00004";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "V\u001d)X%I\u00079X*YT,\u0016hU\u001a)\u0011>U\u00108\u0019$\u001c\u001e$\u001cs\u001c\u001e$\u001cu";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "_\u0015#\u001b-P\u0011)X/Y\u0000m\b:YT&\u001d1\u001c\u001e\"\u001a";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Y\f$\f!R\u0013m\u001f-HT=\n-\u001c\u001f(\u0001hV\u001b/X-]\u0006!\u0001h^\u0011.\u0019;YT\"\u0014,\u001c\u0015!\u0011+YT/\u0019;YT&\u001d1\u001c\u001c,\u000bh]\u0018?\u001d)X\rm\u001b ]\u001a*\u001d,";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "O\u0000,\n<U\u001a*X/Y\u0000m\b:YT&\u001d1\u001c\u001e\"\u001a";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0007T'\u0011,\u0001";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0007T\"\u0014,}\u0018$\u001b-~\u0015>\u001d\u0003Y\rc\u0016!PKp";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "V\u001d)X%I\u00079X*YT,\u0016hU\u001a)\u0011>U\u00108\u0019$\u001c\u001e$\u001cs\u001c\u001e$\u001cu";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "S\u0018)9$U\u0017(:)O\u0011\u0006\u001d1\u001c\u00198\u000b<\u001c\u0011$\f Y\u0006m\u001a-\u001c\u001a8\u0014$\u001c\u001b?X&S\u001a`\u001d%L\u00004";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Y\f.\u001d8H\u001d\"\u0016hK\u001c$\u0014-\u001c\u00068\u0016&U\u001a*X/Y\u0000m\b:YT&\u001d1\u001c\u001e\"\u001a";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GetPreKeyJob(@NonNull final String s, @Nullable final byte[] oldAliceBaseKey) {
        super(p.h().a(s).b().a(new ChatConnectionRequirement()).a());
        this.jid = (String)aol.a((Object)s);
        this.oldAliceBaseKey = oldAliceBaseKey;
        if (oldAliceBaseKey != null) {
            try {
                if (oldAliceBaseKey.length == 0) {
                    throw new IllegalArgumentException(GetPreKeyJob.z[9]);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            Label_0089: {
                if (adc.b(s)) {
                    break Label_0089;
                }
                try {
                    if (a_9.h(s)) {
                        throw new IllegalArgumentException(GetPreKeyJob.z[8] + s);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
    }
    
    private String a() {
        while (true) {
            while (true) {
                try {
                    final StringBuilder append = new StringBuilder().append(GetPreKeyJob.z[6]).append(this.jid).append(GetPreKeyJob.z[7]);
                    if (this.oldAliceBaseKey == null) {
                        final boolean b = true;
                        return append.append(b).toString();
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty((CharSequence)this.jid)) {
                throw new InvalidObjectException(GetPreKeyJob.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.oldAliceBaseKey != null) {
                try {
                    if (this.oldAliceBaseKey.length == 0) {
                        throw new InvalidObjectException(GetPreKeyJob.z[1]);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            Label_0094: {
                if (adc.b(this.jid)) {
                    break Label_0094;
                }
                try {
                    if (a_9.h(this.jid)) {
                        throw new InvalidObjectException(GetPreKeyJob.z[2] + this.jid);
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
    }
    
    @Override
    public void a() {
        Log.w(GetPreKeyJob.z[3] + this.a());
        this.f.b();
    }
    
    @Override
    public void a(final Context context) {
        try {
            if (this.f == null) {
                this.f = new com.whatsapp.jobqueue.a(context);
            }
            this.f.c();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final App g) {
        this.g = g;
    }
    
    @Override
    public boolean a(final Exception ex) {
        Log.c(GetPreKeyJob.z[10] + this.a(), ex);
        return true;
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void l() {
        Log.i(GetPreKeyJob.z[5] + this.a());
        if (this.oldAliceBaseKey != null) {
            final at b = this.g.a2.b(ha.g(this.jid));
            try {
                if (!Arrays.equals(b.b().l(), this.oldAliceBaseKey)) {
                    Log.i(GetPreKeyJob.z[4] + this.a());
                    this.f.b();
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final MessageService a = this.f.a();
        final String e = a.e();
        a.a(e, com.whatsapp.messaging.e.a(e, new String[] { this.jid })).get();
        this.f.b();
    }
}
