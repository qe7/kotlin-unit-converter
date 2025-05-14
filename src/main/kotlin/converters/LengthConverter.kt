package me.shae.converters

object LengthConverter {
    fun metersToFeet(m: Double): Double = m * 3.28084
    fun feetToMeters(ft: Double): Double = ft / 3.28084
}