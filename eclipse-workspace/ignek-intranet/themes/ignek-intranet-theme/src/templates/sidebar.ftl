<div class="sidebar">
    <div class="logo">
        <div class="line"></div>
        <p>
            ${site_name}
        </p>
    </div>
    <div class="profile">
        <img src="${user.getPortraitURL(themeDisplay)}" alt="profilephote" />
        <p class="user-name">
            ${user_name}
        </p>
        <#if user?exists && user.getJobTitle()?exists>
            <p class="designation">
                ${user.getJobTitle()}
            </p>
        </#if>
    </div>
    <#if has_navigation && is_setup_complete>
        <#include "${full_templates_path}/navigation.ftl" />
    </#if>
</div>