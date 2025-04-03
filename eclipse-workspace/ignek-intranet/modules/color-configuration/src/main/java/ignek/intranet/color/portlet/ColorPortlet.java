package ignek.intranet.color.portlet;

import ignek.intranet.color.configuration.ColorConfiguration;
import ignek.intranet.color.constants.ColorPortletKeys;

import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author dell
 */
@Component(
	configurationPid = "ignek.intranet.color.configuration.ColorConfiguration",
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Color",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ColorPortletKeys.COLOR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ColorPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		renderRequest.setAttribute(
				ColorConfiguration.class.getName(),
				_getColorConfiguration(renderRequest));


		super.render(renderRequest, renderResponse);
	}

	private ColorConfiguration _getColorConfiguration(RenderRequest renderRequest) throws PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		try {
			return _configurationProvider.getPortletInstanceConfiguration(ColorConfiguration.class, themeDisplay);
		} catch (ConfigurationException configurationException) {
			throw new PortletException(configurationException);
		}
	}

	@Reference
	private ConfigurationProvider _configurationProvider;

	@Reference
	private Portal _portal;
	
}