package com.discord.app;

import android.content.Intent;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import rx.subjects.Subject;

@SuppressWarnings("unused")
public class AppActivity extends AppTransitionActivity implements AppComponent {
    public final Intent c() { return new Intent(); }
    public Class<? extends AppComponent> d() { return AppActivity.class; }

    @Override
    public Subject<Void, Void> getUnsubscribeSignal() { return null; }
}
