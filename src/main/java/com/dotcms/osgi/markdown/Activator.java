package com.dotcms.osgi.markdown;

import com.dotcms.osgi.markdown.viewtool.MarkdownTool;
import com.dotcms.osgi.markdown.viewtool.MarkdownToolInfo;
import com.dotcms.repackage.org.osgi.framework.BundleContext;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;

public class Activator extends GenericBundleActivator {
	public void start(BundleContext bundleContext) throws Exception {
		initializeServices(bundleContext);
		registerViewToolService(bundleContext, new MarkdownToolInfo());
		Logger.info(getClass(), "Starting " + MarkdownTool.class.getCanonicalName());
	}

	public void stop(BundleContext context) throws Exception {
		unregisterViewToolServices();
		Logger.info(getClass(), "Stopping " + MarkdownTool.class.getCanonicalName());
	}
}
