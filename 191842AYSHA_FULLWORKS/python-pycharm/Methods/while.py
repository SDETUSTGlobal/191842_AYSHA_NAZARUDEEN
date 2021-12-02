x=0
while(x <4):
		print(x)
		x = x+1

for x in range(2, 7):
			print(x)


Months = ["Jan","Feb","Mar","April","May","June"]
for m in Months:
		print(m)

		for x in range(10, 20):
			if (x == 15): break
			# if (x % 2 == 0) : continue
			print(x)

Months = ["Jan", "Feb", "Mar", "April", "May", "June"]
for i, m in enumerate(Months):
	print(i, m)