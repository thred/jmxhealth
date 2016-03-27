package io.github.furti.jmxhealth.server;

import java.util.Map;

import io.github.furti.jmxhealth.server.validation.AttributeValidator;
import io.github.furti.jmxhealth.server.validation.PercentageValidator;
import io.github.furti.jmxhealth.server.validation.ValidationResult;

public enum ValidationType {
	PERCENTAGE(new PercentageValidator());

	private AttributeValidator validator;

	private ValidationType(AttributeValidator validator) {
		this.validator = validator;
	}

	public ValidationResult validate(Object attributeValue, Map<String, Object> validationConfig) throws Exception {
		return validator.validate(attributeValue, validationConfig);
	}
}