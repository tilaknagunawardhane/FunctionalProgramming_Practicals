object RunningTimeCalculator {
    
    def totalRunningTime(easyPaceKm: Double, tempoPaceKm: Double): Double = {

    val easyPaceMinPerKm = 8.0 
    val tempoPaceMinPerKm = 7.0 

    val easyDistance1 = 2.0
    val tempoDistance = 3.0
    val easyDistance2 = 2.0

    val easyTime1 = easyDistance1*easyPaceMinPerKm
    val tempoTime = tempoDistance*tempoPaceMinPerKm
    val easyTime2 = easyDistance2*easyPaceMinPerKm

    easyTime1 + tempoTime + easyTime2
    }

    def main(args: Array[String]): Unit = {
        val easyPaceKm = 2.0 
        val tempoPaceKm = 3.0

        val totalTime = totalRunningTime(easyPaceKm, tempoPaceKm)
        println(s"The total running time is $totalTime minutes")
    }
}
