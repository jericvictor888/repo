package com.random.domain;

import javax.validation.constraints.NotNull;
import com.random.annotation.Custom;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	
	@NotNull(message = "color must not be null")
	private String color;
	
	@Custom(message = "Invalid custom value")
	private String custom;
	
}
