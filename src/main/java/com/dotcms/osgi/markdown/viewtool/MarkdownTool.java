package com.dotcms.osgi.markdown.viewtool;

import org.apache.velocity.tools.view.tools.ViewTool;

import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Processor;

public class MarkdownTool implements ViewTool {
	public void init(Object obj) {
	}

	public String parse(String parse) throws Throwable {
		return Processor.process(parse, Configuration.builder().forceExtentedProfile().build());

	}

}
