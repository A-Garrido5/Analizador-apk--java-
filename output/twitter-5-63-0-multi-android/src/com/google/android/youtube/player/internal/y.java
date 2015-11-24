// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.database.Cursor;
import android.content.IntentSender;
import java.io.InputStream;
import android.os.Bundle;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.app.TaskStackBuilder;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.app.Fragment;
import android.view.ActionMode;
import android.view.WindowManager;
import android.view.Window;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.view.MenuInflater;
import android.os.Looper;
import android.app.LoaderManager;
import android.view.LayoutInflater;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.ComponentName;
import java.io.File;
import android.content.res.AssetManager;
import android.content.pm.ApplicationInfo;
import android.app.ActionBar;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.content.ServiceConnection;
import android.content.Intent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.app.Activity;

public class y extends Activity
{
    private Activity a;
    
    public y(final Activity a) {
        this.a = a;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a.addContentView(view, viewGroup$LayoutParams);
    }
    
    public boolean bindService(final Intent intent, final ServiceConnection serviceConnection, final int n) {
        return this.a.bindService(intent, serviceConnection, n);
    }
    
    public int checkCallingOrSelfPermission(final String s) {
        return this.a.checkCallingOrSelfPermission(s);
    }
    
    public int checkCallingOrSelfUriPermission(final Uri uri, final int n) {
        return this.a.checkCallingOrSelfUriPermission(uri, n);
    }
    
    public int checkCallingPermission(final String s) {
        return this.a.checkCallingPermission(s);
    }
    
    public int checkCallingUriPermission(final Uri uri, final int n) {
        return this.a.checkCallingUriPermission(uri, n);
    }
    
    public int checkPermission(final String s, final int n, final int n2) {
        return this.a.checkPermission(s, n, n2);
    }
    
    public int checkUriPermission(final Uri uri, final int n, final int n2, final int n3) {
        return this.a.checkUriPermission(uri, n, n2, n3);
    }
    
    public int checkUriPermission(final Uri uri, final String s, final String s2, final int n, final int n2, final int n3) {
        return this.a.checkUriPermission(uri, s, s2, n, n2, n3);
    }
    
    public void clearWallpaper() {
        this.a.clearWallpaper();
    }
    
    public void closeContextMenu() {
        this.a.closeContextMenu();
    }
    
    public void closeOptionsMenu() {
        this.a.closeOptionsMenu();
    }
    
    public Context createPackageContext(final String s, final int n) {
        return this.a.createPackageContext(s, n);
    }
    
    public PendingIntent createPendingResult(final int n, final Intent intent, final int n2) {
        return this.a.createPendingResult(n, intent, n2);
    }
    
    public String[] databaseList() {
        return this.a.databaseList();
    }
    
    public boolean deleteDatabase(final String s) {
        return this.a.deleteDatabase(s);
    }
    
    public boolean deleteFile(final String s) {
        return this.a.deleteFile(s);
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.a.dump(s, fileDescriptor, printWriter, array);
    }
    
    public void enforceCallingOrSelfPermission(final String s, final String s2) {
        this.a.enforceCallingOrSelfPermission(s, s2);
    }
    
    public void enforceCallingOrSelfUriPermission(final Uri uri, final int n, final String s) {
        this.a.enforceCallingOrSelfUriPermission(uri, n, s);
    }
    
    public void enforceCallingPermission(final String s, final String s2) {
        this.a.enforceCallingPermission(s, s2);
    }
    
    public void enforceCallingUriPermission(final Uri uri, final int n, final String s) {
        this.a.enforceCallingUriPermission(uri, n, s);
    }
    
    public void enforcePermission(final String s, final int n, final int n2, final String s2) {
        this.a.enforcePermission(s, n, n2, s2);
    }
    
    public void enforceUriPermission(final Uri uri, final int n, final int n2, final int n3, final String s) {
        this.a.enforceUriPermission(uri, n, n2, n3, s);
    }
    
    public void enforceUriPermission(final Uri uri, final String s, final String s2, final int n, final int n2, final int n3, final String s3) {
        this.a.enforceUriPermission(uri, s, s2, n, n2, n3, s3);
    }
    
