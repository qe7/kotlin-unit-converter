package converters

import me.shae.converters.TemperatureConverter
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class TemperatureConverterTest {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = TemperatureConverter.celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.0001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = TemperatureConverter.fahrenheitToCelsius(32.0)
        assertEquals(0.0, result, 0.0001)
    }
}