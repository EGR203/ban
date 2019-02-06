def hello(s: String): Unit = {
    println(“Hello “ + s)
}

def hello = println(“Hello”)

def hello { println(“Hello”) } // not recommend
