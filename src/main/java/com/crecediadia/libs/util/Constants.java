package com.crecediadia.libs.util;

/**
 * Utility class.
 */
public class Constants {
  public static final String CURRENT_DATE = "Hoy";
  public static final String ZERO = "0";
  public static final String TIME_FORMATTER = "hh:mm a";
  public static final String LOCAL_ZONE = "America/Lima";
  public static final String DATE_FORMATTER = "dd/MM/yyyy";
  public static final String DECIMAL_PATTERN = "\\d+(\\,\\d+)?";
  public static final String INTEGER_PATTERN = "\\d+";
  public static final String MONEY_FORMAT = "S/ %.2f";
  public static final String DEFAULT_USER_PHONE_COUNTRY = "+51";
  public static final String DEFAULT_POSTAL_CODE = "0000";
  public static final String DEFAULT_UBIGEO_CODE = "000000";
  public static final String FIELD_TYPE_ENTITY_AUDIT = "entity";
  public static final String WITH_OUT_BRAND = "Sin marca";

  private Constants() {
    throw new IllegalStateException("Utility class");
  }

}
