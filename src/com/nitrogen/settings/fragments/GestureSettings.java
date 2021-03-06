package com.nitrogen.settings.fragments;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class GestureSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.nitrogen_settings_gestures);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.NITROGEN_SETTINGS;
    }
}
