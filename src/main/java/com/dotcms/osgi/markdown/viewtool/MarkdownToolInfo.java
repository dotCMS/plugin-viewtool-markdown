package com.dotcms.osgi.markdown.viewtool;

import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class MarkdownToolInfo extends ServletToolInfo {
	public String getKey() {
		return "markdown";
	}

	public String getScope() {
		return "request";
	}

	public String getClassname() {
		return MarkdownTool.class.getName();
	}

	public Object getInstance(Object initData) {
		MarkdownTool viewTool = new MarkdownTool();
		viewTool.init(initData);
		return viewTool;
	}
}
