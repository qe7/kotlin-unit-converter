package converters

import me.shae.converters.LengthConverter
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class LengthConverterTest {

    @Test
    fun testMetersToFeet() {
        val result = LengthConverter.metersToFeet(1.0)
        assertEquals(3.28084, result, 0.0001)
    }

    @Test
    fun testFeetToMeters() {
        val result = LengthConverter.feetToMeters(3.28084)
        assertEquals(1.0, result, 0.0001)
    }
}