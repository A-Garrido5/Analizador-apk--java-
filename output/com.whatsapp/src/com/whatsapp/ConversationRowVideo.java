// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import com.whatsapp.util.Log;
import android.content.Intent;
import java.io.File;
import android.net.Uri;
import com.whatsapp.protocol.b7;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.text.format.DateUtils;
import com.whatsapp.util.br;
import android.widget.ImageView;
import com.whatsapp.util.b;
import android.text.format.Formatter;
import android.view.View$OnClickListener;
import android.os.Build$VERSION;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.ar;
import android.os.Handler;

public final class ConversationRowVideo extends ConversationRowMedia
{
    private static Handler Q;
    private static final String[] T;
    private ar J;
    private final ConversationRowVideo$RowVideoView K;
    private final TextView L;
    private final View M;
    private final TextView N;
    private of O;
    private final View P;
    private final CircularProgressBar R;
    private final TextView S;
    
    static {
        final String[] t = new String[15];
        String s = "+*~\u001b\u001a80h\r\u00108l;\n\u00052.D\u0001\u0012g";
        int n = -1;
        String[] array = t;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "6&b";
                    n2 = 1;
                    array = t;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "-,h";
                    n2 = 2;
                    array = t;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "}.~\b\u001e<\u001ch\u0005\r8y";
                    n2 = 3;
                    array = t;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "</~\u001e\u0003";
                    n2 = 4;
                    array = t;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = t;
                    s = "7*\u007f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "}6i\u0000M";
                    n = 5;
                    array = t;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "}3i\u0003\u0010/&h\u001fM";
                    n = 6;
                    array = t;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "}7i\r\u0019.%~\u001e\u00054-|V";
                    n = 7;
                    array = t;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "}%r\u0000\u0012\u000e*a\tM";
                    n = 8;
                    array = t;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "}7r\u0001\u0012.7z\u0001\u0007g";
                    n = 9;
                    array = t;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "}7b\u001c\u0012g";
                    n = 10;
                    array = t;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "}7i\r\u0019.%~\u001e\u00058'!";
                    n = 11;
                    array = t;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "}-z\u0001\u0012g";
                    n = 12;
                    array = t;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "}%r\u0000\u0012g";
                    n = 13;
                    array = t;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        T = t;
    }
    
    public ConversationRowVideo(final Context context, final bi bi) {
        super(context, bi);
        this.J = new uh(this);
        this.S = (TextView)this.findViewById(2131755468);
        this.K = (ConversationRowVideo$RowVideoView)this.findViewById(2131755393);
        this.R = (CircularProgressBar)this.findViewById(2131755163);
        this.L = (TextView)this.findViewById(2131755394);
        this.P = this.findViewById(2131755209);
        this.M = this.findViewById(2131755485);
        this.N = (TextView)this.findViewById(2131755486);
        this.R.setMax(100);
        this.R.setProgressBarBackgroundColor(0);
        if (ConversationRowVideo.Q != null || Build$VERSION.SDK_INT >= 11) {}
        this.b(bi);
    }
    
    static Handler a() {
        return ConversationRowVideo.Q;
    }
    
    static of a(final ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.O;
    }
    
    static of a(final ConversationRowVideo conversationRowVideo, final of o) {
        return conversationRowVideo.O = o;
    }
    
    static ConversationRowVideo$RowVideoView b(final ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.K;
    }
    
    private void b(final bi bi) {
        final boolean i = App.I;
        final MediaData mediaData = (MediaData)bi.N;
        this.L.setVisibility(8);
        Label_0498: {
            if (mediaData.transferring) {
                this.M.setVisibility(0);
                this.R.setVisibility(0);
                this.P.setVisibility(0);
                this.S.setText((CharSequence)"");
                this.S.setVisibility(8);
                Label_0097: {
                    if (bi.a.b) {
                        this.setOnClickListener((View$OnClickListener)this.G);
                        if (!i) {
                            break Label_0097;
                        }
                    }
                    this.setOnClickListener((View$OnClickListener)null);
                }
                this.S.setOnClickListener((View$OnClickListener)this.H);
                this.R.setOnClickListener((View$OnClickListener)this.H);
                int progress = (int)mediaData.progress;
                Label_0169: {
                    if (mediaData.transcoder != null && mediaData.transcoder.g()) {
                        if (mediaData.uploader == null) {
                            progress /= 2;
                            if (!i) {
                                break Label_0169;
                            }
                        }
                        progress = 50 + progress / 2;
                    }
                }
                this.R.setIndeterminate(progress == 0);
                final CircularProgressBar r = this.R;
                int progressBarColor;
                if (progress == 0) {
                    progressBarColor = this.getResources().getColor(2131624020);
                }
                else {
                    progressBarColor = this.getResources().getColor(2131624019);
                }
                r.setProgressBarColor(progressBarColor);
                this.R.setProgress(progress);
                if (!i) {
                    break Label_0498;
                }
            }
            if (mediaData.transferred || (bi.x && bi.a.b && !a_9.f(bi.a.a))) {
                this.M.setVisibility(8);
                this.S.setText(2131231484);
                this.S.setVisibility(8);
                this.R.setVisibility(8);
                this.P.setVisibility(8);
                this.setOnLongClickListener(this.v);
                this.S.setOnClickListener((View$OnClickListener)this.G);
                this.setOnClickListener((View$OnClickListener)this.G);
                if (!i) {
                    break Label_0498;
                }
            }
            this.M.setVisibility(0);
            this.R.setVisibility(8);
            this.P.setVisibility(8);
            this.S.setVisibility(0);
            this.setOnLongClickListener(this.v);
            if (bi.a.b && mediaData.file != null) {
                this.S.setText(2131231609);
                this.S.setCompoundDrawablesWithIntrinsicBounds(2130837687, 0, 0, 0);
                this.S.setOnClickListener((View$OnClickListener)this.F);
                this.setOnClickListener((View$OnClickListener)this.G);
                if (!i) {
                    break Label_0498;
                }
            }
            this.S.setText((CharSequence)Formatter.formatShortFileSize((Context)App.aq, bi.L));
            this.S.setCompoundDrawablesWithIntrinsicBounds(2130837630, 0, 0, 0);
            this.S.setOnClickListener((View$OnClickListener)this.I);
            this.setOnClickListener((View$OnClickListener)this.I);
        }
        final ConversationRowVideo$RowVideoView k = this.K;
        Drawable frameDrawable;
        if (bi.a.b) {
            frameDrawable = ConversationRowImage.O;
        }
        else {
            frameDrawable = ConversationRowImage.T;
        }
        k.setFrameDrawable(frameDrawable);
        com.whatsapp.util.b.c(bi, this.K, this.J);
        if (ConversationRowVideo.Q != null) {
            if (this.O != null) {
                ConversationRowVideo.Q.removeCallbacks((Runnable)this.O);
                this.O.a();
            }
            this.O = new of(this, mediaData);
            ConversationRowVideo.Q.postDelayed((Runnable)this.O, 2000L);
        }
        if (bi.D == 0) {
            bi.D = br.a(mediaData.file);
        }
        String text = null;
        Label_0646: {
            if (bi.D != 0) {
                text = DateUtils.formatElapsedTime((long)bi.D);
                if (!i) {
                    break Label_0646;
                }
            }
            text = Formatter.formatShortFileSize((Context)App.aq, bi.L);
        }
        this.L.setText((CharSequence)text);
        this.L.setVisibility(0);
        Label_0716: {
            if (App.ak()) {
                this.L.setCompoundDrawablesWithIntrinsicBounds(2130838902, 0, 0, 0);
                if (!i) {
                    break Label_0716;
                }
            }
            this.L.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)new m(this.getContext().getResources().getDrawable(2130838902)), (Drawable)null);
        }
        Label_0781: {
            if (this.D != null) {
                if (bi.x && bi.a.b && !a_9.h(bi.a.a)) {
                    this.D.setCompoundDrawablesWithIntrinsicBounds(2130837625, 0, 0, 0);
                    if (!i) {
                        break Label_0781;
                    }
                }
                this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)bi.M)) {
            this.N.setVisibility(0);
            this.setMessageText(bi.M, (TextEmojiLabel)this.N, 0, bi);
            if (!i) {
                return;
            }
        }
        this.N.setVisibility(8);
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        if (bi != this.t || b) {
            this.b(bi);
        }
        super.a(bi, b);
    }
    
    @Override
    protected int b() {
        return 2130903128;
    }
    
    @Override
    protected int b(final int n) {
        final boolean i = App.I;
        int n2 = 0;
        Label_0057: {
            if (b7.a(n, 13) >= 0) {
                n2 = 2130838920;
                if (!i) {
                    break Label_0057;
                }
            }
            if (b7.a(n, 5) >= 0) {
                n2 = 2130838924;
                if (!i) {
                    break Label_0057;
                }
            }
            if (b7.a(n, 4) == 0) {
                n2 = 2130838922;
                if (!i) {
                    break Label_0057;
                }
            }
            n2 = 2130838926;
        }
        if (App.aV == 3 && n == 7) {
            n2 = 2130838926;
        }
        return n2;
    }
    
    @Override
    public void d() {
        this.b(this.t);
        super.d();
    }
    
    @Override
    protected void j() {
        final MediaData mediaData = (MediaData)this.t.N;
        if (!this.t.a.b && !mediaData.transferred) {
            return;
        }
        if (mediaData.file == null || !new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
            final Intent intent = new Intent(this.getContext(), (Class)MediaGallery.class);
            intent.putExtra(ConversationRowVideo.T[2], -1);
            intent.putExtra(ConversationRowVideo.T[4], true);
            intent.putExtra(ConversationRowVideo.T[5], this.t.a.a);
            intent.putExtra(ConversationRowVideo.T[1], this.t.a.hashCode());
            this.getContext().startActivity(intent);
            return;
        }
        Log.i(ConversationRowVideo.T[0] + this.t.a.b + ConversationRowVideo.T[11] + this.t.I + ConversationRowVideo.T[13] + this.t.k + ConversationRowVideo.T[6] + br.c(this.t.d) + ConversationRowVideo.T[14] + mediaData.file + ConversationRowVideo.T[7] + mediaData.progress + ConversationRowVideo.T[12] + mediaData.transferred + ConversationRowVideo.T[8] + mediaData.transferring + ConversationRowVideo.T[9] + mediaData.fileSize + ConversationRowVideo.T[3] + this.t.L + ConversationRowVideo.T[10] + this.t.u);
        up.h();
        this.getContext().startActivity(MediaView.a(this.t, this.t.a.a, this.getContext()));
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (ConversationRowVideo.Q != null && this.O == null) {
            this.O = new of(this, (MediaData)this.t.N);
            ConversationRowVideo.Q.postDelayed((Runnable)this.O, 2000L);
        }
    }
    
    @Override
    protected int p() {
        return 2130903129;
    }
}
