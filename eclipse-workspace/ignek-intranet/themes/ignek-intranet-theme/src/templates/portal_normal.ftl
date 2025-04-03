<!DOCTYPE html>
<#include init />
<html class="${root_css_class}" dir="<@liferay.language key=" lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>
		${html_title}
	</title>
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<@liferay_util["include"]
		page=top_head_include />
</head>

<body class="${css_class}">
	<@liferay_ui["quick-access"]
		contentId="#main-content" />
	<@liferay_util["include"]
		page=body_top_include />
	<@liferay.control_menu />
	<#if !is_signed_in>
		<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">
			${sign_in_text}
		</a>
	</#if>
	<div class="row d-flex flex-column flex-fill position-relative theme" id="wrapper">
		<div class="row align-items-lg-start align-items-sm-start align-items-start align-items-md-start flex-lg-row flex-sm-row flex-row flex-md-row no-gutters">
			<div class="col col-lg-2 col-sm-12 col-12 col-md-2">
				<#include "${full_templates_path}/sidebar.ftl" />
			</div>
			<div class="col col-lg-10 col-sm-12 col-12 col-md-10 theme-content">
				<#include "${full_templates_path}/header.ftl" />
				<#include "${full_templates_path}/content.ftl" />
			</div>
		</div>
	</div>
	<@liferay_util["include"]
		page=body_bottom_include />
	<@liferay_util["include"]
		page=bottom_include />
	<!-- inject:js -->
	<!-- endinject -->
</body>

</html>