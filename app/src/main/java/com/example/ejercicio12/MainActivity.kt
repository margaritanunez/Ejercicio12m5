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
        var email = readln()
        var sistemaSalud = readln()
        var usuario = Usuario(name, lastName, age, email, sistemaSalud)
        usuarios.add(usuario)
    }
    for (u in usuarios){
        println(u)
    }
}
fun validarNombre(name: String): Boolean{
    return name.length in 1 .. 20
}
fun validarApellido(lastName: String): Boolean{
    return lastName.length in 1 .. 20
}
fun validarEdad (age: Int): Boolean {
    return age.none() in 'A'..'Z' && in 'a'..'z'
}
fun validarCorreo(name: String): Boolean{
    return name.length in 1 .. 20

data class Usuario(var name:String, var lastName: String, var age: Int, var email: String, var sistemaSalud: String){

}
