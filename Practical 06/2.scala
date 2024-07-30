import scala.io.StdIn

object StudentRecordManager {

  def main(args: Array[String]): Unit = {
    
    val studentInfo = getStudentInfoWithRetry()
    
    printStudentRecord(studentInfo)
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    
    print("Enter student name: ")
    val name = StdIn.readLine()
    
    print("Enter student marks: ")
    val marks = readInt()
    
    print("Enter the total possible mark: ")
    val totalMarks = readInt()
    
    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

    if (isValid) {
      
      val percentage = calculatePercentage(marks, totalMarks)
      val grade = assignGrade(percentage)
      (name, marks, totalMarks, percentage, grade)
    } 
    else {

      throw new IllegalArgumentException(errorMessage.getOrElse("Invalid input"))
    }
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } 
    else if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
      (false, Some("Marks must be positive integers and less than or equal to total marks"))
    } 
    else {
      (true, None)
    }
  }

  def calculatePercentage(marks: Int, totalMarks: Int): Double = {
    
    (marks.toDouble / totalMarks) * 100
  }

  def assignGrade(percentage: Double): Char = {
    percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _            => 'D'
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
    
    while (!isValid) {
      try {
        studentInfo = getStudentInfo()
        isValid = true
      } catch {
        case e: IllegalArgumentException =>
          println(e.getMessage)
          println("Please enter the information again.")
      }
    }
    studentInfo
  }
  
  def readInt(): Int = {
    var valid = false
    var value = 0
    while (!valid) {
      try {
        value = StdIn.readInt()
        valid = true
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Please enter an integer.")
          
          StdIn.readLine()
      }
    }
    value
  }
}
