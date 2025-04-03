package com.ignek.intranet.count.of.portlet.action;

import com.ignek.intranet.count.of.constants.CountOfPortletKeys;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import org.osgi.service.component.annotations.Component;


@Component(
	property = "javax.portlet.name="+ CountOfPortletKeys.COUNTOF,
	service = ConfigurationAction.class
)

public class CountOfPortletAction extends DefaultConfigurationAction{
	
	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		setPreference(actionRequest, "countOf", ParamUtil.getString(actionRequest, "countOf"));
		
		super.processAction(portletConfig, actionRequest, actionResponse);
	}
	
}
