package com.example.newsapp

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import io.paperdb.Paper

/**
 * Implementation of App Widget functionality.
 */
class WidGGGT : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {

    Paper.init(context);
    val title:String=Paper.book().read("title")
    val cont:String=Paper.book().read("des")
    // Construct the RemoteViews object
    val views = RemoteViews(context.packageName, R.layout.wid_g_g_g_t)
    views.setTextViewText(R.id.appwidget_title, title)
    views.setTextViewText(R.id.appwidget_text, cont)

    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}