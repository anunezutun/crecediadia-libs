package com.crecediadia.libs.util.rest.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Class to define the input format for services.
 *
 * @param <T> Type of class to be modeled by the FormatInput object.
 * @author jorge.arevalo
 */
@Getter
@Setter
public class FormatInput<T> {

  @Valid
  @NotNull
  T data;

}
