import com.sun.jdi.IntegerValue

fun main() {
    println("Insira a quantidade de Anos para a conversão")
    var ano = Integer.valueOf(readLine())
    var meses = ano * 12
    var semanas  = ano * 52
    var dias = ano * 365
    var horas = ano * 8760
    var minutos = ano * 525600
    var segundos = ano * 31536000
    println("$ano anos equivalem a:")
    println("$meses meses")
    println("$semanas semanas")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos Segundos")
}