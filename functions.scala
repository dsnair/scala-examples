import java.util.Calendar

// no args
def getCurrentTime() = Calendar.getInstance().getTime()
println(getCurrentTime())

// args
def sayHello(name: String) = s"Hello, $name"
println(sayHello("Divya"))

// args with default value
def tenTimesY(x: Int = 10, y: Int) = x * y 
println(tenTimesY(y=2))

// recursive functions require explicit return types
def factorial(x: Int): Int = {
  if (x > 1)
    x * factorial(x - 1)
  else
    1
}

println(factorial(0))
println(factorial(3))
