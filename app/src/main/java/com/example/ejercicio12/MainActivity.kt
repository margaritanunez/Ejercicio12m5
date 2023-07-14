package com.example.ejercicio12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main (){
    var usuarios = mutableListOf<Usuario>()
    println ("Ingresar cantidad de usuarios: ")
    val cantidadUsuarios = readln().toInt()
    for (i in 1 .. cantidadUsuarios) {
        println("Ingresar nombre: ")
        var name = readln()
        while (!validarNombre(name)){
            println("Nombre inválido, ingrese nuevamente")
            name= readln()
        }
        println("Ingresar apellido: ")
        var lastName = readln()
        while (!validarApellido(lastName)){
            println("Apellido inválido, ingrese nuevamente")
            lastName= readln()
        }
        println("Ingresar edad: ")
        var age = readln().toInt()
        while (!validarEdad(age)){
            println("Caracteres no válidos. Ingresar números")
            age = readln().toInt()
        }
        println("Ingresar correo electrónico: ")
        var email = readln()
        while (!validarCorreo(email)){
            println("Correo no válido. Intente nuevamente")
            email = readln()
        }
        println("Ingresar sistema de salud: Fonasa o Isapre")
        var sistemaSalud = readln()
        while ((!validarSistemaSalud(sistemaSalud))){
            println("Sistema de salud no existe. Ingrese nuevamente")
            sistemaSalud= readln()
        }
        var usuario = Usuario(name, lastName, age, email, sistemaSalud)
        usuarios.add(usuario)
    }
    for (u in usuarios) {
        println ("$u")
    }
}

fun validarNombre(name: String): Boolean{
    return name.length in 1 .. 20
}
fun validarApellido(lastName: String): Boolean{
    return lastName.length in 1 .. 20
}
fun validarEdad (age: Int): Boolean {
    return age in 0 .. 150
}
fun validarCorreo(email: String): Boolean {
    return email.length in 10..200
}
fun validarSistemaSalud(sistemaSalud: String): Boolean{
    return sistemaSalud== "Fonasa" || sistemaSalud=="Isapre" || sistemaSalud== "fonasa" || sistemaSalud== "isapre" || sistemaSalud== "FONASA" || sistemaSalud== "ISAPRE"
}


class Usuario(name: String, lastName: String, age: Int, email: String, sistemaSalud: String) {

}


