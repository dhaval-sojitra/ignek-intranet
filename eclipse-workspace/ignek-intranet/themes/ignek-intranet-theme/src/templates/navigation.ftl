<nav aria-label="<@liferay.language key=" site-pages" />" class="${nav_css_class} d-flex justify-content-center mt-5" id="navigation" role="navigation">
<ul class="theme-nav-bar" role="menubar">
	<div class="theme-page-list">
		<#list nav_items as nav_item>
			<#assign
				nav_item_attr_has_popup=""
				nav_item_css_class=""
				nav_item_layout=nav_item.getLayout() />
			<#if nav_item.isSelected()>
				<#assign
					nav_item_attr_has_popup="aria-haspopup='true'"
					nav_item_css_class="selected" />
			</#if>
			<li class="${nav_item_css_class} theme-nav-item" id="layout_${nav_item.getLayoutId()}" role="presentation">
				<a ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem"><span>
						<@liferay_theme["layout-icon"]
							layout=nav_item_layout />
						${nav_item.getName()}
					</span></a>
					
					
				<#if nav_item.hasChildren()>
					<ul class="child-menu" role="menu">
						<#list nav_item.getChildren() as nav_child>
							<#assign
								nav_child_css_class="" />
							<#if nav_item.isSelected()>
								<#assign
									nav_child_css_class="selected" />
							</#if>
							<li class="${nav_child_css_class} child-pages" id="layout_${nav_child.getLayoutId()}" role="presentation">
								<a href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">
									${nav_child.getName()}
								</a>
							</li>
						</#list>
					</ul>
					</#if>
			</li>
		</#list>
	</div>
	<li class="${nav_item_css_class} theme-nav-item logout-button">
		<a href="/c/portal/logout"><span>
				Logout
				<img class="ml-3" src="${images_folder}/logout.png" alt="logout-logo" />
			</span></a>
	</li>
</ul>
</nav>