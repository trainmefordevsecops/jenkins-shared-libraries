def call() {
    area(2, 2)
    vol(2, 2, 2)
}

def area(l,b) {
  echo "area is ${l*b}"
}

def vol(l,b,h) {
   echo "vol is ${l*b*h}"
}
