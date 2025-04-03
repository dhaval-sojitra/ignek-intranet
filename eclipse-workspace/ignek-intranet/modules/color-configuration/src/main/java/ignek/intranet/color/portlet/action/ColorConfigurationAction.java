package ignek.intranet.color.portlet.action;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import org.osgi.service.component.annotations.Component;

import ignek.intranet.color.constants.ColorPortletKeys;

@Component(
		property = "javax.portlet.name="+ColorPortletKeys.COLOR,
		service = ConfigurationAction.class
	)

public class ColorConfigurationAction extends DefaultConfigurationAction{

	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		setPreference(
			actionRequest, "color",
			ParamUtil.getString(actionRequest, "color"));

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	
}
