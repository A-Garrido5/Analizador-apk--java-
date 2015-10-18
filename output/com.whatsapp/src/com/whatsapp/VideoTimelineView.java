// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.RectF;
import java.io.File;
import android.graphics.Rect;
import java.util.ArrayList;
import android.os.AsyncTask;
import android.graphics.Paint;
import android.view.View;

public class VideoTimelineView extends View
{
    private Paint a;
    private AsyncTask b;
    private int c;
    private ArrayList d;
    private Rect e;
    private File f;
    private RectF g;
    
    public VideoTimelineView(final Context context) {
        super(context);
        this.a = new Paint(1);
        this.g = new RectF();
        this.e = new Rect();
    }
    
    static ArrayList a(final VideoTimelineView videoTimelineView) {
        return videoTimelineView.d;
    }
    
    static File b(final VideoTimelineView videoTimelineView) {
        return videoTimelineView.f;
    }
    
    static Paint c(final VideoTimelineView videoTimelineView) {
        return videoTimelineView.a;
    }
    
    protected void onDraw(final Canvas canvas) {
        final boolean i = App.I;
        super.onDraw(canvas);
        if (this.f != null) {
            if (this.c != this.getWidth()) {
                this.c = this.getWidth();
                this.d = null;
                if (this.b != null) {
                    this.b.cancel(true);
                    this.b = null;
                }
            }
            if (this.d == null) {
                if (this.b != null) {
                    return;
                }
                final int n = this.getWidth() / this.getHeight();
                final float n2 = this.getHeight();
                final float n3 = this.getWidth() / n;
                this.d = new ArrayList(n);
                (this.b = new zg(this, n3, n2, n)).execute((Object[])new Void[0]);
                if (!i) {
                    return;
                }
            }
            final float n4 = this.getWidth() / (this.getWidth() / this.getHeight());
            this.g.top = 0.0f;
            this.g.bottom = this.getHeight();
            int n5;
            for (int j = 0; j < this.d.size(); j = n5) {
                this.g.left = n4 * j;
                this.g.right = n4 + this.g.left;
                final Bitmap bitmap = this.d.get(j);
                if (bitmap != null) {
                    final int width = bitmap.getWidth();
                    final int height = bitmap.getHeight();
                    Label_0377: {
                        if (width > height) {
                            this.e.top = 0;
                            this.e.bottom = height;
                            this.e.left = (width - height) / 2;
                            this.e.right = height + this.e.left;
                            if (!i) {
                                break Label_0377;
                            }
                        }
                        this.e.left = 0;
                        this.e.right = width;
                        this.e.top = (height - width) / 2;
                        this.e.bottom = width + this.e.top;
                    }
                    canvas.drawBitmap(bitmap, this.e, this.g, this.a);
                }
                n5 = j + 1;
                if (i) {
                    break;
                }
            }
        }
    }
    
    public void setVideoFile(final File f) {
        this.f = f;
        this.d = null;
        if (this.b != null) {
            this.b.cancel(true);
            this.b = null;
        }
        this.invalidate();
    }
}
