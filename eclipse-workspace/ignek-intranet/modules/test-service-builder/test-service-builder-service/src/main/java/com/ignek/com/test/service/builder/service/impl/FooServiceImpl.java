/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.ignek.com.test.service.builder.service.impl;

import com.ignek.com.test.service.builder.service.base.FooServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=foo", "json.web.service.context.path=Foo"
	},
	service = AopService.class
)
public class FooServiceImpl extends FooServiceBaseImpl {
}