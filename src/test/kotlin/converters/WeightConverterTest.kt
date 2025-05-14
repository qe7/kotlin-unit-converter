package converters

import me.shae.converters.WeightConverter
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class WeightConverterTest {

    @Test
    fun testKgToLbs() {
        val result = WeightConverter.kgToLbs(1.0)
        assertEquals(2.20462, result, 0.0001)
    }

    @Test
    fun testLbsToKg() {
        val result = WeightConverter.lbsToKg(2.20462)
        assertEquals(1.0, result, 0.0001)
    }
}