    public boolean equals(final Object o) {
        return this.a.equals(o);
    }
    
    public String[] fileList() {
        return this.a.fileList();
    }
    
    public View findViewById(final int n) {
        return this.a.findViewById(n);
    }
    
    public void finish() {
        this.a.finish();
    }
    
    public void finishActivity(final int n) {
        this.a.finishActivity(n);
    }
    
    public void finishActivityFromChild(final Activity activity, final int n) {
        this.a.finishActivityFromChild(activity, n);
    }
    
    public void finishAffinity() {
        this.a.finishAffinity();
    }
    
    public void finishFromChild(final Activity activity) {
        this.a.finishFromChild(activity);
    }
    
    public ActionBar getActionBar() {
        return this.a.getActionBar();
    }
    
    public Context getApplicationContext() {
        return this.a.getApplicationContext();
    }
    
    public ApplicationInfo getApplicationInfo() {
        return this.a.getApplicationInfo();
    }
    
    public AssetManager getAssets() {
        return this.a.getAssets();
    }
    
    public Context getBaseContext() {
        return this.a.getBaseContext();
    }
    
    public File getCacheDir() {
        return this.a.getCacheDir();
    }
    
    public ComponentName getCallingActivity() {
        return this.a.getCallingActivity();
    }
    
    public String getCallingPackage() {
        return this.a.getCallingPackage();
    }
    
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
    
    public ClassLoader getClassLoader() {
        return this.a.getClassLoader();
    }
    
    public ComponentName getComponentName() {
        return this.a.getComponentName();
    }
    
    public ContentResolver getContentResolver() {
        return this.a.getContentResolver();
    }
    
    public View getCurrentFocus() {
        return this.a.getCurrentFocus();
    }
    
    public File getDatabasePath(final String s) {
        return this.a.getDatabasePath(s);
    }
    
    public File getDir(final String s, final int n) {
        return this.a.getDir(s, n);
    }
    
    public File getExternalCacheDir() {
        return this.a.getExternalCacheDir();
    }
    
    public File getExternalFilesDir(final String s) {
        return this.a.getExternalFilesDir(s);
    }
    
    public File getFileStreamPath(final String s) {
        return this.a.getFileStreamPath(s);
    }
    
    public File getFilesDir() {
        return this.a.getFilesDir();
    }
    
    public FragmentManager getFragmentManager() {
        return this.a.getFragmentManager();
    }
    
    public Intent getIntent() {
        return this.a.getIntent();
    }
    
    public Object getLastNonConfigurationInstance() {
        return this.a.getLastNonConfigurationInstance();
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.a.getLayoutInflater();
    }
    
    public LoaderManager getLoaderManager() {
        return this.a.getLoaderManager();
    }
    
    public String getLocalClassName() {
        return this.a.getLocalClassName();
    }
    
    public Looper getMainLooper() {
        return this.a.getMainLooper();
    }
    
    public MenuInflater getMenuInflater() {
        return this.a.getMenuInflater();
    }
    
    public File getObbDir() {
        return this.a.getObbDir();
    }
    
    public String getPackageCodePath() {
        return this.a.getPackageCodePath();
    }
    
    public PackageManager getPackageManager() {
        return this.a.getPackageManager();
    }
    
    public String getPackageName() {
        return this.a.getPackageName();
    }
    
    public String getPackageResourcePath() {
        return this.a.getPackageResourcePath();
    }
    
    public Intent getParentActivityIntent() {
        return this.a.getParentActivityIntent();
    }
    
    public SharedPreferences getPreferences(final int n) {
        return this.a.getPreferences(n);
    }
    
    public int getRequestedOrientation() {
        return this.a.getRequestedOrientation();
    }
    
    public Resources getResources() {
        return this.a.getResources();
    }
    
    public SharedPreferences getSharedPreferences(final String s, final int n) {
        return this.a.getSharedPreferences(s, n);
    }
    
    public Object getSystemService(final String s) {
        return this.a.getSystemService(s);
    }
    
    public int getTaskId() {
        return this.a.getTaskId();
    }
    
    public Resources$Theme getTheme() {
        return this.a.getTheme();
    }
    
