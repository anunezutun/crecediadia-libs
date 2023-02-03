package com.crecediadia.libs.util.rest.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class to define the output format for services.
 *
 * @param <T> Type of class to be modeled by the FormatOutput object.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormatOutput<T> {

  /**
   * Data object of response.
   */
  private T data;

  private String code;

  private String message;

}
