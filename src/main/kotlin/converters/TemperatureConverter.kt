package me.shae.converters

object TemperatureConverter {
    fun celsiusToFahrenheit(c: Double): Double = c * 9 / 5 + 32
    fun fahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9
}