package com.qa.app.testexamples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureConverterTest {

    TemperatureConverter temp = new TemperatureConverter();

    @BeforeAll
    public static void start() {
        System.out.println("Test for Temperature Converter");

    }

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        assertEquals(35,temp.convertFahrenheitToCelsius(95));
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals(95,temp.convertCelsiusToFahrenheit(35));
    }

    @Test
    public void testConvertKelvinToCelsius() {
        assertEquals(-178,temp.convertKelvinToCelsius(95));
    }

    @Test
    public void testConvertCelsiusToKelvin() {
        assertEquals(373,temp.convertCelsiusToKelvin(100));
    }

    @Test
    public void testConvertKelvinToFahrenheit() {
        //delta allows you to round the answer based on the given value in this chase to 1 d.p.
        assertEquals(-288.4f,temp.convertKelvinToFahrenheit(95),1f);
    }

    @Test
    public void testConvertFahrenheitToKelvin() {
        assertEquals(308,temp.convertFahrenheitToKelvin(95));
    }
}
