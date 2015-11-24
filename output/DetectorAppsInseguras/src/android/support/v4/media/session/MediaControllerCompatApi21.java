// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.session;

import android.media.Rating;
import android.media.session.MediaController$TransportControls;
import android.media.session.MediaController$PlaybackInfo;
import android.media.AudioAttributes;
import android.media.session.PlaybackState;
import android.media.MediaMetadata;
import android.os.ResultReceiver;
import android.os.Bundle;
import android.media.session.MediaController$Callback;
import android.os.Handler;
import android.media.session.MediaSession$Token;
import android.content.Context;
import android.media.session.MediaController;
import android.view.KeyEvent;

class MediaControllerCompatApi21
{
    public static Object createCallback(final Callback callback) {
        return new CallbackProxy(callback);
    }
    
    public static boolean dispatchMediaButtonEvent(final Object o, final KeyEvent keyEvent) {
        return ((MediaController)o).dispatchMediaButtonEvent(keyEvent);
    }
    
    public static Object fromToken(final Context context, final Object o) {
        return new MediaController(context, (MediaSession$Token)o);
    }
    
    public static Object getMetadata(final Object o) {
        return ((MediaController)o).getMetadata();
    }
    
    public static Object getPlaybackInfo(final Object o) {
        return ((MediaController)o).getPlaybackInfo();
    }
    
    public static Object getPlaybackState(final Object o) {
        return ((MediaController)o).getPlaybackState();
    }
    
    public static int getRatingType(final Object o) {
        return ((MediaController)o).getRatingType();
    }
    
    public static Object getTransportControls(final Object o) {
        return ((MediaController)o).getTransportControls();
    }
    
    public static void registerCallback(final Object o, final Object o2, final Handler handler) {
        ((MediaController)o).registerCallback((MediaController$Callback)o2, handler);
    }
    
    public static void sendCommand(final Object o, final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
        ((MediaController)o).sendCommand(s, bundle, resultReceiver);
    }
    
    public static void unregisterCallback(final Object o, final Object o2) {
        ((MediaController)o).unregisterCallback((MediaController$Callback)o2);
    }
    
    public interface Callback
    {
        void onMetadataChanged(final Object p0);
        
        void onPlaybackStateChanged(final Object p0);
        
        void onSessionDestroyed();
        
        void onSessionEvent(final String p0, final Bundle p1);
    }
    
    static class CallbackProxy<T extends Callback> extends MediaController$Callback
    {
        protected final T mCallback;
        
        public CallbackProxy(final T mCallback) {
            this.mCallback = mCallback;
        }
        
        public void onMetadataChanged(final MediaMetadata mediaMetadata) {
            ((Callback)this.mCallback).onMetadataChanged(mediaMetadata);
        }
        
        public void onPlaybackStateChanged(final PlaybackState playbackState) {
            ((Callback)this.mCallback).onPlaybackStateChanged(playbackState);
        }
        
        public void onSessionDestroyed() {
            ((Callback)this.mCallback).onSessionDestroyed();
        }
        
        public void onSessionEvent(final String s, final Bundle bundle) {
            ((Callback)this.mCallback).onSessionEvent(s, bundle);
        }
    }
    
    public static class PlaybackInfo
    {
        private static final int FLAG_SCO = 4;
        private static final int STREAM_BLUETOOTH_SCO = 6;
        private static final int STREAM_SYSTEM_ENFORCED = 7;
        
        public static AudioAttributes getAudioAttributes(final Object o) {
            return ((MediaController$PlaybackInfo)o).getAudioAttributes();
        }
        
        public static int getCurrentVolume(final Object o) {
            return ((MediaController$PlaybackInfo)o).getCurrentVolume();
        }
        
        public static int getLegacyAudioStream(final Object o) {
            return toLegacyStreamType(getAudioAttributes(o));
        }
        
        public static int getMaxVolume(final Object o) {
            return ((MediaController$PlaybackInfo)o).getMaxVolume();
        }
        
        public static int getPlaybackType(final Object o) {
            return ((MediaController$PlaybackInfo)o).getPlaybackType();
        }
        
        public static int getVolumeControl(final Object o) {
            return ((MediaController$PlaybackInfo)o).getVolumeControl();
        }
        
        private static int toLegacyStreamType(final AudioAttributes audioAttributes) {
            int n = 3;
            if ((0x1 & audioAttributes.getFlags()) == 0x1) {
                n = 7;
            }
            else {
                if ((0x4 & audioAttributes.getFlags()) == 0x4) {
                    return 6;
                }
                switch (audioAttributes.getUsage()) {
                    case 1:
                    case 11:
                    case 12:
                    case 14: {
                        break;
                    }
                    default: {
                        return n;
                    }
                    case 2: {
                        return 0;
                    }
                    case 13: {
                        return 1;
                    }
                    case 3: {
                        return 8;
                    }
                    case 4: {
                        return 4;
                    }
                    case 6: {
                        return 2;
                    }
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10: {
                        return 5;
                    }
                }
            }
            return n;
        }
    }
    
    public static class TransportControls
    {
        public static void fastForward(final Object o) {
            ((MediaController$TransportControls)o).fastForward();
        }
        
        public static void pause(final Object o) {
            ((MediaController$TransportControls)o).pause();
        }
        
        public static void play(final Object o) {
            ((MediaController$TransportControls)o).play();
        }
        
        public static void rewind(final Object o) {
            ((MediaController$TransportControls)o).rewind();
        }
        
        public static void seekTo(final Object o, final long n) {
            ((MediaController$TransportControls)o).seekTo(n);
        }
        
        public static void setRating(final Object o, final Object o2) {
            ((MediaController$TransportControls)o).setRating((Rating)o2);
        }
        
        public static void skipToNext(final Object o) {
            ((MediaController$TransportControls)o).skipToNext();
        }
        
        public static void skipToPrevious(final Object o) {
            ((MediaController$TransportControls)o).skipToPrevious();
        }
        
        public static void stop(final Object o) {
            ((MediaController$TransportControls)o).stop();
        }
    }
}
