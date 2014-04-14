package com.napster.mobile.android.daggerlogin.test;

import javax.inject.Singleton;

import com.napster.mobile.android.daggerlogin.service.eremedy.ERemedyModule;
import com.napster.mobile.android.daggerlogin.service.eremedy.IERemedy;
import com.napster.mobile.android.daggerlogin.service.eremedy.IEremedyModule;

import dagger.Module;
import dagger.Provides;
import dagger.Provides.Type;

@Module(includes = {ERemedyModule.class}, overrides=true
)
public class TestERemedyModule implements IEremedyModule {
	@Override
	@Provides(type=Type.UNIQUE) @Singleton
	public IERemedy provideERemedy() {
		return new TestERemedyService();
	}
}
