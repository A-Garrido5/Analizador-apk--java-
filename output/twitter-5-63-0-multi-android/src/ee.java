import com.twitter.android.av.VideoPlayerNativeCardView;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ee
{
    VideoPlayerNativeCardView a(final Context context, final AVPlayer avPlayer, final VideoPlayerView$Mode videoPlayerView$Mode) {
        return new VideoPlayerNativeCardView(context, avPlayer, videoPlayerView$Mode);
    }
}
