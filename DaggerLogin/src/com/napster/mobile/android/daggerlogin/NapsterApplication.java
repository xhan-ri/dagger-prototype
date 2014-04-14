package com.napster.mobile.android.daggerlogin;

import java.util.Arrays;
import java.util.List;

import android.app.Application;

import com.napster.mobile.android.daggerlogin.service.SystemModule;
import com.napster.mobile.android.daggerlogin.service.eremedy.ERemedyModule;
import com.napster.mobile.android.daggerlogin.service.eremedy.IEremedyModule;

import dagger.ObjectGraph;

public class NapsterApplication extends Application {

	private ObjectGraph appGraph;
	private IEremedyModule eRemedyModule;
	@Override
	public void onCreate() {
		super.onCreate();
		appGraph = ObjectGraph.create(getModules().toArray());
	}

	public List<Object> getModules() {
		return Arrays.<Object>asList(new SystemModule(), getERemedyModule());
	}
	
	public IEremedyModule getERemedyModule() {
		if (eRemedyModule == null) {
			eRemedyModule = new ERemedyModule();
		}
		return this.eRemedyModule;
	}
	
	public void setERemedyModule(IEremedyModule module) {
		this.eRemedyModule = module;
		appGraph = ObjectGraph.create(getModules().toArray());
	}

	public ObjectGraph getAppGraph() {
		return appGraph;
	}
	
	public void inject(Object object) {
		appGraph.inject(object);
	}
	
}
