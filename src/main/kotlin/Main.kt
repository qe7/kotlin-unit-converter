package me.shae

import me.shae.converters.LengthConverter
import me.shae.converters.TemperatureConverter
import me.shae.converters.WeightConverter

fun main() {
    while (true) {
        clearScreen()
        println("\nUnit Converter")
        println("1. Temperature")
        println("2. Length")
        println("3. Weight")
        println("4. Exit")
        print("Choose an option (1-4)\n\n")

        when (readlnOrNull()?.trim()) {
            "1" -> convertTemperature()
            "2" -> convertLength()
            "3" -> convertWeight()
            "4" -> {
                printSuccess("Exiting...")
                return
            }
            else -> {
                printError("Invalid input. Press Enter to continue...")
                readlnOrNull()
            }
        }
    }
}

fun convertTemperature() {
    clearScreen()
    println("\nTemperature Conversion")
    println("1. Celsius to Fahrenheit")
    println("2. Fahrenheit to Celsius")
    print("Choose an option:\n\n")
    when (readlnOrNull()?.trim()) {
        "1" -> {
            print("Enter °C: ")
            val c = readlnOrNull()?.toDoubleOrNull()
            if (c != null)
                printSuccess("$c °C = ${TemperatureConverter.celsiusToFahrenheit(c)} °F")
        }
        "2" -> {
            print("Enter °F: ")
            val f = readlnOrNull()?.toDoubleOrNull()
            if (f != null)
                printSuccess("$f °F = ${TemperatureConverter.fahrenheitToCelsius(f)} °C")
        }
        else -> {
            printError("Invalid input. Press Enter to continue...")
            readlnOrNull()
        }
    }
}

fun convertLength() {
    clearScreen()
    println("\nLength Conversion")
    println("1. Meters to Feet")
    println("2. Feet to Meters")
    print("Choose an option:\n\n")
    when (readlnOrNull()?.trim()) {
        "1" -> {
            print("Enter meters: ")
            val m = readlnOrNull()?.toDoubleOrNull()
            if (m != null)
                printSuccess("$m m = ${LengthConverter.metersToFeet(m)} ft")
        }
        "2" -> {
            print("Enter feet: ")
            val ft = readlnOrNull()?.toDoubleOrNull()
            if (ft != null)
                printSuccess("$ft ft = ${LengthConverter.feetToMeters(ft)} m")
        }
        else -> {
            printError("Invalid input. Press Enter to continue...")
            readlnOrNull()
        }
    }
}

fun convertWeight() {
    clearScreen()
    println("\nWeight Conversion")
    println("1. Kilograms to Pounds")
    println("2. Pounds to Kilograms")
    print("Choose an option:\n\n")
    when (readlnOrNull()?.trim()) {
        "1" -> {
            print("Enter kg: ")
            val kg = readlnOrNull()?.toDoubleOrNull()
            if (kg != null)
                printSuccess("$kg kg = ${WeightConverter.kgToLbs(kg)} lbs")
        }
        "2" -> {
            print("Enter lbs: ")
            val lbs = readlnOrNull()?.toDoubleOrNull()
            if (lbs != null)
                printSuccess("$lbs lbs = ${WeightConverter.lbsToKg(lbs)} kg")
        }
        else -> {
            printError("Invalid input. Press Enter to continue...")
            readlnOrNull()
        }
    }
}

fun clearScreen() {
    print("\u001b[H\u001b[2J")
    System.out.flush()
}

fun printError(message: String) {
    val red = "\u001b[31m"
    val reset = "\u001b[0m"
    println("$red$message$reset")
}

fun printSuccess(message: String) {
    val green = "\u001b[32m"
    val reset = "\u001b[0m"
    println("$green$message$reset")
}
