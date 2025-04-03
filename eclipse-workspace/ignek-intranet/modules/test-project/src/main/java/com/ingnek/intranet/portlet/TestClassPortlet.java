package com.ingnek.intranet.portlet;

import com.ingnek.intranet.constants.TestClassPortletKeys;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderParameters;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author dell
 */
@Component(property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TestClass",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", 
		"javax.portlet.name=" + TestClassPortletKeys.TESTCLASS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
)

public class TestClassPortlet extends MVCPortlet {

	
	private static final Log LOG = LogFactoryUtil.getLog(TestClassPortlet.class);

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		
		RenderParameters renderParameters = renderRequest.getRenderParameters();
		String mvcPath = renderParameters.getValue("mvcPath");
		LOG.info("MVC Path = " + mvcPath);
	
		super.render(renderRequest, renderResponse);
	}

	public void doSomething(ActionRequest actionRequest, ActionResponse actionResponse) {

		if (LOG.isInfoEnabled()) {
			LOG.info("Invoking #doSomething(ActionRequest, ActionResponse)");
		}
	}

	public void doSomethingElse(ActionRequest actionRequest, ActionResponse actionResponse) {

		if (LOG.isInfoEnabled()) {
			LOG.info("Invoking #doSomethingElse(ActionRequest, ActionResponse)");
		}
	}

	@ProcessAction(name = "nameForTheDoSomethingMoreMethod")
	public void doSomethingMore(ActionRequest actionRequest, ActionResponse actionResponse) {

		if (LOG.isInfoEnabled()) {
			LOG.info("Invoking #doSomethingMore(ActionRequest, ActionResponse)");
		}
	}
	
}