    public Drawable getWallpaper() {
        return this.a.getWallpaper();
    }
    
    public int getWallpaperDesiredMinimumHeight() {
        return this.a.getWallpaperDesiredMinimumHeight();
    }
    
    public int getWallpaperDesiredMinimumWidth() {
        return this.a.getWallpaperDesiredMinimumWidth();
    }
    
    public Window getWindow() {
        return this.a.getWindow();
    }
    
    public WindowManager getWindowManager() {
        return this.a.getWindowManager();
    }
    
    public void grantUriPermission(final String s, final Uri uri, final int n) {
        this.a.grantUriPermission(s, uri, n);
    }
    
    public boolean hasWindowFocus() {
        return this.a.hasWindowFocus();
    }
    
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public void invalidateOptionsMenu() {
        this.a.invalidateOptionsMenu();
    }
    
    public boolean isChangingConfigurations() {
        return this.a.isChangingConfigurations();
    }
    
    public boolean isFinishing() {
        return this.a.isFinishing();
    }
    
    public boolean isRestricted() {
        return this.a.isRestricted();
    }
    
    public boolean isTaskRoot() {
        return this.a.isTaskRoot();
    }
    
    public boolean moveTaskToBack(final boolean b) {
        return this.a.moveTaskToBack(b);
    }
    
    public boolean navigateUpTo(final Intent intent) {
        return this.a.navigateUpTo(intent);
    }
    
    public boolean navigateUpToFromChild(final Activity activity, final Intent intent) {
        return this.a.navigateUpToFromChild(activity, intent);
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }
    
