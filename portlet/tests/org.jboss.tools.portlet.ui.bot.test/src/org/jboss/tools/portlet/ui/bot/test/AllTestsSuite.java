package org.jboss.tools.portlet.ui.bot.test;

import org.jboss.tools.portlet.ui.bot.test.compatibility.JBDS4vs5Compatibility;
import org.jboss.tools.portlet.ui.bot.test.core.CreateJavaPortletProject;
import org.jboss.tools.portlet.ui.bot.test.core.CreateJavaPortletRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.core.CreateJavaPortletRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.core.HotJavaPortletDeploymentRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.core.LoadJavaPortletInBrowserRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.core.RunJavaPortletOnServer;
import org.jboss.tools.portlet.ui.bot.test.example.JSFPortletExampleRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.example.JSFPortletExampleRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.example.JavaPortletExampleRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.example.RichFacesPortletExampleRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.example.SeamPortletExampleRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.example.SeamPortletExampleRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.jsf.CreateJSFPortletProject;
import org.jboss.tools.portlet.ui.bot.test.jsf.CreateJSFPortletRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.jsf.CreateJSFPortletRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.jsf.HotJSFPortletDeploymentRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.jsf.LoadJSFPortletInBrowserRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.jsf.RunJSFPortletOnServer;
import org.jboss.tools.portlet.ui.bot.test.seam.CreateSeamPortletProject;
import org.jboss.tools.portlet.ui.bot.test.seam.CreateSeamPortletRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.seam.CreateSeamPortletRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.seam.HotSeamPortletDeploymentRuntime5x;
import org.jboss.tools.portlet.ui.bot.test.seam.RunSeamPortletOnServer;
import org.jboss.tools.portlet.ui.bot.test.server.RunAsLoadsPortalURLRuntime4x;
import org.jboss.tools.portlet.ui.bot.test.server.RunAsLoadsPortalURLRuntime5x;
import org.jboss.tools.ui.bot.ext.RequirementAwareSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(RequirementAwareSuite.class)
@Suite.SuiteClasses({
	CreateJavaPortletProject.class,
	CreateJavaPortletRuntime4x.class, 
	CreateJavaPortletRuntime5x.class,
	RunJavaPortletOnServer.class,
	LoadJavaPortletInBrowserRuntime4x.class,
	HotJavaPortletDeploymentRuntime5x.class,
	CreateJSFPortletProject.class,
	CreateJSFPortletRuntime4x.class, 
	CreateJSFPortletRuntime5x.class, 
	RunJSFPortletOnServer.class,
	LoadJSFPortletInBrowserRuntime4x.class,
	HotJSFPortletDeploymentRuntime5x.class,
	CreateSeamPortletProject.class,
	CreateSeamPortletRuntime4x.class,
	CreateSeamPortletRuntime5x.class, 
	RunSeamPortletOnServer.class, 
	HotSeamPortletDeploymentRuntime5x.class,
	JavaPortletExampleRuntime4x.class, 
	JSFPortletExampleRuntime4x.class, 
	SeamPortletExampleRuntime4x.class,
	JSFPortletExampleRuntime5x.class,
	RichFacesPortletExampleRuntime5x.class,
	SeamPortletExampleRuntime5x.class,
	JBDS4vs5Compatibility.class,
	RunAsLoadsPortalURLRuntime4x.class, 
	RunAsLoadsPortalURLRuntime5x.class
	})
public class AllTestsSuite {

}
