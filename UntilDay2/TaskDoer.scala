def taskRunner(activity:String, input: String):Unit = {
    if(activity=="Testing") {
        println(s"performing the test on the testsuite: $input")
    }
    else if(activity=="Deployment")
    {
        println(s"Deploying the module $input")
    }
}

def testTasks = taskRunner("Testing",_: String)
def deploymentTask = taskRunner("Deployment", _: String)

@main def runNow() = {
    testTasks("UI Module Tests")
    testTasks("Api Module Tests")
    deploymentTask("Ui  Module")
}

/* 
  functions must be assignable to variables

 */