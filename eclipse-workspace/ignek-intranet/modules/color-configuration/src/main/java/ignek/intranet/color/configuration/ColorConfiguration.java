package ignek.intranet.color.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
	category = "color", scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
	id = "ignek.intranet.color.configuration.ColorConfiguration",
	localization = "content/Language", name = "color-configuration"
)

public interface ColorConfiguration {
	
	@Meta.AD(
			deflt = "green", name = "color",
			optionLabels = {"Green", "Orange", "Purple"},
			optionValues = {"green", "orange", "purple"}, required = false
		)
		public String color();
	
}
