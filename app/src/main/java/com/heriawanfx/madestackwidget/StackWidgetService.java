package com.heriawanfx.madestackwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by user on 02-03-2018.
 */

public class StackWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}