print("ingrese un valor entero")
try:
    num1 = int(input())
    sim = '*'
    print(sim)
    for i in range(num1):
        sim = sim + '*'
        print(sim)
except:
    print("Debe ingresar un valor entero")