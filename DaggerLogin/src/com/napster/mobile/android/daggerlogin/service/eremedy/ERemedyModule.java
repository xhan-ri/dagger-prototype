package com.napster.mobile.android.daggerlogin.service.eremedy;

import javax.inject.Singleton;

import com.napster.mobile.android.daggerlogin.fragments.LoginFragment;

import dagger.Module;
import dagger.Provides;
import dagger.Provides.Type;

@Module(injects={LoginFragment.class}, library=true)
public class ERemedyModule implements IEremedyModule {
	
	@Override
	@Provides(type=Type.UNIQUE) @Singleton
	public IERemedy provideERemedy() {
		return new ERemedyService();
	}
}
