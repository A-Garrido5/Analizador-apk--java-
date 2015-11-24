// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import java.io.File;
import android.net.Uri;
import com.whatsapp.util.Log;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.br;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.whatsapp.util.u;

public class ConversationRowAudio extends ConversationRow
{
    private static u L;
    private static final String[] U;
    private View$OnClickListener F;
    private final TextView G;
    private View$OnClickListener H;
    private final ImageView I;
    private final ImageView J;
    private up K;
    private final ImageView M;
    private View$OnClickListener N;
    private final ImageButton O;
    private WaveformVisualizerView P;
    private View$OnClickListener Q;
    private final TextView R;
    private final CircularProgressBar S;
    private final VoiceNoteSeekBar T;
    
    static {
        final String[] u = new String[3];
        String s = "j\f\u001blMb\u0007";
        int n = -1;
        String[] array = u;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "j\f\u001blMb\u00071pV";
                    n2 = 1;
                    array = u;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "d\f\u0000t\\u\u0010\u000fvPh\r\u001cmNq\f\u0007a\\i\f\u001ag\u0016q\n\u000buTb\u0010\u001dc^bC";
                    n2 = 2;
                    array = u;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        U = u;
        ConversationRowAudio.L = new u(250);
    }
    
    ConversationRowAudio(final Context context, final bi bi) {
        super(context, bi);
        this.F = (View$OnClickListener)new a_q(this);
        this.N = (View$OnClickListener)new ix(this);
        this.Q = (View$OnClickListener)new aoi(this);
        this.H = (View$OnClickListener)new il(this);
        this.O = (ImageButton)this.findViewById(2131755468);
        this.J = (ImageView)this.findViewById(2131755367);
        this.M = (ImageView)this.findViewById(2131755475);
        this.I = (ImageView)this.findViewById(2131755085);
        this.S = (CircularProgressBar)this.findViewById(2131755469);
        this.T = (VoiceNoteSeekBar)this.findViewById(2131755470);
        this.R = (TextView)this.findViewById(2131755471);
        this.G = (TextView)this.findViewById(2131755477);
        this.S.setMax(100);
        this.S.setProgressBarColor(context.getResources().getColor(2131624019));
        this.S.setProgressBarBackgroundColor(536870912);
        this.T.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new as6(this));
        this.b(bi);
    }
    
    static void a(final ConversationRowAudio conversationRowAudio) {
        conversationRowAudio.f();
    }
    
    static WaveformVisualizerView b(final ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.P;
    }
    
    public static void b() {
        ConversationRowAudio.L.clear();
    }
    
    private void b(final bi bi) {
        final boolean i = App.I;
        final MediaData mediaData = (MediaData)bi.N;
        Label_0067: {
            if (!bi.a.b) {
                if (this.i) {
                    this.M.setVisibility(0);
                    this.J.setVisibility(8);
                    if (!i) {
                        break Label_0067;
                    }
                }
                this.M.setVisibility(8);
                this.J.setVisibility(0);
            }
        }
        this.R.setVisibility(8);
        this.T.setProgressColor(0);
        this.S.setVisibility(8);
        if (this.i && !bi.a.b) {
            this.findViewById(2131755467).setPadding(0, (int)(8.0f * vc.b().b), 0, 0);
        }
        if (bi.D == 0) {
            bi.D = br.a(mediaData.file);
        }
        Label_0758: {
            if (mediaData.transferring) {
                this.S.setVisibility(0);
                this.S.setIndeterminate(mediaData.progress == 0L || mediaData.progress == 100L);
                this.S.setProgress((int)mediaData.progress);
                this.R.setVisibility(0);
                this.O.setImageResource(2130838853);
                this.O.setOnClickListener(this.F);
                if (!i) {
                    break Label_0758;
                }
            }
            if (mediaData.transferred || (bi.x && bi.a.b && !a_9.f(bi.a.a))) {
                this.T.setProgressColor(this.getResources().getColor(2131624021));
                Label_0614: {
                    if (!up.a(bi)) {
                        if (this.P == null) {
                            final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755476);
                            if (viewGroup != null) {
                                (this.P = new WaveformVisualizerView(this.getContext())).setColor(-1);
                                viewGroup.addView((View)this.P, -1, -1);
                            }
                        }
                        this.O.setImageDrawable((Drawable)new m(this.getContext().getResources().getDrawable(2130838862)));
                        this.T.setMax(1000 * bi.D);
                        final Integer n = ConversationRowAudio.L.get(bi.a);
                        final VoiceNoteSeekBar t = this.T;
                        int intValue;
                        if (n != null) {
                            intValue = n;
                        }
                        else {
                            intValue = 0;
                        }
                        t.setProgress(intValue);
                        (this.K = new up((Activity)this.getContext())).b(bi);
                        this.g();
                        if (!i) {
                            break Label_0614;
                        }
                    }
                    this.K = up.n;
                    Label_0600: {
                        if (!this.K.n()) {
                            this.O.setImageDrawable((Drawable)new m(this.getContext().getResources().getDrawable(2130838862)));
                            final Integer n2 = ConversationRowAudio.L.get(bi.a);
                            final VoiceNoteSeekBar t2 = this.T;
                            int intValue2;
                            if (n2 != null) {
                                intValue2 = n2;
                            }
                            else {
                                intValue2 = 0;
                            }
                            t2.setProgress(intValue2);
                            this.g();
                            if (!i) {
                                break Label_0600;
                            }
                        }
                        this.O.setImageResource(2130838859);
                        this.T.setProgress(this.K.d());
                        this.f();
                    }
                    this.T.setMax(this.K.r());
                }
                if (this.P != null) {
                    this.K.a(new adf(this));
                }
                this.K.a(new ao6(this));
                this.O.setOnClickListener(this.N);
                if (!i) {
                    break Label_0758;
                }
            }
            this.R.setVisibility(0);
            this.R.setText((CharSequence)Formatter.formatShortFileSize((Context)App.aq, bi.L));
            if (bi.a.b && mediaData != null && mediaData.file != null) {
                this.O.setImageResource(2130838865);
                this.O.setOnClickListener(this.H);
                if (!i) {
                    break Label_0758;
                }
            }
            this.O.setImageResource(2130838856);
            this.O.setOnClickListener(this.Q);
        }
        String text = null;
        Label_0791: {
            if (bi.D != 0) {
                text = DateUtils.formatElapsedTime((long)bi.D);
                if (!i) {
                    break Label_0791;
                }
            }
            text = Formatter.formatShortFileSize((Context)App.aq, bi.L);
        }
        this.G.setText((CharSequence)text);
    }
    
    static up c(final ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.K;
    }
    
    static u c() {
        return ConversationRowAudio.L;
    }
    
    static VoiceNoteSeekBar d(final ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.T;
    }
    
    static ImageButton e(final ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.O;
    }
    
    static TextView f(final ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.G;
    }
    
    private void f() {
        if (this.P != null) {
            this.P.setVisibility(0);
        }
        if (this.I != null) {
            this.I.setVisibility(8);
        }
    }
    
    private void g() {
        if (this.P != null) {
            this.P.setVisibility(8);
        }
        if (this.I != null) {
            this.I.setVisibility(0);
        }
    }
    
    static void g(final ConversationRowAudio conversationRowAudio) {
        conversationRowAudio.g();
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        boolean b2;
        if (bi != this.t) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        super.a(bi, b);
        if (b2 || b) {
            this.b(bi);
        }
    }
    
    @Override
    public void a(final String s) {
        final boolean i = App.I;
        if (this.t.a.b) {
            if (!s.equals(App.S.e().u)) {
                return;
            }
            this.a();
            if (!i) {
                return;
            }
        }
        if (this.i) {
            if (!s.equals(this.t.t)) {
                return;
            }
            this.a();
            if (!i) {
                return;
            }
        }
        if (s.equals(this.t.a.a)) {
            this.a();
        }
    }
    
    @Override
    protected int b() {
        return 2130903112;
    }
    
    @Override
    public void d() {
        super.d();
        this.b(this.t);
    }
    
    @Override
    protected void j() {
        Log.i(ConversationRowAudio.U[2] + this.t.a);
        final MediaData mediaData = (MediaData)this.t.N;
        if (!mediaData.transferring) {
            if (!mediaData.transferred || mediaData.file == null || new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
                final Integer n = ConversationRowAudio.L.get(this.t.a);
                if (n != null) {
                    this.K.b(n);
                }
                this.K.b();
                this.d();
                return;
            }
            if (this.getContext() instanceof gu) {
                final gu gu = (gu)this.getContext();
                final String externalStorageState = Environment.getExternalStorageState();
                if (!externalStorageState.equals(ConversationRowAudio.U[0]) && !externalStorageState.equals(ConversationRowAudio.U[1])) {
                    int n2;
                    if (App.aw()) {
                        n2 = 2131231383;
                    }
                    else {
                        n2 = 2131231384;
                    }
                    gu.a(n2);
                    if (!App.I) {
                        return;
                    }
                }
                gu.a(2131231142);
            }
        }
    }
    
    @Override
    protected int p() {
        return 2130903113;
    }
}
