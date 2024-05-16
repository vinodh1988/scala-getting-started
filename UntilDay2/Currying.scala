def preProcess(input: String): String = s"Preprocessed $input"

def process(preprocessedinput:String): String = s"Processing $preprocessedinput"

@main def doActivity = {
    val activity = (preProcess).andThen(process)
    println(activity("Employee Data Set"))

}