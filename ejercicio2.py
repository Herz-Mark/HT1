numero= int(input("Ingrese un valor entero:"))
contador = 0
for n in (2, numero):
  if numero % n == 0:
    contador +=1
 
if contador > 0 :
  print("El nÚmero ", numero ," no es primo")
else:
  print("El nÚmero ", numero ," es primo")