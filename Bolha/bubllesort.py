import random

valores = []
i = 0
b = 0
a = 0

for i in range(0,10):
    valores.append(int(random.randint(0, 10000)))
    #valores.append(int(i))
    #valores.append(int(9 - i))
    
print(valores)

for i in range(0,10):
    for a in range(0,10):
        if a + 1 == 10:
            break
        if(valores[a] > valores[a + 1]):
            temp = valores[a + 1]
            valores[a + 1] = valores[a]
            valores[a] = temp
            
print(valores)
