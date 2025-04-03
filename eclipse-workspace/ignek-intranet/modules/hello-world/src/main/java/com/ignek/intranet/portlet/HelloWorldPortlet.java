package com.ignek.intranet.portlet;

import com.ignek.intranet.constants.HelloWorldPortletKeys;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalService;

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
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=HelloWorld",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HelloWorldPortletKeys.HELLOWORLD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HelloWorldPortlet extends MVCPortlet {
	
	private static final Log LOG = LogFactoryUtil.getLog(HelloWorldPortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
			int totalUsers = _userLocalService.getUsersCount();
			int totalArticles = _journaArticleLocalService.getJournalArticlesCount();
			int totalDocuments = _dlDlFileEntryLocalService.getDLFileEntriesCount();
			
			renderRequest.setAttribute("totalUsers",totalUsers);
			renderRequest.setAttribute("totalArticles",totalArticles);
			renderRequest.setAttribute("totalDocuments",totalDocuments);

			super.render(renderRequest, renderResponse);
	}
	
	@Reference
	private UserLocalService _userLocalService;	
	
	@Reference
	private JournalArticleLocalService _journaArticleLocalService;
	
	@Reference
	private DLFileEntryLocalService _dlDlFileEntryLocalService;

		
}