    public void onAttachFragment(final Fragment fragment) {
        this.a.onAttachFragment(fragment);
    }
    
    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }
    
    public void onBackPressed() {
        this.a.onBackPressed();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.a.onConfigurationChanged(configuration);
    }
    
    public void onContentChanged() {
        this.a.onContentChanged();
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        return this.a.onContextItemSelected(menuItem);
    }
    
    public void onContextMenuClosed(final Menu menu) {
        this.a.onContextMenuClosed(menu);
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.a.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public CharSequence onCreateDescription() {
        return this.a.onCreateDescription();
    }
    
    public void onCreateNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
        this.a.onCreateNavigateUpTaskStack(taskStackBuilder);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        return this.a.onCreateOptionsMenu(menu);
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.a.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.a.onCreatePanelView(n);
    }
    
    public boolean onCreateThumbnail(final Bitmap bitmap, final Canvas canvas) {
        return this.a.onCreateThumbnail(bitmap, canvas);
    }
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return this.a.onCreateView(view, s, context, set);
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.a.onCreateView(s, context, set);
    }
    
    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        return this.a.onGenericMotionEvent(motionEvent);
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyLongPress(n, keyEvent);
    }
    
    public boolean onKeyMultiple(final int n, final int n2, final KeyEvent keyEvent) {
        return this.a.onKeyMultiple(n, n2, keyEvent);
    }
    
    public boolean onKeyShortcut(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyShortcut(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return this.a.onKeyUp(n, keyEvent);
    }
    
    public void onLowMemory() {
        this.a.onLowMemory();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.a.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.a.onMenuOpened(n, menu);
    }
    
    public boolean onNavigateUp() {
        return this.a.onNavigateUp();
    }
    
    public boolean onNavigateUpFromChild(final Activity activity) {
        return this.a.onNavigateUpFromChild(activity);
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        return this.a.onOptionsItemSelected(menuItem);
    }
    
    public void onOptionsMenuClosed(final Menu menu) {
        this.a.onOptionsMenuClosed(menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.a.onPanelClosed(n, menu);
    }
    
    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
        this.a.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        return this.a.onPrepareOptionsMenu(menu);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.a.onPreparePanel(n, view, menu);
    }
    
    public Object onRetainNonConfigurationInstance() {
        return this.a.onRetainNonConfigurationInstance();
    }
    
    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
    
    public boolean onTrackballEvent(final MotionEvent motionEvent) {
        return this.a.onTrackballEvent(motionEvent);
    }
    
    public void onTrimMemory(final int n) {
        this.a.onTrimMemory(n);
    }
    
    public void onUserInteraction() {
        this.a.onUserInteraction();
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.a.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.a.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.a.onWindowStartingActionMode(actionMode$Callback);
    }
    
    public void openContextMenu(final View view) {
        this.a.openContextMenu(view);
    }
    
    public FileInputStream openFileInput(final String s) {
        return this.a.openFileInput(s);
    }
    
    public FileOutputStream openFileOutput(final String s, final int n) {
        return this.a.openFileOutput(s, n);
    }
    
    public void openOptionsMenu() {
        this.a.openOptionsMenu();
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory) {
        return this.a.openOrCreateDatabase(s, n, sqLiteDatabase$CursorFactory);
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory, final DatabaseErrorHandler databaseErrorHandler) {
        return this.a.openOrCreateDatabase(s, n, sqLiteDatabase$CursorFactory, databaseErrorHandler);
    }
    
    public void overridePendingTransition(final int n, final int n2) {
        this.a.overridePendingTransition(n, n2);
    }
    
    public Drawable peekWallpaper() {
        return this.a.peekWallpaper();
    }
    
    public void recreate() {
        this.a.recreate();
    }
    
    public void registerComponentCallbacks(final ComponentCallbacks componentCallbacks) {
        this.a.registerComponentCallbacks(componentCallbacks);
    }
    
    public void registerForContextMenu(final View view) {
        this.a.registerForContextMenu(view);
    }
    
    public Intent registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        return this.a.registerReceiver(broadcastReceiver, intentFilter);
    }
    
    public Intent registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler) {
        return this.a.registerReceiver(broadcastReceiver, intentFilter, s, handler);
    }
    
    public void removeStickyBroadcast(final Intent intent) {
        this.a.removeStickyBroadcast(intent);
    }
    
    public void revokeUriPermission(final Uri uri, final int n) {
        this.a.revokeUriPermission(uri, n);
    }
    
    public void sendBroadcast(final Intent intent) {
        this.a.sendBroadcast(intent);
    }
    
    public void sendBroadcast(final Intent intent, final String s) {
        this.a.sendBroadcast(intent, s);
    }
    
    public void sendOrderedBroadcast(final Intent intent, final String s) {
        this.a.sendOrderedBroadcast(intent, s);
    }
    
    public void sendOrderedBroadcast(final Intent intent, final String s, final BroadcastReceiver broadcastReceiver, final Handler handler, final int n, final String s2, final Bundle bundle) {
        this.a.sendOrderedBroadcast(intent, s, broadcastReceiver, handler, n, s2, bundle);
    }
    
    public void sendStickyBroadcast(final Intent intent) {
        this.a.sendStickyBroadcast(intent);
    }
    
    public void sendStickyOrderedBroadcast(final Intent intent, final BroadcastReceiver broadcastReceiver, final Handler handler, final int n, final String s, final Bundle bundle) {
        this.a.sendStickyOrderedBroadcast(intent, broadcastReceiver, handler, n, s, bundle);
    }
    
    public void setContentView(final int contentView) {
        this.a.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.a.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a.setContentView(view, viewGroup$LayoutParams);
    }
    
    public void setFinishOnTouchOutside(final boolean finishOnTouchOutside) {
        this.a.setFinishOnTouchOutside(finishOnTouchOutside);
    }
    
    public void setIntent(final Intent intent) {
        this.a.setIntent(intent);
    }
    
    public void setRequestedOrientation(final int requestedOrientation) {
        this.a.setRequestedOrientation(requestedOrientation);
    }
    
    public void setTheme(final int theme) {
        this.a.setTheme(theme);
    }
    
    public void setTitle(final int title) {
        this.a.setTitle(title);
    }
    
    public void setTitle(final CharSequence title) {
        this.a.setTitle(title);
    }
    
    public void setTitleColor(final int titleColor) {
        this.a.setTitleColor(titleColor);
    }
    
    public void setVisible(final boolean visible) {
        this.a.setVisible(visible);
    }
    
    public void setWallpaper(final Bitmap wallpaper) {
        this.a.setWallpaper(wallpaper);
    }
    
    public void setWallpaper(final InputStream wallpaper) {
        this.a.setWallpaper(wallpaper);
    }
    
    public boolean shouldUpRecreateTask(final Intent intent) {
        return this.a.shouldUpRecreateTask(intent);
    }
    
    public ActionMode startActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.a.startActionMode(actionMode$Callback);
    }
    
    public void startActivities(final Intent[] array) {
        this.a.startActivities(array);
    }
    
    public void startActivities(final Intent[] array, final Bundle bundle) {
        this.a.startActivities(array, bundle);
    }
    
    public void startActivity(final Intent intent) {
        this.a.startActivity(intent);
    }
    
    public void startActivity(final Intent intent, final Bundle bundle) {
        this.a.startActivity(intent, bundle);
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        this.a.startActivityForResult(intent, n);
    }
    
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        this.a.startActivityForResult(intent, n, bundle);
    }
    
    public void startActivityFromChild(final Activity activity, final Intent intent, final int n) {
        this.a.startActivityFromChild(activity, intent, n);
    }
    
    public void startActivityFromChild(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        this.a.startActivityFromChild(activity, intent, n, bundle);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        this.a.startActivityFromFragment(fragment, intent, n);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        this.a.startActivityFromFragment(fragment, intent, n, bundle);
    }
    
    public boolean startActivityIfNeeded(final Intent intent, final int n) {
        return this.a.startActivityIfNeeded(intent, n);
    }
    
    public boolean startActivityIfNeeded(final Intent intent, final int n, final Bundle bundle) {
        return this.a.startActivityIfNeeded(intent, n, bundle);
    }
    
    public boolean startInstrumentation(final ComponentName componentName, final String s, final Bundle bundle) {
        return this.a.startInstrumentation(componentName, s, bundle);
    }
    
    public void startIntentSender(final IntentSender intentSender, final Intent intent, final int n, final int n2, final int n3) {
        this.a.startIntentSender(intentSender, intent, n, n2, n3);
    }
    
    public void startIntentSender(final IntentSender intentSender, final Intent intent, final int n, final int n2, final int n3, final Bundle bundle) {
        this.a.startIntentSender(intentSender, intent, n, n2, n3, bundle);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) {
        this.a.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        this.a.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public void startIntentSenderFromChild(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) {
        this.a.startIntentSenderFromChild(activity, intentSender, n, intent, n2, n3, n4);
    }
    
    public void startIntentSenderFromChild(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        this.a.startIntentSenderFromChild(activity, intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public void startManagingCursor(final Cursor cursor) {
        this.a.startManagingCursor(cursor);
    }
    
    public boolean startNextMatchingActivity(final Intent intent) {
        return this.a.startNextMatchingActivity(intent);
    }
    
    public boolean startNextMatchingActivity(final Intent intent, final Bundle bundle) {
        return this.a.startNextMatchingActivity(intent, bundle);
    }
    
    public void startSearch(final String s, final boolean b, final Bundle bundle, final boolean b2) {
        this.a.startSearch(s, b, bundle, b2);
    }
    
    public ComponentName startService(final Intent intent) {
        return this.a.startService(intent);
    }
    
    public void stopManagingCursor(final Cursor cursor) {
        this.a.stopManagingCursor(cursor);
    }
    
    public boolean stopService(final Intent intent) {
        return this.a.stopService(intent);
    }
    
    public void takeKeyEvents(final boolean b) {
        this.a.takeKeyEvents(b);
    }
    
    public String toString() {
        return this.a.toString();
    }
    
    public void triggerSearch(final String s, final Bundle bundle) {
        this.a.triggerSearch(s, bundle);
    }
    
    public void unbindService(final ServiceConnection serviceConnection) {
        this.a.unbindService(serviceConnection);
    }
    
    public void unregisterComponentCallbacks(final ComponentCallbacks componentCallbacks) {
        this.a.unregisterComponentCallbacks(componentCallbacks);
    }
    
    public void unregisterForContextMenu(final View view) {
        this.a.unregisterForContextMenu(view);
    }
    
    public void unregisterReceiver(final BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
    }
}
